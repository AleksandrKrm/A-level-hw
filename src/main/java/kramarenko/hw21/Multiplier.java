package kramarenko.hw21;

import java.lang.annotation.*;


    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Multiplier{
        MathOperation value() default MathOperation.MULTIPLICATION;
    }



