package com.max.hbsearch.bean;

import bb.c;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchSuggestionV2Obj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SearchSuggestionV2Obj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String card_img;

    @e
    private String desc;

    @e
    private String img;

    @e
    private String protocol;

    @e
    private JsonObject report_extra;

    @e
    private String target;

    @e
    private String text;

    @e
    private String type;

    public SearchSuggestionV2Obj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e JsonObject jsonObject) {
        this.text = str;
        this.img = str2;
        this.type = str3;
        this.target = str4;
        this.protocol = str5;
        this.desc = str6;
        this.card_img = str7;
        this.report_extra = jsonObject;
    }

    public static /* synthetic */ SearchSuggestionV2Obj copy$default(SearchSuggestionV2Obj searchSuggestionV2Obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonObject jsonObject, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchSuggestionV2Obj, str, str2, str3, str4, str5, str6, str7, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.H7, new Class[]{SearchSuggestionV2Obj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, SearchSuggestionV2Obj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchSuggestionV2Obj) patchProxyResultProxy.result;
        }
        return searchSuggestionV2Obj.copy((i10 & 1) != 0 ? searchSuggestionV2Obj.text : str, (i10 & 2) != 0 ? searchSuggestionV2Obj.img : str2, (i10 & 4) != 0 ? searchSuggestionV2Obj.type : str3, (i10 & 8) != 0 ? searchSuggestionV2Obj.target : str4, (i10 & 16) != 0 ? searchSuggestionV2Obj.protocol : str5, (i10 & 32) != 0 ? searchSuggestionV2Obj.desc : str6, (i10 & 64) != 0 ? searchSuggestionV2Obj.card_img : str7, (i10 & 128) != 0 ? searchSuggestionV2Obj.report_extra : jsonObject);
    }

    @e
    public final String component1() {
        return this.text;
    }

    @e
    public final String component2() {
        return this.img;
    }

    @e
    public final String component3() {
        return this.type;
    }

    @e
    public final String component4() {
        return this.target;
    }

    @e
    public final String component5() {
        return this.protocol;
    }

    @e
    public final String component6() {
        return this.desc;
    }

    @e
    public final String component7() {
        return this.card_img;
    }

    @e
    public final JsonObject component8() {
        return this.report_extra;
    }

    @d
    public final SearchSuggestionV2Obj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, jsonObject}, this, changeQuickRedirect, false, c.k.G7, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class}, SearchSuggestionV2Obj.class);
        return patchProxyResultProxy.isSupported ? (SearchSuggestionV2Obj) patchProxyResultProxy.result : new SearchSuggestionV2Obj(str, str2, str3, str4, str5, str6, str7, jsonObject);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.K7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSuggestionV2Obj)) {
            return false;
        }
        SearchSuggestionV2Obj searchSuggestionV2Obj = (SearchSuggestionV2Obj) obj;
        return f0.g(this.text, searchSuggestionV2Obj.text) && f0.g(this.img, searchSuggestionV2Obj.img) && f0.g(this.type, searchSuggestionV2Obj.type) && f0.g(this.target, searchSuggestionV2Obj.target) && f0.g(this.protocol, searchSuggestionV2Obj.protocol) && f0.g(this.desc, searchSuggestionV2Obj.desc) && f0.g(this.card_img, searchSuggestionV2Obj.card_img) && f0.g(this.report_extra, searchSuggestionV2Obj.report_extra);
    }

    @e
    public final String getCard_img() {
        return this.card_img;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final JsonObject getReport_extra() {
        return this.report_extra;
    }

    @e
    public final String getTarget() {
        return this.target;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.J7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.img;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.target;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.protocol;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.card_img;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        JsonObject jsonObject = this.report_extra;
        return iHashCode7 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final void setCard_img(@e String str) {
        this.card_img = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setReport_extra(@e JsonObject jsonObject) {
        this.report_extra = jsonObject;
    }

    public final void setTarget(@e String str) {
        this.target = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.I7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchSuggestionV2Obj(text=" + this.text + ", img=" + this.img + ", type=" + this.type + ", target=" + this.target + ", protocol=" + this.protocol + ", desc=" + this.desc + ", card_img=" + this.card_img + ", report_extra=" + this.report_extra + ')';
    }
}
