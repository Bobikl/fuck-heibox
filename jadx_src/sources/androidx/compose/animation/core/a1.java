package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u001e\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016B\u0014\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00128Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/a1;", "", "", "j", "(J)Ljava/lang/String;", "", "i", "(J)I", "other", "", "e", "(JLjava/lang/Object;)Z", "", ak.av, "J", "value", "g", "offsetMillis", "Landroidx/compose/animation/core/b1;", RXScreenCaptureService.KEY_HEIGHT, "offsetType", "b", "(II)J", ak.aF, "(J)J", "animation-core_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    private /* synthetic */ a1(long j10) {
        this.value = j10;
    }

    public static final /* synthetic */ a1 a(long j10) {
        return new a1(j10);
    }

    public static long b(int i10, int i11) {
        return c(i10 * i11);
    }

    private static long c(long j10) {
        return j10;
    }

    public static /* synthetic */ long d(int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        if ((i12 & 2) != 0) {
            i11 = b1.INSTANCE.a();
        }
        return b(i10, i11);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof a1) && j10 == ((a1) obj).getValue();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final int g(long j10) {
        return Math.abs((int) j10);
    }

    public static final int h(long j10) {
        boolean z10 = j10 > 0;
        if (z10) {
            return b1.INSTANCE.b();
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return b1.INSTANCE.a();
    }

    public static int i(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static String j(long j10) {
        return "StartOffset(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    public int hashCode() {
        return i(this.value);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public String toString() {
        return j(this.value);
    }
}
