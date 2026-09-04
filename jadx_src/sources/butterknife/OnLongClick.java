package butterknife;

import androidx.annotation.d0;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import butterknife.internal.ListenerClass;
import butterknife.internal.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ListenerClass(method = {@e(defaultReturn = "true", name = "onLongClick", parameters = {AndroidComposeViewAccessibilityDelegateCompat.f15475z}, returnType = "boolean")}, setter = "setOnLongClickListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f15475z, type = "android.view.View.OnLongClickListener")
public @interface OnLongClick {
    @d0
    int[] value() default {-1};
}
