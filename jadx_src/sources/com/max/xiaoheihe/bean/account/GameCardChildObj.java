package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameCardChildObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameCardChildObj implements Serializable {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final String account_id;

    @e
    private final String desc1;

    @e
    private final String desc2;

    @e
    private final String desc3;

    @e
    private final String game_type;

    @e
    private final String protocol;

    @e
    private final Integer viewType;

    public GameCardChildObj(@e Integer num, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.viewType = num;
        this.account_id = str;
        this.game_type = str2;
        this.protocol = str3;
        this.desc1 = str4;
        this.desc2 = str5;
        this.desc3 = str6;
    }

    public static /* synthetic */ GameCardChildObj copy$default(GameCardChildObj gameCardChildObj, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameCardChildObj, num, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.dP, new Class[]{GameCardChildObj.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GameCardChildObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCardChildObj) patchProxyResultProxy.result;
        }
        return gameCardChildObj.copy((i10 & 1) != 0 ? gameCardChildObj.viewType : num, (i10 & 2) != 0 ? gameCardChildObj.account_id : str, (i10 & 4) != 0 ? gameCardChildObj.game_type : str2, (i10 & 8) != 0 ? gameCardChildObj.protocol : str3, (i10 & 16) != 0 ? gameCardChildObj.desc1 : str4, (i10 & 32) != 0 ? gameCardChildObj.desc2 : str5, (i10 & 64) != 0 ? gameCardChildObj.desc3 : str6);
    }

    @e
    public final Integer component1() {
        return this.viewType;
    }

    @e
    public final String component2() {
        return this.account_id;
    }

    @e
    public final String component3() {
        return this.game_type;
    }

    @e
    public final String component4() {
        return this.protocol;
    }

    @e
    public final String component5() {
        return this.desc1;
    }

    @e
    public final String component6() {
        return this.desc2;
    }

    @e
    public final String component7() {
        return this.desc3;
    }

    @d
    public final GameCardChildObj copy(@e Integer num, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, c.m.cP, new Class[]{Integer.class, String.class, String.class, String.class, String.class, String.class, String.class}, GameCardChildObj.class);
        return patchProxyResultProxy.isSupported ? (GameCardChildObj) patchProxyResultProxy.result : new GameCardChildObj(num, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.gP, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCardChildObj)) {
            return false;
        }
        GameCardChildObj gameCardChildObj = (GameCardChildObj) obj;
        return f0.g(this.viewType, gameCardChildObj.viewType) && f0.g(this.account_id, gameCardChildObj.account_id) && f0.g(this.game_type, gameCardChildObj.game_type) && f0.g(this.protocol, gameCardChildObj.protocol) && f0.g(this.desc1, gameCardChildObj.desc1) && f0.g(this.desc2, gameCardChildObj.desc2) && f0.g(this.desc3, gameCardChildObj.desc3);
    }

    @e
    public final String getAccount_id() {
        return this.account_id;
    }

    @e
    public final String getDesc1() {
        return this.desc1;
    }

    @e
    public final String getDesc2() {
        return this.desc2;
    }

    @e
    public final String getDesc3() {
        return this.desc3;
    }

    @e
    public final String getGame_type() {
        return this.game_type;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final Integer getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.fP, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.viewType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.account_id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.game_type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.protocol;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc1;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.desc2;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc3;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.eP, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameCardChildObj(viewType=" + this.viewType + ", account_id=" + this.account_id + ", game_type=" + this.game_type + ", protocol=" + this.protocol + ", desc1=" + this.desc1 + ", desc2=" + this.desc2 + ", desc3=" + this.desc3 + ')';
    }
}
