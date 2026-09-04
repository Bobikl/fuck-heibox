package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0013\u0092\u0001\u00020\u000eø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/node/f;", "", "other", "", "b", "(JJ)I", "", "j", "(J)Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "(J)I", "", "d", "(JLjava/lang/Object;)Z", "", ak.av, "J", "g", "()J", "packedValue", "", "f", "(J)F", "distance", "i", "(J)Z", "isInLayer", ak.aF, "(J)J", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ f(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ f a(long j10) {
        return new f(j10);
    }

    public static final int b(long j10, long j11) {
        boolean zI = i(j10);
        if (zI != i(j11)) {
            return zI ? -1 : 1;
        }
        return (int) Math.signum(f(j10) - f(j11));
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof f) && j10 == ((f) obj).k();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int h(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static final boolean i(long j10) {
        return ((int) (j10 & KeyboardMap.kValueMask)) != 0;
    }

    public static String j(long j10) {
        return "DistanceAndInLayer(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return h(this.packedValue);
    }

    public final /* synthetic */ long k() {
        return this.packedValue;
    }

    public String toString() {
        return j(this.packedValue);
    }
}
