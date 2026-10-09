
public abstract class SubBill {
	protected Tenant tenant;
	protected double fee;
	protected Bill parentBill;
	
	public SubBill(Tenant tenant, Bill parentBill) {
		this.tenant = tenant;
		this.parentBill = parentBill;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getFee() {
		return this.fee;
	}
	public abstract double calculateFee();
	public abstract double calculateFee(double firstPara);
}
