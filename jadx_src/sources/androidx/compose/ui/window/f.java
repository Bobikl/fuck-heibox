package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/window/f;", "Landroidx/compose/ui/window/d;", "Landroid/view/View;", "composeView", "Landroid/graphics/Rect;", "outRect", "Lkotlin/b2;", ak.aF, "", "width", "height", "b", "Landroid/view/WindowManager;", "windowManager", "popupView", "Landroid/view/ViewGroup$LayoutParams;", "params", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public class f implements d {
    @Override // androidx.compose.ui.window.d
    public void a(@dl.d WindowManager windowManager, @dl.d View popupView, @dl.d ViewGroup.LayoutParams params) {
        f0.p(windowManager, "windowManager");
        f0.p(popupView, "popupView");
        f0.p(params, "params");
        windowManager.updateViewLayout(popupView, params);
    }

    @Override // androidx.compose.ui.window.d
    public void b(@dl.d View composeView, int i10, int i11) {
        f0.p(composeView, "composeView");
    }

    @Override // androidx.compose.ui.window.d
    public void c(@dl.d View composeView, @dl.d Rect outRect) {
        f0.p(composeView, "composeView");
        f0.p(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
    }
}
