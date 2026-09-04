package androidx.compose.ui.input.pointer;

import android.view.PointerIcon;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerIcon.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\"\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u000b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Landroid/view/PointerIcon;", "pointerIcon", "Landroidx/compose/ui/input/pointer/t;", "b", "", "pointerIconType", ak.av, "Landroidx/compose/ui/input/pointer/t;", "d", "()Landroidx/compose/ui/input/pointer/t;", "pointerIconDefault", ak.aF, "pointerIconCrosshair", "f", "pointerIconText", "e", "pointerIconHand", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final t f14833a = new AndroidPointerIcon(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final t f14834b = new AndroidPointerIcon(1007);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final t f14835c = new AndroidPointerIcon(1008);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final t f14836d = new AndroidPointerIcon(1002);

    @dl.d
    public static final t a(int i10) {
        return new AndroidPointerIcon(i10);
    }

    @dl.d
    public static final t b(@dl.d PointerIcon pointerIcon) {
        kotlin.jvm.internal.f0.p(pointerIcon, "pointerIcon");
        return new AndroidPointerIcon(pointerIcon);
    }

    @dl.d
    public static final t c() {
        return f14834b;
    }

    @dl.d
    public static final t d() {
        return f14833a;
    }

    @dl.d
    public static final t e() {
        return f14836d;
    }

    @dl.d
    public static final t f() {
        return f14835c;
    }
}
