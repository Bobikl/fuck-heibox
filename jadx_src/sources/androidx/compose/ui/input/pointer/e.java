package androidx.compose.ui.input.pointer;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.k(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\r\u0010\b¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/e;", "", "", ak.av, "Z", ak.aF, "()Z", "f", "(Z)V", "getPositionChange$annotations", "()V", "positionChange", "b", "e", "getDownChange$annotations", "downChange", "<init>", "(ZZ)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14771c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean positionChange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean downChange;

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public e(boolean z10, boolean z11) {
        this.positionChange = z10;
        this.downChange = z11;
    }

    public /* synthetic */ e(boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    @kotlin.k(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void b() {
    }

    @kotlin.k(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void d() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDownChange() {
        return this.downChange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final void e(boolean z10) {
        this.downChange = z10;
    }

    public final void f(boolean z10) {
        this.positionChange = z10;
    }
}
