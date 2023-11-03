import java.util.Scanner;
class a{
    public static void main(String str[]){
      
        try{
              Scanner sc = new Scanner(System.in);
        String st= sc.nextLine();
        // int x =st;
            System.out.println("Your string is : "+ st);

        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        } 

    }
}