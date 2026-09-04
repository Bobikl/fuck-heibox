package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.o;
import androidx.collection.j2;
import java.util.ArrayList;

/* JADX INFO: compiled from: SupportActionModeWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f2002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f2003b;

    /* JADX INFO: compiled from: SupportActionModeWrapper.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f2004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f2005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f> f2006c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final j2<Menu, Menu> f2007d = new j2<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f2005b = context;
            this.f2004a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f2007d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f2005b, (y1.a) menu);
            this.f2007d.put(menu, oVar);
            return oVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f2004a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, MenuItem menuItem) {
            return this.f2004a.onActionItemClicked(e(bVar), new MenuItemWrapperICS(this.f2005b, (y1.c) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f2004a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public void d(b bVar) {
            this.f2004a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f2006c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f2006c.get(i10);
                if (fVar != null && fVar.f2003b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f2005b, bVar);
            this.f2006c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f2002a = context;
        this.f2003b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2003b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2003b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f2002a, (y1.a) this.f2003b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2003b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2003b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2003b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2003b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2003b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2003b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2003b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2003b.n(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f2003b.o(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2003b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2003b.q(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f2003b.r(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2003b.s(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f2003b.t(z10);
    }
}
