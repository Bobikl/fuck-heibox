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

/* JADX INFO: compiled from: VoteQuestionListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class VoteQuestionListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<VoteQuestionObj> question_list;

    public VoteQuestionListObj(@d List<VoteQuestionObj> question_list) {
        f0.p(question_list, "question_list");
        this.question_list = question_list;
    }

    public static /* synthetic */ VoteQuestionListObj copy$default(VoteQuestionListObj voteQuestionListObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{voteQuestionListObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15439, new Class[]{VoteQuestionListObj.class, List.class, Integer.TYPE, Object.class}, VoteQuestionListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (VoteQuestionListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = voteQuestionListObj.question_list;
        }
        return voteQuestionListObj.copy(list);
    }

    @d
    public final List<VoteQuestionObj> component1() {
        return this.question_list;
    }

    @d
    public final VoteQuestionListObj copy(@d List<VoteQuestionObj> question_list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{question_list}, this, changeQuickRedirect, false, 15438, new Class[]{List.class}, VoteQuestionListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (VoteQuestionListObj) patchProxyResultProxy.result;
        }
        f0.p(question_list, "question_list");
        return new VoteQuestionListObj(question_list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15442, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof VoteQuestionListObj) && f0.g(this.question_list, ((VoteQuestionListObj) obj).question_list);
    }

    @d
    public final List<VoteQuestionObj> getQuestion_list() {
        return this.question_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15441, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.question_list.hashCode();
    }

    public final void setQuestion_list(@d List<VoteQuestionObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15437, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.question_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15440, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "VoteQuestionListObj(question_list=" + this.question_list + ')';
    }
}
