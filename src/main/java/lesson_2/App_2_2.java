package lesson_2;

/**
 * поведение this в кострукторе
 */
public class App_2_2 {

    public App_2_2() {
        this(8);
    }

    public App_2_2(int c) {
        //recursive invocation
        //this();
    }
}
