package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.graphics.f0;
import androidx.core.util.o;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements com.google.android.material.carousel.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f53457k = "CarouselLayoutManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53460d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private com.google.android.material.carousel.b f53463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private com.google.android.material.carousel.d f53464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private com.google.android.material.carousel.c f53465i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53461e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f53462f = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53466j = 0;

    public class a extends LinearSmoothScroller {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i10) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return (int) (CarouselLayoutManager.this.f53458b - carouselLayoutManager.H(carouselLayoutManager.f53464h.f(), CarouselLayoutManager.this.getPosition(view)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        @p0
        public PointF computeScrollVectorForPosition(int i10) {
            if (CarouselLayoutManager.this.f53464h == null) {
                return null;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return new PointF(carouselLayoutManager.H(carouselLayoutManager.f53464h.f(), i10) - CarouselLayoutManager.this.f53458b, 0.0f);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f53468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f53469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        d f53470c;

        b(View view, float f10, d dVar) {
            this.f53468a = view;
            this.f53469b = f10;
            this.f53470c = dVar;
        }
    }

    public static class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f53471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<com.google.android.material.carousel.c.C0419c> f53472c;

        c() {
            Paint paint = new Paint();
            this.f53471b = paint;
            this.f53472c = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void a(List<com.google.android.material.carousel.c.C0419c> list) {
            this.f53472c = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@n0 Canvas canvas, @n0 RecyclerView recyclerView, @n0 RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.f53471b.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (com.google.android.material.carousel.c.C0419c c0419c : this.f53472c) {
                this.f53471b.setColor(f0.i(-65281, -16776961, c0419c.f53503c));
                canvas.drawLine(c0419c.f53502b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).G(), c0419c.f53502b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).D(), this.f53471b);
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.google.android.material.carousel.c.C0419c f53473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.android.material.carousel.c.C0419c f53474b;

        d(com.google.android.material.carousel.c.C0419c c0419c, com.google.android.material.carousel.c.C0419c c0419c2) {
            o.a(c0419c.f53501a <= c0419c2.f53501a);
            this.f53473a = c0419c;
            this.f53474b = c0419c2;
        }
    }

    public CarouselLayoutManager() {
        Q(new i());
    }

    private void A(RecyclerView.Recycler recycler, RecyclerView.State state) {
        P(recycler);
        if (getChildCount() == 0) {
            u(recycler, this.f53466j - 1);
            t(recycler, state, this.f53466j);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            u(recycler, position - 1);
            t(recycler, state, position2 + 1);
        }
        U();
    }

    private float B(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return rect.centerX();
    }

    private float C(float f10, d dVar) {
        com.google.android.material.carousel.c.C0419c c0419c = dVar.f53473a;
        float f11 = c0419c.f53504d;
        com.google.android.material.carousel.c.C0419c c0419c2 = dVar.f53474b;
        return com.google.android.material.animation.b.b(f11, c0419c2.f53504d, c0419c.f53502b, c0419c2.f53502b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D() {
        return getHeight() - getPaddingBottom();
    }

    private int E() {
        if (J()) {
            return 0;
        }
        return getWidth();
    }

    private int F() {
        if (J()) {
            return getWidth();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G() {
        return getPaddingTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H(com.google.android.material.carousel.c cVar, int i10) {
        return J() ? (int) (((g() - cVar.f().f53501a) - (i10 * cVar.d())) - (cVar.d() / 2.0f)) : (int) (((i10 * cVar.d()) - cVar.a().f53501a) + (cVar.d() / 2.0f));
    }

    private static d I(List<com.google.android.material.carousel.c.C0419c> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            com.google.android.material.carousel.c.C0419c c0419c = list.get(i14);
            float f15 = z10 ? c0419c.f53502b : c0419c.f53501a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d(list.get(i10), list.get(i12));
    }

    private boolean J() {
        return getLayoutDirection() == 1;
    }

    private boolean K(float f10, d dVar) {
        int iS = s((int) f10, (int) (C(f10, dVar) / 2.0f));
        if (J()) {
            if (iS < 0) {
                return true;
            }
        } else if (iS > g()) {
            return true;
        }
        return false;
    }

    private boolean L(float f10, d dVar) {
        int iR = r((int) f10, (int) (C(f10, dVar) / 2.0f));
        if (J()) {
            if (iR > g()) {
                return true;
            }
        } else if (iR < 0) {
            return true;
        }
        return false;
    }

    private void M() {
        if (this.f53461e && Log.isLoggable(f53457k, 3)) {
            Log.d(f53457k, "internal representation of views on the screen");
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                Log.d(f53457k, "item position " + getPosition(childAt) + ", center:" + B(childAt) + ", child index:" + i10);
            }
            Log.d(f53457k, "==============");
        }
    }

    private b N(RecyclerView.Recycler recycler, float f10, int i10) {
        float fD = this.f53465i.d() / 2.0f;
        View viewForPosition = recycler.getViewForPosition(i10);
        measureChildWithMargins(viewForPosition, 0, 0);
        float fR = r((int) f10, (int) fD);
        d dVarI = I(this.f53465i.e(), fR, false);
        float fV = v(viewForPosition, fR, dVarI);
        S(viewForPosition, fR, dVarI);
        return new b(viewForPosition, fV, dVarI);
    }

    private void O(View view, float f10, float f11, Rect rect) {
        float fR = r((int) f10, (int) f11);
        d dVarI = I(this.f53465i.e(), fR, false);
        float fV = v(view, fR, dVarI);
        S(view, fR, dVarI);
        super.getDecoratedBoundsWithMargins(view, rect);
        view.offsetLeftAndRight((int) (fV - (rect.left + f11)));
    }

    private void P(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float fB = B(childAt);
            if (!L(fB, I(this.f53465i.e(), fB, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float fB2 = B(childAt2);
            if (!K(fB2, I(this.f53465i.e(), fB2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void S(View view, float f10, d dVar) {
        if (view instanceof e) {
            com.google.android.material.carousel.c.C0419c c0419c = dVar.f53473a;
            float f11 = c0419c.f53503c;
            com.google.android.material.carousel.c.C0419c c0419c2 = dVar.f53474b;
            ((e) view).setMaskXPercentage(com.google.android.material.animation.b.b(f11, c0419c2.f53503c, c0419c.f53501a, c0419c2.f53501a, f10));
        }
    }

    private void T() {
        int i10 = this.f53460d;
        int i11 = this.f53459c;
        if (i10 <= i11) {
            this.f53465i = J() ? this.f53464h.h() : this.f53464h.g();
        } else {
            this.f53465i = this.f53464h.i(this.f53458b, i11, i10);
        }
        this.f53462f.a(this.f53465i.e());
    }

    private void U() {
        if (!this.f53461e || getChildCount() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i10));
            int i11 = i10 + 1;
            int position2 = getPosition(getChildAt(i11));
            if (position > position2) {
                M();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + position + "] and child at index [" + i11 + "] had adapter position [" + position2 + "].");
            }
            i10 = i11;
        }
    }

    private void q(View view, int i10, float f10) {
        float fD = this.f53465i.d() / 2.0f;
        addView(view, i10);
        layoutDecoratedWithMargins(view, (int) (f10 - fD), G(), (int) (f10 + fD), D());
    }

    private int r(int i10, int i11) {
        return J() ? i10 - i11 : i10 + i11;
    }

    private int s(int i10, int i11) {
        return J() ? i10 + i11 : i10 - i11;
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        int iY = y(i10, this.f53458b, this.f53459c, this.f53460d);
        this.f53458b += iY;
        T();
        float fD = this.f53465i.d() / 2.0f;
        int iW = w(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            O(getChildAt(i11), iW, fD, rect);
            iW = r(iW, (int) this.f53465i.d());
        }
        A(recycler, state);
        return iY;
    }

    private void t(RecyclerView.Recycler recycler, RecyclerView.State state, int i10) {
        int iW = w(i10);
        while (i10 < state.getItemCount()) {
            b bVarN = N(recycler, iW, i10);
            if (K(bVarN.f53469b, bVarN.f53470c)) {
                return;
            }
            iW = r(iW, (int) this.f53465i.d());
            if (!L(bVarN.f53469b, bVarN.f53470c)) {
                q(bVarN.f53468a, -1, bVarN.f53469b);
            }
            i10++;
        }
    }

    private void u(RecyclerView.Recycler recycler, int i10) {
        int iW = w(i10);
        while (i10 >= 0) {
            b bVarN = N(recycler, iW, i10);
            if (L(bVarN.f53469b, bVarN.f53470c)) {
                return;
            }
            iW = s(iW, (int) this.f53465i.d());
            if (!K(bVarN.f53469b, bVarN.f53470c)) {
                q(bVarN.f53468a, 0, bVarN.f53469b);
            }
            i10--;
        }
    }

    private float v(View view, float f10, d dVar) {
        com.google.android.material.carousel.c.C0419c c0419c = dVar.f53473a;
        float f11 = c0419c.f53502b;
        com.google.android.material.carousel.c.C0419c c0419c2 = dVar.f53474b;
        float fB = com.google.android.material.animation.b.b(f11, c0419c2.f53502b, c0419c.f53501a, c0419c2.f53501a, f10);
        if (dVar.f53474b != this.f53465i.c() && dVar.f53473a != this.f53465i.h()) {
            return fB;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float fD = (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) / this.f53465i.d();
        com.google.android.material.carousel.c.C0419c c0419c3 = dVar.f53474b;
        return fB + ((f10 - c0419c3.f53501a) * ((1.0f - c0419c3.f53503c) + fD));
    }

    private int w(int i10) {
        return r(F() - this.f53458b, (int) (this.f53465i.d() * i10));
    }

    private int x(RecyclerView.State state, com.google.android.material.carousel.d dVar) {
        boolean zJ = J();
        com.google.android.material.carousel.c cVarG = zJ ? dVar.g() : dVar.h();
        com.google.android.material.carousel.c.C0419c c0419cA = zJ ? cVarG.a() : cVarG.f();
        float itemCount = (((state.getItemCount() - 1) * cVarG.d()) + getPaddingEnd()) * (zJ ? -1.0f : 1.0f);
        float F = c0419cA.f53501a - F();
        float fE = E() - c0419cA.f53501a;
        if (Math.abs(F) > Math.abs(itemCount)) {
            return 0;
        }
        return (int) ((itemCount - F) + fE);
    }

    private static int y(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    private int z(com.google.android.material.carousel.d dVar) {
        boolean zJ = J();
        com.google.android.material.carousel.c cVarH = zJ ? dVar.h() : dVar.g();
        return (int) (((getPaddingStart() * (zJ ? 1 : -1)) + F()) - s((int) (zJ ? cVarH.f() : cVarH.a()).f53501a, (int) (cVarH.d() / 2.0f)));
    }

    public void Q(@n0 com.google.android.material.carousel.b bVar) {
        this.f53463g = bVar;
        this.f53464h = null;
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void R(@n0 RecyclerView recyclerView, boolean z10) {
        this.f53461e = z10;
        recyclerView.removeItemDecoration(this.f53462f);
        if (z10) {
            recyclerView.addItemDecoration(this.f53462f);
        }
        recyclerView.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@n0 RecyclerView.State state) {
        return (int) this.f53464h.f().d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@n0 RecyclerView.State state) {
        return this.f53458b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@n0 RecyclerView.State state) {
        return this.f53460d - this.f53459c;
    }

    @Override // com.google.android.material.carousel.a
    public int g() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@n0 View view, @n0 Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterX = rect.centerX();
        float fWidth = (rect.width() - C(fCenterX, I(this.f53465i.e(), fCenterX, true))) / 2.0f;
        rect.set((int) (rect.left + fWidth), rect.top, (int) (rect.right - fWidth), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@n0 View view, int i10, int i11) {
        if (!(view instanceof e)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        com.google.android.material.carousel.d dVar = this.f53464h;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i12, (int) (dVar != null ? dVar.f().d() : ((ViewGroup.MarginLayoutParams) layoutParams).width), canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@n0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0) {
            removeAndRecycleAllViews(recycler);
            this.f53466j = 0;
            return;
        }
        boolean zJ = J();
        boolean z10 = this.f53464h == null;
        if (z10) {
            View viewForPosition = recycler.getViewForPosition(0);
            measureChildWithMargins(viewForPosition, 0, 0);
            com.google.android.material.carousel.c cVarB = this.f53463g.b(this, viewForPosition);
            if (zJ) {
                cVarB = com.google.android.material.carousel.c.j(cVarB);
            }
            this.f53464h = com.google.android.material.carousel.d.e(this, cVarB);
        }
        int iZ = z(this.f53464h);
        int iX = x(state, this.f53464h);
        int i10 = zJ ? iX : iZ;
        this.f53459c = i10;
        if (zJ) {
            iX = iZ;
        }
        this.f53460d = iX;
        if (z10) {
            this.f53458b = iZ;
        } else {
            int i11 = this.f53458b;
            this.f53458b = i11 + y(0, i11, i10, iX);
        }
        this.f53466j = a2.a.e(this.f53466j, 0, state.getItemCount());
        T();
        detachAndScrapAttachedViews(recycler);
        A(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.f53466j = 0;
        } else {
            this.f53466j = getPosition(getChildAt(0));
        }
        U();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@n0 RecyclerView recyclerView, @n0 View view, @n0 Rect rect, boolean z10, boolean z11) {
        com.google.android.material.carousel.d dVar = this.f53464h;
        if (dVar == null) {
            return false;
        }
        int iH = H(dVar.f(), getPosition(view)) - this.f53458b;
        if (z11 || iH == 0) {
            return false;
        }
        recyclerView.scrollBy(iH, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i10, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        com.google.android.material.carousel.d dVar = this.f53464h;
        if (dVar == null) {
            return;
        }
        this.f53458b = H(dVar.f(), i10);
        this.f53466j = a2.a.e(i10, 0, Math.max(0, getItemCount() - 1));
        T();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i10);
        startSmoothScroll(aVar);
    }
}
