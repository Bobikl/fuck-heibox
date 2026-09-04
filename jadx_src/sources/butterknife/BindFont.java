package butterknife;

import androidx.annotation.RestrictTo;
import androidx.annotation.y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BindFont {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface TypefaceStyle {
    }

    @TypefaceStyle
    int style() default 0;

    @y
    int value();
}
