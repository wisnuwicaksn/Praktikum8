public class Credit extends Payment{
	String number;
	String type;
	int expDate;


	public void authorized() {

		System.out.println("Verifikasi");
	}
}