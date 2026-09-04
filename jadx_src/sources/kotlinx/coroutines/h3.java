package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ThreadLocal;
import kotlinx.coroutines.internal.ThreadLocalKey;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Ljava/lang/ThreadLocal;", "value", "Lkotlinx/coroutines/g3;", ak.av, "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/g3;", "", "e", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/b2;", ak.aF, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class h3 {
    @dl.d
    public static final <T> g3<T> a(@dl.d ThreadLocal<T> threadLocal, T t10) {
        return new ThreadLocal(t10, threadLocal);
    }

    public static /* synthetic */ g3 b(ThreadLocal threadLocal, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @dl.e
    public static final Object c(@dl.d ThreadLocal<?> threadLocal, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        if (cVar.getContext().f(new ThreadLocalKey(threadLocal)) != null) {
            return kotlin.b2.f124493a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + cVar.getContext()).toString());
    }

    private static final Object d(ThreadLocal<?> threadLocal, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }

    @dl.e
    public static final Object e(@dl.d ThreadLocal<?> threadLocal, @dl.d kotlin.coroutines.c<? super Boolean> cVar) {
        return kotlin.coroutines.jvm.internal.a.a(cVar.getContext().f(new ThreadLocalKey(threadLocal)) != null);
    }

    private static final Object f(ThreadLocal<?> threadLocal, kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.jvm.internal.c0.e(3);
        throw null;
    }
}
