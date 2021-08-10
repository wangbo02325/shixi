package com.example.service;

import com.example.mapper.ResumeMapper;
import com.example.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService{

    @Autowired
    ResumeMapper resumeMapper;

    @Override
    public List<School> querySchoolList() {
        return resumeMapper.querySchoolList();
    }


    @Override
    public List<Company> queryCompanyList() {
        return resumeMapper.queryCompanyList();
    }


    @Override
    public List<Student> queryStudentList() {
        return resumeMapper.queryStudentList();
    }

    @Override
    public List<Resume> queryResumeList() {
        return resumeMapper.queryResumeList();
    }

    @Override
    public List<Position> queryPositonList() {
        return resumeMapper.queryPositionList();
    }

    @Override
    public String chaXun() {
        return resumeMapper.chaXun();
    }

}
