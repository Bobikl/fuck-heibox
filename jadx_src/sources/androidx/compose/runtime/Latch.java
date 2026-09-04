package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Latch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0013\u0010\n\u001a\u00020\u0007H\u0086@ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "R", "Lkotlin/Function0;", "block", "g", "(Lyh/a;)Ljava/lang/Object;", "Lkotlin/b2;", "d", "f", ak.aF, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "Ljava/lang/Object;", "lock", "", "Lkotlin/coroutines/c;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class Latch {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<kotlin.coroutines.c<kotlin.b2>> awaiters = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private List<kotlin.coroutines.c<kotlin.b2>> spareList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean _isOpen = true;

    @dl.e
    public final Object c(@dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        if (e()) {
            return kotlin.b2.f124493a;
        }
        final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        synchronized (this.lock) {
            this.awaiters.add(qVar);
        }
        qVar.L(new yh.l<Throwable, kotlin.b2>() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
                invoke2(th2);
                return kotlin.b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                Object obj = this.f12384b.lock;
                Latch latch = this.f12384b;
                kotlinx.coroutines.p<kotlin.b2> pVar = qVar;
                synchronized (obj) {
                    latch.awaiters.remove(pVar);
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                }
            }
        });
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : kotlin.b2.f124493a;
    }

    public final void d() {
        synchronized (this.lock) {
            this._isOpen = false;
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this._isOpen;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.lock) {
            if (e()) {
                return;
            }
            List<kotlin.coroutines.c<kotlin.b2>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            this._isOpen = true;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                kotlin.coroutines.c<kotlin.b2> cVar = list.get(i10);
                Result.a aVar = Result.f124476c;
                cVar.resumeWith(Result.b(kotlin.b2.f124493a));
            }
            list.clear();
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    public final <R> R g(@dl.d yh.a<? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        d();
        try {
            return block.invoke();
        } finally {
            kotlin.jvm.internal.c0.d(1);
            f();
            kotlin.jvm.internal.c0.c(1);
        }
    }
}
