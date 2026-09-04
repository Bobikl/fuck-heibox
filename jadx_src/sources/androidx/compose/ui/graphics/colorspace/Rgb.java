package androidx.compose.ui.graphics.colorspace;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import org.apache.tools.ant.types.selectors.o;

/* JADX INFO: compiled from: Rgb.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 \u000b2\u00020\u0001:\u0001UBu\b\u0000\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:09\u0012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:09\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\u0006\u0010'\u001a\u00020\u000e\u0012\b\u0010-\u001a\u0004\u0018\u00010(\u0012\u0006\u0010E\u001a\u00020\f¢\u0006\u0004\bF\u0010GBA\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:09\u0012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:09¢\u0006\u0004\bF\u0010IBY\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:09\u0012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:09\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\bF\u0010JB!\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\u0006\u0010K\u001a\u00020(¢\u0006\u0004\bF\u0010LB)\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010K\u001a\u00020(¢\u0006\u0004\bF\u0010MB1\b\u0010\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010K\u001a\u00020(\u0012\u0006\u0010E\u001a\u00020\f¢\u0006\u0004\bF\u0010NB!\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020:¢\u0006\u0004\bF\u0010PB)\b\u0016\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010O\u001a\u00020:¢\u0006\u0004\bF\u0010QBA\b\u0010\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010O\u001a\u00020:\u0012\u0006\u0010%\u001a\u00020\u000e\u0012\u0006\u0010'\u001a\u00020\u000e\u0012\u0006\u0010E\u001a\u00020\f¢\u0006\u0004\bF\u0010RB!\b\u0010\u0012\u0006\u0010S\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u001f¢\u0006\u0004\bF\u0010TJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002J\u001e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001e\u001a\u00020\fH\u0016R\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0014R\u0019\u0010-\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b2\u00101R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u001a\u00107\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b)\u00106R\u001a\u00108\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b&\u00106R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R#\u0010?\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:098\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b\u0015\u0010>R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\b\u0011\u0010>R#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:098\u0006¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>¨\u0006V"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/c;", "", "x", "B", ak.aB, "primaries", "y", "transform", "C", "inverseTransform", "t", "", "component", "", "f", "e", "r", "g", "b", "F", "v", "G", "o", "p", "l", "", "other", "", "equals", "hashCode", "Landroidx/compose/ui/graphics/colorspace/k;", "Landroidx/compose/ui/graphics/colorspace/k;", androidx.exifinterface.media.a.S4, "()Landroidx/compose/ui/graphics/colorspace/k;", "whitePoint", RXScreenCaptureService.KEY_HEIGHT, o.f136588l, "i", o.f136589m, "Landroidx/compose/ui/graphics/colorspace/j;", "j", "Landroidx/compose/ui/graphics/colorspace/j;", androidx.exifinterface.media.a.W4, "()Landroidx/compose/ui/graphics/colorspace/j;", "transferParameters", "k", "[F", ak.aD, "()[F", "D", "m", ak.aG, "Z", "()Z", "isWideGamut", "isSrgb", "Lkotlin/Function1;", "", "oetfOrig", "Lyh/l;", RXScreenCaptureService.KEY_WIDTH, "()Lyh/l;", "oetf", "eotfOrig", "eotf", "q", "", "name", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/k;[FLyh/l;Lyh/l;FFLandroidx/compose/ui/graphics/colorspace/j;I)V", "toXYZ", "(Ljava/lang/String;[FLyh/l;Lyh/l;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/k;Lyh/l;Lyh/l;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/j;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/k;Landroidx/compose/ui/graphics/colorspace/j;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/k;Landroidx/compose/ui/graphics/colorspace/j;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/k;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/k;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/k;)V", ak.av, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class Rgb extends c {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final yh.l<Double, Double> f13724u = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$DoubleIdentity$1
        @dl.d
        public final Double a(double d10) {
            return Double.valueOf(d10);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Double invoke(Double d10) {
            return a(d10.doubleValue());
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WhitePoint whitePoint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float max;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final TransferParameters transferParameters;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] primaries;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] transform;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final float[] inverseTransform;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final yh.l<Double, Double> f13732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final yh.l<Double, Double> f13733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final yh.l<Double, Double> f13734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final yh.l<Double, Double> f13735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isWideGamut;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isSrgb;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.Rgb$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Rgb.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(JX\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J8\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$a;", "", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/k;", "whitePoint", "Lkotlin/Function1;", "", "OETF", "EOTF", "", o.f136588l, o.f136589m, "", "id", "", "m", "point", ak.av, "b", "g", "n", "f", "ax", "ay", "bx", "by", "l", "p1", "p2", "k", "toXYZ", "i", "o", "j", RXScreenCaptureService.KEY_HEIGHT, "([F)[F", "DoubleIdentity", "Lyh/l;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final float f(float[] primaries) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean g(double d10, yh.l<? super Double, Double> lVar, yh.l<? super Double, Double> lVar2) {
            return Math.abs(lVar.invoke(Double.valueOf(d10)).doubleValue() - lVar2.invoke(Double.valueOf(d10)).doubleValue()) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint i(float[] toXYZ) {
            float[] fArrO = d.o(toXYZ, new float[]{1.0f, 1.0f, 1.0f});
            float f10 = fArrO[0];
            float f11 = fArrO[1];
            float f12 = f10 + f11 + fArrO[2];
            return new WhitePoint(f10 / f12, f11 / f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] j(float[] primaries, WhitePoint whitePoint) {
            float f10 = primaries[0];
            float f11 = primaries[1];
            float f12 = primaries[2];
            float f13 = primaries[3];
            float f14 = primaries[4];
            float f15 = primaries[5];
            float fE = whitePoint.e();
            float f16 = whitePoint.f();
            float f17 = 1;
            float f18 = (f17 - f10) / f11;
            float f19 = (f17 - f12) / f13;
            float f20 = (f17 - f14) / f15;
            float f21 = (f17 - fE) / f16;
            float f22 = f10 / f11;
            float f23 = (f12 / f13) - f22;
            float f24 = (fE / f16) - f22;
            float f25 = f19 - f18;
            float f26 = (f14 / f15) - f22;
            float f27 = (((f21 - f18) * f23) - (f24 * f25)) / (((f20 - f18) * f23) - (f25 * f26));
            float f28 = (f24 - (f26 * f27)) / f23;
            float f29 = (1.0f - f28) - f27;
            float f30 = f29 / f11;
            float f31 = f28 / f13;
            float f32 = f27 / f15;
            return new float[]{f30 * f10, f29, f30 * ((1.0f - f10) - f11), f31 * f12, f28, f31 * ((1.0f - f12) - f13), f32 * f14, f27, f32 * ((1.0f - f14) - f15)};
        }

        private final boolean k(float[] p10, float[] p11) {
            float f10 = p10[0] - p11[0];
            float f11 = p10[1] - p11[1];
            float[] fArr = {f10, f11, p10[2] - p11[2], p10[3] - p11[3], p10[4] - p11[4], p10[5] - p11[5]};
            return l(f10, f11, p11[0] - p11[4], p11[1] - p11[5]) >= 0.0f && l(p11[0] - p11[2], p11[1] - p11[3], fArr[0], fArr[1]) >= 0.0f && l(fArr[2], fArr[3], p11[2] - p11[0], p11[3] - p11[1]) >= 0.0f && l(p11[2] - p11[4], p11[3] - p11[5], fArr[2], fArr[3]) >= 0.0f && l(fArr[4], fArr[5], p11[4] - p11[2], p11[5] - p11[3]) >= 0.0f && l(p11[4] - p11[0], p11[5] - p11[1], fArr[4], fArr[5]) >= 0.0f;
        }

        private final float l(float ax, float ay, float bx, float by) {
            return (ax * by) - (ay * bx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(float[] fArr, WhitePoint whitePoint, yh.l<? super Double, Double> lVar, yh.l<? super Double, Double> lVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.f13697a;
            if (!d.i(fArr, colorSpaces.u()) || !d.h(whitePoint, f.f13774a.h())) {
                return false;
            }
            if (!(f10 == 0.0f)) {
                return false;
            }
            if (!(f11 == 1.0f)) {
                return false;
            }
            Rgb rgbT = colorSpaces.t();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!g(d10, lVar, rgbT.w()) || !g(d10, lVar2, rgbT.r())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(float[] primaries, float min, float max) {
            float f10 = f(primaries);
            ColorSpaces colorSpaces = ColorSpaces.f13697a;
            return (f10 / f(colorSpaces.p()) > 0.9f && k(primaries, colorSpaces.u())) || (min < 0.0f && max > 1.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] o(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length == 9) {
                float f10 = primaries[0];
                float f11 = primaries[1];
                float f12 = f10 + f11 + primaries[2];
                fArr[0] = f10 / f12;
                fArr[1] = f11 / f12;
                float f13 = primaries[3];
                float f14 = primaries[4];
                float f15 = f13 + f14 + primaries[5];
                fArr[2] = f13 / f15;
                fArr[3] = f14 / f15;
                float f16 = primaries[6];
                float f17 = primaries[7];
                float f18 = f16 + f17 + primaries[8];
                fArr[4] = f16 / f18;
                fArr[5] = f17 / f18;
            } else {
                m.i1(primaries, fArr, 0, 0, 6, 6, null);
            }
            return fArr;
        }

        @dl.d
        public final float[] h(@dl.d float[] toXYZ) {
            f0.p(toXYZ, "toXYZ");
            float[] fArrO = d.o(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrO2 = d.o(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrO3 = d.o(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f10 = fArrO[0];
            float f11 = fArrO[1];
            float f12 = f10 + f11 + fArrO[2];
            float f13 = fArrO2[0] + fArrO2[1] + fArrO2[2];
            float f14 = fArrO3[0] + fArrO3[1] + fArrO3[2];
            return new float[]{f10 / f12, f11 / f12, fArrO2[0] / f13, fArrO2[1] / f13, fArrO3[0] / f14, fArrO3[1] / f14};
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@dl.d Rgb colorSpace, @dl.d float[] transform, @dl.d WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.primaries, whitePoint, transform, colorSpace.f13732n, colorSpace.f13734p, colorSpace.min, colorSpace.max, colorSpace.transferParameters, -1);
        f0.p(colorSpace, "colorSpace");
        f0.p(transform, "transform");
        f0.p(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@dl.d String name, @dl.d float[] toXYZ, double d10) {
        f0.p(name, "name");
        f0.p(toXYZ, "toXYZ");
        Companion companion = INSTANCE;
        this(name, companion.h(toXYZ), companion.i(toXYZ), d10, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@dl.d String name, @dl.d float[] toXYZ, @dl.d TransferParameters function) {
        f0.p(name, "name");
        f0.p(toXYZ, "toXYZ");
        f0.p(function, "function");
        Companion companion = INSTANCE;
        this(name, companion.h(toXYZ), companion.i(toXYZ), function, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@dl.d String name, @dl.d float[] primaries, @dl.d WhitePoint whitePoint, double d10) {
        this(name, primaries, whitePoint, d10, 0.0f, 1.0f, -1);
        f0.p(name, "name");
        f0.p(primaries, "primaries");
        f0.p(whitePoint, "whitePoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@dl.d String name, @dl.d float[] primaries, @dl.d WhitePoint whitePoint, final double d10, float f10, float f11, int i10) {
        this(name, primaries, whitePoint, null, (d10 > 1.0d ? 1 : (d10 == 1.0d ? 0 : -1)) == 0 ? f13724u : new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Double a(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Double.valueOf(Math.pow(d11, 1.0d / d10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d11) {
                return a(d11.doubleValue());
            }
        }, d10 == 1.0d ? f13724u : new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @dl.d
            public final Double a(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Double.valueOf(Math.pow(d11, d10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d11) {
                return a(d11.doubleValue());
            }
        }, f10, f11, new TransferParameters(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
        f0.p(name, "name");
        f0.p(primaries, "primaries");
        f0.p(whitePoint, "whitePoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@dl.d String name, @dl.d float[] primaries, @dl.d WhitePoint whitePoint, @dl.d TransferParameters function) {
        this(name, primaries, whitePoint, function, -1);
        f0.p(name, "name");
        f0.p(primaries, "primaries");
        f0.p(whitePoint, "whitePoint");
        f0.p(function, "function");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    public Rgb(@dl.d String name, @dl.d float[] primaries, @dl.d WhitePoint whitePoint, @dl.d final TransferParameters function, int i10) {
        yh.l<Double, Double> lVar;
        yh.l<Double, Double> lVar2;
        f0.p(name, "name");
        f0.p(primaries, "primaries");
        f0.p(whitePoint, "whitePoint");
        f0.p(function, "function");
        if (function.n() == 0.0d) {
            if (function.o() == 0.0d) {
                lVar = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.1
                    {
                        super(1);
                    }

                    @dl.d
                    public final Double a(double d10) {
                        return Double.valueOf(d.p(d10, function.j(), function.k(), function.l(), function.m(), function.p()));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                        return a(d10.doubleValue());
                    }
                };
            } else {
                lVar = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.2
                    {
                        super(1);
                    }

                    @dl.d
                    public final Double a(double d10) {
                        return Double.valueOf(d.q(d10, function.j(), function.k(), function.l(), function.m(), function.n(), function.o(), function.p()));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                        return a(d10.doubleValue());
                    }
                };
            }
        } else {
            lVar = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.2
                {
                    super(1);
                }

                @dl.d
                public final Double a(double d10) {
                    return Double.valueOf(d.q(d10, function.j(), function.k(), function.l(), function.m(), function.n(), function.o(), function.p()));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                    return a(d10.doubleValue());
                }
            };
        }
        yh.l<Double, Double> lVar3 = lVar;
        if (function.n() == 0.0d) {
            if (function.o() == 0.0d) {
                lVar2 = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.3
                    {
                        super(1);
                    }

                    @dl.d
                    public final Double a(double d10) {
                        return Double.valueOf(d.r(d10, function.j(), function.k(), function.l(), function.m(), function.p()));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                        return a(d10.doubleValue());
                    }
                };
            } else {
                lVar2 = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.4
                    {
                        super(1);
                    }

                    @dl.d
                    public final Double a(double d10) {
                        return Double.valueOf(d.s(d10, function.j(), function.k(), function.l(), function.m(), function.n(), function.o(), function.p()));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                        return a(d10.doubleValue());
                    }
                };
            }
        } else {
            lVar2 = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb.4
                {
                    super(1);
                }

                @dl.d
                public final Double a(double d10) {
                    return Double.valueOf(d.s(d10, function.j(), function.k(), function.l(), function.m(), function.n(), function.o(), function.p()));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                    return a(d10.doubleValue());
                }
            };
        }
        this(name, primaries, whitePoint, null, lVar3, lVar2, 0.0f, 1.0f, function, i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@dl.d String name, @dl.d float[] primaries, @dl.d WhitePoint whitePoint, @dl.d yh.l<? super Double, Double> oetf, @dl.d yh.l<? super Double, Double> eotf, float f10, float f11) {
        this(name, primaries, whitePoint, null, oetf, eotf, f10, f11, null, -1);
        f0.p(name, "name");
        f0.p(primaries, "primaries");
        f0.p(whitePoint, "whitePoint");
        f0.p(oetf, "oetf");
        f0.p(eotf, "eotf");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Rgb(@dl.d String name, @dl.d float[] primaries, @dl.d WhitePoint whitePoint, @dl.e float[] fArr, @dl.d yh.l<? super Double, Double> oetf, @dl.d yh.l<? super Double, Double> eotf, float f10, float f11, @dl.e TransferParameters transferParameters, int i10) {
        super(name, b.INSTANCE.c(), i10, null);
        f0.p(name, "name");
        f0.p(primaries, "primaries");
        f0.p(whitePoint, "whitePoint");
        f0.p(oetf, "oetf");
        f0.p(eotf, "eotf");
        this.whitePoint = whitePoint;
        this.min = f10;
        this.max = f11;
        this.transferParameters = transferParameters;
        this.f13732n = oetf;
        this.f13733o = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @dl.d
            public final Double a(double d10) {
                return Double.valueOf(fi.u.G(this.f13746b.w().invoke(Double.valueOf(d10)).doubleValue(), this.f13746b.min, this.f13746b.max));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                return a(d10.doubleValue());
            }
        };
        this.f13734p = eotf;
        this.f13735q = new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @dl.d
            public final Double a(double d10) {
                return this.f13745b.r().invoke(Double.valueOf(fi.u.G(d10, this.f13745b.min, this.f13745b.max)));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                return a(d10.doubleValue());
            }
        };
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrO = companion.o(primaries);
        this.primaries = fArrO;
        if (fArr == null) {
            this.transform = companion.j(fArrO, whitePoint);
        } else {
            if (fArr.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.transform = fArr;
        }
        this.inverseTransform = d.l(this.transform);
        this.isWideGamut = companion.n(fArrO, f10, f11);
        this.isSrgb = companion.m(fArrO, whitePoint, oetf, eotf, f10, f11, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(@dl.d String name, @dl.d float[] toXYZ, @dl.d yh.l<? super Double, Double> oetf, @dl.d yh.l<? super Double, Double> eotf) {
        f0.p(name, "name");
        f0.p(toXYZ, "toXYZ");
        f0.p(oetf, "oetf");
        f0.p(eotf, "eotf");
        Companion companion = INSTANCE;
        this(name, companion.h(toXYZ), companion.i(toXYZ), null, oetf, eotf, 0.0f, 1.0f, null, -1);
    }

    @dl.e
    /* JADX INFO: renamed from: A, reason: from getter */
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @dl.d
    public final float[] B() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        f0.o(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @dl.d
    public final float[] C(@dl.d float[] transform) {
        f0.p(transform, "transform");
        return m.i1(this.transform, transform, 0, 0, 0, 14, null);
    }

    @dl.d
    /* JADX INFO: renamed from: D, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    @dl.d
    /* JADX INFO: renamed from: E, reason: from getter */
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @dl.d
    public final float[] F(float r10, float g10, float b10) {
        return G(new float[]{r10, g10, b10});
    }

    @dl.d
    public final float[] G(@dl.d float[] v10) {
        f0.p(v10, "v");
        v10[0] = (float) this.f13735q.invoke(Double.valueOf(v10[0])).doubleValue();
        v10[1] = (float) this.f13735q.invoke(Double.valueOf(v10[1])).doubleValue();
        v10[2] = (float) this.f13735q.invoke(Double.valueOf(v10[2])).doubleValue();
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @dl.d
    public float[] b(@dl.d float[] v10) {
        f0.p(v10, "v");
        d.o(this.inverseTransform, v10);
        v10[0] = (float) this.f13733o.invoke(Double.valueOf(v10[0])).doubleValue();
        v10[1] = (float) this.f13733o.invoke(Double.valueOf(v10[1])).doubleValue();
        v10[2] = (float) this.f13733o.invoke(Double.valueOf(v10[2])).doubleValue();
        return v10;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float e(int component) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !f0.g(n0.d(Rgb.class), n0.d(other.getClass())) || !super.equals(other)) {
            return false;
        }
        Rgb rgb = (Rgb) other;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !f0.g(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return f0.g(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (f0.g(this.f13732n, rgb.f13732n)) {
            return f0.g(this.f13734p, rgb.f13734p);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public float f(int component) {
        return this.min;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f10 = this.min;
        int iFloatToIntBits = (iHashCode + (!((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (!(f11 == 0.0f) ? Float.floatToIntBits(f11) : 0)) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.f13732n.hashCode()) * 31) + this.f13734p.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    @dl.d
    public float[] l(@dl.d float[] v10) {
        f0.p(v10, "v");
        v10[0] = (float) this.f13735q.invoke(Double.valueOf(v10[0])).doubleValue();
        v10[1] = (float) this.f13735q.invoke(Double.valueOf(v10[1])).doubleValue();
        v10[2] = (float) this.f13735q.invoke(Double.valueOf(v10[2])).doubleValue();
        return d.o(this.transform, v10);
    }

    @dl.d
    public final float[] o(float r10, float g10, float b10) {
        return p(new float[]{r10, g10, b10});
    }

    @dl.d
    public final float[] p(@dl.d float[] v10) {
        f0.p(v10, "v");
        v10[0] = (float) this.f13733o.invoke(Double.valueOf(v10[0])).doubleValue();
        v10[1] = (float) this.f13733o.invoke(Double.valueOf(v10[1])).doubleValue();
        v10[2] = (float) this.f13733o.invoke(Double.valueOf(v10[2])).doubleValue();
        return v10;
    }

    @dl.d
    public final yh.l<Double, Double> q() {
        return this.f13735q;
    }

    @dl.d
    public final yh.l<Double, Double> r() {
        return this.f13734p;
    }

    @dl.d
    public final float[] s() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        f0.o(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @dl.d
    public final float[] t(@dl.d float[] inverseTransform) {
        f0.p(inverseTransform, "inverseTransform");
        return m.i1(this.inverseTransform, inverseTransform, 0, 0, 0, 14, null);
    }

    @dl.d
    /* JADX INFO: renamed from: u, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    @dl.d
    public final yh.l<Double, Double> v() {
        return this.f13733o;
    }

    @dl.d
    public final yh.l<Double, Double> w() {
        return this.f13732n;
    }

    @dl.d
    public final float[] x() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        f0.o(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @dl.d
    public final float[] y(@dl.d float[] primaries) {
        f0.p(primaries, "primaries");
        return m.i1(this.primaries, primaries, 0, 0, 0, 14, null);
    }

    @dl.d
    /* JADX INFO: renamed from: z, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }
}
