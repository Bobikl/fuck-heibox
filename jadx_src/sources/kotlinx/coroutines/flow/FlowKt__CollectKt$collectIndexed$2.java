package kotlinx.coroutines.flow;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.c0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "b", "I", UCropPlusActivity.ARG_INDEX, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__CollectKt$collectIndexed$2<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.q<Integer, T, kotlin.coroutines.c<? super b2>, Object> f129294c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collectIndexed$2(yh.q<? super Integer, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        this.f129294c = qVar;
    }

    @dl.e
    public Object a(T t10, @dl.d final kotlin.coroutines.c<? super b2> cVar) {
        c0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f129295b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f129297d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f129295b = obj;
                this.f129297d |= Integer.MIN_VALUE;
                return this.f129296c.emit(null, this);
            }
        };
        c0.e(5);
        yh.q<Integer, T, kotlin.coroutines.c<? super b2>, Object> qVar = this.f129294c;
        int i10 = this.index;
        this.index = i10 + 1;
        if (i10 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        qVar.invoke(Integer.valueOf(i10), t10, cVar);
        return b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        yh.q<Integer, T, kotlin.coroutines.c<? super b2>, Object> qVar = this.f129294c;
        int i10 = this.index;
        this.index = i10 + 1;
        if (i10 < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        Object objInvoke = qVar.invoke(kotlin.coroutines.jvm.internal.a.f(i10), t10, cVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.h() ? objInvoke : b2.f124493a;
    }
}
