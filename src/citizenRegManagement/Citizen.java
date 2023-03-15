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

    //getters and setters

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
