package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.c0;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1<R> implements e<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f129701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.p f129702c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass2<T> implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f129706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.p f129707c;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {bb.c.b.f30852p1, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u2d5"}, s = {"L$0"})
        public static final class AnonymousClass1 extends ContinuationImpl {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f129708b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f129709c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f129711e;

            public AnonymousClass1(kotlin.coroutines.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f129708b = obj;
                this.f129709c |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(f fVar, yh.p pVar) {
            this.f129706b = fVar;
            this.f129707c = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.e
        public final Object a(Object obj, @dl.d kotlin.coroutines.c cVar) {
            c0.e(4);
            new AnonymousClass1(cVar);
            c0.e(5);
            f fVar = this.f129706b;
            Object objInvoke = this.f129707c.invoke(obj, cVar);
            if (objInvoke != null) {
                c0.e(0);
                fVar.emit(objInvoke, cVar);
                c0.e(1);
            }
            return b2.f124493a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            AnonymousClass1 anonymousClass1;
            f fVar;
            f fVar2;
            if (cVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) cVar;
                int i10 = anonymousClass1.f129709c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f129709c = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(cVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
            Object obj = anonymousClass1.f129708b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = anonymousClass1.f129709c;
            if (i11 != 0) {
                if (i11 == 1) {
                    fVar2 = (f) anonymousClass1.f129711e;
                    t0.n(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                fVar = fVar2;
                fVar = fVar2;
                return b2.f124493a;
            }
            t0.n(obj);
            f fVar3 = this.f129706b;
            yh.p pVar = this.f129707c;
            anonymousClass1.f129711e = fVar3;
            anonymousClass1.f129709c = 1;
            Object objInvoke = pVar.invoke(t10, anonymousClass1);
            if (objInvoke == objH) {
                return objH;
            }
            obj = objInvoke;
            fVar = fVar3;
            if (obj != null) {
                anonymousClass1.f129711e = null;
                anonymousClass1.f129709c = 2;
                if (fVar.emit(obj, anonymousClass1) == objH) {
                    fVar = fVar2;
                    return objH;
                }
            }
            fVar = fVar2;
            fVar = fVar2;
            return b2.f124493a;
        }
    }

    public FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(e eVar, yh.p pVar) {
        this.f129701b = eVar;
        this.f129702c = pVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
        Object objA = this.f129701b.a(new AnonymousClass2(fVar, this.f129702c), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.e
    public Object g(@dl.d f fVar, @dl.d kotlin.coroutines.c cVar) {
        c0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f129703b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f129704c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f129703b = obj;
                this.f129704c |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.this.a(null, this);
            }
        };
        c0.e(5);
        e eVar = this.f129701b;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar, this.f129702c);
        c0.e(0);
        eVar.a(anonymousClass2, cVar);
        c0.e(1);
        return b2.f124493a;
    }
}
