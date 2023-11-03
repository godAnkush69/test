abstract class a {
void disp(){
    System.out.println("class a");
}
}
class b extends a{
     void d(a obj){
        obj.disp();
     }
}
class c{
  public static void main(String[] args) {
        a obj1 =new b();
        new b().d(obj1);

    }
}