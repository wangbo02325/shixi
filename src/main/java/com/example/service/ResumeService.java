package com.example.service;

import com.example.pojo.*;

import java.util.List;

public interface ResumeService {
    List<School> querySchoolList();

    List<Company> queryCompanyList();

    List<Student> queryStudentList();

    List<Resume> queryResumeList();

    List<Position> queryPositonList();

    String chaXun();
}
