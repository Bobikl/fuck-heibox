package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0007\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/grid/d;", "", "", RXScreenCaptureService.KEY_HEIGHT, "(J)Ljava/lang/String;", "", "g", "(J)I", "other", "", ak.aF, "(JLjava/lang/Object;)Z", "", ak.av, "J", "packedValue", "f", "getCurrentLineSpan$annotations", "()V", "currentLineSpan", "b", "(J)J", "foundation_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    private /* synthetic */ d(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ d a(long j10) {
        return new d(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof d) && j10 == ((d) obj).getPackedValue();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    @androidx.compose.foundation.t
    public static /* synthetic */ void e() {
    }

    public static final int f(long j10) {
        return (int) j10;
    }

    public static int g(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static String h(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.packedValue, obj);
    }

    public int hashCode() {
        return g(this.packedValue);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return h(this.packedValue);
    }
}
