import java.util.Scanner;

public class passenger {

	private String name;
	private String gender;
	private int age;
	private String address;
	private String loginName;
	private String password;
	private int passportNum ;
	private int referenceNo ;//for booking refrence 

	// constructor

	passenger() {
		name = "";
		address = "";
		gender = "";
		age = 0;
		passportNum = 0;
		referenceNo = 0;
		loginName = "";
		password = "";
	}
//*********setters**********//

	public void setName(String n) {
		name = n;
	}

	public void setAdress(String a) {
		address = a;
	}

	public void setGender(String g) {
		gender = g;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setPassportNum(int p) {
		passportNum = p;
	}

	public void setLoginName(String l) {
		loginName = l;
	}

	public void setPassword(String p) {
		password = p;
	}

	public void setReferenceNo(int n) {
		referenceNo = n;
	}

//*******getters**********//

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getPassportNum() {
		return passportNum;
	}

	public int getReferenceNo() {
		return referenceNo;
	}

	public String getLoginName() {
		return loginName;
	}

	public String getPassword() {
		return password;
	}

	public void addPassengerDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		name = sc.nextLine();

		System.out.println("enter your address");
		address = sc.nextLine();

		System.out.println("enter your gender");
		gender = sc.nextLine();

		System.out.println("enter your age");
		age = sc.nextInt();

		sc.nextLine();

		System.out.println("enter your desired login name");
		loginName = sc.nextLine();

		System.out.println("enter your desired password");
		password = sc.nextLine();

		System.out.println("Account created!\n");
	}

//*********************//

}