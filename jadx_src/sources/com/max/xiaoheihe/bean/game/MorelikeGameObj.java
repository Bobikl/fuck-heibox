package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MorelikeGameObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MorelikeGameObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameObj> apps;

    public MorelikeGameObj(@e List<GameObj> list) {
        this.apps = list;
    }

    public static /* synthetic */ MorelikeGameObj copy$default(MorelikeGameObj morelikeGameObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{morelikeGameObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14919, new Class[]{MorelikeGameObj.class, List.class, Integer.TYPE, Object.class}, MorelikeGameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MorelikeGameObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = morelikeGameObj.apps;
        }
        return morelikeGameObj.copy(list);
    }

    @e
    public final List<GameObj> component1() {
        return this.apps;
    }

    @d
    public final MorelikeGameObj copy(@e List<GameObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14918, new Class[]{List.class}, MorelikeGameObj.class);
        return patchProxyResultProxy.isSupported ? (MorelikeGameObj) patchProxyResultProxy.result : new MorelikeGameObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14922, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof MorelikeGameObj) && f0.g(this.apps, ((MorelikeGameObj) obj).apps);
    }

    @e
    public final List<GameObj> getApps() {
        return this.apps;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14921, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GameObj> list = this.apps;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setApps(@e List<GameObj> list) {
        this.apps = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14920, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MorelikeGameObj(apps=" + this.apps + ')';
    }
}
