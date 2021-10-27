package kramarenko.hw21;
import java.lang.reflect.Method;
import java.util.Map;

import static java.util.Arrays.stream;
public class Main {
    public static void main(String[] args) {

        Map<String, Object> m = Service.classSearch();
                for (Object ob : m.values()) {
                    accept(ob);
                }
            }

            private static void accept(Object o) {
                for (Method x : o.getClass().getDeclaredMethods()) {
                    if (x.isAnnotationPresent(Init.class)) {
                        x.setAccessible(true);
                        try {
                            x.invoke(o);
                        } catch (Throwable ex) {
                            System.err.println(" Something is wrong  ");
                        }
                    }
                }
            }
        }

