package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0011¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/g0;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/j1;", "value", "Landroidx/compose/runtime/m2;", "e", "(Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/d2;", "b", "Landroidx/compose/runtime/d2;", ak.bo, "Lkotlin/Function0;", "defaultFactory", "<init>", "(Landroidx/compose/runtime/d2;Lyh/a;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class g0<T> extends j1<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d2<T> policy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@dl.d d2<T> policy, @dl.d yh.a<? extends T> defaultFactory) {
        super(defaultFactory);
        kotlin.jvm.internal.f0.p(policy, "policy");
        kotlin.jvm.internal.f0.p(defaultFactory, "defaultFactory");
        this.policy = policy;
    }

    @Override // androidx.compose.runtime.v
    @dl.d
    @h
    public m2<T> e(T t10, @dl.e p pVar, int i10) {
        pVar.T(-84026900);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-84026900, i10, -1, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = e2.j(t10, this.policy);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        a1Var.setValue(t10);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }
}
