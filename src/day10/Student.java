package day10;

public class Student implements Cloneable{                  //marker interface is empty interface
	private int rno;										//use to support that feature	
	private String sname;					
	private double per;						
	
	public Student() {}										//constructor 1
	public Student(int rno, String sname, double per) 		//constructor 2
	{
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	
	public Student(Student st) 
	{
		this.rno = st.rno;
		this.sname = st.sname;
		this.per = st.per;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
		protected void finalize() throws Throwable   //destructor
		{
			// TODO Auto-generated method stub
			super.finalize();
		}
}
