package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {bb.c.b.f30645g1, 218, 219, bb.c.b.f30897r1}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f129629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e<T> f129630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ i<T> f129631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ T f129632f;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<Integer, kotlin.coroutines.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f129633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ int f129634c;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @dl.e
        public final Object a(int i10, @dl.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i10), cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.f129634c = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.c<? super Boolean> cVar) {
            return a(num.intValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f129633b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
            return kotlin.coroutines.jvm.internal.a.a(this.f129634c > 0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/SharingCommand;", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {bb.c.b.f30941t1}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<SharingCommand, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f129635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f129636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e<T> f129637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i<T> f129638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f129639f;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        /* JADX INFO: compiled from: Share.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f129640a;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                iArr[SharingCommand.START.ordinal()] = 1;
                iArr[SharingCommand.STOP.ordinal()] = 2;
                iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                f129640a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(e<? extends T> eVar, i<T> iVar, T t10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f129637d = eVar;
            this.f129638e = iVar;
            this.f129639f = t10;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d SharingCommand sharingCommand, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) create(sharingCommand, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f129637d, this.f129638e, this.f129639f, cVar);
            anonymousClass2.f129636c = obj;
            return anonymousClass2;
        }

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
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f129635b;
            if (i10 == 0) {
                t0.n(obj);
                int i11 = a.f129640a[((SharingCommand) this.f129636c).ordinal()];
                if (i11 == 1) {
                    e<T> eVar = this.f129637d;
                    f fVar = this.f129638e;
                    this.f129635b = 1;
                    if (eVar.a(fVar, this) == objH) {
                        return objH;
                    }
                } else if (i11 == 3) {
                    T t10 = this.f129639f;
                    if (t10 == o.f130093a) {
                        this.f129638e.c();
                    } else {
                        this.f129638e.d(t10);
                    }
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
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ShareKt$launchSharing$1(r rVar, e<? extends T> eVar, i<T> iVar, T t10, kotlin.coroutines.c<? super FlowKt__ShareKt$launchSharing$1> cVar) {
        super(2, cVar);
        this.f129629c = rVar;
        this.f129630d = eVar;
        this.f129631e = iVar;
        this.f129632f = t10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new FlowKt__ShareKt$launchSharing$1(this.f129629c, this.f129630d, this.f129631e, this.f129632f, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__ShareKt$launchSharing$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[RETURN] */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        e<T> eVar;
        f fVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129628b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    t0.n(obj);
                    eVar = this.f129630d;
                    fVar = this.f129631e;
                    this.f129628b = 3;
                    if (eVar.a(fVar, this) == objH) {
                        return objH;
                    }
                } else if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            t0.n(obj);
        } else {
            t0.n(obj);
            r rVar = this.f129629c;
            r.Companion companion = r.INSTANCE;
            if (rVar == companion.c()) {
                e<T> eVar2 = this.f129630d;
                f fVar2 = this.f129631e;
                this.f129628b = 1;
                if (eVar2.a(fVar2, this) == objH) {
                    return objH;
                }
            } else if (this.f129629c == companion.d()) {
                u<Integer> uVarE = this.f129631e.e();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.f129628b = 2;
                if (g.u0(uVarE, anonymousClass1, this) == objH) {
                    return objH;
                }
                eVar = this.f129630d;
                fVar = this.f129631e;
                this.f129628b = 3;
                if (eVar.a(fVar, this) == objH) {
                    return objH;
                }
            } else {
                e eVarG0 = g.g0(this.f129629c.a(this.f129631e.e()));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f129630d, this.f129631e, this.f129632f, null);
                this.f129628b = 4;
                if (g.A(eVarG0, anonymousClass2, this) == objH) {
                    return objH;
                }
            }
        }
        return b2.f124493a;
    }
}
