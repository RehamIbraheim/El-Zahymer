
package sw.project;

import java.util.ArrayList;
import java.util.Scanner;


public class SWProject {


    public static void main(String[] args) {
    //UserFunction fun=  new UserFunction();
    //MissingFunction func=  new MissingFunction();
    Scanner in = new Scanner(System.in);
    String input= "";
    boolean check= false;
    while(true){
        System.out.println("To Register press 1: ");
        System.out.println("To Login press  2 : ");
        System.out.println("To Upload press 3 : ");
        System.out.println("To Search press 4 : ");
        System.out.println("To LogOut press 5 : ");


        input= in.nextLine();
        if(input.equals("1")){
            String exit="";
            while(true){
                UserFunction.register();
                System.out.print("To Continue press any key Or e To Exit : ");
                exit= in.nextLine();
                if(exit.equals("e")){
                    break;
                }
            }
        }
      //  fun.View();
        if(input.equals("2")){
            check = UserFunction.login();

                }
        
        if(input.equals("3")){
            if(check==true){
                MissingFunction.Upload();
            }
            else
            {
                System.out.print("You Must login First : ");
 
            }
                }
        if(input.equals("4")){
            if(check==true){
            MissingFunction.Search();
            }
            else
            {
                System.out.print("You Must login First : ");
 
            }
            } 
        if(input.equals("5")){
            return;
        }

    }
    }
}
    

    

