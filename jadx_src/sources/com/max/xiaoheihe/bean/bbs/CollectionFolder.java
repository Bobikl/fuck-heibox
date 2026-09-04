package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CollectionFolder.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CollectionFolder {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Integer count;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private String f76960id;

    @e
    private String is_default;

    @e
    private List<? extends FeedsContentBaseObj> links;

    @e
    private String name;
    private int spType;

    @e
    private String thumb;

    @e
    private Integer unread;

    public CollectionFolder(@e Integer num, @e String str, @e String str2, @e String str3, @e Integer num2, @e String str4, int i10, @e List<? extends FeedsContentBaseObj> list) {
        this.count = num;
        this.f76960id = str;
        this.is_default = str2;
        this.name = str3;
        this.unread = num2;
        this.thumb = str4;
        this.spType = i10;
        this.links = list;
    }

    public /* synthetic */ CollectionFolder(Integer num, String str, String str2, String str3, Integer num2, String str4, int i10, List list, int i11, u uVar) {
        this(num, str, str2, str3, num2, str4, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? null : list);
    }

    public static /* synthetic */ CollectionFolder copy$default(CollectionFolder collectionFolder, Integer num, String str, String str2, String str3, Integer num2, String str4, int i10, List list, int i11, Object obj) {
        Object[] objArr = {collectionFolder, num, str, str2, str3, num2, str4, new Integer(i10), list, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 14223, new Class[]{CollectionFolder.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class, cls, List.class, cls, Object.class}, CollectionFolder.class);
        if (patchProxyResultProxy.isSupported) {
            return (CollectionFolder) patchProxyResultProxy.result;
        }
        return collectionFolder.copy((i11 & 1) != 0 ? collectionFolder.count : num, (i11 & 2) != 0 ? collectionFolder.f76960id : str, (i11 & 4) != 0 ? collectionFolder.is_default : str2, (i11 & 8) != 0 ? collectionFolder.name : str3, (i11 & 16) != 0 ? collectionFolder.unread : num2, (i11 & 32) != 0 ? collectionFolder.thumb : str4, (i11 & 64) != 0 ? collectionFolder.spType : i10, (i11 & 128) != 0 ? collectionFolder.links : list);
    }

    @e
    public final Integer component1() {
        return this.count;
    }

    @e
    public final String component2() {
        return this.f76960id;
    }

    @e
    public final String component3() {
        return this.is_default;
    }

    @e
    public final String component4() {
        return this.name;
    }

    @e
    public final Integer component5() {
        return this.unread;
    }

    @e
    public final String component6() {
        return this.thumb;
    }

    public final int component7() {
        return this.spType;
    }

    @e
    public final List<FeedsContentBaseObj> component8() {
        return this.links;
    }

    @d
    public final CollectionFolder copy(@e Integer num, @e String str, @e String str2, @e String str3, @e Integer num2, @e String str4, int i10, @e List<? extends FeedsContentBaseObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, str, str2, str3, num2, str4, new Integer(i10), list}, this, changeQuickRedirect, false, 14222, new Class[]{Integer.class, String.class, String.class, String.class, Integer.class, String.class, Integer.TYPE, List.class}, CollectionFolder.class);
        return patchProxyResultProxy.isSupported ? (CollectionFolder) patchProxyResultProxy.result : new CollectionFolder(num, str, str2, str3, num2, str4, i10, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14226, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionFolder)) {
            return false;
        }
        CollectionFolder collectionFolder = (CollectionFolder) obj;
        return f0.g(this.count, collectionFolder.count) && f0.g(this.f76960id, collectionFolder.f76960id) && f0.g(this.is_default, collectionFolder.is_default) && f0.g(this.name, collectionFolder.name) && f0.g(this.unread, collectionFolder.unread) && f0.g(this.thumb, collectionFolder.thumb) && this.spType == collectionFolder.spType && f0.g(this.links, collectionFolder.links);
    }

    @e
    public final Integer getCount() {
        return this.count;
    }

    @e
    public final String getId() {
        return this.f76960id;
    }

    @e
    public final List<FeedsContentBaseObj> getLinks() {
        return this.links;
    }

    @e
    public final String getName() {
        return this.name;
    }

    public final int getSpType() {
        return this.spType;
    }

    @e
    public final String getThumb() {
        return this.thumb;
    }

    @e
    public final Integer getUnread() {
        return this.unread;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14225, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f76960id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.is_default;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.unread;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.thumb;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.spType) * 31;
        List<? extends FeedsContentBaseObj> list = this.links;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    @e
    public final String is_default() {
        return this.is_default;
    }

    public final void setCount(@e Integer num) {
        this.count = num;
    }

    public final void setId(@e String str) {
        this.f76960id = str;
    }

    public final void setLinks(@e List<? extends FeedsContentBaseObj> list) {
        this.links = list;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setSpType(int i10) {
        this.spType = i10;
    }

    public final void setThumb(@e String str) {
        this.thumb = str;
    }

    public final void setUnread(@e Integer num) {
        this.unread = num;
    }

    public final void set_default(@e String str) {
        this.is_default = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14224, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CollectionFolder(count=" + this.count + ", id=" + this.f76960id + ", is_default=" + this.is_default + ", name=" + this.name + ", unread=" + this.unread + ", thumb=" + this.thumb + ", spType=" + this.spType + ", links=" + this.links + ')';
    }
}
