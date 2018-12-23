/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.project;

import java.util.ArrayList;
import java.util.Scanner;
import static sw.project.UserFunction.mylist;

/**
 *
 * @author Saad
 */
public class MissingFunction {
     public static ArrayList<MissingIssue> mylist = new ArrayList<MissingIssue>();
    
    public static void Upload() {
        Scanner in = new Scanner(System.in);
        MissingIssue p = new MissingIssue();
        System.out.print("Name: ");
        p.Name = in.nextLine();
        System.out.print("Description: ");
        p.Description = in.nextLine();
        System.out.print("ID: ");
        p.ID = in.nextInt();
        mylist.add(p);
        }
    
}
