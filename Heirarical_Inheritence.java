class A{
 void input(){
    System.out.println("Enter your name");
 }
}
class B extends A{
    void Show(){
        System.out.println("My name is Rishi");
    }
 
}
class C extends A{
    void Disp(){
        System.out.println("My name is karan");
    }
}
public class Heirarical_Inheritence {
    public static void main(String[] args) {
        B r=new B();
        C r2=new C();
        r2.Disp();r.Show();
    }
}
