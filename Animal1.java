public class Animal1 {
    void display(){
        System.out.println("eating");
    }
    
}
class Dog extends Animal1{
    void display1(){
        System.out.println("barking");
     }
}
class Test5 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.display();
        d2.display1(); 
    
    }

   }


