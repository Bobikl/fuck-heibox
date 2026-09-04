package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/y;", "Lkotlin/Result;", "result", "", "d", "(Lkotlinx/coroutines/y;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/d2;", "parent", "b", "value", ak.av, "(Ljava/lang/Object;)Lkotlinx/coroutines/y;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class a0 {
    @dl.d
    public static final <T> y<T> a(T t10) {
        z zVar = new z(null);
        zVar.A(t10);
        return zVar;
    }

    @dl.d
    public static final <T> y<T> b(@dl.e d2 d2Var) {
        return new z(d2Var);
    }

    public static /* synthetic */ y c(d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = null;
        }
        return b(d2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@dl.d y<T> yVar, @dl.d Object obj) {
        Throwable thE = Result.e(obj);
        return thE == null ? yVar.A(obj) : yVar.i(thE);
    }
}
