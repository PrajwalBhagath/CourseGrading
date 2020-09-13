/**
 * 
 * The Student class Holds the data for the student's information
 * such as name and number of results 
 * 
 * @author Prajwal Bhagath 18039504
 */
package Assignment;

public class Student {
	String name;
	static int MAX_TRANSCRIPT_LENGTH =20;
	int no_Results = 0;
	static Result[] transcript= new Result[MAX_TRANSCRIPT_LENGTH];

	
	//Constructor for student name;
	Student (String name){
		this.name = name;
	}
	
	/**add result to transcript creates a Result object and adds it to the end of the 
	 * transcript and updates the number Of Results.
	 **/
	public void addResultToTranscript(Module module, Grade grade) {
		transcript[no_Results]= new Result(module, grade);
		no_Results++;
	}
	
	/**
	* The get method for the transcript allows other classes to access the transcript
	* 
	* @return transcript
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public Result[] getTranscript() {
		
		return transcript;
	}
	
	public void setTranscript(Result[] Transcript) {
		Student.transcript = Transcript;
	}
	
	/**
	* The get method for the number of results allows other classes to access the number of results
	* 
	* @return number of results (no_Results)
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public int getNresults() {
		return no_Results;
	}
	
	public void setNResults(int no_Results) {
		this.no_Results = no_Results;
	}
	
	/**
	* The get method for the name allows other classes to access the name of the student
	* 
	* @return the name of the student
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	* The toString method for the student displays the name of the student 
	* 
	* 
	* @return the name of the student and are 
	* @author Prajwal Bhagath 18039504
	* 
	* */
	public String toString() {
		String print;
		print = this.getName()+"'s results are: ";
		return print;
	}
}
