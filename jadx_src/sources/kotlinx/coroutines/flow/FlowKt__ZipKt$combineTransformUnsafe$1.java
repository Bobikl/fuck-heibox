package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combineTransformUnsafe$1<R> extends SuspendLambda implements yh.p<f<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e<T>[] f129856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q<f<? super R>, T[], kotlin.coroutines.c<? super b2>, Object> f129857e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Zip.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends SuspendLambda implements yh.q<f<? super R>, T[], kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f129858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f129859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f129860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yh.q<f<? super R>, T[], kotlin.coroutines.c<? super b2>, Object> f129861e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(yh.q<? super f<? super R>, ? super T[], ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.f129861e = qVar;
        }

        @Override // yh.q
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d f<? super R> fVar, @dl.d T[] tArr, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f129861e, cVar);
            anonymousClass1.f129859c = fVar;
            anonymousClass1.f129860d = tArr;
            return anonymousClass1.invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @dl.e
        public final Object f(@dl.d Object obj) {
            this.f129861e.invoke((f) this.f129859c, (Object[]) this.f129860d, this);
            return b2.f124493a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
            int i10 = this.f129858b;
            if (i10 == 0) {
                t0.n(obj);
                f<? super R> fVar = (f) this.f129859c;
                Object[] objArr = (Object[]) this.f129860d;
                yh.q<f<? super R>, T[], kotlin.coroutines.c<? super b2>, Object> qVar = this.f129861e;
                this.f129859c = null;
                this.f129858b = 1;
                if (qVar.invoke(fVar, objArr, this) == objH) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransformUnsafe$1(e<? extends T>[] eVarArr, yh.q<? super f<? super R>, ? super T[], ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__ZipKt$combineTransformUnsafe$1> cVar) {
        super(2, cVar);
        this.f129856d = eVarArr;
        this.f129857e = qVar;
    }

    @dl.e
    public final Object a(@dl.d Object obj) {
        f fVar = (f) this.f129855c;
        e<T>[] eVarArr = this.f129856d;
        yh.a aVarR = FlowKt__ZipKt.r();
        f0.w();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f129857e, null);
        c0.e(0);
        CombineKt.a(fVar, eVarArr, aVarR, anonymousClass1, this);
        c0.e(1);
        return b2.f124493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.f129856d, this.f129857e, cVar);
        flowKt__ZipKt$combineTransformUnsafe$1.f129855c = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d f<? super R> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129854b;
        if (i10 == 0) {
            t0.n(obj);
            f fVar = (f) this.f129855c;
            e<T>[] eVarArr = this.f129856d;
            yh.a aVarR = FlowKt__ZipKt.r();
            f0.w();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f129857e, null);
            this.f129854b = 1;
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
