public class Student {
    public String name = null;
    public int id = 0;
    public String email = null;
    public String dept = null;
    private String password = null;
    private boolean loginStatus = false;
    public String[] courses = new String[8];

    public Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        System.out.println("Student object is created");
    }

    public void setLogin(boolean status) {
        this.loginStatus = status;
    }

    public boolean getLogin() {
        return loginStatus;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPasswordSet() {
        if(this.password != null) {
            return true;
        } else {
            return false;
        }
    }

}