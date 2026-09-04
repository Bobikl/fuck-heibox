package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012-\u0010\f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/flow/m;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/AbstractFlow;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", "g", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "<init>", "(Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class m<T> extends AbstractFlow<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<f<? super T>, kotlin.coroutines.c<? super b2>, Object> f130092b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        this.f130092b = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    @dl.e
    public Object g(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objInvoke = this.f130092b.invoke(fVar, cVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.h() ? objInvoke : b2.f124493a;
    }
}
