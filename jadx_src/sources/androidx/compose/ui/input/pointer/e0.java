package androidx.compose.ui.input.pointer;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010#J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH&R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00068Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010$\u001a\u00020\u00148WX\u0097\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/input/pointer/e0;", "", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Ls1/r;", "bounds", "Lkotlin/b2;", "d0", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Y", "Landroidx/compose/ui/layout/q;", "b", "Landroidx/compose/ui/layout/q;", "g", "()Landroidx/compose/ui/layout/q;", "l0", "(Landroidx/compose/ui/layout/q;)V", "layoutCoordinates", "", ak.aF, "Z", "U", "()Z", "e0", "(Z)V", "isAttached", ak.av, "()J", UiKitSpanObj.TYPE_SIZE, "F1", "interceptOutOfBoundsChildEvents", "B", "getShareWithSiblings$annotations", "()V", "shareWithSiblings", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14774d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q layoutCoordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    @androidx.compose.ui.g
    public static /* synthetic */ void K() {
    }

    @androidx.compose.ui.g
    public boolean B() {
        return false;
    }

    public boolean F1() {
        return false;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public abstract void Y();

    public final long a() {
        androidx.compose.ui.layout.q qVar = this.layoutCoordinates;
        return qVar != null ? qVar.a() : s1.r.f139246b.a();
    }

    public abstract void d0(@dl.d p pointerEvent, @dl.d PointerEventPass pass, long bounds);

    public final void e0(boolean z10) {
        this.isAttached = z10;
    }

    @dl.e
    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.ui.layout.q getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final void l0(@dl.e androidx.compose.ui.layout.q qVar) {
        this.layoutCoordinates = qVar;
    }
}
