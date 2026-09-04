package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a0;
import androidx.core.view.c3;
import androidx.core.view.d3;
import androidx.core.view.e3;
import androidx.core.view.f3;
import androidx.core.view.j1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: WindowDecorActionBar.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class r extends ActionBar implements ActionBarOverlayLayout.d {
    private static final String N = "WindowDecorActionBar";
    private static final Interpolator O = new AccelerateInterpolator();
    private static final Interpolator P = new DecelerateInterpolator();
    private static final int Q = -1;
    private static final long R = 100;
    private static final long S = 200;
    private boolean A;
    boolean D;
    boolean E;
    private boolean F;
    androidx.appcompat.view.h H;
    private boolean I;
    boolean J;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Context f1869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f1870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Activity f1871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ActionBarOverlayLayout f1872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ActionBarContainer f1873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    a0 f1874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ActionBarContextView f1875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f1876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ScrollingTabContainerView f1877q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f1879s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1881u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    d f1882v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    androidx.appcompat.view.b f1883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.b.a f1884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1885y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<e> f1878r = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1880t = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList<ActionBar.c> f1886z = new ArrayList<>();
    private int B = 0;
    boolean C = true;
    private boolean G = true;
    final d3 K = new a();
    final d3 L = new b();
    final f3 M = new c();

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class a extends e3 {
        a() {
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void b(View view) {
            View view2;
            r rVar = r.this;
            if (rVar.C && (view2 = rVar.f1876p) != null) {
                view2.setTranslationY(0.0f);
                r.this.f1873m.setTranslationY(0.0f);
            }
            r.this.f1873m.setVisibility(8);
            r.this.f1873m.setTransitioning(false);
            r rVar2 = r.this;
            rVar2.H = null;
            rVar2.G0();
            ActionBarOverlayLayout actionBarOverlayLayout = r.this.f1872l;
            if (actionBarOverlayLayout != null) {
                j1.v1(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class b extends e3 {
        b() {
        }

        @Override // androidx.core.view.e3, androidx.core.view.d3
        public void b(View view) {
            r rVar = r.this;
            rVar.H = null;
            rVar.f1873m.requestLayout();
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class c implements f3 {
        c() {
        }

        @Override // androidx.core.view.f3
        public void a(View view) {
            ((View) r.this.f1873m.getParent()).invalidate();
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class d extends androidx.appcompat.view.b implements androidx.appcompat.view.menu.g.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f1890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f1891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.appcompat.view.b.a f1892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private WeakReference<View> f1893g;

        public d(Context context, androidx.appcompat.view.b.a aVar) {
            this.f1890d = context;
            this.f1892f = aVar;
            androidx.appcompat.view.menu.g gVarZ = new androidx.appcompat.view.menu.g(context).Z(1);
            this.f1891e = gVarZ;
            gVarZ.X(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@n0 androidx.appcompat.view.menu.g gVar, @n0 MenuItem menuItem) {
            androidx.appcompat.view.b.a aVar = this.f1892f;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@n0 androidx.appcompat.view.menu.g gVar) {
            if (this.f1892f == null) {
                return;
            }
            k();
            r.this.f1875o.o();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            r rVar = r.this;
            if (rVar.f1882v != this) {
                return;
            }
            if (r.E0(rVar.D, rVar.E, false)) {
                this.f1892f.d(this);
            } else {
                r rVar2 = r.this;
                rVar2.f1883w = this;
                rVar2.f1884x = this.f1892f;
            }
            this.f1892f = null;
            r.this.D0(false);
            r.this.f1875o.p();
            r rVar3 = r.this;
            rVar3.f1872l.setHideOnContentScrollEnabled(rVar3.J);
            r.this.f1882v = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f1893g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f1891e;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f1890d);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return r.this.f1875o.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return r.this.f1875o.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (r.this.f1882v != this) {
                return;
            }
            this.f1891e.m0();
            try {
                this.f1892f.c(this, this.f1891e);
            } finally {
                this.f1891e.l0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return r.this.f1875o.s();
        }

        @Override // androidx.appcompat.view.b
        public void n(View view) {
            r.this.f1875o.setCustomView(view);
            this.f1893g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void o(int i10) {
            p(r.this.f1869i.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void p(CharSequence charSequence) {
            r.this.f1875o.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void r(int i10) {
            s(r.this.f1869i.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void s(CharSequence charSequence) {
            r.this.f1875o.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void t(boolean z10) {
            super.t(z10);
            r.this.f1875o.setTitleOptional(z10);
        }

        public boolean u() {
            this.f1891e.m0();
            try {
                return this.f1892f.a(this, this.f1891e);
            } finally {
                this.f1891e.l0();
            }
        }

        public void v(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        public void w(androidx.appcompat.view.menu.r rVar) {
        }

        public boolean x(androidx.appcompat.view.menu.r rVar) {
            if (this.f1892f == null) {
                return false;
            }
            if (!rVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.l(r.this.z(), rVar).l();
            return true;
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class e extends ActionBar.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ActionBar.f f1895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f1896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Drawable f1897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f1898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CharSequence f1899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f1900g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f1901h;

        public e() {
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public CharSequence a() {
            return this.f1899f;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public View b() {
            return this.f1901h;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public Drawable c() {
            return this.f1897d;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public int d() {
            return this.f1900g;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public Object e() {
            return this.f1896c;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public CharSequence f() {
            return this.f1898e;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public void g() {
            r.this.R(this);
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e h(int i10) {
            return i(r.this.f1869i.getResources().getText(i10));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e i(CharSequence charSequence) {
            this.f1899f = charSequence;
            int i10 = this.f1900g;
            if (i10 >= 0) {
                r.this.f1877q.m(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e j(int i10) {
            return k(LayoutInflater.from(r.this.z()).inflate(i10, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e k(View view) {
            this.f1901h = view;
            int i10 = this.f1900g;
            if (i10 >= 0) {
                r.this.f1877q.m(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e l(int i10) {
            return m(b0.a.b(r.this.f1869i, i10));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e m(Drawable drawable) {
            this.f1897d = drawable;
            int i10 = this.f1900g;
            if (i10 >= 0) {
                r.this.f1877q.m(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e n(ActionBar.f fVar) {
            this.f1895b = fVar;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e o(Object obj) {
            this.f1896c = obj;
            return this;
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e p(int i10) {
            return q(r.this.f1869i.getResources().getText(i10));
        }

        @Override // androidx.appcompat.app.ActionBar.e
        public ActionBar.e q(CharSequence charSequence) {
            this.f1898e = charSequence;
            int i10 = this.f1900g;
            if (i10 >= 0) {
                r.this.f1877q.m(i10);
            }
            return this;
        }

        public ActionBar.f r() {
            return this.f1895b;
        }

        public void s(int i10) {
            this.f1900g = i10;
        }
    }

    public r(Activity activity, boolean z10) {
        this.f1871k = activity;
        View decorView = activity.getWindow().getDecorView();
        P0(decorView);
        if (z10) {
            return;
        }
        this.f1876p = decorView.findViewById(R.id.content);
    }

    public r(Dialog dialog) {
        P0(dialog.getWindow().getDecorView());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public r(View view) {
        P0(view);
    }

    static boolean E0(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    private void F0() {
        if (this.f1879s != null) {
            R(null);
        }
        this.f1878r.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.f1877q;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.k();
        }
        this.f1880t = -1;
    }

    private void H0(ActionBar.e eVar, int i10) {
        e eVar2 = (e) eVar;
        if (eVar2.r() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        eVar2.s(i10);
        this.f1878r.add(i10, eVar2);
        int size = this.f1878r.size();
        while (true) {
            i10++;
            if (i10 >= size) {
                return;
            } else {
                this.f1878r.get(i10).s(i10);
            }
        }
    }

    private void K0() {
        if (this.f1877q != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.f1869i);
        if (this.A) {
            scrollingTabContainerView.setVisibility(0);
            this.f1874n.K(scrollingTabContainerView);
        } else {
            if (t() == 2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1872l;
                if (actionBarOverlayLayout != null) {
                    j1.v1(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
            this.f1873m.setTabContainer(scrollingTabContainerView);
        }
        this.f1877q = scrollingTabContainerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a0 L0(View view) {
        if (view instanceof a0) {
            return (a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void O0() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1872l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T0(false);
        }
    }

    private void P0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(androidx.appcompat.R.id.decor_content_parent);
        this.f1872l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1874n = L0(view.findViewById(androidx.appcompat.R.id.action_bar));
        this.f1875o = (ActionBarContextView) view.findViewById(androidx.appcompat.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(androidx.appcompat.R.id.action_bar_container);
        this.f1873m = actionBarContainer;
        a0 a0Var = this.f1874n;
        if (a0Var == null || this.f1875o == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1869i = a0Var.getContext();
        boolean z10 = (this.f1874n.z() & 4) != 0;
        if (z10) {
            this.f1881u = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f1869i);
        l0(aVarB.a() || z10);
        Q0(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f1869i.obtainStyledAttributes(null, androidx.appcompat.R.styleable.f1568a, androidx.appcompat.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.ActionBar_hideOnContentScroll, false)) {
            g0(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            e0(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void Q0(boolean z10) {
        this.A = z10;
        if (z10) {
            this.f1873m.setTabContainer(null);
            this.f1874n.K(this.f1877q);
        } else {
            this.f1874n.K(null);
            this.f1873m.setTabContainer(this.f1877q);
        }
        boolean z11 = t() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f1877q;
        if (scrollingTabContainerView != null) {
            if (z11) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1872l;
                if (actionBarOverlayLayout != null) {
                    j1.v1(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f1874n.s(!this.A && z11);
        this.f1872l.setHasNonEmbeddedTabs(!this.A && z11);
    }

    private boolean R0() {
        return j1.U0(this.f1873m);
    }

    private void S0() {
        if (this.F) {
            return;
        }
        this.F = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1872l;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        T0(false);
    }

    private void T0(boolean z10) {
        if (E0(this.D, this.E, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            J0(z10);
            return;
        }
        if (this.G) {
            this.G = false;
            I0(z10);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence A() {
        return this.f1874n.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void A0(CharSequence charSequence) {
        this.f1874n.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B() {
        if (this.D) {
            return;
        }
        this.D = true;
        T0(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B0() {
        if (this.D) {
            this.D = false;
            T0(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.view.b C0(androidx.appcompat.view.b.a aVar) {
        d dVar = this.f1882v;
        if (dVar != null) {
            dVar.c();
        }
        this.f1872l.setHideOnContentScrollEnabled(false);
        this.f1875o.t();
        d dVar2 = new d(this.f1875o.getContext(), aVar);
        if (!dVar2.u()) {
            return null;
        }
        this.f1882v = dVar2;
        dVar2.k();
        this.f1875o.q(dVar2);
        D0(true);
        return dVar2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean D() {
        return this.f1872l.u();
    }

    public void D0(boolean z10) {
        c3 c3VarG;
        c3 c3VarN;
        if (z10) {
            S0();
        } else {
            O0();
        }
        if (!R0()) {
            if (z10) {
                this.f1874n.setVisibility(4);
                this.f1875o.setVisibility(0);
                return;
            } else {
                this.f1874n.setVisibility(0);
                this.f1875o.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c3VarN = this.f1874n.G(4, 100L);
            c3VarG = this.f1875o.n(0, S);
        } else {
            c3VarG = this.f1874n.G(0, S);
            c3VarN = this.f1875o.n(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(c3VarN, c3VarG);
        hVar.h();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean E() {
        int iQ = q();
        return this.G && (iQ == 0 || r() < iQ);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean F() {
        a0 a0Var = this.f1874n;
        return a0Var != null && a0Var.j();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e G() {
        return new e();
    }

    void G0() {
        androidx.appcompat.view.b.a aVar = this.f1884x;
        if (aVar != null) {
            aVar.d(this.f1883w);
            this.f1883w = null;
            this.f1884x = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void H(Configuration configuration) {
        Q0(androidx.appcompat.view.a.b(this.f1869i).g());
    }

    public void I0(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        if (this.B != 0 || (!this.I && !z10)) {
            this.K.b(null);
            return;
        }
        this.f1873m.setAlpha(1.0f);
        this.f1873m.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f1873m.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f1873m.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        c3 c3VarB = j1.g(this.f1873m).B(f10);
        c3VarB.x(this.M);
        hVar2.c(c3VarB);
        if (this.C && (view = this.f1876p) != null) {
            hVar2.c(j1.g(view).B(f10));
        }
        hVar2.f(O);
        hVar2.e(250L);
        hVar2.g(this.K);
        this.H = hVar2;
        hVar2.h();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean J(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f1882v;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    public void J0(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        this.f1873m.setVisibility(0);
        if (this.B == 0 && (this.I || z10)) {
            this.f1873m.setTranslationY(0.0f);
            float f10 = -this.f1873m.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f1873m.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f1873m.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            c3 c3VarB = j1.g(this.f1873m).B(0.0f);
            c3VarB.x(this.M);
            hVar2.c(c3VarB);
            if (this.C && (view2 = this.f1876p) != null) {
                view2.setTranslationY(f10);
                hVar2.c(j1.g(this.f1876p).B(0.0f));
            }
            hVar2.f(P);
            hVar2.e(250L);
            hVar2.g(this.L);
            this.H = hVar2;
            hVar2.h();
        } else {
            this.f1873m.setAlpha(1.0f);
            this.f1873m.setTranslationY(0.0f);
            if (this.C && (view = this.f1876p) != null) {
                view.setTranslationY(0.0f);
            }
            this.L.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1872l;
        if (actionBarOverlayLayout != null) {
            j1.v1(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void M() {
        F0();
    }

    public boolean M0() {
        return this.f1874n.e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void N(ActionBar.c cVar) {
        this.f1886z.remove(cVar);
    }

    public boolean N0() {
        return this.f1874n.g();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void O(ActionBar.e eVar) {
        P(eVar.d());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void P(int i10) {
        if (this.f1877q == null) {
            return;
        }
        e eVar = this.f1879s;
        int iD = eVar != null ? eVar.d() : this.f1880t;
        this.f1877q.l(i10);
        e eVarRemove = this.f1878r.remove(i10);
        if (eVarRemove != null) {
            eVarRemove.s(-1);
        }
        int size = this.f1878r.size();
        for (int i11 = i10; i11 < size; i11++) {
            this.f1878r.get(i11).s(i11);
        }
        if (iD == i10) {
            R(this.f1878r.isEmpty() ? null : this.f1878r.get(Math.max(0, i10 - 1)));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean Q() {
        ViewGroup viewGroupH = this.f1874n.H();
        if (viewGroupH == null || viewGroupH.hasFocus()) {
            return false;
        }
        viewGroupH.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void R(ActionBar.e eVar) {
        if (t() != 2) {
            this.f1880t = eVar != null ? eVar.d() : -1;
            return;
        }
        p0 p0VarS = (!(this.f1871k instanceof FragmentActivity) || this.f1874n.H().isInEditMode()) ? null : ((FragmentActivity) this.f1871k).getSupportFragmentManager().u().s();
        e eVar2 = this.f1879s;
        if (eVar2 != eVar) {
            this.f1877q.setTabSelected(eVar != null ? eVar.d() : -1);
            e eVar3 = this.f1879s;
            if (eVar3 != null) {
                eVar3.r().c(this.f1879s, p0VarS);
            }
            e eVar4 = (e) eVar;
            this.f1879s = eVar4;
            if (eVar4 != null) {
                eVar4.r().a(this.f1879s, p0VarS);
            }
        } else if (eVar2 != null) {
            eVar2.r().b(this.f1879s, p0VarS);
            this.f1877q.c(eVar.d());
        }
        if (p0VarS == null || p0VarS.w()) {
            return;
        }
        p0VarS.m();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void S(Drawable drawable) {
        this.f1873m.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void T(int i10) {
        U(LayoutInflater.from(z()).inflate(i10, this.f1874n.H(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void U(View view) {
        this.f1874n.A(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void V(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f1874n.A(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void W(boolean z10) {
        if (this.f1881u) {
            return;
        }
        X(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void X(boolean z10) {
        Z(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Y(int i10) {
        if ((i10 & 4) != 0) {
            this.f1881u = true;
        }
        this.f1874n.k(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Z(int i10, int i11) {
        int iZ = this.f1874n.z();
        if ((i11 & 4) != 0) {
            this.f1881u = true;
        }
        this.f1874n.k((i10 & i11) | ((~i11) & iZ));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.E) {
            this.E = false;
            T0(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void a0(boolean z10) {
        Z(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void b0(boolean z10) {
        Z(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        if (this.E) {
            return;
        }
        this.E = true;
        T0(true);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void c0(boolean z10) {
        Z(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        androidx.appcompat.view.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            this.H = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void d0(boolean z10) {
        Z(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z10) {
        this.C = z10;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void e0(float f10) {
        j1.N1(this.f1873m, f10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f(ActionBar.c cVar) {
        this.f1886z.add(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f0(int i10) {
        if (i10 != 0 && !this.f1872l.v()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f1872l.setActionBarHideOffset(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g(ActionBar.e eVar) {
        j(eVar, this.f1878r.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g0(boolean z10) {
        if (z10 && !this.f1872l.v()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = z10;
        this.f1872l.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(ActionBar.e eVar, int i10) {
        i(eVar, i10, this.f1878r.isEmpty());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h0(int i10) {
        this.f1874n.p(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i(ActionBar.e eVar, int i10, boolean z10) {
        K0();
        this.f1877q.a(eVar, i10, z10);
        H0(eVar, i10);
        if (z10) {
            R(eVar);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i0(CharSequence charSequence) {
        this.f1874n.l(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j(ActionBar.e eVar, boolean z10) {
        K0();
        this.f1877q.b(eVar, z10);
        H0(eVar, this.f1878r.size());
        if (z10) {
            R(eVar);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j0(int i10) {
        this.f1874n.M(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k0(Drawable drawable) {
        this.f1874n.C(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean l() {
        a0 a0Var = this.f1874n;
        if (a0Var == null || !a0Var.i()) {
            return false;
        }
        this.f1874n.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l0(boolean z10) {
        this.f1874n.I(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(boolean z10) {
        if (z10 == this.f1885y) {
            return;
        }
        this.f1885y = z10;
        int size = this.f1886z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1886z.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m0(int i10) {
        this.f1874n.setIcon(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public View n() {
        return this.f1874n.u();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n0(Drawable drawable) {
        this.f1874n.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int o() {
        return this.f1874n.z();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o0(SpinnerAdapter spinnerAdapter, ActionBar.d dVar) {
        this.f1874n.O(spinnerAdapter, new m(dVar));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.B = i10;
    }

    @Override // androidx.appcompat.app.ActionBar
    public float p() {
        return j1.R(this.f1873m);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void p0(int i10) {
        this.f1874n.setLogo(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int q() {
        return this.f1873m.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void q0(Drawable drawable) {
        this.f1874n.v(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int r() {
        return this.f1872l.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r0(int i10) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int iM = this.f1874n.m();
        if (iM == 2) {
            this.f1880t = u();
            R(null);
            this.f1877q.setVisibility(8);
        }
        if (iM != i10 && !this.A && (actionBarOverlayLayout = this.f1872l) != null) {
            j1.v1(actionBarOverlayLayout);
        }
        this.f1874n.n(i10);
        boolean z10 = false;
        if (i10 == 2) {
            K0();
            this.f1877q.setVisibility(0);
            int i11 = this.f1880t;
            if (i11 != -1) {
                s0(i11);
                this.f1880t = -1;
            }
        }
        this.f1874n.s(i10 == 2 && !this.A);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1872l;
        if (i10 == 2 && !this.A) {
            z10 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int s() {
        int iM = this.f1874n.m();
        if (iM == 1) {
            return this.f1874n.r();
        }
        if (iM != 2) {
            return 0;
        }
        return this.f1878r.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s0(int i10) {
        int iM = this.f1874n.m();
        if (iM == 1) {
            this.f1874n.E(i10);
        } else {
            if (iM != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            R(this.f1878r.get(i10));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public int t() {
        return this.f1874n.m();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t0(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.I = z10;
        if (z10 || (hVar = this.H) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public int u() {
        e eVar;
        int iM = this.f1874n.m();
        if (iM == 1) {
            return this.f1874n.o();
        }
        if (iM == 2 && (eVar = this.f1879s) != null) {
            return eVar.d();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e v() {
        return this.f1879s;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v0(Drawable drawable) {
        this.f1873m.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence w() {
        return this.f1874n.Q();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void w0(int i10) {
        x0(this.f1869i.getString(i10));
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e x(int i10) {
        return this.f1878r.get(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void x0(CharSequence charSequence) {
        this.f1874n.D(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int y() {
        return this.f1878r.size();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void y0(int i10) {
        z0(this.f1869i.getString(i10));
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context z() {
        if (this.f1870j == null) {
            TypedValue typedValue = new TypedValue();
            this.f1869i.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f1870j = new ContextThemeWrapper(this.f1869i, i10);
            } else {
                this.f1870j = this.f1869i;
            }
        }
        return this.f1870j;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void z0(CharSequence charSequence) {
        this.f1874n.setTitle(charSequence);
    }
}
