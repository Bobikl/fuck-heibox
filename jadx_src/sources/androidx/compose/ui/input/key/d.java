package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KeyEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0018\u0010\u0013\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\"\u0018\u0010\u0015\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e*\n\u0010\u0017\"\u00020\u00162\u00020\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/key/b;", "Landroidx/compose/ui/input/key/a;", ak.av, "(Landroid/view/KeyEvent;)J", "key", "", ak.aF, "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Landroidx/compose/ui/input/key/c;", "b", "type", "", "d", "(Landroid/view/KeyEvent;)Z", "isAltPressed", "e", "isCtrlPressed", "f", "isMetaPressed", "g", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    public static final long a(@dl.d KeyEvent key) {
        f0.p(key, "$this$key");
        return f.a(key.getKeyCode());
    }

    public static final int b(@dl.d KeyEvent type) {
        f0.p(type, "$this$type");
        int action = type.getAction();
        if (action != 0) {
            return action != 1 ? c.INSTANCE.c() : c.INSTANCE.b();
        }
        return c.INSTANCE.a();
    }

    public static final int c(@dl.d KeyEvent utf16CodePoint) {
        f0.p(utf16CodePoint, "$this$utf16CodePoint");
        return utf16CodePoint.getUnicodeChar();
    }

    public static final boolean d(@dl.d KeyEvent isAltPressed) {
        f0.p(isAltPressed, "$this$isAltPressed");
        return isAltPressed.isAltPressed();
    }

    public static final boolean e(@dl.d KeyEvent isCtrlPressed) {
        f0.p(isCtrlPressed, "$this$isCtrlPressed");
        return isCtrlPressed.isCtrlPressed();
    }

    public static final boolean f(@dl.d KeyEvent isMetaPressed) {
        f0.p(isMetaPressed, "$this$isMetaPressed");
        return isMetaPressed.isMetaPressed();
    }

    public static final boolean g(@dl.d KeyEvent isShiftPressed) {
        f0.p(isShiftPressed, "$this$isShiftPressed");
        return isShiftPressed.isShiftPressed();
    }
}
