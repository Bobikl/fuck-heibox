package androidx.activity.compose;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final ViewGroup.LayoutParams f1467a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(@dl.d ComponentActivity componentActivity, @dl.e r rVar, @dl.d p<? super androidx.compose.runtime.p, ? super Integer, b2> content) {
        f0.p(componentActivity, "<this>");
        f0.p(content, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(rVar);
            composeView.setContent(content);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(rVar);
        composeView2.setContent(content);
        c(componentActivity);
        componentActivity.setContentView(composeView2, f1467a);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, r rVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = null;
        }
        a(componentActivity, rVar, pVar);
    }

    private static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        f0.o(decorView, "window.decorView");
        if (ViewTreeLifecycleOwner.a(decorView) == null) {
            ViewTreeLifecycleOwner.b(decorView, componentActivity);
        }
        if (ViewTreeViewModelStoreOwner.a(decorView) == null) {
            ViewTreeViewModelStoreOwner.b(decorView, componentActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.a(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.b(decorView, componentActivity);
        }
    }
}
