package Class4;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time=5;
		String day="Monday";
		/*
		 * it is called outer if condition if it true then only inner conditions will be checked if it is
		 * false nothing from inner if condition will be executed it is like main door
		 * if main door is closed we cant enter
		 * 
		 */
		
		//outer if condition
		if(day.equals("Monday")) {// as string is non primitive we cant use == sign we have to use .equals
			
			//inner if condition
			if (time>7) {
			System.out.println("lets go to office");
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}

		}

}
