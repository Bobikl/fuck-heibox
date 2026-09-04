package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: CustomTabsServiceConnection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private Context f3236b;

    /* JADX INFO: compiled from: CustomTabsServiceConnection.java */
    public class a extends c {
        a(android.support.customtabs.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    Context a() {
        return this.f3236b;
    }

    public abstract void b(@n0 ComponentName componentName, @n0 c cVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void c(@n0 Context context) {
        this.f3236b = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@n0 ComponentName componentName, @n0 IBinder iBinder) {
        if (this.f3236b == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        b(componentName, new a(android.support.customtabs.b.AbstractBinderC0005b.g(iBinder), componentName, this.f3236b));
    }
}
