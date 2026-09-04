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

/* JADX INFO: compiled from: GameDiscountListResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameDiscountListResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String last_timestamp;

    @d
    private List<GameDiscountListObj> msg_list;
    private boolean push_state;

    public GameDiscountListResultObj(@d List<GameDiscountListObj> msg_list, @e String str, boolean z10) {
        f0.p(msg_list, "msg_list");
        this.msg_list = msg_list;
        this.last_timestamp = str;
        this.push_state = z10;
    }

    public static /* synthetic */ GameDiscountListResultObj copy$default(GameDiscountListResultObj gameDiscountListResultObj, List list, String str, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameDiscountListResultObj, list, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 14817, new Class[]{GameDiscountListResultObj.class, List.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, GameDiscountListResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDiscountListResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = gameDiscountListResultObj.msg_list;
        }
        if ((i10 & 2) != 0) {
            str = gameDiscountListResultObj.last_timestamp;
        }
        if ((i10 & 4) != 0) {
            z10 = gameDiscountListResultObj.push_state;
        }
        return gameDiscountListResultObj.copy(list, str, z10);
    }

    @d
    public final List<GameDiscountListObj> component1() {
        return this.msg_list;
    }

    @e
    public final String component2() {
        return this.last_timestamp;
    }

    public final boolean component3() {
        return this.push_state;
    }

    @d
    public final GameDiscountListResultObj copy(@d List<GameDiscountListObj> msg_list, @e String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{msg_list, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 14816, new Class[]{List.class, String.class, Boolean.TYPE}, GameDiscountListResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDiscountListResultObj) patchProxyResultProxy.result;
        }
        f0.p(msg_list, "msg_list");
        return new GameDiscountListResultObj(msg_list, str, z10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14820, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameDiscountListResultObj)) {
            return false;
        }
        GameDiscountListResultObj gameDiscountListResultObj = (GameDiscountListResultObj) obj;
        return f0.g(this.msg_list, gameDiscountListResultObj.msg_list) && f0.g(this.last_timestamp, gameDiscountListResultObj.last_timestamp) && this.push_state == gameDiscountListResultObj.push_state;
    }

    @e
    public final String getLast_timestamp() {
        return this.last_timestamp;
    }

    @d
    public final List<GameDiscountListObj> getMsg_list() {
        return this.msg_list;
    }

    public final boolean getPush_state() {
        return this.push_state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14819, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.msg_list.hashCode() * 31;
        String str = this.last_timestamp;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z10 = this.push_state;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode2 + r10;
    }

    public final void setLast_timestamp(@e String str) {
        this.last_timestamp = str;
    }

    public final void setMsg_list(@d List<GameDiscountListObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14815, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.msg_list = list;
    }

    public final void setPush_state(boolean z10) {
        this.push_state = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14818, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameDiscountListResultObj(msg_list=" + this.msg_list + ", last_timestamp=" + this.last_timestamp + ", push_state=" + this.push_state + ')';
    }
}
