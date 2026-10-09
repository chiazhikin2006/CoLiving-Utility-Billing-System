import java.util.ArrayList;

public class Tenant {
	private String name;
	private String id;
	private double unpaidAmount;
	private ArrayList<SubBill> feeBill;
	
	public Tenant(String name, String id,double unpaidAmount) {
		this.name = name;
		this.id = id;
		this.unpaidAmount = unpaidAmount;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getUnpaidAmount() {
		return this.unpaidAmount;
	}
	
	public void setUnpaidAmount(double unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}
	
	public void paidFee(double paidAmount) {//Exeception
		setUnpaidAmount(getUnpaidAmount() - paidAmount);
	}
	
	public void checkUnpaid() {
		System.out.println("Tenant: "+ getName() + "unpaid Amount is "  + getUnpaidAmount());
	}
	
	public void AddBill(SubBill subBill) {
		this.feeBill.add(subBill);	
	}
	
	public SubBill getBill(int i) {
		return this.feeBill.get(i);
	}
}
