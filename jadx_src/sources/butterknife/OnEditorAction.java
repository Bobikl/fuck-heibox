package butterknife;

import androidx.annotation.d0;
import butterknife.internal.ListenerClass;
import butterknife.internal.e;
import com.meituan.robust.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass(method = {@e(defaultReturn = "true", name = "onEditorAction", parameters = {"android.widget.TextView", Constants.INT, "android.view.KeyEvent"}, returnType = "boolean")}, setter = "setOnEditorActionListener", targetType = "android.widget.TextView", type = "android.widget.TextView.OnEditorActionListener")
public @interface OnEditorAction {
    @d0
    int[] value() default {-1};
}
