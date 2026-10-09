public class Bill {
	private String billId;
	private String billName;
	private String billType;
	private String billDescription;
	private double billAmount;
	private int numOfPeople;
	
	public Bill(String billId,String billName, String billType,String billDescription, double billAmount, int numOfPeople) {
		this.billId=billId;
		this.billName = billName;
		this.billDescription = billDescription;
		this.billAmount = billAmount;
		this.numOfPeople = numOfPeople;
		this.billType = billType;
	}
	
	public String getBillID(){
		return this.billId;
	}
	
	public void setBillId(String billId) {
		this.billId = billId;
	}
	
	public String getBillName() {
		return this.billName;
	}
	
	public void setBillName(String billName) {
		this.billName = billName;
	}
	
	public String getBillDescription() {
		return this.billDescription;
	}
	
	public void setBillDescription(String billDescription) {
		this.billDescription = billDescription;
	}
	
	public double getBillAmount() {
		return this.billAmount;
	}
	
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public int getNumOfPeople() {
		return this.numOfPeople;
	}
	
	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	
	public String getBillType() {
		return this.billType;
	}
	
	public void setBillType(String billType) {
		this.billType = billType;
	}
}
