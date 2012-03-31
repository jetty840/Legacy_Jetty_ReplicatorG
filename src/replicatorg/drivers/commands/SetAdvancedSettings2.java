package replicatorg.drivers.commands;

import replicatorg.drivers.Driver;
import replicatorg.drivers.RetryException;

public class SetAdvancedSettings2 implements DriverCommand {

	double s;
	double a;
	double k;
	double y;

	public SetAdvancedSettings2(double s, double a, double k, double y) {
		this.s = s; 
		this.a = a; 
		this.k = k; 
		this.y = y; 
	}
	@Override
	public void run(Driver driver) throws RetryException {
		driver.setAdvancedSettings2(s, a, k, y);
	}
}
