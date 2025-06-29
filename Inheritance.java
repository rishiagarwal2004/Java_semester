class A{
    int c;
    int a=8;int b=2;
    void add(){
        //a=8;b=7;
        c=a+b;
        System.out.println("Addition " +c);
    }
    void Sub(){
        c=a-b;
        System.out.println("Substraction " +c);
    }
}
class B extends A{
    void mul(){
        c=a*b;
        System.out.println("Multiplition " +c);}
    void division(){
        c=a/b;
        System.out.println("Division " +c);
    } 
}
class C extends B{
    void mol(){
        c=a%b;
        System.out.println("Remainder " +c);}
}
public class Inheritance {
   public static void main(String[] args){
      C r=new C();
      r.add(); r.Sub();r.mul();r.division();r.mol();  
    }
}
