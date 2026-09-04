package com.max.hbcustomview.recyclerview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class SlideHorRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f69212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f69213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewParent f69214d;

    public SlideHorRecyclerView(@n0 Context context) {
        super(context);
        this.f69212b = 0.0f;
        this.f69213c = 0.0f;
    }

    public SlideHorRecyclerView(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69212b = 0.0f;
        this.f69213c = 0.0f;
    }

    public SlideHorRecyclerView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69212b = 0.0f;
        this.f69213c = 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.Kl, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f69214d != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f69214d.requestDisallowInterceptTouchEvent(true);
                this.f69212b = motionEvent.getX();
                this.f69213c = motionEvent.getY();
            } else if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f10 = x10 - this.f69212b;
                if (Math.abs(f10) > Math.abs(y10 - this.f69213c)) {
                    View childAt = getChildAt(getChildCount() - 1);
                    View childAt2 = getChildAt(0);
                    if (childAt != null && childAt2 != null) {
                        int bindingAdapterPosition = ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).getBindingAdapterPosition();
                        int bindingAdapterPosition2 = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getBindingAdapterPosition();
                        Rect rect = new Rect();
                        childAt2.getLocalVisibleRect(rect);
                        Rect rect2 = new Rect();
                        childAt.getLocalVisibleRect(rect2);
                        if (bindingAdapterPosition == 0 && f10 > 0.0f && rect.left == 0) {
                            this.f69214d.requestDisallowInterceptTouchEvent(false);
                        } else if (bindingAdapterPosition2 == getAdapter().getItemCount() - 1 && f10 < 0.0f && rect2.right == childAt.getMeasuredWidth()) {
                            this.f69214d.requestDisallowInterceptTouchEvent(false);
                        } else {
                            this.f69214d.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                } else {
                    this.f69214d.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ViewParent getParentView() {
        return this.f69214d;
    }

    public void setParentView(ViewParent viewParent) {
        this.f69214d = viewParent;
    }
}
