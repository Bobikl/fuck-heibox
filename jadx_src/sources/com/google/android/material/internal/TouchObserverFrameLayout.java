package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TouchObserverFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private View.OnTouchListener f54413b;

    public TouchObserverFrameLayout(@n0 Context context) {
        super(context);
    }

    public TouchObserverFrameLayout(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchObserverFrameLayout(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f54413b;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnTouchListener(@p0 View.OnTouchListener onTouchListener) {
        this.f54413b = onTouchListener;
    }
}
