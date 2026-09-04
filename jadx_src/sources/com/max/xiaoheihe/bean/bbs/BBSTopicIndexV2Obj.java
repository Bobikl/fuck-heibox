package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BBSTopicIndexV2Obj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BBSTopicIndexV2Obj extends BBSTopicIndexObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("hashtag_list_v2")
    @e
    private List<? extends HashtagObj> hashtagData;

    @SerializedName("topic_list_v2")
    @e
    private TopicListV2Obj topicData;

    public BBSTopicIndexV2Obj(@e TopicListV2Obj topicListV2Obj, @e List<? extends HashtagObj> list) {
        this.topicData = topicListV2Obj;
        this.hashtagData = list;
    }

    public static /* synthetic */ BBSTopicIndexV2Obj copy$default(BBSTopicIndexV2Obj bBSTopicIndexV2Obj, TopicListV2Obj topicListV2Obj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicIndexV2Obj, topicListV2Obj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14194, new Class[]{BBSTopicIndexV2Obj.class, TopicListV2Obj.class, List.class, Integer.TYPE, Object.class}, BBSTopicIndexV2Obj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTopicIndexV2Obj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            topicListV2Obj = bBSTopicIndexV2Obj.topicData;
        }
        if ((i10 & 2) != 0) {
            list = bBSTopicIndexV2Obj.hashtagData;
        }
        return bBSTopicIndexV2Obj.copy(topicListV2Obj, list);
    }

    @e
    public final TopicListV2Obj component1() {
        return this.topicData;
    }

    @e
    public final List<HashtagObj> component2() {
        return this.hashtagData;
    }

    @d
    public final BBSTopicIndexV2Obj copy(@e TopicListV2Obj topicListV2Obj, @e List<? extends HashtagObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicListV2Obj, list}, this, changeQuickRedirect, false, 14193, new Class[]{TopicListV2Obj.class, List.class}, BBSTopicIndexV2Obj.class);
        return patchProxyResultProxy.isSupported ? (BBSTopicIndexV2Obj) patchProxyResultProxy.result : new BBSTopicIndexV2Obj(topicListV2Obj, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14197, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BBSTopicIndexV2Obj)) {
            return false;
        }
        BBSTopicIndexV2Obj bBSTopicIndexV2Obj = (BBSTopicIndexV2Obj) obj;
        return f0.g(this.topicData, bBSTopicIndexV2Obj.topicData) && f0.g(this.hashtagData, bBSTopicIndexV2Obj.hashtagData);
    }

    @e
    public final List<HashtagObj> getHashtagData() {
        return this.hashtagData;
    }

    @e
    public final TopicListV2Obj getTopicData() {
        return this.topicData;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14196, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        TopicListV2Obj topicListV2Obj = this.topicData;
        int iHashCode = (topicListV2Obj == null ? 0 : topicListV2Obj.hashCode()) * 31;
        List<? extends HashtagObj> list = this.hashtagData;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setHashtagData(@e List<? extends HashtagObj> list) {
        this.hashtagData = list;
    }

    public final void setTopicData(@e TopicListV2Obj topicListV2Obj) {
        this.topicData = topicListV2Obj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14195, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BBSTopicIndexV2Obj(topicData=" + this.topicData + ", hashtagData=" + this.hashtagData + ')';
    }
}
