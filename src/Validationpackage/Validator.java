package Validationpackage;

public class Validator {
      public static boolean validateconfiguration(int ramcapacity,int hdcapacity,int olnetConnection) throws ConfigurationMisMatchException 
      {
    	  if(ramcapacity>=6 && hdcapacity>=30 && olnetConnection>=192)
    	  {
    		  return true;
    	  }
    	  else
    	  {
              throw new ConfigurationMisMatchException();  
             
    	  }
    	   		  
    	  
    	  
    	  
    		  
    		  
      }
      

}