package lesson34_Generics_Wildcards;

public class Animal {
    private int id;

    public Animal (){

    }

    public Animal(int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public String toString(){
        return String.valueOf(id);
    }
}
