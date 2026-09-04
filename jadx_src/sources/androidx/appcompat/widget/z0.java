package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.view.c3;
import androidx.core.view.e3;
import androidx.core.view.j1;

/* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class z0 implements a0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f2969s = "ToolbarWidgetWrapper";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f2970t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f2971u = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f2972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f2974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spinner f2975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f2976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f2977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f2978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f2979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    CharSequence f2981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f2982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f2983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Window.Callback f2984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f2985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ActionMenuPresenter f2986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f2989r;

    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f2990b;

        a() {
            this.f2990b = new androidx.appcompat.view.menu.a(z0.this.f2972a.getContext(), 0, R.id.home, 0, 0, z0.this.f2981j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z0 z0Var = z0.this;
            Window.Callback callback = z0Var.f2984m;
            if (callback == null || !z0Var.f2985n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f2990b);
        }
    }

    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    public class b extends e3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2992a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2993b;

        b(int i10) {
            this.f2993b = i10;
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void a(View view) {
            this.f2992a = true;
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void b(View view) {
            if (this.f2992a) {
                return;
            }
            z0.this.f2972a.setVisibility(this.f2993b);
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void c(View view) {
            z0.this.f2972a.setVisibility(0);
        }
    }

    public z0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, androidx.appcompat.R.string.abc_action_bar_up_description, androidx.appcompat.R.drawable.abc_ic_ab_back_material);
    }

    public z0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f2987p = 0;
        this.f2988q = 0;
        this.f2972a = toolbar;
        this.f2981j = toolbar.getTitle();
        this.f2982k = toolbar.getSubtitle();
        this.f2980i = this.f2981j != null;
        this.f2979h = toolbar.getNavigationIcon();
        x0 x0VarG = x0.G(toolbar.getContext(), null, androidx.appcompat.R.styleable.f1568a, androidx.appcompat.R.attr.actionBarStyle, 0);
        this.f2989r = x0VarG.h(androidx.appcompat.R.styleable.ActionBar_homeAsUpIndicator);
        if (z10) {
            CharSequence charSequenceX = x0VarG.x(androidx.appcompat.R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceX)) {
                setTitle(charSequenceX);
            }
            CharSequence charSequenceX2 = x0VarG.x(androidx.appcompat.R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceX2)) {
                D(charSequenceX2);
            }
            Drawable drawableH = x0VarG.h(androidx.appcompat.R.styleable.ActionBar_logo);
            if (drawableH != null) {
                v(drawableH);
            }
            Drawable drawableH2 = x0VarG.h(androidx.appcompat.R.styleable.ActionBar_icon);
            if (drawableH2 != null) {
                setIcon(drawableH2);
            }
            if (this.f2979h == null && (drawable = this.f2989r) != null) {
                C(drawable);
            }
            k(x0VarG.o(androidx.appcompat.R.styleable.ActionBar_displayOptions, 0));
            int iU = x0VarG.u(androidx.appcompat.R.styleable.ActionBar_customNavigationLayout, 0);
            if (iU != 0) {
                A(LayoutInflater.from(this.f2972a.getContext()).inflate(iU, (ViewGroup) this.f2972a, false));
                k(this.f2973b | 16);
            }
            int iQ = x0VarG.q(androidx.appcompat.R.styleable.ActionBar_height, 0);
            if (iQ > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2972a.getLayoutParams();
                layoutParams.height = iQ;
                this.f2972a.setLayoutParams(layoutParams);
            }
            int iF = x0VarG.f(androidx.appcompat.R.styleable.ActionBar_contentInsetStart, -1);
            int iF2 = x0VarG.f(androidx.appcompat.R.styleable.ActionBar_contentInsetEnd, -1);
            if (iF >= 0 || iF2 >= 0) {
                this.f2972a.setContentInsetsRelative(Math.max(iF, 0), Math.max(iF2, 0));
            }
            int iU2 = x0VarG.u(androidx.appcompat.R.styleable.ActionBar_titleTextStyle, 0);
            if (iU2 != 0) {
                Toolbar toolbar2 = this.f2972a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iU2);
            }
            int iU3 = x0VarG.u(androidx.appcompat.R.styleable.ActionBar_subtitleTextStyle, 0);
            if (iU3 != 0) {
                Toolbar toolbar3 = this.f2972a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iU3);
            }
            int iU4 = x0VarG.u(androidx.appcompat.R.styleable.ActionBar_popupTheme, 0);
            if (iU4 != 0) {
                this.f2972a.setPopupTheme(iU4);
            }
        } else {
            this.f2973b = R();
        }
        x0VarG.I();
        J(i10);
        this.f2983l = this.f2972a.getNavigationContentDescription();
        this.f2972a.setNavigationOnClickListener(new a());
    }

    private int R() {
        if (this.f2972a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2989r = this.f2972a.getNavigationIcon();
        return 15;
    }

    private void S() {
        if (this.f2975d == null) {
            this.f2975d = new AppCompatSpinner(getContext(), null, androidx.appcompat.R.attr.actionDropDownStyle);
            this.f2975d.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    private void T(CharSequence charSequence) {
        this.f2981j = charSequence;
        if ((this.f2973b & 8) != 0) {
            this.f2972a.setTitle(charSequence);
            if (this.f2980i) {
                j1.E1(this.f2972a.getRootView(), charSequence);
            }
        }
    }

    private void U() {
        if ((this.f2973b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2983l)) {
                this.f2972a.setNavigationContentDescription(this.f2988q);
            } else {
                this.f2972a.setNavigationContentDescription(this.f2983l);
            }
        }
    }

    private void V() {
        if ((this.f2973b & 4) == 0) {
            this.f2972a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f2972a;
        Drawable drawable = this.f2979h;
        if (drawable == null) {
            drawable = this.f2989r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void W() {
        Drawable drawable;
        int i10 = this.f2973b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f2978g) == null) {
            drawable = this.f2977f;
        }
        this.f2972a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.a0
    public void A(View view) {
        View view2 = this.f2976e;
        if (view2 != null && (this.f2973b & 16) != 0) {
            this.f2972a.removeView(view2);
        }
        this.f2976e = view;
        if (view == null || (this.f2973b & 16) == 0) {
            return;
        }
        this.f2972a.addView(view);
    }

    @Override // androidx.appcompat.widget.a0
    public void B() {
        Log.i(f2969s, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.a0
    public void C(Drawable drawable) {
        this.f2979h = drawable;
        V();
    }

    @Override // androidx.appcompat.widget.a0
    public void D(CharSequence charSequence) {
        this.f2982k = charSequence;
        if ((this.f2973b & 8) != 0) {
            this.f2972a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public void E(int i10) {
        Spinner spinner = this.f2975d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i10);
    }

    @Override // androidx.appcompat.widget.a0
    public Menu F() {
        return this.f2972a.getMenu();
    }

    @Override // androidx.appcompat.widget.a0
    public c3 G(int i10, long j10) {
        return j1.g(this.f2972a).b(i10 == 0 ? 1.0f : 0.0f).s(j10).u(new b(i10));
    }

    @Override // androidx.appcompat.widget.a0
    public ViewGroup H() {
        return this.f2972a;
    }

    @Override // androidx.appcompat.widget.a0
    public void I(boolean z10) {
    }

    @Override // androidx.appcompat.widget.a0
    public void J(int i10) {
        if (i10 == this.f2988q) {
            return;
        }
        this.f2988q = i10;
        if (TextUtils.isEmpty(this.f2972a.getNavigationContentDescription())) {
            p(this.f2988q);
        }
    }

    @Override // androidx.appcompat.widget.a0
    public void K(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f2974c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f2972a;
            if (parent == toolbar) {
                toolbar.removeView(this.f2974c);
            }
        }
        this.f2974c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f2987p != 2) {
            return;
        }
        this.f2972a.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f2974c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f1602a = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.a0
    public boolean L() {
        return this.f2974c != null;
    }

    @Override // androidx.appcompat.widget.a0
    public void M(int i10) {
        C(i10 != 0 ? b0.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.a0
    public void N(androidx.appcompat.view.menu.m.a aVar, androidx.appcompat.view.menu.g.a aVar2) {
        this.f2972a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.a0
    public void O(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        S();
        this.f2975d.setAdapter(spinnerAdapter);
        this.f2975d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.a0
    public void P(SparseArray<Parcelable> sparseArray) {
        this.f2972a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.a0
    public CharSequence Q() {
        return this.f2972a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.a0
    public void a(Drawable drawable) {
        j1.I1(this.f2972a, drawable);
    }

    @Override // androidx.appcompat.widget.a0
    public boolean b() {
        return this.f2972a.f();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean c() {
        return this.f2972a.N();
    }

    @Override // androidx.appcompat.widget.a0
    public void collapseActionView() {
        this.f2972a.g();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean d() {
        return this.f2972a.C();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean e() {
        return this.f2977f != null;
    }

    @Override // androidx.appcompat.widget.a0
    public boolean f() {
        return this.f2972a.y();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean g() {
        return this.f2978g != null;
    }

    @Override // androidx.appcompat.widget.a0
    public Context getContext() {
        return this.f2972a.getContext();
    }

    @Override // androidx.appcompat.widget.a0
    public int getHeight() {
        return this.f2972a.getHeight();
    }

    @Override // androidx.appcompat.widget.a0
    public CharSequence getTitle() {
        return this.f2972a.getTitle();
    }

    @Override // androidx.appcompat.widget.a0
    public int getVisibility() {
        return this.f2972a.getVisibility();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean h() {
        return this.f2972a.B();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean i() {
        return this.f2972a.x();
    }

    @Override // androidx.appcompat.widget.a0
    public boolean j() {
        return this.f2972a.D();
    }

    @Override // androidx.appcompat.widget.a0
    public void k(int i10) {
        View view;
        int i11 = this.f2973b ^ i10;
        this.f2973b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    U();
                }
                V();
            }
            if ((i11 & 3) != 0) {
                W();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f2972a.setTitle(this.f2981j);
                    this.f2972a.setSubtitle(this.f2982k);
                } else {
                    this.f2972a.setTitle((CharSequence) null);
                    this.f2972a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f2976e) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f2972a.addView(view);
            } else {
                this.f2972a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.a0
    public void l(CharSequence charSequence) {
        this.f2983l = charSequence;
        U();
    }

    @Override // androidx.appcompat.widget.a0
    public int m() {
        return this.f2987p;
    }

    @Override // androidx.appcompat.widget.a0
    public void n(int i10) {
        View view;
        int i11 = this.f2987p;
        if (i10 != i11) {
            if (i11 == 1) {
                Spinner spinner = this.f2975d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f2972a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f2975d);
                    }
                }
            } else if (i11 == 2 && (view = this.f2974c) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f2972a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.f2974c);
                }
            }
            this.f2987p = i10;
            if (i10 != 0) {
                if (i10 == 1) {
                    S();
                    this.f2972a.addView(this.f2975d, 0);
                    return;
                }
                if (i10 != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i10);
                }
                View view2 = this.f2974c;
                if (view2 != null) {
                    this.f2972a.addView(view2, 0);
                    Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f2974c.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                    layoutParams.f1602a = 8388691;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.a0
    public int o() {
        Spinner spinner = this.f2975d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.a0
    public void p(int i10) {
        l(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // androidx.appcompat.widget.a0
    public void q() {
        Log.i(f2969s, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.a0
    public int r() {
        Spinner spinner = this.f2975d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.a0
    public void s(boolean z10) {
        this.f2972a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.a0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? b0.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.a0
    public void setIcon(Drawable drawable) {
        this.f2977f = drawable;
        W();
    }

    @Override // androidx.appcompat.widget.a0
    public void setLogo(int i10) {
        v(i10 != 0 ? b0.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.a0
    public void setMenu(Menu menu, androidx.appcompat.view.menu.m.a aVar) {
        if (this.f2986o == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f2972a.getContext());
            this.f2986o = actionMenuPresenter;
            actionMenuPresenter.s(androidx.appcompat.R.id.action_menu_presenter);
        }
        this.f2986o.i(aVar);
        this.f2972a.setMenu((androidx.appcompat.view.menu.g) menu, this.f2986o);
    }

    @Override // androidx.appcompat.widget.a0
    public void setMenuPrepared() {
        this.f2985n = true;
    }

    @Override // androidx.appcompat.widget.a0
    public void setTitle(CharSequence charSequence) {
        this.f2980i = true;
        T(charSequence);
    }

    @Override // androidx.appcompat.widget.a0
    public void setVisibility(int i10) {
        this.f2972a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowCallback(Window.Callback callback) {
        this.f2984m = callback;
    }

    @Override // androidx.appcompat.widget.a0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f2980i) {
            return;
        }
        T(charSequence);
    }

    @Override // androidx.appcompat.widget.a0
    public void t() {
        this.f2972a.h();
    }

    @Override // androidx.appcompat.widget.a0
    public View u() {
        return this.f2976e;
    }

    @Override // androidx.appcompat.widget.a0
    public void v(Drawable drawable) {
        this.f2978g = drawable;
        W();
    }

    @Override // androidx.appcompat.widget.a0
    public void w(Drawable drawable) {
        if (this.f2989r != drawable) {
            this.f2989r = drawable;
            V();
        }
    }

    @Override // androidx.appcompat.widget.a0
    public void x(SparseArray<Parcelable> sparseArray) {
        this.f2972a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.a0
    public void y(int i10) {
        c3 c3VarG = G(i10, f2971u);
        if (c3VarG != null) {
            c3VarG.y();
        }
    }

    @Override // androidx.appcompat.widget.a0
    public int z() {
        return this.f2973b;
    }
}
