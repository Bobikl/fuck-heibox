package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.w0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuItemWrapperICS extends androidx.appcompat.view.menu.c implements MenuItem {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f2093q = "MenuItemWrapper";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final y1.c f2094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Method f2095p;

    public static class CollapsibleActionViewWrapper extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CollapsibleActionView f2096b;

        /* JADX WARN: Multi-variable type inference failed */
        CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f2096b = (CollapsibleActionView) view;
            addView(view);
        }

        View getWrappedView() {
            return (View) this.f2096b;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f2096b.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f2096b.onActionViewExpanded();
        }
    }

    public class a extends androidx.core.view.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ActionProvider f2097e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2097e = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f2097e.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View d() {
            return this.f2097e.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean f() {
            return this.f2097e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void g(SubMenu subMenu) {
            this.f2097e.onPrepareSubMenu(MenuItemWrapperICS.this.f(subMenu));
        }
    }

    @w0(16)
    public class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.core.view.b.InterfaceC0147b f2099g;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean c() {
            return this.f2097e.isVisible();
        }

        @Override // androidx.core.view.b
        public View e(MenuItem menuItem) {
            return this.f2097e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean h() {
            return this.f2097e.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void i() {
            this.f2097e.refreshVisibility();
        }

        @Override // androidx.core.view.b
        public void l(androidx.core.view.b.InterfaceC0147b interfaceC0147b) {
            this.f2099g = interfaceC0147b;
            this.f2097e.setVisibilityListener(interfaceC0147b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            androidx.core.view.b.InterfaceC0147b interfaceC0147b = this.f2099g;
            if (interfaceC0147b != null) {
                interfaceC0147b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    public class c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f2101a;

        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f2101a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f2101a.onMenuItemActionCollapse(MenuItemWrapperICS.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f2101a.onMenuItemActionExpand(MenuItemWrapperICS.this.e(menuItem));
        }
    }

    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f2103a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f2103a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f2103a.onMenuItemClick(MenuItemWrapperICS.this.e(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, y1.c cVar) {
        super(context);
        if (cVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2094o = cVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f2094o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f2094o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b bVarA = this.f2094o.a();
        if (bVarA instanceof a) {
            return ((a) bVarA).f2097e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f2094o.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper) actionView).getWrappedView() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2094o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2094o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2094o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2094o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2094o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2094o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2094o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2094o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2094o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2094o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2094o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2094o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2094o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f2094o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2094o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f2094o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2094o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2094o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2094o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f2094o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f2094o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f2094o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f2094o.isVisible();
    }

    public void j(boolean z10) {
        try {
            if (this.f2095p == null) {
                this.f2095p = this.f2094o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f2095p.invoke(this.f2094o, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w(f2093q, "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f2130l, actionProvider);
        y1.c cVar = this.f2094o;
        if (actionProvider == null) {
            bVar = null;
        }
        cVar.c(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f2094o.setActionView(i10);
        View actionView = this.f2094o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f2094o.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.f2094o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f2094o.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f2094o.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f2094o.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f2094o.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f2094o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f2094o.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f2094o.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2094o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2094o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2094o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2094o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f2094o.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f2094o.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2094o.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2094o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f2094o.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f2094o.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f2094o.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f2094o.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f2094o.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2094o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2094o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f2094o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f2094o.setVisible(z10);
    }
}
