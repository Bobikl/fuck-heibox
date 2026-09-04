package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationMenuView extends RecyclerView implements androidx.appcompat.view.menu.n {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(androidx.appcompat.view.menu.g gVar) {
    }

    @Override // androidx.appcompat.view.menu.n
    public int getWindowAnimations() {
        return 0;
    }
}
