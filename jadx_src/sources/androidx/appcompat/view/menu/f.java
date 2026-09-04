package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: compiled from: MenuAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g f2181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2182c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f2184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LayoutInflater f2185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f2186g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f2184e = z10;
        this.f2185f = layoutInflater;
        this.f2181b = gVar;
        this.f2186g = i10;
        a();
    }

    void a() {
        j jVarY = this.f2181b.y();
        if (jVarY != null) {
            ArrayList<j> arrayListC = this.f2181b.C();
            int size = arrayListC.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayListC.get(i10) == jVarY) {
                    this.f2182c = i10;
                    return;
                }
            }
        }
        this.f2182c = -1;
    }

    public g b() {
        return this.f2181b;
    }

    public boolean c() {
        return this.f2183d;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j getItem(int i10) {
        ArrayList<j> arrayListC = this.f2184e ? this.f2181b.C() : this.f2181b.H();
        int i11 = this.f2182c;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListC.get(i10);
    }

    public void e(boolean z10) {
        this.f2183d = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<j> arrayListC = this.f2184e ? this.f2181b.C() : this.f2181b.H();
        return this.f2182c < 0 ? arrayListC.size() : arrayListC.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2185f.inflate(this.f2186g, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2181b.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f2183d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
