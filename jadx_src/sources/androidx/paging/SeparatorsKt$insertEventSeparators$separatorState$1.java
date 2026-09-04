package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: Separators.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "R", androidx.exifinterface.media.a.f23244d5, "", com.google.android.exoplayer2.text.ttml.d.f49784c0, com.google.android.exoplayer2.text.ttml.d.f49785d0, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", i = {}, l = {bb.c.b.f30583d8}, m = "invokeSuspend", n = {}, s = {})
public final class SeparatorsKt$insertEventSeparators$separatorState$1<R, T> extends SuspendLambda implements yh.q<T, T, kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f26281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f26282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f26283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q f26284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeparatorsKt$insertEventSeparators$separatorState$1(yh.q qVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f26284e = qVar;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.e T t10, @dl.e T t11, @dl.d kotlin.coroutines.c<? super R> continuation) {
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new SeparatorsKt$insertEventSeparators$separatorState$1(this.f26284e, continuation);
        separatorsKt$insertEventSeparators$separatorState$1.f26281b = t10;
        separatorsKt$insertEventSeparators$separatorState$1.f26282c = t11;
        return separatorsKt$insertEventSeparators$separatorState$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yh.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((SeparatorsKt$insertEventSeparators$separatorState$1) a(obj, obj2, (kotlin.coroutines.c) obj3)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26283d;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Object obj2 = this.f26281b;
            Object obj3 = this.f26282c;
            yh.q qVar = this.f26284e;
            this.f26281b = null;
            this.f26283d = 1;
            obj = qVar.invoke(obj2, obj3, this);
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
