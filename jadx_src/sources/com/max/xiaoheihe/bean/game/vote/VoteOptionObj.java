package com.max.xiaoheihe.bean.game.vote;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VoteOptionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class VoteOptionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean is_selected;

    @e
    private String o_desc;

    @e
    private String selected_cnt;

    @e
    private String selected_percent;

    public VoteOptionObj(boolean z10, @e String str, @e String str2, @e String str3) {
        this.is_selected = z10;
        this.o_desc = str;
        this.selected_cnt = str2;
        this.selected_percent = str3;
    }

    public static /* synthetic */ VoteOptionObj copy$default(VoteOptionObj voteOptionObj, boolean z10, String str, String str2, String str3, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voteOptionObj, new Byte(z11 ? (byte) 1 : (byte) 0), str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15433, new Class[]{VoteOptionObj.class, Boolean.TYPE, String.class, String.class, String.class, Integer.TYPE, Object.class}, VoteOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (VoteOptionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z11 = voteOptionObj.is_selected;
        }
        return voteOptionObj.copy(z11, (i10 & 2) != 0 ? voteOptionObj.o_desc : str, (i10 & 4) != 0 ? voteOptionObj.selected_cnt : str2, (i10 & 8) != 0 ? voteOptionObj.selected_percent : str3);
    }

    public final boolean component1() {
        return this.is_selected;
    }

    @e
    public final String component2() {
        return this.o_desc;
    }

    @e
    public final String component3() {
        return this.selected_cnt;
    }

    @e
    public final String component4() {
        return this.selected_percent;
    }

    @d
    public final VoteOptionObj copy(boolean z10, @e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, str2, str3}, this, changeQuickRedirect, false, 15432, new Class[]{Boolean.TYPE, String.class, String.class, String.class}, VoteOptionObj.class);
        return patchProxyResultProxy.isSupported ? (VoteOptionObj) patchProxyResultProxy.result : new VoteOptionObj(z10, str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15436, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoteOptionObj)) {
            return false;
        }
        VoteOptionObj voteOptionObj = (VoteOptionObj) obj;
        return this.is_selected == voteOptionObj.is_selected && f0.g(this.o_desc, voteOptionObj.o_desc) && f0.g(this.selected_cnt, voteOptionObj.selected_cnt) && f0.g(this.selected_percent, voteOptionObj.selected_percent);
    }

    @e
    public final String getO_desc() {
        return this.o_desc;
    }

    @e
    public final String getSelected_cnt() {
        return this.selected_cnt;
    }

    @e
    public final String getSelected_percent() {
        return this.selected_percent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15435, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.is_selected;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int i10 = r10 * 31;
        String str = this.o_desc;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selected_cnt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selected_percent;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean is_selected() {
        return this.is_selected;
    }

    public final void setO_desc(@e String str) {
        this.o_desc = str;
    }

    public final void setSelected_cnt(@e String str) {
        this.selected_cnt = str;
    }

    public final void setSelected_percent(@e String str) {
        this.selected_percent = str;
    }

    public final void set_selected(boolean z10) {
        this.is_selected = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15434, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "VoteOptionObj(is_selected=" + this.is_selected + ", o_desc=" + this.o_desc + ", selected_cnt=" + this.selected_cnt + ", selected_percent=" + this.selected_percent + ')';
    }
}
