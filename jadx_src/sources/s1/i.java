package s1;

import androidx.compose.runtime.j2;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\n\u001a+\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\u0007\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\n\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\r\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a&\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\b\u001a&\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\b\u001a*\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\b\u001a\"\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\b\u001a-\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u0016\u001a%\u0010\u000f\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010 \u001a+\u0010!\u001a\u00020\u001f*\u00020\u001f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"\u001a-\u0010#\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010$\u001a%\u0010\u0010\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010 \u001a+\u0010(\u001a\u00020'*\u00020'2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020'0\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u0010\"\u001a\"\u0010*\u001a\u00020'*\u00020\f2\u0006\u0010)\u001a\u00020'H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010+\u001a\"\u0010,\u001a\u00020'*\u00020\u00052\u0006\u0010)\u001a\u00020'H\u0087\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010-\u001a-\u0010.\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b.\u0010$\"\"\u00104\u001a\u00020/*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101\"\"\u00107\u001a\u00020/*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b6\u00103\u001a\u0004\b5\u00101\"\"\u0010<\u001a\u00020\u0000*\u00020\f8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109\"\"\u0010<\u001a\u00020\u0000*\u00020\t8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b:\u0010?\u001a\u0004\b=\u0010>\"\"\u0010<\u001a\u00020\u0000*\u00020\u00058Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b:\u00103\u001a\u0004\b@\u0010A\"\"\u0010D\u001a\u00020/*\u00020\u00008Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bC\u00103\u001a\u0004\bB\u00101\"\"\u00104\u001a\u00020/*\u00020\u001f8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010F\"\"\u00107\u001a\u00020/*\u00020\u001f8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bJ\u0010H\u001a\u0004\bI\u0010F\"\"\u00104\u001a\u00020/*\u00020'8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bK\u0010H\u001a\u0004\b\u001d\u0010F\"\"\u00107\u001a\u00020/*\u00020'8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bM\u0010H\u001a\u0004\bL\u0010F\"!\u0010Q\u001a\u00020\u001f*\u00020'8FX\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bP\u0010H\u001a\u0004\bN\u0010O\"\"\u0010%\u001a\u00020\u0000*\u00020R8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010T\"\"\u0010&\u001a\u00020\u0000*\u00020R8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\bX\u0010V\u001a\u0004\bW\u0010T\"\"\u0010)\u001a\u00020'*\u00020R8Æ\u0002X\u0087\u0004ø\u0001\u0002¢\u0006\f\u0012\u0004\b[\u0010V\u001a\u0004\bY\u0010Z\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Ls1/h;", "Lkotlin/Function0;", "block", "M", "(FLyh/a;)F", "", "other", "Q", "(FF)F", "", "P", "(DF)F", "", "R", "(IF)F", ak.av, "b", "L", "K", "minimumValue", "maximumValue", "e", "(FFF)F", ak.aF, "d", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", Progress.G, "I", "x", "y", "Ls1/j;", "(FF)J", "N", "(JLyh/a;)J", "J", "(JJF)J", "width", "height", "Ls1/l;", "O", UiKitSpanObj.TYPE_SIZE, androidx.exifinterface.media.a.f23244d5, "(IJ)J", androidx.exifinterface.media.a.R4, "(FJ)J", "H", "", "v", "(F)Z", "isSpecified-0680j_4$annotations", "(F)V", "isSpecified", "B", "isUnspecified-0680j_4$annotations", "isUnspecified", "j", "(I)F", "getDp$annotations", "(I)V", "dp", RXScreenCaptureService.KEY_HEIGHT, "(D)F", "(D)V", "i", "(F)F", "t", "isFinite-0680j_4$annotations", "isFinite", ak.aD, "(J)Z", "isSpecified-jo-Fl9I$annotations", "(J)V", "F", "isUnspecified-jo-Fl9I$annotations", "isSpecified-EaSLcWc$annotations", "D", "isUnspecified-EaSLcWc$annotations", "f", "(J)J", "getCenter-EaSLcWc$annotations", com.google.android.exoplayer2.text.ttml.d.f49794m0, "Ls1/k;", "r", "(Ls1/k;)F", "getWidth$annotations", "(Ls1/k;)V", "n", "getHeight$annotations", "p", "(Ls1/k;)J", "getSize$annotations", "ui-unit_release"}, k = 2, mv = {1, 7, 1})
public final class i {
    @j2
    public static /* synthetic */ void A(long j10) {
    }

    public static final boolean B(float f10) {
        return Float.isNaN(f10);
    }

    @j2
    public static /* synthetic */ void C(float f10) {
    }

    public static final boolean D(long j10) {
        return j10 == l.f139233b.a();
    }

    @j2
    public static /* synthetic */ void E(long j10) {
    }

    public static final boolean F(long j10) {
        return j10 == j.f139224b.a();
    }

    @j2
    public static /* synthetic */ void G(long j10) {
    }

    @j2
    public static final long H(long j10, long j11, float f10) {
        return b(I(l.p(j10), l.p(j11), f10), I(l.m(j10), l.m(j11), f10));
    }

    @j2
    public static final float I(float f10, float f11, float f12) {
        return h.g(u1.d.a(f10, f11, f12));
    }

    @j2
    public static final long J(long j10, long j11, float f10) {
        return a(I(j.j(j10), j.j(j11), f10), I(j.l(j10), j.l(j11), f10));
    }

    @j2
    public static final float K(float f10, float f11) {
        return h.g(Math.max(f10, f11));
    }

    @j2
    public static final float L(float f10, float f11) {
        return h.g(Math.min(f10, f11));
    }

    public static final float M(float f10, @dl.d yh.a<h> block) {
        f0.p(block, "block");
        return Float.isNaN(f10) ^ true ? f10 : block.invoke().w();
    }

    public static final long N(long j10, @dl.d yh.a<j> block) {
        f0.p(block, "block");
        return (j10 > j.f139224b.a() ? 1 : (j10 == j.f139224b.a() ? 0 : -1)) != 0 ? j10 : block.invoke().getF139227a();
    }

    public static final long O(long j10, @dl.d yh.a<l> block) {
        f0.p(block, "block");
        return (j10 > l.f139233b.a() ? 1 : (j10 == l.f139233b.a() ? 0 : -1)) != 0 ? j10 : block.invoke().getF139236a();
    }

    @j2
    public static final float P(double d10, float f10) {
        return h.g(((float) d10) * f10);
    }

    @j2
    public static final float Q(float f10, float f11) {
        return h.g(f10 * f11);
    }

    @j2
    public static final float R(int i10, float f10) {
        return h.g(i10 * f10);
    }

    @j2
    public static final long S(float f10, long j10) {
        return l.u(j10, f10);
    }

    @j2
    public static final long T(int i10, long j10) {
        return l.v(j10, i10);
    }

    @j2
    public static final long a(float f10, float f11) {
        return j.d((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }

    @j2
    public static final long b(float f10, float f11) {
        return l.f((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }

    @j2
    public static final float c(float f10, float f11) {
        return h.g(fi.u.t(f10, f11));
    }

    @j2
    public static final float d(float f10, float f11) {
        return h.g(fi.u.A(f10, f11));
    }

    @j2
    public static final float e(float f10, float f11, float f12) {
        return h.g(fi.u.H(f10, f11, f12));
    }

    public static final long f(long j10) {
        return a(h.g(l.p(j10) / 2.0f), h.g(l.m(j10) / 2.0f));
    }

    @j2
    public static /* synthetic */ void g(long j10) {
    }

    public static final float h(double d10) {
        return h.g((float) d10);
    }

    public static final float i(float f10) {
        return h.g(f10);
    }

    public static final float j(int i10) {
        return h.g(i10);
    }

    @j2
    public static /* synthetic */ void k(double d10) {
    }

    @j2
    public static /* synthetic */ void l(float f10) {
    }

    @j2
    public static /* synthetic */ void m(int i10) {
    }

    public static final float n(@dl.d DpRect kVar) {
        f0.p(kVar, "<this>");
        return h.g(kVar.g() - kVar.m());
    }

    @j2
    public static /* synthetic */ void o(DpRect kVar) {
    }

    public static final long p(@dl.d DpRect kVar) {
        f0.p(kVar, "<this>");
        return b(h.g(kVar.k() - kVar.i()), h.g(kVar.g() - kVar.m()));
    }

    @j2
    public static /* synthetic */ void q(DpRect kVar) {
    }

    public static final float r(@dl.d DpRect kVar) {
        f0.p(kVar, "<this>");
        return h.g(kVar.k() - kVar.i());
    }

    @j2
    public static /* synthetic */ void s(DpRect kVar) {
    }

    public static final boolean t(float f10) {
        return !(f10 == Float.POSITIVE_INFINITY);
    }

    @j2
    public static /* synthetic */ void u(float f10) {
    }

    public static final boolean v(float f10) {
        return !Float.isNaN(f10);
    }

    @j2
    public static /* synthetic */ void w(float f10) {
    }

    public static final boolean x(long j10) {
        return j10 != l.f139233b.a();
    }

    @j2
    public static /* synthetic */ void y(long j10) {
    }

    public static final boolean z(long j10) {
        return j10 != j.f139224b.a();
    }
}
