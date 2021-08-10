package com.example.controller;

import com.example.pojo.*;
import com.example.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.List;


@Controller
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @RequestMapping("/")
    public String List(Model model){
        List<School> schoolList = resumeService.querySchoolList();
        List<Company> companyList = resumeService.queryCompanyList();
        List<Student> studentList = resumeService.queryStudentList();
        List<Resume> resumeList = resumeService.queryResumeList();
        List<Position> positionList = resumeService.queryPositonList();

        model.addAttribute("schools",schoolList);
        model.addAttribute("companys",companyList);
        model.addAttribute("students",studentList);
        model.addAttribute("resumes",resumeList);
        model.addAttribute("positions",positionList);
        return "/index";
    }

    @RequestMapping("/modify")
    public String modify( Model model){
        List<School> schoolList = resumeService.querySchoolList();
        List<Company> companyList = resumeService.queryCompanyList();
        List<Student> studentList = resumeService.queryStudentList();
        List<Resume> resumeList = resumeService.queryResumeList();
        List<Position> positionList = resumeService.queryPositonList();

        model.addAttribute("schools",schoolList);
        model.addAttribute("companys",companyList);
        model.addAttribute("students",studentList);
        model.addAttribute("resumes",resumeList);
        model.addAttribute("positions",positionList);
        return "/add_update";
    }

    @RequestMapping("/xiangqing")
    public String xiangqing( Model model){
        List<School> schoolList = resumeService.querySchoolList();
        List<Company> companyList = resumeService.queryCompanyList();
        List<Student> studentList = resumeService.queryStudentList();
        List<Resume> resumeList = resumeService.queryResumeList();
        List<Position> positionList = resumeService.queryPositonList();

        model.addAttribute("schools",schoolList);
        model.addAttribute("companys",companyList);
        model.addAttribute("students",studentList);
        model.addAttribute("resumes",resumeList);
        model.addAttribute("positions",positionList);
        return "/xiangqing";
    }

    @RequestMapping("/ni")
    @ResponseBody
    public String ni(){
        return resumeService.chaXun();
    }




}


