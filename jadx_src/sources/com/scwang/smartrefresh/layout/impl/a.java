package com.scwang.smartrefresh.layout.impl;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.core.view.t0;
import androidx.core.view.x0;
import androidx.legacy.widget.Space;
import androidx.viewpager.widget.ViewPager;
import java.util.LinkedList;
import ng.e;
import ng.i;
import ng.k;

/* JADX INFO: compiled from: RefreshContentWrapper.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements e, pg.a, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f96752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected View f96753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected View f96754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected View f96755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected View f96756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f96757g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f96758h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f96759i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f96760j = new b();

    public a(@n0 View view) {
        this.f96754d = view;
        this.f96753c = view;
        this.f96752b = view;
    }

    @Override // ng.e
    public void a(boolean z10) {
        this.f96760j.f96763c = z10;
    }

    @Override // ng.e
    public void b(k kVar) {
        if (kVar instanceof b) {
            this.f96760j = (b) kVar;
        } else {
            this.f96760j.f96762b = kVar;
        }
    }

    @Override // ng.e
    public void c(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f96752b.getLeft(), -this.f96752b.getTop());
        View view = this.f96754d;
        View view2 = this.f96752b;
        if (view != view2) {
            this.f96754d = l(view2, pointF, view);
        }
        if (this.f96754d == this.f96752b) {
            this.f96760j.f96761a = null;
        } else {
            this.f96760j.f96761a = pointF;
        }
    }

    @Override // ng.e
    public ValueAnimator.AnimatorUpdateListener d(int i10) {
        View view = this.f96754d;
        if (view == null || i10 == 0) {
            return null;
        }
        if ((i10 >= 0 || !com.scwang.smartrefresh.layout.util.b.c(view, 1)) && (i10 <= 0 || !com.scwang.smartrefresh.layout.util.b.c(this.f96754d, -1))) {
            return null;
        }
        this.f96757g = i10;
        return this;
    }

    @Override // ng.e
    public void e(i iVar, View view, View view2) {
        k(this.f96752b, iVar);
        if (view == null && view2 == null) {
            return;
        }
        this.f96755e = view;
        this.f96756f = view2;
        FrameLayout frameLayout = new FrameLayout(this.f96752b.getContext());
        int iIndexOfChild = iVar.d().getLayout().indexOfChild(this.f96752b);
        iVar.d().getLayout().removeView(this.f96752b);
        frameLayout.addView(this.f96752b, 0, new ViewGroup.LayoutParams(-1, -1));
        iVar.d().getLayout().addView(frameLayout, iIndexOfChild, this.f96752b.getLayoutParams());
        this.f96752b = frameLayout;
        if (view != null) {
            view.setTag("fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = com.scwang.smartrefresh.layout.util.b.i(view);
            viewGroup.addView(new Space(this.f96752b.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag("fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = com.scwang.smartrefresh.layout.util.b.i(view2);
            viewGroup2.addView(new Space(this.f96752b.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    @Override // ng.e
    public void f(int i10, int i11, int i12) {
        boolean z10;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z11 = true;
        if (i11 == -1 || (viewFindViewById2 = this.f96753c.findViewById(i11)) == null) {
            z10 = false;
        } else if (i10 > 0) {
            viewFindViewById2.setTranslationY(i10);
            z10 = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z10 = false;
        }
        if (i12 == -1 || (viewFindViewById = this.f96753c.findViewById(i12)) == null) {
            z11 = z10;
        } else if (i10 < 0) {
            viewFindViewById.setTranslationY(i10);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z11 = z10;
        }
        if (z11) {
            this.f96753c.setTranslationY(0.0f);
        } else {
            this.f96753c.setTranslationY(i10);
        }
        View view = this.f96755e;
        if (view != null) {
            view.setTranslationY(Math.max(0, i10));
        }
        View view2 = this.f96756f;
        if (view2 != null) {
            view2.setTranslationY(Math.min(0, i10));
        }
    }

    @Override // ng.e
    public boolean g() {
        return this.f96759i && this.f96760j.a(this.f96752b);
    }

    @Override // ng.e
    @n0
    public View getView() {
        return this.f96752b;
    }

    @Override // ng.e
    @n0
    public View h() {
        return this.f96754d;
    }

    @Override // ng.e
    public boolean i() {
        return this.f96758h && this.f96760j.b(this.f96752b);
    }

    @Override // pg.a
    public void j(boolean z10, boolean z11) {
        this.f96758h = z10;
        this.f96759i = z11;
    }

    protected void k(View view, i iVar) {
        boolean zIsInEditMode = this.f96752b.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof x0) || (view2 instanceof t0))) {
                break;
            }
            view = m(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                com.scwang.smartrefresh.layout.util.a.a(view, iVar, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f96754d = view2;
        }
    }

    protected View l(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (com.scwang.smartrefresh.layout.util.b.h(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && com.scwang.smartrefresh.layout.util.b.f(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewL = l(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewL;
                }
            }
        }
        return view2;
    }

    protected View m(View view, boolean z10) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z10 || view3 != view) && com.scwang.smartrefresh.layout.util.b.f(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        linkedList.add(viewGroup.getChildAt(i10));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.f96757g) * this.f96754d.getScaleY();
            View view = this.f96754d;
            if (view instanceof AbsListView) {
                com.scwang.smartrefresh.layout.util.b.k((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f96757g = iIntValue;
    }
}
