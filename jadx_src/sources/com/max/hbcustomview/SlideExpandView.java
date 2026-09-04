package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SlideExpandView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SlideExpandView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private View f68905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private View f68906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f68908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f68909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f68910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f68912i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlideExpandView(@dl.d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlideExpandView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlideExpandView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideExpandView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.U2);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i12 = R.styleable.SlideExpandView_normal_height;
        ic.a aVar = ic.a.f119343a;
        this.f68907d = (int) typedArrayObtainStyledAttributes.getDimension(i12, (aVar.c(context) * 2) / 3.0f);
        this.f68908e = aVar.c(context);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32691yc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f68910g = false;
        View view = this.f68906c;
        if (view != null) {
            int iE = ic.a.f119343a.e(view);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(200L);
            TransitionManager.beginDelayedTransition(this, autoTransition);
            int i10 = this.f68907d;
            int i11 = iE - i10;
            int i12 = this.f68908e;
            if (i11 < i12 - iE) {
                this.f68909f = false;
            } else {
                this.f68909f = true;
                i10 = i12;
            }
            setTargetHeight(i10);
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32669xc, new Class[]{MotionEvent.class}, Void.TYPE).isSupported || !this.f68910g || this.f68906c == null) {
            return;
        }
        setTargetHeight(Math.min(this.f68908e, Math.max(this.f68907d, this.f68912i + ((int) (this.f68911h - motionEvent.getY())))));
        this.f68911h = (int) motionEvent.getY();
    }

    private final void setTargetHeight(int i10) {
        View view;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32713zc, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (view = this.f68906c) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i10;
        }
        view.requestLayout();
        this.f68912i = i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@dl.e MotionEvent motionEvent) {
        ViewParent parent;
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32625vc, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z10 = true;
        }
        if (z10) {
            View view = this.f68905b;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            ic.a aVar = ic.a.f119343a;
            Context context = getContext();
            f0.o(context, "getContext(...)");
            boolean zF = com.max.hbcustomview.swipebacklayout.e.f(view, rawX, rawY, aVar.b(context, 15));
            this.f68910g = zF;
            if (zF && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            Log.d("SlideExpandView", "anchorTarget: " + this.f68910g);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @dl.e
    public final View getAnchorView() {
        return this.f68905b;
    }

    @dl.e
    public final View getChangeView() {
        return this.f68906c;
    }

    public final boolean getExpand() {
        return this.f68909f;
    }

    public final int getLastHeight() {
        return this.f68912i;
    }

    public final int getLastY() {
        return this.f68911h;
    }

    public final int getMaxHeight() {
        return this.f68908e;
    }

    public final int getNormalHeight() {
        return this.f68907d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@dl.e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.f32647wc, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Log.d("SlideExpandView", "onTouchEvent " + motionEvent);
        if (this.f68905b != null && this.f68906c != null) {
            if (motionEvent == null) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f68911h = (int) motionEvent.getY();
            } else if (action == 1) {
                a();
            } else if (action == 2) {
                b(motionEvent);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAnchorView(@dl.e View view) {
        this.f68905b = view;
    }

    public final void setChangeView(@dl.e View view) {
        this.f68906c = view;
    }

    public final void setExpand(boolean z10) {
        this.f68909f = z10;
    }

    public final void setLastHeight(int i10) {
        this.f68912i = i10;
    }

    public final void setLastY(int i10) {
        this.f68911h = i10;
    }

    public final void setMaxHeight(int i10) {
        this.f68908e = i10;
    }

    public final void setNormalHeight(int i10) {
        this.f68907d = i10;
    }
}
