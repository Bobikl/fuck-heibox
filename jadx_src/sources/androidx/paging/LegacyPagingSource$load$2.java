package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* JADX INFO: compiled from: LegacyPagingSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Landroidx/paging/q0$b$b;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class LegacyPagingSource$load$2<Key, Value> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super q0.b.Page<Key, Value>>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ LegacyPagingSource f25625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f25626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ q0.a f25627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyPagingSource$load$2(LegacyPagingSource legacyPagingSource, Ref.ObjectRef objectRef, q0.a aVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25625c = legacyPagingSource;
        this.f25626d = objectRef;
        this.f25627e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new LegacyPagingSource$load$2(this.f25625c, this.f25626d, this.f25627e, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, Object obj) {
        return ((LegacyPagingSource$load$2) create(q0Var, (kotlin.coroutines.c) obj)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25624b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            DataSource<Key, Value> dataSourceK = this.f25625c.k();
            DataSource.d<Key> dVar = (DataSource.d) this.f25626d.f124891b;
            this.f25624b = 1;
            obj = dataSourceK.j(dVar, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        DataSource.a aVar = (DataSource.a) obj;
        List<Value> list = aVar.data;
        return new q0.b.Page(list, (list.isEmpty() && (this.f25627e instanceof q0.a.c)) ? null : aVar.getPrevKey(), (aVar.data.isEmpty() && (this.f25627e instanceof q0.a.C0204a)) ? null : aVar.getNextKey(), aVar.getItemsBefore(), aVar.getItemsAfter());
    }
}
