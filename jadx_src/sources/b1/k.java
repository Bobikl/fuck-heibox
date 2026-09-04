package b1;

import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import org.apache.tools.ant.types.selectors.o;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u00019BR\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0014\u0012\b\b\u0002\u0010 \u001a\u00020\u0014\u0012\b\b\u0002\u0010!\u001a\u00020\u0014ø\u0001\u0001¢\u0006\u0004\b7\u00108J\b\u0010\u0002\u001a\u00020\u0000H\u0002J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0015\u001a\u00020\u0014HÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u0014HÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u0014HÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u0014HÆ\u0003ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0016Jf\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00142\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u0014HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010%\u001a\u00020$HÖ\u0001J\u0013\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u001b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b-\u0010*R \u0010\u001e\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u0010\u0016R \u0010\u001f\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b0\u0010\u0016R \u0010 \u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b1\u0010\u0016R \u0010!\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b2\u0010\u0016R\u0011\u00104\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010*R\u0011\u00106\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b5\u0010*\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006:"}, d2 = {"Lb1/k;", "", "y", "", o.f136588l, "radius1", "radius2", "limit", "x", "Lb1/f;", "point", "", "j", "(J)Z", "", "toString", "b", ak.aF, "d", "e", "Lb1/a;", "f", "()J", "g", RXScreenCaptureService.KEY_HEIGHT, "i", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "k", "(FFFFJJJJ)Lb1/k;", "", "hashCode", "other", "equals", "F", "q", "()F", ak.aB, "r", "m", "J", "t", ak.aG, "o", "n", "v", "width", "p", "height", "<init>", "(FFFFJJJJLkotlin/jvm/internal/u;)V", ak.av, "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f30375j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final k f30376k = l.e(0.0f, 0.0f, 0.0f, 0.0f, b1.a.f30356b.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f30377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f30378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f30379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f30380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f30382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f30383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f30384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private k f30385i;

    /* JADX INFO: compiled from: RoundRect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lb1/k$a;", "", "Lb1/k;", "Zero", "Lb1/k;", ak.av, "()Lb1/k;", "getZero$annotations", "()V", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final k a() {
            return k.f30376k;
        }
    }

    private k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f30377a = f10;
        this.f30378b = f11;
        this.f30379c = f12;
        this.f30380d = f13;
        this.f30381e = j10;
        this.f30382f = j11;
        this.f30383g = j12;
        this.f30384h = j13;
    }

    public /* synthetic */ k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, u uVar) {
        this(f10, f11, f12, f13, (i10 & 16) != 0 ? b1.a.f30356b.a() : j10, (i10 & 32) != 0 ? b1.a.f30356b.a() : j11, (i10 & 64) != 0 ? b1.a.f30356b.a() : j12, (i10 & 128) != 0 ? b1.a.f30356b.a() : j13, null);
    }

    public /* synthetic */ k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, u uVar) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    @dl.d
    public static final k w() {
        return f30375j.a();
    }

    private final float x(float min, float radius1, float radius2, float limit) {
        float f10 = radius1 + radius2;
        if (f10 > limit) {
            return !((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0) ? Math.min(min, limit / f10) : min;
        }
        return min;
    }

    private final k y() {
        k kVar = this.f30385i;
        if (kVar != null) {
            return kVar;
        }
        float fX = x(x(x(x(1.0f, b1.a.o(this.f30384h), b1.a.o(this.f30381e), p()), b1.a.m(this.f30381e), b1.a.m(this.f30382f), v()), b1.a.o(this.f30382f), b1.a.o(this.f30383g), p()), b1.a.m(this.f30383g), b1.a.m(this.f30384h), v());
        k kVar2 = new k(this.f30377a * fX, this.f30378b * fX, this.f30379c * fX, this.f30380d * fX, b.a(b1.a.m(this.f30381e) * fX, b1.a.o(this.f30381e) * fX), b.a(b1.a.m(this.f30382f) * fX, b1.a.o(this.f30382f) * fX), b.a(b1.a.m(this.f30383g) * fX, b1.a.o(this.f30383g) * fX), b.a(b1.a.m(this.f30384h) * fX, b1.a.o(this.f30384h) * fX), null);
        this.f30385i = kVar2;
        return kVar2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF30377a() {
        return this.f30377a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getF30378b() {
        return this.f30378b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getF30379c() {
        return this.f30379c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getF30380d() {
        return this.f30380d;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return f0.g(Float.valueOf(this.f30377a), Float.valueOf(kVar.f30377a)) && f0.g(Float.valueOf(this.f30378b), Float.valueOf(kVar.f30378b)) && f0.g(Float.valueOf(this.f30379c), Float.valueOf(kVar.f30379c)) && f0.g(Float.valueOf(this.f30380d), Float.valueOf(kVar.f30380d)) && b1.a.j(this.f30381e, kVar.f30381e) && b1.a.j(this.f30382f, kVar.f30382f) && b1.a.j(this.f30383g, kVar.f30383g) && b1.a.j(this.f30384h, kVar.f30384h);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getF30381e() {
        return this.f30381e;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getF30382f() {
        return this.f30382f;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getF30383g() {
        return this.f30383g;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.f30377a) * 31) + Float.floatToIntBits(this.f30378b)) * 31) + Float.floatToIntBits(this.f30379c)) * 31) + Float.floatToIntBits(this.f30380d)) * 31) + b1.a.p(this.f30381e)) * 31) + b1.a.p(this.f30382f)) * 31) + b1.a.p(this.f30383g)) * 31) + b1.a.p(this.f30384h);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getF30384h() {
        return this.f30384h;
    }

    public final boolean j(long point) {
        float fP;
        float fR;
        float fM;
        float fO;
        if (f.p(point) < this.f30377a || f.p(point) >= this.f30379c || f.r(point) < this.f30378b || f.r(point) >= this.f30380d) {
            return false;
        }
        k kVarY = y();
        if (f.p(point) < this.f30377a + b1.a.m(kVarY.f30381e) && f.r(point) < this.f30378b + b1.a.o(kVarY.f30381e)) {
            fP = (f.p(point) - this.f30377a) - b1.a.m(kVarY.f30381e);
            fR = (f.r(point) - this.f30378b) - b1.a.o(kVarY.f30381e);
            fM = b1.a.m(kVarY.f30381e);
            fO = b1.a.o(kVarY.f30381e);
        } else if (f.p(point) > this.f30379c - b1.a.m(kVarY.f30382f) && f.r(point) < this.f30378b + b1.a.o(kVarY.f30382f)) {
            fP = (f.p(point) - this.f30379c) + b1.a.m(kVarY.f30382f);
            fR = (f.r(point) - this.f30378b) - b1.a.o(kVarY.f30382f);
            fM = b1.a.m(kVarY.f30382f);
            fO = b1.a.o(kVarY.f30382f);
        } else if (f.p(point) > this.f30379c - b1.a.m(kVarY.f30383g) && f.r(point) > this.f30380d - b1.a.o(kVarY.f30383g)) {
            fP = (f.p(point) - this.f30379c) + b1.a.m(kVarY.f30383g);
            fR = (f.r(point) - this.f30380d) + b1.a.o(kVarY.f30383g);
            fM = b1.a.m(kVarY.f30383g);
            fO = b1.a.o(kVarY.f30383g);
        } else {
            if (f.p(point) >= this.f30377a + b1.a.m(kVarY.f30384h) || f.r(point) <= this.f30380d - b1.a.o(kVarY.f30384h)) {
                return true;
            }
            fP = (f.p(point) - this.f30377a) - b1.a.m(kVarY.f30384h);
            fR = (f.r(point) - this.f30380d) + b1.a.o(kVarY.f30384h);
            fM = b1.a.m(kVarY.f30384h);
            fO = b1.a.o(kVarY.f30384h);
        }
        float f10 = fP / fM;
        float f11 = fR / fO;
        return (f10 * f10) + (f11 * f11) <= 1.0f;
    }

    @dl.d
    public final k k(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new k(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public final float m() {
        return this.f30380d;
    }

    public final long n() {
        return this.f30384h;
    }

    public final long o() {
        return this.f30383g;
    }

    public final float p() {
        return this.f30380d - this.f30378b;
    }

    public final float q() {
        return this.f30377a;
    }

    public final float r() {
        return this.f30379c;
    }

    public final float s() {
        return this.f30378b;
    }

    public final long t() {
        return this.f30381e;
    }

    @dl.d
    public String toString() {
        long j10 = this.f30381e;
        long j11 = this.f30382f;
        long j12 = this.f30383g;
        long j13 = this.f30384h;
        String str = c.a(this.f30377a, 1) + ", " + c.a(this.f30378b, 1) + ", " + c.a(this.f30379c, 1) + ", " + c.a(this.f30380d, 1);
        if (!b1.a.j(j10, j11) || !b1.a.j(j11, j12) || !b1.a.j(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) b1.a.t(j10)) + ", topRight=" + ((Object) b1.a.t(j11)) + ", bottomRight=" + ((Object) b1.a.t(j12)) + ", bottomLeft=" + ((Object) b1.a.t(j13)) + ')';
        }
        if (b1.a.m(j10) == b1.a.o(j10)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(b1.a.m(j10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(b1.a.m(j10), 1) + ", y=" + c.a(b1.a.o(j10), 1) + ')';
    }

    public final long u() {
        return this.f30382f;
    }

    public final float v() {
        return this.f30379c - this.f30377a;
    }
}
