package attendancemanagementsystem2;
import java.util.*;

public class AttendanceManagementSystem2 {
    public static Scanner in = new Scanner(System.in);
    public static boolean stat = true;
    public static int choice1,Options,Age,Id;
    public static String Fname,Mname,Lname,Course,Gender,SearchName,AttendanceDets,StudentDets,Status,date,Section,confirm = "yes" + "no";
    static List<Dets> studList = new ArrayList<>();
    static Set<UniqueID> uniqueid = new HashSet<>();
    
    private void addNewStudents(Dets students){
        studList.add(students);
    }
    
    private void searchByFname(String fname){
        for(Dets students: studList){
            if(students.getFname().equals(fname)){
            System.out.print("\n----------------------------------------------"
                            +"\nSECTION : "+Section+" | "  + "DATE: " + date
                            +"\t\nSTUDENT DETAIL"
                            +"\n----------------------------------------------"
                            +"\nID     : " +students.getId()
                            +"\nAge    : " +students.getAge()
                            +"\nFname  : " +students.getFname()
                            +"\nMname  : " +students.getMname()
                            +"\nLname  : " +students.getLname()
                            +"\nGender : " +students.getGender()
                            +"\nCourse : " +students.getCourse()
                            +"\n");
           }
        }
     }
    
    private void searchByMname(String mname){
        for(Dets students: studList){
            if(students.getMname().equals(mname)){
                System.out.print("\n----------------------------------------------"
                            +"\nSECTION : "+Section+" | "  + "DATE: " + date
                            +"\t\nSTUDENT DETAIL"
                            +"\n----------------------------------------------"
                            +"\nID     : " +students.getId()
                            +"\nAge    : " +students.getAge()
                            +"\nFname  : " +students.getFname()
                            +"\nMname  : " +students.getMname()
                            +"\nLname  : " +students.getLname()
                            +"\nGender : " +students.getGender()
                            +"\nCourse : " +students.getCourse()
                            +"\n");
           }
        }
    }
    
    private void searchByLname(String lname){
        for(Dets students: studList){
            if(students.getLname().equals(lname)){
                System.out.print("\n----------------------------------------------"
                            +"\nSECTION : "+Section+" | "  + "DATE: " + date
                            +"\t\nSTUDENT DETAIL"
                            +"\n----------------------------------------------"
                            +"\nID     : " +students.getId()
                            +"\nAge    : " +students.getAge()
                            +"\nFname  : " +students.getFname()
                            +"\nMname  : " +students.getMname()
                            +"\nLname  : " +students.getLname()
                            +"\nGender : " +students.getGender()
                            +"\nCourse : " +students.getCourse()
                            +"\n");
            }
       }
    }
    
    private void showallStudent(){
         for(Dets students: studList){
             System.out.println("----------------------------------------------"
                               +"\n\tSHOW ALL STUDENTS"
                               +"\nSECTION : "+ Section + " | " + "\nDATE: " +date
                             +"\n----------------------------------------------"
                             +"\nID     : " +students.getId()
                             +"\nAge    : " +students.getAge()
                             +"\nFname  : " +students.getFname()
                             +"\nMname  : " +students.getMname()
                             +"\nLname  : " +students.getLname()
                             +"\nGender : " +students.getGender()
                             +"\nCourse : " +students.getCourse()                             
                             +"\n");     
        }
    }
    
    private void addID(){
            System.out.print("----------------------------------"
                          + "\n        ADD NEW ENROLLEES"
                          + "\n       Input Details here..."
                          + "\n-------------------------------------"
                          + "\nSECTION : "+Section
                          + "\nEnter Date: ");
        date = in.next();
            System.out.print("Enter ID: ");
                Id = in.nextInt();
                     for(UniqueID cuid: uniqueid){
            if(cuid.getuid() == Id){
                System.out.print("\n!!!This ID is already Existed\n\n");
                addID();
            }
        }
    }
    
    private Dets AddNewStudent(){
        addID();
        System.out.print("Enter First name:");
        Fname = in.next();
        System.out.print("Enter Middle name: ");
        Mname = in.next();
        System.out.print("Enter Last name: ");
        Lname = in.next();
        System.out.print("Enter Age: ");
        Age = in.nextInt();
        System.out.print("Enter Gender: ");
        Gender= in.next();
        System.out.print("\nNOTE: USE HYPEN(-) ONLY INSTEAD OF SPACING"
                + "\nCourse: ");
        Course= in.next();
       
        System.out.print("\n----------------------------------"
                        +"\n        NEW STUDENT DETAIL"
                        +"\n           CONFIRMATION"
                        +"\n----------------------------------"
                           +"\nId: " + Id
                           +"\nName: " + Fname+" "+Mname+" "+Lname
                           +"\nAge: "+ Age
                           +"\nGender: "+ Gender
                           +"\nCourse: "+ Course
                           +"\n------------------------------"
                           +"\nARE YOU SURE IN THIS INFORMATION??\n"
                           + "\nNote: Type yes/no!!!"
                           + "\nTYPE HERE: ");
        confirm = in.next();
        if(confirm.equalsIgnoreCase("yes")){
            Dets students = new Dets(Id,Age,Fname,Mname,Lname,Gender,Course,Status);
            System.out.println("\nYour Record has been saved...\n");
            return students;
        }else if(confirm.equalsIgnoreCase("no")){
            System.out.println("\nYour Record will not submited.\n");
            choices();
        }else{
            System.out.println("\nPlease try again Your Record not saved...\n");
            AddNewStudent();
        }
        UniqueID nuid = new UniqueID(Id);
        uniqueid.add(nuid);
        Dets students = new Dets(Id,Age,Fname,Mname,Lname,Gender,Course,Status);
        return students;
   }
     
   public static void choices(){
       stat = false;
       while(!stat){
        AttendanceManagementSystem2 select = new AttendanceManagementSystem2(); 
        try{
         do{
           System.out.print("\n----------------------------------"
                           +"\n        ATTENDANCE SYSTEM"
                           +"\n     CHOOSE FOLLOWING OPTIONS"
                           +"\n----------------------------------"
                           +"\n1. ADD NEW STUDENT              "
                           +"\n2. ATTENDANCE                   "
                           +"\n3. SHOW STUDENT LIST            "
                           +"\n4. SEARCH STUDENT       "
                           +"\n5. YOU WANT TO CHANGE SECTION"
                           +"\n6. EXIT"
                           +"\n------------------------------"
                           +"\nENTER YOUR CHOICE: ");
           Options = in.nextInt();
           switch(Options){
               case 1:
                   Dets students = select.AddNewStudent();
                   select.addNewStudents(students);
                   break;
               case 2:
                   Attendance ();
                   break;
               case 3:
                   select.showallStudent();
                   break;
               case 4:    
                   System.out.print("\n----------------------------------------------"
                           + "\n\t\t NOTE!!!" 
                           + "\nOnly Firstname/Middlename/Lastname can be searched."
                           + "\nUse Upper case in first letter of Name."
                           + "\n----------------------------------------------"
                           + "\nSearch student name : ");
                   SearchName = in.next();
                   select.searchByFname(SearchName);
                   select.searchByMname(SearchName);
                   select.searchByLname(SearchName);
                   break;
                case 5:    
                   mainfunct();
                   break;
               case 6: 
                   System.out.println("\n\nTHANK YOU FOR USING OUR SYSTEM\n\n");
                   System.exit(0); 
                   break;
                   default:
                        System.out.println("Sorry!!! Your Choice is not in the following OPTIONS"
                                           + "\nPLEASE TRY AGAIN");
            }
        }while(Options != 6);
    }
       catch(Exception x){
           String and = in.next();
           System.out.print("NOTE!!!"+"\nNumbers Only");
           choices();
       } 
       }
   }

    public static void mainfunct(){
        stat = false;
        while(!stat){
            try{
                do{
                    System.out.print("************************************"
                                 +"\n\nWELCOME TO ATTENDANCE SYSTEM"
                                 +"\n\n"+"    "+"[ SELECT SECTION ]"
                                 +"\n\n   '1'   for   SECTION-1"
                                 +"\n\n   '2'   for   SECTION-2"
                                 +"\n\n   '3'   for   SECTION-3"
                                 +"\n\n   '4'   for   EXIT"
                                 +"\n**************************************"
                                 +"\n\nENTER YOUR CHOICE: ");
                    choice1 = in.nextInt();
                    switch(choice1){
                        case 1:
                            Section = "Section 1";
                            Section1.main();
                            break;  
                        case 2:
                            Section = "Section 2";
                            Section2.mainfunc2();
                            break; 
                        case 3:
                            Section = "Section 3";
                            Section3.mainfunc3();
                            break; 
                        case 4:
                            System.out.println("THANK YOU");
                            System.exit(0);
                        default :
                            System.out.println("INVALID SECTION"
                                           + "\nPLEASE TRY AGAIN");
                            break;
                    }  
                }while(choice1 != 5);
            }catch(Exception x){
                String and = in.next();
                System.out.print("NOTE!!!"+"\nNumbers Only\n");
            }
        }
    }
    
    public static void main(String [] args){
        mainfunct();
    }
    
    public static void Attendance(){
        System.out.print("\n---------------------------------"
                        +"\n  WELCOME TO OUR CLASS STUDENTS"
                        +"\nYour Attendance is Recorded Here"
                        +"\n---------------------------------"
                        +"\nSECTION: "+Section+
                         "\nNote: Number only for Date & ID & Age"
                                 + "\nDATE: ");
        date = in.next();
        for(Dets students: studList){
            System.out.print("\n--------------------------"
                            +"\n     STUDENT DETAILS"
                           + "\n--------------------------"
                            +"\nID     : " +students.getId()
                            +"\nAge    : " +students.getAge()
                            + "\nFname  : " +students.getFname()
                            +"\nMname  : " +students.getMname()
                            +"\nLname  : " +students.getLname()
                            +"\nGender : " +students.getGender()
                            +"\nCourse : " +students.getCourse()
                            +"\nStatus : " +students.getStatus()
                            +"\n"
                            +"\nSELECT STATUS OF STUDENT\n"
                            +"\n1. Present \n2. Late \n3.Excused \n4.Absent \n5.Back To Menu"
                            +"\n\nStatus: ");
            int status = in.nextInt();
            System.out.print(""
                    + "\n");
                switch(status){
                    case 1:
                        Status = " Present ";
                        students.setStatus(Status);
                        System.out.print("Student Time In: ");
                        break;
                    case 2:
                        Status = " Late ";
                        students.setStatus(Status);
                        break;   
                    case 3:
                        Status = " Excused ";
                        students.setStatus(Status);
                        break;
                    case 4:
                        Status = " Absent ";
                        students.setStatus(Status);
                        break;
                    case 5:
                        choices();
                        break;
                    default:
                        System.out.println("INVALID STATUS"
                                       +"\nPLEASE TRY AGAIN"); 
            }
        }choices();
    }
}