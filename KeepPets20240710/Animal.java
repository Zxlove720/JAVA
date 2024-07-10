package KeepPets20240710;

public class Animal {
    private String color;
    private int age;

    public Animal(){}
    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String something) {
        System.out.println(this.age + "岁的" + this.color + "色动物在吃" + something);
    }

}
