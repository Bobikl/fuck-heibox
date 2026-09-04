package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import s1.DpRect;

/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0006R-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR-\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010\"\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\u0006R\u001c\u0010%\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\u0006R\u001c\u0010(\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0004\"\u0004\b'\u0010\u0006R\u001c\u0010+\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010\u0006R%\u0010/\u001a\u00020,8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u00105\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068f@&X¦\u000e¢\u0006\u0012\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010D\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010Cø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006EÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/v0;", "Ls1/e;", "", androidx.exifinterface.media.a.R4, "()F", "P", "(F)V", "scaleX", "b0", androidx.exifinterface.media.a.f23244d5, "scaleY", "d", "f", "alpha", "H", "Z", "translationX", "G", "o", "translationY", "S0", "r0", "shadowElevation", "Landroidx/compose/ui/graphics/l0;", "ambientShadowColor", "W0", "()J", "c1", "(J)V", "spotShadowColor", "o0", "f1", "X", ak.aD, "rotationX", "N", androidx.exifinterface.media.a.W4, "rotationY", "O", "C", "rotationZ", ak.aG, "y", "cameraDistance", "Landroidx/compose/ui/graphics/o2;", "d1", "q0", "transformOrigin", "Landroidx/compose/ui/graphics/g2;", "H0", "()Landroidx/compose/ui/graphics/g2;", "K0", "(Landroidx/compose/ui/graphics/g2;)V", "shape", "", "e", "()Z", "p0", "(Z)V", "getClip$annotations", "()V", "clip", "Landroidx/compose/ui/graphics/y1;", "<anonymous parameter 0>", "m", "()Landroidx/compose/ui/graphics/y1;", "R", "(Landroidx/compose/ui/graphics/y1;)V", "renderEffect", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface v0 extends s1.e {

    /* JADX INFO: compiled from: GraphicsLayerScope.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static long a(@dl.d v0 v0Var) {
            return u0.a(v0Var);
        }

        public static /* synthetic */ void b() {
        }

        @dl.e
        @Deprecated
        public static y1 c(@dl.d v0 v0Var) {
            return u0.b(v0Var);
        }

        @Deprecated
        public static long d(@dl.d v0 v0Var) {
            return u0.c(v0Var);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static int e(@dl.d v0 v0Var, long j10) {
            return s1.d.a(v0Var, j10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static int f(@dl.d v0 v0Var, float f10) {
            return s1.d.b(v0Var, f10);
        }

        @Deprecated
        public static void g(@dl.d v0 v0Var, long j10) {
            u0.d(v0Var, j10);
        }

        @Deprecated
        public static void h(@dl.d v0 v0Var, @dl.e y1 y1Var) {
            u0.e(v0Var, y1Var);
        }

        @Deprecated
        public static void i(@dl.d v0 v0Var, long j10) {
            u0.f(v0Var, j10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static float j(@dl.d v0 v0Var, long j10) {
            return s1.d.c(v0Var, j10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static float k(@dl.d v0 v0Var, float f10) {
            return s1.d.d(v0Var, f10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static float l(@dl.d v0 v0Var, int i10) {
            return s1.d.e(v0Var, i10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static long m(@dl.d v0 v0Var, long j10) {
            return s1.d.f(v0Var, j10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static float n(@dl.d v0 v0Var, long j10) {
            return s1.d.g(v0Var, j10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static float o(@dl.d v0 v0Var, float f10) {
            return s1.d.h(v0Var, f10);
        }

        @androidx.compose.runtime.j2
        @dl.d
        @Deprecated
        public static b1.i p(@dl.d v0 v0Var, @dl.d DpRect receiver) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            return s1.d.i(v0Var, receiver);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static long q(@dl.d v0 v0Var, long j10) {
            return s1.d.j(v0Var, j10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static long r(@dl.d v0 v0Var, float f10) {
            return s1.d.k(v0Var, f10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static long s(@dl.d v0 v0Var, float f10) {
            return s1.d.l(v0Var, f10);
        }

        @androidx.compose.runtime.j2
        @Deprecated
        public static long t(@dl.d v0 v0Var, int i10) {
            return s1.d.m(v0Var, i10);
        }
    }

    void A(float f10);

    void C(float f10);

    float G();

    float H();

    @dl.d
    g2 H0();

    void K0(@dl.d g2 g2Var);

    float N();

    float O();

    void P(float f10);

    void R(@dl.e y1 y1Var);

    float S();

    float S0();

    void T(float f10);

    long W0();

    float X();

    void Z(float f10);

    float b0();

    void c1(long j10);

    float d();

    long d1();

    boolean e();

    void f(float f10);

    void f1(long j10);

    @dl.e
    y1 m();

    void o(float f10);

    long o0();

    void p0(boolean z10);

    void q0(long j10);

    void r0(float f10);

    float u();

    void y(float f10);

    void z(float f10);
}
