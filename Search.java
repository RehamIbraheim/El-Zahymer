public static void Search() {

        Scanner in = new Scanner(System.in);

        MissingIssue p = new MissingIssue();

        System.out.print("Name: ");

        p.Name = in.nextLine();

        System.out.print("ID: ");

        p.ID = in.nextLine();

        boolean check = SearchMissingIssue(p);

        if(check==true)

        {

	    System.out.println("This Item is Found ");

        }
        
	else
        
	{

            System.out.println("user name or pass wrong ");

        }

        
        }


	    public static boolean SearchMissingIssue(MissingIssue user)

    {

        for(int i=0;i<mylist.size();i++)

        {
            MissingIssue checkU = mylist.get(i);
            if(user.Name.equals(checkU.Name)||user.ID.equals(checkU.ID))
            {
                View(checkU);
                return true ;
            }
        }
        return false ;
    }

    public static void View(MissingIssue m){
         System.out.println("Name: "+m.Name + "  Description: " +m.Description+ "  ID: "+ m.ID);
        }