//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // primitive
//        int hello_world = 5;
//        double num2 = 5.0;
//        boolean b = false;
//        char c = 'h';
//        String str = "9";
//
//        int tim = hello_world;
//
//        System.out.println(hello_world);
//        System.out.println(num2);
//        System.out.println(b);
//        System.out.println("c = " + c);
//        System.out.println(str);
//        System.out.println(tim);

        CreatingClassesDog tim = new CreatingClassesDog("tim", 4);
        tim.speak();

        CreatingClassesDog bill = new CreatingClassesDog("bill", 7);
        bill.speak();

        CreatingClassesDog bob = new CreatingClassesDog("bob", 11);
        bob.speak();

        tim.speak();

        int x = tim.getAge();
        System.out.println(x);

        tim.setAge(10);
        tim.speak();

//        tim.add2();

        InheritanceCat tim1 = new InheritanceCat("tim", 18, 100);
        tim1.speak();

        InheritanceCat bob1 = new InheritanceCat("bob", 7);


        InheritanceCat joe = new InheritanceCat("bob", 7);


        tim1.speak();
        bob1.speak();
        joe.speak();

        int x1 = tim1.getAge();

















        }
    }
