package androidx.compose.ui.input.pointer;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\u001a\u0012\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u0004*\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u0004*\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\"\u0018\u0010\u000e\u001a\u00020\u0006*\u00020\u00038Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00020\u0006*\u00020\u00038Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u0006*\u00020\u00038Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\"\u0018\u0010\u0014\u001a\u00020\u0006*\u00020\u00038Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r\"\u0018\u0010\u0016\u001a\u00020\u0006*\u00020\u00038Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r\"\u0018\u0010\u0018\u001a\u00020\u0006*\u00020\u00038Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\"\u0018\u0010\u001a\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r\"\u0018\u0010\u001c\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001b\u0010\r\"\u0018\u0010\u001e\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001d\u0010\r\"\u0018\u0010 \u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u0010\r\"\u0018\u0010\"\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\r\"\u0018\u0010$\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010\r\"\u0018\u0010&\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010\r\"\u0018\u0010(\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b'\u0010\r\"\u0018\u0010*\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b)\u0010\r\"\u0018\u0010,\u001a\u00020\u0006*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b+\u0010\r*\f\b\u0000\u0010-\"\u00020\u00042\u00020\u0004*\f\b\u0000\u0010.\"\u00020\u00042\u00020\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/input/pointer/l0;", ak.av, "()I", "Landroidx/compose/ui/input/pointer/o;", "", "buttonIndex", "", "n", "(II)Z", ak.aF, "(I)I", "d", "o", "(I)Z", "isPrimaryPressed", "q", "isSecondaryPressed", "t", "isTertiaryPressed", "g", "isBackPressed", "j", "isForwardPressed", "b", "areAnyPressed", "i", "isCtrlPressed", "l", "isMetaPressed", "f", "isAltPressed", "e", "isAltGraphPressed", ak.aB, "isSymPressed", "r", "isShiftPressed", "k", "isFunctionPressed", RXScreenCaptureService.KEY_HEIGHT, "isCapsLockOn", "p", "isScrollLockOn", "m", "isNumLockOn", "NativePointerButtons", "NativePointerKeyboardModifiers", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class s {
    public static final int a() {
        return l0.b(0);
    }

    public static final boolean b(int i10) {
        return i10 != 0;
    }

    public static final int c(int i10) {
        if (i10 == 0) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = (i10 & (-97)) | ((i10 & 96) >>> 5); (i12 & 1) == 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    public static final int d(int i10) {
        int i11 = -1;
        for (int i12 = (i10 & (-97)) | ((i10 & 96) >>> 5); i12 != 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    public static final boolean e(int i10) {
        return false;
    }

    public static final boolean f(int i10) {
        return (i10 & 2) != 0;
    }

    public static final boolean g(int i10) {
        return (i10 & 8) != 0;
    }

    public static final boolean h(int i10) {
        return (i10 & 1048576) != 0;
    }

    public static final boolean i(int i10) {
        return (i10 & 4096) != 0;
    }

    public static final boolean j(int i10) {
        return (i10 & 16) != 0;
    }

    public static final boolean k(int i10) {
        return (i10 & 8) != 0;
    }

    public static final boolean l(int i10) {
        return (i10 & 65536) != 0;
    }

    public static final boolean m(int i10) {
        return (i10 & 2097152) != 0;
    }

    public static final boolean n(int i10, int i11) {
        if (i11 == 0) {
            return o(i10);
        }
        if (i11 == 1) {
            return q(i10);
        }
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            if ((i10 & (1 << i11)) == 0) {
                return false;
            }
        } else if ((i10 & (1 << (i11 + 2))) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean o(int i10) {
        return (i10 & 33) != 0;
    }

    public static final boolean p(int i10) {
        return (i10 & 4194304) != 0;
    }

    public static final boolean q(int i10) {
        return (i10 & 66) != 0;
    }

    public static final boolean r(int i10) {
        return (i10 & 1) != 0;
    }

    public static final boolean s(int i10) {
        return (i10 & 4) != 0;
    }

    public static final boolean t(int i10) {
        return (i10 & 4) != 0;
    }
}
