package wj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: ajcDeclareParents.java */
/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    boolean isExtends();

    String parentTypes();

    String targetTypePattern();
}
