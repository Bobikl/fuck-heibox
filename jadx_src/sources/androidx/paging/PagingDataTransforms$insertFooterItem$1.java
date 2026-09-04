package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: PagingDataTransforms.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", androidx.exifinterface.media.a.f23244d5, "", "<anonymous parameter 0>", com.google.android.exoplayer2.text.ttml.d.f49785d0, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$insertFooterItem$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PagingDataTransforms$insertFooterItem$1<T> extends SuspendLambda implements yh.q<T, T, kotlin.coroutines.c<? super T>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f26090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f26092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataTransforms$insertFooterItem$1(Object obj, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f26092d = obj;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.e T t10, @dl.e T t11, @dl.d kotlin.coroutines.c<? super T> continuation) {
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        PagingDataTransforms$insertFooterItem$1 pagingDataTransforms$insertFooterItem$1 = new PagingDataTransforms$insertFooterItem$1(this.f26092d, continuation);
        pagingDataTransforms$insertFooterItem$1.f26090b = t11;
        return pagingDataTransforms$insertFooterItem$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yh.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PagingDataTransforms$insertFooterItem$1) a(obj, obj2, (kotlin.coroutines.c) obj3)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f26091c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        if (this.f26090b == null) {
            return this.f26092d;
        }
        return null;
    }
}
