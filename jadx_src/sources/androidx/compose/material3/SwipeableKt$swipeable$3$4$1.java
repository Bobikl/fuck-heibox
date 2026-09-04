package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SwipeableKt$swipeable$3$4$1 extends SuspendLambda implements yh.q<kotlinx.coroutines.q0, Float, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f11044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ float f11045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f11046e;

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", i = {}, l = {612}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SwipeableState<T> f11048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SwipeableState<T> swipeableState, float f10, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f11048c = swipeableState;
            this.f11049d = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f11048c, this.f11049d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
            int i10 = this.f11047b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                SwipeableState<T> swipeableState = this.f11048c;
                float f10 = this.f11049d;
                this.f11047b = 1;
                if (swipeableState.G(f10, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return kotlin.b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$3$4$1(SwipeableState<T> swipeableState, kotlin.coroutines.c<? super SwipeableKt$swipeable$3$4$1> cVar) {
        super(3, cVar);
        this.f11046e = swipeableState;
    }

    @dl.e
    public final Object a(@dl.d kotlinx.coroutines.q0 q0Var, float f10, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$1 = new SwipeableKt$swipeable$3$4$1(this.f11046e, cVar);
        swipeableKt$swipeable$3$4$1.f11044c = q0Var;
        swipeableKt$swipeable$3$4$1.f11045d = f10;
        return swipeableKt$swipeable$3$4$1.invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // yh.q
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, Float f10, kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return a(q0Var, f10.floatValue(), cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f11043b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        kotlinx.coroutines.k.f((kotlinx.coroutines.q0) this.f11044c, null, null, new AnonymousClass1(this.f11046e, this.f11045d, null), 3, null);
        return kotlin.b2.f124493a;
    }
}
