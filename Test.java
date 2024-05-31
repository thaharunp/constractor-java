class Test{
    int a;                        // deflat constractor defened "0"
    static int b=200;
    /* Test()
       super();
       this.a=40; */

    public static void main(String []j){
        int c=300;
        Test t1=new Test();
        System.out.println(t1.a);
        System.out.println(b);
        System.out.println(c);
    }
}