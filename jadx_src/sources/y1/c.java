package y1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: SupportMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface c extends MenuItem {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f141530g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f141531h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f141532i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f141533j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f141534k = 8;

    @p0
    androidx.core.view.b a();

    boolean b();

    @n0
    c c(@p0 androidx.core.view.b bVar);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @p0
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @p0
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @p0
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @p0
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @p0
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @n0
    MenuItem setActionView(int i10);

    @Override // android.view.MenuItem
    @n0
    MenuItem setActionView(@p0 View view);

    @Override // android.view.MenuItem
    @n0
    MenuItem setAlphabeticShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    @n0
    /* bridge */ /* synthetic */ MenuItem setContentDescription(@p0 CharSequence charSequence);

    @Override // android.view.MenuItem
    @n0
    c setContentDescription(@p0 CharSequence charSequence);

    @Override // android.view.MenuItem
    @n0
    MenuItem setIconTintList(@p0 ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @n0
    MenuItem setIconTintMode(@p0 PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @n0
    MenuItem setNumericShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    @n0
    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    @Override // android.view.MenuItem
    void setShowAsAction(int i10);

    @Override // android.view.MenuItem
    @n0
    MenuItem setShowAsActionFlags(int i10);

    @Override // android.view.MenuItem
    @n0
    /* bridge */ /* synthetic */ MenuItem setTooltipText(@p0 CharSequence charSequence);

    @Override // android.view.MenuItem
    @n0
    c setTooltipText(@p0 CharSequence charSequence);
}
