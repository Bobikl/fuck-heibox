package com.max.hbview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBScrollView.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class HBScrollView extends ScrollView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f73757b;

    public HBScrollView(@e Context context) {
        super(context);
        this.f73757b = -1.0f;
    }

    public HBScrollView(@e Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73757b = -1.0f;
        a(attributeSet);
    }

    public HBScrollView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f73757b = -1.0f;
        a(attributeSet);
    }

    public HBScrollView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f73757b = -1.0f;
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, c.k.Ax, new Class[]{AttributeSet.class}, Void.TYPE).isSupported || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f73786j0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f73757b = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBScrollView_maxHeight, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float getMaxHeight() {
        return this.f73757b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.k.Bx, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = this.f73757b;
        if (f10 > 0.0f) {
            i11 = View.MeasureSpec.makeMeasureSpec((int) f10, Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
    }

    public final void setMaxHeight(float f10) {
        this.f73757b = f10;
    }
}
