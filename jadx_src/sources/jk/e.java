package jk;

import cl.e0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: compiled from: UnknownInitialization.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@e0({})
@cl.e({TypeUseLocation.LOCAL_VARIABLE, TypeUseLocation.RESOURCE_VARIABLE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface e {
    Class<?> value() default Object.class;
}
