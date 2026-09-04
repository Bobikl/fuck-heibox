package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeSteamParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeSteamParams implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private SteamAcceptGameParams data;

    @e
    private List<? extends SteamAcceptGameParams> datas;

    @e
    private String html;

    @e
    private String url;

    public TradeSteamParams(@e String str, @e SteamAcceptGameParams steamAcceptGameParams, @e List<? extends SteamAcceptGameParams> list, @e String str2) {
        this.url = str;
        this.data = steamAcceptGameParams;
        this.datas = list;
        this.html = str2;
    }

    public static /* synthetic */ TradeSteamParams copy$default(TradeSteamParams tradeSteamParams, String str, SteamAcceptGameParams steamAcceptGameParams, List list, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeSteamParams, str, steamAcceptGameParams, list, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 16198, new Class[]{TradeSteamParams.class, String.class, SteamAcceptGameParams.class, List.class, String.class, Integer.TYPE, Object.class}, TradeSteamParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSteamParams) patchProxyResultProxy.result;
        }
        return tradeSteamParams.copy((i10 & 1) != 0 ? tradeSteamParams.url : str, (i10 & 2) != 0 ? tradeSteamParams.data : steamAcceptGameParams, (i10 & 4) != 0 ? tradeSteamParams.datas : list, (i10 & 8) != 0 ? tradeSteamParams.html : str2);
    }

    @e
    public final String component1() {
        return this.url;
    }

    @e
    public final SteamAcceptGameParams component2() {
        return this.data;
    }

    @e
    public final List<SteamAcceptGameParams> component3() {
        return this.datas;
    }

    @e
    public final String component4() {
        return this.html;
    }

    @d
    public final TradeSteamParams copy(@e String str, @e SteamAcceptGameParams steamAcceptGameParams, @e List<? extends SteamAcceptGameParams> list, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, steamAcceptGameParams, list, str2}, this, changeQuickRedirect, false, 16197, new Class[]{String.class, SteamAcceptGameParams.class, List.class, String.class}, TradeSteamParams.class);
        return patchProxyResultProxy.isSupported ? (TradeSteamParams) patchProxyResultProxy.result : new TradeSteamParams(str, steamAcceptGameParams, list, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16201, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeSteamParams)) {
            return false;
        }
        TradeSteamParams tradeSteamParams = (TradeSteamParams) obj;
        return f0.g(this.url, tradeSteamParams.url) && f0.g(this.data, tradeSteamParams.data) && f0.g(this.datas, tradeSteamParams.datas) && f0.g(this.html, tradeSteamParams.html);
    }

    @e
    public final SteamAcceptGameParams getData() {
        return this.data;
    }

    @e
    public final List<SteamAcceptGameParams> getDatas() {
        return this.datas;
    }

    @e
    public final String getHtml() {
        return this.html;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16200, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SteamAcceptGameParams steamAcceptGameParams = this.data;
        int iHashCode2 = (iHashCode + (steamAcceptGameParams == null ? 0 : steamAcceptGameParams.hashCode())) * 31;
        List<? extends SteamAcceptGameParams> list = this.datas;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.html;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setData(@e SteamAcceptGameParams steamAcceptGameParams) {
        this.data = steamAcceptGameParams;
    }

    public final void setDatas(@e List<? extends SteamAcceptGameParams> list) {
        this.datas = list;
    }

    public final void setHtml(@e String str) {
        this.html = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16199, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeSteamParams(url=" + this.url + ", data=" + this.data + ", datas=" + this.datas + ", html=" + this.html + ')';
    }
}
