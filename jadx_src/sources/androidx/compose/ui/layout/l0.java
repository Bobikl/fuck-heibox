package androidx.compose.ui.layout;

import androidx.compose.runtime.j2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import s1.DpRect;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JG\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/n;", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/e1$a;", "Lkotlin/b2;", "Lkotlin/t;", "placementBlock", "Landroidx/compose/ui/layout/j0;", "p1", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface l0 extends n {

    /* JADX INFO: compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @dl.d
        @Deprecated
        public static j0 a(@dl.d l0 l0Var, int i10, int i11, @dl.d Map<androidx.compose.ui.layout.a, Integer> alignmentLines, @dl.d yh.l<? super e1.a, b2> placementBlock) {
            kotlin.jvm.internal.f0.p(alignmentLines, "alignmentLines");
            kotlin.jvm.internal.f0.p(placementBlock, "placementBlock");
            return k0.a(l0Var, i10, i11, alignmentLines, placementBlock);
        }

        @j2
        @Deprecated
        public static int c(@dl.d l0 l0Var, long j10) {
            return s1.d.a(l0Var, j10);
        }

        @j2
        @Deprecated
        public static int d(@dl.d l0 l0Var, float f10) {
            return s1.d.b(l0Var, f10);
        }

        @j2
        @Deprecated
        public static float e(@dl.d l0 l0Var, long j10) {
            return s1.d.c(l0Var, j10);
        }

        @j2
        @Deprecated
        public static float f(@dl.d l0 l0Var, float f10) {
            return s1.d.d(l0Var, f10);
        }

        @j2
        @Deprecated
        public static float g(@dl.d l0 l0Var, int i10) {
            return s1.d.e(l0Var, i10);
        }

        @j2
        @Deprecated
        public static long h(@dl.d l0 l0Var, long j10) {
            return s1.d.f(l0Var, j10);
        }

        @j2
        @Deprecated
        public static float i(@dl.d l0 l0Var, long j10) {
            return s1.d.g(l0Var, j10);
        }

        @j2
        @Deprecated
        public static float j(@dl.d l0 l0Var, float f10) {
            return s1.d.h(l0Var, f10);
        }

        @j2
        @dl.d
        @Deprecated
        public static b1.i k(@dl.d l0 l0Var, @dl.d DpRect receiver) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            return s1.d.i(l0Var, receiver);
        }

        @j2
        @Deprecated
        public static long l(@dl.d l0 l0Var, long j10) {
            return s1.d.j(l0Var, j10);
        }

        @j2
        @Deprecated
        public static long m(@dl.d l0 l0Var, float f10) {
            return s1.d.k(l0Var, f10);
        }

        @j2
        @Deprecated
        public static long n(@dl.d l0 l0Var, float f10) {
            return s1.d.l(l0Var, f10);
        }

        @j2
        @Deprecated
        public static long o(@dl.d l0 l0Var, int i10) {
            return s1.d.m(l0Var, i10);
        }
    }

    @dl.d
    j0 p1(int i10, int i11, @dl.d Map<androidx.compose.ui.layout.a, Integer> map, @dl.d yh.l<? super e1.a, b2> lVar);
}
