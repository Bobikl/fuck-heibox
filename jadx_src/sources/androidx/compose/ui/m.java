package androidx.compose.ui;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m {
    static {
        n.a aVar = n.f15070k0;
    }

    @dl.d
    public static n a(n nVar, @dl.d n other) {
        f0.p(other, "other");
        return other == n.f15070k0 ? nVar : new CombinedModifier(nVar, other);
    }
}
