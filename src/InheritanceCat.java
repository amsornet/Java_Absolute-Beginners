public class InheritanceCat extends CreatingClassesDog {

  private int food;
  public InheritanceCat (String name, int age, int food) {
    super (name, age);
    this.food = food;
  }

  public InheritanceCat (String name, int age) {
    super(name, age);
    this.food = 50;
  }

  public InheritanceCat (String name) {
    super(name, 0);
    this.food = 50;
  }

  public void speak() {
    this.getAge();
    System.out.println("Meow my name is " + this.name + " and I get fed " + this.food);
  }

  public void eat(int x) {
    this.food -= x;
  }

}
