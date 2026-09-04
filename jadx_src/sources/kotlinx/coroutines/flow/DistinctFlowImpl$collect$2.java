package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class DistinctFlowImpl$collect$2<T> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ DistinctFlowImpl<T> f129208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f129209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f<T> f129210d;

    /* JADX WARN: Multi-variable type inference failed */
    DistinctFlowImpl$collect$2(DistinctFlowImpl<T> distinctFlowImpl, Ref.ObjectRef<Object> objectRef, f<? super T> fVar) {
        this.f129208b = distinctFlowImpl;
        this.f129209c = objectRef;
        this.f129210d = fVar;
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
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        if (cVar instanceof DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) cVar;
            int i10 = distinctFlowImpl$collect$2$emit$1.f129213d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.f129213d = i10 - Integer.MIN_VALUE;
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, cVar);
            }
        } else {
            distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, cVar);
        }
        Object obj = distinctFlowImpl$collect$2$emit$1.f129211b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = distinctFlowImpl$collect$2$emit$1.f129213d;
        if (i11 == 0) {
            t0.n(obj);
            T t11 = (T) this.f129208b.f129206c.invoke(t10);
            Object obj2 = this.f129209c.f124891b;
            if (obj2 != kotlinx.coroutines.flow.internal.l.f130082a && this.f129208b.f129207d.invoke(obj2, t11).booleanValue()) {
                return b2.f124493a;
            }
            this.f129209c.f124891b = t11;
            f<T> fVar = this.f129210d;
            distinctFlowImpl$collect$2$emit$1.f129213d = 1;
            if (fVar.emit(t10, distinctFlowImpl$collect$2$emit$1) == objH) {
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
