package androidx.compose.ui.text;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0016\b\u0087@\u0018\u0000 '2\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0012ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\u000f\u0088\u0001\u0015\u0092\u0001\u00020\u0012ø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/text/o0;", "", "other", "", "p", "(JJ)Z", "d", "", androidx.constraintlayout.core.motion.utils.w.c.R, "e", "(JI)Z", "", "q", "(J)Ljava/lang/String;", "o", "(J)I", "f", "(JLjava/lang/Object;)Z", "", ak.av, "J", "packedValue", "n", com.google.android.exoplayer2.text.ttml.d.f49798o0, "i", com.google.android.exoplayer2.text.ttml.d.f49800p0, "l", org.apache.tools.ant.types.selectors.o.f136588l, "k", org.apache.tools.ant.types.selectors.o.f136589m, RXScreenCaptureService.KEY_HEIGHT, "(J)Z", "collapsed", "m", "reversed", "j", com.google.android.exoplayer2.source.rtsp.k0.f48801p, ak.aF, "(J)J", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@androidx.compose.runtime.m0
public final class o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f16831c = p0.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: androidx.compose.ui.text.o0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextRange.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/o0$a;", "", "Landroidx/compose/ui/text/o0;", "Zero", "J", ak.av, "()J", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final long a() {
            return o0.f16831c;
        }
    }

    private /* synthetic */ o0(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ o0 b(long j10) {
        return new o0(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final boolean d(long j10, long j11) {
        return l(j10) <= l(j11) && k(j11) <= k(j10);
    }

    public static final boolean e(long j10, int i10) {
        return i10 < k(j10) && l(j10) <= i10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof o0) && j10 == ((o0) obj).getPackedValue();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean h(long j10) {
        return n(j10) == i(j10);
    }

    public static final int i(long j10) {
        return (int) (j10 & KeyboardMap.kValueMask);
    }

    public static final int j(long j10) {
        return k(j10) - l(j10);
    }

    public static final int k(long j10) {
        return n(j10) > i(j10) ? n(j10) : i(j10);
    }

    public static final int l(long j10) {
        return n(j10) > i(j10) ? i(j10) : n(j10);
    }

    public static final boolean m(long j10) {
        return n(j10) > i(j10);
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    public static int o(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static final boolean p(long j10, long j11) {
        return l(j10) < k(j11) && l(j11) < k(j10);
    }

    @dl.d
    public static String q(long j10) {
        return "TextRange(" + n(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.packedValue, obj);
    }

    public int hashCode() {
        return o(this.packedValue);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @dl.d
    public String toString() {
        return q(this.packedValue);
    }
}
