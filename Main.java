
class persons{
   String name = "swag";
 int age= 32;
   String email = "swag@gmail.com";
  
  public void displaypersons(){
    System.out.println("display");
  }
    public persons(){
      System.out.println("employee details");
    }
}
class employees extends persons{
  
}
class Main {
  public static void main(String[] args) {
    employees emp = new employees();
    emp.displaypersons();
    System.out.println("employee name is : " + emp.name);
    System.out.println("employee age is : " + emp.age);
      System.out.println("employee email is : " + emp.email);
    
  }
}