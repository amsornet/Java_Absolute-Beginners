
public class StaticMeanDog {

  protected static int count = 0;
  protected String name;
  protected int age;

  public StaticMeanDog (String name, int age) {
    this.name = name;
    this.age = age;
    StaticMeanDog.count += 1;

  }

  public void display2() {
    System.out.println("I am a dog!");
  }

  public static void display() {
    System.out.println("I am a dog!");

  }
}

