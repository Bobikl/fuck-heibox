package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallOrderActionXObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallOrderActionXObj implements Serializable {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final String desc;

    @e
    private final String refund_tips_message;

    @e
    private final String refund_tips_title;

    @e
    private final String refund_tips_type;

    @e
    private final String type;

    public MallOrderActionXObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.refund_tips_type = str;
        this.refund_tips_title = str2;
        this.refund_tips_message = str3;
        this.type = str4;
        this.desc = str5;
    }

    public static /* synthetic */ MallOrderActionXObj copy$default(MallOrderActionXObj mallOrderActionXObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderActionXObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 15491, new Class[]{MallOrderActionXObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MallOrderActionXObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderActionXObj) patchProxyResultProxy.result;
        }
        return mallOrderActionXObj.copy((i10 & 1) != 0 ? mallOrderActionXObj.refund_tips_type : str, (i10 & 2) != 0 ? mallOrderActionXObj.refund_tips_title : str2, (i10 & 4) != 0 ? mallOrderActionXObj.refund_tips_message : str3, (i10 & 8) != 0 ? mallOrderActionXObj.type : str4, (i10 & 16) != 0 ? mallOrderActionXObj.desc : str5);
    }

    @e
    public final String component1() {
        return this.refund_tips_type;
    }

    @e
    public final String component2() {
        return this.refund_tips_title;
    }

    @e
    public final String component3() {
        return this.refund_tips_message;
    }

    @e
    public final String component4() {
        return this.type;
    }

    @e
    public final String component5() {
        return this.desc;
    }

    @d
    public final MallOrderActionXObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 15490, new Class[]{String.class, String.class, String.class, String.class, String.class}, MallOrderActionXObj.class);
        return patchProxyResultProxy.isSupported ? (MallOrderActionXObj) patchProxyResultProxy.result : new MallOrderActionXObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15494, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallOrderActionXObj)) {
            return false;
        }
        MallOrderActionXObj mallOrderActionXObj = (MallOrderActionXObj) obj;
        return f0.g(this.refund_tips_type, mallOrderActionXObj.refund_tips_type) && f0.g(this.refund_tips_title, mallOrderActionXObj.refund_tips_title) && f0.g(this.refund_tips_message, mallOrderActionXObj.refund_tips_message) && f0.g(this.type, mallOrderActionXObj.type) && f0.g(this.desc, mallOrderActionXObj.desc);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getRefund_tips_message() {
        return this.refund_tips_message;
    }

    @e
    public final String getRefund_tips_title() {
        return this.refund_tips_title;
    }

    @e
    public final String getRefund_tips_type() {
        return this.refund_tips_type;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15493, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.refund_tips_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refund_tips_title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refund_tips_message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.desc;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15492, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallOrderActionXObj(refund_tips_type=" + this.refund_tips_type + ", refund_tips_title=" + this.refund_tips_title + ", refund_tips_message=" + this.refund_tips_message + ", type=" + this.type + ", desc=" + this.desc + ')';
    }
}
