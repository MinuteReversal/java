package Methods;

interface FN1 {
    void doSomthing();
}
interface FN2 {
    void doSomthing(int x);
}
interface FN3 {
    int doSomthing();
}
interface FN4 {
    int doSomthing(int x);
}



class DelegateDemo {
  public static void main(String[] args) {
    FN1 fn1 = ()-> System.out.println("fn1");
	FN2 fn2 = (int x)->System.out.println("fn" + x);
    FN3 fn3 = () -> {
        System.out.println("fn3");
        return 3;
    };
    FN4 fn4 = (int x) -> {
        System.out.println("fn"+x);
        return x;
    };

    fn1.doSomthing();
    fn2.doSomthing(2);
    int r3=fn3.doSomthing();
    int r4=fn4.doSomthing(4);
    System.out.println(r3);
    System.out.println(r4);
  }
}