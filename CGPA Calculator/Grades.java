public class Grades {

	private double SGPA;
	public double CGPA;

	private int totalMarks;
	private int semNo;
	private int totalCredits;

	// Default Constructor
	public Grades(){
		this.CGPA = 0;
		this.SGPA = 0;
		this.semNo = 0;
		this.totalCredits = 21;
	}

	//Parameterized Constructor
	public Grades(double CGPA, int semNo, int credit){
		this.CGPA = CGPA;
		this.SGPA = 0;
		this.semNo = semNo;
		this.totalCredits = credit;
	}

	private double getMarkfromGrade(String grade)
	{
		switch(grade)
		{
			case "O":
				return 10;
			case "A+":
				return 9.5;
			case "A":
				return 9;
			case "B+":
				return 8.5;
			case "B":
				return 8;
			case "C+":
				return 7.5;
			case "C":
				return 7;
			case "P":
				return 6;
			default:
				return 0;
		}
	}

	private int getCredit(String subject)
	{
		int credit;
		switch(subject)
		{
			case "math":
			case "eee":
				credit = 4;
				break;
			case "chemistry":
			case "programming":
			case "cs-essentials":
				credit = 3;
				break;
			case "cultural":
				credit = 2;
				break;
			case "cs-lab":
			case "che-lab":	
			case "eee-lab":
				credit = 1;
				break;
			default:
				credit = 0;
		}
		return credit;
	}

	private void calcSGPA()
	{
		this.SGPA = this.totalMarks/this.totalCredits;
	}

	private void calcCGPA()
	{
		this.CGPA = (this.CGPA + this.SGPA)/this.semNo;
	}

	public void addMark(String subject, String grade)
	{
		this.totalMarks += this.getCredit(subject) * this.getMarkfromGrade(grade);
	}

	public double getSGPA()
	{
		this.calcSGPA();
		return this.SGPA;
	}

	public double getCGPA()
	{
		this.calcCGPA();
		return this.CGPA;
	}
}
