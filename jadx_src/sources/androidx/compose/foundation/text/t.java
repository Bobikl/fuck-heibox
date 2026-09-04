package androidx.compose.foundation.text;

import android.view.KeyEvent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldKeyInput.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/key/b;", "", ak.av, "(Landroid/view/KeyEvent;)Z", "isTypedEvent", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class t {
    public static final boolean a(@dl.d KeyEvent isTypedEvent) {
        f0.p(isTypedEvent, "$this$isTypedEvent");
        return isTypedEvent.getAction() == 0 && isTypedEvent.getUnicodeChar() != 0;
    }
}
