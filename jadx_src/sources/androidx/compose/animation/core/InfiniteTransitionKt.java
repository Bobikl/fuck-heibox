package androidx.compose.animation.core;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a[\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0005*\u00020\u0004*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", ak.aF, "(Landroidx/compose/runtime/p;I)Landroidx/compose/animation/core/InfiniteTransition;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "initialValue", "targetValue", "Landroidx/compose/animation/core/f1;", "typeConverter", "Landroidx/compose/animation/core/n0;", "animationSpec", "Landroidx/compose/runtime/m2;", "b", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/f1;Landroidx/compose/animation/core/n0;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "", ak.av, "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/n0;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class InfiniteTransitionKt {
    @dl.d
    @androidx.compose.runtime.h
    public static final m2<Float> a(@dl.d InfiniteTransition infiniteTransition, float f10, float f11, @dl.d n0<Float> animationSpec, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(infiniteTransition, "<this>");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        pVar.T(469472752);
        if (ComposerKt.g0()) {
            ComposerKt.w0(469472752, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:269)");
        }
        m2<Float> m2VarB = b(infiniteTransition, Float.valueOf(f10), Float.valueOf(f11), VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a), animationSpec, pVar, (i10 & 112) | 8 | (i10 & bb.c.b.f30796me) | (57344 & (i10 << 3)));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarB;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final <T, V extends p> m2<T> b(@dl.d final InfiniteTransition infiniteTransition, final T t10, final T t11, @dl.d f1<T, V> typeConverter, @dl.d final n0<T> animationSpec, @dl.e androidx.compose.runtime.p pVar, int i10) {
        kotlin.jvm.internal.f0.p(infiniteTransition, "<this>");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        pVar.T(-1695411770);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1695411770, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:216)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new InfiniteTransition.a(infiniteTransition, t10, t11, typeConverter, animationSpec);
            pVar.N(objU);
        }
        pVar.c0();
        final InfiniteTransition.a aVar = (InfiniteTransition.a) objU;
        EffectsKt.k(new yh.a<b2>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
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
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (kotlin.jvm.internal.f0.g(t10, aVar.g()) && kotlin.jvm.internal.f0.g(t11, aVar.j())) {
                    return;
                }
                aVar.A(t10, t11, animationSpec);
            }
        }, pVar, 0);
        EffectsKt.c(aVar, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements androidx.compose.runtime.e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ InfiniteTransition f4192a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InfiniteTransition.a f4193b;

                public a(InfiniteTransition infiniteTransition, InfiniteTransition.a aVar) {
                    this.f4192a = infiniteTransition;
                    this.f4193b = aVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f4192a.j(this.f4193b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
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
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                infiniteTransition.e(aVar);
                return new a(infiniteTransition, aVar);
            }
        }, pVar, 6);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return aVar;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final InfiniteTransition c(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-840193660);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-840193660, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:43)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new InfiniteTransition();
            pVar.N(objU);
        }
        pVar.c0();
        InfiniteTransition infiniteTransition = (InfiniteTransition) objU;
        infiniteTransition.k(pVar, 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return infiniteTransition;
    }
}
