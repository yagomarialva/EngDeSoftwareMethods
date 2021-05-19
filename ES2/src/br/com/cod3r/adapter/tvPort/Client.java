package br.com.cod3r.adapter.tvPort;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.TV;
import br.com.cod3r.adpter.tvPort.adapters.*;

public class Client {

	public static void main(String[] args) {
		
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan Cat song");
		System.out.println("----------------Monitor Class Adapter------------------");
		
		Computer pc3 = new Computer();
		HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();
		pc3.connectPort(monitorAdaptee);
		pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
	}
	
}
