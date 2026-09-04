package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087@\u0018\u0000 02\u00020\u0001:\u0001\u001fB\u0012\u0012\u0006\u0010\"\u001a\u00020\u001eø\u0001\u0002¢\u0006\u0004\b.\u0010/J\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\f\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\u00020\u001e8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\b\u0088\u0001\"\u0092\u0001\u00020\u001eø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/l0;", "", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", ak.aG, "(JLandroidx/compose/ui/graphics/colorspace/c;)J", "", "o", "(J)F", "p", "q", "r", ak.aB, "(J)Landroidx/compose/ui/graphics/colorspace/c;", "alpha", "red", "green", "blue", "v", "(JFFFF)J", "", "L", "(J)Ljava/lang/String;", "", "K", "(J)I", "other", "", "x", "(JLjava/lang/Object;)Z", "Lkotlin/r1;", ak.av, "J", "()J", "value", androidx.exifinterface.media.a.S4, "getColorSpace$annotations", "()V", "I", "getRed$annotations", "G", "getGreen$annotations", "C", "getBlue$annotations", androidx.exifinterface.media.a.W4, "getAlpha$annotations", "t", "(J)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@androidx.compose.runtime.m0
public final class l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f13894c = n0.d(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f13895d = n0.d(4282664004L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f13896e = n0.d(4287137928L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f13897f = n0.d(4291611852L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f13898g = n0.d(KeyboardMap.kValueMask);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f13899h = n0.d(4294901760L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f13900i = n0.d(4278255360L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f13901j = n0.d(4278190335L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f13902k = n0.d(4294967040L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f13903l = n0.d(4278255615L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f13904m = n0.d(4294902015L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f13905n = n0.b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f13906o = n0.a(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.f13697a.w());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.l0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Color.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010\u001bJ(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002JB\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0013R)\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R)\u0010\u001c\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u0019R)\u0010\u001f\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u0012\u0004\b!\u0010\u001b\u001a\u0004\b \u0010\u0019R)\u0010\"\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u0012\u0004\b$\u0010\u001b\u001a\u0004\b#\u0010\u0019R)\u0010%\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b%\u0010\u0017\u0012\u0004\b'\u0010\u001b\u001a\u0004\b&\u0010\u0019R)\u0010(\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b(\u0010\u0017\u0012\u0004\b*\u0010\u001b\u001a\u0004\b)\u0010\u0019R)\u0010+\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b+\u0010\u0017\u0012\u0004\b-\u0010\u001b\u001a\u0004\b,\u0010\u0019R)\u0010.\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b.\u0010\u0017\u0012\u0004\b0\u0010\u001b\u001a\u0004\b/\u0010\u0019R)\u00101\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b1\u0010\u0017\u0012\u0004\b3\u0010\u001b\u001a\u0004\b2\u0010\u0019R)\u00104\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b4\u0010\u0017\u0012\u0004\b6\u0010\u001b\u001a\u0004\b5\u0010\u0019R)\u00107\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b7\u0010\u0017\u0012\u0004\b9\u0010\u001b\u001a\u0004\b8\u0010\u0019R)\u0010:\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b:\u0010\u0017\u0012\u0004\b;\u0010\u001b\u001a\u0004\b\u0006\u0010\u0019R)\u0010<\u001a\u00020\u00118\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b<\u0010\u0017\u0012\u0004\b>\u0010\u001b\u001a\u0004\b=\u0010\u0019\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {"Landroidx/compose/ui/graphics/l0$a;", "", "", "n", "", RXScreenCaptureService.KEY_HEIGHT, ak.aB, "v", "F", "l", "C", "hue", "saturation", "value", "alpha", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "colorSpace", "Landroidx/compose/ui/graphics/l0;", "D", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "lightness", androidx.exifinterface.media.a.W4, "Black", "J", ak.av, "()J", "getBlack-0d7_KjU$annotations", "()V", "DarkGray", "g", "getDarkGray-0d7_KjU$annotations", "Gray", "i", "getGray-0d7_KjU$annotations", "LightGray", "m", "getLightGray-0d7_KjU$annotations", "White", RXScreenCaptureService.KEY_WIDTH, "getWhite-0d7_KjU$annotations", "Red", "q", "getRed-0d7_KjU$annotations", "Green", "k", "getGreen-0d7_KjU$annotations", "Blue", ak.aF, "getBlue-0d7_KjU$annotations", "Yellow", "y", "getYellow-0d7_KjU$annotations", "Cyan", "e", "getCyan-0d7_KjU$annotations", "Magenta", "o", "getMagenta-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU$annotations", "Unspecified", ak.aG, "getUnspecified-0d7_KjU$annotations", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ long B(Companion companion, float f10, float f11, float f12, float f13, Rgb rgb, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                rgb = ColorSpaces.f13697a.t();
            }
            return companion.A(f10, f11, f12, f14, rgb);
        }

        private final float C(int n10, float h10, float s10, float l10) {
            float f10 = (n10 + (h10 / 30.0f)) % 12.0f;
            return l10 - ((s10 * Math.min(l10, 1.0f - l10)) * Math.max(-1.0f, Math.min(f10 - 3, Math.min(9 - f10, 1.0f))));
        }

        public static /* synthetic */ long E(Companion companion, float f10, float f11, float f12, float f13, Rgb rgb, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                f13 = 1.0f;
            }
            float f14 = f13;
            if ((i10 & 16) != 0) {
                rgb = ColorSpaces.f13697a.t();
            }
            return companion.D(f10, f11, f12, f14, rgb);
        }

        private final float F(int n10, float h10, float s10, float v10) {
            float f10 = (n10 + (h10 / 60.0f)) % 6.0f;
            return v10 - ((s10 * v10) * Math.max(0.0f, Math.min(f10, Math.min(4 - f10, 1.0f))));
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void b() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void d() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void f() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void h() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void j() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void l() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void n() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void p() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void r() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void t() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void v() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void x() {
        }

        @androidx.compose.runtime.j2
        public static /* synthetic */ void z() {
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0034  */
        public final long A(float hue, float saturation, float lightness, float alpha, @dl.d Rgb colorSpace) {
            boolean z10;
            kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
            if (0.0f <= hue && hue <= 360.0f) {
                if (0.0f <= saturation && saturation <= 1.0f) {
                    z10 = (0.0f > lightness ? 1 : (0.0f == lightness ? 0 : -1)) <= 0 && (lightness > 1.0f ? 1 : (lightness == 1.0f ? 0 : -1)) <= 0;
                }
            }
            if (z10) {
                return n0.a(C(0, hue, saturation, lightness), C(8, hue, saturation, lightness), C(4, hue, saturation, lightness), alpha, colorSpace);
            }
            throw new IllegalArgumentException(("HSL (" + hue + ", " + saturation + ", " + lightness + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        public final long D(float hue, float saturation, float value, float alpha, @dl.d Rgb colorSpace) {
            kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
            boolean z10 = false;
            if (0.0f <= hue && hue <= 360.0f) {
                if (0.0f <= saturation && saturation <= 1.0f) {
                    if (0.0f <= value && value <= 1.0f) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                return n0.a(F(5, hue, saturation, value), F(3, hue, saturation, value), F(1, hue, saturation, value), alpha, colorSpace);
            }
            throw new IllegalArgumentException(("HSV (" + hue + ", " + saturation + ", " + value + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        public final long a() {
            return l0.f13894c;
        }

        public final long c() {
            return l0.f13901j;
        }

        public final long e() {
            return l0.f13903l;
        }

        public final long g() {
            return l0.f13895d;
        }

        public final long i() {
            return l0.f13896e;
        }

        public final long k() {
            return l0.f13900i;
        }

        public final long m() {
            return l0.f13897f;
        }

        public final long o() {
            return l0.f13904m;
        }

        public final long q() {
            return l0.f13899h;
        }

        public final long s() {
            return l0.f13905n;
        }

        public final long u() {
            return l0.f13906o;
        }

        public final long w() {
            return l0.f13898g;
        }

        public final long y() {
            return l0.f13902k;
        }
    }

    private /* synthetic */ l0(long j10) {
        this.value = j10;
    }

    public static final float A(long j10) {
        float fJ;
        float f10;
        if (kotlin.r1.h(63 & j10) == 0) {
            fJ = (float) kotlin.d2.j(kotlin.r1.h(kotlin.r1.h(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fJ = (float) kotlin.d2.j(kotlin.r1.h(kotlin.r1.h(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fJ / f10;
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void B() {
    }

    public static final float C(long j10) {
        return kotlin.r1.h(63 & j10) == 0 ? ((float) kotlin.d2.j(kotlin.r1.h(kotlin.r1.h(j10 >>> 32) & 255))) / 255.0f : s0.Q(s0.r((short) kotlin.r1.h(kotlin.r1.h(j10 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void D() {
    }

    @dl.d
    public static final androidx.compose.ui.graphics.colorspace.c E(long j10) {
        ColorSpaces colorSpaces = ColorSpaces.f13697a;
        return colorSpaces.i()[(int) kotlin.r1.h(j10 & 63)];
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void F() {
    }

    public static final float G(long j10) {
        return kotlin.r1.h(63 & j10) == 0 ? ((float) kotlin.d2.j(kotlin.r1.h(kotlin.r1.h(j10 >>> 40) & 255))) / 255.0f : s0.Q(s0.r((short) kotlin.r1.h(kotlin.r1.h(j10 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void H() {
    }

    public static final float I(long j10) {
        return kotlin.r1.h(63 & j10) == 0 ? ((float) kotlin.d2.j(kotlin.r1.h(kotlin.r1.h(j10 >>> 48) & 255))) / 255.0f : s0.Q(s0.r((short) kotlin.r1.h(kotlin.r1.h(j10 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static int K(long j10) {
        return kotlin.r1.w(j10);
    }

    @dl.d
    public static String L(long j10) {
        return "Color(" + I(j10) + ", " + G(j10) + ", " + C(j10) + ", " + A(j10) + ", " + E(j10).getName() + ')';
    }

    public static final /* synthetic */ l0 n(long j10) {
        return new l0(j10);
    }

    @androidx.compose.runtime.j2
    public static final float o(long j10) {
        return I(j10);
    }

    @androidx.compose.runtime.j2
    public static final float p(long j10) {
        return G(j10);
    }

    @androidx.compose.runtime.j2
    public static final float q(long j10) {
        return C(j10);
    }

    @androidx.compose.runtime.j2
    public static final float r(long j10) {
        return A(j10);
    }

    @androidx.compose.runtime.j2
    @dl.d
    public static final androidx.compose.ui.graphics.colorspace.c s(long j10) {
        return E(j10);
    }

    public static long t(long j10) {
        return j10;
    }

    public static final long u(long j10, @dl.d androidx.compose.ui.graphics.colorspace.c colorSpace) {
        kotlin.jvm.internal.f0.p(colorSpace, "colorSpace");
        if (kotlin.jvm.internal.f0.g(colorSpace, E(j10))) {
            return j10;
        }
        androidx.compose.ui.graphics.colorspace.e eVarK = androidx.compose.ui.graphics.colorspace.d.k(E(j10), colorSpace, 0, 2, null);
        float[] fArrJ = n0.j(j10);
        eVarK.e(fArrJ);
        return n0.a(fArrJ[0], fArrJ[1], fArrJ[2], fArrJ[3], colorSpace);
    }

    @androidx.compose.runtime.j2
    public static final long v(long j10, float f10, float f11, float f12, float f13) {
        return n0.a(f11, f12, f13, f10, E(j10));
    }

    public static /* synthetic */ long w(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = A(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = I(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = G(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = C(j10);
        }
        return v(j10, f14, f15, f16, f13);
    }

    public static boolean x(long j10, Object obj) {
        return (obj instanceof l0) && j10 == ((l0) obj).M();
    }

    public static final boolean y(long j10, long j11) {
        return j10 == j11;
    }

    @androidx.compose.runtime.j2
    public static /* synthetic */ void z() {
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public final /* synthetic */ long M() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return x(this.value, obj);
    }

    public int hashCode() {
        return K(this.value);
    }

    @dl.d
    public String toString() {
        return L(this.value);
    }
}
