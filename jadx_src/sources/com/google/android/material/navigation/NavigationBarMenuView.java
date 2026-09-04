package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.core.view.j1;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import androidx.transition.v;
import com.google.android.material.animation.b;
import com.google.android.material.internal.a0;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarMenuView extends ViewGroup implements n {
    private static final int E = 5;
    private static final int F = -1;
    private static final int[] G = {R.attr.state_checked};
    private static final int[] H = {-16842910};
    private boolean A;
    private ColorStateList B;
    private NavigationBarPresenter C;
    private g D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final TransitionSet f54629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final View.OnClickListener f54630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.util.n.a<NavigationBarItemView> f54631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final SparseArray<View.OnTouchListener> f54632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private NavigationBarItemView[] f54634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private ColorStateList f54637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @r
    private int f54638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f54639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final ColorStateList f54640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e1
    private int f54641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @e1
    private int f54642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f54643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private ColorStateList f54644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f54645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @n0
    private final SparseArray<com.google.android.material.badge.a> f54646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f54647t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f54648u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f54649v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f54650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f54651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f54652y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p f54653z;

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j itemData = ((NavigationBarItemView) view).getItemData();
            if (NavigationBarMenuView.this.D.P(itemData, NavigationBarMenuView.this.C, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public NavigationBarMenuView(@n0 Context context) {
        super(context);
        this.f54631d = new androidx.core.util.n.c(5);
        this.f54632e = new SparseArray<>(5);
        this.f54635h = 0;
        this.f54636i = 0;
        this.f54646s = new SparseArray<>(5);
        this.f54647t = -1;
        this.f54648u = -1;
        this.A = false;
        this.f54640m = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f54629b = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f54629b = autoTransition;
            autoTransition.c1(0);
            autoTransition.w0(i9.a.f(getContext(), com.google.android.material.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            autoTransition.y0(i9.a.g(getContext(), com.google.android.material.R.attr.motionEasingStandard, b.f52897b));
            autoTransition.N0(new a0());
        }
        this.f54630c = new a();
        j1.R1(this, 1);
    }

    @p0
    private Drawable f() {
        if (this.f54653z == null || this.B == null) {
            return null;
        }
        k kVar = new k(this.f54653z);
        kVar.o0(this.B);
        return kVar;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemViewA = this.f54631d.a();
        return navigationBarItemViewA == null ? g(getContext()) : navigationBarItemViewA;
    }

    private boolean m(int i10) {
        return i10 != -1;
    }

    private void o() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            hashSet.add(Integer.valueOf(this.D.getItem(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f54646s.size(); i11++) {
            int iKeyAt = this.f54646s.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f54646s.delete(iKeyAt);
            }
        }
    }

    private void s(int i10) {
        if (m(i10)) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }

    private void setBadgeIfNeeded(@n0 NavigationBarItemView navigationBarItemView) {
        com.google.android.material.badge.a aVar;
        int id2 = navigationBarItemView.getId();
        if (m(id2) && (aVar = this.f54646s.get(id2)) != null) {
            navigationBarItemView.setBadge(aVar);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(@n0 g gVar) {
        this.D = gVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void d() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f54631d.b(navigationBarItemView);
                    navigationBarItemView.i();
                }
            }
        }
        if (this.D.size() == 0) {
            this.f54635h = 0;
            this.f54636i = 0;
            this.f54634g = null;
            return;
        }
        o();
        this.f54634g = new NavigationBarItemView[this.D.size()];
        boolean zL = l(this.f54633f, this.D.H().size());
        for (int i10 = 0; i10 < this.D.size(); i10++) {
            this.C.n(true);
            this.D.getItem(i10).setCheckable(true);
            this.C.n(false);
            NavigationBarItemView newItem = getNewItem();
            this.f54634g[i10] = newItem;
            newItem.setIconTintList(this.f54637j);
            newItem.setIconSize(this.f54638k);
            newItem.setTextColor(this.f54640m);
            newItem.setTextAppearanceInactive(this.f54641n);
            newItem.setTextAppearanceActive(this.f54642o);
            newItem.setTextColor(this.f54639l);
            int i11 = this.f54647t;
            if (i11 != -1) {
                newItem.setItemPaddingTop(i11);
            }
            int i12 = this.f54648u;
            if (i12 != -1) {
                newItem.setItemPaddingBottom(i12);
            }
            newItem.setActiveIndicatorWidth(this.f54650w);
            newItem.setActiveIndicatorHeight(this.f54651x);
            newItem.setActiveIndicatorMarginHorizontal(this.f54652y);
            newItem.setActiveIndicatorDrawable(f());
            newItem.setActiveIndicatorResizeable(this.A);
            newItem.setActiveIndicatorEnabled(this.f54649v);
            Drawable drawable = this.f54643p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f54645r);
            }
            newItem.setItemRippleColor(this.f54644q);
            newItem.setShifting(zL);
            newItem.setLabelVisibilityMode(this.f54633f);
            j jVar = (j) this.D.getItem(i10);
            newItem.d(jVar, 0);
            newItem.setItemPosition(i10);
            int itemId = jVar.getItemId();
            newItem.setOnTouchListener(this.f54632e.get(itemId));
            newItem.setOnClickListener(this.f54630c);
            int i13 = this.f54635h;
            if (i13 != 0 && itemId == i13) {
                this.f54636i = i10;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.D.size() - 1, this.f54636i);
        this.f54636i = iMin;
        this.D.getItem(iMin).setChecked(true);
    }

    @p0
    public ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = b0.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = H;
        return new ColorStateList(new int[][]{iArr, G, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    @n0
    protected abstract NavigationBarItemView g(@n0 Context context);

    SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.f54646s;
    }

    @p0
    public ColorStateList getIconTintList() {
        return this.f54637j;
    }

    @p0
    public ColorStateList getItemActiveIndicatorColor() {
        return this.B;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f54649v;
    }

    @t0
    public int getItemActiveIndicatorHeight() {
        return this.f54651x;
    }

    @t0
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f54652y;
    }

    @p0
    public p getItemActiveIndicatorShapeAppearance() {
        return this.f54653z;
    }

    @t0
    public int getItemActiveIndicatorWidth() {
        return this.f54650w;
    }

    @p0
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.f54643p : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f54645r;
    }

    @r
    public int getItemIconSize() {
        return this.f54638k;
    }

    @t0
    public int getItemPaddingBottom() {
        return this.f54648u;
    }

    @t0
    public int getItemPaddingTop() {
        return this.f54647t;
    }

    @p0
    public ColorStateList getItemRippleColor() {
        return this.f54644q;
    }

    @e1
    public int getItemTextAppearanceActive() {
        return this.f54642o;
    }

    @e1
    public int getItemTextAppearanceInactive() {
        return this.f54641n;
    }

    @p0
    public ColorStateList getItemTextColor() {
        return this.f54639l;
    }

    public int getLabelVisibilityMode() {
        return this.f54633f;
    }

    @p0
    protected g getMenu() {
        return this.D;
    }

    public int getSelectedItemId() {
        return this.f54635h;
    }

    protected int getSelectedItemPosition() {
        return this.f54636i;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getWindowAnimations() {
        return 0;
    }

    @p0
    public NavigationBarItemView h(int i10) {
        s(i10);
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i10) {
                return navigationBarItemView;
            }
        }
        return null;
    }

    @p0
    public com.google.android.material.badge.a i(int i10) {
        return this.f54646s.get(i10);
    }

    com.google.android.material.badge.a j(int i10) {
        s(i10);
        com.google.android.material.badge.a aVarD = this.f54646s.get(i10);
        if (aVarD == null) {
            aVarD = com.google.android.material.badge.a.d(getContext());
            this.f54646s.put(i10, aVarD);
        }
        NavigationBarItemView navigationBarItemViewH = h(i10);
        if (navigationBarItemViewH != null) {
            navigationBarItemViewH.setBadge(aVarD);
        }
        return aVarD;
    }

    protected boolean k() {
        return this.A;
    }

    protected boolean l(int i10, int i11) {
        if (i10 == -1) {
            if (i11 > 3) {
                return true;
            }
        } else if (i10 == 0) {
            return true;
        }
        return false;
    }

    void n(int i10) {
        s(i10);
        com.google.android.material.badge.a aVar = this.f54646s.get(i10);
        NavigationBarItemView navigationBarItemViewH = h(i10);
        if (navigationBarItemViewH != null) {
            navigationBarItemViewH.q();
        }
        if (aVar != null) {
            this.f54646s.remove(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.a0.g2(accessibilityNodeInfo).d1(androidx.core.view.accessibility.a0.d.f(1, this.D.H().size(), false, 1));
    }

    void p(SparseArray<com.google.android.material.badge.a> sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            if (this.f54646s.indexOfKey(iKeyAt) < 0) {
                this.f54646s.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(this.f54646s.get(navigationBarItemView.getId()));
            }
        }
    }

    void q(int i10) {
        int size = this.D.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = this.D.getItem(i11);
            if (i10 == item.getItemId()) {
                this.f54635h = i10;
                this.f54636i = i11;
                item.setChecked(true);
                return;
            }
        }
    }

    public void r() {
        TransitionSet transitionSet;
        g gVar = this.D;
        if (gVar == null || this.f54634g == null) {
            return;
        }
        int size = gVar.size();
        if (size != this.f54634g.length) {
            d();
            return;
        }
        int i10 = this.f54635h;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = this.D.getItem(i11);
            if (item.isChecked()) {
                this.f54635h = item.getItemId();
                this.f54636i = i11;
            }
        }
        if (i10 != this.f54635h && (transitionSet = this.f54629b) != null) {
            v.b(this, transitionSet);
        }
        boolean zL = l(this.f54633f, this.D.H().size());
        for (int i12 = 0; i12 < size; i12++) {
            this.C.n(true);
            this.f54634g[i12].setLabelVisibilityMode(this.f54633f);
            this.f54634g[i12].setShifting(zL);
            this.f54634g[i12].d((j) this.D.getItem(i12), 0);
            this.C.n(false);
        }
    }

    public void setIconTintList(@p0 ColorStateList colorStateList) {
        this.f54637j = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@p0 ColorStateList colorStateList) {
        this.B = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f54649v = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@t0 int i10) {
        this.f54651x = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@t0 int i10) {
        this.f54652y = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z10) {
        this.A = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@p0 p pVar) {
        this.f54653z = pVar;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@t0 int i10) {
        this.f54650w = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(@p0 Drawable drawable) {
        this.f54643p = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f54645r = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(@r int i10) {
        this.f54638k = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i10);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i10, @p0 View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f54632e.remove(i10);
        } else {
            this.f54632e.put(i10, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i10) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@t0 int i10) {
        this.f54648u = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(@t0 int i10) {
        this.f54647t = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(@p0 ColorStateList colorStateList) {
        this.f54644q = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@e1 int i10) {
        this.f54642o = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f54639l;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@e1 int i10) {
        this.f54641n = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f54639l;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@p0 ColorStateList colorStateList) {
        this.f54639l = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f54634g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f54633f = i10;
    }

    public void setPresenter(@n0 NavigationBarPresenter navigationBarPresenter) {
        this.C = navigationBarPresenter;
    }
}
