package replicatorg.drivers.commands;

import replicatorg.drivers.Driver;
import replicatorg.drivers.RetryException;

public class SetAdvanceK implements DriverCommand {

	double s;

	public SetAdvanceK(double s) {
		this.s = s; 
	}
	@Override
	public void run(Driver driver) throws RetryException {
		driver.setAdvanceK(s);
	}
}
