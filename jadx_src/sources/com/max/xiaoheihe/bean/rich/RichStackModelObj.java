package com.max.xiaoheihe.bean.rich;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RichStackModelObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RichStackModelObj extends BaseRichModelObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String alignment;

    @e
    private String axis;

    @e
    private List<BaseRichModelObj> models;

    @e
    private String space;

    @e
    private String width;

    public RichStackModelObj(@e String str, @e String str2, @e String str3, @e List<BaseRichModelObj> list, @e String str4) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.alignment = str;
        this.axis = str2;
        this.width = str3;
        this.models = list;
        this.space = str4;
    }

    public static /* synthetic */ RichStackModelObj copy$default(RichStackModelObj richStackModelObj, String str, String str2, String str3, List list, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{richStackModelObj, str, str2, str3, list, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15817, new Class[]{RichStackModelObj.class, String.class, String.class, String.class, List.class, String.class, Integer.TYPE, Object.class}, RichStackModelObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RichStackModelObj) patchProxyResultProxy.result;
        }
        return richStackModelObj.copy((i10 & 1) != 0 ? richStackModelObj.alignment : str, (i10 & 2) != 0 ? richStackModelObj.axis : str2, (i10 & 4) != 0 ? richStackModelObj.width : str3, (i10 & 8) != 0 ? richStackModelObj.models : list, (i10 & 16) != 0 ? richStackModelObj.space : str4);
    }

    @e
    public final String component1() {
        return this.alignment;
    }

    @e
    public final String component2() {
        return this.axis;
    }

    @e
    public final String component3() {
        return this.width;
    }

    @e
    public final List<BaseRichModelObj> component4() {
        return this.models;
    }

    @e
    public final String component5() {
        return this.space;
    }

    @d
    public final RichStackModelObj copy(@e String str, @e String str2, @e String str3, @e List<BaseRichModelObj> list, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list, str4}, this, changeQuickRedirect, false, 15816, new Class[]{String.class, String.class, String.class, List.class, String.class}, RichStackModelObj.class);
        return patchProxyResultProxy.isSupported ? (RichStackModelObj) patchProxyResultProxy.result : new RichStackModelObj(str, str2, str3, list, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15820, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichStackModelObj)) {
            return false;
        }
        RichStackModelObj richStackModelObj = (RichStackModelObj) obj;
        return f0.g(this.alignment, richStackModelObj.alignment) && f0.g(this.axis, richStackModelObj.axis) && f0.g(this.width, richStackModelObj.width) && f0.g(this.models, richStackModelObj.models) && f0.g(this.space, richStackModelObj.space);
    }

    @e
    public final String getAlignment() {
        return this.alignment;
    }

    @e
    public final String getAxis() {
        return this.axis;
    }

    @e
    public final List<BaseRichModelObj> getModels() {
        return this.models;
    }

    @e
    public final String getSpace() {
        return this.space;
    }

    @e
    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15819, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.alignment;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.axis;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.width;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BaseRichModelObj> list = this.models;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.space;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAlignment(@e String str) {
        this.alignment = str;
    }

    public final void setAxis(@e String str) {
        this.axis = str;
    }

    public final void setModels(@e List<BaseRichModelObj> list) {
        this.models = list;
    }

    public final void setSpace(@e String str) {
        this.space = str;
    }

    public final void setWidth(@e String str) {
        this.width = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15818, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RichStackModelObj(alignment=" + this.alignment + ", axis=" + this.axis + ", width=" + this.width + ", models=" + this.models + ", space=" + this.space + ')';
    }
}
