package com.max.xiaoheihe.bean.game.vote;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VoteQuestionObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class VoteQuestionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<VoteOptionObj> options;

    @e
    private String q_desc;

    @e
    private String total_cnt;

    public VoteQuestionObj(@e String str, @e List<VoteOptionObj> list, @e String str2) {
        this.q_desc = str;
        this.options = list;
        this.total_cnt = str2;
    }

    public static /* synthetic */ VoteQuestionObj copy$default(VoteQuestionObj voteQuestionObj, String str, List list, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voteQuestionObj, str, list, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15444, new Class[]{VoteQuestionObj.class, String.class, List.class, String.class, Integer.TYPE, Object.class}, VoteQuestionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (VoteQuestionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = voteQuestionObj.q_desc;
        }
        if ((i10 & 2) != 0) {
            list = voteQuestionObj.options;
        }
        if ((i10 & 4) != 0) {
            str2 = voteQuestionObj.total_cnt;
        }
        return voteQuestionObj.copy(str, list, str2);
    }

    @e
    public final String component1() {
        return this.q_desc;
    }

    @e
    public final List<VoteOptionObj> component2() {
        return this.options;
    }

    @e
    public final String component3() {
        return this.total_cnt;
    }

    @d
    public final VoteQuestionObj copy(@e String str, @e List<VoteOptionObj> list, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, str2}, this, changeQuickRedirect, false, 15443, new Class[]{String.class, List.class, String.class}, VoteQuestionObj.class);
        return patchProxyResultProxy.isSupported ? (VoteQuestionObj) patchProxyResultProxy.result : new VoteQuestionObj(str, list, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15447, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoteQuestionObj)) {
            return false;
        }
        VoteQuestionObj voteQuestionObj = (VoteQuestionObj) obj;
        return f0.g(this.q_desc, voteQuestionObj.q_desc) && f0.g(this.options, voteQuestionObj.options) && f0.g(this.total_cnt, voteQuestionObj.total_cnt);
    }

    @e
    public final List<VoteOptionObj> getOptions() {
        return this.options;
    }

    @e
    public final String getQ_desc() {
        return this.q_desc;
    }

    @e
    public final String getTotal_cnt() {
        return this.total_cnt;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15446, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.q_desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<VoteOptionObj> list = this.options;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.total_cnt;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setOptions(@e List<VoteOptionObj> list) {
        this.options = list;
    }

    public final void setQ_desc(@e String str) {
        this.q_desc = str;
    }

    public final void setTotal_cnt(@e String str) {
        this.total_cnt = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15445, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "VoteQuestionObj(q_desc=" + this.q_desc + ", options=" + this.options + ", total_cnt=" + this.total_cnt + ')';
    }
}
