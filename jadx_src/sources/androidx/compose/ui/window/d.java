package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.j1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@j1(otherwise = 2)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/window/d;", "", "Landroid/view/View;", "composeView", "Landroid/graphics/Rect;", "outRect", "Lkotlin/b2;", ak.aF, "", "width", "height", "b", "Landroid/view/WindowManager;", "windowManager", "popupView", "Landroid/view/ViewGroup$LayoutParams;", "params", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface d {
    void a(@dl.d WindowManager windowManager, @dl.d View view, @dl.d ViewGroup.LayoutParams layoutParams);

    void b(@dl.d View view, int i10, int i11);

    void c(@dl.d View view, @dl.d Rect rect);
}
