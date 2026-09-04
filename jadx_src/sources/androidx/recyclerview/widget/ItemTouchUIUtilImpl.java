package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.j1;
import androidx.recyclerview.R;

/* JADX INFO: loaded from: classes6.dex */
public class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    static final ItemTouchUIUtil INSTANCE = new ItemTouchUIUtilImpl();

    ItemTouchUIUtilImpl() {
    }

    private static float findMaxElevation(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float fR = j1.R(childAt);
                if (fR > f10) {
                    f10 = fR;
                }
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void clearView(View view) {
        int i10 = R.id.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i10);
        if (tag instanceof Float) {
            j1.N1(view, ((Float) tag).floatValue());
        }
        view.setTag(i10, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10) {
            int i11 = R.id.item_touch_helper_previous_elevation;
            if (view.getTag(i11) == null) {
                Float fValueOf = Float.valueOf(j1.R(view));
                j1.N1(view, findMaxElevation(recyclerView, view) + 1.0f);
                view.setTag(i11, fValueOf);
            }
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void onSelected(View view) {
    }
}
