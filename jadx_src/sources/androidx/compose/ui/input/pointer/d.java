package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.d2;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import s1.DpRect;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.coroutines.g
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JL\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00128&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Ls1/e;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/input/pointer/p;", "r1", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.f23244d5, "", "timeMillis", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "j1", "(JLyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f0", "Ls1/r;", ak.av, "()J", UiKitSpanObj.TYPE_SIZE, "Lb1/m;", "Q", "extendedTouchPadding", "s1", "()Landroidx/compose/ui/input/pointer/p;", "currentEvent", "Landroidx/compose/ui/platform/d2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/d2;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface d extends s1.e {

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static long b(@dl.d d dVar) {
            return c.a(dVar);
        }

        @j2
        @Deprecated
        public static int c(@dl.d d dVar, long j10) {
            return s1.d.a(dVar, j10);
        }

        @j2
        @Deprecated
        public static int d(@dl.d d dVar, float f10) {
            return s1.d.b(dVar, f10);
        }

        @j2
        @Deprecated
        public static float e(@dl.d d dVar, long j10) {
            return s1.d.c(dVar, j10);
        }

        @j2
        @Deprecated
        public static float f(@dl.d d dVar, float f10) {
            return s1.d.d(dVar, f10);
        }

        @j2
        @Deprecated
        public static float g(@dl.d d dVar, int i10) {
            return s1.d.e(dVar, i10);
        }

        @j2
        @Deprecated
        public static long h(@dl.d d dVar, long j10) {
            return s1.d.f(dVar, j10);
        }

        @j2
        @Deprecated
        public static float i(@dl.d d dVar, long j10) {
            return s1.d.g(dVar, j10);
        }

        @j2
        @Deprecated
        public static float j(@dl.d d dVar, float f10) {
            return s1.d.h(dVar, f10);
        }

        @j2
        @dl.d
        @Deprecated
        public static b1.i k(@dl.d d dVar, @dl.d DpRect receiver) {
            kotlin.jvm.internal.f0.p(receiver, "$receiver");
            return s1.d.i(dVar, receiver);
        }

        @j2
        @Deprecated
        public static long l(@dl.d d dVar, long j10) {
            return s1.d.j(dVar, j10);
        }

        @j2
        @Deprecated
        public static long m(@dl.d d dVar, float f10) {
            return s1.d.k(dVar, f10);
        }

        @j2
        @Deprecated
        public static long n(@dl.d d dVar, float f10) {
            return s1.d.l(dVar, f10);
        }

        @j2
        @Deprecated
        public static long o(@dl.d d dVar, int i10) {
            return s1.d.m(dVar, i10);
        }

        @dl.e
        @Deprecated
        public static <T> Object p(@dl.d d dVar, long j10, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
            return c.b(dVar, j10, pVar, cVar);
        }

        @dl.e
        @Deprecated
        public static <T> Object q(@dl.d d dVar, long j10, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
            return c.c(dVar, j10, pVar, cVar);
        }
    }

    long Q();

    long a();

    @dl.e
    <T> Object f0(long j10, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar);

    @dl.d
    d2 getViewConfiguration();

    @dl.e
    <T> Object j1(long j10, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar);

    @dl.e
    Object r1(@dl.d PointerEventPass pointerEventPass, @dl.d kotlin.coroutines.c<? super p> cVar);

    @dl.d
    p s1();
}
