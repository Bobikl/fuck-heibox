package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.k0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SavedStateRegistry.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@SuppressLint({"RestrictedApi"})
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final C0218b f27389g = new C0218b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @Deprecated
    private static final String f27390h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Bundle f27393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Recreator.b f27395e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final androidx.arch.core.internal.b<String, c> f27391a = new androidx.arch.core.internal.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27396f = true;

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    public interface a {
        void a(@dl.d d dVar);
    }

    /* JADX INFO: renamed from: androidx.savedstate.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    public static final class C0218b {
        private C0218b() {
        }

        public /* synthetic */ C0218b(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    public interface c {
        @dl.d
        Bundle saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(b this$0, y yVar, Lifecycle.Event event) {
        f0.p(this$0, "this$0");
        f0.p(yVar, "<anonymous parameter 0>");
        f0.p(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this$0.f27396f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this$0.f27396f = false;
        }
    }

    @k0
    @dl.e
    public final Bundle b(@dl.d String key) {
        f0.p(key, "key");
        if (!this.f27394d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f27393c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f27393c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f27393c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f27393c = null;
        }
        return bundle2;
    }

    @dl.e
    public final c c(@dl.d String key) {
        f0.p(key, "key");
        for (Map.Entry<String, c> components : this.f27391a) {
            f0.o(components, "components");
            String key2 = components.getKey();
            c value = components.getValue();
            if (f0.g(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final boolean d() {
        return this.f27396f;
    }

    @k0
    public final boolean e() {
        return this.f27394d;
    }

    @k0
    public final void g(@dl.d Lifecycle lifecycle) {
        f0.p(lifecycle, "lifecycle");
        if (!(!this.f27392b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new v() { // from class: androidx.savedstate.a
            @Override // androidx.lifecycle.v
            public final void d(y yVar, Lifecycle.Event event) {
                b.f(this.f27388b, yVar, event);
            }
        });
        this.f27392b = true;
    }

    @k0
    public final void h(@dl.e Bundle bundle) {
        if (!this.f27392b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f27394d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f27393c = bundle != null ? bundle.getBundle(f27390h) : null;
        this.f27394d = true;
    }

    @k0
    public final void i(@dl.d Bundle outBundle) {
        f0.p(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f27393c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        androidx.arch.core.internal.b<String, c>.d dVarE = this.f27391a.e();
        f0.o(dVarE, "this.components.iteratorWithAdditions()");
        while (dVarE.hasNext()) {
            Map.Entry next = dVarE.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle(f27390h, bundle);
    }

    @k0
    public final void j(@dl.d String key, @dl.d c provider) {
        f0.p(key, "key");
        f0.p(provider, "provider");
        if (!(this.f27391a.i(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @k0
    public final void k(@dl.d Class<? extends a> clazz) {
        f0.p(clazz, "clazz");
        if (!this.f27396f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f27395e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f27395e = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f27395e;
            if (bVar2 != null) {
                String name = clazz.getName();
                f0.o(name, "clazz.name");
                bVar2.a(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void l(boolean z10) {
        this.f27396f = z10;
    }

    @k0
    public final void m(@dl.d String key) {
        f0.p(key, "key");
        this.f27391a.j(key);
    }
}
