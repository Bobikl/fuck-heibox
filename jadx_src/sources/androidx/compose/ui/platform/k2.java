package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewRootForInspector.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/k2;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Landroid/view/View;", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface k2 {

    /* JADX INFO: compiled from: ViewRootForInspector.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @dl.e
        @Deprecated
        public static AbstractComposeView a(@dl.d k2 k2Var) {
            return j2.a(k2Var);
        }

        @dl.e
        @Deprecated
        public static View b(@dl.d k2 k2Var) {
            return j2.b(k2Var);
        }
    }

    @dl.e
    AbstractComposeView getSubCompositionView();

    @dl.e
    View getViewRoot();
}
