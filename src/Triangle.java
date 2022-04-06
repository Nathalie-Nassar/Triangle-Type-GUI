public class Triangle  implements ITriangle{

    @Override
    public String computeType(String side1, String side2, String side3) {
    	double s1, s2, s3;
    	
        try{
        	// Trying to cast them to doubles
             s1 = Double.parseDouble(side1);
             s2 = Double.parseDouble(side2);
             s3 = Double.parseDouble(side3);
            
      
        // Check the condition that the addition of every 2 sides must be greater than the third
                 
        if (s1 + s2 <= s3 || s2 + s3 <= s1 || s1 + s3 <= s2)
        	return "Input Error!";
    
        
		if (s1 == s2 && s2 == s3){
		    return  "Equilateral";
		}
		else if ( s1 ==  s2 || s1 == s3 || s2 == s3){
		    return "Isosceles";
		}
		     return "Scalene";
		   
    }
    catch (Exception message) {
        return "Input Error!"; // values are non-numerical
    }
    }
}
