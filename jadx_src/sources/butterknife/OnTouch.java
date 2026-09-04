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
@ListenerClass(method = {@e(defaultReturn = "true", name = "onTouch", parameters = {AndroidComposeViewAccessibilityDelegateCompat.f15475z, "android.view.MotionEvent"}, returnType = "boolean")}, setter = "setOnTouchListener", targetType = AndroidComposeViewAccessibilityDelegateCompat.f15475z, type = "android.view.View.OnTouchListener")
public @interface OnTouch {
    @d0
    int[] value() default {-1};
}
