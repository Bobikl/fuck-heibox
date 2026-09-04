package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;

/* JADX INFO: compiled from: NavigationBarMenu.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a extends g {

    @n0
    private final Class<?> Q;
    private final int R;

    public a(@n0 Context context, @n0 Class<?> cls, int i10) {
        super(context);
        this.Q = cls;
        this.R = i10;
    }

    @Override // androidx.appcompat.view.menu.g
    @n0
    protected MenuItem a(int i10, int i11, int i12, @n0 CharSequence charSequence) {
        if (size() + 1 <= this.R) {
            m0();
            MenuItem menuItemA = super.a(i10, i11, i12, charSequence);
            if (menuItemA instanceof j) {
                ((j) menuItemA).w(true);
            }
            l0();
            return menuItemA;
        }
        String simpleName = this.Q.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.R + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @n0
    public SubMenu addSubMenu(int i10, int i11, int i12, @n0 CharSequence charSequence) {
        throw new UnsupportedOperationException(this.Q.getSimpleName() + " does not support submenus");
    }

    public int n0() {
        return this.R;
    }
}
