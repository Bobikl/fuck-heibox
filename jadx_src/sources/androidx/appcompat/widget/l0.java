package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: compiled from: PopupMenu.java */
/* JADX INFO: loaded from: classes.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f2829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f2830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.appcompat.view.menu.l f2831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    e f2832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f2833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnTouchListener f2834g;

    /* JADX INFO: compiled from: PopupMenu.java */
    public class a implements androidx.appcompat.view.menu.g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.n0 MenuItem menuItem) {
            e eVar = l0.this.f2832e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar) {
        }
    }

    /* JADX INFO: compiled from: PopupMenu.java */
    public class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l0 l0Var = l0.this;
            d dVar = l0Var.f2833f;
            if (dVar != null) {
                dVar.a(l0Var);
            }
        }
    }

    /* JADX INFO: compiled from: PopupMenu.java */
    public class c extends f0 {
        c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.f0
        public androidx.appcompat.view.menu.p b() {
            return l0.this.f2831d.e();
        }

        @Override // androidx.appcompat.widget.f0
        protected boolean c() {
            l0.this.l();
            return true;
        }

        @Override // androidx.appcompat.widget.f0
        protected boolean d() {
            l0.this.a();
            return true;
        }
    }

    /* JADX INFO: compiled from: PopupMenu.java */
    public interface d {
        void a(l0 l0Var);
    }

    /* JADX INFO: compiled from: PopupMenu.java */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public l0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 View view) {
        this(context, view, 0);
    }

    public l0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 View view, int i10) {
        this(context, view, i10, R.attr.popupMenuStyle, 0);
    }

    public l0(@androidx.annotation.n0 Context context, @androidx.annotation.n0 View view, int i10, @androidx.annotation.f int i11, @androidx.annotation.e1 int i12) {
        this.f2828a = context;
        this.f2830c = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f2829b = gVar;
        gVar.X(new a());
        androidx.appcompat.view.menu.l lVar = new androidx.appcompat.view.menu.l(context, gVar, view, false, i11, i12);
        this.f2831d = lVar;
        lVar.j(i10);
        lVar.k(new b());
    }

    public void a() {
        this.f2831d.dismiss();
    }

    @androidx.annotation.n0
    public View.OnTouchListener b() {
        if (this.f2834g == null) {
            this.f2834g = new c(this.f2830c);
        }
        return this.f2834g;
    }

    public int c() {
        return this.f2831d.c();
    }

    @androidx.annotation.n0
    public Menu d() {
        return this.f2829b;
    }

    @androidx.annotation.n0
    public MenuInflater e() {
        return new androidx.appcompat.view.g(this.f2828a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    ListView f() {
        if (this.f2831d.f()) {
            return this.f2831d.d();
        }
        return null;
    }

    public void g(@androidx.annotation.l0 int i10) {
        e().inflate(i10, this.f2829b);
    }

    public void h(boolean z10) {
        this.f2831d.i(z10);
    }

    public void i(int i10) {
        this.f2831d.j(i10);
    }

    public void j(@androidx.annotation.p0 d dVar) {
        this.f2833f = dVar;
    }

    public void k(@androidx.annotation.p0 e eVar) {
        this.f2832e = eVar;
    }

    public void l() {
        this.f2831d.l();
    }
}
