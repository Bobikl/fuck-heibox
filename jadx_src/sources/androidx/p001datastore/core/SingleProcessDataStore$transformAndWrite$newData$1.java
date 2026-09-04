package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {a.f23244d5, "Lkotlinx/coroutines/q0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
public final class SingleProcessDataStore$transformAndWrite$newData$1<T> extends SuspendLambda implements p<q0, c<? super T>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p<T, c<? super T>, Object> f22164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ T f22165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SingleProcessDataStore$transformAndWrite$newData$1(p<? super T, ? super c<? super T>, ? extends Object> pVar, T t10, c<? super SingleProcessDataStore$transformAndWrite$newData$1> cVar) {
        super(2, cVar);
        this.f22164c = pVar;
        this.f22165d = t10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.f22164c, this.f22165d, cVar);
    }

    @Override // yh.p
    @e
    public final Object invoke(@dl.d q0 q0Var, @e c<? super T> cVar) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = b.h();
        int i10 = this.f22163b;
        if (i10 == 0) {
            t0.n(obj);
            p<T, c<? super T>, Object> pVar = this.f22164c;
            T t10 = this.f22165d;
            this.f22163b = 1;
            obj = pVar.invoke(t10, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return obj;
    }
}
