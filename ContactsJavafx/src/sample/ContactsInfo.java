package sample;

public class ContactsInfo {
    private String name;
    private String surname;
    private int age;
    private String photo;
    private String email;
    private String phoneNumber;

    public ContactsInfo(String name, String surname, int age,String photo, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age=age;
        this.photo = photo;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactsInformation{" +
                "surname='" + surname + '\'' +
                '}';
    }
}
