package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.q0;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.c1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: RouteDecoder.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/SavedStateArgStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final q0 f25281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<String, m0<?>> f25282b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@dl.d q0 handle, @dl.d Map<String, ? extends m0<?>> typeMap) {
        f0.p(handle, "handle");
        f0.p(typeMap, "typeMap");
        this.f25281a = handle;
        this.f25282b = typeMap;
    }

    @Override // androidx.navigation.serialization.a
    public boolean a(@dl.d String key) {
        f0.p(key, "key");
        return this.f25281a.f(key);
    }

    @Override // androidx.navigation.serialization.a
    @dl.e
    public Object b(@dl.d String key) {
        f0.p(key, "key");
        Bundle bundleB = androidx.core.os.e.b(c1.a(key, this.f25281a.h(key)));
        m0<?> m0Var = this.f25282b.get(key);
        if (m0Var != null) {
            return m0Var.b(bundleB, key);
        }
        throw new IllegalStateException(("Failed to find type for " + key + " when decoding " + this.f25281a).toString());
    }
}
