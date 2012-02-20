package replicatorg.drivers.commands;

import replicatorg.drivers.Driver;
import replicatorg.drivers.RetryException;

public class SetFilamentDiameter implements DriverCommand {

	double s;

	public SetFilamentDiameter(double s) {
		this.s = s; 
	}
	@Override
	public void run(Driver driver) throws RetryException {
		driver.setFilamentDiameter(s);
	}
}
