CODING TASK-


//Task 1-
public class Circle extends Shape {
    public double radius;
    
    public void area(){
      double area=Math.PI*radius*radius;
      System.out.printf("Area of %s Circle: %.2f\n", color, area);
    }
}


//Task 2-
public class Vehicle2010 extends Vehicle{
  
  public void moveLowerLeft(){
    x=x-1;
    y=y-1;
  }
  
   public void moveLowerRight(){
    x=x+1;
    y=y-1;
  }
       
   public void moveUpperRight(){
    x=x+1;
    y=y+1;
  } 
   
}


//Task 3-
public class BBAStudent extends Student{
  
  public BBAStudent(){
    setName("Default");
    setDepartment("BBA");
  }
  
  public BBAStudent(String name){
     setName(name);
    setDepartment("BBA");
  }
  
}


//Task 4-
public class Dog extends Animal{
  
  public String breed;
  public Dog(String name, int age, String color, String breed){
    super(name, age, color);
    this.breed=breed;
  }
  
  public void makeSound(){
    System.out.println(color + " color " + name + " is barking");;
  }
  
  public String info(){
    return super.info()+ "Breed: " +breed;
  }
  
}

public class Cat extends Animal{
    
  public String breed;
  public Cat(String name, int age, String color, String breed){
    super(name, age, color);
    this.breed=breed;
  }
  
  public void makeSound(){
    System.out.println(color + " color " + name + " is meowing");
  }
  
    public String info(){
    return super.info()+ "Breed: " +breed;
  }
  
}


//Task 5-
public class Cricket_Tournament extends Tournament{
  private int numberofTeams;
  private String type;
  
  public Cricket_Tournament(){
    super();
    numberofTeams=0;
    type="No type";
  }
  
  public Cricket_Tournament(String name, int numberofTeams, String type){
    super(name);
    this.numberofTeams=numberofTeams;
    this.type=type;
  }
  
  public String toString(){
    return"Cricket Tournament Name: "+ getName()+ "\nNumber of Teams: "+ numberofTeams+ "\nType: "+ type;
  }
}
 
public class Tennis_Tournament extends Tournament{
  private int numberofPlayers;
  
  public Tennis_Tournament(String name, int numberofPlayers){
    super(name);
    this.numberofPlayers=numberofPlayers;
  }
  
  public String toString(){
    return"Tennis Tournament Name: "+ getName()+ "\nNumber of Players: "+ numberofPlayers;
  }
}


