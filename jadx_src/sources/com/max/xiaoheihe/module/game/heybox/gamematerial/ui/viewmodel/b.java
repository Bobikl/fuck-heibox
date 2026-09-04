package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameMaterialLibraryViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87708d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final KeyDescObj f87709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final KeyDescObj f87710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final KeyDescObj f87711c;

    public b(@dl.d KeyDescObj sortKey, @dl.d KeyDescObj sizeKey, @dl.d KeyDescObj filterKey) {
        f0.p(sortKey, "sortKey");
        f0.p(sizeKey, "sizeKey");
        f0.p(filterKey, "filterKey");
        this.f87709a = sortKey;
        this.f87710b = sizeKey;
        this.f87711c = filterKey;
    }

    public static /* synthetic */ b e(b bVar, KeyDescObj keyDescObj, KeyDescObj keyDescObj2, KeyDescObj keyDescObj3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar, keyDescObj, keyDescObj2, keyDescObj3, new Integer(i10), obj}, null, changeQuickRedirect, true, 37796, new Class[]{b.class, KeyDescObj.class, KeyDescObj.class, KeyDescObj.class, Integer.TYPE, Object.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            keyDescObj = bVar.f87709a;
        }
        if ((i10 & 2) != 0) {
            keyDescObj2 = bVar.f87710b;
        }
        if ((i10 & 4) != 0) {
            keyDescObj3 = bVar.f87711c;
        }
        return bVar.d(keyDescObj, keyDescObj2, keyDescObj3);
    }

    @dl.d
    public final KeyDescObj a() {
        return this.f87709a;
    }

    @dl.d
    public final KeyDescObj b() {
        return this.f87710b;
    }

    @dl.d
    public final KeyDescObj c() {
        return this.f87711c;
    }

    @dl.d
    public final b d(@dl.d KeyDescObj sortKey, @dl.d KeyDescObj sizeKey, @dl.d KeyDescObj filterKey) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sortKey, sizeKey, filterKey}, this, changeQuickRedirect, false, 37795, new Class[]{KeyDescObj.class, KeyDescObj.class, KeyDescObj.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        f0.p(sortKey, "sortKey");
        f0.p(sizeKey, "sizeKey");
        f0.p(filterKey, "filterKey");
        return new b(sortKey, sizeKey, filterKey);
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37799, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f0.g(this.f87709a, bVar.f87709a) && f0.g(this.f87710b, bVar.f87710b) && f0.g(this.f87711c, bVar.f87711c);
    }

    @dl.d
    public final KeyDescObj f() {
        return this.f87711c;
    }

    @dl.d
    public final KeyDescObj g() {
        return this.f87710b;
    }

    @dl.d
    public final KeyDescObj h() {
        return this.f87709a;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37798, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((this.f87709a.hashCode() * 31) + this.f87710b.hashCode()) * 31) + this.f87711c.hashCode();
    }

    public final boolean i() {
        return false;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37797, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FilteringInfo(sortKey=" + this.f87709a + ", sizeKey=" + this.f87710b + ", filterKey=" + this.f87711c + ')';
    }
}
