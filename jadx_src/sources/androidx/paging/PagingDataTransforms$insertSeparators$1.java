package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.s1;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: PagingDataTransforms.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "R", "", androidx.exifinterface.media.a.f23244d5, com.google.android.exoplayer2.text.ttml.d.f49784c0, com.google.android.exoplayer2.text.ttml.d.f49785d0, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$insertSeparators$1", f = "PagingDataTransforms.kt", i = {}, l = {bb.c.b.f30530b2}, m = "invokeSuspend", n = {}, s = {})
public final class PagingDataTransforms$insertSeparators$1<R, T> extends SuspendLambda implements yh.q<T, T, kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f26096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f26097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f26098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Executor f26099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.p f26100f;

    /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$insertSeparators$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PagingDataTransforms.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$insertSeparators$1$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super R>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26101b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f26103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f26104e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, Object obj2, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f26103d = obj;
            this.f26104e = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return new AnonymousClass1(this.f26103d, this.f26104e, completion);
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, Object obj) {
            return ((AnonymousClass1) create(q0Var, (kotlin.coroutines.c) obj)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f26101b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            return PagingDataTransforms$insertSeparators$1.this.f26100f.invoke(this.f26103d, this.f26104e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataTransforms$insertSeparators$1(Executor executor, yh.p pVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f26099e = executor;
        this.f26100f = pVar;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.e T t10, @dl.e T t11, @dl.d kotlin.coroutines.c<? super R> continuation) {
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        PagingDataTransforms$insertSeparators$1 pagingDataTransforms$insertSeparators$1 = new PagingDataTransforms$insertSeparators$1(this.f26099e, this.f26100f, continuation);
        pagingDataTransforms$insertSeparators$1.f26096b = t10;
        pagingDataTransforms$insertSeparators$1.f26097c = t11;
        return pagingDataTransforms$insertSeparators$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yh.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PagingDataTransforms$insertSeparators$1) a(obj, obj2, (kotlin.coroutines.c) obj3)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26098d;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Object obj2 = this.f26096b;
            Object obj3 = this.f26097c;
            CoroutineDispatcher coroutineDispatcherC = s1.c(this.f26099e);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(obj2, obj3, null);
            this.f26096b = null;
            this.f26098d = 1;
            obj = kotlinx.coroutines.i.h(coroutineDispatcherC, anonymousClass1, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return obj;
    }
}
