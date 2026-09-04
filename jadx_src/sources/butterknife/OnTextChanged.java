package butterknife;

import androidx.annotation.d0;
import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass(callbacks = Callback.class, remover = "removeTextChangedListener", setter = "addTextChangedListener", targetType = "android.widget.TextView", type = "android.text.TextWatcher")
public @interface OnTextChanged {

    public enum Callback {
        TEXT_CHANGED,
        BEFORE_TEXT_CHANGED,
        AFTER_TEXT_CHANGED
    }

    Callback callback() default Callback.TEXT_CHANGED;

    @d0
    int[] value() default {-1};
}
