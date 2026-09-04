package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.w;
import yh.p;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/channels/w;", "", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
public final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements p<w<? super Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f130041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f130042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T2> f130043d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w<Object> f130044b;

        AnonymousClass1(w<Object> wVar) {
            this.f130044b = wVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T2 t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            CombineKt$zipImpl$1$1$second$1$1$emit$1 combineKt$zipImpl$1$1$second$1$1$emit$1;
            Object obj;
            if (cVar instanceof CombineKt$zipImpl$1$1$second$1$1$emit$1) {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = (CombineKt$zipImpl$1$1$second$1$1$emit$1) cVar;
                int i10 = combineKt$zipImpl$1$1$second$1$1$emit$1.f130047d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    combineKt$zipImpl$1$1$second$1$1$emit$1.f130047d = i10 - Integer.MIN_VALUE;
                } else {
                    combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, cVar);
                }
            } else {
                combineKt$zipImpl$1$1$second$1$1$emit$1 = new CombineKt$zipImpl$1$1$second$1$1$emit$1(this, cVar);
            }
            Object obj2 = combineKt$zipImpl$1$1$second$1$1$emit$1.f130045b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = combineKt$zipImpl$1$1$second$1$1$emit$1.f130047d;
            if (i11 == 0) {
                t0.n(obj2);
                b0<Object> b0VarC = this.f130044b.c();
                if (t10 == 0) {
                    obj = t10;
                    obj = l.f130082a;
                }
                obj = t10;
                combineKt$zipImpl$1$1$second$1$1$emit$1.f130047d = 1;
                if (b0VarC.X(obj, combineKt$zipImpl$1$1$second$1$1$emit$1) == objH) {
                    return objH;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$zipImpl$1$1$second$1(kotlinx.coroutines.flow.e<? extends T2> eVar, kotlin.coroutines.c<? super CombineKt$zipImpl$1$1$second$1> cVar) {
        super(2, cVar);
        this.f130043d = eVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<Object> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((CombineKt$zipImpl$1$1$second$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.f130043d, cVar);
        combineKt$zipImpl$1$1$second$1.f130042c = obj;
        return combineKt$zipImpl$1$1$second$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 for r4v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r4.f130041b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r5)
            goto L2e
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.t0.n(r5)
            java.lang.Object r5 = r4.f130042c
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlinx.coroutines.flow.e<T2> r1 = r4.f130043d
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1
            r3.<init>(r5)
            r4.f130041b = r2
            java.lang.Object r5 = r1.a(r3, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            kotlin.b2 r5 = kotlin.b2.f124493a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
