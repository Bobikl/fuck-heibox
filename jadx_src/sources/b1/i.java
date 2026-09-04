package b1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001:\u0001XB'\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\bV\u0010WJ\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0007J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0000J\u001e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0006HÆ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010 \u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R \u0010\u001b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R \u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010!\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\u001a\u0010.\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010#R\u001a\u00101\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010#R#\u00106\u001a\u0002028FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b5\u0010%\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010%\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010%\u001a\u0004\b;\u00108R\u001a\u0010@\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010%\u001a\u0004\b>\u00108R\u0011\u0010B\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bA\u0010#R\u0011\u0010D\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bC\u0010#R\u001a\u0010F\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bE\u00104R\u001a\u0010H\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bG\u00104R\u001a\u0010I\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b!\u00104R\u001a\u0010K\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bJ\u00104R\u001a\u0010M\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bL\u00104R\u001a\u0010O\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bN\u00104R\u001a\u0010Q\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bP\u00104R\u001a\u0010S\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u00104R\u001a\u0010U\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bT\u00104\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Y"}, d2 = {"Lb1/i;", "", "Lb1/f;", w.c.R, androidx.exifinterface.media.a.R4, "(J)Lb1/i;", "", "translateX", "translateY", "R", "delta", "I", "i", "other", "J", "", "Q", "f", "(J)Z", "", "toString", "b", ak.aF, "d", "e", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "g", "", "hashCode", "equals", "F", "t", "()F", "getLeft$annotations", "()V", "B", "getTop$annotations", "x", "getRight$annotations", "j", "getBottom$annotations", "G", "getWidth$annotations", "width", "r", "getHeight$annotations", "height", "Lb1/m;", ak.aD, "()J", "getSize-NH-jbRc$annotations", UiKitSpanObj.TYPE_SIZE, "O", "()Z", "isInfinite$annotations", "isInfinite", "M", "isFinite$annotations", "isFinite", "K", "isEmpty$annotations", "isEmpty", RXScreenCaptureService.KEY_WIDTH, "minDimension", "v", "maxDimension", androidx.exifinterface.media.a.S4, "topLeft", "D", "topCenter", "topRight", "p", "centerLeft", "o", com.google.android.exoplayer2.text.ttml.d.f49794m0, "q", "centerRight", "m", "bottomLeft", "l", "bottomCenter", "n", "bottomRight", "<init>", "(FFFF)V", ak.av, "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f30369e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final i f30370f = new i(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f30371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f30372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f30373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f30374d;

    /* JADX INFO: compiled from: Rect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lb1/i$a;", "", "Lb1/i;", "Zero", "Lb1/i;", ak.av, "()Lb1/i;", "getZero$annotations", "()V", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final i a() {
            return i.f30370f;
        }
    }

    public i(float f10, float f11, float f12, float f13) {
        this.f30371a = f10;
        this.f30372b = f11;
        this.f30373c = f12;
        this.f30374d = f13;
    }

    @j2
    public static /* synthetic */ void A() {
    }

    @j2
    public static /* synthetic */ void C() {
    }

    @j2
    public static /* synthetic */ void H() {
    }

    @j2
    public static /* synthetic */ void L() {
    }

    @j2
    public static /* synthetic */ void N() {
    }

    @j2
    public static /* synthetic */ void P() {
    }

    public static /* synthetic */ i h(i iVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = iVar.f30371a;
        }
        if ((i10 & 2) != 0) {
            f11 = iVar.f30372b;
        }
        if ((i10 & 4) != 0) {
            f12 = iVar.f30373c;
        }
        if ((i10 & 8) != 0) {
            f13 = iVar.f30374d;
        }
        return iVar.g(f10, f11, f12, f13);
    }

    @j2
    public static /* synthetic */ void k() {
    }

    @j2
    public static /* synthetic */ void s() {
    }

    @j2
    public static /* synthetic */ void u() {
    }

    @j2
    public static /* synthetic */ void y() {
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final float getF30372b() {
        return this.f30372b;
    }

    public final long D() {
        return g.a(this.f30371a + (G() / 2.0f), this.f30372b);
    }

    public final long E() {
        return g.a(this.f30371a, this.f30372b);
    }

    public final long F() {
        return g.a(this.f30373c, this.f30372b);
    }

    public final float G() {
        return this.f30373c - this.f30371a;
    }

    @j2
    @dl.d
    public final i I(float delta) {
        return new i(this.f30371a - delta, this.f30372b - delta, this.f30373c + delta, this.f30374d + delta);
    }

    @j2
    @dl.d
    public final i J(@dl.d i other) {
        f0.p(other, "other");
        return new i(Math.max(this.f30371a, other.f30371a), Math.max(this.f30372b, other.f30372b), Math.min(this.f30373c, other.f30373c), Math.min(this.f30374d, other.f30374d));
    }

    public final boolean K() {
        return this.f30371a >= this.f30373c || this.f30372b >= this.f30374d;
    }

    public final boolean M() {
        float f10 = this.f30371a;
        if ((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true) {
            float f11 = this.f30372b;
            if ((Float.isInfinite(f11) || Float.isNaN(f11)) ? false : true) {
                float f12 = this.f30373c;
                if ((Float.isInfinite(f12) || Float.isNaN(f12)) ? false : true) {
                    float f13 = this.f30374d;
                    if ((Float.isInfinite(f13) || Float.isNaN(f13)) ? false : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean O() {
        return this.f30371a >= Float.POSITIVE_INFINITY || this.f30372b >= Float.POSITIVE_INFINITY || this.f30373c >= Float.POSITIVE_INFINITY || this.f30374d >= Float.POSITIVE_INFINITY;
    }

    public final boolean Q(@dl.d i other) {
        f0.p(other, "other");
        return this.f30373c > other.f30371a && other.f30373c > this.f30371a && this.f30374d > other.f30372b && other.f30374d > this.f30372b;
    }

    @j2
    @dl.d
    public final i R(float translateX, float translateY) {
        return new i(this.f30371a + translateX, this.f30372b + translateY, this.f30373c + translateX, this.f30374d + translateY);
    }

    @j2
    @dl.d
    public final i S(long offset) {
        return new i(this.f30371a + f.p(offset), this.f30372b + f.r(offset), this.f30373c + f.p(offset), this.f30374d + f.r(offset));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF30371a() {
        return this.f30371a;
    }

    public final float c() {
        return this.f30372b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getF30373c() {
        return this.f30373c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getF30374d() {
        return this.f30374d;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return f0.g(Float.valueOf(this.f30371a), Float.valueOf(iVar.f30371a)) && f0.g(Float.valueOf(this.f30372b), Float.valueOf(iVar.f30372b)) && f0.g(Float.valueOf(this.f30373c), Float.valueOf(iVar.f30373c)) && f0.g(Float.valueOf(this.f30374d), Float.valueOf(iVar.f30374d));
    }

    public final boolean f(long offset) {
        return f.p(offset) >= this.f30371a && f.p(offset) < this.f30373c && f.r(offset) >= this.f30372b && f.r(offset) < this.f30374d;
    }

    @dl.d
    public final i g(float left, float top, float right, float bottom) {
        return new i(left, top, right, bottom);
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f30371a) * 31) + Float.floatToIntBits(this.f30372b)) * 31) + Float.floatToIntBits(this.f30373c)) * 31) + Float.floatToIntBits(this.f30374d);
    }

    @j2
    @dl.d
    public final i i(float delta) {
        return I(-delta);
    }

    public final float j() {
        return this.f30374d;
    }

    public final long l() {
        return g.a(this.f30371a + (G() / 2.0f), this.f30374d);
    }

    public final long m() {
        return g.a(this.f30371a, this.f30374d);
    }

    public final long n() {
        return g.a(this.f30373c, this.f30374d);
    }

    public final long o() {
        return g.a(this.f30371a + (G() / 2.0f), this.f30372b + (r() / 2.0f));
    }

    public final long p() {
        return g.a(this.f30371a, this.f30372b + (r() / 2.0f));
    }

    public final long q() {
        return g.a(this.f30373c, this.f30372b + (r() / 2.0f));
    }

    public final float r() {
        return this.f30374d - this.f30372b;
    }

    public final float t() {
        return this.f30371a;
    }

    @dl.d
    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f30371a, 1) + ", " + c.a(this.f30372b, 1) + ", " + c.a(this.f30373c, 1) + ", " + c.a(this.f30374d, 1) + ')';
    }

    public final float v() {
        return Math.max(Math.abs(G()), Math.abs(r()));
    }

    public final float w() {
        return Math.min(Math.abs(G()), Math.abs(r()));
    }

    public final float x() {
        return this.f30373c;
    }

    public final long z() {
        return n.a(G(), r());
    }
}
