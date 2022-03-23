package homeworkw7;

public class Program14 {

    String firstName;
    String lastName;
    int age;


    public static void main(String[] args) {

        Program14 person1 = new Program14();
        person1.setFirstName(""); // firstName is set to empty string
        person1.setLastName(""); // lastName is set to empty string
        person1.setAge(10);
        System.out.println("age: "+person1.getAge());
        System.out.println("fullName= " + person1.getFullName());
        System.out.println("teen= " + person1.isTeen());

        person1.setFirstName("John"); // firstName is set to John
        person1.setAge(18);
        System.out.println("fullName= " + person1.getFullName());
        System.out.println("teen= " + person1.isTeen());

        person1.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person1.getFullName());

    }

    public String getFirstName()
    {

        return firstName;
    }

    public void setFirstName(String fname)
    {
        this.firstName = fname;

    }

    public String getLastName()
    {

        return lastName;
    }

    public void setLastName(String lname)
    {
        this.lastName = lname;

    }

    public int getAge()
    {

        return age;
    }

    public void setAge(int a)
    {
        if(a<0 ||a>100)
        {
            a = 0;
        }
        this.age = a;

    }

    public boolean isTeen()
    {

        if(age>12 && age <20)
        {
            return true;
        }
        else
            return false;
    }

    public String getFullName()
    {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()){
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        }
        else {
            return firstName + " " + lastName;
        }
    }

}
