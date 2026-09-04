package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/CancellableFlowImpl;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "b", "Lkotlinx/coroutines/flow/e;", "flow", "<init>", "(Lkotlinx/coroutines/flow/e;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class CancellableFlowImpl<T> implements a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e<T> flow;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(@dl.d e<? extends T> eVar) {
        this.flow = eVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = this.flow.a(new CancellableFlowImpl$collect$2(fVar), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }
}
