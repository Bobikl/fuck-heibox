package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: SubMenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class s extends o implements SubMenu {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final y1.d f2261p;

    s(Context context, y1.d dVar) {
        super(context, dVar);
        this.f2261p = dVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f2261p.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return e(this.f2261p.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f2261p.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f2261p.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f2261p.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f2261p.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f2261p.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f2261p.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f2261p.setIcon(drawable);
        return this;
    }
}
