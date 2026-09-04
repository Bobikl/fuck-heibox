package com.max.xiaoheihe.bean.game.calendar;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameEventCountDownObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameEventCountDownObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String event_id;

    @e
    private String start_timestamp;

    public GameEventCountDownObj(@e String str, @e String str2, @e String str3) {
        this.desc = str;
        this.start_timestamp = str2;
        this.event_id = str3;
    }

    public static /* synthetic */ GameEventCountDownObj copy$default(GameEventCountDownObj gameEventCountDownObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameEventCountDownObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15039, new Class[]{GameEventCountDownObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GameEventCountDownObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameEventCountDownObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = gameEventCountDownObj.desc;
        }
        if ((i10 & 2) != 0) {
            str2 = gameEventCountDownObj.start_timestamp;
        }
        if ((i10 & 4) != 0) {
            str3 = gameEventCountDownObj.event_id;
        }
        return gameEventCountDownObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.start_timestamp;
    }

    @e
    public final String component3() {
        return this.event_id;
    }

    @d
    public final GameEventCountDownObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15038, new Class[]{String.class, String.class, String.class}, GameEventCountDownObj.class);
        return patchProxyResultProxy.isSupported ? (GameEventCountDownObj) patchProxyResultProxy.result : new GameEventCountDownObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15042, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameEventCountDownObj)) {
            return false;
        }
        GameEventCountDownObj gameEventCountDownObj = (GameEventCountDownObj) obj;
        return f0.g(this.desc, gameEventCountDownObj.desc) && f0.g(this.start_timestamp, gameEventCountDownObj.start_timestamp) && f0.g(this.event_id, gameEventCountDownObj.event_id);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getEvent_id() {
        return this.event_id;
    }

    @e
    public final String getStart_timestamp() {
        return this.start_timestamp;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15041, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.start_timestamp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.event_id;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setEvent_id(@e String str) {
        this.event_id = str;
    }

    public final void setStart_timestamp(@e String str) {
        this.start_timestamp = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15040, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameEventCountDownObj(desc=" + this.desc + ", start_timestamp=" + this.start_timestamp + ", event_id=" + this.event_id + ')';
    }
}
