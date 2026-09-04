package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: compiled from: MenuPopupHelper.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class l implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f2223m = 48;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f2225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f2229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m.a f2232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k f2233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f2234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f2235l;

    /* JADX INFO: compiled from: MenuPopupHelper.java */
    public class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.g();
        }
    }

    /* JADX INFO: compiled from: MenuPopupHelper.java */
    @w0(17)
    public static class b {
        private b() {
        }

        @u
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(@n0 Context context, @n0 g gVar) {
        this(context, gVar, null, false, R.attr.popupMenuStyle, 0);
    }

    public l(@n0 Context context, @n0 g gVar, @n0 View view) {
        this(context, gVar, view, false, R.attr.popupMenuStyle, 0);
    }

    public l(@n0 Context context, @n0 g gVar, @n0 View view, boolean z10, @androidx.annotation.f int i10) {
        this(context, gVar, view, z10, i10, 0);
    }

    public l(@n0 Context context, @n0 g gVar, @n0 View view, boolean z10, @androidx.annotation.f int i10, @e1 int i11) {
        this.f2230g = androidx.core.view.n.f21701b;
        this.f2235l = new a();
        this.f2224a = context;
        this.f2225b = gVar;
        this.f2229f = view;
        this.f2226c = z10;
        this.f2227d = i10;
        this.f2228e = i11;
    }

    @n0
    private k b() {
        Display defaultDisplay = ((WindowManager) this.f2224a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        k dVar = Math.min(point.x, point.y) >= this.f2224a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new d(this.f2224a, this.f2229f, this.f2227d, this.f2228e, this.f2226c) : new q(this.f2224a, this.f2225b, this.f2229f, this.f2227d, this.f2228e, this.f2226c);
        dVar.n(this.f2225b);
        dVar.w(this.f2235l);
        dVar.r(this.f2229f);
        dVar.i(this.f2232i);
        dVar.t(this.f2231h);
        dVar.u(this.f2230g);
        return dVar;
    }

    private void n(int i10, int i11, boolean z10, boolean z11) {
        k kVarE = e();
        kVarE.x(z11);
        if (z10) {
            if ((androidx.core.view.n.d(this.f2230g, j1.Z(this.f2229f)) & 7) == 5) {
                i10 -= this.f2229f.getWidth();
            }
            kVarE.v(i10);
            kVarE.y(i11);
            int i12 = (int) ((this.f2224a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarE.s(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        kVarE.show();
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(@p0 m.a aVar) {
        this.f2232i = aVar;
        k kVar = this.f2233j;
        if (kVar != null) {
            kVar.i(aVar);
        }
    }

    public int c() {
        return this.f2230g;
    }

    public ListView d() {
        return e().j();
    }

    @Override // androidx.appcompat.view.menu.i
    public void dismiss() {
        if (f()) {
            this.f2233j.dismiss();
        }
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public k e() {
        if (this.f2233j == null) {
            this.f2233j = b();
        }
        return this.f2233j;
    }

    public boolean f() {
        k kVar = this.f2233j;
        return kVar != null && kVar.b();
    }

    protected void g() {
        this.f2233j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2234k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@n0 View view) {
        this.f2229f = view;
    }

    public void i(boolean z10) {
        this.f2231h = z10;
        k kVar = this.f2233j;
        if (kVar != null) {
            kVar.t(z10);
        }
    }

    public void j(int i10) {
        this.f2230g = i10;
    }

    public void k(@p0 PopupWindow.OnDismissListener onDismissListener) {
        this.f2234k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i10, int i11) {
        if (!p(i10, i11)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f2229f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i10, int i11) {
        if (f()) {
            return true;
        }
        if (this.f2229f == null) {
            return false;
        }
        n(i10, i11, true, true);
        return true;
    }
}
