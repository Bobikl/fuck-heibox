package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.h0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r3;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
public final class CombineKt$combineInternal$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f129995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f129996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f129997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T>[] f129998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ yh.a<T[]> f129999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ q<kotlinx.coroutines.flow.f<? super R>, T[], kotlin.coroutines.c<? super b2>, Object> f130000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<R> f130001k;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f130002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T>[] f130003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f130004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f130005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.k<h0<Object>> f130006f;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Combine.kt */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class C11901<T> implements kotlinx.coroutines.flow.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.k<h0<Object>> f130007b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f130008c;

            C11901(kotlinx.coroutines.channels.k<h0<Object>> kVar, int i10) {
                this.f130007b = kVar;
                this.f130008c = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.f
            @dl.e
            public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                if (cVar instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) cVar;
                    int i10 = combineKt$combineInternal$2$1$1$emit$1.f130011d;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.f130011d = i10 - Integer.MIN_VALUE;
                    } else {
                        combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, cVar);
                    }
                } else {
                    combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, cVar);
                }
                Object obj = combineKt$combineInternal$2$1$1$emit$1.f130009b;
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i11 = combineKt$combineInternal$2$1$1$emit$1.f130011d;
                if (i11 != 0) {
                    if (i11 == 1) {
                        t0.n(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                    }
                    return b2.f124493a;
                }
                t0.n(obj);
                kotlinx.coroutines.channels.k<h0<Object>> kVar = this.f130007b;
                h0<Object> h0Var = new h0<>(this.f130008c, t10);
                combineKt$combineInternal$2$1$1$emit$1.f130011d = 1;
                if (kVar.X(h0Var, combineKt$combineInternal$2$1$1$emit$1) == objH) {
                    return objH;
                }
                combineKt$combineInternal$2$1$1$emit$1.f130011d = 2;
                if (r3.a(combineKt$combineInternal$2$1$1$emit$1) == objH) {
                    return objH;
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.e<? extends T>[] eVarArr, int i10, AtomicInteger atomicInteger, kotlinx.coroutines.channels.k<h0<Object>> kVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f130003c = eVarArr;
            this.f130004d = i10;
            this.f130005e = atomicInteger;
            this.f130006f = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f130003c, this.f130004d, this.f130005e, this.f130006f, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f130002b;
            try {
                if (i10 == 0) {
                    t0.n(obj);
                    kotlinx.coroutines.flow.e[] eVarArr = this.f130003c;
                    int i11 = this.f130004d;
                    kotlinx.coroutines.flow.e eVar = eVarArr[i11];
                    C11901 c11901 = new C11901(this.f130006f, i11);
                    this.f130002b = 1;
                    if (eVar.a(c11901, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                if (this.f130005e.decrementAndGet() == 0) {
                    b0.a.a(this.f130006f, null, 1, null);
                }
                return b2.f124493a;
            } catch (Throwable th2) {
                if (this.f130005e.decrementAndGet() == 0) {
                    b0.a.a(this.f130006f, null, 1, null);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$combineInternal$2(kotlinx.coroutines.flow.e<? extends T>[] eVarArr, yh.a<T[]> aVar, q<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, kotlinx.coroutines.flow.f<? super R> fVar, kotlin.coroutines.c<? super CombineKt$combineInternal$2> cVar) {
        super(2, cVar);
        this.f129998h = eVarArr;
        this.f129999i = aVar;
        this.f130000j = qVar;
        this.f130001k = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f129998h, this.f129999i, this.f130000j, this.f130001k, cVar);
        combineKt$combineInternal$2.f129997g = obj;
        return combineKt$combineInternal$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((CombineKt$combineInternal$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec A[LOOP:0: B:28:0x00ec->B:51:?, LOOP_START, PHI: r3 r10
  0x00ec: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e7, B:51:?] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r10v5 kotlin.collections.h0) = (r10v4 kotlin.collections.h0), (r10v18 kotlin.collections.h0) binds: [B:25:0x00e7, B:51:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    /* JADX WARN: Code duplicated, block: B:36:0x0113  */
    /* JADX WARN: Code duplicated, block: B:38:0x011d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0134  */
    /* JADX WARN: Code duplicated, block: B:46:0x0168  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111 A[EDGE_INSN: B:49:0x0111->B:35:0x0111 BREAK  A[LOOP:0: B:28:0x00ec->B:51:?], SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0134 -> B:20:0x00c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
