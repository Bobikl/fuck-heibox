package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.b1;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements androidx.appcompat.view.menu.n.a {
    private static final int[] S = {R.attr.state_checked};
    private int I;
    private boolean J;
    boolean K;
    private final CheckedTextView L;
    private FrameLayout M;
    private androidx.appcompat.view.menu.j N;
    private ColorStateList O;
    private boolean P;
    private Drawable Q;
    private final androidx.core.view.a R;

    public class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 androidx.core.view.accessibility.a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.Z0(NavigationMenuItemView.this.K);
        }
    }

    public NavigationMenuItemView(@n0 Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.R = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.L = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        j1.B1(checkedTextView, aVar);
    }

    private void C() {
        if (F()) {
            this.L.setVisibility(8);
            FrameLayout frameLayout = this.M;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.M.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.L.setVisibility(0);
        FrameLayout frameLayout2 = this.M;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.M.setLayoutParams(layoutParams2);
        }
    }

    @p0
    private StateListDrawable D() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(S, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean F() {
        return this.N.getTitle() == null && this.N.getIcon() == null && this.N.getActionView() != null;
    }

    private void setActionView(@p0 View view) {
        if (view != null) {
            if (this.M == null) {
                this.M = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.M.removeAllViews();
            this.M.addView(view);
        }
    }

    public void E() {
        FrameLayout frameLayout = this.M;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.L.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void d(@n0 androidx.appcompat.view.menu.j jVar, int i10) {
        this.N = jVar;
        if (jVar.getItemId() > 0) {
            setId(jVar.getItemId());
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            j1.I1(this, D());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        b1.a(this, jVar.getTooltipText());
        C();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean e() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.j getItemData() {
        return this.N;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.j jVar = this.N;
        if (jVar != null && jVar.isCheckable() && this.N.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.K != z10) {
            this.K = z10;
            this.R.sendAccessibilityEvent(this.L, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.L.setChecked(z10);
        CheckedTextView checkedTextView = this.L;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setIcon(@p0 Drawable drawable) {
        if (drawable != null) {
            if (this.P) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.d.r(drawable).mutate();
                androidx.core.graphics.drawable.d.o(drawable, this.O);
            }
            int i10 = this.I;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.J) {
            if (this.Q == null) {
                Drawable drawableG = androidx.core.content.res.i.g(getResources(), com.google.android.material.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.Q = drawableG;
                if (drawableG != null) {
                    int i11 = this.I;
                    drawableG.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.Q;
        }
        androidx.core.widget.q.w(this.L, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.L.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(@androidx.annotation.r int i10) {
        this.I = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.O = colorStateList;
        this.P = colorStateList != null;
        androidx.appcompat.view.menu.j jVar = this.N;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.L.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.J = z10;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.q.E(this.L, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.L.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void setTitle(CharSequence charSequence) {
        this.L.setText(charSequence);
    }
}
