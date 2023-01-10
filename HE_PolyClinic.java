package X;

import java.util.*;
public class HE_PolyClinic
{
    Scanner obj=new Scanner(System.in);
    String exitc,indep,app;
    int nottp=2;//no.of times to print
    int z,k1;
    int salary;
    int fbc=3;String k2;
    String doc[]=new String[10];//doctor's name
    int sur[]=new int[10];//no. of surgeries
    double sal[]=new double[10];//final salary
    String dep[]=new String[10],s,y,w,x,ind;//department
    int appt[]=new int[10];
    String chd;
    String fb[]={"Best Polyclinic With Great Staff - *****","Expert Doctors, Friendly Staff - **** ","Effieciently Run Polyclinic - *****","",""};
    public HE_PolyClinic()
    {
        salary = 30000;
        doc[0]="Dr. Anup Kumar"; sur[0]=12;sal[0]=(15.0/100.0 * salary)+salary;dep[0]="Neurology";
        doc[1]="Dr. Mohit Jain";sur[1]=8;sal[1]=(10.0/100.0 * salary)+salary;dep[1]="Oncology";
        doc[2]="Dr. Kunal Khan";sur[2]=4;sal[2]=(5.0/100.0 * salary)+salary;dep[2]="Cardiology";
        main();
    }

    public void main()
    {
        header();
        options();
    }

    public void header()
    {
        String s=("Welcome To Hiranandani Polyclinic");
        for(int i=0; i<s.length();i++)
        {
            System.out.print(s.charAt(i));
            for(double j=1;j<25000000;j++)
            {
                //delay loop
            }
        }
        System.out.println();        
    }

    public void options()
    {
        boolean b=true;
        for(double j=1;j<25000000;j++)
        {
            //delay loop
        }
        while(b==true)
        {
            System.out.println("MENU");
            System.out.println("1. Doctors");            
            System.out.println("2. Departments");
            System.out.println("3. Exit");
            do
            {
                try
                {
                    System.out.println("Please Select One Of The Options To Proceed: ");
                    x=obj.nextLine();
                    Integer.parseInt(x);
                }

                catch(Exception e)
                {
                    System.out.println("Invalid Input");
                    continue;
                }
                if(Integer.parseInt(x)<=0)
                {
                    obj.nextLine();
                    System.out.println("Sorry! No Such Option");
                    continue;
                }
                if(Integer.parseInt(x)>3)
                {
                    System.out.println("Sorry! No Such Option");
                    continue;
                }
                break;
            } while(true);
            switch(Integer.parseInt(x))
            {  
                case 1:
                {
                    doctor();
                    chooseExit();
                    break;
                }                
                case 2:
                {
                    department();
                    chooseExit();
                    break;
                }     
                case 3:
                {
                    chooseExit();
                    break;
                }
            }//END OF MAIN SWITCH
            b=false;
        }
    }

    public void doctor()
    {
        System.out.println("Enter 1: To Add A Doctor");
        System.out.println("Enter 2: To Arrange All Doctors As Per Their Final Salary In Ascending Order");
        System.out.println("Enter 3: To Arrange All Doctors As Per Their Name In Lexicographical Manner");
        System.out.println("Enter 4: To Find Maximum And Minimum Salary");
        System.out.println("Enter 5: To Find Salary Of One Doctor By Searching For His/Her Name In The Doctor's List");
        System.out.println("Enter 6: To Go Back To Main Menu");
        do
        {
            try
            {
                System.out.println("Please Select One Of The Options To Proceed: ");
                y=obj.nextLine();
                Integer.parseInt(y);
            }

            catch(Exception e)
            {
                System.out.println("Invalid Input");
                continue;
            }
            if(Integer.parseInt(y)<=0)
            {
                obj.nextLine();
                System.out.println("Sorry! No Such Option");
                continue;
            }
            if(Integer.parseInt(y)>6)
            {
                System.out.println("Sorry! No Such Option");
                continue;
            }
            break;
        } while(true);
        if (Integer.parseInt(y)==1)
        {
            adddoc();
            obj.nextLine();
            chooseExit();
        }
        else if (Integer.parseInt(y)==2)
        {
            salary();
            chooseExit();
        }           
        else if (Integer.parseInt(y)==3)
        {
            name();
            chooseExit();  
        }        
        else if (Integer.parseInt(y)==4)
        {
            maxmin();    
            chooseExit();   
        }         
        else if (Integer.parseInt(y)==5)
        {
            doctorsearch();
            chooseExit();
        }
        else
        {
            System.out.print("\u000C");
            options();
        }
    }

    public void adddoc()
    {
        nottp=nottp+1; boolean b1=true;
        System.out.println("Enter Name of Doctor(Without Dr.)-"); 
        L3:do
        {
            doc[nottp] = obj.nextLine();
            s = doc[nottp];
            doc[nottp]= "Dr. "+doc[nottp];
            L1:for(int o = 0;o<s.length();o++)
            {
                char ch = s.charAt(o);
                if (Character.isLetter(ch)||ch==(' '))
                {
                    if (s.trim().equals(""))
                    {
                        System.out.println("Please Enter Proper Name Carefully-");
                        System.out.println("===================================");
                        continue L3;
                    }
                    b1=false;
                }
                else
                {
                    System.out.println("Please Enter Valid Name");b1=true;break L1;
                }
            }
        }while (b1==true);
        System.out.println("Enter Department- 1.Neurology  2.Cardiology  3.Oncology");
        do
        {
            try
            {
                System.out.println("Please Select One Of The Options To Proceed: ");
                ind=obj.nextLine();
                Integer.parseInt(ind);
            }

            catch(Exception e)
            {
                System.out.println("Invalid Input");
                continue;
            }
            if(Integer.parseInt(ind)<=0)
            {
                obj.nextLine();
                System.out.println("Sorry! No Such Option");
                continue;
            }
            if(Integer.parseInt(ind)>3)
            {
                obj.nextLine();
                System.out.println("Sorry! No Such Option");
                continue;
            }
            break;
        }while(true);
        if(Integer.parseInt(ind) == 1)
        {
            dep[nottp]="Neurology";
        }
        else if(Integer.parseInt(ind) == 2)
        {
            dep[nottp]="Cardiology";
        } 
        else if(Integer.parseInt(ind) == 3)
        {
            dep[nottp]="Oncology";
        }
        L2: for (int q =1;q>0;q++)
        {
            System.out.println("Enter No.of Surgeries Performed-"); 
            while (!obj.hasNextInt()) 
            {        
                obj.next(); // Read and discard offending non-int input
                System.out.println("Please enter a number- "); // Re-prompt
            }
            // At this point in the code, the user has entered an integer
            sur[nottp]= obj.nextInt(); // Get the integer
            if (sur[nottp]>=1 && sur[nottp]<=5)
            {
                sal[nottp]=(5.0/100.0 * salary)+salary;
                k1=0;
            }
            else if (sur[nottp]>=6 && sur[nottp]<=10)
            {
                sal[nottp]=(10.0/100.0 * salary)+salary;
                k1=0;
            }
            else if (sur[nottp]>=11 && sur[nottp]<=15)
            {
                sal[nottp]=(15.0/100.0 * salary)+salary;
                k1=0;
            }
            else if (sur[nottp]>15)
            {
                sal[nottp]=(20.0/100.0 * salary)+salary;
                k1=0;
            } 
            else
            {
                k1=1;
            }
            if (k1==0)
            {
                break;
            }
            else
                continue;
        }
        System.out.println("Doctor Successfully Added!");
    }

    public void salary()
    {
        double t;String str; int k1;
        for(int i = 0;i <= nottp;i++)
        {
            for (int j = 0;j <= nottp-1-i;j++)
            {
                if(sal[j]>sal[j+1])
                {
                    t=sal[j];
                    sal[j]=sal[j+1];
                    sal[j+1]=t;
                    str = doc[j];
                    doc[j]=doc[j+1];
                    doc[j+1]=str;
                    k1=sur[j];
                    sur[j]=sur[j+1];
                    sur[j+1]=k1;
                    k2=dep[j];
                    dep[j]=dep[j+1];
                    dep[j+1]=k2;
                }
            }
        }
        System.out.println("Doctor\t\tDepartment\tSurgeries\tSalary");
        for (int i =0;i<=nottp;i++)
        {
            System.out.println(doc[i]+"\t"+dep[i]+"\t"+sur[i]+"\t\t"+sal[i]);
        }
    }

    public void name()
    {
        double t;String str; int k1;
        for(int i = 0;i <= nottp;i++)
        {
            for (int j = 0;j <= nottp-1-i;j++)
            {
                if(doc[j].compareTo(doc[j+1])>0)
                {
                    str = doc[j];
                    doc[j]=doc[j+1];
                    doc[j+1]=str;
                    t=sal[j];
                    sal[j]=sal[j+1];
                    sal[j+1]=t;                  
                    k1=sur[j];
                    sur[j]=sur[j+1];
                    sur[j+1]=k1;
                    k2=dep[j];
                    dep[j]=dep[j+1];
                    dep[j+1]=k2;
                }
            }
        }
        System.out.println("Doctor\t\tDepartment\tSurgeries\tSalary");
        for (int i =0;i<=nottp;i++)
        {
            System.out.println(doc[i]+"\t"+dep[i]+"\t"+sur[i]+"\t\t"+sal[i]);
        }
    }

    public void maxmin()
    {
        double t;
        for(int i = 0;i <=nottp;i++)
        {
            for (int j = 0;j <=nottp-1-i;j++)
            {
                if(sal[j]>sal[j+1])
                {
                    t=sal[j];
                    sal[j]=sal[j+1];
                    sal[j+1]=t;
                }
            }
        }
        System.out.println("Minimum= "+sal[0]+"("+doc[0]+")");
        System.out.println("Maximum= "+sal[nottp]+"("+doc[nottp]+")");
    }

    public void doctorsearch()
    {
        System.out.println("Enter Doctor's Name(With Dr.)");
        String doc1 = obj.nextLine(); int k = 0;
        for(int i = 0;i<=nottp;i++)
        {
            if (doc[i].equalsIgnoreCase(doc1))
            {
                System.out.println("Salary Of "+doc[i]+" Of " +dep[i]+ " Is = "+ sal[i]);k=0;
                break;
            }
            else
                k=1;
        }
        if (k==1)
            System.out.println("Not Found");
    }

    public void department()
    {
        System.out.println("Enter Department- 1.Neurology  2.Cardiology  3.Oncology");     
        int klm=0;
        do
        {
            try
            {
                System.out.println("Please Select One Of The Options To Proceed: ");
                indep=obj.nextLine(); 
                Integer.parseInt(indep);
            }

            catch(Exception e)
            {
                System.out.println("Invalid Input");
                continue;
            }
            if(Integer.parseInt(indep)<=0)
            {
                System.out.println("Sorry! No Such Option");
                continue;
            }
            if(Integer.parseInt(indep)>3)
            {
                System.out.println("Sorry! No Such Option");
                continue;
            }
            break;
        }while(true);
        if (Integer.parseInt(indep)==1)
        {
            for(klm = 0;klm<=nottp;klm++)
            {
                if (dep[klm].equals("Neurology"))
                    System.out.println(doc[klm]);
            }
        }
        if (Integer.parseInt(indep)==2)
        {
            for(klm = 0;klm<=nottp;klm++)
            {
                if (dep[klm].equals("Cardiology"))
                    System.out.println(doc[klm]);
            }
        }
        if (Integer.parseInt(indep)==3)
        {
            for(klm = 0;klm<=nottp;klm++)
            {
                if (dep[klm].equals("Oncology"))
                    System.out.println(doc[klm]);
            }
        }
        System.out.println("Enter Name of Doctor to Access Details (With Dr. )-");
        String docn = obj.nextLine();int f=1;
        for(int i =0;i<=nottp;i++)
        {
            if (docn.equals(doc[i]))
            {
                System.out.println(doc[i]+"\t"+dep[i]+"\t"+sur[i]+"\t"+sal[i]); f=0; break;
            }
        }
        if (f==1)
        {                
            System.out.println("Not Found");
        }
    }

    public void chooseExit()
    {
        for(int x2=1;x2<50;x2++)
            System.out.print("=");

        do
        {
            try
            {
                System.out.println("\n\nDo You Wish To Exit?\n1.Yes, I Want To Exit\n2.No, I Want To Continue");
                System.out.println("Please Select One Of The Options To Proceed: ");
                exitc=obj.nextLine();
                Integer.parseInt(exitc);
            }

            catch(Exception e)
            {
                System.out.println("Invalid Input");
                continue;
            }
            if(Integer.parseInt(exitc)<=0||Integer.parseInt(exitc)>2)
            {
                System.out.println("Sorry! No Such Option");
                continue;
            }                
            break;
        } while(true);
        if(Integer.parseInt(exitc)==1)
        {
            System.out.println("1. Enter FeedBack \t 2. Display FeedBack \nPress Any Other Key To Exit");
            String c = obj.nextLine();
            if(c.equals("1")&&c.equals("2")== false)
                exit();
            if(c.equals("1"))
                feedback();
            else if (c.equals("2"))
                dispfb();
            exit();             
        }
        else
        {
            System.out.print("\u000C");
            options(); 
        }
    }

    public void feedback()
    {
        String kx;
        System.out.println("\u000CPlease Enter Your Feedback Below, Along With Star Rating Out Of 5.");
        fb[fbc]=obj.nextLine();
        fbc++;
        System.out.println("FeedBack Added!\n");
        System.out.println("1. Main Menu\t2. Exit");
        do
        {
            try
            {
                kx = obj.nextLine();
                Integer.parseInt(kx);
            }
            catch(Exception e)
            {
                System.out.println("Invalid Choice");
                continue;
            }
            if (Integer.parseInt(kx)<=0 && Integer.parseInt(kx)>2)
            {
                System.out.println("Sorry No Such Option");
                continue;
            }
            if(Integer.parseInt(kx)==1)
            {
                System.out.print("\u000C");
                options();
            }
            else if(Integer.parseInt(kx)==2)
            {
                exit();
            }
        }while(true);
    }

    public void dispfb()
    {
        System.out.println("\u000CFEEDBACKS -\n\n");
        for (int i = 0;i<fbc;i++)
        {
            System.out.println((i+1)+". "+fb[i]);               
        }
        System.out.println("\n\nDo you want to add one?\n1. Yes \t2. No");
        do
        {
            try
            {
                chd = obj.nextLine();
                Integer.parseInt(chd);
            }
            catch(Exception e)
            {
                System.out.println("Invalid Choice"); continue;
            }
            if (Integer.parseInt(chd)<=0 && Integer.parseInt(chd)>2)
            {
                System.out.println("Sorry No Such Option");
                continue;
            }
            if (Integer.parseInt(chd)==1)
                feedback();
            else if (Integer.parseInt(chd)==2)
            {
                break;
            }
        }while(true);
    }

    public void exit()
    { 
        for(int x2=1;x2<50;x2++)
            System.out.print("=");
        System.out.println("\n\n\n\t::::::THANK YOU::::::");
        System.out.println("\n\nThe Project You Have Just Viewed Was Created By -");
        System.out.println("\nSIDDHANTH JAGTAP");
        for(double j=1;j<25000000*400;j++)
        {

        }
        System.exit(0);
    }
}
