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
public final class TopicListSectionObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @SerializedName("children")
    @e
    private List<? extends BBSTopicObj> childSectionTopicList;

    @SerializedName("name")
    @e
    private String sectionName;

    public TopicListSectionObj(@e String str, @e List<? extends BBSTopicObj> list) {
        this.sectionName = str;
        this.childSectionTopicList = list;
    }

    public static /* synthetic */ TopicListSectionObj copy$default(TopicListSectionObj topicListSectionObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicListSectionObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14506, new Class[]{TopicListSectionObj.class, String.class, List.class, Integer.TYPE, Object.class}, TopicListSectionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicListSectionObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = topicListSectionObj.sectionName;
        }
        if ((i10 & 2) != 0) {
            list = topicListSectionObj.childSectionTopicList;
        }
        return topicListSectionObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.sectionName;
    }

    @e
    public final List<BBSTopicObj> component2() {
        return this.childSectionTopicList;
    }

    @d
    public final TopicListSectionObj copy(@e String str, @e List<? extends BBSTopicObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 14505, new Class[]{String.class, List.class}, TopicListSectionObj.class);
        return patchProxyResultProxy.isSupported ? (TopicListSectionObj) patchProxyResultProxy.result : new TopicListSectionObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14509, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicListSectionObj)) {
            return false;
        }
        TopicListSectionObj topicListSectionObj = (TopicListSectionObj) obj;
        return f0.g(this.sectionName, topicListSectionObj.sectionName) && f0.g(this.childSectionTopicList, topicListSectionObj.childSectionTopicList);
    }

    @e
    public final List<BBSTopicObj> getChildSectionTopicList() {
        return this.childSectionTopicList;
    }

    @e
    public final String getSectionName() {
        return this.sectionName;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14508, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.sectionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<? extends BBSTopicObj> list = this.childSectionTopicList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setChildSectionTopicList(@e List<? extends BBSTopicObj> list) {
        this.childSectionTopicList = list;
    }

    public final void setSectionName(@e String str) {
        this.sectionName = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14507, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TopicListSectionObj(sectionName=" + this.sectionName + ", childSectionTopicList=" + this.childSectionTopicList + ')';
    }
}
