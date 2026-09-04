package androidx.compose.material3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0010H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0010H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"androidx/compose/material3/SwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/b;", "", "Lb1/f;", "f", "(F)J", "b", "(J)F", "available", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "consumed", ak.aF, "(JJI)J", "Ls1/x;", "d", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "(JJLkotlin/coroutines/c;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements androidx.compose.ui.input.nestedscroll.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f11002b;

    SwipeableKt$PreUpPostDownNestedScrollConnection$1(SwipeableState<T> swipeableState) {
        this.f11002b = swipeableState;
    }

    private final float b(long j10) {
        return b1.f.r(j10);
    }

    private final long f(float f10) {
        return b1.g.a(0.0f, f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object a(long j10, long j11, @dl.d kotlin.coroutines.c<? super s1.x> cVar) throws Throwable {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        if (cVar instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) cVar;
            int i10 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11006e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11006e = i10 - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, cVar);
            }
        } else {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, cVar);
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11004c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11006e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            SwipeableState<T> swipeableState = this.f11002b;
            float fB = b(b1.g.a(s1.x.l(j11), s1.x.n(j11)));
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11003b = j11;
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11006e = 1;
            if (swipeableState.G(fB, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11003b;
            kotlin.t0.n(obj);
        }
        return s1.x.b(j11);
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
    @Override // androidx.compose.ui.input.nestedscroll.b
    public long c(long consumed, long available, int source) {
        return androidx.compose.ui.input.nestedscroll.c.g(source, androidx.compose.ui.input.nestedscroll.c.INSTANCE.a()) ? f(this.f11002b.F(b(available))) : b1.f.f30364b.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    @Override // androidx.compose.ui.input.nestedscroll.b
    @dl.e
    public Object d(long j10, @dl.d kotlin.coroutines.c<? super s1.x> cVar) throws Throwable {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        if (cVar instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) cVar;
            int i10 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11010e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11010e = i10 - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, cVar);
            }
        } else {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, cVar);
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11008c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11010e;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            float fB = b(b1.g.a(s1.x.l(j10), s1.x.n(j10)));
            if (fB >= 0.0f || this.f11002b.v().getValue().floatValue() <= this.f11002b.getMinBound()) {
                j10 = s1.x.f139262b.a();
            } else {
                SwipeableState<T> swipeableState = this.f11002b;
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11007b = j10;
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11010e = 1;
                if (swipeableState.G(fB, swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) == objH) {
                    return objH;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11007b;
            kotlin.t0.n(obj);
        }
        return s1.x.b(j10);
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
    @Override // androidx.compose.ui.input.nestedscroll.b
    public long e(long available, int source) {
        float fB = b(available);
        return (fB >= 0.0f || !androidx.compose.ui.input.nestedscroll.c.g(source, androidx.compose.ui.input.nestedscroll.c.INSTANCE.a())) ? b1.f.f30364b.e() : f(this.f11002b.F(fB));
    }
}
