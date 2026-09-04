package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RouteDecoder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Bundle f25254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<String, m0<?>> f25255b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@dl.d Bundle bundle, @dl.d Map<String, ? extends m0<?>> typeMap) {
        f0.p(bundle, "bundle");
        f0.p(typeMap, "typeMap");
        this.f25254a = bundle;
        this.f25255b = typeMap;
    }

    @Override // androidx.navigation.serialization.a
    public boolean a(@dl.d String key) {
        f0.p(key, "key");
        return this.f25254a.containsKey(key);
    }

    @Override // androidx.navigation.serialization.a
    @dl.e
    public Object b(@dl.d String key) {
        f0.p(key, "key");
        m0<?> m0Var = this.f25255b.get(key);
        if (m0Var != null) {
            return m0Var.b(this.f25254a, key);
        }
        return null;
    }
}
