package com.max.component.bean;

import bb.c;
import com.max.component.R;
import com.max.component.adapter.tree.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ComponentObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ComponentObj implements a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Class<?> activityClass;

    @e
    private String androidName;

    @e
    private String designName;

    @e
    private String image;
    private int layoutId;

    @d
    private String path;

    public ComponentObj(@d String path, @e String str, @e String str2, @e String str3, @e Class<?> cls, int i10) {
        f0.p(path, "path");
        this.path = path;
        this.designName = str;
        this.androidName = str2;
        this.image = str3;
        this.activityClass = cls;
        this.layoutId = i10;
    }

    public /* synthetic */ ComponentObj(String str, String str2, String str3, String str4, Class cls, int i10, int i11, u uVar) {
        this(str, str2, str3, str4, cls, (i11 & 32) != 0 ? R.layout.item_tree_component : i10);
    }

    public static /* synthetic */ ComponentObj copy$default(ComponentObj componentObj, String str, String str2, String str3, String str4, Class cls, int i10, int i11, Object obj) {
        int i12 = i10;
        Object[] objArr = {componentObj, str, str2, str3, str4, cls, new Integer(i12), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.b.Zl, new Class[]{ComponentObj.class, String.class, String.class, String.class, String.class, Class.class, cls2, cls2, Object.class}, ComponentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ComponentObj) patchProxyResultProxy.result;
        }
        String str5 = (i11 & 1) != 0 ? componentObj.path : str;
        String str6 = (i11 & 2) != 0 ? componentObj.designName : str2;
        String str7 = (i11 & 4) != 0 ? componentObj.androidName : str3;
        String str8 = (i11 & 8) != 0 ? componentObj.image : str4;
        Class cls3 = (i11 & 16) != 0 ? componentObj.activityClass : cls;
        if ((i11 & 32) != 0) {
            i12 = componentObj.layoutId;
        }
        return componentObj.copy(str5, str6, str7, str8, cls3, i12);
    }

    @d
    public final String component1() {
        return this.path;
    }

    @e
    public final String component2() {
        return this.designName;
    }

    @e
    public final String component3() {
        return this.androidName;
    }

    @e
    public final String component4() {
        return this.image;
    }

    @e
    public final Class<?> component5() {
        return this.activityClass;
    }

    public final int component6() {
        return this.layoutId;
    }

    @d
    public final ComponentObj copy(@d String path, @e String str, @e String str2, @e String str3, @e Class<?> cls, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{path, str, str2, str3, cls, new Integer(i10)}, this, changeQuickRedirect, false, c.b.Yl, new Class[]{String.class, String.class, String.class, String.class, Class.class, Integer.TYPE}, ComponentObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ComponentObj) patchProxyResultProxy.result;
        }
        f0.p(path, "path");
        return new ComponentObj(path, str, str2, str3, cls, i10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.cm, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentObj)) {
            return false;
        }
        ComponentObj componentObj = (ComponentObj) obj;
        return f0.g(this.path, componentObj.path) && f0.g(this.designName, componentObj.designName) && f0.g(this.androidName, componentObj.androidName) && f0.g(this.image, componentObj.image) && f0.g(this.activityClass, componentObj.activityClass) && this.layoutId == componentObj.layoutId;
    }

    @e
    public final Class<?> getActivityClass() {
        return this.activityClass;
    }

    @e
    public final String getAndroidName() {
        return this.androidName;
    }

    @e
    public final String getDesignName() {
        return this.designName;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @Override // com.max.component.adapter.tree.a
    public int getLayoutId() {
        return this.layoutId;
    }

    @d
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.bm, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.path.hashCode() * 31;
        String str = this.designName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.androidName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Class<?> cls = this.activityClass;
        return ((iHashCode4 + (cls != null ? cls.hashCode() : 0)) * 31) + this.layoutId;
    }

    @Override // com.max.component.adapter.tree.a
    @d
    public String key() {
        return this.path;
    }

    public final void setActivityClass(@e Class<?> cls) {
        this.activityClass = cls;
    }

    public final void setAndroidName(@e String str) {
        this.androidName = str;
    }

    public final void setDesignName(@e String str) {
        this.designName = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    @Override // com.max.component.adapter.tree.a
    public void setLayoutId(int i10) {
        this.layoutId = i10;
    }

    public final void setPath(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.b.Xl, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.path = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1300, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ComponentObj(path=" + this.path + ", designName=" + this.designName + ", androidName=" + this.androidName + ", image=" + this.image + ", activityClass=" + this.activityClass + ", layoutId=" + this.layoutId + ')';
    }
}
