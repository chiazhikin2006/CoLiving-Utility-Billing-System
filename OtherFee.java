
public class OtherFee extends SubBill{
	public OtherFee(Tenant tenant,Bill parentBill) {
		super(tenant,parentBill);
	}
	
	@Override
	public double calculateFee(double firstPara) {
		System.out.println("This function is not suitable in the situation.");
		return -1;
	}
	
	@Override
	public double calculateFee() {
		double personalFee = this.parentBill.getBillAmount()/this.parentBill.getNumOfPeople();
		super.tenant.setUnpaidAmount(super.tenant.getUnpaidAmount()+personalFee);
		super.setFee(personalFee);
		return personalFee;
	}
}
