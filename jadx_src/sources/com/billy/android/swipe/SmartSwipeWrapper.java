package com.billy.android.swipe;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SmartSwipeWrapper extends ViewGroup {
    private static final int NESTED_TYPE_INVALID = -1;
    private Boolean flyToClose;
    private Boolean flyToOpen;
    protected final List<f> mConsumers;
    protected View mContentView;
    protected int mCurNestedType;
    protected com.billy.android.swipe.internal.b mHelper;
    protected final List<com.billy.android.swipe.internal.b> mHelpers;
    protected boolean mInflateFromXml;
    protected boolean mIsNestedScrollingEnabled;
    private final ArrayList<View> mMatchParentChildren;
    protected boolean mNestedFlyConsumed;
    protected boolean mNestedInProgress;
    protected int[] mParentOffsetInWindow;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40303b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40304a;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f40304a = 0;
        }

        public LayoutParams(int i10, int i11, int i12) {
            super(i10, i11);
            this.f40304a = i12;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f40304a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f40302a);
            this.f40304a = typedArrayObtainStyledAttributes.getInt(R.styleable.SmartSwipeWrapper_Layout_swipe_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f40304a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f40304a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f40304a = 0;
            this.f40304a = layoutParams.f40304a;
        }
    }

    public SmartSwipeWrapper(Context context) {
        this(context, null, 0);
    }

    public SmartSwipeWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SmartSwipeWrapper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHelpers = new LinkedList();
        this.mConsumers = new LinkedList();
        this.mIsNestedScrollingEnabled = true;
        this.mMatchParentChildren = new ArrayList<>(1);
        this.mCurNestedType = -1;
        this.mParentOffsetInWindow = new int[2];
        init();
    }

    @TargetApi(21)
    public SmartSwipeWrapper(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mHelpers = new LinkedList();
        this.mConsumers = new LinkedList();
        this.mIsNestedScrollingEnabled = true;
        this.mMatchParentChildren = new ArrayList<>(1);
        this.mCurNestedType = -1;
        this.mParentOffsetInWindow = new int[2];
        init();
    }

    private void wrapperNestedScroll(int i10, int i11, int[] iArr, int i12) {
        if (this.mCurNestedType == -1) {
            this.mCurNestedType = i12;
            this.mNestedFlyConsumed = false;
            this.flyToClose = null;
            this.flyToOpen = null;
        }
        boolean z10 = i12 == 1;
        com.billy.android.swipe.internal.b bVar = this.mHelper;
        if (bVar == null) {
            for (com.billy.android.swipe.internal.b bVar2 : this.mHelpers) {
                if (bVar2 != null) {
                    if (bVar2.C(-i10, -i11, i12 == 1)) {
                        this.mHelper = bVar2;
                        return;
                    }
                }
            }
            return;
        }
        f fVarW = bVar.w();
        float fB0 = fVarW.b0() + 1.0f;
        if (!z10) {
            this.mHelper.A(-i10, -i11, iArr, false);
            if (fVarW.c0() >= fB0 || fVarW.c0() <= 0.0f) {
                this.mHelper = null;
                return;
            }
            return;
        }
        if (this.flyToOpen == null) {
            int iT = fVarW.T();
            if (iT == 1) {
                this.flyToOpen = Boolean.valueOf(i10 < 0);
                this.flyToClose = Boolean.valueOf(i10 > 0);
                if (i10 == 0) {
                    return;
                }
            } else if (iT == 2) {
                this.flyToOpen = Boolean.valueOf(i10 > 0);
                this.flyToClose = Boolean.valueOf(i10 < 0);
                if (i10 == 0) {
                    return;
                }
            } else if (iT == 4) {
                this.flyToOpen = Boolean.valueOf(i11 < 0);
                this.flyToClose = Boolean.valueOf(i11 > 0);
                if (i11 == 0) {
                    return;
                }
            } else if (iT != 8) {
                Boolean bool = Boolean.FALSE;
                this.flyToClose = bool;
                this.flyToOpen = bool;
            } else {
                this.flyToOpen = Boolean.valueOf(i11 > 0);
                this.flyToClose = Boolean.valueOf(i11 < 0);
                if (i11 == 0) {
                    return;
                }
            }
        }
        if (this.mNestedFlyConsumed) {
            return;
        }
        this.mHelper.A(-i10, -i11, iArr, true);
        if ((!this.flyToOpen.booleanValue() || fVarW.c0() < fB0) && (!this.flyToClose.booleanValue() || fVarW.c0() > 0.0f)) {
            return;
        }
        this.mNestedFlyConsumed = true;
        this.mHelper.B();
    }

    public <T extends f> T addConsumer(T t10) {
        if (t10 != null) {
            this.mConsumers.add(t10);
            com.billy.android.swipe.internal.b bVarG0 = t10.g0();
            if (bVarG0 == null) {
                bVarG0 = com.billy.android.swipe.internal.b.l(this, t10.e0(), t10, t10.Y());
            }
            t10.e1(this, bVarG0);
            this.mHelpers.add(bVarG0);
        }
        return t10;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mHelpers.isEmpty()) {
            return;
        }
        boolean z10 = false;
        Iterator<com.billy.android.swipe.internal.b> it = this.mHelpers.iterator();
        while (it.hasNext()) {
            if (it.next().j()) {
                z10 = true;
            }
        }
        if (z10) {
            com.billy.android.swipe.internal.d.i(this);
        }
    }

    public void consumeInflateFromXml() {
        this.mInflateFromXml = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        for (f fVar : this.mConsumers) {
            if (fVar != null) {
                fVar.s(canvas);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return super.dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return super.dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return super.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return dispatchNestedScroll(i10, i11, i12, i13, iArr, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return super.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mHelper = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void drawChild(Canvas canvas, View view) {
        drawChild(canvas, view, getDrawingTime());
    }

    public SmartSwipeWrapper enableDirection(int i10) {
        return enableDirection(i10, true);
    }

    public SmartSwipeWrapper enableDirection(int i10, boolean z10) {
        Iterator<f> it = this.mConsumers.iterator();
        while (it.hasNext()) {
            it.next().w(i10, z10);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public List<f> getAllConsumers() {
        return this.mConsumers;
    }

    public f getConsumerByType(Class<? extends f> cls) {
        for (f fVar : this.mConsumers) {
            if (fVar != null && fVar.getClass() == cls) {
                return fVar;
            }
        }
        return null;
    }

    public View getContentView() {
        return this.mContentView;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean hasNestedScrollingParent(int i10) {
        return super.hasNestedScrollingParent();
    }

    protected void helperOnNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        super.onNestedPreScroll(view, i10, i11, iArr);
    }

    protected void helperOnNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        dispatchNestedScroll(i10, i11, i12, i13, this.mParentOffsetInWindow);
    }

    protected void helperOnNestedScrollAccepted(View view, View view2, int i10, int i11) {
        super.onNestedScrollAccepted(view, view2, i10);
    }

    protected void helperOnStopNestedScroll(View view, int i10) {
        super.onStopNestedScroll(view);
    }

    protected void init() {
    }

    public boolean isInflateFromXml() {
        return this.mInflateFromXml;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setNestedScrollingEnabled(this.mIsNestedScrollingEnabled);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<f> it = this.mConsumers.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (f fVar : this.mConsumers) {
            if (fVar != null) {
                fVar.i1(canvas);
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mInflateFromXml = true;
        int childCount = getChildCount();
        if (childCount <= 0 || this.mContentView != null) {
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).f40304a == 0) {
                setContentView(childAt);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mNestedInProgress) {
            com.billy.android.swipe.internal.b bVar = this.mHelper;
            if (bVar != null) {
                return bVar.N(motionEvent);
            }
            for (com.billy.android.swipe.internal.b bVar2 : this.mHelpers) {
                if (bVar2.N(motionEvent)) {
                    this.mHelper = bVar2;
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zJ1;
        View view;
        com.billy.android.swipe.internal.b bVar = this.mHelper;
        if (bVar != null) {
            zJ1 = bVar.w().j1(z10, i10, i11, i12, i13);
        } else {
            boolean z11 = false;
            for (f fVar : this.mConsumers) {
                if (fVar != null && fVar.j1(z10, i10, i11, i12, i13)) {
                    z11 = true;
                }
            }
            zJ1 = z11;
        }
        if (zJ1 || (view = this.mContentView) == null) {
            return;
        }
        view.layout(0, 0, view.getMeasuredWidth(), this.mContentView.getMeasuredHeight());
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int childMeasureSpec;
        int childCount = getChildCount();
        boolean z10 = (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) ? false : true;
        this.mMatchParentChildren.clear();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            childAt.measure(ViewGroup.getChildMeasureSpec(i10, 0, layoutParams.width), ViewGroup.getChildMeasureSpec(i11, 0, layoutParams.height));
            iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
            iMax = Math.max(iMax, childAt.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            if (z10 && (layoutParams.width == -1 || layoutParams.height == -1)) {
                this.mMatchParentChildren.add(childAt);
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates << 16));
        int size = this.mMatchParentChildren.size();
        if (size > 1) {
            for (int i14 = 0; i14 < size; i14++) {
                View view = this.mMatchParentChildren.get(i14);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int i15 = layoutParams2.width;
                if (i15 == -1) {
                    i12 = 1073741824;
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, getMeasuredWidth()), 1073741824);
                } else {
                    i12 = 1073741824;
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, 0, i15);
                }
                int i16 = layoutParams2.height;
                view.measure(childMeasureSpec, i16 == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, getMeasuredHeight()), i12) : ViewGroup.getChildMeasureSpec(i11, 0, i16));
            }
        }
        for (f fVar : this.mConsumers) {
            if (fVar != null) {
                fVar.k1(i10, i11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return super.onNestedFling(view, f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return super.onNestedPreFling(view, f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        int i14;
        boolean z10;
        com.billy.android.swipe.internal.b bVar = this.mHelper;
        if (bVar == null || bVar.w().c0() == 0.0f) {
            Arrays.fill(iArr, 0);
            helperOnNestedPreScroll(view, i10, i11, iArr, i12);
            i13 = iArr[0] + 0;
            i14 = iArr[1] + 0;
            z10 = true;
        } else {
            i13 = 0;
            i14 = 0;
            z10 = false;
        }
        com.billy.android.swipe.internal.b bVar2 = this.mHelper;
        if (bVar2 != null && bVar2.w().T() != 0) {
            Arrays.fill(iArr, 0);
            wrapperNestedScroll(i10 - i13, i11 - i14, iArr, i12);
            i13 -= iArr[0];
            i14 -= iArr[1];
        }
        int i15 = i13;
        int i16 = i14;
        if (!z10) {
            Arrays.fill(iArr, 0);
            helperOnNestedPreScroll(view, i10 - i15, i11 - i16, iArr, i12);
            i15 += iArr[0];
            i16 += iArr[1];
        }
        iArr[0] = i15;
        iArr[1] = i16;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i10, i11, i12, i13, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        helperOnNestedScroll(view, i10, i11, i12, i13, i14);
        int[] iArr = this.mParentOffsetInWindow;
        int i15 = i12 + iArr[0];
        int i16 = i13 + iArr[1];
        if (i15 == 0 && i16 == 0) {
            return;
        }
        if (i14 == 1) {
            requestDisallowInterceptTouchEvent(false);
        }
        wrapperNestedScroll(i15, i16, new int[2], i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.mNestedInProgress = true;
        this.mNestedFlyConsumed = false;
        this.flyToClose = null;
        this.flyToOpen = null;
        this.mCurNestedType = i11;
        helperOnNestedScrollAccepted(view, view2, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0040  */
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        boolean z10;
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 1) != 0;
        for (f fVar : this.mConsumers) {
            int iT = fVar.T();
            if (iT != 0) {
                if ((z12 && (iT == 1 || iT == 2)) || (z11 && (iT == 4 || iT == 8))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if ((z12 && (fVar.y0() || fVar.E0())) || (z11 && (fVar.H0() || fVar.p0()))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                startNestedScroll(i10, i11);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onStopNestedScroll(View view, int i10) {
        this.mNestedInProgress = false;
        helperOnStopNestedScroll(view, i10);
        if (i10 == this.mCurNestedType) {
            this.mCurNestedType = -1;
            com.billy.android.swipe.internal.b bVar = this.mHelper;
            if (bVar != null) {
                bVar.B();
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mNestedInProgress) {
            return super.onTouchEvent(motionEvent);
        }
        com.billy.android.swipe.internal.b bVar = this.mHelper;
        if (bVar == null) {
            for (com.billy.android.swipe.internal.b bVar2 : this.mHelpers) {
                bVar2.D(motionEvent);
                if (bVar2.t() == 1) {
                    this.mHelper = bVar2;
                    break;
                }
            }
        } else {
            bVar.D(motionEvent);
        }
        return true;
    }

    public SmartSwipeWrapper removeAllConsumers() {
        Iterator<f> it = this.mConsumers.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            if (next != null) {
                next.g1();
                com.billy.android.swipe.internal.b bVarG0 = next.g0();
                this.mHelpers.remove(bVarG0);
                if (this.mHelper == bVarG0) {
                    this.mHelper = null;
                }
            }
        }
        return this;
    }

    public SmartSwipeWrapper removeConsumer(f fVar) {
        if (this.mConsumers.remove(fVar)) {
            fVar.g1();
            com.billy.android.swipe.internal.b bVarG0 = fVar.g0();
            this.mHelpers.remove(bVarG0);
            if (this.mHelper == bVarG0) {
                this.mHelper = null;
            }
        }
        return this;
    }

    public void setContentView(View view) {
        if (view == null || this.mContentView == view) {
            return;
        }
        this.mContentView = view;
        if (view.getParent() == null) {
            addView(view);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.mIsNestedScrollingEnabled = z10;
        super.setNestedScrollingEnabled(z10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return startNestedScroll(i10, 0);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return super.startNestedScroll(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public void stopNestedScroll(int i10) {
        super.stopNestedScroll();
    }
}
