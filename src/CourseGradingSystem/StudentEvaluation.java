/**
 * 
 * The Student evaluation classHolds the students Data as student objects and 
 * has a main function that displays the students grades, with their module and whether they are certified or not
 * 
 * @author Prajwal Bhagath 18039504
 */
package Assignment;

public class StudentEvaluation {
	
	//student Robin's Modules taken and the grade received  
	public static Student Robin()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Robin");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.C);		
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.C);
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.APLUS);		
		return rb;
	}
	
	//student Kate's taken modules and grade received 
	public static Student Kate()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student kt = new Student("Kate");

		kt.addResultToTranscript(ts.lookup("PROG101"),Grade.APLUS);
		kt.addResultToTranscript(ts.lookup("STAT102"),Grade.AMINUS);		
		kt.addResultToTranscript(ts.lookup("TECH103"),Grade.BPLUS);
		kt.addResultToTranscript(ts.lookup("MODC233"),Grade.A);
		kt.addResultToTranscript(ts.lookup("TOPG233"),Grade.C);
		kt.addResultToTranscript(ts.lookup("DATA222"),Grade.A);
		kt.addResultToTranscript(ts.lookup("INSY313"),Grade.BPLUS);
		kt.addResultToTranscript(ts.lookup("WEBS332"),Grade.AMINUS);
		kt.addResultToTranscript(ts.lookup("PROJ399"),Grade.B);
		kt.addResultToTranscript(ts.lookup("EXTO396"),Grade.B);

		return kt;
	}
	
	//Student Axel's taken modules and grades received 
	public static Student Axel()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student ax = new Student("Axel");

		ax.addResultToTranscript(ts.lookup("PROG101"),Grade.BPLUS);		
		ax.addResultToTranscript(ts.lookup("STAT102"),Grade.C);
		ax.addResultToTranscript(ts.lookup("DATA222"),Grade.A);		
		ax.addResultToTranscript(ts.lookup("INSY313"),Grade.AMINUS);
		ax.addResultToTranscript(ts.lookup("WEBS332"),Grade.A);
		ax.addResultToTranscript(ts.lookup("TECH103"),Grade.D);		
		ax.addResultToTranscript(ts.lookup("MODC233"),Grade.B);
		ax.addResultToTranscript(ts.lookup("TOPG233"),Grade.B);		
		ax.addResultToTranscript(ts.lookup("PROJ399"),Grade.CMINUS);
		ax.addResultToTranscript(ts.lookup("EXTO396"),Grade.C);

		return ax;
	}

		//student Jim's module selection and the grade received 
		public static Student Jim()
		{
			TechnicalSchool ts = new TechnicalSchool();
			Student jm = new Student("Jim");

			jm.addResultToTranscript(ts.lookup("PROG101"),Grade.A);
			jm.addResultToTranscript(ts.lookup("STAT102"),Grade.BPLUS);
			jm.addResultToTranscript(ts.lookup("DATA222"),Grade.CPLUS);
			jm.addResultToTranscript(ts.lookup("PROG202"),Grade.C);
			jm.addResultToTranscript(ts.lookup("INSY313"),Grade.C);
			jm.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
			jm.addResultToTranscript(ts.lookup("TECH103"),Grade.CMINUS);
			jm.addResultToTranscript(ts.lookup("THEO111"),Grade.D);
			jm.addResultToTranscript(ts.lookup("MODC233"),Grade.APLUS);
			jm.addResultToTranscript(ts.lookup("TOPG233"),Grade.A);
			jm.addResultToTranscript(ts.lookup("LOGI321"),Grade.B);
			jm.addResultToTranscript(ts.lookup("PROJ399"),Grade.BMINUS);
			jm.addResultToTranscript(ts.lookup("EXTO396"),Grade.APLUS);
			
			return jm;
		}
		
		//student Kanyes's module selection and the grade received 
		public static Student Kanye()
		{
			TechnicalSchool ts = new TechnicalSchool();
			Student yz = new Student("Kanye");

			yz.addResultToTranscript(ts.lookup("PROG101"),Grade.A);
			yz.addResultToTranscript(ts.lookup("STAT102"),Grade.BMINUS);
			yz.addResultToTranscript(ts.lookup("DATA222"),Grade.C);
			yz.addResultToTranscript(ts.lookup("PROG202"),Grade.D);
			yz.addResultToTranscript(ts.lookup("INSY313"),Grade.CPLUS);
			yz.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
			yz.addResultToTranscript(ts.lookup("TECH103"),Grade.AMINUS);
			yz.addResultToTranscript(ts.lookup("THEO111"),Grade.APLUS);
			yz.addResultToTranscript(ts.lookup("MODC233"),Grade.A);
			yz.addResultToTranscript(ts.lookup("TOPG233"),Grade.A);
			yz.addResultToTranscript(ts.lookup("LOGI321"),Grade.B);
			yz.addResultToTranscript(ts.lookup("PROJ399"),Grade.CMINUS);
			yz.addResultToTranscript(ts.lookup("EXTO396"),Grade.APLUS);
			
			return yz;
		}
		
		public static Student Kendrick()
		{
			TechnicalSchool ts = new TechnicalSchool();
			Student kd = new Student("Kendrick");

			kd.addResultToTranscript(ts.lookup("PROG101"),Grade.AMINUS);
			kd.addResultToTranscript(ts.lookup("STAT102"),Grade.B);
			kd.addResultToTranscript(ts.lookup("DATA222"),Grade.CPLUS);
			kd.addResultToTranscript(ts.lookup("PROG202"),Grade.CMINUS);
			kd.addResultToTranscript(ts.lookup("INSY313"),Grade.CPLUS);
			kd.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
			kd.addResultToTranscript(ts.lookup("THEO111"),Grade.D);
			kd.addResultToTranscript(ts.lookup("MODC233"),Grade.APLUS);
			kd.addResultToTranscript(ts.lookup("TOPG233"),Grade.APLUS);
			kd.addResultToTranscript(ts.lookup("LOGI321"),Grade.BPLUS);
			kd.addResultToTranscript(ts.lookup("PROJ399"),Grade.BMINUS);
			kd.addResultToTranscript(ts.lookup("EXTO396"),Grade.APLUS);
			
			return kd;
		}
		
		
		

		public static void main (String[] args) 
		{
			TechnicalSchool main = new TechnicalSchool();
			
				//printing out Axel's results, and printing out if they are certified or not 
				if(main.isCertified(Axel()) == true) {
				System.out.println("Congratulations! You are ceritfied");
				}
				else {
					System.out.println("Sorry, You are not ceritfied");
				}
				System.out.println();//line space
				
				//printing out Robin's results, and printing out if they are certified or not 
				if(main.isCertified(Robin()) == true) {
				System.out.println("Congratulations! You are ceritfied");
				}
				else {
					System.out.println("Sorry, You are not ceritfied");
				}
			System.out.println();//Space
			
				
			
				//printing out Kates's results, and printing out if they are certified or not 
				if(main.isCertified(Kate()) == true) {
				System.out.println("Congratulations! You are ceritfied");
				}
				else {
					System.out.println("Sorry, You are not ceritfied");
				}
			System.out.println();//space
			
				
				//printing out Jims's results, and printing out if they are certified or not 
				if(main.isCertified(Jim()) == true) {
				System.out.println("Congratulations! You are ceritfied");
				}
				else {
					System.out.println("Sorry, You are not ceritfied");
				}
			System.out.println();//space
			
			
				//printing out Kanye's results, and printing out if they are certified or not 
				if(main.isCertified(Kanye()) == true) {
				System.out.println("Congratulations! You are ceritfied");
				}
				else {
					System.out.println("Sorry, You are not ceritfied");
				}
			System.out.println();//space
			
			
			//printing out Kendrick's results, and printing out if they are certified or not 
			if(main.isCertified(Kendrick()) == true) {
			System.out.println("Congratulations! You are ceritfied");
			}
			else {
				System.out.println("Sorry, You are not ceritfied");
			}
		System.out.println();
		}
	
}
