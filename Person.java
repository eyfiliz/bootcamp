package bolum9;

public class Person {

  private String firstName;
  private String lastName;
  private int age;

  Person() {

  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public boolean isTeen() {
    return (12 < age && age < 18);
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.setFirstName("");   // firstName is set to empty string
    person.setLastName("");    // lastName is set to empty string
    person.setAge(10);
    System.out.println("Full Name = " + person.getFullName());
    System.out.println("Teen = " + person.isTeen());
    person.setFirstName("John");    // firstName is set to John
    person.setAge(18);
    System.out.println("Full Name = " + person.getFullName());
    System.out.println("Teen = " + person.isTeen());
    person.setLastName("Smith");    // lastName is set to Smith
    System.out.println("Full Name = " + person.getFullName());
  }
}
