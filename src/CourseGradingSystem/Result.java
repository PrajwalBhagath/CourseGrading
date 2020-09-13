/**
 * 
 * The Result class holds the module and which grade it got
 * for the corresponding module
 * 
 * @author Prajwal Bhagath 18039504
 */
package Assignment;

public class Result {
	Module module;
	Grade grade;
	
	//Constructor for result
	Result(Module module, Grade grade){
		this.grade = grade;
		this.module = module;
	}
	
	/**
	* The get method for the Module allows other classes to access the Module of the module
	* 
	* @return the module
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public Module getModule() {
		return module;
	}
	
	/**
	* The set method for the module assigns the value of the module 
	* 
	* @param module
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public void setModule(Module module) {
		this.module = module;
	}
	
	/**
	* The get method for the grade allows other classes to access the Grade of the module
	* 
	* @return the Grade of the module
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public Grade getGrade() {
		return grade;
	}
	
	/**
	* The set method for the grade assigns the value of the grade 
	* 
	* @param grade
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
}
