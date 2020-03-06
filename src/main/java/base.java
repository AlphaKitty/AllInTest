public class base {
    public static void main(String[] args) {
        // int a = 10;
        // long b = 10L;
        // double c = 10.0d;
        // System.out.println(a == b);
        // System.out.println(a == c);

        // String要用equals的原因 intern方法可以把堆中的String对象的值放到常量池里
//         String a = "123";
//         String b = new String("123");
        // String c = new String(a);
//         System.out.println(a == b);
        // System.out.println(a.equals(b));
        // System.out.println(b.toString() == a);
        // System.out.println(a == b.intern());

        // abcd初始化这一行会把abcd四个对象一起入到操作数栈里 统一做一次astore
//        String a = "aaa", b = "bbb", c = "ccc", d = "ddd";
//        String abcd = a + b + c + d;

        // JVM对-128~127之间的整数在内存里做了特殊映射 落在这个范围里的整数指向的都是一个地址 超出范围的就不一定了
//        Integer a = 128;
//        Integer b = 128;
//        Integer c = 127;
//        Integer d = 127;
//        System.out.println(a == b);
//        System.out.println(c == d);
    }
}
