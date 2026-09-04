package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Result;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "onCancellation", "", ak.aF, "(Ljava/lang/Object;Lyh/l;)Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "caller", "b", "(Ljava/lang/Object;Lkotlinx/coroutines/p;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/c;", "uCont", ak.av, "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class i0 {
    @dl.d
    public static final <T> Object a(@dl.e Object obj, @dl.d kotlin.coroutines.c<? super T> cVar) {
        if (obj instanceof d0) {
            Result.a aVar = Result.f124476c;
            return Result.b(kotlin.t0.a(((d0) obj).cause));
        }
        Result.a aVar2 = Result.f124476c;
        return Result.b(obj);
    }

    @dl.e
    public static final <T> Object b(@dl.d Object obj, @dl.d p<?> pVar) {
        Throwable thE = Result.e(obj);
        return thE == null ? obj : new d0(thE, false, 2, null);
    }

    @dl.e
    public static final <T> Object c(@dl.d Object obj, @dl.e yh.l<? super Throwable, kotlin.b2> lVar) {
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return lVar != null ? new CompletedWithCancellation(obj, lVar) : obj;
        }
        return new d0(thE, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, yh.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
