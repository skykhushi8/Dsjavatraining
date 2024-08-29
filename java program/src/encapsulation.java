public class encapsulation {
    public static void main(String[] args){
       // to print trainer profile
       Trainers trainers = new Trainers();
       //1.data add using object n reference
       trainers.Name = "abc";
       trainers.Email = "abc@gmail.com";
       trainers.Technology = "Java";

        System.out.println(trainers.Name + " " +trainers.Email + " " +trainers.Technology);

        //2. data add using object n methods
        trainers.printProfile("def", "def@gmail.com", "Java");

        //3. data add using encapsulation
        trainers.setName("ghi");
        trainers.setEmail("ghi@gmail.com");
        trainers.setTechnology("Java");

        System.out.println(trainers.getName() + trainers.getEmail() + trainers.getTechnology());
    }
}

class Trainers{
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTechnology() {
        return Technology;
    }

    public void setTechnology(String technology) {
        Technology = technology;
    }

    String Name;
    String Email;
    String Technology;

    public void printProfile(String Name, String Email, String Technology) {
        System.out.println(Name + Email + Technology);
    }
}
