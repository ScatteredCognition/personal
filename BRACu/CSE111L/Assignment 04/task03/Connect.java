public class Connect {
    int totalAdvisee = 0;
    Student[] adviseeList = new Student[5];

    public Connect() {
        System.out.println("Connect is ready to use!");
    }

    public void login(Student student) {
        if(student.email != null && student.isPasswordSet() == true) {
            student.setLogin(true);
            System.out.println("Login successful");
        } else {
            System.out.println("Email and password need to be set.");
        }
    }

    public void advising(Student student, String ... courses) {
        if(student.getLogin() == true) {
            if(courses.length <= 0) {
                System.out.println("You haven't selected any courses.");
            } else if (courses.length > 3) {
                System.out.println("You need special approval to take more than 3 courses.");
            } else {
                for(int i = 0; i < courses.length; i++) {
                    student.courses[i] = courses[i];
                }
                adviseeList[totalAdvisee] = student;
                totalAdvisee++;
                System.out.println("Advising successful!");
            }
        } else {
            System.out.println("Please login to advise courses!");
        }
    }

    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + totalAdvisee);
        for(int i = 0; i < totalAdvisee; i++) {
            System.out.print("Name: " + adviseeList[i].name + " ");
            System.out.println("ID: " + adviseeList[i].id);
            System.out.println("Department: " + adviseeList[i].dept);
            System.out.println("Advised Courses: ");

            for(int j = 0; j < adviseeList[i].courses.length; j++) {
                if(adviseeList[i].courses[j] != null) {
                    System.out.print(adviseeList[i].courses[j] + " ");
                }
            }
            System.out.println();
            System.out.println("==============");
        }
    }

}