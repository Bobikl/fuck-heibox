package yi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.android.extensions.CacheImplementation;

/* JADX INFO: compiled from: ContainerOptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface a {
    CacheImplementation cache() default CacheImplementation.HASH_MAP;
}
