package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 4, 2})
public final class PagingDataTransforms$transform$$inlined$map$4<R> implements kotlinx.coroutines.flow.e<PageEvent<R>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e f26161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.p f26162c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$transform$$inlined$map$4$2, reason: invalid class name */
    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 4, 2})
    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f<PageEvent<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f f26166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagingDataTransforms$transform$$inlined$map$4 f26167c;

        /* JADX INFO: renamed from: androidx.paging.PagingDataTransforms$transform$$inlined$map$4$2$1, reason: invalid class name */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 4, 2})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataTransforms$transform$$inlined$map$4$2", f = "PagingDataTransforms.kt", i = {}, l = {135, 135}, m = "emit", n = {}, s = {})
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26168b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f26169c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f26170d;

            public AnonymousClass1(kotlin.coroutines.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f26168b = obj;
                this.f26169c |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(kotlinx.coroutines.flow.f fVar, PagingDataTransforms$transform$$inlined$map$4 pagingDataTransforms$transform$$inlined$map$4) {
            this.f26166b = fVar;
            this.f26167c = pagingDataTransforms$transform$$inlined$map$4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.e
        public Object a(Object obj, @dl.d kotlin.coroutines.c cVar) {
            kotlin.jvm.internal.c0.e(4);
            new AnonymousClass1(cVar);
            kotlin.jvm.internal.c0.e(5);
            kotlinx.coroutines.flow.f fVar = this.f26166b;
            Object objInvoke = this.f26167c.f26162c.invoke((PageEvent) obj, cVar);
            kotlin.jvm.internal.c0.e(0);
            Object objEmit = fVar.emit(objInvoke, cVar);
            kotlin.jvm.internal.c0.e(2);
            kotlin.jvm.internal.c0.e(1);
            return objEmit;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
            AnonymousClass1 anonymousClass1;
            kotlinx.coroutines.flow.f fVar;
            if (cVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) cVar;
                int i10 = anonymousClass1.f26169c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f26169c = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(cVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
            Object obj2 = anonymousClass1.f26168b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = anonymousClass1.f26169c;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlinx.coroutines.flow.f fVar2 = (kotlinx.coroutines.flow.f) anonymousClass1.f26170d;
                    kotlin.t0.n(obj2);
                    fVar = fVar2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj2);
                }
                return b2.f124493a;
            }
            kotlin.t0.n(obj2);
            kotlinx.coroutines.flow.f fVar3 = this.f26166b;
            yh.p pVar = this.f26167c.f26162c;
            anonymousClass1.f26170d = fVar3;
            anonymousClass1.f26169c = 1;
            Object objInvoke = pVar.invoke((PageEvent) obj, anonymousClass1);
            if (objInvoke == objH) {
                return objH;
            }
            obj2 = objInvoke;
            fVar = fVar3;
            anonymousClass1.f26170d = null;
            anonymousClass1.f26169c = 2;
            if (fVar.emit(obj2, anonymousClass1) == objH) {
                return objH;
            }
            return b2.f124493a;
        }
    }

    public PagingDataTransforms$transform$$inlined$map$4(kotlinx.coroutines.flow.e eVar, yh.p pVar) {
        this.f26161b = eVar;
        this.f26162c = pVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
        Object objA = this.f26161b.a(new AnonymousClass2(fVar, this), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.e
    public Object g(@dl.d kotlinx.coroutines.flow.f fVar, @dl.d kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.c0.e(4);
        new ContinuationImpl(cVar) { // from class: androidx.paging.PagingDataTransforms$transform$$inlined$map$4.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26163b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f26164c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f26163b = obj;
                this.f26164c |= Integer.MIN_VALUE;
                return PagingDataTransforms$transform$$inlined$map$4.this.a(null, this);
            }
        };
        kotlin.jvm.internal.c0.e(5);
        kotlinx.coroutines.flow.e eVar = this.f26161b;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar, this);
        kotlin.jvm.internal.c0.e(0);
        eVar.a(anonymousClass2, cVar);
        kotlin.jvm.internal.c0.e(2);
        kotlin.jvm.internal.c0.e(1);
        return b2.f124493a;
    }
}
