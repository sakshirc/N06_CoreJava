package org.tnsif.encapsulation;

public class EncapExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HDFC h= new HDFC();
     h.setAccType("Saving Account");
     h.setAccNo(1224874908);
     h.setAccCardNo(38764989);
     h.setPinNo(3243);
     
     System.out.println(h); //to call toString method.
     System.out.println("AccCard No: "+h.getAccCardNo());
     
	}

}
