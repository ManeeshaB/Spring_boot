package com.example.demo.model;

import javax.persistence.Column;

//import java.util.UUID;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="StudentDetails",uniqueConstraints={
		@UniqueConstraint(columnNames="aid"),
		@UniqueConstraint(columnNames="aname")
		}
)
public class Alien {
	@Id
    public String aid;
	
	@Column(unique=true)
	public String aname;
	/*Alien(){}
	Alien(UUID aid,String aname){
		this.aid=aid;
		this.aname=aname;
	}*/
	
	public String getAname() {
		return aname;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}
	

}
