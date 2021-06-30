package testing;

import java.util.ArrayList;
import java.util.Iterator;

public class User {
		private String email;
		private String firstName;
		private String lastName;

		private Address address;
		private ArrayList<Integer> mobile;
		
		public User(String email, String firstName, String lastName, String flatno, String city, String state) {
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
			this.mobile = new ArrayList<Integer>();
			this.address =  new Address(flatno, city, state);
		}
		
		
		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			this.address = address;
		}


		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public ArrayList<Integer> getMobile() {
			return mobile;
		}

		public void setMobile(ArrayList<Integer> mobile) {
			this.mobile = mobile;
		}

		public void setMobileNumbers(int... mobileNumbers) {
			for (int i = 0; i < mobileNumbers.length; i++) {
				this.mobile.add(mobileNumbers[i]);
			}
		}

}
