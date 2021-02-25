package oops;
//Encapsulation = Data Hiding + Data Abstraction
public class DebitCard {
	
	private int pinNumber;//Data hiding 
	
	//Data Abstraction
	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public static void main(String[] args) {
		DebitCard visaCard = new DebitCard();//instance or object
		visaCard.setPinNumber(1234);
		System.out.println("Card Pin Number : "+visaCard.getPinNumber());

	}

}
