package com.max.xiaoheihe.bean.account.tab;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.utils.c0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TabListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TabListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String default_checked_key;

    @e
    private ArrayList<TabKeyObj> entry;

    @e
    private String title;

    public TabListObj(@e String str, @e String str2, @e ArrayList<TabKeyObj> arrayList) {
        this.title = str;
        this.default_checked_key = str2;
        this.entry = arrayList;
    }

    public static /* synthetic */ TabListObj copy$default(TabListObj tabListObj, String str, String str2, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tabListObj, str, str2, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14097, new Class[]{TabListObj.class, String.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, TabListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TabListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tabListObj.title;
        }
        if ((i10 & 2) != 0) {
            str2 = tabListObj.default_checked_key;
        }
        if ((i10 & 4) != 0) {
            arrayList = tabListObj.entry;
        }
        return tabListObj.copy(str, str2, arrayList);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.default_checked_key;
    }

    @e
    public final ArrayList<TabKeyObj> component3() {
        return this.entry;
    }

    @d
    public final TabListObj copy(@e String str, @e String str2, @e ArrayList<TabKeyObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, arrayList}, this, changeQuickRedirect, false, 14096, new Class[]{String.class, String.class, ArrayList.class}, TabListObj.class);
        return patchProxyResultProxy.isSupported ? (TabListObj) patchProxyResultProxy.result : new TabListObj(str, str2, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14100, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabListObj)) {
            return false;
        }
        TabListObj tabListObj = (TabListObj) obj;
        return f0.g(this.title, tabListObj.title) && f0.g(this.default_checked_key, tabListObj.default_checked_key) && f0.g(this.entry, tabListObj.entry);
    }

    @e
    public final String getDefault_checked_key() {
        return this.default_checked_key;
    }

    @e
    public final ArrayList<TabKeyObj> getEntry() {
        return this.entry;
    }

    @e
    public final TabKeyObj getLegalEntry(int i10) {
        int i11 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 14094, new Class[]{Integer.TYPE}, TabKeyObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TabKeyObj) patchProxyResultProxy.result;
        }
        ArrayList<TabKeyObj> arrayList = this.entry;
        if (arrayList == null) {
            return null;
        }
        for (TabKeyObj tabKeyObj : arrayList) {
            if (c0.c(tabKeyObj.getKey(), null) != null) {
                if (i11 == i10) {
                    return tabKeyObj;
                }
                i11++;
            }
        }
        return null;
    }

    public final int getLegalEntryIndex(@e String str) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14095, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<TabKeyObj> arrayList = this.entry;
        if (arrayList == null) {
            return -1;
        }
        for (TabKeyObj tabKeyObj : arrayList) {
            if (c0.c(tabKeyObj.getKey(), null) != null) {
                if (f0.g(str, tabKeyObj.getKey())) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public final int getLegalKeyNum() {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14093, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<TabKeyObj> arrayList = this.entry;
        if (arrayList != null) {
            Iterator<TabKeyObj> it = arrayList.iterator();
            while (it.hasNext()) {
                if (c0.c(it.next().getKey(), null) != null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14099, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.default_checked_key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<TabKeyObj> arrayList = this.entry;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setDefault_checked_key(@e String str) {
        this.default_checked_key = str;
    }

    public final void setEntry(@e ArrayList<TabKeyObj> arrayList) {
        this.entry = arrayList;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14098, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TabListObj(title=" + this.title + ", default_checked_key=" + this.default_checked_key + ", entry=" + this.entry + ')';
    }
}
