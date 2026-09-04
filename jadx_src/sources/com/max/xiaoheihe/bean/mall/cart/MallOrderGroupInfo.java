package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallOrderGroupInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String grouping_id;

    @e
    private List<String> grouping_user_images;
    private int num;

    public MallOrderGroupInfo(int i10, @e String str, @e List<String> list) {
        this.num = i10;
        this.grouping_id = str;
        this.grouping_user_images = list;
    }

    public static /* synthetic */ MallOrderGroupInfo copy$default(MallOrderGroupInfo mallOrderGroupInfo, int i10, String str, List list, int i11, Object obj) {
        Object[] objArr = {mallOrderGroupInfo, new Integer(i10), str, list, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15602, new Class[]{MallOrderGroupInfo.class, cls, String.class, List.class, cls, Object.class}, MallOrderGroupInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderGroupInfo) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            i10 = mallOrderGroupInfo.num;
        }
        if ((i11 & 2) != 0) {
            str = mallOrderGroupInfo.grouping_id;
        }
        if ((i11 & 4) != 0) {
            list = mallOrderGroupInfo.grouping_user_images;
        }
        return mallOrderGroupInfo.copy(i10, str, list);
    }

    public final int component1() {
        return this.num;
    }

    @e
    public final String component2() {
        return this.grouping_id;
    }

    @e
    public final List<String> component3() {
        return this.grouping_user_images;
    }

    @d
    public final MallOrderGroupInfo copy(int i10, @e String str, @e List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str, list}, this, changeQuickRedirect, false, 15601, new Class[]{Integer.TYPE, String.class, List.class}, MallOrderGroupInfo.class);
        return patchProxyResultProxy.isSupported ? (MallOrderGroupInfo) patchProxyResultProxy.result : new MallOrderGroupInfo(i10, str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15605, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallOrderGroupInfo)) {
            return false;
        }
        MallOrderGroupInfo mallOrderGroupInfo = (MallOrderGroupInfo) obj;
        return this.num == mallOrderGroupInfo.num && f0.g(this.grouping_id, mallOrderGroupInfo.grouping_id) && f0.g(this.grouping_user_images, mallOrderGroupInfo.grouping_user_images);
    }

    @e
    public final String getGrouping_id() {
        return this.grouping_id;
    }

    @e
    public final List<String> getGrouping_user_images() {
        return this.grouping_user_images;
    }

    public final int getNum() {
        return this.num;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15604, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.num * 31;
        String str = this.grouping_id;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.grouping_user_images;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setGrouping_id(@e String str) {
        this.grouping_id = str;
    }

    public final void setGrouping_user_images(@e List<String> list) {
        this.grouping_user_images = list;
    }

    public final void setNum(int i10) {
        this.num = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15603, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallOrderGroupInfo(num=" + this.num + ", grouping_id=" + this.grouping_id + ", grouping_user_images=" + this.grouping_user_images + ')';
    }
}
