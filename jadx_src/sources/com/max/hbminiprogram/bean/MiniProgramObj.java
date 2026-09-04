package com.max.hbminiprogram.bean;

import androidx.compose.foundation.b0;
import bb.c;
import com.max.hbcommon.bean.GradientColorObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MiniProgramObj.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MiniProgramObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_img;

    @e
    private String category_id;

    @e
    private String custom_index;

    @e
    private String desc;

    @e
    private GradientColorObj gradient_color;
    private boolean have_new;

    @e
    private String icon_img;

    @e
    private Boolean is_more;

    @e
    private Integer mini_app_id;

    @e
    private List<String> more_image;

    @e
    private List<MiniProgramObj> more_mini_app;

    @e
    private List<MiniProgramGroupObj> more_mini_app_v2;

    @e
    private String name;

    @e
    private String proto;

    @e
    private String report_id;
    private boolean show_animator;

    public MiniProgramObj(@e String str, @e GradientColorObj gradientColorObj, @e String str2, @e Integer num, @e String str3, @e String str4, boolean z10, @e String str5, boolean z11, @e List<MiniProgramObj> list, @e List<MiniProgramGroupObj> list2, @e List<String> list3, @e Boolean bool, @e String str6, @e String str7, @e String str8) {
        this.bg_img = str;
        this.gradient_color = gradientColorObj;
        this.icon_img = str2;
        this.mini_app_id = num;
        this.name = str3;
        this.proto = str4;
        this.have_new = z10;
        this.desc = str5;
        this.show_animator = z11;
        this.more_mini_app = list;
        this.more_mini_app_v2 = list2;
        this.more_image = list3;
        this.is_more = bool;
        this.category_id = str6;
        this.report_id = str7;
        this.custom_index = str8;
    }

    public /* synthetic */ MiniProgramObj(String str, GradientColorObj gradientColorObj, String str2, Integer num, String str3, String str4, boolean z10, String str5, boolean z11, List list, List list2, List list3, Boolean bool, String str6, String str7, String str8, int i10, u uVar) {
        this(str, gradientColorObj, str2, num, str3, str4, (i10 & 64) != 0 ? false : z10, str5, z11, list, list2, list3, bool, str6, str7, str8);
    }

    public static /* synthetic */ MiniProgramObj copy$default(MiniProgramObj miniProgramObj, String str, GradientColorObj gradientColorObj, String str2, Integer num, String str3, String str4, boolean z10, String str5, boolean z11, List list, List list2, List list3, Boolean bool, String str6, String str7, String str8, int i10, Object obj) {
        boolean z12 = z10;
        Object[] objArr = {miniProgramObj, str, gradientColorObj, str2, num, str3, str4, new Byte(z12 ? (byte) 1 : (byte) 0), str5, new Byte(z11 ? (byte) 1 : (byte) 0), list, list2, list3, bool, str6, str7, str8, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.h.C, new Class[]{MiniProgramObj.class, String.class, GradientColorObj.class, String.class, Integer.class, String.class, String.class, cls, String.class, cls, List.class, List.class, List.class, Boolean.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MiniProgramObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MiniProgramObj) patchProxyResultProxy.result;
        }
        String str9 = (i10 & 1) != 0 ? miniProgramObj.bg_img : str;
        GradientColorObj gradientColorObj2 = (i10 & 2) != 0 ? miniProgramObj.gradient_color : gradientColorObj;
        String str10 = (i10 & 4) != 0 ? miniProgramObj.icon_img : str2;
        Integer num2 = (i10 & 8) != 0 ? miniProgramObj.mini_app_id : num;
        String str11 = (i10 & 16) != 0 ? miniProgramObj.name : str3;
        String str12 = (i10 & 32) != 0 ? miniProgramObj.proto : str4;
        if ((i10 & 64) != 0) {
            z12 = miniProgramObj.have_new;
        }
        return miniProgramObj.copy(str9, gradientColorObj2, str10, num2, str11, str12, z12, (i10 & 128) != 0 ? miniProgramObj.desc : str5, (i10 & 256) != 0 ? miniProgramObj.show_animator : z11 ? 1 : 0, (i10 & 512) != 0 ? miniProgramObj.more_mini_app : list, (i10 & 1024) != 0 ? miniProgramObj.more_mini_app_v2 : list2, (i10 & 2048) != 0 ? miniProgramObj.more_image : list3, (i10 & 4096) != 0 ? miniProgramObj.is_more : bool, (i10 & 8192) != 0 ? miniProgramObj.category_id : str6, (i10 & 16384) != 0 ? miniProgramObj.report_id : str7, (i10 & 32768) != 0 ? miniProgramObj.custom_index : str8);
    }

    @e
    public final String component1() {
        return this.bg_img;
    }

    @e
    public final List<MiniProgramObj> component10() {
        return this.more_mini_app;
    }

    @e
    public final List<MiniProgramGroupObj> component11() {
        return this.more_mini_app_v2;
    }

    @e
    public final List<String> component12() {
        return this.more_image;
    }

    @e
    public final Boolean component13() {
        return this.is_more;
    }

    @e
    public final String component14() {
        return this.category_id;
    }

    @e
    public final String component15() {
        return this.report_id;
    }

    @e
    public final String component16() {
        return this.custom_index;
    }

    @e
    public final GradientColorObj component2() {
        return this.gradient_color;
    }

    @e
    public final String component3() {
        return this.icon_img;
    }

    @e
    public final Integer component4() {
        return this.mini_app_id;
    }

    @e
    public final String component5() {
        return this.name;
    }

    @e
    public final String component6() {
        return this.proto;
    }

    public final boolean component7() {
        return this.have_new;
    }

    @e
    public final String component8() {
        return this.desc;
    }

    public final boolean component9() {
        return this.show_animator;
    }

    @d
    public final MiniProgramObj copy(@e String str, @e GradientColorObj gradientColorObj, @e String str2, @e Integer num, @e String str3, @e String str4, boolean z10, @e String str5, boolean z11, @e List<MiniProgramObj> list, @e List<MiniProgramGroupObj> list2, @e List<String> list3, @e Boolean bool, @e String str6, @e String str7, @e String str8) {
        Object[] objArr = {str, gradientColorObj, str2, num, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0), str5, new Byte(z11 ? (byte) 1 : (byte) 0), list, list2, list3, bool, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.h.B, new Class[]{String.class, GradientColorObj.class, String.class, Integer.class, String.class, String.class, cls, String.class, cls, List.class, List.class, List.class, Boolean.class, String.class, String.class, String.class}, MiniProgramObj.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramObj) patchProxyResultProxy.result : new MiniProgramObj(str, gradientColorObj, str2, num, str3, str4, z10, str5, z11, list, list2, list3, bool, str6, str7, str8);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.h.F, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniProgramObj)) {
            return false;
        }
        MiniProgramObj miniProgramObj = (MiniProgramObj) obj;
        return f0.g(this.bg_img, miniProgramObj.bg_img) && f0.g(this.gradient_color, miniProgramObj.gradient_color) && f0.g(this.icon_img, miniProgramObj.icon_img) && f0.g(this.mini_app_id, miniProgramObj.mini_app_id) && f0.g(this.name, miniProgramObj.name) && f0.g(this.proto, miniProgramObj.proto) && this.have_new == miniProgramObj.have_new && f0.g(this.desc, miniProgramObj.desc) && this.show_animator == miniProgramObj.show_animator && f0.g(this.more_mini_app, miniProgramObj.more_mini_app) && f0.g(this.more_mini_app_v2, miniProgramObj.more_mini_app_v2) && f0.g(this.more_image, miniProgramObj.more_image) && f0.g(this.is_more, miniProgramObj.is_more) && f0.g(this.category_id, miniProgramObj.category_id) && f0.g(this.report_id, miniProgramObj.report_id) && f0.g(this.custom_index, miniProgramObj.custom_index);
    }

    @e
    public final String getBg_img() {
        return this.bg_img;
    }

    @e
    public final String getCategory_id() {
        return this.category_id;
    }

    @e
    public final String getCustom_index() {
        return this.custom_index;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final GradientColorObj getGradient_color() {
        return this.gradient_color;
    }

    public final boolean getHave_new() {
        return this.have_new;
    }

    @e
    public final String getIcon_img() {
        return this.icon_img;
    }

    @e
    public final Integer getMini_app_id() {
        return this.mini_app_id;
    }

    @e
    public final List<String> getMore_image() {
        return this.more_image;
    }

    @e
    public final List<MiniProgramObj> getMore_mini_app() {
        return this.more_mini_app;
    }

    @e
    public final List<MiniProgramGroupObj> getMore_mini_app_v2() {
        return this.more_mini_app_v2;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProto() {
        return this.proto;
    }

    @e
    public final String getReport_id() {
        return this.report_id;
    }

    public final boolean getShow_animator() {
        return this.show_animator;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.E, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.bg_img;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        GradientColorObj gradientColorObj = this.gradient_color;
        int iHashCode2 = (iHashCode + (gradientColorObj == null ? 0 : gradientColorObj.hashCode())) * 31;
        String str2 = this.icon_img;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.mini_app_id;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.proto;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + b0.a(this.have_new)) * 31;
        String str5 = this.desc;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + b0.a(this.show_animator)) * 31;
        List<MiniProgramObj> list = this.more_mini_app;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<MiniProgramGroupObj> list2 = this.more_mini_app_v2;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.more_image;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.is_more;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.category_id;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.report_id;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.custom_index;
        return iHashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    @e
    public final Boolean is_more() {
        return this.is_more;
    }

    public final void setBg_img(@e String str) {
        this.bg_img = str;
    }

    public final void setCategory_id(@e String str) {
        this.category_id = str;
    }

    public final void setCustom_index(@e String str) {
        this.custom_index = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setGradient_color(@e GradientColorObj gradientColorObj) {
        this.gradient_color = gradientColorObj;
    }

    public final void setHave_new(boolean z10) {
        this.have_new = z10;
    }

    public final void setIcon_img(@e String str) {
        this.icon_img = str;
    }

    public final void setMini_app_id(@e Integer num) {
        this.mini_app_id = num;
    }

    public final void setMore_image(@e List<String> list) {
        this.more_image = list;
    }

    public final void setMore_mini_app(@e List<MiniProgramObj> list) {
        this.more_mini_app = list;
    }

    public final void setMore_mini_app_v2(@e List<MiniProgramGroupObj> list) {
        this.more_mini_app_v2 = list;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setProto(@e String str) {
        this.proto = str;
    }

    public final void setReport_id(@e String str) {
        this.report_id = str;
    }

    public final void setShow_animator(boolean z10) {
        this.show_animator = z10;
    }

    public final void set_more(@e Boolean bool) {
        this.is_more = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.h.D, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MiniProgramObj(bg_img=" + this.bg_img + ", gradient_color=" + this.gradient_color + ", icon_img=" + this.icon_img + ", mini_app_id=" + this.mini_app_id + ", name=" + this.name + ", proto=" + this.proto + ", have_new=" + this.have_new + ", desc=" + this.desc + ", show_animator=" + this.show_animator + ", more_mini_app=" + this.more_mini_app + ", more_mini_app_v2=" + this.more_mini_app_v2 + ", more_image=" + this.more_image + ", is_more=" + this.is_more + ", category_id=" + this.category_id + ", report_id=" + this.report_id + ", custom_index=" + this.custom_index + ')';
    }
}
