package com.max.hbuikit.bean.param;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: UiKitSpanObj.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class UiKitSpanObj implements Serializable {

    @d
    public static final Companion Companion = new Companion(null);

    @d
    public static final String TYPE_BACKGROUND = "background";

    @d
    public static final String TYPE_CLICK = "click";

    @d
    public static final String TYPE_COLOR = "color";

    @d
    public static final String TYPE_FONT = "font";

    @d
    public static final String TYPE_SIZE = "size";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private UiKitBackgroundObj background;

    @e
    private Boolean bold;

    @e
    private String click_action;

    @e
    private String end;

    @e
    private String font_name;

    @e
    private UiKitMargin margin;

    @e
    private UiKitPadding padding;

    @e
    private String start;

    @e
    private String text_color;

    @e
    private String text_size;

    @e
    private String type;

    /* JADX INFO: compiled from: UiKitSpanObj.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public UiKitSpanObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e UiKitBackgroundObj uiKitBackgroundObj, @e UiKitPadding uiKitPadding, @e UiKitMargin uiKitMargin, @e Boolean bool) {
        this.type = str;
        this.start = str2;
        this.end = str3;
        this.text_color = str4;
        this.click_action = str5;
        this.text_size = str6;
        this.font_name = str7;
        this.background = uiKitBackgroundObj;
        this.padding = uiKitPadding;
        this.margin = uiKitMargin;
        this.bold = bool;
    }

    public /* synthetic */ UiKitSpanObj(String str, String str2, String str3, String str4, String str5, String str6, String str7, UiKitBackgroundObj uiKitBackgroundObj, UiKitPadding uiKitPadding, UiKitMargin uiKitMargin, Boolean bool, int i10, u uVar) {
        this(str, str2, str3, str4, str5, str6, str7, uiKitBackgroundObj, uiKitPadding, uiKitMargin, (i10 & 1024) != 0 ? Boolean.FALSE : bool);
    }

    public static /* synthetic */ UiKitSpanObj copy$default(UiKitSpanObj uiKitSpanObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, UiKitBackgroundObj uiKitBackgroundObj, UiKitPadding uiKitPadding, UiKitMargin uiKitMargin, Boolean bool, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitSpanObj, str, str2, str3, str4, str5, str6, str7, uiKitBackgroundObj, uiKitPadding, uiKitMargin, bool, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33465bl, new Class[]{UiKitSpanObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, UiKitBackgroundObj.class, UiKitPadding.class, UiKitMargin.class, Boolean.class, Integer.TYPE, Object.class}, UiKitSpanObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitSpanObj) patchProxyResultProxy.result;
        }
        return uiKitSpanObj.copy((i10 & 1) != 0 ? uiKitSpanObj.type : str, (i10 & 2) != 0 ? uiKitSpanObj.start : str2, (i10 & 4) != 0 ? uiKitSpanObj.end : str3, (i10 & 8) != 0 ? uiKitSpanObj.text_color : str4, (i10 & 16) != 0 ? uiKitSpanObj.click_action : str5, (i10 & 32) != 0 ? uiKitSpanObj.text_size : str6, (i10 & 64) != 0 ? uiKitSpanObj.font_name : str7, (i10 & 128) != 0 ? uiKitSpanObj.background : uiKitBackgroundObj, (i10 & 256) != 0 ? uiKitSpanObj.padding : uiKitPadding, (i10 & 512) != 0 ? uiKitSpanObj.margin : uiKitMargin, (i10 & 1024) != 0 ? uiKitSpanObj.bold : bool);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final UiKitMargin component10() {
        return this.margin;
    }

    @e
    public final Boolean component11() {
        return this.bold;
    }

    @e
    public final String component2() {
        return this.start;
    }

    @e
    public final String component3() {
        return this.end;
    }

    @e
    public final String component4() {
        return this.text_color;
    }

    @e
    public final String component5() {
        return this.click_action;
    }

    @e
    public final String component6() {
        return this.text_size;
    }

    @e
    public final String component7() {
        return this.font_name;
    }

    @e
    public final UiKitBackgroundObj component8() {
        return this.background;
    }

    @e
    public final UiKitPadding component9() {
        return this.padding;
    }

    @d
    public final UiKitSpanObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e UiKitBackgroundObj uiKitBackgroundObj, @e UiKitPadding uiKitPadding, @e UiKitMargin uiKitMargin, @e Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, uiKitBackgroundObj, uiKitPadding, uiKitMargin, bool}, this, changeQuickRedirect, false, c.k.f33442al, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, UiKitBackgroundObj.class, UiKitPadding.class, UiKitMargin.class, Boolean.class}, UiKitSpanObj.class);
        return patchProxyResultProxy.isSupported ? (UiKitSpanObj) patchProxyResultProxy.result : new UiKitSpanObj(str, str2, str3, str4, str5, str6, str7, uiKitBackgroundObj, uiKitPadding, uiKitMargin, bool);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33535el, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiKitSpanObj)) {
            return false;
        }
        UiKitSpanObj uiKitSpanObj = (UiKitSpanObj) obj;
        return f0.g(this.type, uiKitSpanObj.type) && f0.g(this.start, uiKitSpanObj.start) && f0.g(this.end, uiKitSpanObj.end) && f0.g(this.text_color, uiKitSpanObj.text_color) && f0.g(this.click_action, uiKitSpanObj.click_action) && f0.g(this.text_size, uiKitSpanObj.text_size) && f0.g(this.font_name, uiKitSpanObj.font_name) && f0.g(this.background, uiKitSpanObj.background) && f0.g(this.padding, uiKitSpanObj.padding) && f0.g(this.margin, uiKitSpanObj.margin) && f0.g(this.bold, uiKitSpanObj.bold);
    }

    @e
    public final UiKitBackgroundObj getBackground() {
        return this.background;
    }

    @e
    public final Boolean getBold() {
        return this.bold;
    }

    @e
    public final String getClick_action() {
        return this.click_action;
    }

    @e
    public final String getEnd() {
        return this.end;
    }

    @e
    public final String getFont_name() {
        return this.font_name;
    }

    @e
    public final UiKitMargin getMargin() {
        return this.margin;
    }

    @e
    public final UiKitPadding getPadding() {
        return this.padding;
    }

    @e
    public final String getStart() {
        return this.start;
    }

    @e
    public final String getText_color() {
        return this.text_color;
    }

    @e
    public final String getText_size() {
        return this.text_size;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33512dl, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.start;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.end;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text_color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.click_action;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.text_size;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.font_name;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        UiKitBackgroundObj uiKitBackgroundObj = this.background;
        int iHashCode8 = (iHashCode7 + (uiKitBackgroundObj == null ? 0 : uiKitBackgroundObj.hashCode())) * 31;
        UiKitPadding uiKitPadding = this.padding;
        int iHashCode9 = (iHashCode8 + (uiKitPadding == null ? 0 : uiKitPadding.hashCode())) * 31;
        UiKitMargin uiKitMargin = this.margin;
        int iHashCode10 = (iHashCode9 + (uiKitMargin == null ? 0 : uiKitMargin.hashCode())) * 31;
        Boolean bool = this.bold;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setBackground(@e UiKitBackgroundObj uiKitBackgroundObj) {
        this.background = uiKitBackgroundObj;
    }

    public final void setBold(@e Boolean bool) {
        this.bold = bool;
    }

    public final void setClick_action(@e String str) {
        this.click_action = str;
    }

    public final void setEnd(@e String str) {
        this.end = str;
    }

    public final void setFont_name(@e String str) {
        this.font_name = str;
    }

    public final void setMargin(@e UiKitMargin uiKitMargin) {
        this.margin = uiKitMargin;
    }

    public final void setPadding(@e UiKitPadding uiKitPadding) {
        this.padding = uiKitPadding;
    }

    public final void setStart(@e String str) {
        this.start = str;
    }

    public final void setText_color(@e String str) {
        this.text_color = str;
    }

    public final void setText_size(@e String str) {
        this.text_size = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33488cl, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UiKitSpanObj(type=" + this.type + ", start=" + this.start + ", end=" + this.end + ", text_color=" + this.text_color + ", click_action=" + this.click_action + ", text_size=" + this.text_size + ", font_name=" + this.font_name + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", bold=" + this.bold + ')';
    }
}
