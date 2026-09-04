package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class ScrollbarHelper {
    private ScrollbarHelper() {
    }

    static int computeScrollExtent(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z10) {
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view));
    }

    static int computeScrollOffset(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z10, boolean z11) {
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (state.getItemCount() - Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2))) - 1) : Math.max(0, Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(view)));
        }
        return iMax;
    }

    static int computeScrollRange(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z10) {
        if (layoutManager.getChildCount() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return state.getItemCount();
        }
        return (int) (((orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * state.getItemCount());
    }
}
