package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.layout.r;
import androidx.compose.ui.node.LayoutNode;
import b1.f;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import di.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u001a\f\u0010\b\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lkotlin/b2;", "e", "", "", "f", "g", "type", "Landroidx/compose/ui/input/nestedscroll/c;", RXScreenCaptureService.KEY_HEIGHT, "(I)I", ak.av, "I", "Unmeasured", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f17094a = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(View view, LayoutNode layoutNode) {
        long jF = r.f(layoutNode.u());
        int iL0 = d.L0(f.p(jF));
        int iL1 = d.L0(f.r(jF));
        view.layout(iL0, iL1, view.getMeasuredWidth() + iL0, view.getMeasuredHeight() + iL1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(int i10) {
        return i10 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(float f10) {
        return f10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10) {
        return i10 == 0 ? androidx.compose.ui.input.nestedscroll.c.INSTANCE.a() : androidx.compose.ui.input.nestedscroll.c.INSTANCE.b();
    }
}
