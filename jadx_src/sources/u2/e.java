package u2;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public e(@dl.d a initialExtras) {
        f0.p(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ e(a aVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? a.C1270a.f140743b : aVar);
    }

    @Override // u2.a
    @dl.e
    public <T> T a(@dl.d a.b<T> key) {
        f0.p(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@dl.d a.b<T> key, T t10) {
        f0.p(key, "key");
        b().put(key, t10);
    }
}
