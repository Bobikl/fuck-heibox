package bj;

import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.t0;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.z1;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a#\u0010\u0016\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0082\b\u001a\u001c\u0010\u0017\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "completion", "Lkotlin/b2;", "d", "(Lyh/l;Lkotlin/coroutines/c;)V", "R", "Lkotlin/Function2;", SocialConstants.PARAM_RECEIVER, "", "Lkotlin/m0;", "name", "cause", "onCancellation", "e", "(Lyh/p;Ljava/lang/Object;Lkotlin/coroutines/c;Lyh/l;)V", "fatalCompletion", ak.aF, "Lkotlin/Function0;", "block", "b", ak.av, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class a {
    private static final void a(c<?> cVar, Throwable th2) throws Throwable {
        Result.a aVar = Result.f124476c;
        cVar.resumeWith(Result.b(t0.a(th2)));
        throw th2;
    }

    private static final void b(c<?> cVar, yh.a<b2> aVar) throws Throwable {
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }

    public static final void c(@d c<? super b2> cVar, @d c<?> cVar2) throws Throwable {
        try {
            c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(cVar);
            Result.a aVar = Result.f124476c;
            m.g(cVarD, Result.b(b2.f124493a), null, 2, null);
        } catch (Throwable th2) {
            a(cVar2, th2);
        }
    }

    @z1
    public static final <T> void d(@d l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> cVar) throws Throwable {
        try {
            c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, cVar));
            Result.a aVar = Result.f124476c;
            m.g(cVarD, Result.b(b2.f124493a), null, 2, null);
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }

    public static final <R, T> void e(@d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @d c<? super T> cVar, @e l<? super Throwable, b2> lVar) throws Throwable {
        try {
            c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r10, cVar));
            Result.a aVar = Result.f124476c;
            m.f(cVarD, Result.b(b2.f124493a), lVar);
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }

    public static /* synthetic */ void f(p pVar, Object obj, c cVar, l lVar, int i10, Object obj2) throws Throwable {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        e(pVar, obj, cVar, lVar);
    }
}
