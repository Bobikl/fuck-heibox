package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.f1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import j9.a;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@n0 Context context) {
        this(context, null);
    }

    public MaterialTextView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(a.c(context, attributeSet, i10, 0), attributeSet, i10);
        i(attributeSet, i10, 0);
    }

    @Deprecated
    public MaterialTextView(@n0 Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(a.c(context, attributeSet, i10, i11), attributeSet, i10);
        i(attributeSet, i10, i11);
    }

    private void f(@n0 Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, com.google.android.material.R.styleable.G0);
        int iJ = j(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextAppearance_android_lineHeight, com.google.android.material.R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (iJ >= 0) {
            setLineHeight(iJ);
        }
    }

    private static boolean g(Context context) {
        return b.b(context, com.google.android.material.R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int h(@n0 Resources.Theme theme, @p0 AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.H0, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void i(@p0 AttributeSet attributeSet, int i10, int i11) {
        int iH;
        Context context = getContext();
        if (g(context)) {
            Resources.Theme theme = context.getTheme();
            if (k(context, theme, attributeSet, i10, i11) || (iH = h(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            f(theme, iH);
        }
    }

    private static int j(@n0 Context context, @n0 TypedArray typedArray, @f1 @n0 int... iArr) {
        int iD = -1;
        for (int i10 = 0; i10 < iArr.length && iD < 0; i10++) {
            iD = c.d(context, typedArray, iArr[i10], -1);
        }
        return iD;
    }

    private static boolean k(@n0 Context context, @n0 Resources.Theme theme, @p0 AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.H0, i10, i11);
        int iJ = j(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialTextView_android_lineHeight, com.google.android.material.R.styleable.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return iJ != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@n0 Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (g(context)) {
            f(context.getTheme(), i10);
        }
    }
}
