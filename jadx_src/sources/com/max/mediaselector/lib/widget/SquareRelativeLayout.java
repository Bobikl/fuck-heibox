package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import bb.c;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class SquareRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f75590b;

    public SquareRelativeLayout(Context context) {
        this(context, null);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f75590b = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f74682n2, i10, 0);
            this.f75590b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SquareRelativeLayout_measureVertical, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Ta, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f75590b) {
            i10 = i11;
        }
        super.onMeasure(i10, i10);
    }
}
