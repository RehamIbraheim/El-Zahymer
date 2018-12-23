
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
    public class UserFunction {

    
   public static ArrayList<User> mylist = new ArrayList<User>();
    
    public static void register() {
        Scanner in = new Scanner(System.in);
        User p = new User();
        System.out.print("Name: ");
        p.UserName = in.nextLine();
        System.out.print("Password: ");
        p.Password = in.nextLine();
        System.out.print("PhoneNum: ");
        p.PhoneNum = in.nextInt();
        mylist.add(p);
        }
 	public static boolean login() {
       // mylist = null;
        Scanner in = new Scanner(System.in);
        User p = new User();
        System.out.print("Name: ");
        p.UserName = in.nextLine();
        System.out.print("Password: ");
        p.Password = in.nextLine();
        boolean check = SearchUser(p);
        if(check==true)
        {
        System.out.println("this user login ");
        }
        else
        {
            System.out.println("user name or pass wrong Or you need to Register ");
        }
        return check;
        
        }
    public static boolean SearchUser(User user)
    {
        for(int i=0;i<mylist.size();i++)
        {
            User checkU = mylist.get(i);
            if(user.UserName.equals(checkU.UserName)&&user.Password.equals(checkU.Password))
            {
                return true ;
            }
        }
        return false ;
    }

    
    public static void Print(){
        for(int i=0; i<mylist.size(); i++){
            User user=mylist.get(i);
            System.out.println("Name: "+user.UserName + "  Password: " +user.Password+ "  PhoneNum: "+ user.PhoneNum);
        }
    
    
    }
}





    
  