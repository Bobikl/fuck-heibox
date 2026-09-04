package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: NavigationMenu.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class s extends androidx.appcompat.view.menu.g {
    public s(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @n0
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) a(i10, i11, i12, charSequence);
        u uVar = new u(x(), this, jVar);
        jVar.A(uVar);
        return uVar;
    }
}
