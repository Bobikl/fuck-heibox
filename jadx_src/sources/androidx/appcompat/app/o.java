package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.z0;
import androidx.core.view.j1;
import java.util.ArrayList;

/* JADX INFO: compiled from: ToolbarActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public class o extends ActionBar {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final a0 f1827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Window.Callback f1828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final AppCompatDelegateImpl.i f1829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f1830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<ActionBar.c> f1833o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f1834p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Toolbar.e f1835q;

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.E0();
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class b implements Toolbar.e {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            return o.this.f1828j.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public final class c implements androidx.appcompat.view.menu.m.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1838b;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(@n0 androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (this.f1838b) {
                return;
            }
            this.f1838b = true;
            o.this.f1827i.t();
            o.this.f1828j.onPanelClosed(108, gVar);
            this.f1838b = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(@n0 androidx.appcompat.view.menu.g gVar) {
            o.this.f1828j.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public final class d implements androidx.appcompat.view.menu.g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@n0 androidx.appcompat.view.menu.g gVar, @n0 MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@n0 androidx.appcompat.view.menu.g gVar) {
            if (o.this.f1827i.d()) {
                o.this.f1828j.onPanelClosed(108, gVar);
            } else if (o.this.f1828j.onPreparePanel(0, null, gVar)) {
                o.this.f1828j.onMenuOpened(108, gVar);
            }
        }
    }

    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class e implements AppCompatDelegateImpl.i {
        e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.i
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            o oVar = o.this;
            if (oVar.f1830l) {
                return false;
            }
            oVar.f1827i.setMenuPrepared();
            o.this.f1830l = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.i
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(o.this.f1827i.getContext());
            }
            return null;
        }
    }

    o(@n0 Toolbar toolbar, @p0 CharSequence charSequence, @n0 Window.Callback callback) {
        b bVar = new b();
        this.f1835q = bVar;
        androidx.core.util.o.l(toolbar);
        z0 z0Var = new z0(toolbar, false);
        this.f1827i = z0Var;
        this.f1828j = (Window.Callback) androidx.core.util.o.l(callback);
        z0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        z0Var.setWindowTitle(charSequence);
        this.f1829k = new e();
    }

    private Menu D0() {
        if (!this.f1831m) {
            this.f1827i.N(new c(), new d());
            this.f1831m = true;
        }
        return this.f1827i.F();
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence A() {
        return this.f1827i.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void A0(CharSequence charSequence) {
        this.f1827i.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B() {
        this.f1827i.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B0() {
        this.f1827i.setVisibility(0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean C() {
        this.f1827i.H().removeCallbacks(this.f1834p);
        j1.p1(this.f1827i.H(), this.f1834p);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean E() {
        return this.f1827i.getVisibility() == 0;
    }

    void E0() {
        Menu menuD0 = D0();
        androidx.appcompat.view.menu.g gVar = menuD0 instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menuD0 : null;
        if (gVar != null) {
            gVar.m0();
        }
        try {
            menuD0.clear();
            if (!this.f1828j.onCreatePanelMenu(0, menuD0) || !this.f1828j.onPreparePanel(0, null, menuD0)) {
                menuD0.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.l0();
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean F() {
        return super.F();
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e G() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void H(Configuration configuration) {
        super.H(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    void I() {
        this.f1827i.H().removeCallbacks(this.f1834p);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean J(int i10, KeyEvent keyEvent) {
        Menu menuD0 = D0();
        if (menuD0 == null) {
            return false;
        }
        menuD0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuD0.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean K(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            L();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean L() {
        return this.f1827i.c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void M() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void N(ActionBar.c cVar) {
        this.f1833o.remove(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void O(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void P(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean Q() {
        ViewGroup viewGroupH = this.f1827i.H();
        if (viewGroupH == null || viewGroupH.hasFocus()) {
            return false;
        }
        viewGroupH.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void R(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void S(@p0 Drawable drawable) {
        this.f1827i.a(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void T(int i10) {
        U(LayoutInflater.from(this.f1827i.getContext()).inflate(i10, this.f1827i.H(), false));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void U(View view) {
        V(view, new ActionBar.LayoutParams(-2, -2));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void V(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f1827i.A(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void W(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void X(boolean z10) {
        Z(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    @SuppressLint({"WrongConstant"})
    public void Y(int i10) {
        Z(i10, -1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void Z(int i10, int i11) {
        this.f1827i.k((i10 & i11) | ((~i11) & this.f1827i.z()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void a0(boolean z10) {
        Z(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void b0(boolean z10) {
        Z(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void c0(boolean z10) {
        Z(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void d0(boolean z10) {
        Z(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void e0(float f10) {
        j1.N1(this.f1827i.H(), f10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void f(ActionBar.c cVar) {
        this.f1833o.add(cVar);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void g(ActionBar.e eVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(ActionBar.e eVar, int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h0(int i10) {
        this.f1827i.p(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i(ActionBar.e eVar, int i10, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void i0(CharSequence charSequence) {
        this.f1827i.l(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j(ActionBar.e eVar, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void j0(int i10) {
        this.f1827i.M(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean k() {
        return this.f1827i.f();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k0(Drawable drawable) {
        this.f1827i.C(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean l() {
        if (!this.f1827i.i()) {
            return false;
        }
        this.f1827i.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void l0(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(boolean z10) {
        if (z10 == this.f1832n) {
            return;
        }
        this.f1832n = z10;
        int size = this.f1833o.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1833o.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m0(int i10) {
        this.f1827i.setIcon(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public View n() {
        return this.f1827i.u();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void n0(Drawable drawable) {
        this.f1827i.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int o() {
        return this.f1827i.z();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void o0(SpinnerAdapter spinnerAdapter, ActionBar.d dVar) {
        this.f1827i.O(spinnerAdapter, new m(dVar));
    }

    @Override // androidx.appcompat.app.ActionBar
    public float p() {
        return j1.R(this.f1827i.H());
    }

    @Override // androidx.appcompat.app.ActionBar
    public void p0(int i10) {
        this.f1827i.setLogo(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int q() {
        return this.f1827i.getHeight();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void q0(Drawable drawable) {
        this.f1827i.v(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r0(int i10) {
        if (i10 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f1827i.n(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int s() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s0(int i10) {
        if (this.f1827i.m() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f1827i.E(i10);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int t() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t0(boolean z10) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public int u() {
        return -1;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e v() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public CharSequence w() {
        return this.f1827i.Q();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void w0(int i10) {
        a0 a0Var = this.f1827i;
        a0Var.D(i10 != 0 ? a0Var.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionBar.e x(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.ActionBar
    public void x0(CharSequence charSequence) {
        this.f1827i.D(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int y() {
        return 0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void y0(int i10) {
        a0 a0Var = this.f1827i;
        a0Var.setTitle(i10 != 0 ? a0Var.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context z() {
        return this.f1827i.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void z0(CharSequence charSequence) {
        this.f1827i.setTitle(charSequence);
    }
}
