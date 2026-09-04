package androidx.compose.ui.input.pointer;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/o0;", "", "", RXScreenCaptureService.KEY_HEIGHT, "(I)Ljava/lang/String;", "", "g", "(I)I", "other", "", ak.aF, "(ILjava/lang/Object;)Z", ak.av, "I", "value", "f", "(I)Z", "dispatchedToAPointerInputModifier", "e", "anyMovementConsumed", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    private /* synthetic */ o0(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ o0 a(int i10) {
        return new o0(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof o0) && i10 == ((o0) obj).getValue();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean e(int i10) {
        return (i10 & 2) != 0;
    }

    public static final boolean f(int i10) {
        return (i10 & 1) != 0;
    }

    public static int g(int i10) {
        return i10;
    }

    public static String h(int i10) {
        return "ProcessResult(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    public int hashCode() {
        return g(this.value);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return h(this.value);
    }
}
