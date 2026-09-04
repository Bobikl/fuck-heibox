package butterknife;

import androidx.annotation.d0;
import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@ListenerClass(callbacks = Callback.class, setter = "setOnItemSelectedListener", targetType = "android.widget.AdapterView<?>", type = "android.widget.AdapterView.OnItemSelectedListener")
public @interface OnItemSelected {

    public enum Callback {
        ITEM_SELECTED,
        NOTHING_SELECTED
    }

    Callback callback() default Callback.ITEM_SELECTED;

    @d0
    int[] value() default {-1};
}
