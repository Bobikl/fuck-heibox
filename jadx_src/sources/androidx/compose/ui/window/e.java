package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.w0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(29)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/window/e;", "Landroidx/compose/ui/window/f;", "Landroid/view/View;", "composeView", "", "width", "height", "Lkotlin/b2;", "b", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e extends f {
    @Override // androidx.compose.ui.window.f, androidx.compose.ui.window.d
    public void b(@dl.d View composeView, int i10, int i11) {
        f0.p(composeView, "composeView");
        composeView.setSystemGestureExclusionRects(CollectionsKt__CollectionsKt.P(new Rect(0, 0, i10, i11)));
    }
}
