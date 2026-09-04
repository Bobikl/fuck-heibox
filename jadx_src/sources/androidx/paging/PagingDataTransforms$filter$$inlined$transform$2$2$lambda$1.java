package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: PagingDataTransforms.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Landroidx/paging/PageEvent;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/paging/PagingDataTransforms$filter$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$filter$2$1", f = "PagingDataTransforms.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class PagingDataTransforms$filter$$inlined$transform$2$2$lambda$1<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super PageEvent<T>>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PageEvent f26062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PagingDataTransforms$filter$$inlined$transform$2.AnonymousClass2 f26063d;

    /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$filter$$inlined$transform$2$2$lambda$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PagingDataTransforms.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.a.f23244d5, "", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/paging/PagingDataTransforms$filter$2$1$1"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$filter$2$1$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<T, kotlin.coroutines.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26065c;

        AnonymousClass1(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(completion);
            anonymousClass1.f26064b = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public final Object invoke(Object obj, kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(obj, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f26065c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            return PagingDataTransforms$filter$$inlined$transform$2$2$lambda$1.this.f26063d.f26056c.f26054d.invoke(this.f26064b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataTransforms$filter$$inlined$transform$2$2$lambda$1(PageEvent pageEvent, kotlin.coroutines.c cVar, PagingDataTransforms$filter$$inlined$transform$2.AnonymousClass2 anonymousClass2) {
        super(2, cVar);
        this.f26062c = pageEvent;
        this.f26063d = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PagingDataTransforms$filter$$inlined$transform$2$2$lambda$1(this.f26062c, completion, this.f26063d);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, Object obj) {
        return ((PagingDataTransforms$filter$$inlined$transform$2$2$lambda$1) create(q0Var, (kotlin.coroutines.c) obj)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26061b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            PageEvent pageEvent = this.f26062c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.f26061b = 1;
            obj = pageEvent.a(anonymousClass1, this);
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
