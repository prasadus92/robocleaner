package com.marshmallow.robocleaner.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target ({ElementType.METHOD, ElementType.FIELD})
@Retention (RetentionPolicy.RUNTIME)
@Constraint (validatedBy = PairValidator.class)
public @interface Pair {

    String message() default "accepted value is a pair of X and Y";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
