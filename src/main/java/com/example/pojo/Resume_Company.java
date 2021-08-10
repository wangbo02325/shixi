package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resume_Company {//简历投递公司

    private int aid;//自增id
    private int resume_aid;//简历的id
    private int position_aid;//公司的id
    private Date time_add;//创建的时间
    private Date time_update_last;//最后更新的时间
}
