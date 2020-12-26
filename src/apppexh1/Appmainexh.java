package apppexh1;

import java.util.Scanner;


import Validationpackage.ConfigurationMisMatchException;
import Validationpackage.Validator;

public class Appmainexh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ram capacity(in GB)");
		int ramcapacity=sc.nextInt();
		System.out.println("Enter HD capacity available(in GB)");
		int hdcapacity=sc.nextInt();
		System.out.println("Enter net connection speed(in KBPS)");
		int olnetconnection=sc.nextInt();
		Validator validator=new Validator();
		
		try
		{
			validator.validateconfiguration(ramcapacity, hdcapacity, olnetconnection);
			System.out.println("Thank you for installing the game");
			
		}catch(ConfigurationMisMatchException e){

			System.out.println("Sorry cannot install the game");
		}
		
		

	}

}
