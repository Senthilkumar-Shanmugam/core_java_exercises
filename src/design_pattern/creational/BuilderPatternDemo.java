package design_pattern.creational;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Lokesh", "Gupta")
			    .age(30)
			    .phone("1234567")
			    .address("Fake address 1234")
			    .build();
			 
			    System.out.println(user1);
	}

}
class User{
	private final String firstName;//required
	private final String lastName;//required
	private  final int age;//optional
	private final String phone;//optional
	private final String address;//optional
	
	// enforcing constrcution only thru builder.. clients cannot construct throu new
	private User(UserBuilder builder){
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
	}
	
	public static class UserBuilder{
		 private final String firstName;
	        private final String lastName;
	        private int age;
	        private String phone;
	        private String address;
	 
	        public UserBuilder(String firstName, String lastName) {
	            this.firstName = firstName;
	            this.lastName = lastName;
	        }
	        
	        public UserBuilder age(int age){
	        	this.age=age;
	        	return this;
	        }
	        public UserBuilder phone(String phone) {
	            this.phone = phone;
	            return this;
	        }
	        public UserBuilder address(String address) {
	            this.address = address;
	            return this;
	        }
	        public User build(){
	        	User user = new User(this);
	        	return user;
	        }
	}
	
	 //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
 
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
      
 }
