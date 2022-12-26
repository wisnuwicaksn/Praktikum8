public class Utama {
	public static void main(String[] args) {

		Customer org1 = new Customer();
		org1.name = "Dimas";
		org1.address = "Jakarta";

		org1.tambahItem(new Item(250,"Nasi Goreng"));
		org1.tambahItem(new Item(25,"Sambel"));

		// org1.description;
		
		Order pesan = new Order(new OrderDetail());
		pesan.date = "10";
		pesan.status = "Baru";

		System.out.println("Customer:		" + org1.name);
        System.out.println("Number of orders:	" + org1.address);
        System.out.println("Total cost:		$" + pesan.date);
        System.out.println("Payment type:		" + pesan.status);
	}
}