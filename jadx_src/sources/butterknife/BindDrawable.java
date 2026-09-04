package butterknife;

import androidx.annotation.f;
import androidx.annotation.v;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BindDrawable {
    @f
    int tint() default -1;

    @v
    int value();
}
