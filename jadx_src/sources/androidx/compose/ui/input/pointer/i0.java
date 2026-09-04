package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.d2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import s1.DpRect;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001JB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\u00020\u000b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Ls1/e;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/d;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "n1", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ls1/r;", ak.av, "()J", UiKitSpanObj.TYPE_SIZE, "Lb1/m;", "Q", "extendedTouchPadding", "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "viewConfiguration", "", "<anonymous parameter 0>", "F1", "()Z", "o1", "(Z)V", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "interceptOutOfBoundsChildEvents", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface i0 extends s1.e {

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static long a(@dl.d i0 i0Var) {
            return h0.a(i0Var);
        }

        @Deprecated
        public static boolean b(@dl.d i0 i0Var) {
            return h0.b(i0Var);
        }

        public static /* synthetic */ void c() {
        }

        @j2
        @Deprecated
        public static int d(@dl.d i0 i0Var, long j10) {
            return s1.d.a(i0Var, j10);
        }

        @j2
        @Deprecated
        public static int e(@dl.d i0 i0Var, float f10) {
            return s1.d.b(i0Var, f10);
        }

        @Deprecated
        public static void f(@dl.d i0 i0Var, boolean z10) {
            h0.c(i0Var, z10);
        }

        @j2
        @Deprecated
        public static float g(@dl.d i0 i0Var, long j10) {
            return s1.d.c(i0Var, j10);
        }

        @j2
        @Deprecated
        public static float h(@dl.d i0 i0Var, float f10) {
            return s1.d.d(i0Var, f10);
        }

        @j2
        @Deprecated
        public static float i(@dl.d i0 i0Var, int i10) {
            return s1.d.e(i0Var, i10);
        }

        @j2
        @Deprecated
        public static long j(@dl.d i0 i0Var, long j10) {
            return s1.d.f(i0Var, j10);
        }

        @j2
        @Deprecated
        public static float k(@dl.d i0 i0Var, long j10) {
            return s1.d.g(i0Var, j10);
        }

        @j2
        @Deprecated
        public static float l(@dl.d i0 i0Var, float f10) {
            return s1.d.h(i0Var, f10);
        }

        @j2
        @dl.d
        @Deprecated
        public static b1.i m(@dl.d i0 i0Var, @dl.d DpRect receiver) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            return s1.d.i(i0Var, receiver);
        }

        @j2
        @Deprecated
        public static long n(@dl.d i0 i0Var, long j10) {
            return s1.d.j(i0Var, j10);
        }

        @j2
        @Deprecated
        public static long o(@dl.d i0 i0Var, float f10) {
            return s1.d.k(i0Var, f10);
        }

        @j2
        @Deprecated
        public static long p(@dl.d i0 i0Var, float f10) {
            return s1.d.l(i0Var, f10);
        }

        @j2
        @Deprecated
        public static long q(@dl.d i0 i0Var, int i10) {
            return s1.d.m(i0Var, i10);
        }
    }

    boolean F1();

    long Q();

    long a();

    @dl.d
    d2 getViewConfiguration();

    @dl.e
    <R> Object n1(@dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super R> cVar);

    void o1(boolean z10);
}
