import java.util.ArrayList;
public class BillManager {
	private ArrayList <Tenant> tenant;
	private ArrayList <Bill> masterBill;
	private ArrayList <SubBill> subBill;
	public BillManager() {
		this.tenant = new ArrayList<Tenant>();
		this.masterBill = new ArrayList<Bill>();
		this.subBill = new ArrayList<SubBill>();
	}
	public boolean addNewTenant(String name,String id) {
		
		double unpaidAmount = 0.0;
		Tenant tempTenant = new Tenant(name,id,unpaidAmount);
		this.tenant.add(tempTenant);
		tempTenant = null;
		
		return true;
	}
	
	public boolean addMasterBill(String billId, String billName, String billType, String billDescription,double billAmount,int numOfPeople) {
		
		Bill newBill = new Bill(billId,billName,billType,billDescription,billAmount,numOfPeople);
		this.masterBill.add(newBill);
		newBill = null;
		return true;
		
	}
	
	public boolean addSubBill(Tenant tenant,Bill bill) {
		
		SubBill newSubBill = new OtherFee(tenant,bill);
		newSubBill.calculateFee();
		this.subBill.add(newSubBill);
		newSubBill = null;
		return true;
		
	}
	
	public boolean addSubBill(Tenant tenant, Bill parentBill,double previousRead,double currentRead, double publicAreaUse, double totalElectricityUse) {
		
		SubBill newSubBill = new ElectricityFee(tenant, parentBill, previousRead, currentRead, publicAreaUse);
		newSubBill.calculateFee(totalElectricityUse);
		this.subBill.add(newSubBill);
		newSubBill = null;
		return true;
	}
	
	
}
