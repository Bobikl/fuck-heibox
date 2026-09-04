package com.max.xiaoheihe.bean.rich;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.AttrObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RichAttributeModelObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RichAttributeModelObj extends BaseRichModelObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<AttrObj> attrs;

    @e
    private String number_of_lines;

    @e
    private String text_alignment;

    public RichAttributeModelObj(@e String str, @e String str2, @e List<AttrObj> list) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.text_alignment = str;
        this.number_of_lines = str2;
        this.attrs = list;
    }

    public static /* synthetic */ RichAttributeModelObj copy$default(RichAttributeModelObj richAttributeModelObj, String str, String str2, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{richAttributeModelObj, str, str2, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15812, new Class[]{RichAttributeModelObj.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, RichAttributeModelObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RichAttributeModelObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = richAttributeModelObj.text_alignment;
        }
        if ((i10 & 2) != 0) {
            str2 = richAttributeModelObj.number_of_lines;
        }
        if ((i10 & 4) != 0) {
            list = richAttributeModelObj.attrs;
        }
        return richAttributeModelObj.copy(str, str2, list);
    }

    @e
    public final String component1() {
        return this.text_alignment;
    }

    @e
    public final String component2() {
        return this.number_of_lines;
    }

    @e
    public final List<AttrObj> component3() {
        return this.attrs;
    }

    @d
    public final RichAttributeModelObj copy(@e String str, @e String str2, @e List<AttrObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, list}, this, changeQuickRedirect, false, 15811, new Class[]{String.class, String.class, List.class}, RichAttributeModelObj.class);
        return patchProxyResultProxy.isSupported ? (RichAttributeModelObj) patchProxyResultProxy.result : new RichAttributeModelObj(str, str2, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15815, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichAttributeModelObj)) {
            return false;
        }
        RichAttributeModelObj richAttributeModelObj = (RichAttributeModelObj) obj;
        return f0.g(this.text_alignment, richAttributeModelObj.text_alignment) && f0.g(this.number_of_lines, richAttributeModelObj.number_of_lines) && f0.g(this.attrs, richAttributeModelObj.attrs);
    }

    @e
    public final List<AttrObj> getAttrs() {
        return this.attrs;
    }

    @e
    public final String getNumber_of_lines() {
        return this.number_of_lines;
    }

    @e
    public final String getText_alignment() {
        return this.text_alignment;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15814, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.text_alignment;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number_of_lines;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AttrObj> list = this.attrs;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setAttrs(@e List<AttrObj> list) {
        this.attrs = list;
    }

    public final void setNumber_of_lines(@e String str) {
        this.number_of_lines = str;
    }

    public final void setText_alignment(@e String str) {
        this.text_alignment = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15813, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RichAttributeModelObj(text_alignment=" + this.text_alignment + ", number_of_lines=" + this.number_of_lines + ", attrs=" + this.attrs + ')';
    }
}
