package androidx.compose.foundation.lazy;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DataIndex.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0005ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0019\u0010\u0002\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0003J!\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0003J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0017\u0092\u0001\u00020\u0005ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/b;", "", "i", "(I)I", "d", "", "l", "(II)I", "j", "k", "other", "b", "", "m", "(I)Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "", "e", "(ILjava/lang/Object;)Z", ak.av, "I", "g", "()I", "value", ak.aF, "foundation_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    private /* synthetic */ b(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ b a(int i10) {
        return new b(i10);
    }

    public static final int b(int i10, int i11) {
        return i10 - i11;
    }

    public static int c(int i10) {
        return i10;
    }

    public static final int d(int i10) {
        return c(i10 - 1);
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).n();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    public static final int i(int i10) {
        return c(i10 + 1);
    }

    public static final int j(int i10, int i11) {
        return c(i10 - i11);
    }

    public static final int k(int i10, int i11) {
        return c(i10 - i11);
    }

    public static final int l(int i10, int i11) {
        return c(i10 + i11);
    }

    public static String m(int i10) {
        return "DataIndex(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return h(this.value);
    }

    public final /* synthetic */ int n() {
        return this.value;
    }

    public String toString() {
        return m(this.value);
    }
}
