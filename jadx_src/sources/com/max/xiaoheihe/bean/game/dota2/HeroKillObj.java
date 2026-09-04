package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HeroKillObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HeroKillObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<KeyDescObj> data_list;

    @e
    private String desc;

    public HeroKillObj(@e String str, @e List<KeyDescObj> list) {
        this.desc = str;
        this.data_list = list;
    }

    public static /* synthetic */ HeroKillObj copy$default(HeroKillObj heroKillObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heroKillObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15122, new Class[]{HeroKillObj.class, String.class, List.class, Integer.TYPE, Object.class}, HeroKillObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeroKillObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = heroKillObj.desc;
        }
        if ((i10 & 2) != 0) {
            list = heroKillObj.data_list;
        }
        return heroKillObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final List<KeyDescObj> component2() {
        return this.data_list;
    }

    @d
    public final HeroKillObj copy(@e String str, @e List<KeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 15121, new Class[]{String.class, List.class}, HeroKillObj.class);
        return patchProxyResultProxy.isSupported ? (HeroKillObj) patchProxyResultProxy.result : new HeroKillObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15125, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroKillObj)) {
            return false;
        }
        HeroKillObj heroKillObj = (HeroKillObj) obj;
        return f0.g(this.desc, heroKillObj.desc) && f0.g(this.data_list, heroKillObj.data_list);
    }

    @e
    public final List<KeyDescObj> getData_list() {
        return this.data_list;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15124, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<KeyDescObj> list = this.data_list;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setData_list(@e List<KeyDescObj> list) {
        this.data_list = list;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15123, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HeroKillObj(desc=" + this.desc + ", data_list=" + this.data_list + ')';
    }
}
