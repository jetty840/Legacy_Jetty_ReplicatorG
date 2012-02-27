package replicatorg.drivers.commands;

import replicatorg.drivers.Driver;
import replicatorg.drivers.RetryException;

public class SetAdvanceK implements DriverCommand {

	double s;
	double k;

	public SetAdvanceK(double s, double k) {
		this.s = s; 
		this.k = k; 
	}
	@Override
	public void run(Driver driver) throws RetryException {
		driver.setAdvanceK(s, k);
	}
}
