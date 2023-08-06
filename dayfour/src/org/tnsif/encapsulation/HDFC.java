//program to demonstrate on Encapsulation
// Encapsulation achieves a data hiding using private access specifier.
package org.tnsif.encapsulation;

public class HDFC {
	
	private String accType;
	private long accNo;
	private long accCardNo;
	private int pinNo;
	
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getAccCardNo() {
		return accCardNo;
	}
	public void setAccCardNo(long accCardNo) {
		this.accCardNo = accCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accNo=" + accNo + ", accCardNo=" + accCardNo + ", pinNo=" + pinNo + "]";
	}
	
	
	

}
