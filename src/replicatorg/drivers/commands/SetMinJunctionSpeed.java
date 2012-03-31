package replicatorg.drivers.commands;

import replicatorg.drivers.Driver;
import replicatorg.drivers.RetryException;

public class SetMinJunctionSpeed implements DriverCommand {

	double x, y, z, a;

	public SetMinJunctionSpeed(double x, double y, double z, double a) {
		this.x = x; 
		this.y = y; 
		this.z = z; 
		this.a = a; 
	}
	@Override
	public void run(Driver driver) throws RetryException {
		driver.setMinJunctionSpeed(x,y,z,a);
	}
}
