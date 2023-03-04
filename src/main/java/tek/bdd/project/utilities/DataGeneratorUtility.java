

package tek.bdd.project.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {
	
public static void main(String[] args) {

	System.out.println(data("firstName"));
	System.out.println(data("lastName"));
	System.out.println(data("fullName"));
}

static String firstName = "";
static String lastName = "";
static String newPassword = "";
static String confirmPassword = "";
			
		public static String data(String input) {
			
			Faker faker = new Faker();
			
			String outPut ="";
			
			if(input.equals("firstName")) {
				firstName = faker.name().firstName();
				outPut = firstName;
				
			}else if(input.equals("lastName")) {
				lastName = faker.name().lastName();
				outPut = lastName;
			
			}else if(input.equals("email")) {
				outPut = faker.expression("#{letterify '??????Safa@tekschool.us'}");
			
			}else if(input.equals("phoneNumber")) {
				outPut = faker.phoneNumber().cellPhone();
				
			}else if(input.equals("fullName")) {
				outPut = firstName + " " + lastName;
				
			}else if(input.equals("streetAddress")) {
				outPut = faker.address().streetAddress();
				
			}else if(input.equals("apt")) {
				outPut = faker.address().secondaryAddress();
				
			}else if(input.equals("city")) {
				outPut = faker.address().city();
				
			}else if(input.equals("state")) {
				outPut = faker.address().state();
			
			}else if(input.equals("zipCode")) {
				String zipcode = faker.address().zipCode().substring(0, 5);
				outPut = zipcode;
			
			}else if(input.equals("country")) {
				outPut = "United States";
				

				
				
			}else if(input.equals("password")) {
				outPut = faker.internet().password(10, 15, true, true, true);
				
			}else if(input.equals("newPassword")) {
				newPassword = faker.internet().password(10, 15, true, true, true);
				outPut = newPassword;
				
			}else if(input.equals("confirmPassword")){
			
					confirmPassword = newPassword;
                    outPut = confirmPassword;
			
			
		}else if(input.equals("cardNumber")) {
			outPut = faker.expression("#{numerify '################'}");
    	}else if(input.equals("nameOnCard")) {
    		outPut = faker.expression("#{letterify 'Ah????Safa'}");
    	}else if(input.equals("expirationMonth")) {
    		outPut = faker.expression("#{date.birthday 'yy DDD'}");
    	}else if(input.equals("expirationYear")) {
    		outPut = faker.expression("#{date.birthday 'yyyy'}");
    	}else if(input.equals("securityCode")) {
    		outPut = faker.expression("#{numerify '###'}");


	    	
	}

		return outPut;
	}

	}
