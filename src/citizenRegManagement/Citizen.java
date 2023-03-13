package citizenRegManagement;

public class Citizen {
   private String at;
   private String firstName;
   private String lastName;
   private String age;
   private String born;
   private String afm;
   private String address;

   public Citizen(String at, String firstName, String lastName, String age, String born, String afm, String address) {
      this.at = at;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.born = born;
      this.afm = afm;
      this.address = address;
   }

   @Override
   public String toString() {
      return "Citizen{" +
              "at='" + at + '\'' +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", age='" + age + '\'' +
              ", born='" + born + '\'' +
              ", afm='" + afm + '\'' +
              ", address='" + address + '\'' +
              '}';
   }
}
