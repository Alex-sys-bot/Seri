package ru.sapteh;

public abstract class Animals implements Eat, Voice, Drive {
   private String name = "";
   private int weight = 0;
   private int age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String eat(){
        return null;
    }

    public String drive() {
        return null;
    }
    public String voice(){
        return null;
    }


    public String toString(){
        return "Name: " + getName() + "\n" +
         "Age: " + getAge() + "\n" +
         "Weight: " + getWeight() + "\n" +
         "Voice: " + voice() + "\n" +
         "Eat: " + eat() + "\n" +
         "Drive: " + drive() + "\n";
    }

    public Animals(String name, int age, int weight){
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

}
