// Single Inheritance

class Parent 
{
    void data() 
    {
        System.out.println("Super class value is: 1000");
    }
}
class Child extends Parent 
{
    void info() 
    {
        System.out.println("Sub class value is: 2000");
    }
}
class SingleInheritance 
{
    public static void main(String args[]) 
    {
        Child subclass = new Child();
        subclass.data();
        subclass.info();
    }
}