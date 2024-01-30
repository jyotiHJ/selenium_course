package selenium_course;

public class SwitchDemo {
	
	@org.testng.annotations.Test
	public void test1() {
		
		String dayName = "Fri";
		int dayNumber = 0;
		
		
		switch (dayName) {
			case "Monday":
			case "Mon":
				dayNumber = 1;
				break;
			case "Tuesday":
			case "Tue":
				dayNumber = 2;
				break;
			case "Wednesday":
			case "Wed":
				dayNumber = 3;
				break;
			case "Thursday":
			case "Thu":
				dayNumber = 4;
				break;
			case "Friday":
			case "Fri":
				dayNumber = 5;
				break;
			case "Saturday":
			case "Sat":
				dayNumber = 6;
				break;
			case "Sunday":
			case "Sun":
				dayNumber = 7;
				break;
		default:
			
			break;
		}
		System.out.println(dayName +  " - " +dayNumber );
	}

	}

