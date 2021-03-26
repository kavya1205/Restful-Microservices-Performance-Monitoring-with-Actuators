package com.employee.management.system.entity;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	private Integer id;
	
	private String name;
}
