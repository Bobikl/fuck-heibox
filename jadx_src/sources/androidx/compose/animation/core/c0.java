package androidx.compose.animation.core;

import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: EasingFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bG\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0003\"\u0017\u0010\u000f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0003\"\u0017\u0010\u0012\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0003\"\u0017\u0010\u0015\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0003\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0010\u0010\u0003\"\u0017\u0010\u0019\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\u0018\u0010\u0003\"\u0017\u0010\u001c\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0003\"\u0017\u0010\u001f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u0003\"\u0017\u0010\"\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0003\"\u0017\u0010$\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b#\u0010\u0003\"\u0017\u0010&\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b%\u0010\u0002\u001a\u0004\b\r\u0010\u0003\"\u0017\u0010)\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0003\"\u0017\u0010+\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b \u0010\u0003\"\u0017\u0010.\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010\u0003\"\u0017\u00100\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b#\u0010\u0002\u001a\u0004\b/\u0010\u0003\"\u0017\u00101\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b*\u0010\u0003\"\u0017\u00103\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b2\u0010\u0003\"\u0017\u00105\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b2\u0010\u0002\u001a\u0004\b4\u0010\u0003\"\u0017\u00106\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b,\u0010\u0003\"\u0017\u00107\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u0016\u0010\u0003\"\u0017\u00109\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b8\u0010\u0003\"\u0017\u0010;\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b:\u0010\u0002\u001a\u0004\b'\u0010\u0003\"\u0017\u0010=\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b\b\u0010\u0003\"\u0017\u0010>\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b(\u0010\u0002\u001a\u0004\b:\u0010\u0003\"\u0017\u0010?\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u001a\u0010\u0003\"\u0017\u0010A\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b@\u0010\u0002\u001a\u0004\b\u0013\u0010\u0003\"\u0017\u0010B\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b8\u0010\u0002\u001a\u0004\b@\u0010\u0003\"\u0017\u0010C\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b/\u0010\u0002\u001a\u0004\b%\u0010\u0003\"\u0017\u0010D\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b4\u0010\u0002\u001a\u0004\b<\u0010\u0003\"\u0017\u0010E\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\n\u0010\u0003\"\u0017\u0010F\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u001d\u0010\u0003¨\u0006G"}, d2 = {"Landroidx/compose/animation/core/b0;", ak.av, "Landroidx/compose/animation/core/b0;", "()Landroidx/compose/animation/core/b0;", "Ease", "b", "x", "EaseOut", ak.aF, "EaseIn", "d", "i", "EaseInOut", "e", RXScreenCaptureService.KEY_WIDTH, "EaseInSine", "f", "H", "EaseOutSine", "g", ak.aB, "EaseInOutSine", RXScreenCaptureService.KEY_HEIGHT, "EaseInCubic", "B", "EaseOutCubic", "j", "m", "EaseInOutCubic", "k", "v", "EaseInQuint", "l", "G", "EaseOutQuint", "r", "EaseInOutQuint", "n", "EaseInCirc", "o", androidx.exifinterface.media.a.W4, "EaseOutCirc", "p", "EaseInOutCirc", "q", "t", "EaseInQuad", androidx.exifinterface.media.a.S4, "EaseOutQuad", "EaseInOutQuad", ak.aG, "EaseInQuart", "F", "EaseOutQuart", "EaseInOutQuart", "EaseInExpo", "D", "EaseOutExpo", "y", "EaseInOutExpo", ak.aD, "EaseInBack", "EaseOutBack", "EaseInOutBack", "C", "EaseInElastic", "EaseOutElastic", "EaseInOutElastic", "EaseOutBounce", "EaseInBounce", "EaseInOutBounce", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final b0 f4363a = new v(0.25f, 0.1f, 0.25f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final b0 f4364b = new v(0.0f, 0.0f, 0.58f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final b0 f4365c = new v(0.42f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final b0 f4366d = new v(0.42f, 0.0f, 0.58f, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final b0 f4367e = new v(0.12f, 0.0f, 0.39f, 0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final b0 f4368f = new v(0.61f, 1.0f, 0.88f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final b0 f4369g = new v(0.37f, 0.0f, 0.63f, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final b0 f4370h = new v(0.32f, 0.0f, 0.67f, 0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final b0 f4371i = new v(0.33f, 1.0f, 0.68f, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final b0 f4372j = new v(0.65f, 0.0f, 0.35f, 1.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final b0 f4373k = new v(0.64f, 0.0f, 0.78f, 0.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final b0 f4374l = new v(0.22f, 1.0f, 0.36f, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final b0 f4375m = new v(0.83f, 0.0f, 0.17f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final b0 f4376n = new v(0.55f, 0.0f, 1.0f, 0.45f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final b0 f4377o = new v(0.0f, 0.55f, 0.45f, 1.0f);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final b0 f4378p = new v(0.85f, 0.0f, 0.15f, 1.0f);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final b0 f4379q = new v(0.11f, 0.0f, 0.5f, 0.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final b0 f4380r = new v(0.5f, 1.0f, 0.89f, 1.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final b0 f4381s = new v(0.45f, 0.0f, 0.55f, 1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final b0 f4382t = new v(0.5f, 0.0f, 0.75f, 0.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final b0 f4383u = new v(0.25f, 1.0f, 0.5f, 1.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final b0 f4384v = new v(0.76f, 0.0f, 0.24f, 1.0f);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final b0 f4385w = new v(0.7f, 0.0f, 0.84f, 0.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final b0 f4386x = new v(0.16f, 1.0f, 0.3f, 1.0f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final b0 f4387y = new v(0.87f, 0.0f, 0.13f, 1.0f);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final b0 f4388z = new v(0.36f, 0.0f, 0.66f, -0.56f);

    @dl.d
    private static final b0 A = new v(0.34f, 1.56f, 0.64f, 1.0f);

    @dl.d
    private static final b0 B = new v(0.68f, -0.6f, 0.32f, 1.6f);

    @dl.d
    private static final b0 C = b.f4390a;

    @dl.d
    private static final b0 D = f.f4394a;

    @dl.d
    private static final b0 E = d.f4392a;

    @dl.d
    private static final b0 F = e.f4393a;

    @dl.d
    private static final b0 G = a.f4389a;

    @dl.d
    private static final b0 H = c.f4391a;

    /* JADX INFO: compiled from: EasingFunctions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Progress.G, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4389a = new a();

        a() {
        }

        @Override // androidx.compose.animation.core.b0
        public final float a(float f10) {
            return 1 - c0.z().a(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Progress.G, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4390a = new b();

        b() {
        }

        @Override // androidx.compose.animation.core.b0
        public final float a(float f10) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            if (f10 == 1.0f) {
                return 1.0f;
            }
            float f11 = f10 * 10.0f;
            return (float) (((double) (-((float) Math.pow(2.0f, f11 - 10.0f)))) * Math.sin(((double) (f11 - 10.75f)) * 2.0943951023931953d));
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Progress.G, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4391a = new c();

        c() {
        }

        @Override // androidx.compose.animation.core.b0
        public final float a(float f10) {
            return (((double) f10) < 0.5d ? 1 - c0.z().a(1.0f - (f10 * 2.0f)) : 1 + c0.z().a((f10 * 2.0f) - 1.0f)) / 2.0f;
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Progress.G, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class d implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4392a = new d();

        d() {
        }

        @Override // androidx.compose.animation.core.b0
        public final float a(float f10) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            if (f10 == 1.0f) {
                return 1.0f;
            }
            if (!(0.0f <= f10 && f10 <= 0.5f)) {
                double d10 = 2.0f;
                return ((float) ((((double) ((float) Math.pow(d10, ((-20.0f) * f10) + 10.0f))) * Math.sin(((double) ((f10 * 20.0f) - 11.125f)) * 1.3962634015954636d)) / d10)) + 1.0f;
            }
            double d11 = 2.0f;
            float f11 = f10 * 20.0f;
            return (float) ((-(((double) ((float) Math.pow(d11, f11 - 10.0f))) * Math.sin(((double) (f11 - 11.125f)) * 1.3962634015954636d))) / d11);
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Progress.G, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class e implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f4393a = new e();

        e() {
        }

        @Override // androidx.compose.animation.core.b0
        public final float a(float f10) {
            float f11;
            float f12;
            if (f10 < 0.36363637f) {
                return 7.5625f * f10 * f10;
            }
            if (f10 < 0.72727275f) {
                float f13 = f10 - 0.54545456f;
                f11 = 7.5625f * f13 * f13;
                f12 = 0.75f;
            } else if (f10 < 0.90909094f) {
                float f14 = f10 - 0.8181818f;
                f11 = 7.5625f * f14 * f14;
                f12 = 0.9375f;
            } else {
                float f15 = f10 - 0.95454544f;
                f11 = 7.5625f * f15 * f15;
                f12 = 0.984375f;
            }
            return f11 + f12;
        }
    }

    /* JADX INFO: compiled from: EasingFunctions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", Progress.G, "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class f implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f4394a = new f();

        f() {
        }

        @Override // androidx.compose.animation.core.b0
        public final float a(float f10) {
            if (f10 == 0.0f) {
                return 0.0f;
            }
            if (f10 == 1.0f) {
                return 1.0f;
            }
            return (float) ((((double) ((float) Math.pow(2.0f, (-10.0f) * f10))) * Math.sin(((double) ((f10 * 10.0f) - 0.75f)) * 2.0943951023931953d)) + ((double) 1.0f));
        }
    }

    @dl.d
    public static final b0 A() {
        return f4377o;
    }

    @dl.d
    public static final b0 B() {
        return f4371i;
    }

    @dl.d
    public static final b0 C() {
        return D;
    }

    @dl.d
    public static final b0 D() {
        return f4386x;
    }

    @dl.d
    public static final b0 E() {
        return f4380r;
    }

    @dl.d
    public static final b0 F() {
        return f4383u;
    }

    @dl.d
    public static final b0 G() {
        return f4374l;
    }

    @dl.d
    public static final b0 H() {
        return f4368f;
    }

    @dl.d
    public static final b0 a() {
        return f4363a;
    }

    @dl.d
    public static final b0 b() {
        return f4365c;
    }

    @dl.d
    public static final b0 c() {
        return f4388z;
    }

    @dl.d
    public static final b0 d() {
        return G;
    }

    @dl.d
    public static final b0 e() {
        return f4376n;
    }

    @dl.d
    public static final b0 f() {
        return f4370h;
    }

    @dl.d
    public static final b0 g() {
        return C;
    }

    @dl.d
    public static final b0 h() {
        return f4385w;
    }

    @dl.d
    public static final b0 i() {
        return f4366d;
    }

    @dl.d
    public static final b0 j() {
        return B;
    }

    @dl.d
    public static final b0 k() {
        return H;
    }

    @dl.d
    public static final b0 l() {
        return f4378p;
    }

    @dl.d
    public static final b0 m() {
        return f4372j;
    }

    @dl.d
    public static final b0 n() {
        return E;
    }

    @dl.d
    public static final b0 o() {
        return f4387y;
    }

    @dl.d
    public static final b0 p() {
        return f4381s;
    }

    @dl.d
    public static final b0 q() {
        return f4384v;
    }

    @dl.d
    public static final b0 r() {
        return f4375m;
    }

    @dl.d
    public static final b0 s() {
        return f4369g;
    }

    @dl.d
    public static final b0 t() {
        return f4379q;
    }

    @dl.d
    public static final b0 u() {
        return f4382t;
    }

    @dl.d
    public static final b0 v() {
        return f4373k;
    }

    @dl.d
    public static final b0 w() {
        return f4367e;
    }

    @dl.d
    public static final b0 x() {
        return f4364b;
    }

    @dl.d
    public static final b0 y() {
        return A;
    }

    @dl.d
    public static final b0 z() {
        return F;
    }
}
