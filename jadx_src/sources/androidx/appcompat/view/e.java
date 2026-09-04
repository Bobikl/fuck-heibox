package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: StandaloneActionMode.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class e extends b implements androidx.appcompat.view.menu.g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f1995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ActionBarContextView f1996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b.a f1997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<View> f1998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f2001j;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f1995d = context;
        this.f1996e = actionBarContextView;
        this.f1997f = aVar;
        androidx.appcompat.view.menu.g gVarZ = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).Z(1);
        this.f2001j = gVarZ;
        gVarZ.X(this);
        this.f2000i = z10;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@n0 androidx.appcompat.view.menu.g gVar, @n0 MenuItem menuItem) {
        return this.f1997f.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@n0 androidx.appcompat.view.menu.g gVar) {
        k();
        this.f1996e.o();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f1999h) {
            return;
        }
        this.f1999h = true;
        this.f1997f.d(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f1998g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f2001j;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f1996e.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f1996e.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f1996e.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f1997f.c(this, this.f2001j);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f1996e.s();
    }

    @Override // androidx.appcompat.view.b
    public boolean m() {
        return this.f2000i;
    }

    @Override // androidx.appcompat.view.b
    public void n(View view) {
        this.f1996e.setCustomView(view);
        this.f1998g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void o(int i10) {
        p(this.f1995d.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void p(CharSequence charSequence) {
        this.f1996e.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void r(int i10) {
        s(this.f1995d.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void s(CharSequence charSequence) {
        this.f1996e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void t(boolean z10) {
        super.t(z10);
        this.f1996e.setTitleOptional(z10);
    }

    public void u(androidx.appcompat.view.menu.g gVar, boolean z10) {
    }

    public void v(r rVar) {
    }

    public boolean w(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return true;
        }
        new l(this.f1996e.getContext(), rVar).l();
        return true;
    }
}
