package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.t1;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H'R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/i;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "d", "(Ljava/lang/Object;)Z", ak.aF, "Lkotlinx/coroutines/flow/u;", "", "e", "()Lkotlinx/coroutines/flow/u;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface i<T> extends n<T>, f<T> {
    @t1
    void c();

    boolean d(T value);

    @dl.d
    u<Integer> e();

    @dl.e
    Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar);
}
