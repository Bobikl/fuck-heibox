package s9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: InlineMeValidationDisabled.java */
/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface m {
    String value();
}
