CODING TASKS-


//Task 1-
public class Toy{
  String name;                             //variables
  int price;
  
  public Toy(String naam,int cost){        //constructor
    name=naam;
    price=cost;
    System.out.println("A new toy has been made!");
  }
  
  public void updatePrice(int noton_cost){   //price update korer method
    price=noton_cost;
  }
  
  public void updateName(String noton_naam){  //name update korer method
    System.out.println("Changing old name: "+name);
    name=noton_naam;
    System.out.println("new name: "+name);
  }
  
  public void showPrice(){                    //price show method
    System.out.println("price: " +price+ "Taka");
  }
  
}


//Task 2-
public class Student{
  int student_id;                   
  double cgpa=-1;
  String [] courses=new String[4];
  int count=0;
  
  public Student(int id){              //Constructor
    student_id=id;
    System.out.println("A student with id " +id+ " has been created");
  }
  
  public Student(int id,double cg){     //CG set korer method
    student_id=id;
    cgpa=cg;
    System.out.println("A student with id " +id+ " and cgpa " +cgpa+ " has been created");
  }
  
  public void storeCG(double cg){      
    cgpa=cg;
    System.out.println("Set CG first");
  }
  
  public void storeID(int id){
    student_id=id;
  }
  
  public void addCourse(String course){      //method to add course
    if(cgpa==-1){
      System.out.println("Failed to add "+course);   //checking eligability
      System.out.println("Set CG first");
      return;
    }
    if(cgpa<3.0 && count>=3){
      System.out.println("Failed to add "+course);
      System.out.println("CG is low.can't add more than 3 courses");
      return;
    }
    if(count>=4){
      System.out.println("Failed to add "+course);
      System.out.println("Maximum 4 courses allowed");
      return;
    }
    courses[count]=course;
    count++;
  }
  
  public void addCourse(String [] noton_course){
    for(String course:noton_course){
      addCourse(course);}
  }
  
  public void showAdvisee(){                     //showing student details method
    System.out.println("Student ID: " +student_id+ ", CGPA: " +cgpa);
    if(count==0){
      System.out.println("No courses added.");}
    else{
      System.out.println("Added courses are: ");
      for(int i=0;i<count;i++){
        System.out.print(courses[i]);
        if(i<count-1)
          System.out.print(" ");}
      System.out.println();}
  }
  
  public void removeAllCourse(){           //remove the courses
    courses=new String[4];
    count=0;
  }

}


//Task 3-
public class Triangle{
  int edge1,edge2,edge3;
  
  public Triangle(int a,int b,int c){       //constructor
    edge1=a;
    edge2=b;
    edge3=c;
  }
  
  public void triangleDetails(){           //showing trinangle details
    int per=edge1+edge2+edge3;
    System.out.println("Three sides of the triangle are: "+edge1+","+edge2+","+edge3);
    System.out.println("Perimeter: "+per);
  }
  
  public String printTriangleType(){       //determine triangle type
    if(edge1==edge2 && edge2==edge3){
      return "This is an Equilateral Triangle";}
    else if (edge1==edge2 || edge2==edge3 || edge1==edge3){
      return "This is an Isosceles Triangle";}
    else{
      return "This is an Scalene Triangle";}
  }
  
  public void compareTriangles(Triangle x){  //method to compare 2 triangle
    if(this==x){
      System.out.println("These two triangle objects have the same address.");}
    else if(this.edge1==x.edge1 && this.edge2==x.edge2 && this.edge3==x.edge3){
      System.out.println("Addresses are different but the sides of the triangles are equal.");}
    else if((edge1+edge2+edge3) == (x.edge1+x.edge2+x.edge3)){
      System.out.println("Only the perimeter of both triangles is equal.");}
    else{
      System.out.println("Addresses, length of the sides and perimeter all are different.");}
  }
  
}


//Task 4-
public class Player{
  String name;
  int age;
  int match;
  
  public Player(String n,int a,int m){   //constructor
    name=n;
    age=a;
    match=m;
  }
}
  
  public class Team{
    String team_name;
    Player [] players;
    int count;
    
    public Team(){           //constructor
      players=new Player[10];
      count=0;
    }
    
    public void updateName(String new_n){    //update the team name
      team_name=new_n;
    }
    
    public void addPlayer(Player x){     //player add method
      players[count]=x;
      count++;
    }
    
    public void printDetail(){           //team details printing method
      System.out.println("Team: "+team_name);
      System.out.println("List of players: ");
      for(int soro=0;soro<count;soro++){
        System.out.println("Name: "+players[soro].name+",Age:"+players[soro].age+",Total Matches: "+players[soro].match);}
    }
    
  }

  
  
  



