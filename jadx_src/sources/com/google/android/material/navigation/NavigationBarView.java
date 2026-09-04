package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.f;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.x0;
import androidx.core.view.j1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f54661h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f54662i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f54663j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f54664k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f54665l = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final com.google.android.material.navigation.a f54666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final NavigationBarMenuView f54667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final NavigationBarPresenter f54668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MenuInflater f54669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f54670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f54671g;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        Bundle f54672b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(@n0 Parcel parcel, ClassLoader classLoader) {
            this.f54672b = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f54672b);
        }
    }

    public class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, @n0 MenuItem menuItem) {
            if (NavigationBarView.this.f54671g == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                return (NavigationBarView.this.f54670f == null || NavigationBarView.this.f54670f.a(menuItem)) ? false : true;
            }
            NavigationBarView.this.f54671g.a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    public interface c {
        void a(@n0 MenuItem menuItem);
    }

    public interface d {
        boolean a(@n0 MenuItem menuItem);
    }

    public NavigationBarView(@n0 Context context, @p0 AttributeSet attributeSet, @f int i10, @e1 int i11) {
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f54668d = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = R.styleable.U0;
        int i12 = R.styleable.NavigationBarView_itemTextAppearanceInactive;
        int i13 = R.styleable.NavigationBarView_itemTextAppearanceActive;
        x0 x0VarL = c0.l(context2, attributeSet, iArr, i10, i11, i12, i13);
        com.google.android.material.navigation.a aVar = new com.google.android.material.navigation.a(context2, getClass(), getMaxItemCount());
        this.f54666b = aVar;
        NavigationBarMenuView navigationBarMenuViewD = d(context2);
        this.f54667c = navigationBarMenuViewD;
        navigationBarPresenter.j(navigationBarMenuViewD);
        navigationBarPresenter.b(1);
        navigationBarMenuViewD.setPresenter(navigationBarPresenter);
        aVar.b(navigationBarPresenter);
        navigationBarPresenter.h(getContext(), aVar);
        int i14 = R.styleable.NavigationBarView_itemIconTint;
        if (x0VarL.C(i14)) {
            navigationBarMenuViewD.setIconTintList(x0VarL.d(i14));
        } else {
            navigationBarMenuViewD.setIconTintList(navigationBarMenuViewD.e(android.R.attr.textColorSecondary));
        }
        setItemIconSize(x0VarL.g(R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (x0VarL.C(i12)) {
            setItemTextAppearanceInactive(x0VarL.u(i12, 0));
        }
        if (x0VarL.C(i13)) {
            setItemTextAppearanceActive(x0VarL.u(i13, 0));
        }
        int i15 = R.styleable.NavigationBarView_itemTextColor;
        if (x0VarL.C(i15)) {
            setItemTextColor(x0VarL.d(i15));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            j1.I1(this, c(context2));
        }
        int i16 = R.styleable.NavigationBarView_itemPaddingTop;
        if (x0VarL.C(i16)) {
            setItemPaddingTop(x0VarL.g(i16, 0));
        }
        int i17 = R.styleable.NavigationBarView_itemPaddingBottom;
        if (x0VarL.C(i17)) {
            setItemPaddingBottom(x0VarL.g(i17, 0));
        }
        int i18 = R.styleable.NavigationBarView_elevation;
        if (x0VarL.C(i18)) {
            setElevation(x0VarL.g(i18, 0));
        }
        androidx.core.graphics.drawable.d.o(getBackground().mutate(), com.google.android.material.resources.c.b(context2, x0VarL, R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(x0VarL.p(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int iU = x0VarL.u(R.styleable.NavigationBarView_itemBackground, 0);
        if (iU != 0) {
            navigationBarMenuViewD.setItemBackgroundRes(iU);
        } else {
            setItemRippleColor(com.google.android.material.resources.c.b(context2, x0VarL, R.styleable.NavigationBarView_itemRippleColor));
        }
        int iU2 = x0VarL.u(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (iU2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iU2, R.styleable.T0);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(com.google.android.material.resources.c.a(context2, typedArrayObtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(p.b(context2, typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).m());
            typedArrayObtainStyledAttributes.recycle();
        }
        int i19 = R.styleable.NavigationBarView_menu;
        if (x0VarL.C(i19)) {
            g(x0VarL.u(i19, 0));
        }
        x0VarL.I();
        addView(navigationBarMenuViewD);
        aVar.X(new a());
    }

    @n0
    private k c(Context context) {
        k kVar = new k();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            kVar.o0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        kVar.Z(context);
        return kVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f54669e == null) {
            this.f54669e = new androidx.appcompat.view.g(getContext());
        }
        return this.f54669e;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract NavigationBarMenuView d(@n0 Context context);

    @p0
    public com.google.android.material.badge.a e(int i10) {
        return this.f54667c.i(i10);
    }

    @n0
    public com.google.android.material.badge.a f(int i10) {
        return this.f54667c.j(i10);
    }

    public void g(int i10) {
        this.f54668d.n(true);
        getMenuInflater().inflate(i10, this.f54666b);
        this.f54668d.n(false);
        this.f54668d.e(true);
    }

    @p0
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f54667c.getItemActiveIndicatorColor();
    }

    @t0
    public int getItemActiveIndicatorHeight() {
        return this.f54667c.getItemActiveIndicatorHeight();
    }

    @t0
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f54667c.getItemActiveIndicatorMarginHorizontal();
    }

    @p0
    public p getItemActiveIndicatorShapeAppearance() {
        return this.f54667c.getItemActiveIndicatorShapeAppearance();
    }

    @t0
    public int getItemActiveIndicatorWidth() {
        return this.f54667c.getItemActiveIndicatorWidth();
    }

    @p0
    public Drawable getItemBackground() {
        return this.f54667c.getItemBackground();
    }

    @v
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f54667c.getItemBackgroundRes();
    }

    @r
    public int getItemIconSize() {
        return this.f54667c.getItemIconSize();
    }

    @p0
    public ColorStateList getItemIconTintList() {
        return this.f54667c.getIconTintList();
    }

    @t0
    public int getItemPaddingBottom() {
        return this.f54667c.getItemPaddingBottom();
    }

    @t0
    public int getItemPaddingTop() {
        return this.f54667c.getItemPaddingTop();
    }

    @p0
    public ColorStateList getItemRippleColor() {
        return this.f54667c.getItemRippleColor();
    }

    @e1
    public int getItemTextAppearanceActive() {
        return this.f54667c.getItemTextAppearanceActive();
    }

    @e1
    public int getItemTextAppearanceInactive() {
        return this.f54667c.getItemTextAppearanceInactive();
    }

    @p0
    public ColorStateList getItemTextColor() {
        return this.f54667c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f54667c.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @n0
    public Menu getMenu() {
        return this.f54666b;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public n getMenuView() {
        return this.f54667c;
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.f54668d;
    }

    @d0
    public int getSelectedItemId() {
        return this.f54667c.getSelectedItemId();
    }

    public boolean h() {
        return this.f54667c.getItemActiveIndicatorEnabled();
    }

    public void i(int i10) {
        this.f54667c.n(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f54666b.U(savedState.f54672b);
    }

    @Override // android.view.View
    @n0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f54672b = bundle;
        this.f54666b.W(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        l.d(this, f10);
    }

    public void setItemActiveIndicatorColor(@p0 ColorStateList colorStateList) {
        this.f54667c.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f54667c.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(@t0 int i10) {
        this.f54667c.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(@t0 int i10) {
        this.f54667c.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(@p0 p pVar) {
        this.f54667c.setItemActiveIndicatorShapeAppearance(pVar);
    }

    public void setItemActiveIndicatorWidth(@t0 int i10) {
        this.f54667c.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(@p0 Drawable drawable) {
        this.f54667c.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@v int i10) {
        this.f54667c.setItemBackgroundRes(i10);
    }

    public void setItemIconSize(@r int i10) {
        this.f54667c.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(@q int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(@p0 ColorStateList colorStateList) {
        this.f54667c.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i10, @p0 View.OnTouchListener onTouchListener) {
        this.f54667c.setItemOnTouchListener(i10, onTouchListener);
    }

    public void setItemPaddingBottom(@t0 int i10) {
        this.f54667c.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(@t0 int i10) {
        this.f54667c.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(@p0 ColorStateList colorStateList) {
        this.f54667c.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@e1 int i10) {
        this.f54667c.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(@e1 int i10) {
        this.f54667c.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(@p0 ColorStateList colorStateList) {
        this.f54667c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f54667c.getLabelVisibilityMode() != i10) {
            this.f54667c.setLabelVisibilityMode(i10);
            this.f54668d.e(false);
        }
    }

    public void setOnItemReselectedListener(@p0 c cVar) {
        this.f54671g = cVar;
    }

    public void setOnItemSelectedListener(@p0 d dVar) {
        this.f54670f = dVar;
    }

    public void setSelectedItemId(@d0 int i10) {
        MenuItem menuItemFindItem = this.f54666b.findItem(i10);
        if (menuItemFindItem == null || this.f54666b.P(menuItemFindItem, this.f54668d, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
