package studentmanagement;
import java.util.*;

public class AddStudent {
    public int rollNo;
    public String name;
    public String division;
    public int age;
    public String address;
    public AddStudent(int rollNo,String name,String division,int age,String address){
        this.rollNo = rollNo;
        this.name = name;
        this.division = division;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddStudent{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


    public void inputDetails(){

        Scanner sc = new Scanner(System.in);
        List<AddStudent> studentDetails = new ArrayList<>();
        AddStudent addStudent;
        addStudent = new AddStudent(1,"Harini","B",22,"Hyderabad");
        studentDetails.add(addStudent);
        System.out.println(studentDetails);
        //AddStudent addStudent = new AddStudent(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextLine());
       // studentDetails.add(addStudent);

    }

}
//    TreeSet<Integer> rollNoSet = new TreeSet<Integer>();
//    TreeSet<String> nameSet = new TreeSet<String>();
//    TreeSet<String> divisionSet = new TreeSet<String>();
//    TreeSet<Integer> ageSet = new TreeSet<Integer>();
//    TreeSet<String> addressSet = new TreeSet<String>();
//        System.out.println("Enter the Student Roll no: ");
//        rollNo = sc.nextInt();
//        System.out.println("Enter student Name: ");
//        name = sc.nextLine();
//        System.out.println("Enter student Division: ");
//        division = sc.nextLine();
//        System.out.println("Enter student Age: ");
//        age = sc.nextInt();
//        System.out.println("enter student Address: ");
//        address = sc.nextLine();
//public void addStudentDetails() {
//    Scanner sc = new Scanner(System.in);
//    boolean flag1 = true;
//    while (flag1) {
//        System.out.println("Enter 'yes' to add a Student and 'no' to exit");
//        String choice1 = sc.nextLine();
//        switch (choice1) {
//            case "yes":
//                System.out.println("Enter the student details--");
//                inputDetails();
//                break;
//            case "no":
//                System.out.println("Exit--");
//                flag1 = false;
//            default:
//                System.out.println("--Please enter a valid choice--");
//        }
//    }
//}