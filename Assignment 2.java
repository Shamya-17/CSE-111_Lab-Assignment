CODING TASKS-



//Task 1-
public class CSECourse{
  String courseName="Programming Language II";
  String courseCode="CSE 111";
  int credit=3;
}


//Task 2-
public class ImaginaryNumber{                 //value assign
  int realPart=0;
  int imaginaryPart=0;

public String printNumber(){                  //number print korer method
  if(realPart==0 && imaginaryPart==0){
    return"0 + 0i";
  }                                           //return value
  return realPart+" + "+imaginaryPart+"i";
}
}


//Task 3-
public class Assignment{
  int tasks=0;                                            //value assign
  String difficulty=null;
  boolean submission=false;
  
public String makeOptional(){                             //submission method 
  if(submission){
    submission=false;
    return "Assignment will not require submission";}
  else{
    return "Submission is already not required";
  }
}
  public void printDetails(){                            //output print method
    System.out.println("Number of tasks: "+tasks);
    System.out.println("Difficulty level: "+difficulty);
    System.out.println("Submission required: "+submission);
  }
  }


//Task 4-
public class Employee{                            //constructor class
  String naam="";
  double beton=0;                       
  String upadhi="";
public void newEmployee(String ojana){            //New employee create korte method
  naam=ojana;
  beton=30000;
  upadhi="junior";}                               //Tax calculate korer jonno method

public void calculateTax(){
  if(beton>50000){
    double tax=beton*0.30;
    System.out.println(naam+ " Tax amount: "+tax);
  }
  else if(beton>30000){
    double tax=beton*0.10;
    System.out.println(naam+ " Tax amount: "+tax);
  }
  else{
    System.out.println("No need");}
}
                                                   //Employee promotion er method
public void promoteEmployee(String eq){
  if(eq.equals("senior")) {
    beton+=25000;
    upadhi="senior";}
  else if(eq.equals("lead")) {
    beton+=50000;
    upadhi="lead";}
  else {
    beton+=75000;
    upadhi="manager";}
  System.out.println(naam+" has promoted to "+ upadhi);
  System.out.println("New beton: "+ beton);
}
                                                  // Employee info er display method
public void displayInfo(){
  System.out.println(naam);
  System.out.println(beton);
  System.out.println(upadhi);
}
}
    



