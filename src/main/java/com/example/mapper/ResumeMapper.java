package com.example.mapper;

import com.example.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ResumeMapper {

    List<School> querySchoolList();

    List<Company> queryCompanyList();

    List<Student> queryStudentList();

    List<Resume> queryResumeList();

    List<Position> queryPositionList();

    String chaXun();
}
