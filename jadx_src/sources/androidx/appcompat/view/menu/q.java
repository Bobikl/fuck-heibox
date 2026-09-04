package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.j1;

/* JADX INFO: compiled from: StandardMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f2238w = R.layout.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f2240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f2241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f2242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f2243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f2245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final MenuPopupWindow f2246j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PopupWindow.OnDismissListener f2249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f2250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    View f2251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private m.a f2252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ViewTreeObserver f2253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2256t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2258v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f2247k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f2248l = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2257u = 0;

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.b() || q.this.f2246j.K()) {
                return;
            }
            View view = q.this.f2251o;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f2246j.show();
            }
        }
    }

    /* JADX INFO: compiled from: StandardMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.f2253q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f2253q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f2253q.removeGlobalOnLayoutListener(qVar.f2247k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i10, int i11, boolean z10) {
        this.f2239c = context;
        this.f2240d = gVar;
        this.f2242f = z10;
        this.f2241e = new f(gVar, LayoutInflater.from(context), z10, f2238w);
        this.f2244h = i10;
        this.f2245i = i11;
        Resources resources = context.getResources();
        this.f2243g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2250n = view;
        this.f2246j = new MenuPopupWindow(context, null, i10, i11);
        gVar.c(this, context);
    }

    private boolean B() {
        View view;
        if (b()) {
            return true;
        }
        if (this.f2254r || (view = this.f2250n) == null) {
            return false;
        }
        this.f2251o = view;
        this.f2246j.d0(this);
        this.f2246j.e0(this);
        this.f2246j.c0(true);
        View view2 = this.f2251o;
        boolean z10 = this.f2253q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2253q = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2247k);
        }
        view2.addOnAttachStateChangeListener(this.f2248l);
        this.f2246j.R(view2);
        this.f2246j.V(this.f2257u);
        if (!this.f2255s) {
            this.f2256t = k.q(this.f2241e, null, this.f2239c, this.f2243g);
            this.f2255s = true;
        }
        this.f2246j.T(this.f2256t);
        this.f2246j.Z(2);
        this.f2246j.W(p());
        this.f2246j.show();
        ListView listViewJ = this.f2246j.j();
        listViewJ.setOnKeyListener(this);
        if (this.f2258v && this.f2240d.A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2239c).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.f2240d.A());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f2246j.p(this.f2241e);
        this.f2246j.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        if (gVar != this.f2240d) {
            return;
        }
        dismiss();
        m.a aVar = this.f2252p;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.f2254r && this.f2246j.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable d() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.f2246j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        this.f2255s = false;
        f fVar = this.f2241e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(m.a aVar) {
        this.f2252p = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.f2246j.j();
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f2239c, rVar, this.f2251o, this.f2242f, this.f2244h, this.f2245i);
            lVar.a(this.f2252p);
            lVar.i(k.z(rVar));
            lVar.k(this.f2249m);
            this.f2249m = null;
            this.f2240d.f(false);
            int iK = this.f2246j.k();
            int iH = this.f2246j.h();
            if ((Gravity.getAbsoluteGravity(this.f2257u, j1.Z(this.f2250n)) & 7) == 5) {
                iK += this.f2250n.getWidth();
            }
            if (lVar.p(iK, iH)) {
                m.a aVar = this.f2252p;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void n(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2254r = true;
        this.f2240d.close();
        ViewTreeObserver viewTreeObserver = this.f2253q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2253q = this.f2251o.getViewTreeObserver();
            }
            this.f2253q.removeGlobalOnLayoutListener(this.f2247k);
            this.f2253q = null;
        }
        this.f2251o.removeOnAttachStateChangeListener(this.f2248l);
        PopupWindow.OnDismissListener onDismissListener = this.f2249m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(View view) {
        this.f2250n = view;
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(boolean z10) {
        this.f2241e.e(z10);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(int i10) {
        this.f2257u = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i10) {
        this.f2246j.l(i10);
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f2249m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void x(boolean z10) {
        this.f2258v = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void y(int i10) {
        this.f2246j.e(i10);
    }
}
