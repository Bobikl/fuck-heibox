package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1<T> implements kotlinx.coroutines.flow.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ FlowExtKt$simpleRunningReduce$1 f25552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f f25553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f25554d;

    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "emit"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", i = {0}, l = {137, 140}, m = "emit", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25556c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f25558e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f25559f;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f25555b = obj;
            this.f25556c |= Integer.MIN_VALUE;
            return FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1(FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1, kotlinx.coroutines.flow.f fVar, Ref.ObjectRef objectRef) {
        this.f25552b = flowExtKt$simpleRunningReduce$1;
        this.f25553c = fVar;
        this.f25554d = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Ref.ObjectRef objectRef;
        FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1<T> flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f25556c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f25556c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj2 = anonymousClass1.f25555b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f25556c;
        if (i11 != 0) {
            if (i11 == 1) {
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) anonymousClass1.f25559f;
                flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = (FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1) anonymousClass1.f25558e;
                kotlin.t0.n(obj2);
                objectRef = objectRef2;
                obj = (T) obj2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj2);
            }
            return b2.f124493a;
        }
        kotlin.t0.n(obj2);
        objectRef = this.f25554d;
        if (objectRef.f124891b != FlowExtKt.f25539a) {
            yh.q qVar = this.f25552b.f25551e;
            T t10 = this.f25554d.f124891b;
            anonymousClass1.f25558e = this;
            anonymousClass1.f25559f = objectRef;
            anonymousClass1.f25556c = 1;
            kotlin.jvm.internal.c0.e(6);
            obj = qVar.invoke(t10, obj, anonymousClass1);
            kotlin.jvm.internal.c0.e(7);
            if (obj == objH) {
                return objH;
            }
        }
        flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = this;
        objectRef.f124891b = (T) obj;
        kotlinx.coroutines.flow.f fVar = flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.f25553c;
        T t11 = flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1.f25554d.f124891b;
        anonymousClass1.f25558e = null;
        anonymousClass1.f25559f = null;
        anonymousClass1.f25556c = 2;
        if (fVar.emit(t11, anonymousClass1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
