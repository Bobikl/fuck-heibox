package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ActionMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a implements y1.c {
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 8;
    private static final int J = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f2105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f2107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f2108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f2109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Intent f2110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private char f2111r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private char f2113t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f2115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Context f2116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f2117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f2118y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f2119z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2112s = 4096;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2114u = 4096;
    private ColorStateList A = null;
    private PorterDuff.Mode B = null;
    private boolean C = false;
    private boolean D = false;
    private int E = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f2116w = context;
        this.f2105l = i11;
        this.f2106m = i10;
        this.f2107n = i13;
        this.f2108o = charSequence;
    }

    private void e() {
        Drawable drawable = this.f2115v;
        if (drawable != null) {
            if (this.C || this.D) {
                Drawable drawableR = androidx.core.graphics.drawable.d.r(drawable);
                this.f2115v = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f2115v = drawableMutate;
                if (this.C) {
                    androidx.core.graphics.drawable.d.o(drawableMutate, this.A);
                }
                if (this.D) {
                    androidx.core.graphics.drawable.d.p(this.f2115v, this.B);
                }
            }
        }
    }

    @Override // y1.c
    public androidx.core.view.b a() {
        return null;
    }

    @Override // y1.c
    public boolean b() {
        return true;
    }

    @Override // y1.c
    @n0
    public y1.c c(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // y1.c, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // y1.c
    public boolean d() {
        return false;
    }

    @Override // y1.c, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2117x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f2110q;
        if (intent == null) {
            return false;
        }
        this.f2116w.startActivity(intent);
        return true;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public y1.c setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // y1.c, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // y1.c, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2114u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2113t;
    }

    @Override // y1.c, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2118y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2106m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2115v;
    }

    @Override // y1.c, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override // y1.c, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2110q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2105l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // y1.c, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2112s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2111r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2107n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2108o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2109p;
        return charSequence != null ? charSequence : this.f2108o;
    }

    @Override // y1.c, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2119z;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public y1.c setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z10) {
        this.E = (z10 ? 4 : 0) | (this.E & (-5));
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.E & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.E & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.E & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.E & 8) == 0;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public y1.c setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f2113t = Character.toLowerCase(c10);
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f2113t = Character.toLowerCase(c10);
        this.f2114u = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.E = (z10 ? 1 : 0) | (this.E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.E = (z10 ? 2 : 0) | (this.E & (-3));
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    public y1.c setContentDescription(CharSequence charSequence) {
        this.f2118y = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.E = (z10 ? 16 : 0) | (this.E & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f2115v = androidx.core.content.d.i(this.f2116w, i10);
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2115v = drawable;
        e();
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    public MenuItem setIconTintList(@p0 ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2110q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f2111r = c10;
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f2111r = c10;
        this.f2112s = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2117x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f2111r = c10;
        this.f2113t = Character.toLowerCase(c11);
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f2111r = c10;
        this.f2112s = KeyEvent.normalizeMetaState(i10);
        this.f2113t = Character.toLowerCase(c11);
        this.f2114u = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f2108o = this.f2116w.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2108o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2109p = charSequence;
        return this;
    }

    @Override // y1.c, android.view.MenuItem
    @n0
    public y1.c setTooltipText(CharSequence charSequence) {
        this.f2119z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.E = (this.E & 8) | (z10 ? 0 : 8);
        return this;
    }
}
