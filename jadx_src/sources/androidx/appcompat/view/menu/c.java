package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.j2;

/* JADX INFO: compiled from: BaseMenuWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Context f2130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j2<y1.c, MenuItem> f2131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j2<y1.d, SubMenu> f2132n;

    c(Context context) {
        this.f2130l = context;
    }

    final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof y1.c)) {
            return menuItem;
        }
        y1.c cVar = (y1.c) menuItem;
        if (this.f2131m == null) {
            this.f2131m = new j2<>();
        }
        MenuItem menuItem2 = this.f2131m.get(cVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f2130l, cVar);
        this.f2131m.put(cVar, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof y1.d)) {
            return subMenu;
        }
        y1.d dVar = (y1.d) subMenu;
        if (this.f2132n == null) {
            this.f2132n = new j2<>();
        }
        SubMenu subMenu2 = this.f2132n.get(dVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f2130l, dVar);
        this.f2132n.put(dVar, sVar);
        return sVar;
    }

    final void g() {
        j2<y1.c, MenuItem> j2Var = this.f2131m;
        if (j2Var != null) {
            j2Var.clear();
        }
        j2<y1.d, SubMenu> j2Var2 = this.f2132n;
        if (j2Var2 != null) {
            j2Var2.clear();
        }
    }

    final void h(int i10) {
        if (this.f2131m == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f2131m.size()) {
            if (this.f2131m.g(i11).getGroupId() == i10) {
                this.f2131m.i(i11);
                i11--;
            }
            i11++;
        }
    }

    final void i(int i10) {
        if (this.f2131m == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f2131m.size(); i11++) {
            if (this.f2131m.g(i11).getItemId() == i10) {
                this.f2131m.i(i11);
                return;
            }
        }
    }
}
