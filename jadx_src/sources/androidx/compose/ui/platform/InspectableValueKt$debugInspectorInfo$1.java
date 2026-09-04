package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/platform/x0;)V"}, k = 3, mv = {1, 7, 1})
public final class InspectableValueKt$debugInspectorInfo$1 extends Lambda implements yh.l<x0, kotlin.b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.l<x0, kotlin.b2> f15653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InspectableValueKt$debugInspectorInfo$1(yh.l<? super x0, kotlin.b2> lVar) {
        super(1);
        this.f15653b = lVar;
    }

    public final void a(@dl.d x0 x0Var) {
        kotlin.jvm.internal.f0.p(x0Var, "$this$null");
        this.f15653b.invoke(x0Var);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(x0 x0Var) {
        a(x0Var);
        return kotlin.b2.f124493a;
    }
}
