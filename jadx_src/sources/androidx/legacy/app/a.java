package androidx.legacy.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.d1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.view.j1;
import androidx.core.view.n;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ActionBarDrawerToggle.java */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class a implements DrawerLayout.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f23906m = "ActionBarDrawerToggle";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f23907n = {R.attr.homeAsUpIndicator};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f23908o = 0.33333334f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f23909p = 16908332;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Activity f23910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0171a f23911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DrawerLayout f23912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f23915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f23916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f23917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f23919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f23920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f23921l;

    /* JADX INFO: renamed from: androidx.legacy.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    @Deprecated
    public interface InterfaceC0171a {
        @p0
        Drawable a();

        void b(Drawable drawable, @d1 int i10);

        void c(@d1 int i10);
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    @Deprecated
    public interface b {
        @p0
        InterfaceC0171a getDrawerToggleDelegate();
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Method f23922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Method f23923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f23924c;

        c(Activity activity) {
            try {
                this.f23922a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f23923b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(16908332);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f23924c = (ImageView) childAt;
                }
            }
        }
    }

    /* JADX INFO: compiled from: ActionBarDrawerToggle.java */
    public class d extends InsetDrawable implements Drawable.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f23925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f23926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f23927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f23928e;

        d(Drawable drawable) {
            super(drawable, 0);
            this.f23925b = true;
            this.f23926c = new Rect();
        }

        public float a() {
            return this.f23927d;
        }

        public void b(float f10) {
            this.f23928e = f10;
            invalidateSelf();
        }

        public void c(float f10) {
            this.f23927d = f10;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@n0 Canvas canvas) {
            copyBounds(this.f23926c);
            canvas.save();
            boolean z10 = j1.Z(a.this.f23910a.getWindow().getDecorView()) == 1;
            int i10 = z10 ? -1 : 1;
            float fWidth = this.f23926c.width();
            canvas.translate((-this.f23928e) * fWidth * this.f23927d * i10, 0.0f);
            if (z10 && !this.f23925b) {
                canvas.translate(fWidth, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, @v int i10, @d1 int i11, @d1 int i12) {
        this(activity, drawerLayout, !e(activity), i10, i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, DrawerLayout drawerLayout, boolean z10, @v int i10, @d1 int i11, @d1 int i12) {
        this.f23913d = true;
        this.f23910a = activity;
        if (activity instanceof b) {
            this.f23911b = ((b) activity).getDrawerToggleDelegate();
        } else {
            this.f23911b = null;
        }
        this.f23912c = drawerLayout;
        this.f23918i = i10;
        this.f23919j = i11;
        this.f23920k = i12;
        this.f23915f = f();
        this.f23916g = androidx.core.content.d.i(activity, i10);
        d dVar = new d(this.f23916g);
        this.f23917h = dVar;
        dVar.b(z10 ? f23908o : 0.0f);
    }

    private static boolean e(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    private Drawable f() {
        InterfaceC0171a interfaceC0171a = this.f23911b;
        if (interfaceC0171a != null) {
            return interfaceC0171a.a();
        }
        ActionBar actionBar = this.f23910a.getActionBar();
        TypedArray typedArrayObtainStyledAttributes = (actionBar != null ? actionBar.getThemedContext() : this.f23910a).obtainStyledAttributes(null, f23907n, R.attr.actionBarStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    private void j(int i10) {
        InterfaceC0171a interfaceC0171a = this.f23911b;
        if (interfaceC0171a != null) {
            interfaceC0171a.c(i10);
            return;
        }
        ActionBar actionBar = this.f23910a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i10);
        }
    }

    private void k(Drawable drawable, int i10) {
        InterfaceC0171a interfaceC0171a = this.f23911b;
        if (interfaceC0171a != null) {
            interfaceC0171a.b(drawable, i10);
            return;
        }
        ActionBar actionBar = this.f23910a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i10);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        this.f23917h.c(1.0f);
        if (this.f23913d) {
            j(this.f23920k);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        this.f23917h.c(0.0f);
        if (this.f23913d) {
            j(this.f23919j);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i10) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f10) {
        float fA = this.f23917h.a();
        this.f23917h.c(f10 > 0.5f ? Math.max(fA, Math.max(0.0f, f10 - 0.5f) * 2.0f) : Math.min(fA, f10 * 2.0f));
    }

    public boolean g() {
        return this.f23913d;
    }

    public void h(Configuration configuration) {
        if (!this.f23914e) {
            this.f23915f = f();
        }
        this.f23916g = androidx.core.content.d.i(this.f23910a, this.f23918i);
        o();
    }

    public boolean i(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f23913d) {
            return false;
        }
        if (this.f23912c.F(n.f21701b)) {
            this.f23912c.d(n.f21701b);
            return true;
        }
        this.f23912c.K(n.f21701b);
        return true;
    }

    public void l(boolean z10) {
        if (z10 != this.f23913d) {
            if (z10) {
                k(this.f23917h, this.f23912c.C(n.f21701b) ? this.f23920k : this.f23919j);
            } else {
                k(this.f23915f, 0);
            }
            this.f23913d = z10;
        }
    }

    public void m(int i10) {
        n(i10 != 0 ? androidx.core.content.d.i(this.f23910a, i10) : null);
    }

    public void n(Drawable drawable) {
        if (drawable == null) {
            this.f23915f = f();
            this.f23914e = false;
        } else {
            this.f23915f = drawable;
            this.f23914e = true;
        }
        if (this.f23913d) {
            return;
        }
        k(this.f23915f, 0);
    }

    public void o() {
        if (this.f23912c.C(n.f21701b)) {
            this.f23917h.c(1.0f);
        } else {
            this.f23917h.c(0.0f);
        }
        if (this.f23913d) {
            k(this.f23917h, this.f23912c.C(n.f21701b) ? this.f23920k : this.f23919j);
        }
    }
}
