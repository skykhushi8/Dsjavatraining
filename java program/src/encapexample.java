public class encapexample {
    public static void main(String[] args){
        Students students = new Students();

        students.setName("abc");
        students.setId("cs63");
        students.setEmail("abc@gmail.com");
        students.setAddress("Lucknow");

        System.out.println(students.getName() + students.getId() + students.getEmail() + students.getAddress());

    }
}

class Students{
    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    String Id;
    String Email;
    String Address;
}