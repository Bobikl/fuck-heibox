package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n215#2,2:226\n1#3:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:226,2\n*E\n"})
public final class SavedStateHandlesProvider implements androidx.savedstate.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final androidx.savedstate.b f24119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Bundle f24121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24122d;

    public SavedStateHandlesProvider(@dl.d androidx.savedstate.b savedStateRegistry, @dl.d final c1 viewModelStoreOwner) {
        kotlin.jvm.internal.f0.p(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.f0.p(viewModelStoreOwner, "viewModelStoreOwner");
        this.f24119a = savedStateRegistry;
        this.f24122d = kotlin.b0.c(new yh.a<r0>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r0 invoke() {
                return SavedStateHandleSupport.e(viewModelStoreOwner);
            }
        });
    }

    private final r0 b() {
        return (r0) this.f24122d.getValue();
    }

    @dl.e
    public final Bundle a(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        c();
        Bundle bundle = this.f24121c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f24121c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f24121c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f24121c = null;
        }
        return bundle2;
    }

    public final void c() {
        if (this.f24120b) {
            return;
        }
        Bundle bundleB = this.f24119a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f24121c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f24121c = bundle;
        this.f24120b = true;
        b();
    }

    @Override // androidx.savedstate.b.c
    @dl.d
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f24121c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, q0> entry : b().c().entrySet()) {
            String key = entry.getKey();
            Bundle bundleSaveState = entry.getValue().o().saveState();
            if (!kotlin.jvm.internal.f0.g(bundleSaveState, Bundle.EMPTY)) {
                bundle.putBundle(key, bundleSaveState);
            }
        }
        this.f24120b = false;
        return bundle;
    }
}
