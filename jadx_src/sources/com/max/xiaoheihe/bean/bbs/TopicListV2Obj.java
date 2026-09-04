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
public final class TopicListV2Obj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("recommend_topics")
    @e
    private List<? extends BBSTopicObj> recommendTopicList;

    @SerializedName("section_topics")
    @e
    private List<TopicListSectionObj> topicSections;

    public TopicListV2Obj(@e List<? extends BBSTopicObj> list, @e List<TopicListSectionObj> list2) {
        this.recommendTopicList = list;
        this.topicSections = list2;
    }

    public static /* synthetic */ TopicListV2Obj copy$default(TopicListV2Obj topicListV2Obj, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicListV2Obj, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14511, new Class[]{TopicListV2Obj.class, List.class, List.class, Integer.TYPE, Object.class}, TopicListV2Obj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicListV2Obj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = topicListV2Obj.recommendTopicList;
        }
        if ((i10 & 2) != 0) {
            list2 = topicListV2Obj.topicSections;
        }
        return topicListV2Obj.copy(list, list2);
    }

    @e
    public final List<BBSTopicObj> component1() {
        return this.recommendTopicList;
    }

    @e
    public final List<TopicListSectionObj> component2() {
        return this.topicSections;
    }

    @d
    public final TopicListV2Obj copy(@e List<? extends BBSTopicObj> list, @e List<TopicListSectionObj> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, 14510, new Class[]{List.class, List.class}, TopicListV2Obj.class);
        return patchProxyResultProxy.isSupported ? (TopicListV2Obj) patchProxyResultProxy.result : new TopicListV2Obj(list, list2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14514, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicListV2Obj)) {
            return false;
        }
        TopicListV2Obj topicListV2Obj = (TopicListV2Obj) obj;
        return f0.g(this.recommendTopicList, topicListV2Obj.recommendTopicList) && f0.g(this.topicSections, topicListV2Obj.topicSections);
    }

    @e
    public final List<BBSTopicObj> getRecommendTopicList() {
        return this.recommendTopicList;
    }

    @e
    public final List<TopicListSectionObj> getTopicSections() {
        return this.topicSections;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14513, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<? extends BBSTopicObj> list = this.recommendTopicList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopicListSectionObj> list2 = this.topicSections;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setRecommendTopicList(@e List<? extends BBSTopicObj> list) {
        this.recommendTopicList = list;
    }

    public final void setTopicSections(@e List<TopicListSectionObj> list) {
        this.topicSections = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14512, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TopicListV2Obj(recommendTopicList=" + this.recommendTopicList + ", topicSections=" + this.topicSections + ')';
    }
}
