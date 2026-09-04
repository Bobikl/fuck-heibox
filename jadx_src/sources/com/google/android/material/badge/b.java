package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.d0;

/* JADX INFO: compiled from: BadgeUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.material.badge.c
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f53129a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53130b = "BadgeUtils";

    /* JADX INFO: compiled from: BadgeUtils.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Toolbar f53131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f53132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f53133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ FrameLayout f53134e;

        a(Toolbar toolbar, int i10, com.google.android.material.badge.a aVar, FrameLayout frameLayout) {
            this.f53131b = toolbar;
            this.f53132c = i10;
            this.f53133d = aVar;
            this.f53134e = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView actionMenuItemViewA = d0.a(this.f53131b, this.f53132c);
            if (actionMenuItemViewA != null) {
                b.n(this.f53133d, this.f53131b.getResources());
                b.d(this.f53133d, actionMenuItemViewA, this.f53134e);
                b.b(this.f53133d, actionMenuItemViewA);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.badge.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BadgeUtils.java */
    public class C0416b extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f53135a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0416b(View.AccessibilityDelegate accessibilityDelegate, com.google.android.material.badge.a aVar) {
            super(accessibilityDelegate);
            this.f53135a = aVar;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.f1(this.f53135a.o());
        }
    }

    /* JADX INFO: compiled from: BadgeUtils.java */
    public class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f53136a;

        c(com.google.android.material.badge.a aVar) {
            this.f53136a = aVar;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.f1(this.f53136a.o());
        }
    }

    /* JADX INFO: compiled from: BadgeUtils.java */
    public class d extends androidx.core.view.a {
        d(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.f1(null);
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@n0 com.google.android.material.badge.a aVar, @n0 View view) {
        if (Build.VERSION.SDK_INT < 29 || !j1.G0(view)) {
            j1.B1(view, new c(aVar));
        } else {
            j1.B1(view, new C0416b(view.getAccessibilityDelegate(), aVar));
        }
    }

    public static void c(@n0 com.google.android.material.badge.a aVar, @n0 View view) {
        d(aVar, view, null);
    }

    public static void d(@n0 com.google.android.material.badge.a aVar, @n0 View view, @p0 FrameLayout frameLayout) {
        m(aVar, view, frameLayout);
        if (aVar.p() != null) {
            aVar.p().setForeground(aVar);
        } else {
            if (f53129a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    public static void e(@n0 com.google.android.material.badge.a aVar, @n0 Toolbar toolbar, @androidx.annotation.d0 int i10) {
        f(aVar, toolbar, i10, null);
    }

    public static void f(@n0 com.google.android.material.badge.a aVar, @n0 Toolbar toolbar, @androidx.annotation.d0 int i10, @p0 FrameLayout frameLayout) {
        toolbar.post(new a(toolbar, i10, aVar, frameLayout));
    }

    @n0
    public static SparseArray<com.google.android.material.badge.a> g(Context context, @n0 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<com.google.android.material.badge.a> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i10 = 0; i10 < parcelableSparseArray.size(); i10++) {
            int iKeyAt = parcelableSparseArray.keyAt(i10);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i10);
            if (state == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(iKeyAt, com.google.android.material.badge.a.f(context, state));
        }
        return sparseArray;
    }

    @n0
    public static ParcelableSparseArray h(@n0 SparseArray<com.google.android.material.badge.a> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            com.google.android.material.badge.a aVarValueAt = sparseArray.valueAt(i10);
            if (aVarValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, aVarValueAt.v());
        }
        return parcelableSparseArray;
    }

    private static void i(@n0 View view) {
        if (Build.VERSION.SDK_INT < 29 || !j1.G0(view)) {
            j1.B1(view, null);
        } else {
            j1.B1(view, new d(view.getAccessibilityDelegate()));
        }
    }

    public static void j(@p0 com.google.android.material.badge.a aVar, @n0 View view) {
        if (aVar == null) {
            return;
        }
        if (f53129a || aVar.p() != null) {
            aVar.p().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void k(@p0 com.google.android.material.badge.a aVar, @n0 Toolbar toolbar, @androidx.annotation.d0 int i10) {
        if (aVar == null) {
            return;
        }
        ActionMenuItemView actionMenuItemViewA = d0.a(toolbar, i10);
        if (actionMenuItemViewA != null) {
            l(aVar);
            j(aVar, actionMenuItemViewA);
            i(actionMenuItemViewA);
        } else {
            Log.w(f53130b, "Trying to remove badge from a null menuItemView: " + i10);
        }
    }

    @androidx.annotation.j1
    static void l(com.google.android.material.badge.a aVar) {
        aVar.M(0);
        aVar.N(0);
    }

    public static void m(@n0 com.google.android.material.badge.a aVar, @n0 View view, @p0 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.n0(view, frameLayout);
    }

    @androidx.annotation.j1
    static void n(com.google.android.material.badge.a aVar, Resources resources) {
        aVar.M(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        aVar.N(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void o(@n0 Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
