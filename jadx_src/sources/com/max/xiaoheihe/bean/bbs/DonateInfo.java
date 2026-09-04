package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DonateInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class DonateInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Boolean enable;

    @e
    private Boolean me_donated;

    @e
    private Integer total;

    @e
    private ArrayList<BBSUserInfoObj> users;

    public DonateInfo(@e ArrayList<BBSUserInfoObj> arrayList, @e Boolean bool, @e Boolean bool2, @e Integer num) {
        this.users = arrayList;
        this.enable = bool;
        this.me_donated = bool2;
        this.total = num;
    }

    public /* synthetic */ DonateInfo(ArrayList arrayList, Boolean bool, Boolean bool2, Integer num, int i10, u uVar) {
        this(arrayList, (i10 & 2) != 0 ? Boolean.FALSE : bool, (i10 & 4) != 0 ? Boolean.FALSE : bool2, (i10 & 8) != 0 ? 0 : num);
    }

    public static /* synthetic */ DonateInfo copy$default(DonateInfo donateInfo, ArrayList arrayList, Boolean bool, Boolean bool2, Integer num, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{donateInfo, arrayList, bool, bool2, num, new Integer(i10), obj}, null, changeQuickRedirect, true, 14270, new Class[]{DonateInfo.class, ArrayList.class, Boolean.class, Boolean.class, Integer.class, Integer.TYPE, Object.class}, DonateInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (DonateInfo) patchProxyResultProxy.result;
        }
        return donateInfo.copy((i10 & 1) != 0 ? donateInfo.users : arrayList, (i10 & 2) != 0 ? donateInfo.enable : bool, (i10 & 4) != 0 ? donateInfo.me_donated : bool2, (i10 & 8) != 0 ? donateInfo.total : num);
    }

    @e
    public final ArrayList<BBSUserInfoObj> component1() {
        return this.users;
    }

    @e
    public final Boolean component2() {
        return this.enable;
    }

    @e
    public final Boolean component3() {
        return this.me_donated;
    }

    @e
    public final Integer component4() {
        return this.total;
    }

    @d
    public final DonateInfo copy(@e ArrayList<BBSUserInfoObj> arrayList, @e Boolean bool, @e Boolean bool2, @e Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, bool, bool2, num}, this, changeQuickRedirect, false, 14269, new Class[]{ArrayList.class, Boolean.class, Boolean.class, Integer.class}, DonateInfo.class);
        return patchProxyResultProxy.isSupported ? (DonateInfo) patchProxyResultProxy.result : new DonateInfo(arrayList, bool, bool2, num);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14273, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonateInfo)) {
            return false;
        }
        DonateInfo donateInfo = (DonateInfo) obj;
        return f0.g(this.users, donateInfo.users) && f0.g(this.enable, donateInfo.enable) && f0.g(this.me_donated, donateInfo.me_donated) && f0.g(this.total, donateInfo.total);
    }

    @e
    public final Boolean getEnable() {
        return this.enable;
    }

    @e
    public final Boolean getMe_donated() {
        return this.me_donated;
    }

    @e
    public final Integer getTotal() {
        return this.total;
    }

    @e
    public final ArrayList<BBSUserInfoObj> getUsers() {
        return this.users;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14272, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<BBSUserInfoObj> arrayList = this.users;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        Boolean bool = this.enable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.me_donated;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.total;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final void setEnable(@e Boolean bool) {
        this.enable = bool;
    }

    public final void setMe_donated(@e Boolean bool) {
        this.me_donated = bool;
    }

    public final void setTotal(@e Integer num) {
        this.total = num;
    }

    public final void setUsers(@e ArrayList<BBSUserInfoObj> arrayList) {
        this.users = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14271, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DonateInfo(users=" + this.users + ", enable=" + this.enable + ", me_donated=" + this.me_donated + ", total=" + this.total + ')';
    }
}
