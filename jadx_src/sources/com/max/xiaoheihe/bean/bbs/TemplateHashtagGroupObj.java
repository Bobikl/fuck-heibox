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

/* JADX INFO: compiled from: TemplateHashtagResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TemplateHashtagGroupObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<TemplateHashtagObj> items;

    @e
    private String protocol;

    @d
    private String title;

    public TemplateHashtagGroupObj(@d String title, @e String str, @e ArrayList<TemplateHashtagObj> arrayList) {
        f0.p(title, "title");
        this.title = title;
        this.protocol = str;
        this.items = arrayList;
    }

    public static /* synthetic */ TemplateHashtagGroupObj copy$default(TemplateHashtagGroupObj templateHashtagGroupObj, String str, String str2, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{templateHashtagGroupObj, str, str2, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14468, new Class[]{TemplateHashtagGroupObj.class, String.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, TemplateHashtagGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TemplateHashtagGroupObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = templateHashtagGroupObj.title;
        }
        if ((i10 & 2) != 0) {
            str2 = templateHashtagGroupObj.protocol;
        }
        if ((i10 & 4) != 0) {
            arrayList = templateHashtagGroupObj.items;
        }
        return templateHashtagGroupObj.copy(str, str2, arrayList);
    }

    @d
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @e
    public final ArrayList<TemplateHashtagObj> component3() {
        return this.items;
    }

    @d
    public final TemplateHashtagGroupObj copy(@d String title, @e String str, @e ArrayList<TemplateHashtagObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{title, str, arrayList}, this, changeQuickRedirect, false, 14467, new Class[]{String.class, String.class, ArrayList.class}, TemplateHashtagGroupObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TemplateHashtagGroupObj) patchProxyResultProxy.result;
        }
        f0.p(title, "title");
        return new TemplateHashtagGroupObj(title, str, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14471, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateHashtagGroupObj)) {
            return false;
        }
        TemplateHashtagGroupObj templateHashtagGroupObj = (TemplateHashtagGroupObj) obj;
        return f0.g(this.title, templateHashtagGroupObj.title) && f0.g(this.protocol, templateHashtagGroupObj.protocol) && f0.g(this.items, templateHashtagGroupObj.items);
    }

    @e
    public final ArrayList<TemplateHashtagObj> getItems() {
        return this.items;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @d
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14470, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.title.hashCode() * 31;
        String str = this.protocol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList<TemplateHashtagObj> arrayList = this.items;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setItems(@e ArrayList<TemplateHashtagObj> arrayList) {
        this.items = arrayList;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTitle(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14466, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14469, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TemplateHashtagGroupObj(title=" + this.title + ", protocol=" + this.protocol + ", items=" + this.items + ')';
    }
}
