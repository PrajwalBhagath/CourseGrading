/**
 * 
 * The Grade class is an Enumerated type 
 * which assigns the student's grade with the 
 * appropriate percentage value. and shows whether the
 * student has passed or not
 * 
 * @author Prajwal Bhagath 18039504
 */
package Assignment;

//Grade enum Storing a grade(high%, low%, pass)
public enum Grade {
	APLUS(100,90,true),A(89,85,true),AMINUS(84, 80,true),BPLUS(79,75,true),
	B(74,70,true),BMINUS(69,65,true),CPLUS(64,60,true),C(59,55,true),CMINUS(54,50,true),D(49,0,false);
	
	private int high;//highest percentage in the grade
	private int low;//lowest percentage in the grade
	private boolean pass;//to check if the grade is a pass or not
	
	//constructor for the grade enum
	private Grade( int high, int low, boolean pass) {
		this.high = high;
		this.low = low;
		this.pass = pass;
	}

	/**
	* The is pass method checks if the pass boolean
	* is true or false and returns the appropriate boolean
	* to the called function
	* 
	* @return true if the grade is a passing grade or false if it is not a passing grade
	* @author Prajwal Bhagath 18039504
	* */
public boolean isPass() 
{
	if (this.pass) 
	{
		return true;
	}
	else 
	{
		return false;
	}
}
	/**
	* the getHigh function is used to 
	* give the function calling this method in 
	* another class the highest value of the grade 
	* bracket
	* 
	* @return the highest percentage possible in the grade level
	* 
	* @author Prajwal Bhagath 18039504
	* */
	public int getHigh() {
		return high;
	}
	
	/**
	* the setHigh function is used to assign the 
	* value of high which is accessible through the getHigh method
	* 
	* @param high
	* @author Prajwal Bhagath 18039504
	* */
	public void setHigh(int high) {
		this.high = high;
	}
	
	/**
	* the getLow function is used to 
	* give the function calling this method in 
	* another class the lowest percentage of the grade 
	* bracket
	* 
	* @return the lowest percentage possible in the grade level
	* 
	* @author Prajwal Bhagath 18039504
	* */
	public int getLow() {
		return low;
	}
	
	/**
	* the setLow function is used to assign the 
	* value of low which is accessible through the getHigh method
	* 
	* @param low
	* @author Prajwal Bhagath 18039504
	* */
	public void setLow(int low) {
		this.low = low;
	}
	
	
}

