public class WaterFee extends SubBill{
	public WaterFee(Tenant tenant,Bill parentBill) {
		super(tenant,parentBill);
	}
	
	@Override
	public double calculateFee(double firstPara) {
		System.out.println("This function is not suitable in the situation.");
		return -1;
	}
	
	@Override
	public double calculateFee() {
		return this.parentBill.getBillAmount()/this.parentBill.getNumOfPeople();
	}
	
}
