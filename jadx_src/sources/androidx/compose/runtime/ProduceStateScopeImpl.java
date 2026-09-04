package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0096\u0003J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0005\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/ProduceStateScopeImpl;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/i1;", "Landroidx/compose/runtime/a1;", "n", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/b2;", "f", "Lkotlin/Function0;", "onDispose", "", "o", "(Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "j0", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getValue", "setValue", "(Ljava/lang/Object;)V", "value", "state", "<init>", "(Landroidx/compose/runtime/a1;Lkotlin/coroutines/CoroutineContext;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class ProduceStateScopeImpl<T> implements i1<T>, a1<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a1<T> f12425c;

    public ProduceStateScopeImpl(@dl.d a1<T> state, @dl.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
        this.f12425c = state;
    }

    @Override // androidx.compose.runtime.a1
    @dl.d
    public yh.l<T, kotlin.b2> f() {
        return this.f12425c.f();
    }

    @Override // androidx.compose.runtime.a1, androidx.compose.runtime.m2
    public T getValue() {
        return this.f12425c.getValue();
    }

    @Override // kotlinx.coroutines.q0
    @dl.d
    /* JADX INFO: renamed from: j0, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.a1
    public T n() {
        return this.f12425c.n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.runtime.i1
    @dl.e
    public Object o(@dl.d yh.a<kotlin.b2> aVar, @dl.d kotlin.coroutines.c<?> cVar) throws Throwable {
        ProduceStateScopeImpl$awaitDispose$1 produceStateScopeImpl$awaitDispose$1;
        if (cVar instanceof ProduceStateScopeImpl$awaitDispose$1) {
            produceStateScopeImpl$awaitDispose$1 = (ProduceStateScopeImpl$awaitDispose$1) cVar;
            int i10 = produceStateScopeImpl$awaitDispose$1.f12429e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                produceStateScopeImpl$awaitDispose$1.f12429e = i10 - Integer.MIN_VALUE;
            } else {
                produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(this, cVar);
            }
        } else {
            produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(this, cVar);
        }
        Object obj = produceStateScopeImpl$awaitDispose$1.f12427c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = produceStateScopeImpl$awaitDispose$1.f12429e;
        try {
            if (i11 == 0) {
                kotlin.t0.n(obj);
                produceStateScopeImpl$awaitDispose$1.f12426b = aVar;
                produceStateScopeImpl$awaitDispose$1.f12429e = 1;
                kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(produceStateScopeImpl$awaitDispose$1), 1);
                qVar.F0();
                Object objT = qVar.t();
                if (objT == kotlin.coroutines.intrinsics.b.h()) {
                    kotlin.coroutines.jvm.internal.f.c(produceStateScopeImpl$awaitDispose$1);
                }
                if (objT == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (yh.a) produceStateScopeImpl$awaitDispose$1.f12426b;
                kotlin.t0.n(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.a1
    public void setValue(T t10) {
        this.f12425c.setValue(t10);
    }
}
