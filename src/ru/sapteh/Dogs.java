package ru.sapteh;

public class Dogs extends Animals {
    private String breed = "";

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }


    public Dogs(String name, int age, int weight, String breed){
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public String voice(){
        return "Гавкает";
    }

    @Override
    public String eat(){
        return "Вафли";
    }

    @Override
    public String drive(){
        return "Бегает";
    }

    public String toString(){
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Voice: " + voice() + "\n" +
                "Eat: " + eat() + "\n" +
                "Drive: " + drive() + "\n" +
                "Breed" + getBreed();
    }

}
