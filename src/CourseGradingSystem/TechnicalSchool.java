/**
 * 
 * The TechnicalSchool class holds the offerings of the modules  during semester one 
 * looks up for the offerings, and checks if the student was certified or not.
 * 
 * @author Prajwal Bhagath 18039504
 */
package Assignment;

public class TechnicalSchool {
		
		Module[] offerings;// array of modules that holds the offerings of semester one
		
		/**
		* A module array that holds the title of the module type, title,code 
		* and level
		* 
		* @return array of modules that are available during semester one
		* @author Prajwal Bhagath 18039504
		* */

		private static Module[] semesterOneModuleOfferings() {
			Module[] a  = new Module[13];
			a[0] = new Module (ModuleType.TAUGHT, "Proggraming", "PROG101",Level.ONE);
			a[1] = new Module (ModuleType.TAUGHT, "Statistics", "STAT102",Level.ONE);
			a[2] = new Module (ModuleType.TAUGHT, "Database Design", "DATA222",Level.TWO);
			a[3] = new Module (ModuleType.TAUGHT, "Object-Oriented Programming", "PROG202",Level.TWO);
			a[4] = new Module (ModuleType.TAUGHT, "Information Systems", "INSY313",Level.THREE);
			a[5] = new Module (ModuleType.SELF_STUDY, "Web Services", "WEBS332",Level.THREE);
			a[6] = new Module (ModuleType.SELF_STUDY, "Technology Applications", "TECH103",Level.ONE);
			a[7] = new Module (ModuleType.SELF_STUDY, "Theory of Computation", "THEO111",Level.ONE);
			a[8] = new Module (ModuleType.SELF_STUDY, "Model Checking", "MODC233",Level.TWO);
			a[9] = new Module (ModuleType.SELF_STUDY, "Topology", "TOPG233",Level.TWO);
			a[10] = new Module (ModuleType.SELF_STUDY, "Logic", "LOGI321",Level.THREE);
			a[11] = new Module (ModuleType.PROJECT, "Web App Dev", "ROJ399",Level.THREE);
			a[12] = new Module (ModuleType.CLIENT_PROJECT, "Great Code Company", "EXTO396",Level.THREE);

			return a;
		}
		
		//constructor assigning the offering array of module to the semester one offerings 
		TechnicalSchool(){
			this.offerings = TechnicalSchool.semesterOneModuleOfferings();
		}
		
		/**
		* the getSemester offerings will allow to access all the available 
		* modules being offered during semester one
		* 
		* @return Array of modules
		* @author Prajwal Bhagath 18039504
		* */

		public Module[] getSemesterOfferings() {
			return offerings;
		}
		
		/**
		* Searches through the offerings array to find the code of the module
		* @param code
		* @return the module with the same code
		* @author Prajwal Bhagath 18039504
		* */

		public Module lookup(String code) 
		{
			Module seek = new Module(code);
			  for (int i=0;i<this.offerings.length;i++) {
				if(this.offerings[i].getCode().equals(code)) 
				{
					seek = this.offerings[i];
				}
			  }
				return seek;
		}
		
		/**
		* checks if the student is certified by checking if the student fulfills the following requirements:
		* 	• at least three modules passed at level 1, either taught or self-study AND
		*	• at least three modules passed at level 2, more than one must be taught AND
		*	• at least four modules passed at level 3, at least two must be self-study AND
		*	• at least one project module passed (either of project or client project).
		*
		* @param Student
		* @return true if the student is certified or false if the student is not certified
		* @author Prajwal Bhagath 18039504
		* */

		boolean isCertified(Student student)
		{
			System.out.println(student);// prints students name
			Result[] stu = student.getTranscript();//creates a student object
			
			int req1 = 0;		// counter for requirement one (must be at least than three to satisfy requirement)
			int req2 = 0;		// counter for requirement 2 (must be at least two to satisfy requirement)
			int req2type = 0;	//counter to check module type requirements is satisfied (must be at least one to satisfy requirement)
			int req3 = 0;		//Counter for requirement 3 (must be at least two or more to satisfy requirement)			
			int req3type =0;	//counter to check the module type is satisfied in requirement 3 (must be at least two to satisfy requirement)
			int req4 = 0;		//counter for requirement 4 (must be at least one to satisfy requirement)
			
			//for loop to go through each module and result
			for (int i = 0; i<student.no_Results;i++) 
			{
				System.out.println(stu[i].getModule().getCode()+"-"+ stu[i].getGrade());// prints the module code and the grade the student got
				
				//Algorithm for requirement one
				if (student.transcript[i].getModule().getLevel()==Level.ONE)//checks if the module is level one
				{
					if ((student.transcript[i].getModule().getType() ==(ModuleType.TAUGHT))||(student.transcript[i].getModule().getType() ==(ModuleType.SELF_STUDY)))//checks if it is taught or self studied
					{
						if(student.transcript[i].getGrade().isPass()==true)//checks if they passed the module 
						{
							req1++;
						}
					}
					
				}
				
				//Algorithm for requirement two
				if (student.transcript[i].getModule().getLevel()==Level.TWO)//checks if module is level two 
				{
					if(student.transcript[i].getGrade().isPass()==true) //checks if the level two module was passed or not
					{
						req2++;
						if(student.transcript[i].getModule().getType() ==(ModuleType.TAUGHT))//checks of they have satisfied all th
						{
							req2type++;
							
						}
					}
				}
				
				if (student.transcript[i].getModule().getLevel()==Level.THREE) //checks if module is level three
				{
					if (student.transcript[i].getGrade().isPass()==true) //checks if the student passed th emodule
					{
						req3++;
						if (student.transcript[i].getModule().getType() ==(ModuleType.SELF_STUDY)) //checks if any are self studied, the student needs a minimum of 2 to satisfy the requirements
						{
							req3type++;
						}
					}
				}
				
				if ((student.transcript[i].getModule().getType() == (ModuleType.PROJECT))||(student.transcript[i].getModule().getType() == (ModuleType.CLIENT_PROJECT)))//checks whether at least one of the modules are a project or a client project
				{
					req4++;
				}
			}
			
			// if statements to check if the student met the requirements, if they do then it returns true, if they do not meet the requirements the statement returns false 
			if ((req1 >= 3)&&(req2 >= 3)&&(req2type >= 1)&&(req3 >= 2)&&(req3type >= 2)&&(req4 >= 1)) 
			{
				return true;
			}
			else 
			{
				return false;
			}
			
		}
}
