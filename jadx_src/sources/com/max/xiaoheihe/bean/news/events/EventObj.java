package com.max.xiaoheihe.bean.news.events;

import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbuikit.bean.UiKitViewObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EventObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EventObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String event_type;

    @e
    private String image;

    @e
    private String main_color;

    @e
    private String protocol;

    @e
    private JsonObject report_extra;

    @e
    private String title;

    @e
    private UiKitViewObj uikit;

    public EventObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e UiKitViewObj uiKitViewObj, @e JsonObject jsonObject) {
        this.event_type = str;
        this.image = str2;
        this.title = str3;
        this.desc = str4;
        this.main_color = str5;
        this.protocol = str6;
        this.uikit = uiKitViewObj;
        this.report_extra = jsonObject;
    }

    public static /* synthetic */ EventObj copy$default(EventObj eventObj, String str, String str2, String str3, String str4, String str5, String str6, UiKitViewObj uiKitViewObj, JsonObject jsonObject, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eventObj, str, str2, str3, str4, str5, str6, uiKitViewObj, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, 15776, new Class[]{EventObj.class, String.class, String.class, String.class, String.class, String.class, String.class, UiKitViewObj.class, JsonObject.class, Integer.TYPE, Object.class}, EventObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EventObj) patchProxyResultProxy.result;
        }
        return eventObj.copy((i10 & 1) != 0 ? eventObj.event_type : str, (i10 & 2) != 0 ? eventObj.image : str2, (i10 & 4) != 0 ? eventObj.title : str3, (i10 & 8) != 0 ? eventObj.desc : str4, (i10 & 16) != 0 ? eventObj.main_color : str5, (i10 & 32) != 0 ? eventObj.protocol : str6, (i10 & 64) != 0 ? eventObj.uikit : uiKitViewObj, (i10 & 128) != 0 ? eventObj.report_extra : jsonObject);
    }

    @e
    public final String component1() {
        return this.event_type;
    }

    @e
    public final String component2() {
        return this.image;
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
        return this.main_color;
    }

    @e
    public final String component6() {
        return this.protocol;
    }

    @e
    public final UiKitViewObj component7() {
        return this.uikit;
    }

    @e
    public final JsonObject component8() {
        return this.report_extra;
    }

    @d
    public final EventObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e UiKitViewObj uiKitViewObj, @e JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, uiKitViewObj, jsonObject}, this, changeQuickRedirect, false, 15775, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, UiKitViewObj.class, JsonObject.class}, EventObj.class);
        return patchProxyResultProxy.isSupported ? (EventObj) patchProxyResultProxy.result : new EventObj(str, str2, str3, str4, str5, str6, uiKitViewObj, jsonObject);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15779, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventObj)) {
            return false;
        }
        EventObj eventObj = (EventObj) obj;
        return f0.g(this.event_type, eventObj.event_type) && f0.g(this.image, eventObj.image) && f0.g(this.title, eventObj.title) && f0.g(this.desc, eventObj.desc) && f0.g(this.main_color, eventObj.main_color) && f0.g(this.protocol, eventObj.protocol) && f0.g(this.uikit, eventObj.uikit) && f0.g(this.report_extra, eventObj.report_extra);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getEvent_type() {
        return this.event_type;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getMain_color() {
        return this.main_color;
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
    public final String getTitle() {
        return this.title;
    }

    @e
    public final UiKitViewObj getUikit() {
        return this.uikit;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15778, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.event_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.main_color;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.protocol;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UiKitViewObj uiKitViewObj = this.uikit;
        int iHashCode7 = (iHashCode6 + (uiKitViewObj == null ? 0 : uiKitViewObj.hashCode())) * 31;
        JsonObject jsonObject = this.report_extra;
        return iHashCode7 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setEvent_type(@e String str) {
        this.event_type = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setMain_color(@e String str) {
        this.main_color = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setReport_extra(@e JsonObject jsonObject) {
        this.report_extra = jsonObject;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setUikit(@e UiKitViewObj uiKitViewObj) {
        this.uikit = uiKitViewObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15777, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EventObj(event_type=" + this.event_type + ", image=" + this.image + ", title=" + this.title + ", desc=" + this.desc + ", main_color=" + this.main_color + ", protocol=" + this.protocol + ", uikit=" + this.uikit + ", report_extra=" + this.report_extra + ')';
    }
}
