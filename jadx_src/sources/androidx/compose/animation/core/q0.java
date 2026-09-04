package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0011ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018\u0088\u0001\u0016\u0092\u0001\u00020\u0011ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/q0;", "", "", "value", "velocity", ak.aF, "(JFF)J", "", "k", "(J)Ljava/lang/String;", "", "j", "(J)I", "other", "", "e", "(JLjava/lang/Object;)Z", "", ak.av, "J", "g", "()J", "packedValue", RXScreenCaptureService.KEY_HEIGHT, "(J)F", "i", "b", "(J)J", "animation-core_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ q0(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ q0 a(long j10) {
        return new q0(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static final long c(long j10, float f10, float f11) {
        return y0.a(f10, f11);
    }

    public static /* synthetic */ long d(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = i(j10);
        }
        return c(j10, f10, f11);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof q0) && j10 == ((q0) obj).l();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static int j(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static String k(long j10) {
        return "Motion(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.packedValue, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return j(this.packedValue);
    }

    public final /* synthetic */ long l() {
        return this.packedValue;
    }

    public String toString() {
        return k(this.packedValue);
    }
}
