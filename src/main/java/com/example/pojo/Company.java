package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.soap.Text;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private int aid;
    private String name;//企业名称
    private int industry_id;//行业的id
    private String industry_name;
    private Text bussiness_scope;
    private String address;
    private String phone;
    private int state_id;
    private String state_name;
    private Date time_add;
    private Date time_update_last;

}
