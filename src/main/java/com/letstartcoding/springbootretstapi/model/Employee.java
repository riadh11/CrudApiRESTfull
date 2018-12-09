package com.letstartcoding.springbootretstapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate; 
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Employees")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private long id ;
	@NotBlank
	private String name ;
	@NotBlank
	private  String designation ;
	@NotBlank
	private String exprtise;
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date creatdAt;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getExprtise() {
		return exprtise;
	}
	public void setExprtise(String exprtise) {
		this.exprtise = exprtise;
	}
	public Date getCreatdAt() {
		return creatdAt;
	}
	public void setCreatdAt(Date creatdAt) {
		this.creatdAt = creatdAt;
	}
	
	
	
	
	

}
