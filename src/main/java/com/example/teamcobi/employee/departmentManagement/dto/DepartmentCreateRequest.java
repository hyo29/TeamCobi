package com.team.cobi.employee.departmentManagement.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentCreateRequest {

    @ApiModelProperty("부서명")
    private String departmentName;


}
