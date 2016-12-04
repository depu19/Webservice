package com.deepa.ws.stub;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.out.println("You have not provided the IP address");
		}
		else
		{
			String ip= args[0];
			GeoIPService service = new GeoIPService();
			GeoIPServiceSoap port = service.getGeoIPServiceSoap();
			GeoIP IpObj= port.getGeoIP(ip);
			System.out.println(IpObj.getCountryName());
		}
	}
}
