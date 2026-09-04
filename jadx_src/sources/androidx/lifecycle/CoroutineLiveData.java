package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.h1;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class CoroutineLiveData<T> extends g0<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private BlockRunner<T> f23965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private EmittedSource f23966o;

    public CoroutineLiveData(@dl.d CoroutineContext context, long j10, @dl.d yh.p<? super f0<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(block, "block");
        this.f23965n = new BlockRunner<>(this, block, j10, kotlinx.coroutines.r0.a(e1.e().p0().I(context).I(f3.a((d2) context.f(d2.INSTANCE)))), new yh.a<b2>(this) { // from class: androidx.lifecycle.CoroutineLiveData.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineLiveData<T> f23967b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f23967b = this;
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((CoroutineLiveData) this.f23967b).f23965n = null;
            }
        });
    }

    public /* synthetic */ CoroutineLiveData(CoroutineContext coroutineContext, long j10, yh.p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? EmptyCoroutineContext.f124694b : coroutineContext, (i10 & 2) != 0 ? 5000L : j10, pVar);
    }

    @Override // androidx.lifecycle.g0, androidx.lifecycle.LiveData
    protected void m() {
        super.m();
        BlockRunner<T> blockRunner = this.f23965n;
        if (blockRunner != null) {
            blockRunner.h();
        }
    }

    @Override // androidx.lifecycle.g0, androidx.lifecycle.LiveData
    protected void n() {
        super.n();
        BlockRunner<T> blockRunner = this.f23965n;
        if (blockRunner != null) {
            blockRunner.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object v(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        CoroutineLiveData<T> coroutineLiveData;
        if (cVar instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) cVar;
            int i10 = coroutineLiveData$clearSource$1.f23971e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.f23971e = i10 - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, cVar);
            }
        } else {
            coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, cVar);
        }
        Object obj = coroutineLiveData$clearSource$1.f23969c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = coroutineLiveData$clearSource$1.f23971e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            EmittedSource emittedSource = this.f23966o;
            if (emittedSource != null) {
                coroutineLiveData$clearSource$1.f23968b = this;
                coroutineLiveData$clearSource$1.f23971e = 1;
                if (emittedSource.b(coroutineLiveData$clearSource$1) == objH) {
                    return objH;
                }
            }
            coroutineLiveData = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineLiveData = (CoroutineLiveData) coroutineLiveData$clearSource$1.f23968b;
            kotlin.t0.n(obj);
        }
        coroutineLiveData.f23966o = null;
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object w(@dl.d LiveData<T> liveData, @dl.d kotlin.coroutines.c<? super h1> cVar) throws Throwable {
        CoroutineLiveData$emitSource$1 coroutineLiveData$emitSource$1;
        LiveData<T> liveData2;
        CoroutineLiveData coroutineLiveData;
        CoroutineLiveData coroutineLiveData2;
        if (cVar instanceof CoroutineLiveData$emitSource$1) {
            coroutineLiveData$emitSource$1 = (CoroutineLiveData$emitSource$1) cVar;
            int i10 = coroutineLiveData$emitSource$1.f23976f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$emitSource$1.f23976f = i10 - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$emitSource$1 = new CoroutineLiveData$emitSource$1(this, cVar);
            }
        } else {
            coroutineLiveData$emitSource$1 = new CoroutineLiveData$emitSource$1(this, cVar);
        }
        Object objA = coroutineLiveData$emitSource$1.f23974d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = coroutineLiveData$emitSource$1.f23976f;
        if (i11 != 0) {
            if (i11 == 1) {
                LiveData<T> liveData3 = (LiveData) coroutineLiveData$emitSource$1.f23973c;
                CoroutineLiveData coroutineLiveData3 = (CoroutineLiveData) coroutineLiveData$emitSource$1.f23972b;
                kotlin.t0.n(objA);
                liveData2 = liveData3;
                coroutineLiveData = coroutineLiveData3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineLiveData coroutineLiveData4 = (CoroutineLiveData) coroutineLiveData$emitSource$1.f23972b;
                kotlin.t0.n(objA);
                coroutineLiveData2 = coroutineLiveData4;
            }
            EmittedSource emittedSource = (EmittedSource) objA;
            coroutineLiveData2.f23966o = emittedSource;
            return emittedSource;
        }
        kotlin.t0.n(objA);
        coroutineLiveData$emitSource$1.f23972b = this;
        coroutineLiveData$emitSource$1.f23973c = liveData;
        coroutineLiveData$emitSource$1.f23976f = 1;
        if (v(coroutineLiveData$emitSource$1) == objH) {
            return objH;
        }
        liveData2 = liveData;
        coroutineLiveData = this;
        coroutineLiveData$emitSource$1.f23972b = coroutineLiveData;
        coroutineLiveData$emitSource$1.f23973c = null;
        coroutineLiveData$emitSource$1.f23976f = 2;
        objA = CoroutineLiveDataKt.a(coroutineLiveData, liveData2, coroutineLiveData$emitSource$1);
        coroutineLiveData2 = coroutineLiveData;
        if (objA == objH) {
            return objH;
        }
        EmittedSource emittedSource2 = (EmittedSource) objA;
        coroutineLiveData2.f23966o = emittedSource2;
        return emittedSource2;
    }
}
