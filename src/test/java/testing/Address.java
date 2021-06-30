package testing;

public class Address {
	private String faltno;
	private String city;
	private String state;
	public Address(String faltno, String city, String state) {
		super();
		this.faltno = faltno;
		this.city = city;
		this.state = state;
	}
	public String getFaltno() {
		return faltno;
	}
	public void setFaltno(String faltno) {
		this.faltno = faltno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
