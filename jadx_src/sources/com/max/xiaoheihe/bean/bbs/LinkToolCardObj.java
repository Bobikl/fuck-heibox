package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.hbuikit.bean.UiKitViewObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LinkToolCardObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class LinkToolCardObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String btn;

    @e
    private String card_id;

    @e
    private String desc;

    @e
    private String icon;

    @e
    private String image;

    @e
    private String protocol;

    @e
    private UiKitViewObj rich_ui;

    @e
    private String text;

    @e
    private String title;

    public LinkToolCardObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e UiKitViewObj uiKitViewObj) {
        this.card_id = str;
        this.icon = str2;
        this.title = str3;
        this.desc = str4;
        this.image = str5;
        this.text = str6;
        this.btn = str7;
        this.protocol = str8;
        this.rich_ui = uiKitViewObj;
    }

    public static /* synthetic */ LinkToolCardObj copy$default(LinkToolCardObj linkToolCardObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, UiKitViewObj uiKitViewObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkToolCardObj, str, str2, str3, str4, str5, str6, str7, str8, uiKitViewObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14334, new Class[]{LinkToolCardObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, UiKitViewObj.class, Integer.TYPE, Object.class}, LinkToolCardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkToolCardObj) patchProxyResultProxy.result;
        }
        return linkToolCardObj.copy((i10 & 1) != 0 ? linkToolCardObj.card_id : str, (i10 & 2) != 0 ? linkToolCardObj.icon : str2, (i10 & 4) != 0 ? linkToolCardObj.title : str3, (i10 & 8) != 0 ? linkToolCardObj.desc : str4, (i10 & 16) != 0 ? linkToolCardObj.image : str5, (i10 & 32) != 0 ? linkToolCardObj.text : str6, (i10 & 64) != 0 ? linkToolCardObj.btn : str7, (i10 & 128) != 0 ? linkToolCardObj.protocol : str8, (i10 & 256) != 0 ? linkToolCardObj.rich_ui : uiKitViewObj);
    }

    @e
    public final String component1() {
        return this.card_id;
    }

    @e
    public final String component2() {
        return this.icon;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final String component4() {
        return this.desc;
    }

    @e
    public final String component5() {
        return this.image;
    }

    @e
    public final String component6() {
        return this.text;
    }

    @e
    public final String component7() {
        return this.btn;
    }

    @e
    public final String component8() {
        return this.protocol;
    }

    @e
    public final UiKitViewObj component9() {
        return this.rich_ui;
    }

    @d
    public final LinkToolCardObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e UiKitViewObj uiKitViewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, uiKitViewObj}, this, changeQuickRedirect, false, 14333, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, UiKitViewObj.class}, LinkToolCardObj.class);
        return patchProxyResultProxy.isSupported ? (LinkToolCardObj) patchProxyResultProxy.result : new LinkToolCardObj(str, str2, str3, str4, str5, str6, str7, str8, uiKitViewObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14337, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkToolCardObj)) {
            return false;
        }
        LinkToolCardObj linkToolCardObj = (LinkToolCardObj) obj;
        return f0.g(this.card_id, linkToolCardObj.card_id) && f0.g(this.icon, linkToolCardObj.icon) && f0.g(this.title, linkToolCardObj.title) && f0.g(this.desc, linkToolCardObj.desc) && f0.g(this.image, linkToolCardObj.image) && f0.g(this.text, linkToolCardObj.text) && f0.g(this.btn, linkToolCardObj.btn) && f0.g(this.protocol, linkToolCardObj.protocol) && f0.g(this.rich_ui, linkToolCardObj.rich_ui);
    }

    @e
    public final String getBtn() {
        return this.btn;
    }

    @e
    public final String getCard_id() {
        return this.card_id;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final UiKitViewObj getRich_ui() {
        return this.rich_ui;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14336, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.card_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.text;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.btn;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.protocol;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UiKitViewObj uiKitViewObj = this.rich_ui;
        return iHashCode8 + (uiKitViewObj != null ? uiKitViewObj.hashCode() : 0);
    }

    public final void setBtn(@e String str) {
        this.btn = str;
    }

    public final void setCard_id(@e String str) {
        this.card_id = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setRich_ui(@e UiKitViewObj uiKitViewObj) {
        this.rich_ui = uiKitViewObj;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14335, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LinkToolCardObj(card_id=" + this.card_id + ", icon=" + this.icon + ", title=" + this.title + ", desc=" + this.desc + ", image=" + this.image + ", text=" + this.text + ", btn=" + this.btn + ", protocol=" + this.protocol + ", rich_ui=" + this.rich_ui + ')';
    }
}
