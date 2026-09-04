package butterknife;

import androidx.annotation.d0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
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
@ListenerClass(method = {@e(name = "onItemClick", parameters = {"android.widget.AdapterView<?>", AndroidComposeViewAccessibilityDelegateCompat.f15475z, Constants.INT, Constants.LONG})}, setter = "setOnItemClickListener", targetType = "android.widget.AdapterView<?>", type = "android.widget.AdapterView.OnItemClickListener")
public @interface OnItemClick {
    @d0
    int[] value() default {-1};
}
