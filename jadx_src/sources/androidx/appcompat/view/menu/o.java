package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: MenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class o extends c implements Menu {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final y1.a f2237o;

    public o(Context context, y1.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2237o = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return e(this.f2237o.add(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return e(this.f2237o.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return e(this.f2237o.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return e(this.f2237o.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f2237o.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = e(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return f(this.f2237o.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return f(this.f2237o.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return f(this.f2237o.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.f2237o.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        g();
        this.f2237o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f2237o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return e(this.f2237o.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return e(this.f2237o.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f2237o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f2237o.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f2237o.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f2237o.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        h(i10);
        this.f2237o.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        i(i10);
        this.f2237o.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f2237o.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f2237o.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f2237o.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f2237o.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2237o.size();
    }
}
