package kramarenko.hw21;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Service {
    public static Map<String, Object> classSearch() {
        Reflections ref = new Reflections(Main.class.getPackage().getName());
        Set<Class<?>> classSet = ref.getTypesAnnotatedWith(AutoCreate.class);
        Map<String, Object> map = new HashMap<>();
        for (Iterator<Class<?>> iterator = classSet.iterator(); iterator.hasNext(); ) {
            Class<?> clas = iterator.next();
            Object obj = null;

            Field[] f = clas.getDeclaredFields();
            for (int i = 0; i < f.length; i++) {
                Field fields = f[i];
                fields.setAccessible(true);
                if (!fields.isAnnotationPresent(Multiplier.class)) {
                    continue;
                }
                try {
                    obj = clas.newInstance();
                    if (fields.get(obj) instanceof Number) {
                        System.out.println(fields.getName() + ": " + fields.get(obj));
                        if (!fields.getAnnotation(Multiplier.class).value().equals(MathOperation.MULTIPLICATION)) {
                            fields.set(obj, ((Number) fields.get(obj)).intValue() * 3);
                            System.out.println("Multiply: " + fields.get(obj));
                        } else {
                            fields.set(obj, ((Number) fields.get(obj)).intValue() +
                                    ((Number) fields.get(obj)).intValue());
                            System.out.println("Addition: " + fields.get(obj));
                        }
                    }
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            map.put(clas.getName(), obj);
        }
        return map;
    }
}
