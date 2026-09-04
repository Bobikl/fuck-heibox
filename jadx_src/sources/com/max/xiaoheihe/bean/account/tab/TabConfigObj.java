package com.max.xiaoheihe.bean.account.tab;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TabConfigObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TabConfigObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private TabListObj first_tab;

    @e
    private TabListObj second_tab;

    @e
    private TabListObj third_tab;

    public TabConfigObj() {
        this(null, null, null, 7, null);
    }

    public TabConfigObj(@e TabListObj tabListObj, @e TabListObj tabListObj2, @e TabListObj tabListObj3) {
        this.first_tab = tabListObj;
        this.second_tab = tabListObj2;
        this.third_tab = tabListObj3;
    }

    public /* synthetic */ TabConfigObj(TabListObj tabListObj, TabListObj tabListObj2, TabListObj tabListObj3, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : tabListObj, (i10 & 2) != 0 ? null : tabListObj2, (i10 & 4) != 0 ? null : tabListObj3);
    }

    public static /* synthetic */ TabConfigObj copy$default(TabConfigObj tabConfigObj, TabListObj tabListObj, TabListObj tabListObj2, TabListObj tabListObj3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tabConfigObj, tabListObj, tabListObj2, tabListObj3, new Integer(i10), obj}, null, changeQuickRedirect, true, 14084, new Class[]{TabConfigObj.class, TabListObj.class, TabListObj.class, TabListObj.class, Integer.TYPE, Object.class}, TabConfigObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TabConfigObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            tabListObj = tabConfigObj.first_tab;
        }
        if ((i10 & 2) != 0) {
            tabListObj2 = tabConfigObj.second_tab;
        }
        if ((i10 & 4) != 0) {
            tabListObj3 = tabConfigObj.third_tab;
        }
        return tabConfigObj.copy(tabListObj, tabListObj2, tabListObj3);
    }

    @e
    public final TabListObj component1() {
        return this.first_tab;
    }

    @e
    public final TabListObj component2() {
        return this.second_tab;
    }

    @e
    public final TabListObj component3() {
        return this.third_tab;
    }

    @d
    public final TabConfigObj copy(@e TabListObj tabListObj, @e TabListObj tabListObj2, @e TabListObj tabListObj3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tabListObj, tabListObj2, tabListObj3}, this, changeQuickRedirect, false, 14083, new Class[]{TabListObj.class, TabListObj.class, TabListObj.class}, TabConfigObj.class);
        return patchProxyResultProxy.isSupported ? (TabConfigObj) patchProxyResultProxy.result : new TabConfigObj(tabListObj, tabListObj2, tabListObj3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14087, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabConfigObj)) {
            return false;
        }
        TabConfigObj tabConfigObj = (TabConfigObj) obj;
        return f0.g(this.first_tab, tabConfigObj.first_tab) && f0.g(this.second_tab, tabConfigObj.second_tab) && f0.g(this.third_tab, tabConfigObj.third_tab);
    }

    @e
    public final TabListObj getFirst_tab() {
        return this.first_tab;
    }

    @e
    public final TabListObj getSecond_tab() {
        return this.second_tab;
    }

    @e
    public final TabListObj getThird_tab() {
        return this.third_tab;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14086, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        TabListObj tabListObj = this.first_tab;
        int iHashCode = (tabListObj == null ? 0 : tabListObj.hashCode()) * 31;
        TabListObj tabListObj2 = this.second_tab;
        int iHashCode2 = (iHashCode + (tabListObj2 == null ? 0 : tabListObj2.hashCode())) * 31;
        TabListObj tabListObj3 = this.third_tab;
        return iHashCode2 + (tabListObj3 != null ? tabListObj3.hashCode() : 0);
    }

    public final void setFirst_tab(@e TabListObj tabListObj) {
        this.first_tab = tabListObj;
    }

    public final void setSecond_tab(@e TabListObj tabListObj) {
        this.second_tab = tabListObj;
    }

    public final void setThird_tab(@e TabListObj tabListObj) {
        this.third_tab = tabListObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14085, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TabConfigObj(first_tab=" + this.first_tab + ", second_tab=" + this.second_tab + ", third_tab=" + this.third_tab + ')';
    }
}
