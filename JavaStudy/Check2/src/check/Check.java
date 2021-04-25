package check;

import static constants.Constants.*;

public class Check {


    private static String firstName = "久松";
	private static String lastName = "寧々";

	public static void main(String[] args) {

		System.out.println(getName(firstName,lastName));
		
		Pet pet =new Pet(CHECK_CLASS_JAVA,CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotpet = new RobotPet(CHECK_CLASS_R2D2,CHECK_CLASS_LUKE);
		robotpet.introduce();

		
		
		
	}

	private static String getName(String firstName ,String lastName) {
		return firstName + lastName;
	}





}
