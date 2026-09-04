package androidx.compose.ui.graphics;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: Float16.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081@\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\u0014\b\u0016\u0012\u0006\u00108\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b9\u0010:B\u0014\b\u0016\u0012\u0006\u00108\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b;\u0010<B\u0012\u0012\u0006\u00102\u001a\u00020\u0005ø\u0001\u0001¢\u0006\u0004\b=\u0010\u0007J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0007J\u0016\u0010 \u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0007J\u0016\u0010!\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0007J\u0016\u0010\"\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0007J\u0016\u0010#\u001a\u00020\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0007J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020$¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020$¢\u0006\u0004\b(\u0010&J\r\u0010)\u001a\u00020$¢\u0006\u0004\b)\u0010&J\r\u0010*\u001a\u00020\u0016¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b+\u0010\nJ\u001a\u0010-\u001a\u00020$2\b\u0010\u0019\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u00102\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b0\u00101R\u001a\u0010\u001c\u001a\u00020\u00008Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b3\u0010\u0007R\u0011\u00105\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\nR\u0011\u00107\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\n\u0088\u00012\u0092\u0001\u00020\u0005ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/graphics/s0;", "", "", "O", "(S)B", "", androidx.exifinterface.media.a.T4, "(S)S", "", androidx.exifinterface.media.a.R4, "(S)I", "", "U", "(S)J", "", "Q", "(S)F", "", "P", "(S)D", "N", androidx.exifinterface.media.a.X4, "", "X", "(S)Ljava/lang/String;", "other", "o", "(SS)I", "sign", "a0", "(SS)S", ak.av, "M", "m", RXScreenCaptureService.KEY_WIDTH, "Y", "", "K", "(S)Z", "J", "I", "L", "R", "C", "", ak.aB, "(SLjava/lang/Object;)Z", "b", "y", "()S", "halfValue", ak.aD, "x", "exponent", androidx.exifinterface.media.a.W4, "significand", "value", "q", "(F)S", "p", "(D)S", "r", ak.aF, "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class s0 implements Comparable<s0> {
    private static final int A = 31;
    private static final int B = 23;
    private static final int C = 255;
    private static final int D = 8388607;
    private static final int E = 127;
    private static final int F = 4194304;
    private static final int G = 1056964608;
    private static final float H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13976d = 16;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13978f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f13979g = -14;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f13991s = 15;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f13992t = 32768;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f13993u = 10;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f13994v = 31;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f13995w = 1023;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f13996x = 15;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f13997y = 32767;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f13998z = 31744;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final short halfValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final short f13977e = r(5120);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final short f13980h = r(-1025);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final short f13981i = r(31743);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final short f13982j = r(com.google.android.exoplayer2.audio.q0.f44203w);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final short f13983k = r(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final short f13984l = r(32256);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final short f13985m = r(-1024);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final short f13986n = r(kotlin.jvm.internal.r0.f124963b);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final short f13987o = r(31744);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final short f13988p = r(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final short f13989q = q(1.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final short f13990r = q(-1.0f);

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.s0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Float16.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0007\u0010\rR \u0010\u0011\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR \u0010\u0013\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR \u0010\u0015\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR \u0010\u0017\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\rR \u0010\u0019\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rR \u0010\u001b\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR \u0010\u001d\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010 R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010 R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010 R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010 R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010 R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010 R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010 R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010 R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010 R\u001d\u00103\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b3\u0010\u000bR\u001d\u00104\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b4\u0010\u000bR\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/ui/graphics/s0$a;", "", "", "value", "", "n", "", "f", ak.aF, "Landroidx/compose/ui/graphics/s0;", "Epsilon", androidx.exifinterface.media.a.R4, "d", "()S", "LowestValue", "e", "MaxValue", "MinNormal", "g", "MinValue", RXScreenCaptureService.KEY_HEIGHT, "NaN", "i", "NegativeInfinity", "j", "NegativeZero", "k", "PositiveInfinity", "l", "PositiveZero", "m", "FP16_COMBINED", "I", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "F", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "MaxExponent", "MinExponent", "NegativeOne", "One", "Size", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short c(float f10) {
            int i10;
            int i11;
            int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
            int i12 = iFloatToRawIntBits >>> 31;
            int i13 = (iFloatToRawIntBits >>> 23) & 255;
            int i14 = iFloatToRawIntBits & s0.D;
            int i15 = 0;
            if (i13 == 255) {
                i10 = i14 != 0 ? 512 : 0;
                i15 = 31;
            } else {
                int i16 = (i13 - 127) + 15;
                if (i16 >= 31) {
                    i15 = 49;
                    i10 = 0;
                } else {
                    if (i16 > 0) {
                        int i17 = i14 >> 13;
                        if ((i14 & 4096) != 0) {
                            i11 = (((i16 << 10) | i17) + 1) | (i12 << 15);
                        } else {
                            i10 = i17;
                            i15 = i16;
                        }
                        return (short) i11;
                    }
                    if (i16 >= -10) {
                        int i18 = (i14 | 8388608) >> (1 - i16);
                        if ((i18 & 4096) != 0) {
                            i18 += 8192;
                        }
                        i10 = i18 >> 13;
                    } else {
                        i10 = 0;
                    }
                }
            }
            i11 = i10 | (i12 << 15) | (i15 << 10);
            return (short) i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int n(short value) {
            return (value & kotlin.jvm.internal.r0.f124963b) != 0 ? 32768 - (value & kotlin.x1.f128661e) : value & kotlin.x1.f128661e;
        }

        public final short d() {
            return s0.f13977e;
        }

        public final short e() {
            return s0.f13980h;
        }

        public final short f() {
            return s0.f13981i;
        }

        public final short g() {
            return s0.f13982j;
        }

        public final short h() {
            return s0.f13983k;
        }

        public final short i() {
            return s0.f13984l;
        }

        public final short j() {
            return s0.f13985m;
        }

        public final short k() {
            return s0.f13986n;
        }

        public final short l() {
            return s0.f13987o;
        }

        public final short m() {
            return s0.f13988p;
        }
    }

    static {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        H = Float.intBitsToFloat(G);
    }

    private /* synthetic */ s0(short s10) {
        this.halfValue = s10;
    }

    public static final int A(short s10) {
        return s10 & 1023;
    }

    public static int C(short s10) {
        return s10;
    }

    public static final boolean I(short s10) {
        return (s10 & kotlin.jvm.internal.r0.f124964c) != f13998z;
    }

    public static final boolean J(short s10) {
        return (s10 & kotlin.jvm.internal.r0.f124964c) == f13998z;
    }

    public static final boolean K(short s10) {
        return (s10 & kotlin.jvm.internal.r0.f124964c) > f13998z;
    }

    public static final boolean L(short s10) {
        int i10 = s10 & f13998z;
        return (i10 == 0 || i10 == f13998z) ? false : true;
    }

    public static final short M(short s10) {
        int i10 = s10 & kotlin.x1.f128661e;
        int i11 = i10 & f13997y;
        if (i11 < 15360) {
            i10 = (i10 & 32768) | ((i11 < 14336 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = 25 - (i11 >> 10);
            i10 = (i10 + (1 << (i12 - 1))) & (~((1 << i12) - 1));
        }
        return r((short) i10);
    }

    public static final int N(short s10) {
        return K(s10) ? f13984l : s10 & kotlin.x1.f128661e;
    }

    public static final byte O(short s10) {
        return (byte) Q(s10);
    }

    public static final double P(short s10) {
        return Q(s10);
    }

    public static final float Q(short s10) {
        int i10;
        int i11;
        int i12 = s10 & kotlin.x1.f128661e;
        int i13 = 32768 & i12;
        int i14 = (i12 >>> 10) & 31;
        int i15 = i12 & 1023;
        int i16 = 0;
        if (i14 != 0) {
            int i17 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i10 = (i14 - 15) + 127;
            }
            int i18 = i17;
            i16 = i10;
            i11 = i18;
        } else {
            if (i15 != 0) {
                kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + G) - H;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
        }
        int i19 = i11 | (i13 << 16) | (i16 << 23);
        kotlin.jvm.internal.y yVar2 = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat(i19);
    }

    @dl.d
    public static final String R(short s10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = s10 & kotlin.x1.f128661e;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = i10 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb2.append('-');
            }
            if (i12 != 0) {
                sb2.append("0x1.");
                String string = Integer.toString(i13, kotlin.text.b.a(16));
                kotlin.jvm.internal.f0.o(string, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").o(string, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                String string2 = Integer.toString(i13, kotlin.text.b.a(16));
                kotlin.jvm.internal.f0.o(string2, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").o(string2, ""));
                sb2.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb2.append('-');
            }
            sb2.append("Infinity");
        } else {
            sb2.append("NaN");
        }
        String string3 = sb2.toString();
        kotlin.jvm.internal.f0.o(string3, "o.toString()");
        return string3;
    }

    public static final int S(short s10) {
        return (int) Q(s10);
    }

    public static final long U(short s10) {
        return (long) Q(s10);
    }

    public static final int V(short s10) {
        return s10 & kotlin.x1.f128661e;
    }

    public static final short W(short s10) {
        return (short) Q(s10);
    }

    @dl.d
    public static String X(short s10) {
        return String.valueOf(Q(s10));
    }

    public static final short Y(short s10) {
        int i10;
        int i11 = s10 & kotlin.x1.f128661e;
        int i12 = i11 & f13997y;
        if (i12 >= 15360) {
            i10 = i12 < 25600 ? ~((1 << (25 - (i12 >> 10))) - 1) : 32768;
            return r((short) i11);
        }
        i11 &= i10;
        return r((short) i11);
    }

    public static final short a(short s10) {
        return r((short) (s10 & kotlin.jvm.internal.r0.f124964c));
    }

    public static final short a0(short s10, short s11) {
        return r((short) ((s10 & kotlin.jvm.internal.r0.f124964c) | (s11 & kotlin.jvm.internal.r0.f124963b)));
    }

    public static final /* synthetic */ s0 l(short s10) {
        return new s0(s10);
    }

    public static final short m(short s10) {
        int i10 = s10 & kotlin.x1.f128661e;
        int i11 = i10 & f13997y;
        if (i11 < 15360) {
            i10 = ((-((~(i10 >> 15)) & (i11 == 0 ? 0 : 1))) & 15360) | (32768 & i10);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + (((i10 >> 15) - 1) & i12)) & (~i12);
        }
        return r((short) i10);
    }

    public static int o(short s10, short s11) {
        if (K(s10)) {
            return !K(s11) ? 1 : 0;
        }
        if (K(s11)) {
            return -1;
        }
        Companion companion = INSTANCE;
        return kotlin.jvm.internal.f0.t(companion.n(s10), companion.n(s11));
    }

    public static short p(double d10) {
        return q((float) d10);
    }

    public static short q(float f10) {
        return r(INSTANCE.c(f10));
    }

    public static short r(short s10) {
        return s10;
    }

    public static boolean s(short s10, Object obj) {
        return (obj instanceof s0) && s10 == ((s0) obj).getHalfValue();
    }

    public static final boolean t(short s10, short s11) {
        return s10 == s11;
    }

    public static final short w(short s10) {
        int i10 = s10 & kotlin.x1.f128661e;
        int i11 = i10 & f13997y;
        if (i11 < 15360) {
            i10 = ((i10 <= 32768 ? 0 : 65535) & 15360) | (i10 & 32768);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + ((-(i10 >> 15)) & i12)) & (~i12);
        }
        return r((short) i10);
    }

    public static final int x(short s10) {
        return ((s10 >>> 10) & 31) - 15;
    }

    public static final short z(short s10) {
        if (K(s10)) {
            return f13984l;
        }
        if (o(s10, f13986n) < 0) {
            return f13990r;
        }
        return o(s10, f13988p) > 0 ? f13989q : s10;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final /* synthetic */ short getHalfValue() {
        return this.halfValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(s0 s0Var) {
        return n(s0Var.getHalfValue());
    }

    public boolean equals(Object obj) {
        return s(this.halfValue, obj);
    }

    public int hashCode() {
        return C(this.halfValue);
    }

    public int n(short s10) {
        return o(this.halfValue, s10);
    }

    @dl.d
    public String toString() {
        return X(this.halfValue);
    }

    public final short y() {
        return this.halfValue;
    }
}
