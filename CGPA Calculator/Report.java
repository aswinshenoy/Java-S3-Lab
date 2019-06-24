
public class Report {
  public static void main(String[] args) {
      Grades g = new Grades(7.9,2,22);
      g.addMark("math","F");
      g.addMark("cs-lab","O");
      g.addMark("chemistry","C");
      g.addMark("eee","C");
      g.addMark("cultural","A");	
      g.addMark("programming","A");
      g.addMark("cs-essential","A");	
      g.addMark("eee-lab","A");
      g.addMark("che-lab","B+");																													
      System.out.println("Current SGPA: " + g.getSGPA()); 
      System.out.println("Current CGPA: " + g.getCGPA());      	     
  }
}