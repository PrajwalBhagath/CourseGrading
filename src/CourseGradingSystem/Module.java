/**
 * 
 * The Module class holds the Data for each of the module.
 * it holds the Module title, code, level and Module type.
 * The Module class also returns a toString method outputting the code
 * 
 * @author Prajwal Bhagath 18039504
 */
package Assignment;

public class Module {
	String title;	//Module Title
	String code;	//Module Code
	Level level;	//Module Level
	ModuleType type;//Module type

	//constructor for the module class
	Module(ModuleType type, String title, String code,Level level){
		this.code = code;
		this.title = title;
		this.level = level;
		this.type = type;
	}
	
	/**
	* The get method for the title allows other classes to access the title of the module
	* 
	* @return the title of the module
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public String getTitle() {
		return title;
	}
	
	/**
	* The set method for the title assigns the value of the title 
	* 
	* @param title
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public void setTitle (String title) {
		this.title = title;	
	}
	
	/**
	* The get method for the code allows other classes to access the code of the module
	* 
	* @return the code of the module
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public String getCode() {
		return code;
	}
	
	/**
	* The set method for the code assigns the value of the code 
	* 
	* @param code
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	* The get method for the level allows other classes to access the level of the module
	* 
	* @return the level of the module
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public Level getLevel() {
		return level;
	}
	
	/**
	* The set method for the level assigns the value of the level 
	* 
	* @param level
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public void setLevel (Level level) {
		this.level = level;
	}
	
	/**
	* The get method for the type allows other classes to access the type of the module
	* 
	* @return the type of the module
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public ModuleType getType() {
		return type;
	}
	
	/**
	* The set method for the type assigns the value of the type 
	* 
	* @param title
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public void setType (ModuleType type) {
		this.type = type;
	}
	
	//Constructor for module code
	public Module(String code) 
	{
		this.code = code;
		this.type = null;
		this.level = null;
		this.type = null;
	}
	
	//toString method to output the code of the module
	public String toString() {
		String output = null;
		for (int i = 0; i <13; i++) {
			output = this.code;
		}
		return output;
	}
}
