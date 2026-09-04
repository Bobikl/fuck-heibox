package s1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: IntRect.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001QB'\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0007J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0000J\u001b\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0006HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!R \u0010\u001b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u000b\u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010!R \u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u0012\u0004\b)\u0010#\u001a\u0004\b(\u0010!R\u001a\u0010,\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010#\u001a\u0004\b*\u0010!R\u001a\u0010/\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010#\u001a\u0004\b-\u0010!R#\u00104\u001a\u0002008FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b3\u0010#\u001a\u0004\b1\u00102R\u001a\u00108\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010#\u001a\u0004\b5\u00106R\u0011\u0010:\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b9\u0010!R\u0011\u0010<\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b;\u0010!R\u001a\u0010>\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b=\u00102R\u001a\u0010@\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b?\u00102R\u001a\u0010B\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bA\u00102R\u001a\u0010D\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bC\u00102R\u001a\u0010F\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bE\u00102R\u001a\u0010H\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bG\u00102R\u001a\u0010J\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bI\u00102R\u001a\u0010L\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bK\u00102R\u001a\u0010N\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bM\u00102\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006R"}, d2 = {"Ls1/p;", "", "Ls1/n;", androidx.constraintlayout.core.motion.utils.w.c.R, "O", "(J)Ls1/p;", "", "translateX", "translateY", "N", "delta", "I", "i", "other", "J", "", "M", "f", "(J)Z", "", "toString", "b", ak.aF, "d", "e", com.google.android.exoplayer2.text.ttml.d.f49793l0, "top", com.google.android.exoplayer2.text.ttml.d.f49796n0, "bottom", "g", "hashCode", "equals", "t", "()I", "getLeft$annotations", "()V", "B", "getTop$annotations", "x", "getRight$annotations", "j", "getBottom$annotations", "G", "getWidth$annotations", "width", "r", "getHeight$annotations", "height", "Ls1/r;", ak.aD, "()J", "getSize-YbymL2g$annotations", UiKitSpanObj.TYPE_SIZE, "K", "()Z", "isEmpty$annotations", "isEmpty", RXScreenCaptureService.KEY_WIDTH, "minDimension", "v", "maxDimension", androidx.exifinterface.media.a.S4, "topLeft", "D", "topCenter", "F", "topRight", "p", "centerLeft", "o", com.google.android.exoplayer2.text.ttml.d.f49794m0, "q", "centerRight", "m", "bottomLeft", "l", "bottomCenter", "n", "bottomRight", "<init>", "(IIII)V", ak.av, "ui-unit_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f139240e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final p f139241f = new p(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f139242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f139243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f139244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f139245d;

    /* JADX INFO: compiled from: IntRect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Ls1/p$a;", "", "Ls1/p;", "Zero", "Ls1/p;", ak.av, "()Ls1/p;", "getZero$annotations", "()V", "<init>", "ui-unit_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        @dl.d
        public final p a() {
            return p.f139241f;
        }
    }

    public p(int i10, int i11, int i12, int i13) {
        this.f139242a = i10;
        this.f139243b = i11;
        this.f139244c = i12;
        this.f139245d = i13;
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

    public static /* synthetic */ p h(p pVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = pVar.f139242a;
        }
        if ((i14 & 2) != 0) {
            i11 = pVar.f139243b;
        }
        if ((i14 & 4) != 0) {
            i12 = pVar.f139244c;
        }
        if ((i14 & 8) != 0) {
            i13 = pVar.f139245d;
        }
        return pVar.g(i10, i11, i12, i13);
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
    public final int getF139243b() {
        return this.f139243b;
    }

    public final long D() {
        return o.a(this.f139242a + (G() / 2), this.f139243b);
    }

    public final long E() {
        return o.a(this.f139242a, this.f139243b);
    }

    public final long F() {
        return o.a(this.f139244c, this.f139243b);
    }

    public final int G() {
        return this.f139244c - this.f139242a;
    }

    @j2
    @dl.d
    public final p I(int delta) {
        return new p(this.f139242a - delta, this.f139243b - delta, this.f139244c + delta, this.f139245d + delta);
    }

    @j2
    @dl.d
    public final p J(@dl.d p other) {
        f0.p(other, "other");
        return new p(Math.max(this.f139242a, other.f139242a), Math.max(this.f139243b, other.f139243b), Math.min(this.f139244c, other.f139244c), Math.min(this.f139245d, other.f139245d));
    }

    public final boolean K() {
        return this.f139242a >= this.f139244c || this.f139243b >= this.f139245d;
    }

    public final boolean M(@dl.d p other) {
        f0.p(other, "other");
        return this.f139244c > other.f139242a && other.f139244c > this.f139242a && this.f139245d > other.f139243b && other.f139245d > this.f139243b;
    }

    @j2
    @dl.d
    public final p N(int translateX, int translateY) {
        return new p(this.f139242a + translateX, this.f139243b + translateY, this.f139244c + translateX, this.f139245d + translateY);
    }

    @j2
    @dl.d
    public final p O(long offset) {
        return new p(this.f139242a + n.m(offset), this.f139243b + n.o(offset), this.f139244c + n.m(offset), this.f139245d + n.o(offset));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF139242a() {
        return this.f139242a;
    }

    public final int c() {
        return this.f139243b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF139244c() {
        return this.f139244c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF139245d() {
        return this.f139245d;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return this.f139242a == pVar.f139242a && this.f139243b == pVar.f139243b && this.f139244c == pVar.f139244c && this.f139245d == pVar.f139245d;
    }

    public final boolean f(long offset) {
        return n.m(offset) >= this.f139242a && n.m(offset) < this.f139244c && n.o(offset) >= this.f139243b && n.o(offset) < this.f139245d;
    }

    @dl.d
    public final p g(int left, int top, int right, int bottom) {
        return new p(left, top, right, bottom);
    }

    public int hashCode() {
        return (((((this.f139242a * 31) + this.f139243b) * 31) + this.f139244c) * 31) + this.f139245d;
    }

    @j2
    @dl.d
    public final p i(int delta) {
        return I(-delta);
    }

    public final int j() {
        return this.f139245d;
    }

    public final long l() {
        return o.a(this.f139242a + (G() / 2), this.f139245d);
    }

    public final long m() {
        return o.a(this.f139242a, this.f139245d);
    }

    public final long n() {
        return o.a(this.f139244c, this.f139245d);
    }

    public final long o() {
        return o.a(this.f139242a + (G() / 2), this.f139243b + (r() / 2));
    }

    public final long p() {
        return o.a(this.f139242a, this.f139243b + (r() / 2));
    }

    public final long q() {
        return o.a(this.f139244c, this.f139243b + (r() / 2));
    }

    public final int r() {
        return this.f139245d - this.f139243b;
    }

    public final int t() {
        return this.f139242a;
    }

    @dl.d
    public String toString() {
        return "IntRect.fromLTRB(" + this.f139242a + ", " + this.f139243b + ", " + this.f139244c + ", " + this.f139245d + ')';
    }

    public final int v() {
        return Math.max(Math.abs(G()), Math.abs(r()));
    }

    public final int w() {
        return Math.min(Math.abs(G()), Math.abs(r()));
    }

    public final int x() {
        return this.f139244c;
    }

    public final long z() {
        return s.a(G(), r());
    }
}
