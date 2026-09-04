package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.c0;
import kotlin.t0;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {bb.c.b.G2, bb.c.b.G2}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combine$6$2<R, T> extends SuspendLambda implements yh.q<f<? super R>, T[], kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<T[], kotlin.coroutines.c<? super R>, Object> f129795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$6$2(yh.p<? super T[], ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, kotlin.coroutines.c<? super FlowKt__ZipKt$combine$6$2> cVar) {
        super(3, cVar);
        this.f129795e = pVar;
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d f<? super R> fVar, @dl.d T[] tArr, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.f129795e, cVar);
        flowKt__ZipKt$combine$6$2.f129793c = fVar;
        flowKt__ZipKt$combine$6$2.f129794d = tArr;
        return flowKt__ZipKt$combine$6$2.invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        f fVar = (f) this.f129793c;
        Object objInvoke = this.f129795e.invoke((Object[]) this.f129794d, this);
        c0.e(0);
        fVar.emit(objInvoke, this);
        c0.e(1);
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
        f fVar;
        f fVar2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129792b;
        if (i10 != 0) {
            if (i10 == 1) {
                f fVar3 = (f) this.f129793c;
                t0.n(obj);
                fVar2 = fVar3;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        fVar = (f) this.f129793c;
        Object[] objArr = (Object[]) this.f129794d;
        yh.p<T[], kotlin.coroutines.c<? super R>, Object> pVar = this.f129795e;
        this.f129793c = fVar;
        this.f129792b = 1;
        obj = pVar.invoke(objArr, this);
        if (obj == objH) {
            fVar2 = fVar;
            return objH;
        }
        fVar2 = fVar;
        this.f129793c = null;
        this.f129792b = 2;
        if (fVar2.emit(obj, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
