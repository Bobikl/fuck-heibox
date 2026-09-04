package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.i;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.animation.k;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private Map<View, Integer> f55884q;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void m0(@n0 View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f55884q = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (z10) {
                        this.f55884q.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        j1.R1(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f55884q;
                        if (map != null && map.containsKey(childAt)) {
                            j1.R1(childAt, this.f55884q.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z10) {
                return;
            }
            this.f55884q = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean N(@n0 View view, @n0 View view2, boolean z10, boolean z11) {
        m0(view2, z10);
        return super.N(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @n0
    protected FabTransformationBehavior.e k0(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f55873a = com.google.android.material.animation.i.d(context, i10);
        eVar.f55874b = new k(17, 0.0f, 0.0f);
        return eVar;
    }
}
