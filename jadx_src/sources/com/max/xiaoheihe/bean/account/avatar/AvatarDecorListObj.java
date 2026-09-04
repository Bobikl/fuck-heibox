package com.max.xiaoheihe.bean.account.avatar;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AvatarDecorListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AvatarDecorListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("deadline_interval")
    @e
    private Long deadlineInterval;

    @SerializedName("deadline_timestamp")
    @e
    private Long deadlineTimestamp;

    @SerializedName("items")
    @e
    private List<? extends AvatarDecorationObj> items;

    @SerializedName("push_type")
    @e
    private String pushType;

    @e
    private Boolean subscribed;

    @e
    private String title;

    @e
    private String type;

    public AvatarDecorListObj(@e List<? extends AvatarDecorationObj> list, @e String str, @e String str2, @e String str3, @e Long l10, @e Long l11, @e Boolean bool) {
        this.items = list;
        this.title = str;
        this.pushType = str2;
        this.type = str3;
        this.deadlineInterval = l10;
        this.deadlineTimestamp = l11;
        this.subscribed = bool;
    }

    public static /* synthetic */ AvatarDecorListObj copy$default(AvatarDecorListObj avatarDecorListObj, List list, String str, String str2, String str3, Long l10, Long l11, Boolean bool, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{avatarDecorListObj, list, str, str2, str3, l10, l11, bool, new Integer(i10), obj}, null, changeQuickRedirect, true, 14041, new Class[]{AvatarDecorListObj.class, List.class, String.class, String.class, String.class, Long.class, Long.class, Boolean.class, Integer.TYPE, Object.class}, AvatarDecorListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AvatarDecorListObj) patchProxyResultProxy.result;
        }
        return avatarDecorListObj.copy((i10 & 1) != 0 ? avatarDecorListObj.items : list, (i10 & 2) != 0 ? avatarDecorListObj.title : str, (i10 & 4) != 0 ? avatarDecorListObj.pushType : str2, (i10 & 8) != 0 ? avatarDecorListObj.type : str3, (i10 & 16) != 0 ? avatarDecorListObj.deadlineInterval : l10, (i10 & 32) != 0 ? avatarDecorListObj.deadlineTimestamp : l11, (i10 & 64) != 0 ? avatarDecorListObj.subscribed : bool);
    }

    @e
    public final List<AvatarDecorationObj> component1() {
        return this.items;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final String component3() {
        return this.pushType;
    }

    @e
    public final String component4() {
        return this.type;
    }

    @e
    public final Long component5() {
        return this.deadlineInterval;
    }

    @e
    public final Long component6() {
        return this.deadlineTimestamp;
    }

    @e
    public final Boolean component7() {
        return this.subscribed;
    }

    @d
    public final AvatarDecorListObj copy(@e List<? extends AvatarDecorationObj> list, @e String str, @e String str2, @e String str3, @e Long l10, @e Long l11, @e Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, str2, str3, l10, l11, bool}, this, changeQuickRedirect, false, 14040, new Class[]{List.class, String.class, String.class, String.class, Long.class, Long.class, Boolean.class}, AvatarDecorListObj.class);
        return patchProxyResultProxy.isSupported ? (AvatarDecorListObj) patchProxyResultProxy.result : new AvatarDecorListObj(list, str, str2, str3, l10, l11, bool);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14044, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarDecorListObj)) {
            return false;
        }
        AvatarDecorListObj avatarDecorListObj = (AvatarDecorListObj) obj;
        return f0.g(this.items, avatarDecorListObj.items) && f0.g(this.title, avatarDecorListObj.title) && f0.g(this.pushType, avatarDecorListObj.pushType) && f0.g(this.type, avatarDecorListObj.type) && f0.g(this.deadlineInterval, avatarDecorListObj.deadlineInterval) && f0.g(this.deadlineTimestamp, avatarDecorListObj.deadlineTimestamp) && f0.g(this.subscribed, avatarDecorListObj.subscribed);
    }

    @e
    public final Long getDeadlineInterval() {
        return this.deadlineInterval;
    }

    @e
    public final Long getDeadlineTimestamp() {
        return this.deadlineTimestamp;
    }

    @e
    public final List<AvatarDecorationObj> getItems() {
        return this.items;
    }

    @e
    public final String getPushType() {
        return this.pushType;
    }

    @e
    public final Boolean getSubscribed() {
        return this.subscribed;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14043, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<? extends AvatarDecorationObj> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pushType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.deadlineInterval;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.deadlineTimestamp;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.subscribed;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setDeadlineInterval(@e Long l10) {
        this.deadlineInterval = l10;
    }

    public final void setDeadlineTimestamp(@e Long l10) {
        this.deadlineTimestamp = l10;
    }

    public final void setItems(@e List<? extends AvatarDecorationObj> list) {
        this.items = list;
    }

    public final void setPushType(@e String str) {
        this.pushType = str;
    }

    public final void setSubscribed(@e Boolean bool) {
        this.subscribed = bool;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14042, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AvatarDecorListObj(items=" + this.items + ", title=" + this.title + ", pushType=" + this.pushType + ", type=" + this.type + ", deadlineInterval=" + this.deadlineInterval + ", deadlineTimestamp=" + this.deadlineTimestamp + ", subscribed=" + this.subscribed + ')';
    }
}
