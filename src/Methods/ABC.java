package Methods;

class ABC {
    static void fnA(){
        fnB();
    }

    static void fnB(){
        fnC();
    }

    static void fnC(){

    }

    public static void main(String[] args) {
        fnA();
    }
}