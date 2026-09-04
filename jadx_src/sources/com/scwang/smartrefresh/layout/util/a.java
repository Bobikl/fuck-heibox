package com.scwang.smartrefresh.layout.util;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import ng.i;

/* JADX INFO: compiled from: DesignUtil.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: com.scwang.smartrefresh.layout.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DesignUtil.java */
    public static final class C0920a implements AppBarLayout.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pg.a f96792a;

        C0920a(pg.a aVar) {
            this.f96792a = aVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            this.f96792a.j(i10 >= 0, appBarLayout.getTotalScrollRange() + i10 <= 0);
        }
    }

    public static void a(View view, i iVar, pg.a aVar) {
        try {
            if (view instanceof CoordinatorLayout) {
                iVar.d().u(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).e(new C0920a(aVar));
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
