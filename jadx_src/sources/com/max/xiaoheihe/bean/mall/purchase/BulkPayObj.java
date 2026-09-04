package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BulkPayObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BulkPayObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int count;

    @e
    private String desc;

    @e
    private Boolean enable;

    public BulkPayObj(int i10, @e Boolean bool, @e String str) {
        this.count = i10;
        this.enable = bool;
        this.desc = str;
    }

    public /* synthetic */ BulkPayObj(int i10, Boolean bool, String str, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0 : i10, bool, str);
    }

    public static /* synthetic */ BulkPayObj copy$default(BulkPayObj bulkPayObj, int i10, Boolean bool, String str, int i11, Object obj) {
        Object[] objArr = {bulkPayObj, new Integer(i10), bool, str, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15637, new Class[]{BulkPayObj.class, cls, Boolean.class, String.class, cls, Object.class}, BulkPayObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BulkPayObj) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            i10 = bulkPayObj.count;
        }
        if ((i11 & 2) != 0) {
            bool = bulkPayObj.enable;
        }
        if ((i11 & 4) != 0) {
            str = bulkPayObj.desc;
        }
        return bulkPayObj.copy(i10, bool, str);
    }

    public final int component1() {
        return this.count;
    }

    @e
    public final Boolean component2() {
        return this.enable;
    }

    @e
    public final String component3() {
        return this.desc;
    }

    @d
    public final BulkPayObj copy(int i10, @e Boolean bool, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), bool, str}, this, changeQuickRedirect, false, 15636, new Class[]{Integer.TYPE, Boolean.class, String.class}, BulkPayObj.class);
        return patchProxyResultProxy.isSupported ? (BulkPayObj) patchProxyResultProxy.result : new BulkPayObj(i10, bool, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15640, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkPayObj)) {
            return false;
        }
        BulkPayObj bulkPayObj = (BulkPayObj) obj;
        return this.count == bulkPayObj.count && f0.g(this.enable, bulkPayObj.enable) && f0.g(this.desc, bulkPayObj.desc);
    }

    public final int getCount() {
        return this.count;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final Boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15639, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.count * 31;
        Boolean bool = this.enable;
        int iHashCode = (i10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.desc;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setCount(int i10) {
        this.count = i10;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setEnable(@e Boolean bool) {
        this.enable = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15638, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BulkPayObj(count=" + this.count + ", enable=" + this.enable + ", desc=" + this.desc + ')';
    }
}
