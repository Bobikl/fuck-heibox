package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: MenuItemCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21832a = "MenuItemCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f21833b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f21834c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f21835d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f21836e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f21837f = 8;

    /* JADX INFO: compiled from: MenuItemCompat.java */
    public class a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f21838a;

        a(c cVar) {
            this.f21838a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f21838a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f21838a.onMenuItemActionExpand(menuItem);
        }
    }

    /* JADX INFO: compiled from: MenuItemCompat.java */
    @androidx.annotation.w0(26)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @androidx.annotation.u
        static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @androidx.annotation.u
        static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @androidx.annotation.u
        static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @androidx.annotation.u
        static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @androidx.annotation.u
        static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @androidx.annotation.u
        static MenuItem g(MenuItem menuItem, char c10, int i10) {
            return menuItem.setAlphabeticShortcut(c10, i10);
        }

        @androidx.annotation.u
        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @androidx.annotation.u
        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @androidx.annotation.u
        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @androidx.annotation.u
        static MenuItem k(MenuItem menuItem, char c10, int i10) {
            return menuItem.setNumericShortcut(c10, i10);
        }

        @androidx.annotation.u
        static MenuItem l(MenuItem menuItem, char c10, char c11, int i10, int i11) {
            return menuItem.setShortcut(c10, c11, i10, i11);
        }

        @androidx.annotation.u
        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: compiled from: MenuItemCompat.java */
    @Deprecated
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private z() {
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @androidx.annotation.p0
    public static androidx.core.view.b c(@androidx.annotation.n0 MenuItem menuItem) {
        if (menuItem instanceof y1.c) {
            return ((y1.c) menuItem).a();
        }
        Log.w(f21832a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(@androidx.annotation.n0 MenuItem menuItem) {
        if (menuItem instanceof y1.c) {
            return ((y1.c) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(menuItem);
        }
        return 0;
    }

    @androidx.annotation.p0
    public static CharSequence f(@androidx.annotation.n0 MenuItem menuItem) {
        if (menuItem instanceof y1.c) {
            return ((y1.c) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(menuItem);
        }
        return null;
    }

    @androidx.annotation.p0
    public static ColorStateList g(@androidx.annotation.n0 MenuItem menuItem) {
        if (menuItem instanceof y1.c) {
            return ((y1.c) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(menuItem);
        }
        return null;
    }

    @androidx.annotation.p0
    public static PorterDuff.Mode h(@androidx.annotation.n0 MenuItem menuItem) {
        if (menuItem instanceof y1.c) {
            return ((y1.c) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.d(menuItem);
        }
        return null;
    }

    public static int i(@androidx.annotation.n0 MenuItem menuItem) {
        if (menuItem instanceof y1.c) {
            return ((y1.c) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.e(menuItem);
        }
        return 0;
    }

    @androidx.annotation.p0
    public static CharSequence j(@androidx.annotation.n0 MenuItem menuItem) {
        if (menuItem instanceof y1.c) {
            return ((y1.c) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(menuItem);
        }
        return null;
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @androidx.annotation.p0
    public static MenuItem l(@androidx.annotation.n0 MenuItem menuItem, @androidx.annotation.p0 androidx.core.view.b bVar) {
        if (menuItem instanceof y1.c) {
            return ((y1.c) menuItem).c(bVar);
        }
        Log.w(f21832a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i10) {
        return menuItem.setActionView(i10);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(@androidx.annotation.n0 MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof y1.c) {
            ((y1.c) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.g(menuItem, c10, i10);
        }
    }

    public static void p(@androidx.annotation.n0 MenuItem menuItem, @androidx.annotation.p0 CharSequence charSequence) {
        if (menuItem instanceof y1.c) {
            ((y1.c) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(@androidx.annotation.n0 MenuItem menuItem, @androidx.annotation.p0 ColorStateList colorStateList) {
        if (menuItem instanceof y1.c) {
            ((y1.c) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(@androidx.annotation.n0 MenuItem menuItem, @androidx.annotation.p0 PorterDuff.Mode mode) {
        if (menuItem instanceof y1.c) {
            ((y1.c) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.j(menuItem, mode);
        }
    }

    public static void s(@androidx.annotation.n0 MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof y1.c) {
            ((y1.c) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.k(menuItem, c10, i10);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(@androidx.annotation.n0 MenuItem menuItem, char c10, char c11, int i10, int i11) {
        if (menuItem instanceof y1.c) {
            ((y1.c) menuItem).setShortcut(c10, c11, i10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.l(menuItem, c10, c11, i10, i11);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }

    public static void w(@androidx.annotation.n0 MenuItem menuItem, @androidx.annotation.p0 CharSequence charSequence) {
        if (menuItem instanceof y1.c) {
            ((y1.c) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.m(menuItem, charSequence);
        }
    }
}
