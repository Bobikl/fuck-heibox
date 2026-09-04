package butterknife;

import androidx.annotation.d0;
import butterknife.internal.ListenerClass;
import butterknife.internal.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass(method = {@e(name = "onCheckedChanged", parameters = {"android.widget.CompoundButton", "boolean"})}, setter = "setOnCheckedChangeListener", targetType = "android.widget.CompoundButton", type = "android.widget.CompoundButton.OnCheckedChangeListener")
public @interface OnCheckedChanged {
    @d0
    int[] value() default {-1};
}
