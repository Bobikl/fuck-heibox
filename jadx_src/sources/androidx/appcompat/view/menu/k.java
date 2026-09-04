package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: MenuPopup.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements p, m, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f2222b;

    k() {
    }

    protected static f A(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter;
    }

    protected static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    protected static boolean z(g gVar) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(@n0 Context context, @p0 g gVar) {
    }

    @Override // androidx.appcompat.view.menu.m
    public n m(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public abstract void n(g gVar);

    protected boolean o() {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        A(listAdapter).f2181b.P((MenuItem) listAdapter.getItem(i10), this, o() ? 0 : 4);
    }

    public Rect p() {
        return this.f2222b;
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.f2222b = rect;
    }

    public abstract void t(boolean z10);

    public abstract void u(int i10);

    public abstract void v(int i10);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z10);

    public abstract void y(int i10);
}
