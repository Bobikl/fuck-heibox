package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RefundObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MoreOptionBtnsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String btn_title;

    @e
    private String tips_alert_cancel_btn_text;

    @e
    private String tips_alert_confirm_btn_text;

    @e
    private Boolean tips_alert_next_on_cancel;

    @e
    private String tips_message;

    @e
    private String tips_title;

    @e
    private String tips_type;

    @e
    private String type;

    public MoreOptionBtnsObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Boolean bool) {
        this.type = str;
        this.btn_title = str2;
        this.tips_type = str3;
        this.tips_title = str4;
        this.tips_message = str5;
        this.tips_alert_confirm_btn_text = str6;
        this.tips_alert_cancel_btn_text = str7;
        this.tips_alert_next_on_cancel = bool;
    }

    public static /* synthetic */ MoreOptionBtnsObj copy$default(MoreOptionBtnsObj moreOptionBtnsObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{moreOptionBtnsObj, str, str2, str3, str4, str5, str6, str7, bool, new Integer(i10), obj}, null, changeQuickRedirect, true, 15517, new Class[]{MoreOptionBtnsObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Integer.TYPE, Object.class}, MoreOptionBtnsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MoreOptionBtnsObj) patchProxyResultProxy.result;
        }
        return moreOptionBtnsObj.copy((i10 & 1) != 0 ? moreOptionBtnsObj.type : str, (i10 & 2) != 0 ? moreOptionBtnsObj.btn_title : str2, (i10 & 4) != 0 ? moreOptionBtnsObj.tips_type : str3, (i10 & 8) != 0 ? moreOptionBtnsObj.tips_title : str4, (i10 & 16) != 0 ? moreOptionBtnsObj.tips_message : str5, (i10 & 32) != 0 ? moreOptionBtnsObj.tips_alert_confirm_btn_text : str6, (i10 & 64) != 0 ? moreOptionBtnsObj.tips_alert_cancel_btn_text : str7, (i10 & 128) != 0 ? moreOptionBtnsObj.tips_alert_next_on_cancel : bool);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.btn_title;
    }

    @e
    public final String component3() {
        return this.tips_type;
    }

    @e
    public final String component4() {
        return this.tips_title;
    }

    @e
    public final String component5() {
        return this.tips_message;
    }

    @e
    public final String component6() {
        return this.tips_alert_confirm_btn_text;
    }

    @e
    public final String component7() {
        return this.tips_alert_cancel_btn_text;
    }

    @e
    public final Boolean component8() {
        return this.tips_alert_next_on_cancel;
    }

    @d
    public final MoreOptionBtnsObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, bool}, this, changeQuickRedirect, false, 15516, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class}, MoreOptionBtnsObj.class);
        return patchProxyResultProxy.isSupported ? (MoreOptionBtnsObj) patchProxyResultProxy.result : new MoreOptionBtnsObj(str, str2, str3, str4, str5, str6, str7, bool);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15520, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreOptionBtnsObj)) {
            return false;
        }
        MoreOptionBtnsObj moreOptionBtnsObj = (MoreOptionBtnsObj) obj;
        return f0.g(this.type, moreOptionBtnsObj.type) && f0.g(this.btn_title, moreOptionBtnsObj.btn_title) && f0.g(this.tips_type, moreOptionBtnsObj.tips_type) && f0.g(this.tips_title, moreOptionBtnsObj.tips_title) && f0.g(this.tips_message, moreOptionBtnsObj.tips_message) && f0.g(this.tips_alert_confirm_btn_text, moreOptionBtnsObj.tips_alert_confirm_btn_text) && f0.g(this.tips_alert_cancel_btn_text, moreOptionBtnsObj.tips_alert_cancel_btn_text) && f0.g(this.tips_alert_next_on_cancel, moreOptionBtnsObj.tips_alert_next_on_cancel);
    }

    @e
    public final String getBtn_title() {
        return this.btn_title;
    }

    @e
    public final String getTips_alert_cancel_btn_text() {
        return this.tips_alert_cancel_btn_text;
    }

    @e
    public final String getTips_alert_confirm_btn_text() {
        return this.tips_alert_confirm_btn_text;
    }

    @e
    public final Boolean getTips_alert_next_on_cancel() {
        return this.tips_alert_next_on_cancel;
    }

    @e
    public final String getTips_message() {
        return this.tips_message;
    }

    @e
    public final String getTips_title() {
        return this.tips_title;
    }

    @e
    public final String getTips_type() {
        return this.tips_type;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15519, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.btn_title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tips_type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tips_title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tips_message;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tips_alert_confirm_btn_text;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tips_alert_cancel_btn_text;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.tips_alert_next_on_cancel;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setBtn_title(@e String str) {
        this.btn_title = str;
    }

    public final void setTips_alert_cancel_btn_text(@e String str) {
        this.tips_alert_cancel_btn_text = str;
    }

    public final void setTips_alert_confirm_btn_text(@e String str) {
        this.tips_alert_confirm_btn_text = str;
    }

    public final void setTips_alert_next_on_cancel(@e Boolean bool) {
        this.tips_alert_next_on_cancel = bool;
    }

    public final void setTips_message(@e String str) {
        this.tips_message = str;
    }

    public final void setTips_title(@e String str) {
        this.tips_title = str;
    }

    public final void setTips_type(@e String str) {
        this.tips_type = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15518, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MoreOptionBtnsObj(type=" + this.type + ", btn_title=" + this.btn_title + ", tips_type=" + this.tips_type + ", tips_title=" + this.tips_title + ", tips_message=" + this.tips_message + ", tips_alert_confirm_btn_text=" + this.tips_alert_confirm_btn_text + ", tips_alert_cancel_btn_text=" + this.tips_alert_cancel_btn_text + ", tips_alert_next_on_cancel=" + this.tips_alert_next_on_cancel + ')';
    }
}
