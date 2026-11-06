CODING TASK-


//Task 1-
public class Product{
  private String title;            //private attributes
  private double cost;
  private int amount;
  
  public Product(){               //constructor
    title="unknown";
    cost=0.0;
    amount=0;
  }
  
  public Product(String naam, double daam){    //paremeter
    this.title=naam;
    this.cost=daam;
    this.amount=0;
  }
  
  public String getName(){
    return title;
  }
  
  public void setName(String name){
    this.title=name;
  }
  
  public double getPrice(){
    return cost;
  }
  
  public void setPrice(double price){
    this.cost=price;
  }
  
  public int getQuantity(){
    return amount;
  }
  
  public void setQuantity(int quantity){
    this.amount=quantity;
  }
  
  public void displayInfo(){            //product info display
    System.out.println("Product Name: "+title);
    System.out.println("Price: $"+cost);
  }
  
  public void displayInfo(boolean showQuantity){
    displayInfo();
    if(showQuantity){
      System.out.println("Quantity: "+amount);
    }
    
  }
}


//Task 2-
public class Employee{
  private String name;
  private int id;
  private String type;
  
  public Employee(){           //constructor
    System.out.println("A default employee has been created");
    name="Unknown";
    id=-1;
    type="Unknown";
  }
  
  public Employee(String title,int id, String set){    //parameter
    name=title;
    this.id=id;
    type=set;
  }
  
  public String getName(){
    return name;}
  public int getId(){
    return id;}
  public String getType(){
    return type;}
  
}

public class Company{
  private String name;
  private Employee [] employ;
  private int count;
  
  public Company(){
    name="ABC Company";
    employ=new Employee[3];
    count=0;
  }
  
  public void addEmployee(Employee x){
    System.out.println(x.getName()+" has joined the company");
    if(count<3){
      employ[count]=x;
      count++;}
    else{
      System.out.println("No more vacancy");}
  }
  
  public void removeEmployee(Employee y){
    for(int i=0;i<count;i++){
      if(employ[i]==y){
        System.out.println(y.getName()+" has left the company");
        for(int j=i;j<count-1;j++){
          employ[j]=employ[j+1];
        }
        employ[count-1]=null;
        count--;
        break;}
    }
  }
  
  public void details(){
    System.out.println("Company Name: "+name);
    System.out.println("Total Employee: "+count);
    System.out.println("Fulltime Employees: ");
    for(int i=0;i<count;i++){
      if(employ[i].getType().equals("Fulltime")){
        System.out.println("Name: "+employ[i].getName()+", ID: "+employ[i].getId());}
    }
    System.out.println("Part-Time Employees:");
    for(int i=0;i<count;i++){
      if(employ[i].getType().equals("Part-time")){
        System.out.println("Name: "+employ[i].getName()+", ID: "+employ[i].getId());}
    }
  }
  
}


//Task 3-
public class Student{
  public String title;
  private int id;
  public double cgpa;
  
  public Student(){
    title="Unknown";
    id=0;
    cgpa=0.0;
  }
  
  public Student(String name,int id, double cg){
    title=name;
    this.id=id;
    cgpa=cg;
  }
  
  public void setId(int id){
    this.id=id;}
  public String getName(){
    return title;}
  public int getId(){
    return id;}
  public double getCgpa(){
    return cgpa;}
  
}

public class Department{
  public String name;
  public Student [] reader;
  public int count;
  
  public Department(String title){
    name=title;
    this.reader=new Student[5];
    count=0;
  }
  
  public void addStudent(Student... students){
    for(Student x:students){
      boolean ext=false;
    for (int i=0;i<count;i++){
      if(reader[i].getId() == x.getId()){
        System.out.println("Student with the same ID already exists, Please try with another ID");
        ext=true;
        return;}
    }
    if(!ext){
    if(count<reader.length){
      reader[count]=x;
      count++;
      System.out.println("welcome to "+ name +" departmemnt, "+ x.getName());}
    else{
      System.out.println("NO more students can be added.");}
    }}
  }
  
  public void findStudent(int a){
    boolean found=false;
    for(int i=0;i<count;i++){
      if(reader[i].getId()==a){
        System.out.println("Student info: ");
        System.out.println("Student Name: "+reader[i].getName());
        System.out.println("ID: "+reader[i].getId());
        System.out.println("CGPA: "+reader[i].getCgpa());
        found=true;
        break;}
    }
    if(!found){
      System.out.println("Student with the same ID already exists, Please try with another ID");}
  }
  
  public void details(){
    System.out.println("Department Name: "+name);
    System.out.println("Number of student: "+count);
    System.out.println("Details of the students: ");
    for(int i=0;i<count;i++){
      System.out.println("Student Name: "+reader[i].getName() + ", ID: "+reader[i].getId() + ", cgpa: "+reader[i].getCgpa());}
    }
  
}


//Task 4-
public class Cargo{
  private String name;
  private int weight;
  
  public Cargo(String title,int load){
    name=title;
    weight=load;
  }
  
  public String getName(){
    return name;}
  public int getWeight(){
    return weight;}
  
}

public class Spaceship{
  String name;
  int capacity;
  Cargo [] load;
  int count;
  int weight;
  
  public Spaceship(String title,int x){
    name=title;
    capacity=x;
    load=new Cargo[100];
    count=0;
    weight=0;
  }
  
  public void loadCargo(Cargo y){
    if(count>=load.length){
      System.out.println("Warning:Unable to laod "+ y.getName() +".Exceeds maximum cargo items.");
      return;}
    if (weight+y.getWeight()<=capacity){
      load[count]=y;
      count++;
      weight+=y.getWeight();}
    else{
      System.out.println("Warning:Unable to laod "+ y.getName() + " inside "+name+".Exceeds capacity by " + (weight+y.getWeight()-capacity));}
    }
    
    public void displayDetails(){
       System.out.println("Spaceship Name: "+name);
       System.out.println("Capacity: "+capacity);
       System.out.println("Current Cargo Weight: "+weight);
       System.out.println("Cargo: ");
      for(int i=0;i<count;i++){
        System.out.println((i==0?" ":" ") + load[i].getName());
      }
    }
    
 }




