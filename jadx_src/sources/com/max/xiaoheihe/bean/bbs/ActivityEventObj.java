package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ActivityEventObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ActivityEventObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<KeyDescObj> items;

    @e
    private String text;

    public ActivityEventObj(@e String str, @e ArrayList<KeyDescObj> arrayList) {
        this.text = str;
        this.items = arrayList;
    }

    public static /* synthetic */ ActivityEventObj copy$default(ActivityEventObj activityEventObj, String str, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activityEventObj, str, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14147, new Class[]{ActivityEventObj.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, ActivityEventObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ActivityEventObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = activityEventObj.text;
        }
        if ((i10 & 2) != 0) {
            arrayList = activityEventObj.items;
        }
        return activityEventObj.copy(str, arrayList);
    }

    @e
    public final String component1() {
        return this.text;
    }

    @e
    public final ArrayList<KeyDescObj> component2() {
        return this.items;
    }

    @d
    public final ActivityEventObj copy(@e String str, @e ArrayList<KeyDescObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, arrayList}, this, changeQuickRedirect, false, 14146, new Class[]{String.class, ArrayList.class}, ActivityEventObj.class);
        return patchProxyResultProxy.isSupported ? (ActivityEventObj) patchProxyResultProxy.result : new ActivityEventObj(str, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14150, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityEventObj)) {
            return false;
        }
        ActivityEventObj activityEventObj = (ActivityEventObj) obj;
        return f0.g(this.text, activityEventObj.text) && f0.g(this.items, activityEventObj.items);
    }

    @e
    public final ArrayList<KeyDescObj> getItems() {
        return this.items;
    }

    @e
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14149, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList<KeyDescObj> arrayList = this.items;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setItems(@e ArrayList<KeyDescObj> arrayList) {
        this.items = arrayList;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14148, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ActivityEventObj(text=" + this.text + ", items=" + this.items + ')';
    }
}
