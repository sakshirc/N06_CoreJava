package org.tnsif.singleinheristance;
//child class
public class Student extends Citizen
{
  private int rollNo;
  private String clgName;
  
public int getRollNo() 
{
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getClgName() {
	return clgName;
}

public void setClgName(String clgName) {
	this.clgName = clgName;
}

public Student(String city, int pincode, String area, long adharNo,int rollNo,String clgName) {
	super(city, pincode, area, adharNo);
	this.rollNo=rollNo;
	this.clgName=clgName;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", clgName=" + clgName + ", toString()=" + super.toString() + "]";
}


 

  
}
