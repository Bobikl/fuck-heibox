package com.donkingliang.consecutivescroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ConsecutiveViewPager2 extends FrameLayout implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f42354e = -123;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ViewPager2 f42355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RecyclerView f42356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42357d;

    public static class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<ConsecutiveViewPager2> f42358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f42359c;

        public a(ConsecutiveViewPager2 consecutiveViewPager2, View view) {
            this.f42358b = new WeakReference<>(consecutiveViewPager2);
            this.f42359c = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (this.f42358b.get() != null) {
                this.f42358b.get().f(this.f42359c);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public ConsecutiveViewPager2(@n0 Context context) {
        super(context);
        c(context);
    }

    public ConsecutiveViewPager2(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public ConsecutiveViewPager2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context);
    }

    private void c(Context context) {
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.f42355b = viewPager2;
        addView(viewPager2, -1, -1);
        this.f42356c = (RecyclerView) this.f42355b.getChildAt(0);
    }

    private boolean d() {
        ViewParent parent = getParent();
        if (!(parent instanceof ConsecutiveScrollerLayout)) {
            return false;
        }
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) parent;
        return consecutiveScrollerLayout.indexOfChild(this) == consecutiveScrollerLayout.getChildCount() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(View view) {
        View viewW;
        if (view == null || !(getParent() instanceof ConsecutiveScrollerLayout)) {
            return;
        }
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) getParent();
        int iIndexOfChild = consecutiveScrollerLayout.indexOfChild(this);
        if ((iIndexOfChild != consecutiveScrollerLayout.getChildCount() - 1 || getHeight() >= consecutiveScrollerLayout.getHeight() || consecutiveScrollerLayout.getScrollY() < consecutiveScrollerLayout.f42315o) && (viewW = consecutiveScrollerLayout.w()) != null) {
            int iIndexOfChild2 = consecutiveScrollerLayout.indexOfChild(viewW);
            if (iIndexOfChild < iIndexOfChild2) {
                consecutiveScrollerLayout.r0(view);
            } else if (iIndexOfChild > iIndexOfChild2) {
                consecutiveScrollerLayout.s0(view);
            }
        }
    }

    private void setAttachListener(View view) {
        if (view.getTag(f42354e) != null) {
            a aVar = (a) view.getTag(f42354e);
            if (aVar.f42358b.get() == null) {
                view.removeOnAttachStateChangeListener(aVar);
                view.setTag(f42354e, null);
            }
        }
        if (view.getTag(f42354e) == null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if ((layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) && ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).f42334a) {
                View.OnAttachStateChangeListener aVar2 = new a(this, view);
                view.addOnAttachStateChangeListener(aVar2);
                view.setTag(f42354e, aVar2);
            }
        }
    }

    protected View b(View view) {
        if (!(this.f42356c.getAdapter() instanceof FragmentStateAdapter) || !(view instanceof FrameLayout)) {
            return view;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return frameLayout.getChildCount() > 0 ? frameLayout.getChildAt(0) : view;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f42355b.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f42355b.canScrollVertically(i10);
    }

    public void e(@n0 ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f42355b.registerOnPageChangeCallback(onPageChangeCallback);
    }

    public void g(@n0 ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f42355b.unregisterOnPageChangeCallback(onPageChangeCallback);
    }

    @p0
    public RecyclerView.Adapter getAdapter() {
        return this.f42355b.getAdapter();
    }

    public int getAdjustHeight() {
        return this.f42357d;
    }

    public int getCurrentItem() {
        return this.f42355b.getCurrentItem();
    }

    @Override // com.donkingliang.consecutivescroller.c
    public View getCurrentScrollerView() {
        View viewB;
        int currentItem = getCurrentItem();
        RecyclerView.Adapter adapter = this.f42356c.getAdapter();
        RecyclerView.LayoutManager layoutManager = this.f42356c.getLayoutManager();
        if (adapter == null || layoutManager == null || currentItem < 0 || currentItem >= adapter.getItemCount()) {
            viewB = null;
        } else {
            viewB = b(layoutManager.findViewByPosition(currentItem));
            if (viewB != null) {
                setAttachListener(viewB);
            }
        }
        return viewB == null ? this.f42356c : viewB;
    }

    public int getOffscreenPageLimit() {
        return this.f42355b.getOffscreenPageLimit();
    }

    public int getOrientation() {
        return this.f42355b.getOrientation();
    }

    @Override // com.donkingliang.consecutivescroller.c
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.f42356c.getChildCount();
        if (childCount > 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                arrayList.add(b(this.f42356c.getChildAt(i10)));
            }
        }
        return arrayList;
    }

    public ViewPager2 getViewPager2() {
        return this.f42355b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!d() || this.f42357d <= 0) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.getDefaultSize(0, i11) - this.f42357d, View.MeasureSpec.getMode(i11)));
        }
    }

    public void setAdapter(@p0 RecyclerView.Adapter adapter) {
        this.f42355b.setAdapter(adapter);
    }

    public void setAdjustHeight(int i10) {
        if (this.f42357d != i10) {
            this.f42357d = i10;
            requestLayout();
        }
    }

    public void setCurrentItem(int i10) {
        this.f42355b.setCurrentItem(i10);
    }

    public void setCurrentItem(int i10, boolean z10) {
        this.f42355b.setCurrentItem(i10, z10);
    }

    public void setOffscreenPageLimit(int i10) {
        this.f42355b.setOffscreenPageLimit(i10);
    }

    public void setOrientation(int i10) {
        this.f42355b.setOrientation(i10);
    }
}
