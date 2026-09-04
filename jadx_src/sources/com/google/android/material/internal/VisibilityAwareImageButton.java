package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54421b;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f54421b = getVisibility();
    }

    public final void c(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f54421b = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f54421b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        c(i10, true);
    }
}
