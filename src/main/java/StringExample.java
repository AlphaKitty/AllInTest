public class StringExample {
    final static String static1 = "myString";

    public static void main(String[] args) {
        String slot1 = static1;
        String slot2 = "my" + "String";
        String slot3 = new String(static1);
        String slot4 = new String("myString");
        String slot5 = new String(slot1);
    }

}
