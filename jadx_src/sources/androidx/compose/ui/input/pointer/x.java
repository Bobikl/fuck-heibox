package androidx.compose.ui.input.pointer;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/x;", "", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "other", "", ak.aF, "(JLjava/lang/Object;)Z", "", ak.av, "J", "e", "()J", "value", "b", "(J)J", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    private /* synthetic */ x(long j10) {
        this.value = j10;
    }

    public static final /* synthetic */ x a(long j10) {
        return new x(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).h();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int f(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static String g(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    public final /* synthetic */ long h() {
        return this.value;
    }

    public int hashCode() {
        return f(this.value);
    }

    public String toString() {
        return g(this.value);
    }
}
