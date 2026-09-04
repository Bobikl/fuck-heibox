package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/channels/w;", "", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.channels.w<? super Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e<T> f129336d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Delay.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1<T> implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.w<Object> f129337b;

        AnonymousClass1(kotlinx.coroutines.channels.w<Object> wVar) {
            this.f129337b = wVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            if (cVar instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) cVar;
                int i10 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f129340d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f129340d = i10 - Integer.MIN_VALUE;
                } else {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, cVar);
                }
            } else {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, cVar);
            }
            Object obj = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f129338b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f129340d;
            if (i11 == 0) {
                t0.n(obj);
                kotlinx.coroutines.channels.w<Object> wVar = this.f129337b;
                if (t10 == null) {
                    t10 = (T) kotlinx.coroutines.flow.internal.l.f130082a;
                }
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f129340d = 1;
                if (wVar.X(t10, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1$values$1(e<? extends T> eVar, kotlin.coroutines.c<? super FlowKt__DelayKt$debounceInternal$1$values$1> cVar) {
        super(2, cVar);
        this.f129336d = eVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlinx.coroutines.channels.w<Object> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.f129336d, cVar);
        flowKt__DelayKt$debounceInternal$1$values$1.f129335c = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 for r4v1 'this'  kotlin.coroutines.c
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
            int r1 = r4.f129334b
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
            java.lang.Object r5 = r4.f129335c
            kotlinx.coroutines.channels.w r5 = (kotlinx.coroutines.channels.w) r5
            kotlinx.coroutines.flow.e<T> r1 = r4.f129336d
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1
            r3.<init>(r5)
            r4.f129334b = r2
            java.lang.Object r5 = r1.a(r3, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            kotlin.b2 r5 = kotlin.b2.f124493a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
