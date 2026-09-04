package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.j2;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import s1.DpRect;

/* JADX INFO: compiled from: ContentDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", "T0", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public interface d extends g {

    /* JADX INFO: compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static void a(@dl.d d dVar, @dl.d y0 image, long j10, long j11, long j12, long j13, float f10, @dl.d j style, @dl.e m0 m0Var, int i10, int i11) {
            f0.p(image, "image");
            f0.p(style, "style");
            f.a(dVar, image, j10, j11, j12, j13, f10, style, m0Var, i10, i11);
        }

        @Deprecated
        public static long b(@dl.d d dVar) {
            return f.b(dVar);
        }

        @Deprecated
        public static long c(@dl.d d dVar) {
            return f.c(dVar);
        }

        @j2
        @Deprecated
        public static int d(@dl.d d dVar, long j10) {
            return s1.d.a(dVar, j10);
        }

        @j2
        @Deprecated
        public static int e(@dl.d d dVar, float f10) {
            return s1.d.b(dVar, f10);
        }

        @j2
        @Deprecated
        public static float f(@dl.d d dVar, long j10) {
            return s1.d.c(dVar, j10);
        }

        @j2
        @Deprecated
        public static float g(@dl.d d dVar, float f10) {
            return s1.d.d(dVar, f10);
        }

        @j2
        @Deprecated
        public static float h(@dl.d d dVar, int i10) {
            return s1.d.e(dVar, i10);
        }

        @j2
        @Deprecated
        public static long i(@dl.d d dVar, long j10) {
            return s1.d.f(dVar, j10);
        }

        @j2
        @Deprecated
        public static float j(@dl.d d dVar, long j10) {
            return s1.d.g(dVar, j10);
        }

        @j2
        @Deprecated
        public static float k(@dl.d d dVar, float f10) {
            return s1.d.h(dVar, f10);
        }

        @j2
        @dl.d
        @Deprecated
        public static b1.i l(@dl.d d dVar, @dl.d DpRect receiver) {
            f0.p(receiver, "$receiver");
            return s1.d.i(dVar, receiver);
        }

        @j2
        @Deprecated
        public static long m(@dl.d d dVar, long j10) {
            return s1.d.j(dVar, j10);
        }

        @j2
        @Deprecated
        public static long n(@dl.d d dVar, float f10) {
            return s1.d.k(dVar, f10);
        }

        @j2
        @Deprecated
        public static long o(@dl.d d dVar, float f10) {
            return s1.d.l(dVar, f10);
        }

        @j2
        @Deprecated
        public static long p(@dl.d d dVar, int i10) {
            return s1.d.m(dVar, i10);
        }
    }

    void T0();
}
