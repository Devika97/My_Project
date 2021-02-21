package com.back_end.back_end.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student_list")
public class Student {
  @Id
  private String id;
  
  private String rollno;
  private String name;
  private String dob;
  private String stud_class;
  private String division;
  private String gender;
  
  public Student() {

}

public Student( String rollno,String name,  String dob,String stud_class,String division,String gender) {
  this.rollno=rollno;
  this.name=name;
  this.dob=dob;
  this.stud_class=stud_class;
  this.division=division;
  this.gender=gender;
}

public String getId() {
  return id;
}

public String getRollno() {
  return rollno;
}

public void setRollno(String rollno) {
  this.rollno=rollno;
}
public String getName() {
  return name;
}

public void setName(String name) {
  this.name=name;
}

public String getDob() {
  return dob;
}

public void setDob(String dob) {
  this.dob=dob;
}

public String getStud_class() {
  return stud_class;
}

public void setStud_class(String stud_class) {
  this.stud_class=stud_class;
}

public String getDivision() {
  return division;
}

public void setDivision(String division) {
  this.division=division;
}

public String getGender() {
  return gender;
}

public void setGender(String gender) {
  this.gender=gender;
}

@Override
public String toString() {
  return "Student [id=" + id + ",rollno="+ rollno +" name=" + name + ", dob=" + dob + ", stud_class=" + stud_class + ", division=" + division + ",gender="+ gender +"]";
} 
}


