package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements e<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f129663b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass2<T> implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f129667b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f129668b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f129669c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f129670d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f129671e;

            public AnonymousClass1(kotlin.coroutines.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f129668b = obj;
                this.f129669c |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(f fVar) {
            this.f129667b = fVar;
        }

        @dl.e
        public final Object a(Object obj, @dl.d kotlin.coroutines.c cVar) {
            c0.e(4);
            new AnonymousClass1(cVar);
            c0.e(5);
            f fVar = this.f129667b;
            f0.y(3, "R");
            if (obj instanceof Object) {
                c0.e(0);
                fVar.emit(obj, cVar);
                c0.e(1);
            }
            return b2.f124493a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
            AnonymousClass1 anonymousClass1;
            if (cVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) cVar;
                int i10 = anonymousClass1.f129669c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f129669c = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(cVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
            Object obj2 = anonymousClass1.f129668b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = anonymousClass1.f129669c;
            if (i11 == 0) {
                t0.n(obj2);
                f fVar = this.f129667b;
                f0.y(3, "R");
                if (obj instanceof Object) {
                    anonymousClass1.f129669c = 1;
                    if (fVar.emit(obj, anonymousClass1) == objH) {
                        return objH;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj2);
            }
            return b2.f124493a;
        }
    }

    public FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(e eVar) {
        this.f129663b = eVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super Object> fVar, @dl.d kotlin.coroutines.c cVar) {
        e eVar = this.f129663b;
        f0.w();
        Object objA = eVar.a(new AnonymousClass2(fVar), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.e
    public Object g(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
        c0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f129664b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f129665c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f129664b = obj;
                this.f129665c |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterIsInstance$$inlined$filter$1.this.a(null, this);
            }
        };
        c0.e(5);
        e eVar = this.f129663b;
        f0.w();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar);
        c0.e(0);
        eVar.a(anonymousClass2, cVar);
        c0.e(1);
        return b2.f124493a;
    }
}
