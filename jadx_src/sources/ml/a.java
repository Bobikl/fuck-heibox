package ml;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

/* JADX INFO: compiled from: EverythingIsNonNull.java */
/* JADX INFO: loaded from: classes5.dex */
@TypeQualifierDefault({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Nonnull
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface a {
}
