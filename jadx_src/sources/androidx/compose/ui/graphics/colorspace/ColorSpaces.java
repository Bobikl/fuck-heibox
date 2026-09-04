package androidx.compose.ui.graphics.colorspace;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ColorSpaces.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0011\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bE\u0010FJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010%\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010(\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0017\u0010*\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010,\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b\u0014\u0010\u001fR\u0017\u0010-\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0017\u0010.\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0017\u00100\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u0017\u00102\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b1\u0010\u001fR\u0017\u00103\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u0011\u0010\u001fR\u0017\u00106\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u001fR\u0017\u00108\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b7\u0010\u001fR\u0017\u00109\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b\f\u0010\u001fR\u0017\u0010<\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010:\u001a\u0004\b!\u0010;R\u0017\u0010=\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b\u001c\u0010;R\u001a\u0010?\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b>\u0010\u001fR\u0017\u0010@\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b4\u0010;R \u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\b&\u0010C¨\u0006G"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "", "toXYZD50", "Landroidx/compose/ui/graphics/colorspace/j;", "function", "Landroidx/compose/ui/graphics/colorspace/c;", "x", "", "id", RXScreenCaptureService.KEY_HEIGHT, "(I)Landroidx/compose/ui/graphics/colorspace/c;", "b", "[F", ak.aG, "()[F", "SrgbPrimaries", ak.aF, "p", "Ntsc1953Primaries", "d", "Landroidx/compose/ui/graphics/colorspace/j;", "v", "()Landroidx/compose/ui/graphics/colorspace/j;", "SrgbTransferParameters", "e", "NoneTransferParameters", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "f", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "t", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", "g", "n", "LinearSrgb", "l", "ExtendedSrgb", "i", "m", "LinearExtendedSrgb", "j", "Bt709", "k", "Bt2020", "DciP3", "DisplayP3", "o", "Ntsc1953", ak.aB, "SmpteC", "AdobeRgb", "q", "r", "ProPhotoRgb", ak.av, "Aces", "Acescg", "Landroidx/compose/ui/graphics/colorspace/c;", "()Landroidx/compose/ui/graphics/colorspace/c;", "CieXyz", "CieLab", RXScreenCaptureService.KEY_WIDTH, "Unspecified", "Oklab", "", "[Landroidx/compose/ui/graphics/colorspace/c;", "()[Landroidx/compose/ui/graphics/colorspace/c;", "ColorSpacesArray", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class ColorSpaces {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ColorSpaces f13697a = new ColorSpaces();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final float[] SrgbPrimaries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final float[] Ntsc1953Primaries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final TransferParameters SrgbTransferParameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final TransferParameters NoneTransferParameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb Srgb;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb LinearSrgb;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb ExtendedSrgb;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb LinearExtendedSrgb;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb Bt709;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb Bt2020;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb DciP3;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb DisplayP3;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb Ntsc1953;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb SmpteC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb AdobeRgb;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb ProPhotoRgb;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb Aces;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb Acescg;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c CieXyz;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c CieLab;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final Rgb Unspecified;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c Oklab;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final c[] ColorSpacesArray;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = transferParameters2;
        f fVar = f.f13774a;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, fVar.h(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, fVar.h(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, fVar.h(), null, new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$ExtendedSrgb$1
            @dl.d
            public final Double a(double d10) {
                return Double.valueOf(d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                return a(d10.doubleValue());
            }
        }, new yh.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$ExtendedSrgb$2
            @dl.d
            public final Double a(double d10) {
                return Double.valueOf(d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Double invoke(Double d10) {
                return a(d10.doubleValue());
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, fVar.h(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, fVar.h(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, fVar.h(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, fVar.h(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, fVar.c(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, fVar.h(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, fVar.h(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, fVar.d(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, fVar.g(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, fVar.g(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        l lVar = new l("Generic XYZ", 14);
        CieXyz = lVar;
        g gVar = new g("Generic L*a*b*", 15);
        CieLab = gVar;
        Rgb rgb15 = new Rgb(d4.d.f108133a, fArr, fVar.h(), transferParameters2, 16);
        Unspecified = rgb15;
        h hVar = new h("Oklab", 17);
        Oklab = hVar;
        ColorSpacesArray = new c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, lVar, gVar, rgb15, hVar};
    }

    private ColorSpaces() {
    }

    @dl.d
    public final Rgb a() {
        return Aces;
    }

    @dl.d
    public final Rgb b() {
        return Acescg;
    }

    @dl.d
    public final Rgb c() {
        return AdobeRgb;
    }

    @dl.d
    public final Rgb d() {
        return Bt2020;
    }

    @dl.d
    public final Rgb e() {
        return Bt709;
    }

    @dl.d
    public final c f() {
        return CieLab;
    }

    @dl.d
    public final c g() {
        return CieXyz;
    }

    @dl.d
    public final c h(int id2) {
        return i()[id2];
    }

    @dl.d
    public final c[] i() {
        return ColorSpacesArray;
    }

    @dl.d
    public final Rgb j() {
        return DciP3;
    }

    @dl.d
    public final Rgb k() {
        return DisplayP3;
    }

    @dl.d
    public final Rgb l() {
        return ExtendedSrgb;
    }

    @dl.d
    public final Rgb m() {
        return LinearExtendedSrgb;
    }

    @dl.d
    public final Rgb n() {
        return LinearSrgb;
    }

    @dl.d
    public final Rgb o() {
        return Ntsc1953;
    }

    @dl.d
    public final float[] p() {
        return Ntsc1953Primaries;
    }

    @dl.d
    public final c q() {
        return Oklab;
    }

    @dl.d
    public final Rgb r() {
        return ProPhotoRgb;
    }

    @dl.d
    public final Rgb s() {
        return SmpteC;
    }

    @dl.d
    public final Rgb t() {
        return Srgb;
    }

    @dl.d
    public final float[] u() {
        return SrgbPrimaries;
    }

    @dl.d
    public final TransferParameters v() {
        return SrgbTransferParameters;
    }

    @dl.d
    public final Rgb w() {
        return Unspecified;
    }

    @dl.e
    public final c x(@dl.d float[] toXYZD50, @dl.d TransferParameters function) {
        f0.p(toXYZD50, "toXYZD50");
        f0.p(function, "function");
        for (c cVar : ColorSpacesArray) {
            if (b.h(cVar.getCom.taobao.accs.common.Constants.KEY_MODEL java.lang.String(), b.INSTANCE.c())) {
                c cVarE = d.e(cVar, f.f13774a.d(), null, 2, null);
                f0.n(cVarE, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                Rgb rgb = (Rgb) cVarE;
                if (d.i(toXYZD50, rgb.getTransform()) && d.g(function, rgb.getTransferParameters())) {
                    return cVar;
                }
            }
        }
        return null;
    }
}
