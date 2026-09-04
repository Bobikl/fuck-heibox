package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends ListPopupWindow implements j0 {
    private static final String V = "MenuPopupWindow";
    private static Method W;
    private j0 U;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends DropDownListView {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final int f2556r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final int f2557s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private j0 f2558t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private MenuItem f2559u;

        @androidx.annotation.w0(17)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f2556r = 21;
                this.f2557s = 22;
            } else {
                this.f2556r = 22;
                this.f2557s = 21;
            }
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int d(int i10, boolean z10) {
            return super.d(i10, z10);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int e(int i10, int i11, int i12, int i13, int i14) {
            return super.e(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i10) {
            return super.f(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public void m() {
            setSelection(-1);
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            androidx.appcompat.view.menu.f fVar;
            int iPointToPosition;
            int i10;
            if (this.f2558t != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                }
                androidx.appcompat.view.menu.j item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = iPointToPosition - headersCount) >= 0 && i10 < fVar.getCount()) {
                    item = fVar.getItem(i10);
                }
                MenuItem menuItem = this.f2559u;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g gVarB = fVar.b();
                    if (menuItem != null) {
                        this.f2558t.i(gVarB, menuItem);
                    }
                    this.f2559u = item;
                    if (item != null) {
                        this.f2558t.c(gVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f2556r) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f2557s) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.f) adapter).b().f(false);
            return true;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(j0 j0Var) {
            this.f2558t = j0Var;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    @androidx.annotation.w0(23)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @androidx.annotation.u
        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @androidx.annotation.w0(29)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                W = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(V, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.appcompat.widget.j0
    public void c(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.n0 MenuItem menuItem) {
        j0 j0Var = this.U;
        if (j0Var != null) {
            j0Var.c(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.j0
    public void i(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.n0 MenuItem menuItem) {
        j0 j0Var = this.U;
        if (j0Var != null) {
            j0Var.i(gVar, menuItem);
        }
    }

    public void o0(Object obj) {
        a.a(this.G, (Transition) obj);
    }

    public void p0(Object obj) {
        a.b(this.G, (Transition) obj);
    }

    public void q0(j0 j0Var) {
        this.U = j0Var;
    }

    public void r0(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.G, z10);
            return;
        }
        Method method = W;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i(V, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @androidx.annotation.n0
    DropDownListView t(Context context, boolean z10) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z10);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
