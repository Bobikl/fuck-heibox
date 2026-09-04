package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.q0;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RouteDeserializer.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T a(@dl.d kotlinx.serialization.g<T> gVar, @dl.d Bundle bundle, @dl.d Map<String, ? extends m0<?>> typeMap) {
        f0.p(gVar, "<this>");
        f0.p(bundle, "bundle");
        f0.p(typeMap, "typeMap");
        return (T) new e(bundle, typeMap).K(gVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T b(@dl.d kotlinx.serialization.g<T> gVar, @dl.d q0 handle, @dl.d Map<String, ? extends m0<?>> typeMap) {
        f0.p(gVar, "<this>");
        f0.p(handle, "handle");
        f0.p(typeMap, "typeMap");
        return (T) new e(handle, typeMap).K(gVar);
    }
}
