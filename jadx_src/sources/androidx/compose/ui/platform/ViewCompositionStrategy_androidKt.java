package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", sd.b.f139384b, "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/Function0;", "Lkotlin/b2;", ak.aF, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class ViewCompositionStrategy_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.a<kotlin.b2> c(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) > 0) {
            final androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: androidx.compose.ui.platform.b2
                @Override // androidx.lifecycle.v
                public final void d(androidx.lifecycle.y yVar, Lifecycle.Event event) {
                    ViewCompositionStrategy_androidKt.d(abstractComposeView, yVar, event);
                }
            };
            lifecycle.a(vVar);
            return new yh.a<kotlin.b2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                    invoke2();
                    return kotlin.b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    lifecycle.d(vVar);
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractComposeView view, androidx.lifecycle.y yVar, Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(view, "$view");
        kotlin.jvm.internal.f0.p(yVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.f0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            view.e();
        }
    }
}
