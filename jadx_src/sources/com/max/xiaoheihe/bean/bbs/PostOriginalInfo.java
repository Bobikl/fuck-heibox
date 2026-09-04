package com.max.xiaoheihe.bean.bbs;

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

/* JADX INFO: compiled from: PostOriginalInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostOriginalInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Integer original;

    @e
    private String type_adjustment;

    @e
    private List<? extends KeyDescObj> type_adjustment_options;

    public PostOriginalInfo(@e Integer num, @e String str, @e List<? extends KeyDescObj> list) {
        this.original = num;
        this.type_adjustment = str;
        this.type_adjustment_options = list;
    }

    public static /* synthetic */ PostOriginalInfo copy$default(PostOriginalInfo postOriginalInfo, Integer num, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postOriginalInfo, num, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14429, new Class[]{PostOriginalInfo.class, Integer.class, String.class, List.class, Integer.TYPE, Object.class}, PostOriginalInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOriginalInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            num = postOriginalInfo.original;
        }
        if ((i10 & 2) != 0) {
            str = postOriginalInfo.type_adjustment;
        }
        if ((i10 & 4) != 0) {
            list = postOriginalInfo.type_adjustment_options;
        }
        return postOriginalInfo.copy(num, str, list);
    }

    @e
    public final Integer component1() {
        return this.original;
    }

    @e
    public final String component2() {
        return this.type_adjustment;
    }

    @e
    public final List<KeyDescObj> component3() {
        return this.type_adjustment_options;
    }

    @d
    public final PostOriginalInfo copy(@e Integer num, @e String str, @e List<? extends KeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, str, list}, this, changeQuickRedirect, false, 14428, new Class[]{Integer.class, String.class, List.class}, PostOriginalInfo.class);
        return patchProxyResultProxy.isSupported ? (PostOriginalInfo) patchProxyResultProxy.result : new PostOriginalInfo(num, str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14432, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostOriginalInfo)) {
            return false;
        }
        PostOriginalInfo postOriginalInfo = (PostOriginalInfo) obj;
        return f0.g(this.original, postOriginalInfo.original) && f0.g(this.type_adjustment, postOriginalInfo.type_adjustment) && f0.g(this.type_adjustment_options, postOriginalInfo.type_adjustment_options);
    }

    @e
    public final Integer getOriginal() {
        return this.original;
    }

    @e
    public final String getType_adjustment() {
        return this.type_adjustment;
    }

    @e
    public final List<KeyDescObj> getType_adjustment_options() {
        return this.type_adjustment_options;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14431, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.original;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.type_adjustment;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<? extends KeyDescObj> list = this.type_adjustment_options;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setOriginal(@e Integer num) {
        this.original = num;
    }

    public final void setType_adjustment(@e String str) {
        this.type_adjustment = str;
    }

    public final void setType_adjustment_options(@e List<? extends KeyDescObj> list) {
        this.type_adjustment_options = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14430, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostOriginalInfo(original=" + this.original + ", type_adjustment=" + this.type_adjustment + ", type_adjustment_options=" + this.type_adjustment_options + ')';
    }
}
