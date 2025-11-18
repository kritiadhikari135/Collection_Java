package lambdaexpression;

class NoParameter {
    static void fun(Test1 t){
        t.print();
    }
    public static void main(String[] args){
        fun(() -> System.out.println("Hello"));
    }
}
