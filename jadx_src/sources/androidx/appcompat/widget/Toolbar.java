package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.core.view.j1;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.v {
    private static final String S = "Toolbar";
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    final androidx.core.view.y H;
    private ArrayList<MenuItem> I;
    e J;
    private final ActionMenuView.d K;
    private z0 L;
    private ActionMenuPresenter M;
    private d N;
    private androidx.appcompat.view.menu.m.a O;
    private androidx.appcompat.view.menu.g.a P;
    private boolean Q;
    private final Runnable R;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionMenuView f2659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f2660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f2661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageButton f2662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f2663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f2664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f2665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ImageButton f2666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    View f2667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f2668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f2672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private o0 f2678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f2680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f2681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f2682y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f2683z;

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f2684c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f2685d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f2686e = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2687b;

        public LayoutParams(int i10) {
            this(-2, -1, i10);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f2687b = 0;
            this.f1602a = 8388627;
        }

        public LayoutParams(int i10, int i11, int i12) {
            super(i10, i11);
            this.f2687b = 0;
            this.f1602a = i12;
        }

        public LayoutParams(@androidx.annotation.n0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2687b = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2687b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2687b = 0;
            a(marginLayoutParams);
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2687b = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f2687b = 0;
            this.f2687b = layoutParams.f2687b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f2689c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2688b = parcel.readInt();
            this.f2689c = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2688b);
            parcel.writeInt(this.f2689c ? 1 : 0);
        }
    }

    public class a implements ActionMenuView.d {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.H.j(menuItem)) {
                return true;
            }
            e eVar = Toolbar.this.J;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.N();
        }
    }

    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.g();
        }
    }

    public class d implements androidx.appcompat.view.menu.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f2693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.appcompat.view.menu.j f2694c;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean c(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar.this.i();
            ViewParent parent = Toolbar.this.f2666i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f2666i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f2666i);
            }
            Toolbar.this.f2667j = jVar.getActionView();
            this.f2694c = jVar;
            ViewParent parent2 = Toolbar.this.f2667j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f2667j);
                }
                LayoutParams layoutParamsGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParamsGenerateDefaultLayoutParams.f1602a = 8388611 | (toolbar4.f2672o & 112);
                layoutParamsGenerateDefaultLayoutParams.f2687b = 2;
                toolbar4.f2667j.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f2667j);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            jVar.t(true);
            KeyEvent.Callback callback = Toolbar.this.f2667j;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public Parcelable d() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.m
        public void e(boolean z10) {
            if (this.f2694c != null) {
                androidx.appcompat.view.menu.g gVar = this.f2693b;
                boolean z11 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f2693b.getItem(i10) == this.f2694c) {
                            z11 = true;
                            break;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                g(this.f2693b, this.f2694c);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            KeyEvent.Callback callback = Toolbar.this.f2667j;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f2667j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f2666i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f2667j = null;
            toolbar3.c();
            this.f2694c = null;
            Toolbar.this.requestLayout();
            jVar.t(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.m
        public void h(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.g gVar2 = this.f2693b;
            if (gVar2 != null && (jVar = this.f2694c) != null) {
                gVar2.g(jVar);
            }
            this.f2693b = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(androidx.appcompat.view.menu.m.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void k(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean l(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public androidx.appcompat.view.menu.n m(ViewGroup viewGroup) {
            return null;
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public Toolbar(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2681x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.H = new androidx.core.view.y(new Runnable() { // from class: androidx.appcompat.widget.y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2968b.invalidateMenu();
            }
        });
        this.I = new ArrayList<>();
        this.K = new a();
        this.R = new b();
        Context context2 = getContext();
        int[] iArr = R.styleable.E;
        x0 x0VarG = x0.G(context2, attributeSet, iArr, i10, 0);
        j1.z1(this, context, iArr, attributeSet, x0VarG.B(), i10, 0);
        this.f2670m = x0VarG.u(R.styleable.Toolbar_titleTextAppearance, 0);
        this.f2671n = x0VarG.u(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.f2681x = x0VarG.p(R.styleable.Toolbar_android_gravity, this.f2681x);
        this.f2672o = x0VarG.p(R.styleable.Toolbar_buttonGravity, 48);
        int iF = x0VarG.f(R.styleable.Toolbar_titleMargin, 0);
        int i11 = R.styleable.Toolbar_titleMargins;
        iF = x0VarG.C(i11) ? x0VarG.f(i11, iF) : iF;
        this.f2677t = iF;
        this.f2676s = iF;
        this.f2675r = iF;
        this.f2674q = iF;
        int iF2 = x0VarG.f(R.styleable.Toolbar_titleMarginStart, -1);
        if (iF2 >= 0) {
            this.f2674q = iF2;
        }
        int iF3 = x0VarG.f(R.styleable.Toolbar_titleMarginEnd, -1);
        if (iF3 >= 0) {
            this.f2675r = iF3;
        }
        int iF4 = x0VarG.f(R.styleable.Toolbar_titleMarginTop, -1);
        if (iF4 >= 0) {
            this.f2676s = iF4;
        }
        int iF5 = x0VarG.f(R.styleable.Toolbar_titleMarginBottom, -1);
        if (iF5 >= 0) {
            this.f2677t = iF5;
        }
        this.f2673p = x0VarG.g(R.styleable.Toolbar_maxButtonHeight, -1);
        int iF6 = x0VarG.f(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iF7 = x0VarG.f(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iG = x0VarG.g(R.styleable.Toolbar_contentInsetLeft, 0);
        int iG2 = x0VarG.g(R.styleable.Toolbar_contentInsetRight, 0);
        j();
        this.f2678u.e(iG, iG2);
        if (iF6 != Integer.MIN_VALUE || iF7 != Integer.MIN_VALUE) {
            this.f2678u.g(iF6, iF7);
        }
        this.f2679v = x0VarG.f(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2680w = x0VarG.f(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2664g = x0VarG.h(R.styleable.Toolbar_collapseIcon);
        this.f2665h = x0VarG.x(R.styleable.Toolbar_collapseContentDescription);
        CharSequence charSequenceX = x0VarG.x(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceX)) {
            setTitle(charSequenceX);
        }
        CharSequence charSequenceX2 = x0VarG.x(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceX2)) {
            setSubtitle(charSequenceX2);
        }
        this.f2668k = getContext();
        setPopupTheme(x0VarG.u(R.styleable.Toolbar_popupTheme, 0));
        Drawable drawableH = x0VarG.h(R.styleable.Toolbar_navigationIcon);
        if (drawableH != null) {
            setNavigationIcon(drawableH);
        }
        CharSequence charSequenceX3 = x0VarG.x(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceX3)) {
            setNavigationContentDescription(charSequenceX3);
        }
        Drawable drawableH2 = x0VarG.h(R.styleable.Toolbar_logo);
        if (drawableH2 != null) {
            setLogo(drawableH2);
        }
        CharSequence charSequenceX4 = x0VarG.x(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceX4)) {
            setLogoDescription(charSequenceX4);
        }
        int i12 = R.styleable.Toolbar_titleTextColor;
        if (x0VarG.C(i12)) {
            setTitleTextColor(x0VarG.d(i12));
        }
        int i13 = R.styleable.Toolbar_subtitleTextColor;
        if (x0VarG.C(i13)) {
            setSubtitleTextColor(x0VarG.d(i13));
        }
        int i14 = R.styleable.Toolbar_menu;
        if (x0VarG.C(i14)) {
            z(x0VarG.u(i14, 0));
        }
        x0VarG.I();
    }

    private boolean A(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    private int E(View view, int i10, int[] iArr, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iS = s(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iS, iMax + measuredWidth, view.getMeasuredHeight() + iS);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int F(View view, int i10, int[] iArr, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iS = s(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iS, iMax, view.getMeasuredHeight() + iS);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int G(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void H(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.H.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.I = currentMenuItems2;
        this.H.k(menu);
    }

    private void J() {
        removeCallbacks(this.R);
        post(this.R);
    }

    private boolean L() {
        if (!this.Q) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void d(List<View> list, int i10) {
        boolean z10 = j1.Z(this) == 1;
        int childCount = getChildCount();
        int iD = androidx.core.view.n.d(i10, j1.Z(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f2687b == 0 && M(childAt) && r(layoutParams.f1602a) == iD) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f2687b == 0 && M(childAt2) && r(layoutParams2.f1602a) == iD) {
                list.add(childAt2);
            }
        }
    }

    private void e(View view, boolean z10) {
        LayoutParams layoutParamsGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        }
        layoutParamsGenerateLayoutParams.f2687b = 1;
        if (!z10 || this.f2667j == null) {
            addView(view, layoutParamsGenerateLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateLayoutParams);
            this.F.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void j() {
        if (this.f2678u == null) {
            this.f2678u = new o0();
        }
    }

    private void k() {
        if (this.f2663f == null) {
            this.f2663f = new AppCompatImageView(getContext());
        }
    }

    private void l() {
        m();
        if (this.f2659b.O() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f2659b.getMenu();
            if (this.N == null) {
                this.N = new d();
            }
            this.f2659b.setExpandedActionViewsExclusive(true);
            gVar.c(this.N, this.f2668k);
        }
    }

    private void m() {
        if (this.f2659b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f2659b = actionMenuView;
            actionMenuView.setPopupTheme(this.f2669l);
            this.f2659b.setOnMenuItemClickListener(this.K);
            this.f2659b.setMenuCallbacks(this.O, this.P);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f1602a = 8388613 | (this.f2672o & 112);
            this.f2659b.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            e(this.f2659b, false);
        }
    }

    private void n() {
        if (this.f2662e == null) {
            this.f2662e = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f1602a = 8388611 | (this.f2672o & 112);
            this.f2662e.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    private int r(int i10) {
        int iZ = j1.Z(this);
        int iD = androidx.core.view.n.d(i10, iZ) & 7;
        if (iD == 1 || iD == 3 || iD == 5) {
            return iD;
        }
        return iZ == 1 ? 5 : 3;
    }

    private int s(View view, int i10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iT = t(layoutParams.f1602a);
        if (iT == 48) {
            return getPaddingTop() - i11;
        }
        if (iT == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int t(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f2681x & 112;
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.s.c(marginLayoutParams) + androidx.core.view.s.b(marginLayoutParams);
    }

    private int v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int w(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean B() {
        ActionMenuView actionMenuView = this.f2659b;
        return actionMenuView != null && actionMenuView.J();
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f2659b;
        return actionMenuView != null && actionMenuView.K();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean D() {
        Layout layout;
        TextView textView = this.f2660c;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (layout.getEllipsisCount(i10) > 0) {
                return true;
            }
        }
        return false;
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f2687b != 2 && childAt != this.f2659b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f2659b;
        return actionMenuView != null && actionMenuView.P();
    }

    @Override // androidx.core.view.v
    @androidx.annotation.k0
    public void addMenuProvider(@androidx.annotation.n0 androidx.core.view.p0 p0Var) {
        this.H.c(p0Var);
    }

    @Override // androidx.core.view.v
    @androidx.annotation.k0
    public void addMenuProvider(@androidx.annotation.n0 androidx.core.view.p0 p0Var, @androidx.annotation.n0 androidx.lifecycle.y yVar) {
        this.H.d(p0Var, yVar);
    }

    @Override // androidx.core.view.v
    @androidx.annotation.k0
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@androidx.annotation.n0 androidx.core.view.p0 p0Var, @androidx.annotation.n0 androidx.lifecycle.y yVar, @androidx.annotation.n0 Lifecycle.State state) {
        this.H.e(p0Var, yVar, state);
    }

    void c() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean f() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f2659b) != null && actionMenuView.L();
    }

    public void g() {
        d dVar = this.N;
        androidx.appcompat.view.menu.j jVar = dVar == null ? null : dVar.f2694c;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    @androidx.annotation.p0
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f2666i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @androidx.annotation.p0
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f2666i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.f2678u;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f2680w;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.f2678u;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.f2678u;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.f2678u;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f2679v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarO;
        ActionMenuView actionMenuView = this.f2659b;
        return actionMenuView != null && (gVarO = actionMenuView.O()) != null && gVarO.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f2680w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return j1.Z(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return j1.Z(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2679v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2663f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2663f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        l();
        return this.f2659b.getMenu();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @androidx.annotation.p0
    View getNavButtonView() {
        return this.f2662e;
    }

    @androidx.annotation.p0
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2662e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @androidx.annotation.p0
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2662e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.M;
    }

    @androidx.annotation.p0
    public Drawable getOverflowIcon() {
        l();
        return this.f2659b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f2668k;
    }

    @androidx.annotation.e1
    public int getPopupTheme() {
        return this.f2669l;
    }

    public CharSequence getSubtitle() {
        return this.f2683z;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @androidx.annotation.p0
    final TextView getSubtitleTextView() {
        return this.f2661d;
    }

    public CharSequence getTitle() {
        return this.f2682y;
    }

    public int getTitleMarginBottom() {
        return this.f2677t;
    }

    public int getTitleMarginEnd() {
        return this.f2675r;
    }

    public int getTitleMarginStart() {
        return this.f2674q;
    }

    public int getTitleMarginTop() {
        return this.f2676s;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @androidx.annotation.p0
    final TextView getTitleTextView() {
        return this.f2660c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public a0 getWrapper() {
        if (this.L == null) {
            this.L = new z0(this, true);
        }
        return this.L;
    }

    public void h() {
        ActionMenuView actionMenuView = this.f2659b;
        if (actionMenuView != null) {
            actionMenuView.C();
        }
    }

    void i() {
        if (this.f2666i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f2666i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f2664g);
            this.f2666i.setContentDescription(this.f2665h);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f1602a = 8388611 | (this.f2672o & 112);
            layoutParamsGenerateDefaultLayoutParams.f2687b = 2;
            this.f2666i.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.f2666i.setOnClickListener(new c());
        }
    }

    @Override // androidx.core.view.v
    @androidx.annotation.k0
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0289  */
    /* JADX WARN: Code duplicated, block: B:102:0x028c  */
    /* JADX WARN: Code duplicated, block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:93:0x022d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    /* JADX WARN: Code duplicated, block: B:97:0x0264  */
    /* JADX WARN: Code duplicated, block: B:99:0x0267  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iE;
        int iF;
        int iMax;
        int iMin;
        boolean zM;
        boolean zM2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z11;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iMax2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int size;
        int i28;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        boolean z12 = j1.Z(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.G;
        iArr[1] = 0;
        iArr[0] = 0;
        int iE0 = j1.e0(this);
        int iMin2 = iE0 >= 0 ? Math.min(iE0, i13 - i11) : 0;
        if (M(this.f2662e)) {
            if (z12) {
                iF = F(this.f2662e, i33, iArr, iMin2);
                iE = paddingLeft;
            } else {
                iE = E(this.f2662e, paddingLeft, iArr, iMin2);
            }
            if (M(this.f2666i)) {
                if (z12) {
                    iF = F(this.f2666i, iF, iArr, iMin2);
                } else {
                    iE = E(this.f2666i, iE, iArr, iMin2);
                }
            }
            if (M(this.f2659b)) {
                if (z12) {
                    iE = E(this.f2659b, iE, iArr, iMin2);
                } else {
                    iF = F(this.f2659b, iF, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iE);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iF));
            iMax = Math.max(iE, currentContentInsetLeft);
            iMin = Math.min(iF, i33 - currentContentInsetRight);
            if (M(this.f2667j)) {
                if (z12) {
                    iMin = F(this.f2667j, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f2667j, iMax, iArr, iMin2);
                }
            }
            if (M(this.f2663f)) {
                if (z12) {
                    iMin = F(this.f2663f, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f2663f, iMax, iArr, iMin2);
                }
            }
            zM = M(this.f2660c);
            zM2 = M(this.f2661d);
            if (zM) {
                LayoutParams layoutParams3 = (LayoutParams) this.f2660c.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.f2660c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zM2) {
                LayoutParams layoutParams4 = (LayoutParams) this.f2661d.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + this.f2661d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
            }
            if (!zM || zM2) {
                if (zM) {
                    textView = this.f2660c;
                } else {
                    textView = this.f2661d;
                }
                if (zM2) {
                    textView2 = this.f2661d;
                } else {
                    textView2 = this.f2660c;
                }
                layoutParams = (LayoutParams) textView.getLayoutParams();
                layoutParams2 = (LayoutParams) textView2.getLayoutParams();
                z11 = (!zM && this.f2660c.getMeasuredWidth() > 0) || (zM2 && this.f2661d.getMeasuredWidth() > 0);
                i14 = this.f2681x & 112;
                i15 = paddingLeft;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f2676s;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i23 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i24 = this.f2676s;
                    if (iMax2 < i23 + i24) {
                        iMax2 = i23 + i24;
                    } else {
                        i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i26 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        i27 = this.f2677t;
                        if (i25 < i26 + i27) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i27) - i25));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f2677t) - measuredHeight;
                }
                if (z12) {
                    if (z11) {
                        i20 = this.f2674q;
                    } else {
                        i20 = 0;
                    }
                    int i34 = i20 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zM) {
                        LayoutParams layoutParams5 = (LayoutParams) this.f2660c.getLayoutParams();
                        int measuredWidth = iMin - this.f2660c.getMeasuredWidth();
                        int measuredHeight2 = this.f2660c.getMeasuredHeight() + paddingTop;
                        this.f2660c.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i21 = measuredWidth - this.f2675r;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                    } else {
                        i21 = iMin;
                    }
                    if (zM2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f2661d.getLayoutParams())).topMargin;
                        this.f2661d.layout(iMin - this.f2661d.getMeasuredWidth(), i35, iMin, this.f2661d.getMeasuredHeight() + i35);
                        i22 = iMin - this.f2675r;
                    } else {
                        i22 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i21, i22);
                    }
                    iMax = iMax;
                } else {
                    if (z11) {
                        i17 = this.f2674q;
                        i16 = 0;
                    } else {
                        i16 = 0;
                        i17 = 0;
                    }
                    int i36 = i17 - iArr[i16];
                    iMax += Math.max(i16, i36);
                    iArr[i16] = Math.max(i16, -i36);
                    if (zM) {
                        LayoutParams layoutParams6 = (LayoutParams) this.f2660c.getLayoutParams();
                        int measuredWidth2 = this.f2660c.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f2660c.getMeasuredHeight() + paddingTop;
                        this.f2660c.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i18 = measuredWidth2 + this.f2675r;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i18 = iMax;
                    }
                    if (zM2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f2661d.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f2661d.getMeasuredWidth() + iMax;
                        this.f2661d.layout(iMax, i37, measuredWidth3, this.f2661d.getMeasuredHeight() + i37);
                        i19 = measuredWidth3 + this.f2675r;
                    } else {
                        i19 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i18, i19);
                    }
                }
                d(this.E, 3);
                size = this.E.size();
                for (i28 = i16; i28 < size; i28++) {
                    iMax = E(this.E.get(i28), iMax, iArr, iMin2);
                }
                i29 = iMin2;
                d(this.E, 5);
                size2 = this.E.size();
                for (i30 = i16; i30 < size2; i30++) {
                    iMin = F(this.E.get(i30), iMin, iArr, i29);
                }
                d(this.E, 1);
                int iW = w(this.E, iArr);
                i31 = (i15 + (((width - i15) - paddingRight) / 2)) - (iW / 2);
                i32 = iW + i31;
                if (i31 >= iMax) {
                    if (i32 > iMin) {
                        iMax = i31 - (i32 - iMin);
                    } else {
                        iMax = i31;
                    }
                }
                size3 = this.E.size();
                while (i16 < size3) {
                    iMax = E(this.E.get(i16), iMax, iArr, i29);
                    i16++;
                }
                this.E.clear();
            }
            i15 = paddingLeft;
            iMin2 = iMin2;
            i16 = 0;
            d(this.E, 3);
            size = this.E.size();
            while (i28 < size) {
                iMax = E(this.E.get(i28), iMax, iArr, iMin2);
            }
            i29 = iMin2;
            d(this.E, 5);
            size2 = this.E.size();
            while (i30 < size2) {
                iMin = F(this.E.get(i30), iMin, iArr, i29);
            }
            d(this.E, 1);
            int iW2 = w(this.E, iArr);
            i31 = (i15 + (((width - i15) - paddingRight) / 2)) - (iW2 / 2);
            i32 = iW2 + i31;
            if (i31 >= iMax) {
                if (i32 > iMin) {
                    iMax = i31 - (i32 - iMin);
                } else {
                    iMax = i31;
                }
            }
            size3 = this.E.size();
            while (i16 < size3) {
                iMax = E(this.E.get(i16), iMax, iArr, i29);
                i16++;
            }
            this.E.clear();
        }
        iE = paddingLeft;
        iF = i33;
        if (M(this.f2666i)) {
            if (z12) {
                iF = F(this.f2666i, iF, iArr, iMin2);
            } else {
                iE = E(this.f2666i, iE, iArr, iMin2);
            }
        }
        if (M(this.f2659b)) {
            if (z12) {
                iE = E(this.f2659b, iE, iArr, iMin2);
            } else {
                iF = F(this.f2659b, iF, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iE);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iF));
        iMax = Math.max(iE, currentContentInsetLeft2);
        iMin = Math.min(iF, i33 - currentContentInsetRight2);
        if (M(this.f2667j)) {
            if (z12) {
                iMin = F(this.f2667j, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f2667j, iMax, iArr, iMin2);
            }
        }
        if (M(this.f2663f)) {
            if (z12) {
                iMin = F(this.f2663f, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f2663f, iMax, iArr, iMin2);
            }
        }
        zM = M(this.f2660c);
        zM2 = M(this.f2661d);
        if (zM) {
            LayoutParams layoutParams7 = (LayoutParams) this.f2660c.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin + this.f2660c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zM2) {
            LayoutParams layoutParams8 = (LayoutParams) this.f2661d.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin + this.f2661d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin;
        }
        if (zM) {
            if (zM) {
                textView = this.f2660c;
            } else {
                textView = this.f2661d;
            }
            if (zM2) {
                textView2 = this.f2661d;
            } else {
                textView2 = this.f2660c;
            }
            layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams2 = (LayoutParams) textView2.getLayoutParams();
            if (zM) {
            }
            i14 = this.f2681x & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f2676s;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i24 = this.f2676s;
                if (iMax2 < i23 + i24) {
                    iMax2 = i23 + i24;
                } else {
                    i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i26 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i27 = this.f2677t;
                    if (i25 < i26 + i27) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i27) - i25));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f2677t) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i20 = this.f2674q;
                } else {
                    i20 = 0;
                }
                int i38 = i20 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zM) {
                    LayoutParams layoutParams9 = (LayoutParams) this.f2660c.getLayoutParams();
                    int measuredWidth4 = iMin - this.f2660c.getMeasuredWidth();
                    int measuredHeight4 = this.f2660c.getMeasuredHeight() + paddingTop;
                    this.f2660c.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i21 = measuredWidth4 - this.f2675r;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zM2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f2661d.getLayoutParams())).topMargin;
                    this.f2661d.layout(iMin - this.f2661d.getMeasuredWidth(), i39, iMin, this.f2661d.getMeasuredHeight() + i39);
                    i22 = iMin - this.f2675r;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = iMax;
                i16 = 0;
            } else {
                if (z11) {
                    i17 = this.f2674q;
                    i16 = 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i310 = i17 - iArr[i16];
                iMax += Math.max(i16, i310);
                iArr[i16] = Math.max(i16, -i310);
                if (zM) {
                    LayoutParams layoutParams10 = (LayoutParams) this.f2660c.getLayoutParams();
                    int measuredWidth5 = this.f2660c.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f2660c.getMeasuredHeight() + paddingTop;
                    this.f2660c.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i18 = measuredWidth5 + this.f2675r;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zM2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f2661d.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f2661d.getMeasuredWidth() + iMax;
                    this.f2661d.layout(iMax, i311, measuredWidth6, this.f2661d.getMeasuredHeight() + i311);
                    i19 = measuredWidth6 + this.f2675r;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        } else {
            if (zM) {
                textView = this.f2660c;
            } else {
                textView = this.f2661d;
            }
            if (zM2) {
                textView2 = this.f2661d;
            } else {
                textView2 = this.f2660c;
            }
            layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams2 = (LayoutParams) textView2.getLayoutParams();
            if (zM) {
            }
            i14 = this.f2681x & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f2676s;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i24 = this.f2676s;
                if (iMax2 < i23 + i24) {
                    iMax2 = i23 + i24;
                } else {
                    i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i26 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i27 = this.f2677t;
                    if (i25 < i26 + i27) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i27) - i25));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.f2677t) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i20 = this.f2674q;
                } else {
                    i20 = 0;
                }
                int i312 = i20 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zM) {
                    LayoutParams layoutParams11 = (LayoutParams) this.f2660c.getLayoutParams();
                    int measuredWidth7 = iMin - this.f2660c.getMeasuredWidth();
                    int measuredHeight6 = this.f2660c.getMeasuredHeight() + paddingTop;
                    this.f2660c.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i21 = measuredWidth7 - this.f2675r;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zM2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f2661d.getLayoutParams())).topMargin;
                    this.f2661d.layout(iMin - this.f2661d.getMeasuredWidth(), i313, iMin, this.f2661d.getMeasuredHeight() + i313);
                    i22 = iMin - this.f2675r;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = iMax;
                i16 = 0;
            } else {
                if (z11) {
                    i17 = this.f2674q;
                    i16 = 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i314 = i17 - iArr[i16];
                iMax += Math.max(i16, i314);
                iArr[i16] = Math.max(i16, -i314);
                if (zM) {
                    LayoutParams layoutParams12 = (LayoutParams) this.f2660c.getLayoutParams();
                    int measuredWidth8 = this.f2660c.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f2660c.getMeasuredHeight() + paddingTop;
                    this.f2660c.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i18 = measuredWidth8 + this.f2675r;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zM2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f2661d.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f2661d.getMeasuredWidth() + iMax;
                    this.f2661d.layout(iMax, i315, measuredWidth9, this.f2661d.getMeasuredHeight() + i315);
                    i19 = measuredWidth9 + this.f2675r;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        }
        d(this.E, 3);
        size = this.E.size();
        while (i28 < size) {
            iMax = E(this.E.get(i28), iMax, iArr, iMin2);
        }
        i29 = iMin2;
        d(this.E, 5);
        size2 = this.E.size();
        while (i30 < size2) {
            iMin = F(this.E.get(i30), iMin, iArr, i29);
        }
        d(this.E, 1);
        int iW3 = w(this.E, iArr);
        i31 = (i15 + (((width - i15) - paddingRight) / 2)) - (iW3 / 2);
        i32 = iW3 + i31;
        if (i31 >= iMax) {
            if (i32 > iMin) {
                iMax = i31 - (i32 - iMin);
            } else {
                iMax = i31;
            }
        }
        size3 = this.E.size();
        while (i16 < size3) {
            iMax = E(this.E.get(i16), iMax, iArr, i29);
            i16++;
        }
        this.E.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.G;
        boolean zB = h1.b(this);
        int i12 = !zB ? 1 : 0;
        if (M(this.f2662e)) {
            H(this.f2662e, i10, 0, i11, 0, this.f2673p);
            measuredWidth = this.f2662e.getMeasuredWidth() + u(this.f2662e);
            iMax = Math.max(0, this.f2662e.getMeasuredHeight() + v(this.f2662e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2662e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (M(this.f2666i)) {
            H(this.f2666i, i10, 0, i11, 0, this.f2673p);
            measuredWidth = this.f2666i.getMeasuredWidth() + u(this.f2666i);
            iMax = Math.max(iMax, this.f2666i.getMeasuredHeight() + v(this.f2666i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2666i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (M(this.f2659b)) {
            H(this.f2659b, i10, iMax3, i11, 0, this.f2673p);
            measuredWidth2 = this.f2659b.getMeasuredWidth() + u(this.f2659b);
            iMax = Math.max(iMax, this.f2659b.getMeasuredHeight() + v(this.f2659b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2659b.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (M(this.f2667j)) {
            iMax4 += G(this.f2667j, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f2667j.getMeasuredHeight() + v(this.f2667j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2667j.getMeasuredState());
        }
        if (M(this.f2663f)) {
            iMax4 += G(this.f2663f, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f2663f.getMeasuredHeight() + v(this.f2663f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2663f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((LayoutParams) childAt.getLayoutParams()).f2687b == 0 && M(childAt)) {
                iMax4 += G(childAt, i10, iMax4, i11, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + v(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.f2676s + this.f2677t;
        int i15 = this.f2674q + this.f2675r;
        if (M(this.f2660c)) {
            G(this.f2660c, i10, iMax4 + i15, i11, i14, iArr);
            int measuredWidth3 = this.f2660c.getMeasuredWidth() + u(this.f2660c);
            measuredHeight = this.f2660c.getMeasuredHeight() + v(this.f2660c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2660c.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (M(this.f2661d)) {
            iMax2 = Math.max(iMax2, G(this.f2661d, i10, iMax4 + i15, i11, measuredHeight + i14, iArr));
            measuredHeight += this.f2661d.getMeasuredHeight() + v(this.f2661d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2661d.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), L() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.f2659b;
        androidx.appcompat.view.menu.g gVarO = actionMenuView != null ? actionMenuView.O() : null;
        int i10 = savedState.f2688b;
        if (i10 != 0 && this.N != null && gVarO != null && (menuItemFindItem = gVarO.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f2689c) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        j();
        this.f2678u.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.j jVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.N;
        if (dVar != null && (jVar = dVar.f2694c) != null) {
            savedState.f2688b = jVar.getItemId();
        }
        savedState.f2689c = C();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.core.view.v
    @androidx.annotation.k0
    public void removeMenuProvider(@androidx.annotation.n0 androidx.core.view.p0 p0Var) {
        this.H.l(p0Var);
    }

    public void setCollapseContentDescription(@androidx.annotation.d1 int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(@androidx.annotation.p0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageButton imageButton = this.f2666i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@androidx.annotation.v int i10) {
        setCollapseIcon(b0.a.b(getContext(), i10));
    }

    public void setCollapseIcon(@androidx.annotation.p0 Drawable drawable) {
        if (drawable != null) {
            i();
            this.f2666i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f2666i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f2664g);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z10) {
        this.Q = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f2680w) {
            this.f2680w = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f2679v) {
            this.f2679v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i10, int i11) {
        j();
        this.f2678u.e(i10, i11);
    }

    public void setContentInsetsRelative(int i10, int i11) {
        j();
        this.f2678u.g(i10, i11);
    }

    public void setLogo(@androidx.annotation.v int i10) {
        setLogo(b0.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            k();
            if (!A(this.f2663f)) {
                e(this.f2663f, true);
            }
        } else {
            ImageView imageView = this.f2663f;
            if (imageView != null && A(imageView)) {
                removeView(this.f2663f);
                this.F.remove(this.f2663f);
            }
        }
        ImageView imageView2 = this.f2663f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(@androidx.annotation.d1 int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            k();
        }
        ImageView imageView = this.f2663f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setMenu(androidx.appcompat.view.menu.g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar == null && this.f2659b == null) {
            return;
        }
        m();
        androidx.appcompat.view.menu.g gVarO = this.f2659b.O();
        if (gVarO == gVar) {
            return;
        }
        if (gVarO != null) {
            gVarO.S(this.M);
            gVarO.S(this.N);
        }
        if (this.N == null) {
            this.N = new d();
        }
        actionMenuPresenter.K(true);
        if (gVar != null) {
            gVar.c(actionMenuPresenter, this.f2668k);
            gVar.c(this.N, this.f2668k);
        } else {
            actionMenuPresenter.h(this.f2668k, null);
            this.N.h(this.f2668k, null);
            actionMenuPresenter.e(true);
            this.N.e(true);
        }
        this.f2659b.setPopupTheme(this.f2669l);
        this.f2659b.setPresenter(actionMenuPresenter);
        this.M = actionMenuPresenter;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(androidx.appcompat.view.menu.m.a aVar, androidx.appcompat.view.menu.g.a aVar2) {
        this.O = aVar;
        this.P = aVar2;
        ActionMenuView actionMenuView = this.f2659b;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(@androidx.annotation.d1 int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(@androidx.annotation.p0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            n();
        }
        ImageButton imageButton = this.f2662e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            b1.a(this.f2662e, charSequence);
        }
    }

    public void setNavigationIcon(@androidx.annotation.v int i10) {
        setNavigationIcon(b0.a.b(getContext(), i10));
    }

    public void setNavigationIcon(@androidx.annotation.p0 Drawable drawable) {
        if (drawable != null) {
            n();
            if (!A(this.f2662e)) {
                e(this.f2662e, true);
            }
        } else {
            ImageButton imageButton = this.f2662e;
            if (imageButton != null && A(imageButton)) {
                removeView(this.f2662e);
                this.F.remove(this.f2662e);
            }
        }
        ImageButton imageButton2 = this.f2662e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        n();
        this.f2662e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.J = eVar;
    }

    public void setOverflowIcon(@androidx.annotation.p0 Drawable drawable) {
        l();
        this.f2659b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@androidx.annotation.e1 int i10) {
        if (this.f2669l != i10) {
            this.f2669l = i10;
            if (i10 == 0) {
                this.f2668k = getContext();
            } else {
                this.f2668k = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(@androidx.annotation.d1 int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f2661d;
            if (textView != null && A(textView)) {
                removeView(this.f2661d);
                this.F.remove(this.f2661d);
            }
        } else {
            if (this.f2661d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f2661d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f2661d.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f2671n;
                if (i10 != 0) {
                    this.f2661d.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f2661d.setTextColor(colorStateList);
                }
            }
            if (!A(this.f2661d)) {
                e(this.f2661d, true);
            }
        }
        TextView textView2 = this.f2661d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2683z = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, @androidx.annotation.e1 int i10) {
        this.f2671n = i10;
        TextView textView = this.f2661d;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setSubtitleTextColor(@androidx.annotation.l int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(@androidx.annotation.n0 ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f2661d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(@androidx.annotation.d1 int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f2660c;
            if (textView != null && A(textView)) {
                removeView(this.f2660c);
                this.F.remove(this.f2660c);
            }
        } else {
            if (this.f2660c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f2660c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f2660c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f2670m;
                if (i10 != 0) {
                    this.f2660c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f2660c.setTextColor(colorStateList);
                }
            }
            if (!A(this.f2660c)) {
                e(this.f2660c, true);
            }
        }
        TextView textView2 = this.f2660c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2682y = charSequence;
    }

    public void setTitleMargin(int i10, int i11, int i12, int i13) {
        this.f2674q = i10;
        this.f2676s = i11;
        this.f2675r = i12;
        this.f2677t = i13;
        requestLayout();
    }

    public void setTitleMarginBottom(int i10) {
        this.f2677t = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f2675r = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f2674q = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f2676s = i10;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @androidx.annotation.e1 int i10) {
        this.f2670m = i10;
        TextView textView = this.f2660c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setTitleTextColor(@androidx.annotation.l int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(@androidx.annotation.n0 ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f2660c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean x() {
        d dVar = this.N;
        return (dVar == null || dVar.f2694c == null) ? false : true;
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f2659b;
        return actionMenuView != null && actionMenuView.I();
    }

    public void z(@androidx.annotation.l0 int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }
}
