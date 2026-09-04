package androidx.navigation.dynamicfeatures;

import androidx.navigation.Navigator;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DynamicExtras.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements Navigator.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final l f24997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Navigator.a f24998b;

    /* JADX WARN: Multi-variable type inference failed */
    @xh.i
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @xh.i
    public e(@dl.e l lVar) {
        this(lVar, null, 2, 0 == true ? 1 : 0);
    }

    @xh.i
    public e(@dl.e l lVar, @dl.e Navigator.a aVar) {
        this.f24997a = lVar;
        this.f24998b = aVar;
    }

    public /* synthetic */ e(l lVar, Navigator.a aVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : aVar);
    }

    @dl.e
    public final Navigator.a a() {
        return this.f24998b;
    }

    @dl.e
    public final l b() {
        return this.f24997a;
    }
}
