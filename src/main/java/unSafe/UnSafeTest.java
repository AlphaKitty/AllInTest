package unSafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnSafeTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        System.out.println();
    }
}
