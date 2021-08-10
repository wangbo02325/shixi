package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resume {//简历

    private int aid; //自增id
    private int student_aid;//学生aid
    private String title;//标题
    private String content;//内容
    private Date time_add;//创建时间
    private Date time_update_last;//最后更新时间
}
