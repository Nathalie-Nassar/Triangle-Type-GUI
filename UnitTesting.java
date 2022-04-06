import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class UnitTesting {

	private Triangle tr = new Triangle();
	
	// Using Equivalence Classes::
	
	// Part A:
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Scalene")
	public void IntScalene1() {
		
		assertEquals("Scalene", tr.computeType( "3","2" ,"4" ));
		
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Scalene")
	public void IntScalene2() {
		assertEquals("Scalene", tr.computeType( "3", "5","6" ));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Scalene")
	public void IntScalene3() {
		assertEquals("Input Error!", tr.computeType( "4", "7", "2" ));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Scalene")
	public void IntScalene4() {
		assertEquals("Input Error!", tr.computeType( "2" , "7" , "4" ));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Scalene")
	public void IntScalene5() {
		assertEquals("Input Error!", tr.computeType( "7" , "4", "2" ));
	}
	

	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Isosceles")
	public void IntIsosceles1() {
		assertEquals("Isosceles", tr.computeType( "2", "2", "3" ));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Isosceles")
	public void IntIsosceles2() {
		assertEquals("Isosceles", tr.computeType( "3", "2", "2" ));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Isosceles")
	public void IntIsosceles3() {
		assertEquals("Isosceles", tr.computeType(  "2", "3", "2" ));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Isosceles")
	public void IntIsosceles4() {
		assertEquals("Input Error!", tr.computeType( "2", "2", "5"));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Isosceles")
	public void IntIsosceles5() {
		assertEquals("Input Error!", tr.computeType(  "2", "5", "2"));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Isosceles")
	public void IntIsosceles6() {
		assertEquals("Input Error!", tr.computeType(  "5", "2", "2"));
	}
	
	@Test
	@Tag("Lengths are Positive Whole Numbers")
	@Tag("Equilateral")
	public void IntEquilateral() {
		assertEquals("Equilateral", tr.computeType(  "3", "3", "3"));
	}
	
	
	//Part  B:
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Scalene")
	public void DecimalScalene1() {
		assertEquals("Scalene", tr.computeType(  "3.0", "2.0", "4.0"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Scalene")
	public void DecimalScalene2() {
		assertEquals("Scalene", tr.computeType(  "3.5", "5.4", "2"));
	
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Scalene")
	public void DecimalScalene3() {
		assertEquals("Input Error!", tr.computeType(  "1.4", "1.9", "3.3"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Scalene")
	public void DecimalScalene4() {
		assertEquals("Input Error!", tr.computeType(  "1.9", "3.3", "1.4"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Scalene")
	public void DecimalScalene5() {
		assertEquals("Input Error!", tr.computeType(  "3.3", "1.9", "1.4"));
	}
	
	
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles1() {
		assertEquals("Isosceles", tr.computeType(  "2.5", "2.5", "3.2"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles2() {
		assertEquals("Isosceles", tr.computeType(  "2.5", "3.2", "2.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles3() {
		assertEquals("Isosceles", tr.computeType(  "3.2", "2.5", "2.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles4() {
		assertEquals("Isosceles", tr.computeType(  "2.5", "2.5", "3"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles5() {
		assertEquals("Isosceles", tr.computeType(  "2.5", "3", "2.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles6() {
		assertEquals("Isosceles", tr.computeType(  "3", "2.5", "2.5"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles7() {
		assertEquals("Input Error!", tr.computeType(  "2.2", "2.2", "5.6"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles8() {
		assertEquals("Input Error!", tr.computeType(  "2.2", "5.6", "2.2"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles9() {
		assertEquals("Input Error!", tr.computeType(  "5.6", "2.2", "2.2"));
	}
	
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles10() {
		assertEquals("Input Error!", tr.computeType(  "2", "2", "5.6"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles11() {
		assertEquals("Input Error!", tr.computeType(  "2", "5.6", "2"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles12() {
		assertEquals("Input Error!", tr.computeType(  "5.6", "2", "2"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles13() {
		assertEquals("Isosceles", tr.computeType(  "2", "2", "3.4"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles14() {
		assertEquals("Isosceles", tr.computeType(  "3.4", "2", "2"));;
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Isosceles")
	public void DecimalIsosceles15() {
		assertEquals("Isosceles", tr.computeType(  "2", "3.4", "2"));
	}
	
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Equilateral")
	public void DecimalEquilateral1() {
		assertEquals("Equilateral", tr.computeType(  "3.0", "3.0", "3.0"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Equilateral")
	public void DecimalEquilateral2() {
		assertEquals("Equilateral", tr.computeType(  "3", "3.0", "3.0"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Equilateral")
	public void DecimalEquilateral3() {
		assertEquals("Equilateral", tr.computeType(  "3.0", "3", "3.0"));
	}
	
	@Test
	@Tag("Sides' Lengths are Positive Decimal Values")
	@Tag("Equilateral")
	public void DecimalEquilateral4() {
		assertEquals("Equilateral", tr.computeType(  "3.0", "3.0", "3"));
	}
	
	
	
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Scalene")
	public void NonNumScalene1() {
		assertEquals("Input Error!", tr.computeType(  "a", "3", "5"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Scalene")
	public void NonNumScalene2() {
		assertEquals("Input Error!", tr.computeType(  "a", "b", "4"));
	}
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Scalene")
	public void NonNumScalene3() {
		assertEquals("Input Error!", tr.computeType(  "4", "c", "-0.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Scalene")
	public void NonNumScalene4() {
		assertEquals("Input Error!", tr.computeType(  "Hello", "b", "d"));
	}
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Scalene")
	public void NonNumScalene5() {
		assertEquals("Input Error!", tr.computeType(  "0", "ht", "5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Scalene")
	public void NonNumScalene6() {
		assertEquals("Input Error!", tr.computeType(  "$", "6", "8.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Scalene")
	public void NonNumScalene() {
		assertEquals("Input Error!", tr.computeType(  "4", "#", "@"));
	}
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Isosceles")
	public void NonNumIsosceles1() {
		assertEquals("Input Error!", tr.computeType(  "ab", "ab", "5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Isosceles")
	public void NonNumIsosceles2() {
		assertEquals("Input Error!", tr.computeType(  "5.6", "Ab", "Ab"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Isosceles")
	public void NonNumIsosceles3() {
		assertEquals("Input Error!", tr.computeType(  "ab", "5", "ab"));
	}
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Isosceles")
	public void NonNumIsosceles4() {
		assertEquals("Input Error!", tr.computeType(  "#", "#", "3"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Isosceles")
	public void NonNumIsosceles5() {
		assertEquals("Input Error!", tr.computeType(  "3", "#", "#"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Isosceles")
	public void NonNumIsosceles6() {
		assertEquals("Input Error!", tr.computeType(  "#", "3", "#"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Equilateral")
	public void NonNumEquilateral1() {
		assertEquals("Input Error!", tr.computeType(  "hello", "hello", "hello"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Non-Numerical")
	@Tag("Equilateral")
	public void NonNumEquilateral2() {
		assertEquals("Input Error!", tr.computeType(  "$", "$", "$"));
	}
	
	
	
	// Part C:
	
	@Test
	@Tag("Sides' Lengths are Zeros")
	@Tag("Scalene")
	public void ZeroScalene1() {
		assertEquals("Input Error!", tr.computeType(  "0", "5", "4"));
	}
	

	@Test
	@Tag("Sides' Lengths are Zeros")
	@Tag("Scalene")
	public void ZeroScalene2() {
		assertEquals("Input Error!", tr.computeType(  "5.4", "4.2", "0"));
	}
	
	@Test
	@Tag("Sides' Lengths are Zeros")
	@Tag("Scalene")
	public void ZeroScalene3() {
		assertEquals("Input Error!", tr.computeType(  "5", "0", "6.3"));
	}
	

	@Test
	@Tag("Sides' Lengths are Zeros")
	@Tag("Isosceles")
	public void ZeroIsosceles1() {
		assertEquals("Input Error!", tr.computeType(  "0", "2", "2"));
	}
	
	@Test
	@Tag("Sides' Lengths are Zeros")
	@Tag("Isosceles")
	public void ZeroIsosceles2() {
		assertEquals("Input Error!", tr.computeType(  "2", "0", "2"));
	}
	

	@Test
	@Tag("Sides' Lengths are Zeros")
	@Tag("Isosceles")
	public void ZeroIsosceles3() {
		assertEquals("Input Error!", tr.computeType(  "0", "0", "2"));
	}
	

	@Test
	@Tag("Sides' Lengths are Zeros")
	@Tag("Isosceles")
	public void ZeroIsosceles4() {
		assertEquals("Input Error!", tr.computeType(  "2.5", "0", "0"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Zeros")
	@Tag("Equilateral")
	public void ZeroIsosceles() {
		assertEquals("Input Error!", tr.computeType(  "0", "0", "0"));
	}
	
	
	// Part D:
	


	@Test
	@Tag("Sides' Lengths are Null")
	@Tag("Scalene")
	public void NullScalene1() {
		assertEquals("Input Error!", tr.computeType(  "6", "8.5", "null"));
	}
	
	@Test
	@Tag("Sides' Lengths are Null")
	@Tag("Scalene")
	public void NullScalene2() {
		assertEquals("Input Error!", tr.computeType(  "null", "8.5", "6"));
	}
	
	@Test
	@Tag("Sides' Lengths are Null")
	@Tag("Scalene")
	public void NullScalene3() {
		assertEquals("Input Error!", tr.computeType(  "6", "null", "8.5"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Null")
	@Tag("Isosceles")
	public void NullIsosceles1() {
		assertEquals("Input Error!", tr.computeType(  "null", "8.5", "null"));
	}
	
	@Test
	@Tag("Sides' Lengths are Null")
	@Tag("Isosceles")
	public void NullIsosceles2() {
		assertEquals("Input Error!", tr.computeType(  "6", "null", "null"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Null")
	@Tag("Isosceles")
	public void NullIsosceles3() {
		assertEquals("Input Error!", tr.computeType(  "null", "null", "6"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Null")
	@Tag("Equilateral")
	public void NullEquilateral() {
		assertEquals("Input Error!", tr.computeType(  "null", "null", "null"));
	}
	
	
	// Part E:
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Scalene")
	public void NegativeScalene1() {
		assertEquals("Input Error!", tr.computeType(  "-3.5", "5.4", "2"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Scalene")
	public void NegativeScalene2() {
		assertEquals("Input Error!", tr.computeType(  "3.5", "-5.4", "2"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Scalene")
	public void NegativeScalene3() {
		assertEquals("Input Error!", tr.computeType(  "3.5", "5.4", "-2"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Scalene")
	public void NegativeScalene4() {
		assertEquals("Input Error!", tr.computeType(  "-3.4", "-5.4", "-2"));
	}
	
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Isosceles")
	public void NegativeIsosceles1() {
		assertEquals("Input Error!", tr.computeType(  "-3.5", "-3.5", "5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Isosceles")
	public void NegativeIsosceles2() {
		assertEquals("Input Error!", tr.computeType(  "-3.5", "5", "-3.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Isosceles")
	public void NegativeIsosceles3() {
		assertEquals("Input Error!", tr.computeType(  "5", "-3.5", "-3.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Isosceles")
	public void NegativeIsosceles4() {
		assertEquals("Input Error!", tr.computeType(  "-3.5", "-3.5", "-5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Isosceles")
	public void NegativeIsosceles5() {
		assertEquals("Input Error!", tr.computeType(  "-3.5", "-5", "-3.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Isosceles")
	public void NegativeIsosceles6() {
		assertEquals("Input Error!", tr.computeType(  "-5", "-3.5", "-3.5"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Equilateral")
	public void NegativeEquilateral1() {
		assertEquals("Input Error!", tr.computeType(  "-3", "-3", "-3"));
	}
	
	@Test
	@Tag("Sides' Lengths are Negative")
	@Tag("Equilateral")
	public void NegativeEquilateral2() {
		assertEquals("Input Error!", tr.computeType(  "-2.5", "-2.5", "-2.5"));
	}
	
	
	
	// Using Robust Testing::
	
	@Test
	@Tag("Testing for the minimum boundary")
	public void RobustMin1() {
		assertEquals("Equilateral", tr.computeType( Double.MIN_VALUE + "",  Double.MIN_VALUE + "",  Double.MIN_VALUE + ""));
	}
	
	@Test
	@Tag("Testing for the minimum boundary")
	public void RobustMin2() {
		assertEquals("Input Error!", tr.computeType( Double.MIN_VALUE + "",  Double.MIN_VALUE + "", "$"));
	}
	
	@Test
	@Tag("Testing for the minimum boundary")
	public void RobustMin3() {
		assertEquals("Input Error!", tr.computeType( "$",  Double.MIN_VALUE + "",  Double.MIN_VALUE + ""));
	}
	
	@Test
	@Tag("Testing for the minimum boundary")
	public void RobustMin4() {
		assertEquals("Input Error!", tr.computeType(  Double.MIN_VALUE + "",  "$", Double.MIN_VALUE + ""));
	}
	
	@Test
	@Tag("Testing for the minimum boundary")
	public void RobustMin5() {
		assertEquals("Input Error!", tr.computeType( Double.MIN_VALUE + "",  Double.MIN_VALUE + "", "-5"));
	}
	
	@Test
	@Tag("Testing for the minimum boundary")
	public void RobustMin6() {
		assertEquals("Input Error!", tr.computeType( "-5",  Double.MIN_VALUE + "",  Double.MIN_VALUE + ""));
	}
	
	@Test
	@Tag("Testing for the minimum boundary")
	public void RobustMin7() {
		assertEquals("Input Error!", tr.computeType(  Double.MIN_VALUE + "",  "-5", Double.MIN_VALUE + ""));
	}
	
	@Test
	@Tag("Testing for the maximum boundary")
	public void RobustMax1() {
		assertEquals("Equilateral", tr.computeType(  Double.MAX_VALUE + "",  Double.MAX_VALUE + "" , Double.MAX_VALUE + ""));
	}
	
	@Test
	@Tag("Testing for the maximum boundary")
	public void RobustMax2() {
		assertEquals("Input Error!", tr.computeType(  Double.MAX_VALUE + "",  Double.MAX_VALUE + "" , "$"));
	}
	

	@Test
	@Tag("Testing for the maximum boundary")
	public void RobustMax3() {
		assertEquals("Input Error!", tr.computeType(  Double.MAX_VALUE + "", "$", Double.MAX_VALUE + "" ));

	}
	

	@Test
	@Tag("Testing for the maximum boundary")
	public void RobustMax4() {
		assertEquals("Input Error!", tr.computeType( "$" ,Double.MAX_VALUE + "",  Double.MAX_VALUE + ""));
	}
	
	@Test
	@Tag("Testing for the maximum boundary")
	public void RobustMax5() {
		assertEquals("Input Error!", tr.computeType(  Double.MAX_VALUE + "",  Double.MAX_VALUE + "" , "-5"));
	}
	

	@Test
	@Tag("Testing for the maximum boundary")
	public void RobustMax6() {
		assertEquals("Input Error!", tr.computeType(  Double.MAX_VALUE + "", "-5", Double.MAX_VALUE + "" ));

	}
	

	@Test
	@Tag("Testing for the maximum boundary")
	public void RobustMax7() {
		assertEquals("Input Error!", tr.computeType( "-5" ,Double.MAX_VALUE + "",  Double.MAX_VALUE + ""));
	}
	
	
	@Test
	@Tag("Testing for above maximum ")
	public void RobustMax() {
		assertNotEquals("Equilateral", tr.computeType(Double.MAX_VALUE + "" + 1, 1 + Double.MAX_VALUE + "", 1+ Double.MAX_VALUE + ""));
	}
	
	@Test
	@Tag("Testing for below minimum ")
	public void RobustMin() {
		assertEquals("Input Error!", tr.computeType(Double.MIN_VALUE - 1+ "" , - 1 + Double.MIN_VALUE + "", - 1 + Double.MIN_VALUE + ""));
	}
	
	// Using Random Testing ::
		
	
	@Test
	@Tag("Random")
	public void Rand1() {
		assertEquals("Input Error!", tr.computeType(  "null", "9", "7"));
	}


	@Test
	@Tag("Random")
	public void Rand2() {
		assertEquals("Input Error!", tr.computeType(  "8", "9", "20"));
	}

	
	@Test
	@Tag("Random")
	public void Rand3() {
		assertEquals("Input Error!", tr.computeType(  "*", "5", "7"));
	}

	
	@Test
	@Tag("Random")
	public void Rand4() {
		assertEquals("Input Error!", tr.computeType(  "60.6", "hel", "8"));
	}

	
	@Test
	@Tag("Random")
	public void Rand5() {
		assertEquals("Input Error!", tr.computeType(  "0", "0", "5"));
	}

	
	@Test
	@Tag("Random")
	public void Rand6() {
		assertEquals("Input Error!", tr.computeType(  "-6.7", "-0.9", "8"));
	}

	
	@Test
	@Tag("Random")
	public void Rand7() {
		assertEquals("Input Error!", tr.computeType(  "9.0", "9.7", "0"));
	}

	
	@Test
	@Tag("Random")
	public void Rand8() {
		assertEquals("Input Error!", tr.computeType(  "8", "null", "null"));
	}

	
	@Test
	@Tag("Random")
	public void Rand9() {
		assertEquals("Isosceles", tr.computeType(  "9", "9", "4"));
	}

	
	@Test
	@Tag("Random")
	public void Rand10() {
		assertEquals("Isosceles", tr.computeType(  "8", "8.0", "7"));
	}

	
	@Test
	@Tag("Random")
	public void Rand11() {
		assertEquals("Scalene", tr.computeType(  "9", "8", "15"));
	}
	
	
	@Test
	@Tag("Random")
	public void Rand12() {
		assertEquals("Equilateral", tr.computeType(  "9", "9.0", "9.0"));
	}

}
