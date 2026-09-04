package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StickerGroupInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StickerGroupInfo implements Serializable {

    @d
    public static final Companion Companion = new Companion(null);

    @d
    public static final String STICKER_TYPE_BUTTON_ADD = "button add";

    @d
    public static final String STICKER_TYPE_LOCAL = "local";

    @d
    public static final String STICKER_TYPE_MIX = "mix";

    @d
    public static final String STICKER_TYPE_REMOTE = "remote";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String group_id;

    @e
    private List<StickerInfo> imgs;

    @e
    private String index;

    @e
    private String name;

    @e
    private List<StickerGroupInfo> sub_groups;

    @e
    private String type;

    /* JADX INFO: compiled from: StickerGroupInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public StickerGroupInfo(@e String str, @e String str2, @e String str3, @e List<StickerInfo> list, @e String str4, @e List<StickerGroupInfo> list2) {
        this.name = str;
        this.group_id = str2;
        this.type = str3;
        this.imgs = list;
        this.index = str4;
        this.sub_groups = list2;
    }

    public /* synthetic */ StickerGroupInfo(String str, String str2, String str3, List list, String str4, List list2, int i10, u uVar) {
        this(str, str2, (i10 & 4) != 0 ? "local" : str3, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : list2);
    }

    public static /* synthetic */ StickerGroupInfo copy$default(StickerGroupInfo stickerGroupInfo, String str, String str2, String str3, List list, String str4, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{stickerGroupInfo, str, str2, str3, list, str4, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 50095, new Class[]{StickerGroupInfo.class, String.class, String.class, String.class, List.class, String.class, List.class, Integer.TYPE, Object.class}, StickerGroupInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerGroupInfo) patchProxyResultProxy.result;
        }
        return stickerGroupInfo.copy((i10 & 1) != 0 ? stickerGroupInfo.name : str, (i10 & 2) != 0 ? stickerGroupInfo.group_id : str2, (i10 & 4) != 0 ? stickerGroupInfo.type : str3, (i10 & 8) != 0 ? stickerGroupInfo.imgs : list, (i10 & 16) != 0 ? stickerGroupInfo.index : str4, (i10 & 32) != 0 ? stickerGroupInfo.sub_groups : list2);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.group_id;
    }

    @e
    public final String component3() {
        return this.type;
    }

    @e
    public final List<StickerInfo> component4() {
        return this.imgs;
    }

    @e
    public final String component5() {
        return this.index;
    }

    @e
    public final List<StickerGroupInfo> component6() {
        return this.sub_groups;
    }

    @d
    public final StickerGroupInfo copy(@e String str, @e String str2, @e String str3, @e List<StickerInfo> list, @e String str4, @e List<StickerGroupInfo> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list, str4, list2}, this, changeQuickRedirect, false, 50094, new Class[]{String.class, String.class, String.class, List.class, String.class, List.class}, StickerGroupInfo.class);
        return patchProxyResultProxy.isSupported ? (StickerGroupInfo) patchProxyResultProxy.result : new StickerGroupInfo(str, str2, str3, list, str4, list2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50098, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerGroupInfo)) {
            return false;
        }
        StickerGroupInfo stickerGroupInfo = (StickerGroupInfo) obj;
        return f0.g(this.name, stickerGroupInfo.name) && f0.g(this.group_id, stickerGroupInfo.group_id) && f0.g(this.type, stickerGroupInfo.type) && f0.g(this.imgs, stickerGroupInfo.imgs) && f0.g(this.index, stickerGroupInfo.index) && f0.g(this.sub_groups, stickerGroupInfo.sub_groups);
    }

    @e
    public final String getGroup_id() {
        return this.group_id;
    }

    @e
    public final List<StickerInfo> getImgs() {
        return this.imgs;
    }

    @e
    public final String getIndex() {
        return this.index;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final List<StickerGroupInfo> getSub_groups() {
        return this.sub_groups;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50097, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.group_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<StickerInfo> list = this.imgs;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.index;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<StickerGroupInfo> list2 = this.sub_groups;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setGroup_id(@e String str) {
        this.group_id = str;
    }

    public final void setImgs(@e List<StickerInfo> list) {
        this.imgs = list;
    }

    public final void setIndex(@e String str) {
        this.index = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setSub_groups(@e List<StickerGroupInfo> list) {
        this.sub_groups = list;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50096, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StickerGroupInfo(name=" + this.name + ", group_id=" + this.group_id + ", type=" + this.type + ", imgs=" + this.imgs + ", index=" + this.index + ", sub_groups=" + this.sub_groups + ')';
    }
}
