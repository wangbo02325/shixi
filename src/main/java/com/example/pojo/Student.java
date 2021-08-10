package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int aid;
    private String name;
    private int sex;
    private int age;
    private int school_aid;
    private int major_aid;
    private String student_id;
    private String phone;
    private int state_id;
    private String state_name;
    private Date time_add;
    private Date time_update_last;






}
