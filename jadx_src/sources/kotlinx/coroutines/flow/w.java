package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/w;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "flow", "", ak.aF, "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "e", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/c;", "f", "()V", "g", "()Z", "d", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class w extends kotlinx.coroutines.flow.internal.c<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f130106a = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");

    @dl.d
    volatile /* synthetic */ Object _state = null;

    @Override // kotlinx.coroutines.flow.internal.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@dl.d StateFlowImpl<?> flow) {
        if (this._state != null) {
            return false;
        }
        this._state = v.f130104a;
        return true;
    }

    @dl.e
    public final Object d(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        if (!androidx.concurrent.futures.a.a(f130106a, this, v.f130104a, qVar)) {
            Result.a aVar = Result.f124476c;
            qVar.resumeWith(Result.b(b2.f124493a));
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @dl.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.c<b2>[] b(@dl.d StateFlowImpl<?> flow) {
        this._state = null;
        return kotlinx.coroutines.flow.internal.b.f130076a;
    }

    public final void f() {
        while (true) {
            Object obj = this._state;
            if (obj == null || obj == v.f130105b) {
                return;
            }
            if (obj == v.f130104a) {
                if (androidx.concurrent.futures.a.a(f130106a, this, obj, v.f130105b)) {
                    return;
                }
            } else if (androidx.concurrent.futures.a.a(f130106a, this, obj, v.f130104a)) {
                Result.a aVar = Result.f124476c;
                ((kotlinx.coroutines.q) obj).resumeWith(Result.b(b2.f124493a));
                return;
            }
        }
    }

    public final boolean g() {
        Object andSet = f130106a.getAndSet(this, v.f130104a);
        f0.m(andSet);
        return andSet == v.f130105b;
    }
}
