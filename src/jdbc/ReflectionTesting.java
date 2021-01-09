package jdbc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
class A {

    protected int a;
}

class B extends A {

    protected int b;
    public B() {

    }
    public B(int a, int b) {
        super();     // 1
        super.a = a; // 2
//        super.b = b; // 3
    }
}

class C extends B {

    protected int c;

    public C(int a, int b) {
//        super(a); // 4
    }

    public C(int a) {
        super(a, 10); // 5
    }
}
 class ReflectionTesting {

    protected ReflectionTesting() {

    }
    protected int abc() {
        return 1;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        LocalDate.now().getYear();
        Class student = Class.forName("jdbc.Student");
        Constructor[] declaredConstructors = student.getDeclaredConstructors();
        Constructor[] constructors = student.getConstructors();
        Field[] declaredFields = student.getDeclaredFields();
        Field[] fields = student.getFields();
        Method[] declaredMethods = student.getDeclaredMethods();
        Method[] methods = student.getMethods();

        for(Constructor dc : declaredConstructors ) {
            System.out.println("Declared Constructor" + dc.getName());
        }

        for(Constructor c: constructors) {
            System.out.println("Constructor " + c.getName());
        }

        for(Field df : declaredFields) {
            System.out.println("Declared Field " + df.getName());
        }

        for(Field f : fields) {
            System.out.println("Field " + f.getName());
        }

        for(Method dm : declaredMethods) {
            System.out.println("Decalred Method " + dm.getName());
        }

        for(Method m : methods) {
            System.out.println("Method " + m.getName());
        }

        switch(2) {
            case 1 :
                System.out.println("I am 1");
                break;
            case 23:
                System.out.println("goopa");

        }


//        char[] array = new char[-1];
        char[] array1 = new char[0];
//        char[] array12 = new char[10000000000000];
        char ch = '5';
        int ch2 = 6;
        System.out.printf("Marks for my assignment is %d%d",ch, ch2);


    }
}
