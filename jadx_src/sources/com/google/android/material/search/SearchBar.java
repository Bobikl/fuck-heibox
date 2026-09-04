package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.l0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.d0;

/* JADX INFO: loaded from: classes7.dex */
public class SearchBar extends Toolbar {
    private static final int G3 = R.style.Widget_Material3_SearchBar;
    private static final int J3 = 53;
    private static final String K3 = "http://schemas.android.com/apk/res-auto";

    @p0
    private final AccessibilityManager G2;
    private final TextView T;
    private final boolean U;
    private final boolean V;
    private final i W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Drawable f54889a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final boolean f54890b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final boolean f54891c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private View f54892p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f54893p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private final androidx.core.view.accessibility.c.e f54894p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @p0
    private Integer f54895x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f54896x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @p0
    private Drawable f54897y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private com.google.android.material.shape.k f54898y2;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f54899b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, @p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f54899b = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f54899b);
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f54900m;

        public ScrollingViewBehavior() {
            this.f54900m = false;
        }

        public ScrollingViewBehavior(@n0 Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f54900m = false;
        }

        private void f0(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        protected boolean a0() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean l(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 View view2) {
            boolean zL = super.l(coordinatorLayout, view, view2);
            if (!this.f54900m && (view2 instanceof AppBarLayout)) {
                this.f54900m = true;
                f0((AppBarLayout) view2);
            }
            return zL;
        }
    }

    public class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            androidx.core.view.accessibility.c.b(SearchBar.this.G2, SearchBar.this.f54894p3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            androidx.core.view.accessibility.c.g(SearchBar.this.G2, SearchBar.this.f54894p3);
        }
    }

    public static abstract class b {
        public void a() {
        }

        public void b() {
        }
    }

    public SearchBar(@n0 Context context) {
        this(context, null);
    }

    public SearchBar(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = G3;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f54893p2 = -1;
        this.f54894p3 = new androidx.core.view.accessibility.c.e() { // from class: com.google.android.material.search.a
            @Override // androidx.core.view.accessibility.c.e
            public final void onTouchExplorationStateChanged(boolean z10) {
                this.f54930a.l0(z10);
            }
        };
        Context context2 = getContext();
        z0(attributeSet);
        this.f54889a0 = b0.a.b(context2, R.drawable.ic_search_black_24);
        this.W = new i();
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.f52844i1, i10, i11, new int[0]);
        com.google.android.material.shape.p pVarM = com.google.android.material.shape.p.e(context2, attributeSet, i10, i11).m();
        float dimension = typedArrayK.getDimension(R.styleable.SearchBar_elevation, 0.0f);
        this.V = typedArrayK.getBoolean(R.styleable.SearchBar_defaultMarginsEnabled, true);
        this.f54896x2 = typedArrayK.getBoolean(R.styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z10 = typedArrayK.getBoolean(R.styleable.SearchBar_hideNavigationIcon, false);
        this.f54891c0 = typedArrayK.getBoolean(R.styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.f54890b0 = typedArrayK.getBoolean(R.styleable.SearchBar_tintNavigationIcon, true);
        int i12 = R.styleable.SearchBar_navigationIconTint;
        if (typedArrayK.hasValue(i12)) {
            this.f54895x1 = Integer.valueOf(typedArrayK.getColor(i12, -1));
        }
        int resourceId = typedArrayK.getResourceId(R.styleable.SearchBar_android_textAppearance, -1);
        String string = typedArrayK.getString(R.styleable.SearchBar_android_text);
        String string2 = typedArrayK.getString(R.styleable.SearchBar_android_hint);
        float dimension2 = typedArrayK.getDimension(R.styleable.SearchBar_strokeWidth, -1.0f);
        int color = typedArrayK.getColor(R.styleable.SearchBar_strokeColor, 0);
        typedArrayK.recycle();
        if (!z10) {
            f0();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.U = true;
        this.T = (TextView) findViewById(R.id.search_bar_text_view);
        j1.N1(this, dimension);
        g0(resourceId, string, string2);
        e0(pVarM, dimension, dimension2, color);
        this.G2 = (AccessibilityManager) getContext().getSystemService("accessibility");
        w0();
    }

    private int Z(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    private ColorStateList d0(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[0]};
        int iN = com.google.android.material.color.m.n(i10, i11);
        return new ColorStateList(iArr, new int[]{iN, iN, i10});
    }

    private void e0(com.google.android.material.shape.p pVar, float f10, float f11, @androidx.annotation.l int i10) {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(pVar);
        this.f54898y2 = kVar;
        kVar.Z(getContext());
        this.f54898y2.n0(f10);
        if (f11 >= 0.0f) {
            this.f54898y2.D0(f11, i10);
        }
        int iD = com.google.android.material.color.m.d(this, R.attr.colorSurface);
        int iD2 = com.google.android.material.color.m.d(this, R.attr.colorControlHighlight);
        this.f54898y2.o0(ColorStateList.valueOf(iD));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD2);
        com.google.android.material.shape.k kVar2 = this.f54898y2;
        j1.I1(this, new RippleDrawable(colorStateListValueOf, kVar2, kVar2));
    }

    private void f0() {
        setNavigationIcon(getNavigationIcon() == null ? this.f54889a0 : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void g0(@e1 int i10, String str, String str2) {
        if (i10 != -1) {
            androidx.core.widget.q.E(this.T, i10);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            androidx.core.view.s.h((ViewGroup.MarginLayoutParams) this.T.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(boolean z10) {
        setFocusableInTouchMode(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0() {
        this.W.J(this);
    }

    private void n0() {
        View view = this.f54892p1;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f54892p1.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        o0(this.f54892p1, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    private void o0(View view, int i10, int i11, int i12, int i13) {
        if (j1.Z(this) == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    @p0
    private Drawable p0(@p0 Drawable drawable) {
        int iD;
        if (!this.f54890b0 || drawable == null) {
            return drawable;
        }
        Integer num = this.f54895x1;
        if (num != null) {
            iD = num.intValue();
        } else {
            iD = com.google.android.material.color.m.d(this, drawable == this.f54889a0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
        }
        Drawable drawableR = androidx.core.graphics.drawable.d.r(drawable.mutate());
        androidx.core.graphics.drawable.d.n(drawableR, iD);
        return drawableR;
    }

    private void q0(int i10, int i11) {
        View view = this.f54892p1;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton imageButtonE = d0.e(this);
        if (imageButtonE == null) {
            return;
        }
        imageButtonE.setClickable(!z10);
        imageButtonE.setFocusable(!z10);
        Drawable background = imageButtonE.getBackground();
        if (background != null) {
            this.f54897y1 = background;
        }
        imageButtonE.setBackgroundDrawable(z10 ? null : this.f54897y1);
    }

    private void u0() {
        if (this.V && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = Z(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = Z(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = Z(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = Z(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void v0() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f54896x2) {
                if (layoutParams.c() == 0) {
                    layoutParams.h(53);
                }
            } else if (layoutParams.c() == 53) {
                layoutParams.h(0);
            }
        }
    }

    private void w0() {
        AccessibilityManager accessibilityManager = this.G2;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.G2.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new a());
        }
    }

    private void z0(@p0 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(K3, "title") != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue(K3, "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    public void S(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.W.h(animatorListenerAdapter);
    }

    public void T(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.W.i(animatorListenerAdapter);
    }

    public void U(@n0 b bVar) {
        this.W.j(bVar);
    }

    public void V() {
        this.T.setText("");
    }

    @s9.a
    public boolean W(@n0 View view) {
        return X(view, null);
    }

    @s9.a
    public boolean X(@n0 View view, @p0 AppBarLayout appBarLayout) {
        return Y(view, appBarLayout, false);
    }

    @s9.a
    public boolean Y(@n0 View view, @p0 AppBarLayout appBarLayout, boolean z10) {
        if ((view.getVisibility() != 0 || h0()) && !j0()) {
            return false;
        }
        this.W.H(this, view, appBarLayout, z10);
        return true;
    }

    @s9.a
    public boolean a0(@n0 View view) {
        return b0(view, null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.U && this.f54892p1 == null && !(view instanceof ActionMenuView)) {
            this.f54892p1 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    @s9.a
    public boolean b0(@n0 View view, @p0 AppBarLayout appBarLayout) {
        return c0(view, appBarLayout, false);
    }

    @s9.a
    public boolean c0(@n0 View view, @p0 AppBarLayout appBarLayout, boolean z10) {
        if ((view.getVisibility() == 0 || j0()) && !h0()) {
            return false;
        }
        this.W.I(this, view, appBarLayout, z10);
        return true;
    }

    @p0
    public View getCenterView() {
        return this.f54892p1;
    }

    float getCompatElevation() {
        com.google.android.material.shape.k kVar = this.f54898y2;
        return kVar != null ? kVar.x() : j1.R(this);
    }

    public float getCornerSize() {
        return this.f54898y2.S();
    }

    @p0
    public CharSequence getHint() {
        return this.T.getHint();
    }

    int getMenuResId() {
        return this.f54893p2;
    }

    @androidx.annotation.l
    public int getStrokeColor() {
        return this.f54898y2.N().getDefaultColor();
    }

    @androidx.annotation.r
    public float getStrokeWidth() {
        return this.f54898y2.Q();
    }

    @p0
    public CharSequence getText() {
        return this.T.getText();
    }

    @n0
    public TextView getTextView() {
        return this.T;
    }

    public boolean h0() {
        return this.W.x();
    }

    public boolean i0() {
        return this.f54896x2;
    }

    public boolean j0() {
        return this.W.y();
    }

    public boolean k0() {
        return this.W.z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.f(this, this.f54898y2);
        u0();
        v0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        q0(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f54899b);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @n0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f54899b = text == null ? null : text.toString();
        return savedState;
    }

    public boolean r0(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.W.D(animatorListenerAdapter);
    }

    public boolean s0(@n0 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.W.E(animatorListenerAdapter);
    }

    public void setCenterView(@p0 View view) {
        View view2 = this.f54892p1;
        if (view2 != null) {
            removeView(view2);
            this.f54892p1 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f54896x2 = z10;
        v0();
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.k kVar = this.f54898y2;
        if (kVar != null) {
            kVar.n0(f10);
        }
    }

    public void setHint(@d1 int i10) {
        this.T.setHint(i10);
    }

    public void setHint(@p0 CharSequence charSequence) {
        this.T.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@p0 Drawable drawable) {
        super.setNavigationIcon(p0(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f54891c0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.W.G(z10);
    }

    public void setStrokeColor(@androidx.annotation.l int i10) {
        if (getStrokeColor() != i10) {
            this.f54898y2.F0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(@androidx.annotation.r float f10) {
        if (getStrokeWidth() != f10) {
            this.f54898y2.I0(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@d1 int i10) {
        this.T.setText(i10);
    }

    public void setText(@p0 CharSequence charSequence) {
        this.T.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public boolean t0(@n0 b bVar) {
        return this.W.F(bVar);
    }

    public void x0() {
        post(new Runnable() { // from class: com.google.android.material.search.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f54931b.m0();
            }
        });
    }

    public void y0() {
        this.W.K(this);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void z(@l0 int i10) {
        super.z(i10);
        this.f54893p2 = i10;
    }
}
