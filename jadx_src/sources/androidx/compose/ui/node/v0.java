package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\fJ\"\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0014\u0092\u0001\u00020\u0004ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/v0;", androidx.exifinterface.media.a.f23244d5, "", "other", "", "g", "(II)I", RXScreenCaptureService.KEY_HEIGHT, "", "i", "(I)Ljava/lang/String;", "f", "(I)I", "", ak.aF, "(ILjava/lang/Object;)Z", ak.av, "I", "e", "()I", "mask", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class v0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    private /* synthetic */ v0(int i10) {
        this.mask = i10;
    }

    public static final /* synthetic */ v0 a(int i10) {
        return new v0(i10);
    }

    public static <T> int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof v0) && i10 == ((v0) obj).j();
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return i10;
    }

    public static final int g(int i10, int i11) {
        return i10 | i11;
    }

    public static final int h(int i10, int i11) {
        return i10 | i11;
    }

    public static String i(int i10) {
        return "NodeKind(mask=" + i10 + ')';
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMask() {
        return this.mask;
    }

    public boolean equals(Object obj) {
        return c(this.mask, obj);
    }

    public int hashCode() {
        return f(this.mask);
    }

    public final /* synthetic */ int j() {
        return this.mask;
    }

    public String toString() {
        return i(this.mask);
    }
}
