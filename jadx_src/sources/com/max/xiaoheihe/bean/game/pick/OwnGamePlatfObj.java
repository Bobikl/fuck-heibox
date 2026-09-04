package com.max.xiaoheihe.bean.game.pick;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: OwnGamePlatfObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class OwnGamePlatfObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<? extends KeyDescObj> game_types;

    public OwnGamePlatfObj(@e List<? extends KeyDescObj> list) {
        this.game_types = list;
    }

    public static /* synthetic */ OwnGamePlatfObj copy$default(OwnGamePlatfObj ownGamePlatfObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{ownGamePlatfObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15289, new Class[]{OwnGamePlatfObj.class, List.class, Integer.TYPE, Object.class}, OwnGamePlatfObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (OwnGamePlatfObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = ownGamePlatfObj.game_types;
        }
        return ownGamePlatfObj.copy(list);
    }

    @e
    public final List<KeyDescObj> component1() {
        return this.game_types;
    }

    @d
    public final OwnGamePlatfObj copy(@e List<? extends KeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15288, new Class[]{List.class}, OwnGamePlatfObj.class);
        return patchProxyResultProxy.isSupported ? (OwnGamePlatfObj) patchProxyResultProxy.result : new OwnGamePlatfObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15292, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof OwnGamePlatfObj) && f0.g(this.game_types, ((OwnGamePlatfObj) obj).game_types);
    }

    @e
    public final List<KeyDescObj> getGame_types() {
        return this.game_types;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15291, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<? extends KeyDescObj> list = this.game_types;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setGame_types(@e List<? extends KeyDescObj> list) {
        this.game_types = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15290, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "OwnGamePlatfObj(game_types=" + this.game_types + ')';
    }
}
