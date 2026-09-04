package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class MaxHeightRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68545b;

    public MaxHeightRecyclerView(Context context) {
        super(context);
    }

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
    }

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.X7, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.S1);
        this.f68545b = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.MaxHeightRecyclerView_maxHeight, this.f68545b);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Y7, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int i12 = this.f68545b;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
    }
}
