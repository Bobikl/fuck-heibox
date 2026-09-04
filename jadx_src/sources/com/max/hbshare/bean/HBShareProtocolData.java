package com.max.hbshare.bean;

import android.os.Bundle;
import bb.c;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;
import xh.m;

/* JADX INFO: compiled from: HBShareProtocolData.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HBShareProtocolData implements Serializable {

    @d
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String act_id;

    @e
    private String desc;

    @e
    private Bundle extraOpts;

    @e
    private List<? extends PostOptionObj> extraShareActionList;

    @e
    private String img_url;

    @e
    private String mini_program_share;

    @e
    private JsonObject report_extra;

    @e
    private String share_platform;

    @e
    private String share_url;

    @e
    private String src;

    @e
    private String title;

    /* JADX INFO: compiled from: HBShareProtocolData.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @e
        @m
        public final HBShareProtocolData getFromKeyDescObj(@e KeyDescObj keyDescObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, c.k.Pa, new Class[]{KeyDescObj.class}, HBShareProtocolData.class);
            if (patchProxyResultProxy.isSupported) {
                return (HBShareProtocolData) patchProxyResultProxy.result;
            }
            if (keyDescObj == null) {
                return null;
            }
            return new HBShareProtocolData(keyDescObj.getTitle(), keyDescObj.getDesc(), keyDescObj.getUrl(), null, null, null, null, null, null, null, null, c.d.f31357l, null);
        }
    }

    @i
    public HBShareProtocolData() {
        this(null, null, null, null, null, null, null, null, null, null, null, c.d.f31516s, null);
    }

    @i
    public HBShareProtocolData(@e String str) {
        this(str, null, null, null, null, null, null, null, null, null, null, c.d.f31494r, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2) {
        this(str, str2, null, null, null, null, null, null, null, null, null, c.d.f31449p, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3) {
        this(str, str2, str3, null, null, null, null, null, null, null, null, c.d.f31357l, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3, @e String str4) {
        this(str, str2, str3, str4, null, null, null, null, null, null, null, c.d.f31173d, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this(str, str2, str3, str4, str5, null, null, null, null, null, null, 2016, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this(str, str2, str3, str4, str5, str6, null, null, null, null, null, c.b.kz, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null, null, null, null, 1920, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, null, null, null, c.b.zv, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e JsonObject jsonObject) {
        this(str, str2, str3, str4, str5, str6, str7, str8, jsonObject, null, null, c.b.Cq, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e JsonObject jsonObject, @e List<? extends PostOptionObj> list) {
        this(str, str2, str3, str4, str5, str6, str7, str8, jsonObject, list, null, 1024, null);
    }

    @i
    public HBShareProtocolData(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e JsonObject jsonObject, @e List<? extends PostOptionObj> list, @e Bundle bundle) {
        this.title = str;
        this.desc = str2;
        this.share_url = str3;
        this.img_url = str4;
        this.mini_program_share = str5;
        this.act_id = str6;
        this.src = str7;
        this.share_platform = str8;
        this.report_extra = jsonObject;
        this.extraShareActionList = list;
        this.extraOpts = bundle;
    }

    public /* synthetic */ HBShareProtocolData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, JsonObject jsonObject, List list, Bundle bundle, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) == 0 ? str4 : "", (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : jsonObject, (i10 & 512) != 0 ? null : list, (i10 & 1024) == 0 ? bundle : null);
    }

    public static /* synthetic */ HBShareProtocolData copy$default(HBShareProtocolData hBShareProtocolData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, JsonObject jsonObject, List list, Bundle bundle, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBShareProtocolData, str, str2, str3, str4, str5, str6, str7, str8, jsonObject, list, bundle, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.Ka, new Class[]{HBShareProtocolData.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class, List.class, Bundle.class, Integer.TYPE, Object.class}, HBShareProtocolData.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBShareProtocolData) patchProxyResultProxy.result;
        }
        return hBShareProtocolData.copy((i10 & 1) != 0 ? hBShareProtocolData.title : str, (i10 & 2) != 0 ? hBShareProtocolData.desc : str2, (i10 & 4) != 0 ? hBShareProtocolData.share_url : str3, (i10 & 8) != 0 ? hBShareProtocolData.img_url : str4, (i10 & 16) != 0 ? hBShareProtocolData.mini_program_share : str5, (i10 & 32) != 0 ? hBShareProtocolData.act_id : str6, (i10 & 64) != 0 ? hBShareProtocolData.src : str7, (i10 & 128) != 0 ? hBShareProtocolData.share_platform : str8, (i10 & 256) != 0 ? hBShareProtocolData.report_extra : jsonObject, (i10 & 512) != 0 ? hBShareProtocolData.extraShareActionList : list, (i10 & 1024) != 0 ? hBShareProtocolData.extraOpts : bundle);
    }

    @e
    @m
    public static final HBShareProtocolData getFromKeyDescObj(@e KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj}, null, changeQuickRedirect, true, c.k.Oa, new Class[]{KeyDescObj.class}, HBShareProtocolData.class);
        return patchProxyResultProxy.isSupported ? (HBShareProtocolData) patchProxyResultProxy.result : Companion.getFromKeyDescObj(keyDescObj);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final List<PostOptionObj> component10() {
        return this.extraShareActionList;
    }

    @e
    public final Bundle component11() {
        return this.extraOpts;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.share_url;
    }

    @e
    public final String component4() {
        return this.img_url;
    }

    @e
    public final String component5() {
        return this.mini_program_share;
    }

    @e
    public final String component6() {
        return this.act_id;
    }

    @e
    public final String component7() {
        return this.src;
    }

    @e
    public final String component8() {
        return this.share_platform;
    }

    @e
    public final JsonObject component9() {
        return this.report_extra;
    }

    @d
    public final HBShareProtocolData copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e JsonObject jsonObject, @e List<? extends PostOptionObj> list, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, jsonObject, list, bundle}, this, changeQuickRedirect, false, c.k.Ja, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class, List.class, Bundle.class}, HBShareProtocolData.class);
        return patchProxyResultProxy.isSupported ? (HBShareProtocolData) patchProxyResultProxy.result : new HBShareProtocolData(str, str2, str3, str4, str5, str6, str7, str8, jsonObject, list, bundle);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Na, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HBShareProtocolData)) {
            return false;
        }
        HBShareProtocolData hBShareProtocolData = (HBShareProtocolData) obj;
        return f0.g(this.title, hBShareProtocolData.title) && f0.g(this.desc, hBShareProtocolData.desc) && f0.g(this.share_url, hBShareProtocolData.share_url) && f0.g(this.img_url, hBShareProtocolData.img_url) && f0.g(this.mini_program_share, hBShareProtocolData.mini_program_share) && f0.g(this.act_id, hBShareProtocolData.act_id) && f0.g(this.src, hBShareProtocolData.src) && f0.g(this.share_platform, hBShareProtocolData.share_platform) && f0.g(this.report_extra, hBShareProtocolData.report_extra) && f0.g(this.extraShareActionList, hBShareProtocolData.extraShareActionList) && f0.g(this.extraOpts, hBShareProtocolData.extraOpts);
    }

    @e
    public final String getAct_id() {
        return this.act_id;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final Bundle getExtraOpts() {
        return this.extraOpts;
    }

    @e
    public final List<PostOptionObj> getExtraShareActionList() {
        return this.extraShareActionList;
    }

    @e
    public final String getImg_url() {
        return this.img_url;
    }

    @e
    public final String getMini_program_share() {
        return this.mini_program_share;
    }

    @e
    public final JsonObject getReport_extra() {
        return this.report_extra;
    }

    @e
    public final String getShare_platform() {
        return this.share_platform;
    }

    @e
    public final String getShare_url() {
        return this.share_url;
    }

    @e
    public final String getSrc() {
        return this.src;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ma, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.share_url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.img_url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mini_program_share;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.act_id;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.src;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.share_platform;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        JsonObject jsonObject = this.report_extra;
        int iHashCode9 = (iHashCode8 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        List<? extends PostOptionObj> list = this.extraShareActionList;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Bundle bundle = this.extraOpts;
        return iHashCode10 + (bundle != null ? bundle.hashCode() : 0);
    }

    public final void setAct_id(@e String str) {
        this.act_id = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setExtraOpts(@e Bundle bundle) {
        this.extraOpts = bundle;
    }

    public final void setExtraShareActionList(@e List<? extends PostOptionObj> list) {
        this.extraShareActionList = list;
    }

    public final void setImg_url(@e String str) {
        this.img_url = str;
    }

    public final void setMini_program_share(@e String str) {
        this.mini_program_share = str;
    }

    public final void setReport_extra(@e JsonObject jsonObject) {
        this.report_extra = jsonObject;
    }

    public final void setShare_platform(@e String str) {
        this.share_platform = str;
    }

    public final void setShare_url(@e String str) {
        this.share_url = str;
    }

    public final void setSrc(@e String str) {
        this.src = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public final HBShareData toHBShareData() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ia, new Class[0], HBShareData.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBShareData) patchProxyResultProxy.result;
        }
        HBShareData hBShareData = new HBShareData(false, true, this.title, this.desc, this.share_url, null, null, null, null, null, null, null, null, c.k.f33904v4, null);
        hBShareData.setReport_extra(this.report_extra);
        hBShareData.setExtraShareActionList(this.extraShareActionList);
        hBShareData.setExtraOpts(this.extraOpts);
        return hBShareData;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.La, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HBShareProtocolData(title=" + this.title + ", desc=" + this.desc + ", share_url=" + this.share_url + ", img_url=" + this.img_url + ", mini_program_share=" + this.mini_program_share + ", act_id=" + this.act_id + ", src=" + this.src + ", share_platform=" + this.share_platform + ", report_extra=" + this.report_extra + ", extraShareActionList=" + this.extraShareActionList + ", extraOpts=" + this.extraOpts + ')';
    }
}
