package ru.sapteh;

public class Cats extends Animals {
   private String color = "";

   public String getColor() {
      return color;
   }
   public void setColor(String color) {
      this.color = color;
   }


   public Cats(String name, int age, int weight, String color){
      super(name, age, weight);
      this.color = color;
   }

   @Override
   public String eat(){
      return "Колбаса";
   }

   @Override
   public String drive(){
      return "Бегает";
   }
   @Override
   public String voice(){
      return "Мяукает";
   }
   public String toString(){
      return "Name: " + getName() + "\n" +
              "Age: " + getAge() + "\n" +
              "Weight: " + getWeight() + "\n" +
              "Voice: " + voice() + "\n" +
              "Eat: " + eat() + "\n" +
              "Drive: " + drive() + "\n" +
              "Color: " + getColor();
   }

}
