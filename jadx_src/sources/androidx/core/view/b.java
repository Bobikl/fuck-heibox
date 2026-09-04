package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: ActionProvider.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21454d = "ActionProvider(support)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f21456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0147b f21457c;

    /* JADX INFO: compiled from: ActionProvider.java */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        void b(boolean z10);
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActionProvider.java */
    public interface InterfaceC0147b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(@androidx.annotation.n0 Context context) {
        this.f21455a = context;
    }

    @androidx.annotation.n0
    public Context a() {
        return this.f21455a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    @androidx.annotation.n0
    public abstract View d();

    @androidx.annotation.n0
    public View e(@androidx.annotation.n0 MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(@androidx.annotation.n0 SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f21457c == null || !h()) {
            return;
        }
        this.f21457c.onActionProviderVisibilityChanged(c());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f21457c = null;
        this.f21456b = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k(@androidx.annotation.p0 a aVar) {
        this.f21456b = aVar;
    }

    public void l(@androidx.annotation.p0 InterfaceC0147b interfaceC0147b) {
        if (this.f21457c != null && interfaceC0147b != null) {
            Log.w(f21454d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f21457c = interfaceC0147b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void m(boolean z10) {
        a aVar = this.f21456b;
        if (aVar != null) {
            aVar.b(z10);
        }
    }
}
