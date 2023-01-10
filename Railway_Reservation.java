package X;

import java.util.*;
public class Railway_Reservation
{
    Scanner obj=new Scanner(System.in);
    String trainDel[]={"Geetanjali Express", "Falaknama         ", "Janmabhoomi       ", "Duranto           ", "Rajdhani Express  "};
    String trainKol[]={"Geetanjali Express", "Falaknama         ", "Janmabhoomi       ", "Duranto           ", "Rajdhani Express  "};
    String trainLuck[]={"Geetanjali Express", "Falaknama         ", "Janmabhoomi       ", "Duranto           ", "Rajdhani Express  "};
    String trainChe[]={"Geetanjali Express", "Falaknama         ", "Janmabhoomi       ", "Duranto           ", "Rajdhani Express  "};
    String trainHyd[]={"Geetanjali Express", "Falaknama         ", "Janmabhoomi       ", "Duranto           ", "Rajdhani Express  "};
    String deptimeDel[]={"0645 hours", "1005 hours", "1420 hours", "1730 hours", "2200 hours"};
    String deptimeKol[]={"0715 hours", "1110 hours", "1630 hours", "1850 hours", "2315 hours"};
    String deptimeLuck[]={"0545 hours", "0915 hours", "1515 hours", "1930 hours", "2230 hours"};
    String deptimeChe[]={"0445 hours", "0808 hours", "1120 hours", "1635 hours", "2115 hours"};
    String deptimeHyd[]={"0850 hours", "1045 hours", "1320 hours", "1545 hours", "2010 hours"};
    String trainNoDel[]={"200193"};
    String trainNoKol[]={"200194"};
    String trainNoLuck[]={"200195"};
    String trainNoChe[]={"200196"};
    String trainNoHyd[]={"200197"};
    String s="";String s1=""; int trainchoice=0;
    String passAC[]=new String[100];
    String passSleep[]=new String[100];
    String passGen[]=new String[100]; 

    String phoneNoAC[]=new String[100];
    String phoneNoSleep[]=new String[100];
    String phoneNoGen[]=new String[100];

    int ageArrAC[]=new int[100];
    int ageArrSleep[]=new int[100];
    int ageArrGen[]=new int[100];

    char genderAC[]=new char[100];
    char genderSleeper[]=new char[100];
    char genderGen[]=new char[100];
    
    int PNRAC[]=new int[100];
    int PNRSleep[]=new int[100];
    int PNRgen[]=new int[100];
    
    int pnr=890005;

    int a=7; int b=7; int c=7;

    int x; 
    int ch=0;

    int seatCount=100;
    int ticnum;  int age=0; 

    int resc;
    String desS="";

    int exitc;
    int classChoice;
    String destination;
    int sum=0;

    public void billSummary()
    {
        if(classChoice==1)
        {
            System.out.println("\n\nBOOKING SUMMARY");            
            for(int i=(a-ticnum);i<a;i++)
            {                
                System.out.println("Name of Passenger:"+passAC[i].toUpperCase());
                System.out.println("Age:"+ageArrAC[i]);
                System.out.println("Phone Number:"+phoneNoAC[i]);
                if(genderAC[i]=='f'||genderAC[i]=='F')
                {
                    System.out.println("Gender:Female");
                }
                else
                {
                    System.out.println("Gender:Male");
                }
                System.out.println("\nPlace of Departure: Mumbai");
                System.out.println("Destination: "+destination+"\n");

                if(ageArrAC[i]>10||ageArrAC[i]<65)
                {
                    System.out.println("Standard Rate for First Class AC applied");
                    System.out.println("Ticket Amount: Rs.2000");
                    sum=sum+2000;
                }
                if(ageArrAC[i]<10)
                {
                    System.out.println("You have been given a discount of 20% on account of being a Little Traveller");
                    System.out.println("Discount: Rs.400");
                    System.out.println("Ticket Amount: Rs.1600");
                    sum=sum+1600;
                }
                if(ageArrAC[i]>65)
                {
                    System.out.println("You have been given a Senior Citizen discount of 20% ");
                    System.out.println("Discount: Rs.400");
                    System.out.println("Ticket Amount: Rs.1600");
                    sum=sum+1600;
                }
                System.out.println("YOUR PNR NUMBER IS :"+PNRAC[i]);
                System.out.println("*****************************************");
                System.out.println();                 
            }
            System.out.println("\nTotal Bill Amount= Rs."+sum);
            System.out.println("For any queries call Toll-free number 1800-2333-1000");
            System.out.println("THANK YOU!\n");
        }

        if(classChoice==2)
        {
            System.out.println("\n\nBOOKING SUMMARY\n");

            for(int i=(b-ticnum);i<b;i++)
            {
                System.out.println("Name of Passenger:"+passSleep[i].toUpperCase());
                System.out.println("Age:"+ageArrSleep[i]);
                System.out.println("Phone Number:"+phoneNoSleep[i]);
                if(genderSleeper[i]=='f'||genderSleeper[i]=='F')
                {
                    System.out.println("Gender:Female");
                }
                else
                {
                    System.out.println("Gender:Male");
                }             

                System.out.println("\nPlace of Departure: Mumbai");
                System.out.println("Destination: "+destination+"\n");

                if(ageArrSleep[i]>10||ageArrSleep[i]<65)
                {
                    System.out.println("Standard Rate for Sleeper Class applied");
                    System.out.println("Ticket Amount: Rs.1800");
                    sum=sum+1800;
                }
                if(ageArrSleep[i]<10)
                {
                    System.out.println("You have been given a discount of 20% on account of being a Little Traveller");
                    System.out.println("Discount: Rs.360");
                    System.out.println("Ticket Amount: Rs.1440");
                    sum=sum+1440;
                }
                if(ageArrSleep[i]>65)
                {
                    System.out.println("You have been given a Senior Citizen discount of 20% ");
                    System.out.println("Discount: Rs.360");
                    System.out.println("Ticket Amount: Rs.1440");
                    sum=sum+1440;
                }
                System.out.println("YOUR PNR NUMBER:"+PNRSleep[i]);
                System.out.println("*****************************************");
                System.out.println();  
            }
            System.out.println("TOTAL BILL AMOUNT= Rs."+sum);
            System.out.println("For any queries call Toll-free number 1800-2333-1000");
            System.out.println("THANK YOU!\n");
        }

        if(classChoice==3)
        {
            System.out.println("\n\nBOOKING SUMMARY");

            for(int i=(c-ticnum);i<c;i++)
            {
                System.out.println("Name of Passenger:"+passGen[i].toUpperCase());
                System.out.println("Age:"+ageArrGen[i]);
                System.out.println("Phone Number:"+phoneNoGen[i]);
                if(genderGen[i]=='f'||genderGen[i]=='F')
                {
                    System.out.println("Gender:Female");
                }
                else
                {
                    System.out.println("Gender:Male");
                }

                System.out.println("\nPlace of Departure: Mumbai");
                System.out.println("Destination: "+destination+"\n");

                if(ageArrGen[i]>10||ageArrGen[i]<65)
                {
                    System.out.println("Standard Rate for General Class applied");
                    System.out.println("Ticket Amount: Rs.1500");
                    sum=sum+1500;
                }
                if(ageArrGen[i]<10)
                {
                    System.out.println("You have been given a discount of 20% on account of being a Little Traveller");
                    System.out.println("Discount: Rs.300");
                    System.out.println("Ticket Amount: Rs.1200");
                    sum=sum+1200;
                }
                if(ageArrGen[i]>65)
                {
                    System.out.println("You have been given a Senior Citizen discount of 20% ");
                    System.out.println("Discount: Rs.300");
                    System.out.println("Ticket Amount: Rs.1200");
                    sum=sum+1200;
                }
                System.out.println("YOUR PNR NUMBER:"+PNRgen[i]);
                System.out.println("*****************************************");
                System.out.println();         
            }
            System.out.println("\nTotal Bill Amount= Rs."+sum);
            System.out.println("For any queries call Toll-free number 1800-2333-1000");
            System.out.println("THANK YOU!\n");            
        }
    }

    public void chooseExit()
    {
        System.out.println("\n\nDo you wish to Exit?\n1.Yes, I want to exit\n2.No, I want to continue");
        do
        {
            try
            {
                System.out.println("Please select one of the options to proceed: ");
                exitc=obj.nextInt();
                obj.nextLine();
            }

            catch( Exception e)
            {
                obj.nextLine();
                System.out.println("Invalid input");
                continue;
            }
            if(exitc<=0||exitc>2)
            {
                obj.nextLine();
                System.out.println("Sorry! No such option");
                continue;
            }                
            break;
        } while(true);
        if(exitc==1)
        {
            exit();             
        }
        else
        {
            options(); 
        }
    }

    boolean checkGender(char x)
    {
        boolean k=true; 
        if(Character.isDigit(x)==true)
        {
            k=false;
        }
        else
        {

            if(x=='M'||x=='F'||x=='f'||x=='m')
            {
            }
            else
            {
                k=false;
            }
        }        
        return k;
    }

    boolean checkString(String x)
    {
        boolean k=true; char ch;
        if(x.length()==0)
        {
            k=false;
        }
        else
        {
            for(int i=0; i<x.length();i++)
            {
                ch=x.charAt(i);
                if(Character.isLetter(ch)==true||ch==' ')
                {
                }
                else
                {
                    k=false;
                }
            }
        }
        return k;
    }

    boolean checkPhone(String x)
    {
        boolean k=true; char ch;
        if(x.length()==0)
        {
            k=false;
        }
        else
        {
            for(int i=0; i<x.length();i++)
            {
                ch=x.charAt(i);
                if(Character.isDigit(ch)==true&& x.length()==10)
                {                    
                }
                else
                {
                    k=false;
                }
            }
        }
        return k;
    }

    public void reservation()
    {
        System.out.println();
        System.out.println("Place of Departure: MUMBAI");
        System.out.println("Destinations available are:\nDelhi\nKolkata\nLucknow\nChennai\nHyderabad");
        do
        {
            do
            {
                System.out.print("Please enter your Destination: ");
                s1=obj.nextLine();            
                s=s1.toLowerCase();
                for(int i=0;i<s.length();i++)
                {
                    if((s.charAt(i)>='a'&& s.charAt(i)<='z')||s.charAt(i)==' ')
                    {
                        break;
                    }
                    else
                    {
                        continue;                
                    } 
                }
                break;
            }while(true);

            if(s.equals("delhi")==true)
            { System.out.println("Available trains from Mumbai to Delhi are: ");
                for(int i=0; i<5; i++)
                {  System.out.print(i+1+".  "); 
                    System.out.print(trainDel[i]); 
                    System.out.print("\t\t");
                    System.out.println(deptimeDel[i]);
                    destination="Delhi";
                }
                break;
            }
            else if(s.equals("kolkata")==true)
            { System.out.println("Available trains from Mumbai to Kolkata are: ");
                for(int i=0; i<5; i++)
                {  System.out.print(i+1+".  "); 
                    System.out.print(trainKol[i]); 
                    System.out.print("\t\t");
                    System.out.println(deptimeKol[i]);
                    destination="Kolkata";
                }
                break;
            }
            else if(s.equals("chennai")==true)
            { System.out.println("Available trains from Mumbai to Chennai are: ");
                for(int i=0; i<5; i++)
                {  System.out.print(i+1+".  "); 
                    System.out.print(trainChe[i]); 
                    System.out.print("\t\t");
                    System.out.println(deptimeChe[i]);
                    destination="Chennai";
                }
                break;
            }
            else if(s.equals("lucknow")==true)
            { System.out.println("Available trains from Mumbai to Lucknow are: ");
                for(int i=0; i<5; i++)
                {  System.out.print(i+1+".  "); 
                    System.out.print(trainLuck[i]); 
                    System.out.print("\t\t");
                    System.out.println(deptimeLuck[i]);
                    destination="Lucknow";
                }
                break;
            }
            else if(s.equals("hyderabad")==true)
            { System.out.println("Available trains from Mumbai to Hyderabad are: ");
                for(int i=0; i<5; i++)
                {  System.out.print(i+1+".  "); 
                    System.out.print(trainHyd[i]); 
                    System.out.print("\t\t");
                    System.out.println(deptimeHyd[i]);
                    destination="Hyderabad";
                }
                break;
            }
            else
            {
                System.out.println("Sorry! No trains are available for your destination");    
                continue;
            }
        } while(true);

        do
        {
            try
            {
                System.out.println("Enter your choice of train: ");
                trainchoice=obj.nextInt();
                obj.nextLine();
            }
            catch(InputMismatchException e)
            {
                obj.nextLine();
                System.out.println("Please enter a valid Integer no.");
                continue;
            }
            catch(Exception e)
            {
                obj.nextLine();
                System.out.println("Invalid input");
                continue;
            }
            if(trainchoice<=0)
            {
                obj.nextLine();
                System.out.println("Invalid input");
                continue;
            }
            if(trainchoice>5)
            {
                System.out.println("Please enter a valid train no. ");
                continue;
            }
            break;
        }while(true);

        switch(trainchoice)
        {

            case 1:
            {
                geetanjali();
            }                                 
            break;
            case 2:
            {
                falaknama();
            }
            break;
            case 3:
            {
                janmabhoomi();
            }
            break;
            case 4:
            {
                duranto();
            }
            break;
            case 5:
            {
                rajdhani();
            }
            break;
            default:
            {
                System.out.println("Invalid Choice");
            }
            break;

        } //END OF NESTED SWITCH

    } 
    int temppnr=++pnr;
    public void geetanjali()
    {
        
            System.out.println("You have choosen to travel in the Geetanjali Express");
            do
            {
                try
                {
                    System.out.println("Please enter your preference of class:\n1.A/C\n2.Sleeper\n3.General");
                    ch=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ch<=0 || ch>3)
                {
                    System.out.println("Invalid input");
                    continue;
                }

                break;
            } while(true);
            do
            {
                if (ch==1)
                {
                    classChoice=1;
                }
                else if (ch==2)
                {
                    classChoice=2;
                }
                else if (ch==3)
                {
                    classChoice=3;
                }
                else
                {
                    System.out.println("Invalid choice"); continue;
                }
                break;
            } while(true);

            System.out.println("Number of seats Available is: "+seatCount);
            do
            {
                try
                {
                    System.out.println("Enter number of tickets to be booked: ");
                    ticnum=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ticnum>6)
                {
                    System.out.println("Sorry! You can only book 6 tickets at one go");
                    continue;
                }
                break;
            } while(true);

            for(int i=1; i<=ticnum; i++)
            {
                while(true)
                {
                    if(ch==1)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passAC[a]=obj.nextLine();
                        if(checkString(passAC[a]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrAC[a]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrAC[a]<=0||ageArrAC[a]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoAC[a]=obj.nextLine();                                
                                if(checkPhone(phoneNoAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderAC[a]=obj.nextLine().charAt(0);
                                if(checkGender(genderAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRAC[a]=temppnr;
                            a++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==2)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passSleep[b]=obj.nextLine();                                   
                        if(checkString(passSleep[b]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrSleep[b]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrSleep[b]<=0||ageArrSleep[b]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoSleep[b]=obj.nextLine();
                                if(checkPhone(phoneNoSleep[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderSleeper[b]=obj.nextLine().charAt(0);
                                if(checkGender(genderSleeper[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRSleep[b]=temppnr;
                            b++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==3)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passGen[c]=obj.nextLine();
                        if(checkString(passGen[c]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrGen[c]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {                                            
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }

                            if(ageArrGen[c]<=0||ageArrGen[c]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoGen[c]=obj.nextLine();
                                if(checkPhone (phoneNoGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderGen[c]=obj.nextLine().charAt(0);
                                if(checkGender(genderGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRgen[c]=temppnr;
                            c++;
                            System.out.println();
                            break;
                        } while(true);
                    }
                    break;
                }
                seatCount--;
                System.out.println("SEAT COUNT :"+seatCount);
            }

        }
        
        public void falaknama()
    {
        
            System.out.println("You have choosen to travel in the Falaknama Express");
            do
            {
                try
                {
                    System.out.println("Please enter your preference of class:\n1.A/C\n2.Sleeper\n3.General");
                    ch=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ch<=0 || ch>3)
                {
                    System.out.println("Invalid input");
                    continue;
                }
                break;
            } while(true);
            do
            {
                if (ch==1)
                {
                    classChoice=1;
                }
                else if (ch==2)
                {
                    classChoice=2;
                }
                else if (ch==3)
                {
                    classChoice=3;
                }
                else
                {
                    System.out.println("Invalid choice"); continue;
                }
                break;
            } while(true);
            System.out.println("Number of seats Available is: "+seatCount);
            do
            {
                try
                {
                    System.out.println("Enter number of tickets to be booked: ");
                    ticnum=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ticnum>6)
                {
                    System.out.println("Sorry! You can only book 6 tickets at one go");
                    continue;
                }
                break;
            } while(true);

            for(int i=1; i<=ticnum; i++)
            {
                while(true)
                {
                    if(ch==1)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passAC[a]=obj.nextLine();
                        if(checkString(passAC[a]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrAC[a]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrAC[a]<=0||ageArrAC[a]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoAC[a]=obj.nextLine();                                
                                if(checkPhone(phoneNoAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderAC[a]=obj.nextLine().charAt(0);
                                if(checkGender(genderAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRAC[a]=temppnr;
                            a++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==2)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passSleep[b]=obj.nextLine();                                   
                        if(checkString(passSleep[b]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrSleep[b]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrSleep[b]<=0||ageArrSleep[b]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoSleep[b]=obj.nextLine();
                                if(checkPhone(phoneNoSleep[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderSleeper[b]=obj.nextLine().charAt(0);
                                if(checkGender(genderSleeper[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRSleep[b]=temppnr;
                            b++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==3)
                    {
                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passGen[c]=obj.nextLine();
                        if(checkString(passGen[c]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrGen[c]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {                                            
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }

                            if(ageArrGen[c]<=0||ageArrGen[c]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoGen[c]=obj.nextLine();
                                if(checkPhone (phoneNoGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderGen[c]=obj.nextLine().charAt(0);
                                if(checkGender(genderGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRgen[c]=temppnr;
                            c++;
                            System.out.println();
                            break;
                        } while(true);
                    }
                    break;
                }
                seatCount--;
                System.out.println("SEAT COUNT :"+seatCount);
            }
        }
        
        public void janmabhoomi()
        {
            System.out.println("You have choosen to travel in the Geetanjali Express");
            do
            {
                try
                {
                    System.out.println("Please enter your preference of class:\n1.A/C\n2.Sleeper\n3.General");
                    ch=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ch<=0 || ch>3)
                {
                    System.out.println("Invalid input");
                    continue;
                }

                break;
            } while(true);
            do
            {
                if (ch==1)
                {
                    classChoice=1;
                }
                else if (ch==2)
                {
                    classChoice=2;
                }
                else if (ch==3)
                {
                    classChoice=3;
                }
                else
                {
                    System.out.println("Invalid choice"); continue;
                }
                break;
            } while(true);
            System.out.println("Number of seats Available is: "+seatCount);
            do
            {
                try
                {
                    System.out.println("Enter number of tickets to be booked: ");
                    ticnum=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ticnum>6)
                {
                    System.out.println("Sorry! You can only book 6 tickets at one go");
                    continue;
                }
                break;
            } while(true);

            for(int i=1; i<=ticnum; i++)
            {
                while(true)
                {
                    if(ch==1)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passAC[a]=obj.nextLine();
                        if(checkString(passAC[a]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrAC[a]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrAC[a]<=0||ageArrAC[a]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoAC[a]=obj.nextLine();                                
                                if(checkPhone(phoneNoAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderAC[a]=obj.nextLine().charAt(0);
                                if(checkGender(genderAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRAC[a]=temppnr;
                            a++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==2)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passSleep[b]=obj.nextLine();                                   
                        if(checkString(passSleep[b]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrSleep[b]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrSleep[b]<=0||ageArrSleep[b]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoSleep[b]=obj.nextLine();
                                if(checkPhone(phoneNoSleep[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderSleeper[b]=obj.nextLine().charAt(0);
                                if(checkGender(genderSleeper[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRSleep[b]=temppnr;
                            b++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==3)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passGen[c]=obj.nextLine();
                        if(checkString(passGen[c]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrGen[c]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {                                            
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }

                            if(ageArrGen[c]<=0||ageArrGen[c]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoGen[c]=obj.nextLine();
                                if(checkPhone (phoneNoGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderGen[c]=obj.nextLine().charAt(0);
                                if(checkGender(genderGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRgen[c]=temppnr;
                            c++;
                            System.out.println();
                            break;
                        } while(true);
                    }
                    break;
                }
                seatCount--;
                System.out.println("SEAT COUNT :"+seatCount);
            }

        }
        
        public void duranto()
        {
            System.out.println("You have choosen to travel in the Duranto Express");
            do
            {
                try
                {
                    System.out.println("Please enter your preference of class:\n1.A/C\n2.Sleeper\n3.General");
                    ch=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ch<=0 || ch>3)
                {
                    System.out.println("Invalid input");
                    continue;
                }

                break;
            } while(true);
            do
            {
                if (ch==1)
                {
                    classChoice=1;
                }
                else if (ch==2)
                {
                    classChoice=2;
                }
                else if (ch==3)
                {
                    classChoice=3;
                }
                else
                {
                    System.out.println("Invalid choice"); continue;
                }
                break;
            } while(true);

            System.out.println("Number of seats Available is: "+seatCount);
            do
            {
                try
                {
                    System.out.println("Enter number of tickets to be booked: ");
                    ticnum=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ticnum>6)
                {
                    System.out.println("Sorry! You can only book 6 tickets at one go");
                    continue;
                }
                break;
            } while(true);

            for(int i=1; i<=ticnum; i++)
            {
                while(true)
                {
                    if(ch==1)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passAC[a]=obj.nextLine();
                        if(checkString(passAC[a]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrAC[a]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrAC[a]<=0||ageArrAC[a]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoAC[a]=obj.nextLine();                                
                                if(checkPhone(phoneNoAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderAC[a]=obj.nextLine().charAt(0);
                                if(checkGender(genderAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRAC[a]=temppnr;
                            a++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==2)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passSleep[b]=obj.nextLine();                                   
                        if(checkString(passSleep[b]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrSleep[b]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrSleep[b]<=0||ageArrSleep[b]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoSleep[b]=obj.nextLine();
                                if(checkPhone(phoneNoSleep[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderSleeper[b]=obj.nextLine().charAt(0);
                                if(checkGender(genderSleeper[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRSleep[b]=temppnr;
                            b++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==3)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passGen[c]=obj.nextLine();
                        if(checkString(passGen[c]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrGen[c]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {                                            
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }

                            if(ageArrGen[c]<=0||ageArrGen[c]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoGen[c]=obj.nextLine();
                                if(checkPhone (phoneNoGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderGen[c]=obj.nextLine().charAt(0);
                                if(checkGender(genderGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRgen[c]=temppnr;
                            c++;
                            System.out.println();
                            break;
                        } while(true);
                    }
                    break;
                }
                seatCount--;
                System.out.println("SEAT COUNT :"+seatCount);
            }

        }
        
        public void rajdhani()
        {
            System.out.println("You have choosen to travel in the Rajdhani Express");
            do
            {
                try
                {
                    System.out.println("Please enter your preference of class:\n1.A/C\n2.Sleeper\n3.General");
                    ch=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ch<=0 || ch>3)
                {
                    System.out.println("Invalid input");
                    continue;
                }

                break;
            } while(true);
            do
            {
                if (ch==1)
                {
                    classChoice=1;
                }
                else if (ch==2)
                {
                    classChoice=2;
                }
                else if (ch==3)
                {
                    classChoice=3;
                }
                else
                {
                    System.out.println("Invalid choice"); continue;
                }
                break;
            } while(true);

            System.out.println("Number of seats Available is: "+seatCount);
            do
            {
                try
                {
                    System.out.println("Enter number of tickets to be booked: ");
                    ticnum=obj.nextInt();
                    obj.nextLine();
                }
                catch(InputMismatchException e)
                {
                    obj.nextLine();
                    System.out.println("Please enter a valid Integer no.");
                    continue;
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(ticnum>6)
                {
                    System.out.println("Sorry! You can only book 6 tickets at one go");
                    continue;
                }
                break;
            } while(true);

            for(int i=1; i<=ticnum; i++)
            {
                while(true)
                {
                    if(ch==1)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passAC[a]=obj.nextLine();
                        if(checkString(passAC[a]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrAC[a]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrAC[a]<=0||ageArrAC[a]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoAC[a]=obj.nextLine();                                
                                if(checkPhone(phoneNoAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderAC[a]=obj.nextLine().charAt(0);
                                if(checkGender(genderAC[a]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRAC[a]=temppnr;
                            a++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==2)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passSleep[b]=obj.nextLine();                                   
                        if(checkString(passSleep[b]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrSleep[b]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }                                        
                            if(ageArrSleep[b]<=0||ageArrSleep[b]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoSleep[b]=obj.nextLine();
                                if(checkPhone(phoneNoSleep[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderSleeper[b]=obj.nextLine().charAt(0);
                                if(checkGender(genderSleeper[b]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRSleep[b]=temppnr;
                            b++;
                            System.out.println();
                            break;
                        } while(true);

                    }

                    if(ch==3)
                    {

                        System.out.print("ENTER PASSENGER'S NAME: ");
                        passGen[c]=obj.nextLine();
                        if(checkString(passGen[c]))
                        {

                        }
                        else
                        {
                            System.out.println("Please enter a valid Name");
                            continue;
                        }
                        do
                        {
                            try
                            {
                                System.out.print("ENTER PASSENGER'S AGE: ");
                                ageArrGen[c]=obj.nextInt();
                                obj.nextLine();
                            }

                            catch(InputMismatchException e)
                            {                                            
                                obj.nextLine();
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            catch(Exception e)
                            {
                                obj.nextLine();
                                System.out.println("Invalid entry");
                                continue;
                            }

                            if(ageArrGen[c]<=0||ageArrGen[c]>100)
                            {
                                System.out.println("Please enter a valid Age");
                                continue;
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S 10-DIGIT MOBILE NUMBER: ");
                                phoneNoGen[c]=obj.nextLine();
                                if(checkPhone (phoneNoGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please Enter Your Correct Number");
                                    continue;
                                }
                            }
                            while(true)
                            {
                                System.out.print("ENTER PASSENGER'S GENDER(M/F): ");
                                genderGen[c]=obj.nextLine().charAt(0);
                                if(checkGender(genderGen[c]))
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Please enter a valid gender");
                                    continue;
                                }
                            }
                            PNRgen[c]=temppnr;
                            c++;
                            System.out.println();
                            break;
                        } while(true);
                    }
                    break;
                }
                seatCount--;
                System.out.println("SEAT COUNT :"+seatCount);
            }

        }
        

    
    

    public void resChart()
    {
        

            System.out.println("VIEW RESERVATION CHARTS FOR: ");
            System.out.println("1. Trains to Delhi");
            System.out.println("2. Trains to Kolkata");
            System.out.println("3. Trains to Lucknow");
            System.out.println("4. Trains to Chennai");
            System.out.println("5. Trains to Hyderabad");

            do
            {
                try
                {
                    System.out.println("Please select one of the options to proceed: ");
                    resc=obj.nextInt();
                    obj.nextLine();
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(resc<1 || resc>6)
                {
                    System.out.println("Invalid Choice");
                    continue;
                }
                break;
            } while(true);
            
            if(resc==1)
            {
                desS= "Delhi";
                
                System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
                int cl=obj.nextInt();
                
                if(cl==1)
                {
                    System.out.println("Train NO."+trainNoDel[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR AC CLASS-----");
                    String s= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(s);

                    for(int i=0;i<100;i++)
                    {
                     if(phoneNoAC[i]=="");
                     else
                     {
                      String s1= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRAC[i],"\t","AC", "\t",passAC[i], "\t",ageArrAC[i], "\t",phoneNoAC[i], "\t",genderAC[i], "\t","DELHI");
                      System.out.println(s1);
                     }
                    }
                }
                
                if(cl==2)
                {
                    System.out.println("Train NO."+trainNoDel[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR SLEEPER CLASS-----");
                    String str= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(str);

                    for(int i=0;i<100;i++)
                    {
                     if(phoneNoSleep[i]=="");
                     else
                     {
                      String s2= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRSleep[i],"\t","SLEEPER", "\t",passSleep[i], "\t",ageArrSleep[i], "\t",phoneNoSleep[i], "\t",genderSleeper[i], "\t","DELHI");
                      System.out.println(s2);
                     }
                    }
                }
                
                if(cl==3)
                {
                    System.out.println("Train NO."+trainNoDel[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR GENERAL CLASS-----");
                    String st1= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(st1);

                    for(int i=0;i<100;i++)
                    {
                     if(phoneNoGen[i]=="");
                     else
                     {
                      String s3= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRgen[i],"\t","GENERAL", "\t",passGen[i], "\t",ageArrGen[i], "\t",phoneNoGen[i], "\t",genderGen[i], "\t","DELHI");
                      System.out.println(s3);
                     }
                    }
                }
            }
            
            else if(resc==2)
            {
                desS="Kolkata";
                System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
                int c=obj.nextInt();
                
                if(c==1)
                {
                    System.out.println("Train NO."+trainNoKol[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR AC CLASS-----");
                    String st2= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(st2);

                    for(int i=0;i<100;i++)
                    {
                     if(phoneNoAC[i]=="");
                     else
                     {
                      String s1= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRAC[i],"\t","AC", "\t",passAC[i], "\t",ageArrAC[i], "\t",phoneNoAC[i], "\t",genderAC[i], "\t","KOLKATA");
                      System.out.println(s1);
                     }
                    }
                }
                
                if(c==2)
                {
                    System.out.println("Train NO."+trainNoKol[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR SLEEPER CLASS-----");
                    String st3= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(st3);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoSleep[i]=="");
                     else
                     {
                      String s2= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRSleep[i],"\t","SLEEPER", "\t",passSleep[i], "\t",ageArrSleep[i], "\t",phoneNoSleep[i], "\t",genderSleeper[i], "\t","KOLKATA");
                      System.out.println(s2);
                     }
                    }
                }
                
                if(c==3)
                {
                    System.out.println("Train NO."+trainNoKol[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR GENERAL CLASS-----");
                    String st4= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(st4);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoGen[i]=="");
                     else
                     {
                      String s3= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRgen[i],"\t","GENERAL", "\t",passGen[i], "\t",ageArrGen[i], "\t",phoneNoGen[i], "\t",genderGen[i], "\t","KOLKATA");
                      System.out.println(s3);
                     }
                    }
                }
            }
            
            else if(resc==3)
            {
                desS="Lucknow";                
                System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
                int cc=obj.nextInt();
                if(cc==1)
                {
                    System.out.println("Train NO."+trainNoLuck[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR AC CLASS-----");
                    String st5= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(st5);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoAC[i]=="");
                     else
                     {
                      String s1= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRAC[i],"\t","AC", "\t",passAC[i], "\t",ageArrAC[i], "\t",phoneNoAC[i], "\t",genderAC[i], "\t","LUCKNOW");
                      System.out.println(s1);
                     }
                    }
                }
                
                if(cc==2)
                {
                    System.out.println("Train NO."+trainNoLuck[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR SLEEPER CLASS-----");
                    String st6= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(st6);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoSleep[i]=="");
                     else
                     {
                      String s2= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRSleep[i],"\t","SLEEPER", "\t",passSleep[i], "\t",ageArrSleep[i], "\t",phoneNoSleep[i], "\t",genderSleeper[i], "\t","LUCKNOW");
                      System.out.println(s2);
                     }
                    }
                }
                
                if(cc==3)
                {
                    System.out.println("Train NO."+trainNoLuck[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR GENERAL CLASS-----");
                    String st7= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(st7);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoGen[i]=="");
                     else
                     {
                      String s3= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRgen[i],"\t","GENERAL", "\t",passGen[i], "\t",ageArrGen[i], "\t",phoneNoGen[i], "\t",genderGen[i], "\t","LUCKNOW");
                      System.out.println(s3);
                     }
                    }
                }
            }
            
            else if(resc==4)
            {
                desS="Chennai";
                System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
                int ci=obj.nextInt();
                if(ci==1)
                {
                    System.out.println("Train NO."+trainNoChe[0]);
                    System.out.println("\t\t\t\t\t\t-------FOR AC CLASS-------");
                    String s= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(s);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoAC[i]=="");
                     else
                     {
                      String s1= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRAC[i],"\t","AC", "\t",passAC[i], "\t",ageArrAC[i], "\t",phoneNoAC[i], "\t",genderAC[i], "\t","CHENNAI");
                      System.out.println(s1);
                     }
                    }
                }
                
                if(ci==2)
                {
                    System.out.println("TRAIN NO."+trainNoChe[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR SLEEPER CLASS-----");
                    String st= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(st);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoSleep[i]=="");
                     else
                     {
                      String s2= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRSleep[i],"\t","SLEEPER", "\t",passSleep[i], "\t",ageArrSleep[i], "\t",phoneNoSleep[i], "\t",genderSleeper[i], "\t","CHENNAI");
                      System.out.println(s2);
                     }
                    }
                }
                
                if(ci==3)
                {
                    System.out.println("TRAIN NO."+trainNoChe[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR GENERAL CLASS-----");
                    String str1= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(str1);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoGen[i]=="");
                     else
                     {
                      String s3= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRgen[i],"\t","GENERAL", "\t",passGen[i], "\t",ageArrGen[i], "\t",phoneNoGen[i], "\t",genderGen[i], "\t","CHENNAI");
                      System.out.println(s3);
                     }
                    }
                }
            }
            
            else if(resc==5)
            {
                desS="Hyderabad";                
                System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
                int l=obj.nextInt();                
                if(l==1)
                {
                    System.out.println("Train NO."+trainNoHyd[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR AC CLASS-----");
                    String str2= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(str2);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoAC[i]=="");
                     else
                     {
                      String s1= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRAC[i],"\t","AC", "\t",passAC[i], "\t",ageArrAC[i], "\t",phoneNoAC[i], "\t",genderAC[i], "\t","HYDERABAD");
                      System.out.println(s1);
                     }
                    }
                }
                
                if(l==2)
                {
                    System.out.println("Train NO."+trainNoHyd[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR SLEEPER CLASS-----");
                    String str3= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(str3);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoSleep[i]=="");
                     else
                     {
                      String s2= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRSleep[i],"\t","SLEEPER", "\t",passSleep[i], "\t",ageArrSleep[i], "\t",phoneNoSleep[i], "\t",genderSleeper[i], "\t","HYDERABAD");
                      System.out.println(s2);
                     }
                    }
                }
                
                if(l==3)
                {
                    System.out.println("Train NO."+trainNoHyd[0]);
                    System.out.println("\t\t\t\t\t\t-----FOR GENERAL CLASS-----");
                    String str4= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s","PNR NO","\t","CLASS", "\t","NAME", "\t","AGE", "\t","PHONE NO", "\t","GENDER", "\t","DESTINATION");
                    System.out.println(str4);

                    for(int i=0;i<10;i++)
                    {
                     if(phoneNoGen[i]=="");
                     else
                     {
                      String s3= String.format("%-8s %-3s %-8s %-3s %-17s %-3s %-3s %-3s %-15s %-3s %-7s %-3s %-11s",PNRgen[i],"\t","GENERAL", "\t",passGen[i], "\t",ageArrGen[i], "\t",phoneNoGen[i], "\t",genderGen[i], "\t","HYDERABAD");
                      System.out.println(s3);
                     }
                    }
                }
            }
            }
        
        Railway_Reservation()
        {
           passAC[0]="Namrata Jagtap";
           ageArrAC[0]=21;
           phoneNoAC[0]="8692977555";
           genderAC[0]='f';
           PNRAC[0]=890001;
           
           passSleep[0]="Soniya Vyas";
           ageArrSleep[0]=32;
           phoneNoSleep[0]="9876543210";
           genderSleeper[0]='f';
           PNRSleep[0]=890001;
           
           passGen[0]="Raman Trivedi";
           ageArrGen[0]=67;
           phoneNoGen[0]="9765432180";
           genderGen[0]='m';
           PNRgen[0]=890001;
           
           passAC[1]="Soham Roy";
           ageArrAC[1]=23;
           phoneNoAC[1]="0987654321";
           genderAC[1]='m';
           PNRAC[1]=890002;
           
           passSleep[1]="Pratyush Patro";
           ageArrSleep[1]=25;
           phoneNoSleep[1]="8192922220";
           genderSleeper[1]='m';
           PNRSleep[1]=890002;
           
           passGen[1]="C.Venugopal Iyer";
           ageArrGen[1]=78;
           phoneNoGen[1]="9819715015";
           genderGen[1]='m';
           PNRgen[1]=890002;
           
           passAC[2]="Mohsin Khan ";
           ageArrAC[2]=23;
           phoneNoAC[2]="8692944440";
           genderAC[2]='m';
           PNRAC[2]=890003;
           
           passSleep[2]="Kasturi Ghosh";
           ageArrSleep[2]=25;
           phoneNoSleep[2]="8192933330";
           genderSleeper[2]='m';
           PNRSleep[2]=890003;
           
           passGen[2]="Darren Iyer";
           ageArrGen[2]=78;
           phoneNoGen[2]="8729288880";
           genderGen[2]='m';
           PNRgen[2]=890003;
           
           passAC[3]="Shivangi Joshi ";
           ageArrAC[3]=23;
           phoneNoAC[3]="8693955550";
           genderAC[3]='f';
           PNRAC[3]=890004;
           
           passSleep[3]="Saptarishi Ghosh";
           ageArrSleep[3]=25;
           phoneNoSleep[3]="8192933330";
           genderSleeper[3]='m';
           PNRSleep[3]=890004;
           
           passGen[3]="Dr.Stephen Strange";
           ageArrGen[3]=78;
           phoneNoGen[3]="8729288880";
           genderGen[3]='m';
           PNRgen[3]=890004;
           
           passAC[4]="Kasturi Roy";
           ageArrAC[4]=45;
           phoneNoAC[4]="8692977770";
           genderAC[4]='f';
           PNRAC[4]=890005;
           
           passSleep[4]="Anurag Chevendra";
           ageArrSleep[4]=25;
           phoneNoSleep[4]="9182833440";
           genderSleeper[4]='m';
           PNRSleep[4]=890005;
           
           passGen[4]="Leandro Iyer";
           ageArrGen[4]=89;
           phoneNoGen[4]="8592955660";
           genderGen[4]='m';
           PNRgen[4]=890005;
           
           for(int i=5;i<100;i++)
           {
               phoneNoAC[i]="";
               phoneNoSleep[i]="";
               phoneNoGen[i]="";
            }
           main();
        }
        
        public void cancel()
        {
            System.out.println("ENTER YOUR TRAIN \n1.Geetanjali Express \n2.Falaknama \n3.Janmabhoomi \n4.Duranto Express \n5.Rajdhani Express");
            int trch=obj.nextInt();
            if(trch==1)
            {
                System.out.println("\t\t\t\t***CANCELLATION FOR GEETANJALI EXPRESS***");
             System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
             int C1=obj.nextInt();
            if(C1==1)
            {
                System.out.println("\t\t\t\t--------FOR AC CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn==PNRAC[i])
              {
                  System.out.println("Name:"+passAC[i]);
                  System.out.println("Age:"+ageArrAC[i]);
                  System.out.println("Phone Number:"+phoneNoAC[i]);
                  passAC[i]="#CANCELLED#";
                  ageArrAC[i]=0;
                  phoneNoAC[i]="";
              }
            }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.1000");
            }
            
             if(C1==2)
            {
                System.out.println("\t\t\t\t--------FOR SLEEPER CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn1=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn1==PNRSleep[i])
               {
                  System.out.println("Name:"+passSleep[i]);
                  System.out.println("Age:"+ageArrSleep[i]);
                  System.out.println("Phone Number:"+phoneNoSleep[i]);
                  passSleep[i]="#CANCELLED#";
                  ageArrSleep[i]=0;
                  phoneNoSleep[i]="";
               }
              }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.800");
             }
             
             if(C1==3)
            {
                System.out.println("\t\t\t\t--------FOR GENERAL CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn2=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn2==PNRgen[i])
               {
                  System.out.println("Name:"+passGen[i]);
                  System.out.println("Age:"+ageArrGen[i]);
                  System.out.println("Phone Number:"+phoneNoGen[i]);
                  passGen[i]="#CANCELLED#";
                  ageArrGen[i]=0;
                  phoneNoGen[i]="";
               }
             }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.600");
              }
           }
           
           if(trch==2)
            {
             System.out.println("\t\t\t\t***CANCELLATION FOR FALAKNAMA EXPRESS***");
             System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
             int C2=obj.nextInt();
             if(C2==1)
            {
                System.out.println("\t\t\t\t--------FOR AC CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn3=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
                 if(pn3==PNRAC[i])
                {
                  System.out.println("Name:"+passAC[i]);
                  System.out.println("Age:"+ageArrAC[i]);
                  System.out.println("Phone Number:"+phoneNoAC[i]);
                  passAC[i]="#CANCELLED#";
                  ageArrAC[i]=0;
                  phoneNoAC[i]="";
               }
              }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.1000");
            }
            
             if(C2==2)
            {
                System.out.println("\t\t\t\t--------FOR SLEEPER CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn4=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn4==PNRSleep[i])
               {
                  System.out.println("Name:"+passSleep[i]);
                  System.out.println("Age:"+ageArrSleep[i]);
                  System.out.println("Phone Number:"+phoneNoSleep[i]);
                  passSleep[i]="#CANCELLED#";
                  ageArrSleep[i]=0;
                  phoneNoSleep[i]="";
               }
              }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.800");
             }
             
             if(C2==3)
            {
                System.out.println("\t\t\t\t--------FOR GENERAL CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn5=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn5==PNRgen[i])
               {
                  System.out.println("Name:"+passGen[i]);
                  System.out.println("Age:"+ageArrGen[i]);
                  System.out.println("Phone Number:"+phoneNoGen[i]);
                  passGen[i]="#CANCELLED#";
                  ageArrGen[i]=0;
                  phoneNoGen[i]="";
               }
             }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.600");
              }
           }
           
           if(trch==3)
            {
                System.out.println("\t\t\t\t***CANCELLATION FOR JANMABHOOMI EXPRESS***");
             System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
             int C3=obj.nextInt();
            if(C3==1)
            {
                System.out.println("\t\t\t\t--------FOR AC CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn6=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn6==PNRAC[i])
               {
                  System.out.println("Name:"+passAC[i]);
                  System.out.println("Age:"+ageArrAC[i]);
                  System.out.println("Phone Number:"+phoneNoAC[i]);
                  passAC[i]="#CANCELLED#";
                  ageArrAC[i]=0;
                  phoneNoAC[i]="";
               }
             }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.1000");
            }
            
             if(C3==2)
            {
                System.out.println("\t\t\t\t--------FOR SLEEPER CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn7=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn7==PNRSleep[i])
               {
                  System.out.println("Name:"+passSleep[i]);
                  System.out.println("Age:"+ageArrSleep[i]);
                  System.out.println("Phone Number:"+phoneNoSleep[i]);
                  passSleep[i]="#CANCELLED#";
                  ageArrSleep[i]=0;
                  phoneNoSleep[i]="";
               }
              }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.800");
             }
             
             if(C3==3)
            {
                System.out.println("\t\t\t\t--------FOR GENERAL CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn8=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn8==PNRgen[i])
               {
                  System.out.println("Name:"+passGen[i]);
                  System.out.println("Age:"+ageArrGen[i]);
                  System.out.println("Phone Number:"+phoneNoGen[i]);
                  passGen[i]="#CANCELLED#";
                  ageArrGen[i]=0;
                  phoneNoGen[i]="";
               }
             }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.600");
              }
           }
           
           if(trch==4)
            {
                System.out.println("\t\t\t\t***CANCELLATION FOR DURANTO EXPRESS***");
             System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
             int C4=obj.nextInt();
            if(C4==1)
            {
                System.out.println("\t\t\t\t--------FOR AC CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int pn9=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(pn9==PNRAC[i])
              {
                  System.out.println("Name:"+passAC[i]);
                  System.out.println("Age:"+ageArrAC[i]);
                  System.out.println("Phone Number:"+phoneNoAC[i]);
                  passAC[i]="#CANCELLED#";
                  ageArrAC[i]=0;
                  phoneNoAC[i]="";
              }
            }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.1000");
            }
            
             if(C4==2)
            {
                System.out.println("\t\t\t\t--------FOR SLEEPER CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int p=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(p==PNRSleep[i])
               {
                  System.out.println("Name:"+passSleep[i]);
                  System.out.println("Age:"+ageArrSleep[i]);
                  System.out.println("Phone Number:"+phoneNoSleep[i]);
                  passSleep[i]="#CANCELLED#";
                  ageArrSleep[i]=0;
                  phoneNoSleep[i]="";
               }
              }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.800");
             }
             
             if(C4==3)
            {
                System.out.println("\t\t\t\t--------FOR GENERAL CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int p2=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(p2==PNRgen[i])
               {
                  System.out.println("Name:"+passGen[i]);
                  System.out.println("Age:"+ageArrGen[i]);
                  System.out.println("Phone Number:"+phoneNoGen[i]);
                  passGen[i]="#CANCELLED#";
                  ageArrGen[i]=0;
                  phoneNoGen[i]="";                  
               }
             }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.600");
              }
           }
           
           if(trch==5)
            {
             System.out.println("\t\t\t\t***CANCELLATION FOR RAJDHANI EXPRESS***");
             System.out.println("ENTER THE CLASS CHOICE:\n1.AC\n2.Sleeper\n3.General");
             int C5=obj.nextInt();
             if(C5==1)
            {
                System.out.println("\t\t\t\t--------FOR AC CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int p3=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(p3==PNRAC[i])
               {
                  System.out.println("Name:"+passAC[i]);
                  System.out.println("Age:"+ageArrAC[i]);
                  System.out.println("Phone Number:"+phoneNoAC[i]);
                  passAC[i]="#CANCELLED#";
                  ageArrAC[i]=0;
                  phoneNoAC[i]="";                  
               }
             }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.1000");
            }
            
             if(C5==2)
            {
                System.out.println("\t\t\t\t--------FOR SLEEPER CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int p4=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{
            
               if(p4==PNRSleep[i])
               {
                  System.out.println("Name:"+passSleep[i]);
                  System.out.println("Age:"+ageArrSleep[i]);
                  System.out.println("Phone Number:"+phoneNoSleep[i]);
                  passSleep[i]="#CANCELLED#";
                  ageArrSleep[i]=0;
                  phoneNoSleep[i]="";
               }
              }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.800");
             }
             
             if(C5==3)
            {
                System.out.println("\t\t\t\t--------FOR GENERAL CLASS--------");
                System.out.println("Enter your PNR No.:");
            	int p6=obj.nextInt();
            	obj.nextLine();
            	for(int i=0;i<50;i++)
            	{            
               if(p6==PNRgen[i])
               {
                  System.out.println("Name:"+passGen[i]);
                  System.out.println("Age:"+ageArrGen[i]);
                  System.out.println("Phone Number:"+phoneNoGen[i]);
                  passGen[i]="#CANCELLED#";
                  ageArrGen[i]=0;
                  phoneNoGen[i]="";
                  
               }
             }
              System.out.println("YOUR BOOKING IS CANCELLED....\n REFUND IS Rs.600");
              }
           }
    } 
    
    public void header()
    {
        String s=("INDIAN RAILWAY RESEVATIONS\nWelcome!\nBook your Railway tickets Anytime, Anywhere by following a few simple steps...");
        for(int i=0; i<s.length();i++)
        {
            System.out.print(s.charAt(i));
            for(double j=1;j<25000000;j++)
            {
            }
        }
        System.out.println();        
    }

    public void options()
    {
        boolean b=true;
        Scanner obj=new Scanner(System.in);
        while(b==true)
        {
            System.out.println("MENU");
            System.out.println("1. Reservation");            
            System.out.println("2. View Reservation Chart");
            System.out.println("3. Cancellation of Tickets");
            System.out.println("4. Exit");

            do
            {
                try
                {
                    System.out.println("Please select one of the options to proceed: ");
                    x=obj.nextInt();
                    obj.nextLine();
                }

                catch( Exception e)
                {
                    obj.nextLine();
                    System.out.println("Invalid input");
                    continue;
                }
                if(x<=0)
                {
                    obj.nextLine();
                    System.out.println("Sorry! No such option");
                    continue;
                }
                if(x>5)
                {
                    obj.nextLine();
                    System.out.println("Sorry! No such option");
                    continue;
                }
                break;
            } while(true);

            switch(x)
            {  

                case 1:
                {
                    reservation();billSummary();chooseExit();break;
                }                

                case 2:
                {
                    resChart();chooseExit();break;
                }        
                
                case 3:
                {
                    cancel();chooseExit();break;
                }

                case 4:
                {
                    chooseExit(); break;
                }
            }//END OF MAIN SWITCH
            b=false;
        }
    }

    public void exit()
    {
        System.out.println("\t\t\t\t\t****THANK YOU****");
        System.out.println("\n\nThe project you have just viewed was created by :");
        System.out.println("\nNAMRATA JAGTAP\nClass X-A\nROLL NO. 9");

    }

    public void main()
    {
        header();
        options();
    }
}

