package com.max.xiaoheihe.bean.mall;

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

/* JADX INFO: compiled from: MallSteamOrderObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallSteamOrderObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String has_url;

    @e
    private String msg;

    @e
    private List<KeyDescObj> notice;

    @e
    private String order_id;

    @e
    private Integer retry_attempts;

    @e
    private Integer retry_delay;

    @e
    private String state;

    public MallSteamOrderObj(@e String str, @e String str2, @e String str3, @e List<KeyDescObj> list, @e String str4, @e Integer num, @e Integer num2) {
        this.order_id = str;
        this.has_url = str2;
        this.state = str3;
        this.notice = list;
        this.msg = str4;
        this.retry_attempts = num;
        this.retry_delay = num2;
    }

    public static /* synthetic */ MallSteamOrderObj copy$default(MallSteamOrderObj mallSteamOrderObj, String str, String str2, String str3, List list, String str4, Integer num, Integer num2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallSteamOrderObj, str, str2, str3, list, str4, num, num2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15507, new Class[]{MallSteamOrderObj.class, String.class, String.class, String.class, List.class, String.class, Integer.class, Integer.class, Integer.TYPE, Object.class}, MallSteamOrderObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallSteamOrderObj) patchProxyResultProxy.result;
        }
        return mallSteamOrderObj.copy((i10 & 1) != 0 ? mallSteamOrderObj.order_id : str, (i10 & 2) != 0 ? mallSteamOrderObj.has_url : str2, (i10 & 4) != 0 ? mallSteamOrderObj.state : str3, (i10 & 8) != 0 ? mallSteamOrderObj.notice : list, (i10 & 16) != 0 ? mallSteamOrderObj.msg : str4, (i10 & 32) != 0 ? mallSteamOrderObj.retry_attempts : num, (i10 & 64) != 0 ? mallSteamOrderObj.retry_delay : num2);
    }

    @e
    public final String component1() {
        return this.order_id;
    }

    @e
    public final String component2() {
        return this.has_url;
    }

    @e
    public final String component3() {
        return this.state;
    }

    @e
    public final List<KeyDescObj> component4() {
        return this.notice;
    }

    @e
    public final String component5() {
        return this.msg;
    }

    @e
    public final Integer component6() {
        return this.retry_attempts;
    }

    @e
    public final Integer component7() {
        return this.retry_delay;
    }

    @d
    public final MallSteamOrderObj copy(@e String str, @e String str2, @e String str3, @e List<KeyDescObj> list, @e String str4, @e Integer num, @e Integer num2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list, str4, num, num2}, this, changeQuickRedirect, false, 15506, new Class[]{String.class, String.class, String.class, List.class, String.class, Integer.class, Integer.class}, MallSteamOrderObj.class);
        return patchProxyResultProxy.isSupported ? (MallSteamOrderObj) patchProxyResultProxy.result : new MallSteamOrderObj(str, str2, str3, list, str4, num, num2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15510, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallSteamOrderObj)) {
            return false;
        }
        MallSteamOrderObj mallSteamOrderObj = (MallSteamOrderObj) obj;
        return f0.g(this.order_id, mallSteamOrderObj.order_id) && f0.g(this.has_url, mallSteamOrderObj.has_url) && f0.g(this.state, mallSteamOrderObj.state) && f0.g(this.notice, mallSteamOrderObj.notice) && f0.g(this.msg, mallSteamOrderObj.msg) && f0.g(this.retry_attempts, mallSteamOrderObj.retry_attempts) && f0.g(this.retry_delay, mallSteamOrderObj.retry_delay);
    }

    @e
    public final String getHas_url() {
        return this.has_url;
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final List<KeyDescObj> getNotice() {
        return this.notice;
    }

    @e
    public final String getOrder_id() {
        return this.order_id;
    }

    @e
    public final Integer getRetry_attempts() {
        return this.retry_attempts;
    }

    @e
    public final Integer getRetry_delay() {
        return this.retry_delay;
    }

    @e
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15509, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.order_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.has_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<KeyDescObj> list = this.notice;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.msg;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.retry_attempts;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.retry_delay;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setHas_url(@e String str) {
        this.has_url = str;
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setNotice(@e List<KeyDescObj> list) {
        this.notice = list;
    }

    public final void setOrder_id(@e String str) {
        this.order_id = str;
    }

    public final void setRetry_attempts(@e Integer num) {
        this.retry_attempts = num;
    }

    public final void setRetry_delay(@e Integer num) {
        this.retry_delay = num;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15508, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallSteamOrderObj(order_id=" + this.order_id + ", has_url=" + this.has_url + ", state=" + this.state + ", notice=" + this.notice + ", msg=" + this.msg + ", retry_attempts=" + this.retry_attempts + ", retry_delay=" + this.retry_delay + ')';
    }
}
