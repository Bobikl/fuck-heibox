package g1;

import androidx.collection.k;
import androidx.constraintlayout.core.motion.utils.w;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: g1.e, reason: from toString */
/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001:\u0001 B*\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\t\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0004J>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001c\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001d\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lg1/e;", "", "Lb1/f;", "b", "()J", "", ak.aF, "", "d", "e", "pixelsPerSecond", "confidence", "durationMillis", w.c.R, "f", "(JFJJ)Lg1/e;", "", "toString", "", "hashCode", "other", "", "equals", "J", "k", "F", RXScreenCaptureService.KEY_HEIGHT, "()F", "i", "j", "<init>", "(JFJJLkotlin/jvm/internal/u;)V", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class VelocityEstimate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f118950e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final VelocityEstimate f118951f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    private final long pixelsPerSecond;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    private final float confidence;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    private final long durationMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from toString */
    private final long offset;

    /* JADX INFO: renamed from: g1.e$a */
    /* JADX INFO: compiled from: VelocityTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lg1/e$a;", "", "Lg1/e;", d4.d.f108133a, "Lg1/e;", ak.av, "()Lg1/e;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final VelocityEstimate a() {
            return VelocityEstimate.f118951f;
        }
    }

    static {
        b1.f.a aVar = b1.f.f30364b;
        f118951f = new VelocityEstimate(aVar.e(), 1.0f, 0L, aVar.e(), null);
    }

    private VelocityEstimate(long j10, float f10, long j11, long j12) {
        this.pixelsPerSecond = j10;
        this.confidence = f10;
        this.durationMillis = j11;
        this.offset = j12;
    }

    public /* synthetic */ VelocityEstimate(long j10, float f10, long j11, long j12, u uVar) {
        this(j10, f10, j11, j12);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPixelsPerSecond() {
        return this.pixelsPerSecond;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VelocityEstimate)) {
            return false;
        }
        VelocityEstimate velocityEstimate = (VelocityEstimate) other;
        return b1.f.l(this.pixelsPerSecond, velocityEstimate.pixelsPerSecond) && f0.g(Float.valueOf(this.confidence), Float.valueOf(velocityEstimate.confidence)) && this.durationMillis == velocityEstimate.durationMillis && b1.f.l(this.offset, velocityEstimate.offset);
    }

    @dl.d
    public final VelocityEstimate f(long pixelsPerSecond, float confidence, long durationMillis, long offset) {
        return new VelocityEstimate(pixelsPerSecond, confidence, durationMillis, offset, null);
    }

    public final float h() {
        return this.confidence;
    }

    public int hashCode() {
        return (((((b1.f.s(this.pixelsPerSecond) * 31) + Float.floatToIntBits(this.confidence)) * 31) + k.a(this.durationMillis)) * 31) + b1.f.s(this.offset);
    }

    public final long i() {
        return this.durationMillis;
    }

    public final long j() {
        return this.offset;
    }

    public final long k() {
        return this.pixelsPerSecond;
    }

    @dl.d
    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) b1.f.y(this.pixelsPerSecond)) + ", confidence=" + this.confidence + ", durationMillis=" + this.durationMillis + ", offset=" + ((Object) b1.f.y(this.offset)) + ')';
    }
}
