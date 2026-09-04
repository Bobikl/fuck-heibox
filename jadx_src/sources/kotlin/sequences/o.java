package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.b2;
import kotlin.u0;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.g
@u0(version = "1.3")
public abstract class o<T> {
    @dl.e
    public abstract Object a(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @dl.e
    public final Object c(@dl.d Iterable<? extends T> iterable, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (objD = d(iterable.iterator(), cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objD : b2.f124493a;
    }

    @dl.e
    public abstract Object d(@dl.d Iterator<? extends T> it, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @dl.e
    public final Object e(@dl.d m<? extends T> mVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = d(mVar.iterator(), cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }
}
