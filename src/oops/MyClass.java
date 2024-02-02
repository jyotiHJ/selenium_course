package oops;
	
		class Men {
			
			String name;

			void talk() {
				System.out.println(name + ": Hello");
			}
		}

		class Baby {
			
			String name;

			void cry() {
				System.out.println(name+ ": Bye");
			}
		}
		
		

		public class MyClass {
		    public static void main(String[] args) {
		        
		        Men m1 = new Men();
		        m1.name = "Arjun";
		    
		        Baby b1 = new Baby();
		        b1.name= "Karna";
		        
		        m1.talk();
		        b1.cry();
	} 
} 
