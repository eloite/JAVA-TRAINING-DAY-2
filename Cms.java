import java.util.*;
/**
 * Write a description of class Cms here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cms
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("*                       Welcome to NeoTeach College of Engineering                        *");
        System.out.println("*******************************");
        System.out.println("College Management System deals with all kind of student details,");
        System.out.println("academic related reports, college details, course details, curriculum, batch details");
        System.out.println("and other resource related details too.");
        System.out.println("It tracks all the details of a student from the day one to the end of his course");
        System.out.println("which can be used for all reporting purpose, tracking of attendance, progress in the course,");
        System.out.println("completed semesters years, coming semester year curriculum details, exam details,");
        System.out.println("project or any other assignment details, final exam result;");
        System.out.println("and all these will be available for future references too.");
        System.out.println("Our placement parteners are");
        System.out.println("MicroSoft");
        System.out.println("Google");
        System.out.println("Oracle");
        System.out.println("Infosys");
        System.out.println("MicroSoft");
        System.out.println("==========================================================================================");
        System.out.println("Following are the branches to known more");
        System.out.println("1)Admissions");
        System.out.println("2)Examination Branch");
        System.out.println("3)Sports");
        System.out.println("4)Faculty Login");
        System.out.println("5)Students Login");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Select 1 to 5 to utilise the services or 0 to Exit");
        System.out.println("-----------------------------------------------------------------------------------------");
        int option=sc.nextInt();
        switch (option)
        {
            case 1:
            {
                System.out.println("Our college Topers for this Academic year");
                System.out.println("=========================================");
                System.out.println("1)Name:Raju");
                System.out.println(" Group:CSE");
                System.out.println(" Year:2017");
                System.out.println(" Percentage:96%");
                System.out.println(" Placed in:Google");
                System.out.println("---------------------");
                System.out.println("2)Name:Venkat");
                System.out.println(" Group:EC");
                System.out.println(" Year:2016");
                System.out.println(" Percentage:93%");
                System.out.println(" Placed in:Infosys");
                System.out.println("---------------------");
                System.out.println("3)Name:Anusha");
                System.out.println(" Group:EEE");
                System.out.println(" Year:2015");
                System.out.println(" Percentage:91%");
                System.out.println(" Placed in:Microsoft");
                System.out.println("---------------------");
                System.out.println("4)Name:Harshini");
                System.out.println(" Group:IT");
                System.out.println(" Year:2014");
                System.out.println(" Percentage:95%");
                System.out.println(" Placed in:Oracle");
                System.out.println("---------------------");
                System.out.println("5)Name:Rajesh");
                System.out.println(" Group:Civil");
                System.out.println(" Year:2013");
                System.out.println(" Percentage:85%");
                System.out.println(" Placed in:Google");
                System.out.println("=========================================");
                System.out.println("Did you qualified in Entrance test?(Yes/No)");
                String qlfy=sc.next();
                if(qlfy.equalsIgnoreCase("yes"))
                {
                    System.out.println("Your eligible to join in BTech");
                    System.out.println("Select the Brench/Group in BTech or 0 to Exit");
                    System.out.println("1)CSE");
                    System.out.println("2)IT");
                    System.out.println("3)EC");
                    System.out.println("4)EEE");
                    System.out.println("5)Civil");
                    System.out.println("6)Mechanical");
                    int gs=sc.nextInt();
                    switch(gs)
                    {
                        case 1:System.out.println("Your admission done in CSE");
                        break;
                        case 2:System.out.println("Your admission done in IT");
                        break;
                        case 3:System.out.println("Your admission done in EC");
                        break;
                        case 4:System.out.println("Your admission done in EEE");
                        break;
                        case 5:System.out.println("Your admission done in Civil");
                        break;
                        case 6:System.out.println("Your admission done in Mechanical");
                        break;
                        case 0:System.exit(0);
                        break;
                        default:System.out.println("Select 1 to 6 only");
                        break;
                    }
                }
                else
                {
                    System.out.println("Sorry Your not eligible to join in BTech");
                }
            }
            break;
            case 2:
            {
            System.out.println("Your selected Examinations");
            System.out.println("Select the following or 0 to Exit");
                    System.out.println("1)Result");
                    System.out.println("2)Exam Time Table");
                    System.out.println("3)Exam fee date");
                    int eop=sc.nextInt();
                    switch(eop)
                    {
                        case 1:
                        {
                            System.out.println("Enter your Hall Ticket Number or 0 to Exit");
                            int htno=sc.nextInt();
                            switch(htno)
                            {
                                case 501:
                                {
                                    System.out.println("Mr Srinivas");
                                    System.out.println("BTech CSE 3rd year 2nd Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:10");
                                }
                                break;
                                case 502:
                                {
                                    System.out.println("Miss Maahi");
                                    System.out.println("BTech CSE 3rd year 2nd Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:10");
                                }
                                break;
                                case 503:
                                {
                                    System.out.println("Mr Krishna");
                                    System.out.println("BTech CSE 3rd year 2nd Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:9");
                                }
                                break;
                                case 504:
                                {
                                    System.out.println("Miss Anusha");
                                    System.out.println("BTech CSE 3rd year 2nd Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:10");
                                }
                                break;
                                case 505:
                                {
                                    System.out.println("Mr Sriraj");
                                    System.out.println("BTech CSE 3rd year 2nd Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:8");
                                }
                                break;
                                case 506:
                                {
                                    System.out.println("Miss Teena");
                                    System.out.println("BTech CSE 3rd year 2nd Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:10");
                                }
                                break;
                                case 507:
                                {
                                    System.out.println("Mr Naresh");
                                    System.out.println("BTech CSE 3rd year 2nd Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:7");
                                }
                                break;
                                case 508:
                                {
                                    System.out.println("Mr Mohith");
                                    System.out.println("BTech CSE 1st year 2nd Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:9");
                                }
                                break;
                                case 509:
                                {
                                    System.out.println("Miss Srikala");
                                    System.out.println("BTech CSE 2nd year 1st Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:10");
                                }
                                break;
                                case 510:
                                {
                                    System.out.println("Miss Nithya");
                                    System.out.println("BTech CSE 3rd year 1st Semester");
                                    System.out.println("Result:Pass");
                                    System.out.println("CGPA:10");
                                }
                                break;
                                case 0:System.exit(0);
                                break;
                                default:System.out.println("Invalid Hall ticket number");
                                break;
                            }
                           
                        }
                        break;
                        case 2:
                        {
                            System.out.println("Enter your group");
                            String g=sc.next();
                            System.out.println("Enter which year");
                            int y=sc.nextInt();
                            if(g.equalsIgnoreCase("CSE")&&(y==1||y==2||y==3))
                            {
                                System.out.println("SNo\tSubject\tTime\t\tDate");
                                System.out.println("1\tSub1\t9am to 12pm\t13/07/2018");
                                System.out.println("2\tSub2\t9am to 12pm\t16/07/2018");
                                System.out.println("3\tSub3\t9am to 12pm\t18/07/2018");
                                System.out.println("4\tSub4\t9am to 12pm\t21/07/2018");
                                System.out.println("5\tSub5\t9am to 12pm\t23/07/2018");
                            }
                            if(g.equalsIgnoreCase("IT")&&(y==1||y==2||y==3))
                            {
                                System.out.println("SNo\tSubject\tTime\t\tDate");
                                System.out.println("1\tSub1\t9am to 12pm\t14/07/2018");
                                System.out.println("2\tSub2\t9am to 12pm\t17/07/2018");
                                System.out.println("3\tSub3\t9am to 12pm\t19/07/2018");
                                System.out.println("4\tSub4\t9am to 12pm\t22/07/2018");
                                System.out.println("5\tSub5\t9am to 12pm\t24/07/2018");
                            }
                            if(g.equalsIgnoreCase("EC")&&(y==1||y==2||y==3))
                            {
                                System.out.println("SNo\tSubject\tTime\t\tDate");
                                System.out.println("1\tSub1\t2pm to 5pm\t13/07/2018");
                                System.out.println("2\tSub2\t2pm to 5pm\t16/07/2018");
                                System.out.println("3\tSub3\t2pm to 5pm\t18/07/2018");
                                System.out.println("4\tSub4\t2pm to 5pm\t21/07/2018");
                                System.out.println("5\tSub5\t2pm to 5pm\t23/07/2018");
                            }
                            if(g.equalsIgnoreCase("EEE")&&(y==1||y==2||y==3))
                            {
                                System.out.println("SNo\tSubject\tTime\t\tDate");
                                System.out.println("1\tSub1\t2pm to 5pm\t14/07/2018");
                                System.out.println("2\tSub2\t2pm to 5pm\t17/07/2018");
                                System.out.println("3\tSub3\t2pm to 5pm\t19/07/2018");
                                System.out.println("4\tSub4\t2pm to 5pm\t22/07/2018");
                                System.out.println("5\tSub5\t2pm to 5pm\t24/07/2018");
                            }
                            if(g.equalsIgnoreCase("Mechanical")&&(y==1||y==2||y==3))
                            {
                                System.out.println("SNo\tSubject\tTime\t\tDate");
                                System.out.println("1\tSub1\t9am to 12pm\t13/07/2018");
                                System.out.println("2\tSub2\t9am to 12pm\t16/07/2018");
                                System.out.println("3\tSub3\t9am to 12pm\t18/07/2018");
                                System.out.println("4\tSub4\t9am to 12pm\t21/07/2018");
                                System.out.println("5\tSub5\t9am to 12pm\t23/07/2018");
                            }
                            if(g.equalsIgnoreCase("Civil")&&(y==1||y==2||y==3))
                            {
                                System.out.println("SNo\tSubject\tTime\t\tDate");
                                System.out.println("1\tSub1\t9am to 12pm\t14/07/2018");
                                System.out.println("2\tSub2\t9am to 12pm\t17/07/2018");
                                System.out.println("3\tSub3\t9am to 12pm\t19/07/2018");
                                System.out.println("4\tSub4\t9am to 12pm\t22/07/2018");
                                System.out.println("5\tSub5\t9am to 12pm\t24/07/2018");
                            }
                            
                        }
                        break;
                        case 3:
                        {
                            System.out.println("Enter your group");
                            String g=sc.next();
                            System.out.println("Enter which year");
                            int y=sc.nextInt();
                            if(g.equalsIgnoreCase("CSE")&&(y==1||y==2||y==3))
                            {
                            System.out.println("Without late fee Rs:1500 and Last date to pay the Exam fee is 25/06/2018");
                            System.out.println("with late fee Rs:2500 last date 30/06/2018");
                           }
                           else if(g.equalsIgnoreCase("IT")&&(y==1||y==2||y==3))
                            {
                            System.out.println("Without late fee Rs:1500 and Last date to pay the Exam fee is 23/06/2018");
                            System.out.println("with late fee Rs:2500 last date 30/06/2018");
                           }
                           else if(g.equalsIgnoreCase("EC")&&(y==1||y==2||y==3))
                            {
                            System.out.println("Without late fee Rs:1500 and Last date to pay the Exam fee is 20/06/2018");
                            System.out.println("with late fee Rs:2500 last date 30/06/2018");
                           }
                           else if(g.equalsIgnoreCase("EEE")&&(y==1||y==2||y==3))
                            {
                            System.out.println("Without late fee Rs:1500 and Last date to pay the Exam fee is 21/06/2018");
                            System.out.println("with late fee Rs:2500 last date 30/06/2018");
                           }
                           else if(g.equalsIgnoreCase("Civil")&&(y==1||y==2||y==3))
                            {
                            System.out.println("Without late fee Rs:1500 and Last date to pay the Exam fee is 24/06/2018");
                            System.out.println("with late fee Rs:2500 last date 30/06/2018");
                           }
                           else if(g.equalsIgnoreCase("Mechanical")&&(y==1||y==2||y==3))
                            {
                            System.out.println("Without late fee Rs:1500 and Last date to pay the Exam fee is 26/06/2018");
                            System.out.println("with late fee Rs:2500 last date 30/06/2018");
                           }
                           else
                           System.out.println("Group not Registered");
                        }
                        break;
                        case 0:System.exit(0);
                        break;
                        default:System.out.println("Select 1 to 3");
                    }
            }
            break;
            case 3:{
                System.out.println("Your selected Sports");
                System.out.println("Following sports are available in our college to enroll");
                System.out.println("1)Cricket");
                System.out.println("2)Foot Ball");
                System.out.println("3)Volley Ball");
                System.out.println("4)Tennis");
                System.out.println("5)Basket Ball");
                System.out.println("Sellect 1 to 5 to enroll your name or press 0 to exit");
                int sop=sc.nextInt();
                switch(sop)
                {
                    case 1:System.out.println("Your enrolled for Cricket");
                    break;
                    case 2:System.out.println("Your enrolled for Foot Ball");
                    break;
                    case 3:System.out.println("Your enrolled for Volley Ball");
                    break;
                    case 4:System.out.println("Your enrolled for Tennis");
                    break;
                    case 5:System.out.println("Your enrolled for Basket Ball");
                    break;
                    case 0:System.exit(0);
                    break;
                    default:System.out.println("Sellect 1 to 5 to enroll your name or press 0 to exit");
                    break;
                }
            }
             break;
            case 4:
            {
                System.out.println("Dear Faculty enter your username");
                String name=sc.next();
                System.out.println("Enter your password");
                String pwd=sc.next(); 
                if(pwd.equals("1234"))
                {
                    System.out.println("Welocome Mr/Mrs"+" "+name);
                    System.out.println("Following are the Time table for the coming day to conduct the clasess");
                    System.out.println("SNo\tSubject\tTime");
                    System.out.println("1\tSub1\t9am to 10am");
                    System.out.println("2\tSub2\t11am to 12am");
                    System.out.println("3\tSub3\t3pm to 4pm");
                }
                else
                {
                    System.out.println("Invalid credentials");
                }
           }
            break;
            case 5:
            {
                System.out.println("Dear Student enter your username");
                String name=sc.next();
                System.out.println("Enter your password");
                String pwd=sc.next(); 
                if(pwd.equals("1234"))
                {
                    System.out.println("Welocome Mr/Mrs"+" "+name);
                    System.out.println("Following are the Time table for the coming day to attend the clasess");
                    System.out.println("SNo\tSubject\tTime");
                    System.out.println("1\tSub1\t9am to 10am");
                    System.out.println("2\tSub2\t11am to 12am");
                    System.out.println("3\tSub3\t3pm to 4pm");
                }
                else
                {
                    System.out.println("Invalid credentials");
                }
           }
            break;
            case 0:System.exit(0);
            break;
            default:System.out.println("choose1 to 5 only");
            break;
        }
    }
}