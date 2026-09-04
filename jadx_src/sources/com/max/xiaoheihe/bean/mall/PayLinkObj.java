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

/* JADX INFO: compiled from: PayLinkObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PayLinkObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String msg;

    @e
    private List<KeyDescObj> notice;

    @e
    private String pay_link;

    @e
    private String pay_url;

    @e
    private String state;

    public PayLinkObj(@e String str, @e String str2, @e String str3, @e String str4, @e List<KeyDescObj> list) {
        this.pay_url = str;
        this.pay_link = str2;
        this.state = str3;
        this.msg = str4;
        this.notice = list;
    }

    public static /* synthetic */ PayLinkObj copy$default(PayLinkObj payLinkObj, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{payLinkObj, str, str2, str3, str4, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15547, new Class[]{PayLinkObj.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, PayLinkObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PayLinkObj) patchProxyResultProxy.result;
        }
        return payLinkObj.copy((i10 & 1) != 0 ? payLinkObj.pay_url : str, (i10 & 2) != 0 ? payLinkObj.pay_link : str2, (i10 & 4) != 0 ? payLinkObj.state : str3, (i10 & 8) != 0 ? payLinkObj.msg : str4, (i10 & 16) != 0 ? payLinkObj.notice : list);
    }

    @e
    public final String component1() {
        return this.pay_url;
    }

    @e
    public final String component2() {
        return this.pay_link;
    }

    @e
    public final String component3() {
        return this.state;
    }

    @e
    public final String component4() {
        return this.msg;
    }

    @e
    public final List<KeyDescObj> component5() {
        return this.notice;
    }

    @d
    public final PayLinkObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e List<KeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, list}, this, changeQuickRedirect, false, 15546, new Class[]{String.class, String.class, String.class, String.class, List.class}, PayLinkObj.class);
        return patchProxyResultProxy.isSupported ? (PayLinkObj) patchProxyResultProxy.result : new PayLinkObj(str, str2, str3, str4, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15550, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayLinkObj)) {
            return false;
        }
        PayLinkObj payLinkObj = (PayLinkObj) obj;
        return f0.g(this.pay_url, payLinkObj.pay_url) && f0.g(this.pay_link, payLinkObj.pay_link) && f0.g(this.state, payLinkObj.state) && f0.g(this.msg, payLinkObj.msg) && f0.g(this.notice, payLinkObj.notice);
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
    public final String getPay_link() {
        return this.pay_link;
    }

    @e
    public final String getPay_url() {
        return this.pay_url;
    }

    @e
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15549, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.pay_url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pay_link;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.msg;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<KeyDescObj> list = this.notice;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setNotice(@e List<KeyDescObj> list) {
        this.notice = list;
    }

    public final void setPay_link(@e String str) {
        this.pay_link = str;
    }

    public final void setPay_url(@e String str) {
        this.pay_url = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15548, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PayLinkObj(pay_url=" + this.pay_url + ", pay_link=" + this.pay_link + ", state=" + this.state + ", msg=" + this.msg + ", notice=" + this.notice + ')';
    }
}
