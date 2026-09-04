package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AttrObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AttrObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background_color;

    @e
    private String color;

    @e
    private String corner_radius;

    @e
    private String font_name;

    @e
    private String font_size;

    @e
    private String height;

    @e
    private String image;

    @e
    private String image_color;

    @e
    private String image_new;

    @e
    private String line_height;

    @e
    private String offset;

    @e
    private String strike_style;

    @e
    private String text;

    @e
    private String type;

    @e
    private String underline_color;

    @e
    private String width;

    public AttrObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e String str13, @e String str14, @e String str15, @e String str16) {
        this.type = str;
        this.text = str2;
        this.color = str3;
        this.font_name = str4;
        this.font_size = str5;
        this.background_color = str6;
        this.offset = str7;
        this.line_height = str8;
        this.underline_color = str9;
        this.image = str10;
        this.image_new = str11;
        this.image_color = str12;
        this.width = str13;
        this.height = str14;
        this.strike_style = str15;
        this.corner_radius = str16;
    }

    public static /* synthetic */ AttrObj copy$default(AttrObj attrObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{attrObj, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.AL, new Class[]{AttrObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, AttrObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AttrObj) patchProxyResultProxy.result;
        }
        return attrObj.copy((i10 & 1) != 0 ? attrObj.type : str, (i10 & 2) != 0 ? attrObj.text : str2, (i10 & 4) != 0 ? attrObj.color : str3, (i10 & 8) != 0 ? attrObj.font_name : str4, (i10 & 16) != 0 ? attrObj.font_size : str5, (i10 & 32) != 0 ? attrObj.background_color : str6, (i10 & 64) != 0 ? attrObj.offset : str7, (i10 & 128) != 0 ? attrObj.line_height : str8, (i10 & 256) != 0 ? attrObj.underline_color : str9, (i10 & 512) != 0 ? attrObj.image : str10, (i10 & 1024) != 0 ? attrObj.image_new : str11, (i10 & 2048) != 0 ? attrObj.image_color : str12, (i10 & 4096) != 0 ? attrObj.width : str13, (i10 & 8192) != 0 ? attrObj.height : str14, (i10 & 16384) != 0 ? attrObj.strike_style : str15, (i10 & 32768) != 0 ? attrObj.corner_radius : str16);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final String component10() {
        return this.image;
    }

    @e
    public final String component11() {
        return this.image_new;
    }

    @e
    public final String component12() {
        return this.image_color;
    }

    @e
    public final String component13() {
        return this.width;
    }

    @e
    public final String component14() {
        return this.height;
    }

    @e
    public final String component15() {
        return this.strike_style;
    }

    @e
    public final String component16() {
        return this.corner_radius;
    }

    @e
    public final String component2() {
        return this.text;
    }

    @e
    public final String component3() {
        return this.color;
    }

    @e
    public final String component4() {
        return this.font_name;
    }

    @e
    public final String component5() {
        return this.font_size;
    }

    @e
    public final String component6() {
        return this.background_color;
    }

    @e
    public final String component7() {
        return this.offset;
    }

    @e
    public final String component8() {
        return this.line_height;
    }

    @e
    public final String component9() {
        return this.underline_color;
    }

    @d
    public final AttrObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, @e String str13, @e String str14, @e String str15, @e String str16) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16}, this, changeQuickRedirect, false, c.m.zL, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, AttrObj.class);
        return patchProxyResultProxy.isSupported ? (AttrObj) patchProxyResultProxy.result : new AttrObj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.DL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttrObj)) {
            return false;
        }
        AttrObj attrObj = (AttrObj) obj;
        return f0.g(this.type, attrObj.type) && f0.g(this.text, attrObj.text) && f0.g(this.color, attrObj.color) && f0.g(this.font_name, attrObj.font_name) && f0.g(this.font_size, attrObj.font_size) && f0.g(this.background_color, attrObj.background_color) && f0.g(this.offset, attrObj.offset) && f0.g(this.line_height, attrObj.line_height) && f0.g(this.underline_color, attrObj.underline_color) && f0.g(this.image, attrObj.image) && f0.g(this.image_new, attrObj.image_new) && f0.g(this.image_color, attrObj.image_color) && f0.g(this.width, attrObj.width) && f0.g(this.height, attrObj.height) && f0.g(this.strike_style, attrObj.strike_style) && f0.g(this.corner_radius, attrObj.corner_radius);
    }

    @e
    public final String getBackground_color() {
        return this.background_color;
    }

    @e
    public final String getColor() {
        return this.color;
    }

    @e
    public final String getCorner_radius() {
        return this.corner_radius;
    }

    @e
    public final String getFont_name() {
        return this.font_name;
    }

    @e
    public final String getFont_size() {
        return this.font_size;
    }

    @e
    public final String getHeight() {
        return this.height;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getImage_color() {
        return this.image_color;
    }

    @e
    public final String getImage_new() {
        return this.image_new;
    }

    @e
    public final String getLine_height() {
        return this.line_height;
    }

    @e
    public final String getOffset() {
        return this.offset;
    }

    @e
    public final String getStrike_style() {
        return this.strike_style;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final String getUnderline_color() {
        return this.underline_color;
    }

    @e
    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.CL, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.color;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.font_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.font_size;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.background_color;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offset;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.line_height;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.underline_color;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.image;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.image_new;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.image_color;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.width;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.height;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.strike_style;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.corner_radius;
        return iHashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    public final void setBackground_color(@e String str) {
        this.background_color = str;
    }

    public final void setColor(@e String str) {
        this.color = str;
    }

    public final void setCorner_radius(@e String str) {
        this.corner_radius = str;
    }

    public final void setFont_name(@e String str) {
        this.font_name = str;
    }

    public final void setFont_size(@e String str) {
        this.font_size = str;
    }

    public final void setHeight(@e String str) {
        this.height = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setImage_color(@e String str) {
        this.image_color = str;
    }

    public final void setImage_new(@e String str) {
        this.image_new = str;
    }

    public final void setLine_height(@e String str) {
        this.line_height = str;
    }

    public final void setOffset(@e String str) {
        this.offset = str;
    }

    public final void setStrike_style(@e String str) {
        this.strike_style = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setUnderline_color(@e String str) {
        this.underline_color = str;
    }

    public final void setWidth(@e String str) {
        this.width = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.BL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AttrObj(type=" + this.type + ", text=" + this.text + ", color=" + this.color + ", font_name=" + this.font_name + ", font_size=" + this.font_size + ", background_color=" + this.background_color + ", offset=" + this.offset + ", line_height=" + this.line_height + ", underline_color=" + this.underline_color + ", image=" + this.image + ", image_new=" + this.image_new + ", image_color=" + this.image_color + ", width=" + this.width + ", height=" + this.height + ", strike_style=" + this.strike_style + ", corner_radius=" + this.corner_radius + ')';
    }
}
