package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.e1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.R;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.j0;
import androidx.core.view.j1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CascadingMenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = R.layout.abc_cascading_menu_item_layout;
    static final int D = 0;
    static final int E = 1;
    static final int F = 200;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Handler f2138h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f2146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    View f2147q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2152v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f2154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private m.a f2155y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    ViewTreeObserver f2156z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<g> f2139i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final List<C0016d> f2140j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f2141k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f2142l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final j0 f2143m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2144n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2145o = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f2153w = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2148r = F();

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.b() || d.this.f2140j.size() <= 0 || d.this.f2140j.get(0).f2164a.K()) {
                return;
            }
            View view = d.this.f2147q;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0016d> it = d.this.f2140j.iterator();
            while (it.hasNext()) {
                it.next().f2164a.show();
            }
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.f2156z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f2156z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f2156z.removeGlobalOnLayoutListener(dVar.f2141k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public class c implements j0 {

        /* JADX INFO: compiled from: CascadingMenuPopup.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0016d f2160b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f2161c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f2162d;

            a(C0016d c0016d, MenuItem menuItem, g gVar) {
                this.f2160b = c0016d;
                this.f2161c = menuItem;
                this.f2162d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0016d c0016d = this.f2160b;
                if (c0016d != null) {
                    d.this.B = true;
                    c0016d.f2165b.f(false);
                    d.this.B = false;
                }
                if (this.f2161c.isEnabled() && this.f2161c.hasSubMenu()) {
                    this.f2162d.O(this.f2161c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.j0
        public void c(@n0 g gVar, @n0 MenuItem menuItem) {
            d.this.f2138h.removeCallbacksAndMessages(null);
            int size = d.this.f2140j.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (gVar == d.this.f2140j.get(i10).f2165b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            d.this.f2138h.postAtTime(new a(i11 < d.this.f2140j.size() ? d.this.f2140j.get(i11) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.j0
        public void i(@n0 g gVar, @n0 MenuItem menuItem) {
            d.this.f2138h.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    public static class C0016d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f2164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f2165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2166c;

        public C0016d(@n0 MenuPopupWindow menuPopupWindow, @n0 g gVar, int i10) {
            this.f2164a = menuPopupWindow;
            this.f2165b = gVar;
            this.f2166c = i10;
        }

        public ListView a() {
            return this.f2164a.j();
        }
    }

    /* JADX INFO: compiled from: CascadingMenuPopup.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public d(@n0 Context context, @n0 View view, @androidx.annotation.f int i10, @e1 int i11, boolean z10) {
        this.f2133c = context;
        this.f2146p = view;
        this.f2135e = i10;
        this.f2136f = i11;
        this.f2137g = z10;
        Resources resources = context.getResources();
        this.f2134d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2138h = new Handler();
    }

    private MenuPopupWindow B() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f2133c, null, this.f2135e, this.f2136f);
        menuPopupWindow.q0(this.f2143m);
        menuPopupWindow.e0(this);
        menuPopupWindow.d0(this);
        menuPopupWindow.R(this.f2146p);
        menuPopupWindow.V(this.f2145o);
        menuPopupWindow.c0(true);
        menuPopupWindow.Z(2);
        return menuPopupWindow;
    }

    private int C(@n0 g gVar) {
        int size = this.f2140j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (gVar == this.f2140j.get(i10).f2165b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem D(@n0 g gVar, @n0 g gVar2) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @p0
    private View E(@n0 C0016d c0016d, @n0 g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemD = D(c0016d.f2165b, gVar);
        if (menuItemD == null) {
            return null;
        }
        ListView listViewA = c0016d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemD == fVar.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int F() {
        return j1.Z(this.f2146p) == 1 ? 0 : 1;
    }

    private int G(int i10) {
        List<C0016d> list = this.f2140j;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2147q.getWindowVisibleDisplayFrame(rect);
        if (this.f2148r == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void H(@n0 g gVar) {
        C0016d c0016d;
        View viewE;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2133c);
        f fVar = new f(gVar, layoutInflaterFrom, this.f2137g, C);
        if (!b() && this.f2153w) {
            fVar.e(true);
        } else if (b()) {
            fVar.e(k.z(gVar));
        }
        int iQ = k.q(fVar, null, this.f2133c, this.f2134d);
        MenuPopupWindow menuPopupWindowB = B();
        menuPopupWindowB.p(fVar);
        menuPopupWindowB.T(iQ);
        menuPopupWindowB.V(this.f2145o);
        if (this.f2140j.size() > 0) {
            List<C0016d> list = this.f2140j;
            c0016d = list.get(list.size() - 1);
            viewE = E(c0016d, gVar);
        } else {
            c0016d = null;
            viewE = null;
        }
        if (viewE != null) {
            menuPopupWindowB.r0(false);
            menuPopupWindowB.o0(null);
            int iG = G(iQ);
            boolean z10 = iG == 1;
            this.f2148r = iG;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowB.R(viewE);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f2146p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewE.getLocationOnScreen(iArr2);
                if ((this.f2145o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2146p.getWidth();
                    iArr2[0] = iArr2[0] + viewE.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f2145o & 5) == 5) {
                if (z10) {
                    i12 = i10 + iQ;
                } else {
                    iQ = viewE.getWidth();
                    i12 = i10 - iQ;
                }
            } else if (z10) {
                iQ = viewE.getWidth();
                i12 = i10 + iQ;
            } else {
                i12 = i10 - iQ;
            }
            menuPopupWindowB.l(i12);
            menuPopupWindowB.g0(true);
            menuPopupWindowB.e(i11);
        } else {
            if (this.f2149s) {
                menuPopupWindowB.l(this.f2151u);
            }
            if (this.f2150t) {
                menuPopupWindowB.e(this.f2152v);
            }
            menuPopupWindowB.W(p());
        }
        this.f2140j.add(new C0016d(menuPopupWindowB, gVar, this.f2148r));
        menuPopupWindowB.show();
        ListView listViewJ = menuPopupWindowB.j();
        listViewJ.setOnKeyListener(this);
        if (c0016d == null && this.f2154x && gVar.A() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.A());
            listViewJ.addHeaderView(frameLayout, null, false);
            menuPopupWindowB.show();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        int iC = C(gVar);
        if (iC < 0) {
            return;
        }
        int i10 = iC + 1;
        if (i10 < this.f2140j.size()) {
            this.f2140j.get(i10).f2165b.f(false);
        }
        C0016d c0016dRemove = this.f2140j.remove(iC);
        c0016dRemove.f2165b.S(this);
        if (this.B) {
            c0016dRemove.f2164a.p0(null);
            c0016dRemove.f2164a.S(0);
        }
        c0016dRemove.f2164a.dismiss();
        int size = this.f2140j.size();
        if (size > 0) {
            this.f2148r = this.f2140j.get(size - 1).f2166c;
        } else {
            this.f2148r = F();
        }
        if (size != 0) {
            if (z10) {
                this.f2140j.get(0).f2165b.f(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.f2155y;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2156z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2156z.removeGlobalOnLayoutListener(this.f2141k);
            }
            this.f2156z = null;
        }
        this.f2147q.removeOnAttachStateChangeListener(this.f2142l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.f2140j.size() > 0 && this.f2140j.get(0).f2164a.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable d() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f2140j.size();
        if (size > 0) {
            C0016d[] c0016dArr = (C0016d[]) this.f2140j.toArray(new C0016d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C0016d c0016d = c0016dArr[i10];
                if (c0016d.f2164a.b()) {
                    c0016d.f2164a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        Iterator<C0016d> it = this.f2140j.iterator();
        while (it.hasNext()) {
            k.A(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(m.a aVar) {
        this.f2155y = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        if (this.f2140j.isEmpty()) {
            return null;
        }
        List<C0016d> list = this.f2140j;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(r rVar) {
        for (C0016d c0016d : this.f2140j) {
            if (rVar == c0016d.f2165b) {
                c0016d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        n(rVar);
        m.a aVar = this.f2155y;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void n(g gVar) {
        gVar.c(this, this.f2133c);
        if (b()) {
            H(gVar);
        } else {
            this.f2139i.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean o() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0016d c0016d;
        int size = this.f2140j.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c0016d = null;
                break;
            }
            c0016d = this.f2140j.get(i10);
            if (!c0016d.f2164a.b()) {
                break;
            } else {
                i10++;
            }
        }
        if (c0016d != null) {
            c0016d.f2165b.f(false);
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
    public void r(@n0 View view) {
        if (this.f2146p != view) {
            this.f2146p = view;
            this.f2145o = androidx.core.view.n.d(this.f2144n, j1.Z(view));
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        if (b()) {
            return;
        }
        Iterator<g> it = this.f2139i.iterator();
        while (it.hasNext()) {
            H(it.next());
        }
        this.f2139i.clear();
        View view = this.f2146p;
        this.f2147q = view;
        if (view != null) {
            boolean z10 = this.f2156z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2156z = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2141k);
            }
            this.f2147q.addOnAttachStateChangeListener(this.f2142l);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(boolean z10) {
        this.f2153w = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(int i10) {
        if (this.f2144n != i10) {
            this.f2144n = i10;
            this.f2145o = androidx.core.view.n.d(i10, j1.Z(this.f2146p));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i10) {
        this.f2149s = true;
        this.f2151u = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void x(boolean z10) {
        this.f2154x = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void y(int i10) {
        this.f2150t = true;
        this.f2152v = i10;
    }
}
