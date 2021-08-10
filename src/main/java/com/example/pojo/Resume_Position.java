package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resume_Position {//简历意向岗位

    private int aid;
    private int resume_aid;
    private int position_aid;
    private Date time_add;
    private Date time_update_last;
}
