package androidx.compose.foundation.gestures;

import androidx.compose.runtime.j2;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import s1.DpRect;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/k;", "Ls1/e;", "Lkotlin/b2;", "x1", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "h1", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface k extends s1.e {

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @j2
        @Deprecated
        public static int a(@dl.d k kVar, long j10) {
            return s1.d.a(kVar, j10);
        }

        @j2
        @Deprecated
        public static int b(@dl.d k kVar, float f10) {
            return s1.d.b(kVar, f10);
        }

        @j2
        @Deprecated
        public static float c(@dl.d k kVar, long j10) {
            return s1.d.c(kVar, j10);
        }

        @j2
        @Deprecated
        public static float d(@dl.d k kVar, float f10) {
            return s1.d.d(kVar, f10);
        }

        @j2
        @Deprecated
        public static float e(@dl.d k kVar, int i10) {
            return s1.d.e(kVar, i10);
        }

        @j2
        @Deprecated
        public static long f(@dl.d k kVar, long j10) {
            return s1.d.f(kVar, j10);
        }

        @j2
        @Deprecated
        public static float g(@dl.d k kVar, long j10) {
            return s1.d.g(kVar, j10);
        }

        @j2
        @Deprecated
        public static float h(@dl.d k kVar, float f10) {
            return s1.d.h(kVar, f10);
        }

        @j2
        @dl.d
        @Deprecated
        public static b1.i i(@dl.d k kVar, @dl.d DpRect receiver) {
            f0.p(receiver, "$receiver");
            return s1.d.i(kVar, receiver);
        }

        @j2
        @Deprecated
        public static long j(@dl.d k kVar, long j10) {
            return s1.d.j(kVar, j10);
        }

        @j2
        @Deprecated
        public static long k(@dl.d k kVar, float f10) {
            return s1.d.k(kVar, f10);
        }

        @j2
        @Deprecated
        public static long l(@dl.d k kVar, float f10) {
            return s1.d.l(kVar, f10);
        }

        @j2
        @Deprecated
        public static long m(@dl.d k kVar, int i10) {
            return s1.d.m(kVar, i10);
        }
    }

    @dl.e
    Object h1(@dl.d kotlin.coroutines.c<? super Boolean> cVar);

    @dl.e
    Object x1(@dl.d kotlin.coroutines.c<? super b2> cVar);
}
