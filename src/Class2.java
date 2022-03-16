public class Class2 extends Class1 {
    public void doSomething(int n){
        super.doSomething(n + 3);
        n *= 2;
        System.out.println(n);
    }

}
