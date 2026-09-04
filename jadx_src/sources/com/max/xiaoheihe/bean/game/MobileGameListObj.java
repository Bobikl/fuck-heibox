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

/* JADX INFO: compiled from: MobileGameListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MobileGameListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MobileGameDetailsObj> game_list;

    public MobileGameListObj(@e List<MobileGameDetailsObj> list) {
        this.game_list = list;
    }

    public static /* synthetic */ MobileGameListObj copy$default(MobileGameListObj mobileGameListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mobileGameListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14914, new Class[]{MobileGameListObj.class, List.class, Integer.TYPE, Object.class}, MobileGameListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MobileGameListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = mobileGameListObj.game_list;
        }
        return mobileGameListObj.copy(list);
    }

    @e
    public final List<MobileGameDetailsObj> component1() {
        return this.game_list;
    }

    @d
    public final MobileGameListObj copy(@e List<MobileGameDetailsObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14913, new Class[]{List.class}, MobileGameListObj.class);
        return patchProxyResultProxy.isSupported ? (MobileGameListObj) patchProxyResultProxy.result : new MobileGameListObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14917, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileGameListObj) && f0.g(this.game_list, ((MobileGameListObj) obj).game_list);
    }

    @e
    public final List<MobileGameDetailsObj> getGame_list() {
        return this.game_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14916, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MobileGameDetailsObj> list = this.game_list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setGame_list(@e List<MobileGameDetailsObj> list) {
        this.game_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14915, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MobileGameListObj(game_list=" + this.game_list + ')';
    }
}
