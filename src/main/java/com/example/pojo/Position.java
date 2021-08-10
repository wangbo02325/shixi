package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {

    private int aid; //自增id
    private String name;//名称
    private Date time_add;//创建时间
    private Date time_update_last;//最后更新时间
}
