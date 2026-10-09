
public class ElectricityFee extends SubBill{
	private double publicAreaUse;
	private double previousRead;
	private double currentRead;
	
	public ElectricityFee(Tenant tenant, Bill parentBill,double previousRead,double currentRead, double publicAreaUse) {
		super(tenant,parentBill);
		this.previousRead = previousRead;
		this.currentRead = currentRead;
		this.publicAreaUse = publicAreaUse;
	}
	
	public double getPublicAreaUse() {
		return this.publicAreaUse;
	}
	
	public void setPublicArea(double publicAreaUse) {
		this.publicAreaUse = publicAreaUse;
	}
	
	public double getPreviousRead() {
		return this.previousRead;
	}
	
	public void setPreviousRead(double previousRead) {
		this.previousRead = previousRead;
	}
	
	public double getCurrentRead() {
		return this.currentRead;
	}
	
	public void setCurrentRead(double currentRead) {
		this.currentRead = currentRead;
	}
	
	
	@Override
	public double calculateFee() {
		System.out.println("This function is not suitable in the situation.");
		return -1;
	}
	
	@Override
	public double calculateFee(double totalElectricityUse) {
		double personalFee = 0.0;
		personalFee = super.parentBill.getBillAmount() * ((this.currentRead - this.previousRead) + this.publicAreaUse)/totalElectricityUse;
		super.tenant.setUnpaidAmount(super.tenant.getUnpaidAmount()+personalFee);
		super.setFee(personalFee);
		return personalFee;
	}
	
	
}
