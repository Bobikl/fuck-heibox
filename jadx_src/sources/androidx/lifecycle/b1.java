package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ViewModelStore.kt */
/* JADX INFO: loaded from: classes6.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<String, w0> f24179a = new LinkedHashMap();

    public final void a() {
        Iterator<w0> it = this.f24179a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f24179a.clear();
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final w0 b(@dl.d String key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return this.f24179a.get(key);
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> c() {
        return new HashSet(this.f24179a.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d(@dl.d String key, @dl.d w0 viewModel) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(viewModel, "viewModel");
        w0 w0VarPut = this.f24179a.put(key, viewModel);
        if (w0VarPut != null) {
            w0VarPut.onCleared();
        }
    }
}
