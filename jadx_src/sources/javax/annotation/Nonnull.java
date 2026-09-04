package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

/* JADX INFO: loaded from: classes5.dex */
@TypeQualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnull {

    public static class Checker implements TypeQualifierValidator<Nonnull> {
        @Override // javax.annotation.meta.TypeQualifierValidator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public When a(Nonnull nonnull, Object obj) {
            return obj == null ? When.NEVER : When.ALWAYS;
        }
    }

    When when() default When.ALWAYS;
}
