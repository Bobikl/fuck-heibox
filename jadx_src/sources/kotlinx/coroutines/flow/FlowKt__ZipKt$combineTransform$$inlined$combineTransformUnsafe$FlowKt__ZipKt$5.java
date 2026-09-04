package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5<R> extends SuspendLambda implements yh.p<f<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e[] f129830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.u f129831e;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1, reason: invalid class name */
    /* JADX INFO: compiled from: Zip.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/b2;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {bb.c.b.f30987v3}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.q<f<? super R>, Object[], kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f129832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f129833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f129834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yh.u f129835e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.coroutines.c cVar, yh.u uVar) {
            super(3, cVar);
            this.f129835e = uVar;
        }

        @Override // yh.q
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d f<? super R> fVar, @dl.d Object[] objArr, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, this.f129835e);
            anonymousClass1.f129833c = fVar;
            anonymousClass1.f129834d = objArr;
            return anonymousClass1.invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f129832b;
            if (i10 == 0) {
                t0.n(obj);
                f fVar = (f) this.f129833c;
                Object[] objArr = (Object[]) this.f129834d;
                yh.u uVar = this.f129835e;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                this.f129832b = 1;
                c0.e(6);
                Object objG1 = uVar.g1(fVar, obj2, obj3, obj4, obj5, obj6, this);
                c0.e(7);
                if (objG1 == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(e[] eVarArr, kotlin.coroutines.c cVar, yh.u uVar) {
        super(2, cVar);
        this.f129830d = eVarArr;
        this.f129831e = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 = new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(this.f129830d, cVar, this.f129831e);
        flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5.f129829c = obj;
        return flowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d f<? super R> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129828b;
        if (i10 == 0) {
            t0.n(obj);
            f fVar = (f) this.f129829c;
            e[] eVarArr = this.f129830d;
            yh.a aVarR = FlowKt__ZipKt.r();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f129831e);
            this.f129828b = 1;
            if (CombineKt.a(fVar, eVarArr, aVarR, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
