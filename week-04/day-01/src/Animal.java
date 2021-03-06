/**
 * Created by Nagy Dóra on 2017.04.03..
 */
public class Animal {
  int hunger;
  int thirst;
  String name;

  @Override
  public String toString() {
    return name + ":" + " hunger = " + hunger + ", thirst = " + thirst;
  }

  public Animal(String name) {
    hunger = 50;
    thirst = 50;
    this.name = name;
  }

  public void eat() {
    hunger -= 1;
  }

  public void drink() {
    thirst -= 1;
  }

  public void play() {
    thirst -= 1;
    hunger -= 1;
  }

  public static void main(String[] args) {
    Animal dolphin = new Animal("dolphin");
    dolphin.drink();
    dolphin.eat();
    dolphin.play();
    System.out.println(dolphin.toString());
  }
}
