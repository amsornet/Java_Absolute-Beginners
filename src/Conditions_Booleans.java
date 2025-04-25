public class Conditions_Booleans {
    public static void main(String[] args) {
        int x = 6;
        int y = 23;
        int z = 10;
        boolean compare = !(x < y && y > z) || (2 == 5 || x + 7 > y);


        System.out.println(compare);

    }
}
