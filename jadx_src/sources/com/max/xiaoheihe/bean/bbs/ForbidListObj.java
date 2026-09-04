package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ForbidListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ForbidListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<String> reasons;

    public ForbidListObj(@e List<String> list) {
        this.reasons = list;
    }

    public static /* synthetic */ ForbidListObj copy$default(ForbidListObj forbidListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{forbidListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14289, new Class[]{ForbidListObj.class, List.class, Integer.TYPE, Object.class}, ForbidListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ForbidListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = forbidListObj.reasons;
        }
        return forbidListObj.copy(list);
    }

    @e
    public final List<String> component1() {
        return this.reasons;
    }

    @d
    public final ForbidListObj copy(@e List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14288, new Class[]{List.class}, ForbidListObj.class);
        return patchProxyResultProxy.isSupported ? (ForbidListObj) patchProxyResultProxy.result : new ForbidListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14292, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForbidListObj) && f0.g(this.reasons, ((ForbidListObj) obj).reasons);
    }

    @e
    public final List<String> getReasons() {
        return this.reasons;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14291, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<String> list = this.reasons;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setReasons(@e List<String> list) {
        this.reasons = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14290, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ForbidListObj(reasons=" + this.reasons + ')';
    }
}
