
public class User {
private String fName, lName;

	User(){
		fName="";
		lName="";
	}
	public void setfName(String FN) { fName = FN; }
	public void setlastName(String ln) { lName = ln; }
	
	public String getfName() { return fName.toUpperCase(); }
	public String getLname() { return lName; }
	public String getFullName() { return getfName()+ " "+lName;}
	
}
