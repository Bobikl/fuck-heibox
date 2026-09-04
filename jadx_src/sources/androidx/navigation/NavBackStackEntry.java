package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: NavBackStackEntry.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n1#2:310\n1726#3,3:311\n1855#3,2:314\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n*L\n256#1:311,3\n265#1:314,2\n*E\n"})
public final class NavBackStackEntry implements androidx.lifecycle.y, c1, r, androidx.savedstate.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final a f24725p = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Context f24726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private NavDestination f24727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final Bundle f24728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private Lifecycle.State f24729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final n0 f24730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final String f24731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private final Bundle f24732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private androidx.lifecycle.a0 f24733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final androidx.savedstate.c f24734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private Lifecycle.State f24738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final y0.b f24739o;

    /* JADX INFO: compiled from: NavBackStackEntry.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry b(a aVar, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, n0 n0Var, String str, Bundle bundle2, int i10, Object obj) {
            String str2;
            Bundle bundle3 = (i10 & 4) != 0 ? null : bundle;
            Lifecycle.State state2 = (i10 & 8) != 0 ? Lifecycle.State.CREATED : state;
            n0 n0Var2 = (i10 & 16) != 0 ? null : n0Var;
            if ((i10 & 32) != 0) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.f0.o(string, "randomUUID().toString()");
                str2 = string;
            } else {
                str2 = str;
            }
            return aVar.a(context, navDestination, bundle3, state2, n0Var2, str2, (i10 & 64) != 0 ? null : bundle2);
        }

        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final NavBackStackEntry a(@dl.e Context context, @dl.d NavDestination destination, @dl.e Bundle bundle, @dl.d Lifecycle.State hostLifecycleState, @dl.e n0 n0Var, @dl.d String id2, @dl.e Bundle bundle2) {
            kotlin.jvm.internal.f0.p(destination, "destination");
            kotlin.jvm.internal.f0.p(hostLifecycleState, "hostLifecycleState");
            kotlin.jvm.internal.f0.p(id2, "id");
            return new NavBackStackEntry(context, destination, bundle, hostLifecycleState, n0Var, id2, bundle2, null);
        }
    }

    /* JADX INFO: compiled from: NavBackStackEntry.kt */
    public static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d androidx.savedstate.d owner) {
            super(owner, null);
            kotlin.jvm.internal.f0.p(owner, "owner");
        }

        @Override // androidx.lifecycle.a
        @dl.d
        protected <T extends androidx.lifecycle.w0> T e(@dl.d String key, @dl.d Class<T> modelClass, @dl.d androidx.lifecycle.q0 handle) {
            kotlin.jvm.internal.f0.p(key, "key");
            kotlin.jvm.internal.f0.p(modelClass, "modelClass");
            kotlin.jvm.internal.f0.p(handle, "handle");
            return new c(handle);
        }
    }

    /* JADX INFO: compiled from: NavBackStackEntry.kt */
    public static final class c extends androidx.lifecycle.w0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final androidx.lifecycle.q0 f24740b;

        public c(@dl.d androidx.lifecycle.q0 handle) {
            kotlin.jvm.internal.f0.p(handle, "handle");
            this.f24740b = handle;
        }

        @dl.d
        public final androidx.lifecycle.q0 c() {
            return this.f24740b;
        }
    }

    private NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, n0 n0Var, String str, Bundle bundle2) {
        this.f24726b = context;
        this.f24727c = navDestination;
        this.f24728d = bundle;
        this.f24729e = state;
        this.f24730f = n0Var;
        this.f24731g = str;
        this.f24732h = bundle2;
        this.f24733i = new androidx.lifecycle.a0(this);
        this.f24734j = androidx.savedstate.c.f27397d.a(this);
        this.f24736l = kotlin.b0.c(new yh.a<androidx.lifecycle.s0>() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.s0 invoke() {
                Context context2 = this.f24741b.f24726b;
                Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                NavBackStackEntry navBackStackEntry = this.f24741b;
                return new androidx.lifecycle.s0(application, navBackStackEntry, navBackStackEntry.c());
            }
        });
        this.f24737m = kotlin.b0.c(new yh.a<androidx.lifecycle.q0>() { // from class: androidx.navigation.NavBackStackEntry$savedStateHandle$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.q0 invoke() {
                if (!this.f24742b.f24735k) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
                }
                if (this.f24742b.getLifecycle().b() != Lifecycle.State.DESTROYED) {
                    return ((NavBackStackEntry.c) new y0(this.f24742b, new NavBackStackEntry.b(this.f24742b)).a(NavBackStackEntry.c.class)).c();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
        });
        this.f24738n = Lifecycle.State.INITIALIZED;
        this.f24739o = d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, n0 n0Var, String str, Bundle bundle2, int i10, kotlin.jvm.internal.u uVar) {
        String str2;
        Bundle bundle3 = (i10 & 4) != 0 ? null : bundle;
        Lifecycle.State state2 = (i10 & 8) != 0 ? Lifecycle.State.CREATED : state;
        n0 n0Var2 = (i10 & 16) != 0 ? null : n0Var;
        if ((i10 & 32) != 0) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.f0.o(string, "randomUUID().toString()");
            str2 = string;
        } else {
            str2 = str;
        }
        this(context, navDestination, bundle3, state2, n0Var2, str2, (i10 & 64) != 0 ? null : bundle2);
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, n0 n0Var, String str, Bundle bundle2, kotlin.jvm.internal.u uVar) {
        this(context, navDestination, bundle, state, n0Var, str, bundle2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(@dl.d NavBackStackEntry entry, @dl.e Bundle bundle) {
        this(entry.f24726b, entry.f24727c, bundle, entry.f24729e, entry.f24730f, entry.f24731g, entry.f24732h);
        kotlin.jvm.internal.f0.p(entry, "entry");
        this.f24729e = entry.f24729e;
        l(entry.f24738n);
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i10, kotlin.jvm.internal.u uVar) {
        this(navBackStackEntry, (i10 & 2) != 0 ? navBackStackEntry.c() : bundle);
    }

    private final androidx.lifecycle.s0 d() {
        return (androidx.lifecycle.s0) this.f24736l.getValue();
    }

    @dl.e
    public final Bundle c() {
        if (this.f24728d == null) {
            return null;
        }
        return new Bundle(this.f24728d);
    }

    @dl.d
    public final NavDestination e() {
        return this.f24727c;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    public boolean equals(@dl.e Object obj) {
        boolean z10;
        Set<String> setKeySet;
        boolean z11;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (!kotlin.jvm.internal.f0.g(this.f24731g, navBackStackEntry.f24731g) || !kotlin.jvm.internal.f0.g(this.f24727c, navBackStackEntry.f24727c) || !kotlin.jvm.internal.f0.g(getLifecycle(), navBackStackEntry.getLifecycle()) || !kotlin.jvm.internal.f0.g(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
            return false;
        }
        if (!kotlin.jvm.internal.f0.g(this.f24728d, navBackStackEntry.f24728d)) {
            Bundle bundle = this.f24728d;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                z10 = false;
            } else {
                if (!setKeySet.isEmpty()) {
                    Iterator<T> it = setKeySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = true;
                            break;
                        }
                        String str = (String) it.next();
                        Object obj2 = this.f24728d.get(str);
                        Bundle bundle2 = navBackStackEntry.f24728d;
                        if (!kotlin.jvm.internal.f0.g(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                            z11 = false;
                            break;
                        }
                    }
                } else {
                    z11 = true;
                    break;
                }
                if (z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public final String f() {
        return this.f24731g;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Lifecycle.State g() {
        return this.f24738n;
    }

    @Override // androidx.lifecycle.r
    @dl.d
    public u2.a getDefaultViewModelCreationExtras() {
        u2.e eVar = new u2.e(null, 1, null);
        Context context = this.f24726b;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            eVar.c(y0.a.f24293i, application);
        }
        eVar.c(SavedStateHandleSupport.f24115c, this);
        eVar.c(SavedStateHandleSupport.f24116d, this);
        Bundle bundleC = c();
        if (bundleC != null) {
            eVar.c(SavedStateHandleSupport.f24117e, bundleC);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.r
    @dl.d
    public y0.b getDefaultViewModelProviderFactory() {
        return this.f24739o;
    }

    @Override // androidx.lifecycle.y
    @dl.d
    public Lifecycle getLifecycle() {
        return this.f24733i;
    }

    @Override // androidx.savedstate.d
    @dl.d
    public androidx.savedstate.b getSavedStateRegistry() {
        return this.f24734j.b();
    }

    @Override // androidx.lifecycle.c1
    @dl.d
    public b1 getViewModelStore() {
        if (!this.f24735k) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (!(getLifecycle().b() != Lifecycle.State.DESTROYED)) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        n0 n0Var = this.f24730f;
        if (n0Var != null) {
            return n0Var.b(this.f24731g);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
    }

    @dl.d
    @androidx.annotation.k0
    public final androidx.lifecycle.q0 h() {
        return (androidx.lifecycle.q0) this.f24737m.getValue();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f24731g.hashCode() * 31) + this.f24727c.hashCode();
        Bundle bundle = this.f24728d;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = this.f24728d.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void i(@dl.d Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(event, "event");
        this.f24729e = event.getTargetState();
        m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void j(@dl.d Bundle outBundle) {
        kotlin.jvm.internal.f0.p(outBundle, "outBundle");
        this.f24734j.e(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void k(@dl.d NavDestination navDestination) {
        kotlin.jvm.internal.f0.p(navDestination, "<set-?>");
        this.f24727c = navDestination;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void l(@dl.d Lifecycle.State maxState) {
        kotlin.jvm.internal.f0.p(maxState, "maxState");
        this.f24738n = maxState;
        m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void m() {
        if (!this.f24735k) {
            this.f24734j.c();
            this.f24735k = true;
            if (this.f24730f != null) {
                SavedStateHandleSupport.c(this);
            }
            this.f24734j.d(this.f24732h);
        }
        if (this.f24729e.ordinal() < this.f24738n.ordinal()) {
            this.f24733i.s(this.f24729e);
        } else {
            this.f24733i.s(this.f24738n);
        }
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NavBackStackEntry.class.getSimpleName());
        sb2.append('(' + this.f24731g + ')');
        sb2.append(" destination=");
        sb2.append(this.f24727c);
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }
}
