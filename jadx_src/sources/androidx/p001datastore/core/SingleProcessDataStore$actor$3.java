package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import bb.c;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {a.f23244d5, "Landroidx/datastore/core/SingleProcessDataStore$b;", "msg", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@d(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", i = {}, l = {c.b.F1, c.b.I1}, m = "invokeSuspend", n = {}, s = {})
public final class SingleProcessDataStore$actor$3<T> extends SuspendLambda implements p<SingleProcessDataStore.b<T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f22090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleProcessDataStore<T> f22091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$actor$3(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.c<? super SingleProcessDataStore$actor$3> cVar) {
        super(2, cVar);
        this.f22091d = singleProcessDataStore;
    }

    @Override // yh.p
    @e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d SingleProcessDataStore.b<T> bVar, @e kotlin.coroutines.c<? super b2> cVar) {
        return ((SingleProcessDataStore$actor$3) create(bVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.f22091d, cVar);
        singleProcessDataStore$actor$3.f22090c = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = b.h();
        int i10 = this.f22089b;
        if (i10 == 0) {
            t0.n(obj);
            SingleProcessDataStore.b bVar = (SingleProcessDataStore.b) this.f22090c;
            if (bVar instanceof SingleProcessDataStore.b.a) {
                this.f22089b = 1;
                if (this.f22091d.s((SingleProcessDataStore.b.a) bVar, this) == objH) {
                    return objH;
                }
            } else if (bVar instanceof SingleProcessDataStore.b.C0156b) {
                this.f22089b = 2;
                if (this.f22091d.t((SingleProcessDataStore.b.C0156b) bVar, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
