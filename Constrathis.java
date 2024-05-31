public class Constrathis{
    int eid;
    String ename;
    public Constrathis(int id,String name){
        this.eid=id;
        this.ename=name;
    }
    public static void main(String args[]){
        Constrathis t=new Constrathis();
        System.out.println(t.eid+t.ename);
    }
}