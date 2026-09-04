package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.d1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: ActionBarDrawerToggle.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements DrawerLayout.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DrawerLayout f1759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.appcompat.graphics.drawable.d f1760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f1763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    View.OnClickListener f1767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1768k;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public class ViewOnClickListenerC0012a implements View.OnClickListener {
        ViewOnClickListenerC0012a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f1763f) {
                aVar.v();
                return;
            }
            View.OnClickListener onClickListener = aVar.f1767j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public interface b {
        Drawable a();

        void b(Drawable drawable, @d1 int i10);

        void c(@d1 int i10);

        Context d();

        boolean e();
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public interface c {
        @p0
        b getDrawerToggleDelegate();
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f1770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.appcompat.app.b.a f1771b;

        /* JADX INFO: renamed from: androidx.appcompat.app.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
        @w0(18)
        public static class C0013a {
            private C0013a() {
            }

            @u
            static void a(android.app.ActionBar actionBar, int i10) {
                actionBar.setHomeActionContentDescription(i10);
            }

            @u
            static void b(android.app.ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        d(Activity activity) {
            this.f1770a = activity;
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable a() {
            TypedArray typedArrayObtainStyledAttributes = d().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.a.b
        public void b(Drawable drawable, int i10) {
            android.app.ActionBar actionBar = this.f1770a.getActionBar();
            if (actionBar != null) {
                C0013a.b(actionBar, drawable);
                C0013a.a(actionBar, i10);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public void c(int i10) {
            android.app.ActionBar actionBar = this.f1770a.getActionBar();
            if (actionBar != null) {
                C0013a.a(actionBar, i10);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Context d() {
            android.app.ActionBar actionBar = this.f1770a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f1770a;
        }

        @Override // androidx.appcompat.app.a.b
        public boolean e() {
            android.app.ActionBar actionBar = this.f1770a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public static class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Toolbar f1772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Drawable f1773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f1774c;

        e(Toolbar toolbar) {
            this.f1772a = toolbar;
            this.f1773b = toolbar.getNavigationIcon();
            this.f1774c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable a() {
            return this.f1773b;
        }

        @Override // androidx.appcompat.app.a.b
        public void b(Drawable drawable, @d1 int i10) {
            this.f1772a.setNavigationIcon(drawable);
            c(i10);
        }

        @Override // androidx.appcompat.app.a.b
        public void c(@d1 int i10) {
            if (i10 == 0) {
                this.f1772a.setNavigationContentDescription(this.f1774c);
            } else {
                this.f1772a.setNavigationContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Context d() {
            return this.f1772a.getContext();
        }

        @Override // androidx.appcompat.app.a.b
        public boolean e() {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, androidx.appcompat.graphics.drawable.d dVar, @d1 int i10, @d1 int i11) {
        this.f1761d = true;
        this.f1763f = true;
        this.f1768k = false;
        if (toolbar != null) {
            this.f1758a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0012a());
        } else if (activity instanceof c) {
            this.f1758a = ((c) activity).getDrawerToggleDelegate();
        } else {
            this.f1758a = new d(activity);
        }
        this.f1759b = drawerLayout;
        this.f1765h = i10;
        this.f1766i = i11;
        if (dVar == null) {
            this.f1760c = new androidx.appcompat.graphics.drawable.d(this.f1758a.d());
        } else {
            this.f1760c = dVar;
        }
        this.f1762e = f();
    }

    public a(Activity activity, DrawerLayout drawerLayout, @d1 int i10, @d1 int i11) {
        this(activity, null, drawerLayout, null, i10, i11);
    }

    public a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @d1 int i10, @d1 int i11) {
        this(activity, toolbar, drawerLayout, null, i10, i11);
    }

    private void s(float f10) {
        if (f10 == 1.0f) {
            this.f1760c.t(true);
        } else if (f10 == 0.0f) {
            this.f1760c.t(false);
        }
        this.f1760c.setProgress(f10);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        s(1.0f);
        if (this.f1763f) {
            l(this.f1766i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        s(0.0f);
        if (this.f1763f) {
            l(this.f1765h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i10) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f10) {
        if (this.f1761d) {
            s(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            s(0.0f);
        }
    }

    @n0
    public androidx.appcompat.graphics.drawable.d e() {
        return this.f1760c;
    }

    Drawable f() {
        return this.f1758a.a();
    }

    public View.OnClickListener g() {
        return this.f1767j;
    }

    public boolean h() {
        return this.f1763f;
    }

    public boolean i() {
        return this.f1761d;
    }

    public void j(Configuration configuration) {
        if (!this.f1764g) {
            this.f1762e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f1763f) {
            return false;
        }
        v();
        return true;
    }

    void l(int i10) {
        this.f1758a.c(i10);
    }

    void m(Drawable drawable, int i10) {
        if (!this.f1768k && !this.f1758a.e()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f1768k = true;
        }
        this.f1758a.b(drawable, i10);
    }

    public void n(@n0 androidx.appcompat.graphics.drawable.d dVar) {
        this.f1760c = dVar;
        u();
    }

    public void o(boolean z10) {
        if (z10 != this.f1763f) {
            if (z10) {
                m(this.f1760c, this.f1759b.C(androidx.core.view.n.f21701b) ? this.f1766i : this.f1765h);
            } else {
                m(this.f1762e, 0);
            }
            this.f1763f = z10;
        }
    }

    public void p(boolean z10) {
        this.f1761d = z10;
        if (z10) {
            return;
        }
        s(0.0f);
    }

    public void q(int i10) {
        r(i10 != 0 ? this.f1759b.getResources().getDrawable(i10) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.f1762e = f();
            this.f1764g = false;
        } else {
            this.f1762e = drawable;
            this.f1764g = true;
        }
        if (this.f1763f) {
            return;
        }
        m(this.f1762e, 0);
    }

    public void t(View.OnClickListener onClickListener) {
        this.f1767j = onClickListener;
    }

    public void u() {
        if (this.f1759b.C(androidx.core.view.n.f21701b)) {
            s(1.0f);
        } else {
            s(0.0f);
        }
        if (this.f1763f) {
            m(this.f1760c, this.f1759b.C(androidx.core.view.n.f21701b) ? this.f1766i : this.f1765h);
        }
    }

    void v() {
        int iQ = this.f1759b.q(androidx.core.view.n.f21701b);
        if (this.f1759b.F(androidx.core.view.n.f21701b) && iQ != 2) {
            this.f1759b.d(androidx.core.view.n.f21701b);
        } else if (iQ != 1) {
            this.f1759b.K(androidx.core.view.n.f21701b);
        }
    }
}
