public class inheritance {
    public static void main(String[] args){
        Parents parents = new Parents();
        parents.printParent();
        // using inheritance to call grandparents method
        parents.printGrandparent();
    }
}

class Parents extends Grandparents{
    void printParent(){
        System.out.println("I'm parent");
    }
}

class Grandparents{
    void printGrandparent(){
        System.out.println("I'm grandparent");
    }
}