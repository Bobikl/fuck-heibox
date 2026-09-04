package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.l0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.j0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b {
    private static final long B = 100;
    private static final int C = R.style.Widget_Material3_SearchView;
    private Map<View, Integer> A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final View f54902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ClippableRoundedCornerLayout f54903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f54904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f54905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final FrameLayout f54906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final FrameLayout f54907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final MaterialToolbar f54908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Toolbar f54909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final TextView f54910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final EditText f54911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ImageButton f54912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final View f54913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final TouchObserverFrameLayout f54914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f54915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final z f54916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f9.a f54917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Set<b> f54918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private SearchBar f54919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f54920t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f54921u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f54922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f54923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f54924x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f54925y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @n0
    private TransitionState f54926z;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        public Behavior(@n0 Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean l(@n0 CoordinatorLayout coordinatorLayout, @n0 SearchView searchView, @n0 View view) {
            if (searchView.v() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f54927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f54928c;

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
            this.f54927b = parcel.readString();
            this.f54928c = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f54927b);
            parcel.writeInt(this.f54928c);
        }
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.f54912l.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }
    }

    public interface b {
        void a(@n0 SearchView searchView, @n0 TransitionState transitionState, @n0 TransitionState transitionState2);
    }

    public SearchView(@n0 Context context) {
        this(context, null);
    }

    public SearchView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = C;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f54918r = new LinkedHashSet();
        this.f54920t = 16;
        this.f54926z = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.f52847j1, i10, i11, new int[0]);
        int resourceId = typedArrayK.getResourceId(R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayK.getResourceId(R.styleable.SearchView_android_textAppearance, -1);
        String string = typedArrayK.getString(R.styleable.SearchView_android_text);
        String string2 = typedArrayK.getString(R.styleable.SearchView_android_hint);
        String string3 = typedArrayK.getString(R.styleable.SearchView_searchPrefixText);
        boolean z10 = typedArrayK.getBoolean(R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.f54921u = typedArrayK.getBoolean(R.styleable.SearchView_animateNavigationIcon, true);
        this.f54922v = typedArrayK.getBoolean(R.styleable.SearchView_animateMenuItems, true);
        boolean z11 = typedArrayK.getBoolean(R.styleable.SearchView_hideNavigationIcon, false);
        this.f54923w = typedArrayK.getBoolean(R.styleable.SearchView_autoShowKeyboard, true);
        typedArrayK.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.f54915o = true;
        this.f54902b = findViewById(R.id.search_view_scrim);
        this.f54903c = (ClippableRoundedCornerLayout) findViewById(R.id.search_view_root);
        this.f54904d = findViewById(R.id.search_view_background);
        this.f54905e = findViewById(R.id.search_view_status_bar_spacer);
        this.f54906f = (FrameLayout) findViewById(R.id.search_view_header_container);
        this.f54907g = (FrameLayout) findViewById(R.id.search_view_toolbar_container);
        this.f54908h = (MaterialToolbar) findViewById(R.id.search_view_toolbar);
        this.f54909i = (Toolbar) findViewById(R.id.search_view_dummy_toolbar);
        this.f54910j = (TextView) findViewById(R.id.search_view_search_prefix);
        this.f54911k = (EditText) findViewById(R.id.search_view_edit_text);
        this.f54912l = (ImageButton) findViewById(R.id.search_view_clear_button);
        this.f54913m = findViewById(R.id.search_view_divider);
        this.f54914n = (TouchObserverFrameLayout) findViewById(R.id.search_view_content_container);
        this.f54916p = new z(this);
        this.f54917q = new f9.a(context2);
        U();
        O();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        S(resourceId2, string, string2);
        N(z10, z11);
        P();
        Q();
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(View view) {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(View view) {
        n();
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean C(View view, MotionEvent motionEvent) {
        if (!q()) {
            return false;
        }
        m();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ n3 D(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, View view, n3 n3Var) {
        marginLayoutParams.leftMargin = i10 + n3Var.p();
        marginLayoutParams.rightMargin = i11 + n3Var.q();
        return n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean E(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n3 F(View view, n3 n3Var) {
        int iR = n3Var.r();
        setUpStatusBarSpacer(iR);
        if (!this.f54925y) {
            setStatusBarSpacerEnabledInternal(iR > 0);
        }
        return n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n3 G(View view, n3 n3Var, j0.f fVar) {
        boolean zQ = j0.q(this.f54908h);
        this.f54908h.setPadding((zQ ? fVar.f54523c : fVar.f54521a) + n3Var.p(), fVar.f54522b, (zQ ? fVar.f54521a : fVar.f54523c) + n3Var.q(), fVar.f54524d);
        return n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        X();
    }

    private void N(boolean z10, boolean z11) {
        if (z11) {
            this.f54908h.setNavigationIcon((Drawable) null);
            return;
        }
        this.f54908h.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f54970b.A(view);
            }
        });
        if (z10) {
            androidx.appcompat.graphics.drawable.d dVar = new androidx.appcompat.graphics.drawable.d(getContext());
            dVar.p(com.google.android.material.color.m.d(this, R.attr.colorOnSurface));
            this.f54908h.setNavigationIcon(dVar);
        }
    }

    private void O() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void P() {
        this.f54912l.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f54977b.B(view);
            }
        });
        this.f54911k.addTextChangedListener(new a());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Q() {
        this.f54914n.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f54969b.C(view, motionEvent);
            }
        });
    }

    private void R() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f54913m.getLayoutParams();
        final int i10 = marginLayoutParams.leftMargin;
        final int i11 = marginLayoutParams.rightMargin;
        j1.a2(this.f54913m, new z0() { // from class: com.google.android.material.search.m
            @Override // androidx.core.view.z0
            public final n3 a(View view, n3 n3Var) {
                return SearchView.D(marginLayoutParams, i10, i11, view, n3Var);
            }
        });
    }

    private void S(@e1 int i10, String str, String str2) {
        if (i10 != -1) {
            androidx.core.widget.q.E(this.f54911k, i10);
        }
        this.f54911k.setText(str);
        this.f54911k.setHint(str2);
    }

    private void T() {
        W();
        R();
        V();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void U() {
        this.f54903c.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.E(view, motionEvent);
            }
        });
    }

    private void V() {
        setUpStatusBarSpacer(getStatusBarHeight());
        j1.a2(this.f54905e, new z0() { // from class: com.google.android.material.search.n
            @Override // androidx.core.view.z0
            public final n3 a(View view, n3 n3Var) {
                return this.f54974b.F(view, n3Var);
            }
        });
    }

    private void W() {
        j0.f(this.f54908h, new j0.e() { // from class: com.google.android.material.search.r
            @Override // com.google.android.material.internal.j0.e
            public final n3 a(View view, n3 n3Var, j0.f fVar) {
                return this.f54978a.G(view, n3Var, fVar);
            }
        });
    }

    @SuppressLint({"InlinedApi"})
    private void Y(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f54903c.getId()) != null) {
                    Y((ViewGroup) childAt, z10);
                } else if (z10) {
                    this.A.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    j1.R1(childAt, 4);
                } else {
                    Map<View, Integer> map = this.A;
                    if (map != null && map.containsKey(childAt)) {
                        j1.R1(childAt, this.A.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void Z() {
        MaterialToolbar materialToolbar = this.f54908h;
        if (materialToolbar == null || u(materialToolbar)) {
            return;
        }
        int i10 = R.drawable.ic_arrow_back_black_24;
        if (this.f54919s == null) {
            this.f54908h.setNavigationIcon(i10);
            return;
        }
        Drawable drawableR = androidx.core.graphics.drawable.d.r(b0.a.b(getContext(), i10).mutate());
        if (this.f54908h.getNavigationIconTint() != null) {
            androidx.core.graphics.drawable.d.n(drawableR, this.f54908h.getNavigationIconTint().intValue());
        }
        this.f54908h.setNavigationIcon(new com.google.android.material.internal.i(this.f54919s.getNavigationIcon(), drawableR));
        a0();
    }

    private void a0() {
        ImageButton imageButtonE = d0.e(this.f54908h);
        if (imageButtonE == null) {
            return;
        }
        int i10 = this.f54903c.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = androidx.core.graphics.drawable.d.q(imageButtonE.getDrawable());
        if (drawableQ instanceof androidx.appcompat.graphics.drawable.d) {
            ((androidx.appcompat.graphics.drawable.d) drawableQ).setProgress(i10);
        }
        if (drawableQ instanceof com.google.android.material.internal.i) {
            ((com.google.android.material.internal.i) drawableQ).a(i10);
        }
    }

    @p0
    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.c.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f54919s;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @t0
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        this.f54905e.setVisibility(z10 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        f9.a aVar = this.f54917q;
        if (aVar == null || this.f54904d == null) {
            return;
        }
        this.f54904d.setBackgroundColor(aVar.g(f10));
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            k(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) this.f54906f, false));
        }
    }

    private void setUpStatusBarSpacer(@t0 int i10) {
        if (this.f54905e.getLayoutParams().height != i10) {
            this.f54905e.getLayoutParams().height = i10;
            this.f54905e.requestLayout();
        }
    }

    private boolean u(@n0 Toolbar toolbar) {
        return androidx.core.graphics.drawable.d.q(toolbar.getNavigationIcon()) instanceof androidx.appcompat.graphics.drawable.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.f54911k.clearFocus();
        SearchBar searchBar = this.f54919s;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        j0.p(this.f54911k, this.f54924x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        if (this.f54911k.requestFocus()) {
            this.f54911k.sendAccessibilityEvent(8);
        }
        j0.y(this.f54911k, this.f54924x);
    }

    public void I() {
        this.f54906f.removeAllViews();
        this.f54906f.setVisibility(8);
    }

    public void J(@n0 View view) {
        this.f54906f.removeView(view);
        if (this.f54906f.getChildCount() == 0) {
            this.f54906f.setVisibility(8);
        }
    }

    public void K(@n0 b bVar) {
        this.f54918r.remove(bVar);
    }

    public void L() {
        this.f54911k.postDelayed(new Runnable() { // from class: com.google.android.material.search.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f54975b.z();
            }
        }, 100L);
    }

    void M() {
        if (this.f54923w) {
            L();
        }
    }

    public void X() {
        if (this.f54926z.equals(TransitionState.SHOWN) || this.f54926z.equals(TransitionState.SHOWING)) {
            return;
        }
        this.f54916p.V();
        setModalForAccessibility(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f54915o) {
            this.f54914n.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public void b0() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f54920t = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @n0
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @n0
    public TransitionState getCurrentTransitionState() {
        return this.f54926z;
    }

    @n0
    public EditText getEditText() {
        return this.f54911k;
    }

    @p0
    public CharSequence getHint() {
        return this.f54911k.getHint();
    }

    @n0
    public TextView getSearchPrefix() {
        return this.f54910j;
    }

    @p0
    public CharSequence getSearchPrefixText() {
        return this.f54910j.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f54920t;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @p0
    public Editable getText() {
        return this.f54911k.getText();
    }

    @n0
    public Toolbar getToolbar() {
        return this.f54908h;
    }

    public void k(@n0 View view) {
        this.f54906f.addView(view);
        this.f54906f.setVisibility(0);
    }

    public void l(@n0 b bVar) {
        this.f54918r.add(bVar);
    }

    public void m() {
        this.f54911k.post(new Runnable() { // from class: com.google.android.material.search.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f54979b.y();
            }
        });
    }

    public void n() {
        this.f54911k.setText("");
    }

    public void o() {
        if (this.f54926z.equals(TransitionState.HIDDEN) || this.f54926z.equals(TransitionState.HIDING)) {
            return;
        }
        this.f54916p.J();
        setModalForAccessibility(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f54927b);
        setVisible(savedState.f54928c == 0);
    }

    @Override // android.view.View
    @n0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f54927b = text == null ? null : text.toString();
        savedState.f54928c = this.f54903c.getVisibility();
        return savedState;
    }

    public void p(@l0 int i10) {
        this.f54908h.z(i10);
    }

    boolean q() {
        return this.f54920t == 48;
    }

    public boolean r() {
        return this.f54921u;
    }

    public boolean s() {
        return this.f54923w;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f54921u = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f54923w = z10;
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(@d1 int i10) {
        this.f54911k.setHint(i10);
    }

    public void setHint(@p0 CharSequence charSequence) {
        this.f54911k.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f54922v = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.A = new HashMap(viewGroup.getChildCount());
        }
        Y(viewGroup, z10);
        if (z10) {
            return;
        }
        this.A = null;
    }

    public void setOnMenuItemClickListener(@p0 Toolbar.e eVar) {
        this.f54908h.setOnMenuItemClickListener(eVar);
    }

    public void setSearchPrefixText(@p0 CharSequence charSequence) {
        this.f54910j.setText(charSequence);
        this.f54910j.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f54925y = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    public void setText(@d1 int i10) {
        this.f54911k.setText(i10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@p0 CharSequence charSequence) {
        this.f54911k.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f54908h.setTouchscreenBlocksFocus(z10);
    }

    void setTransitionState(@n0 TransitionState transitionState) {
        if (this.f54926z.equals(transitionState)) {
            return;
        }
        TransitionState transitionState2 = this.f54926z;
        this.f54926z = transitionState;
        Iterator it = new LinkedHashSet(this.f54918r).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, transitionState2, transitionState);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z10) {
        this.f54924x = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11 = this.f54903c.getVisibility() == 0;
        this.f54903c.setVisibility(z10 ? 0 : 8);
        a0();
        if (z11 != z10) {
            setModalForAccessibility(z10);
        }
        setTransitionState(z10 ? TransitionState.SHOWN : TransitionState.HIDDEN);
    }

    public void setupWithSearchBar(@p0 SearchBar searchBar) {
        this.f54919s = searchBar;
        this.f54916p.T(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f54976b.H(view);
                }
            });
        }
        Z();
        O();
    }

    public boolean t() {
        return this.f54922v;
    }

    public boolean v() {
        return this.f54919s != null;
    }

    public boolean w() {
        return this.f54926z.equals(TransitionState.SHOWN) || this.f54926z.equals(TransitionState.SHOWING);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean x() {
        return this.f54924x;
    }
}
