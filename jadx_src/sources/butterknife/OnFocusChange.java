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
@ListenerClass(method = {@e(name = "onFocusChange", parameters = {AndroidComposeViewAccessibilityDelegateCompat.f15475z, "boolean"})}, setter = "setOnFocusChangeListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f15475z, type = "android.view.View.OnFocusChangeListener")
public @interface OnFocusChange {
    @d0
    int[] value() default {-1};
}
