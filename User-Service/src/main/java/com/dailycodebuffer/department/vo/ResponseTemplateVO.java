package com.dailycodebuffer.department.vo;



import com.dailycodebuffer.department.entity.User_;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
	
	private User_ user;
	private Department deparment;

}
