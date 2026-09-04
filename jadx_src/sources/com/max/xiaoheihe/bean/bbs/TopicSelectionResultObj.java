package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TopicSelectionResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TopicSelectionResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<HashtagObj> hashtag_list;

    @SerializedName("rec_src")
    @e
    private String recSrc;

    @e
    private ArrayList<BBSTopicObj> topic_list;

    public TopicSelectionResultObj(@e ArrayList<BBSTopicObj> arrayList, @e ArrayList<HashtagObj> arrayList2, @e String str) {
        this.topic_list = arrayList;
        this.hashtag_list = arrayList2;
        this.recSrc = str;
    }

    public static /* synthetic */ TopicSelectionResultObj copy$default(TopicSelectionResultObj topicSelectionResultObj, ArrayList arrayList, ArrayList arrayList2, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicSelectionResultObj, arrayList, arrayList2, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14516, new Class[]{TopicSelectionResultObj.class, ArrayList.class, ArrayList.class, String.class, Integer.TYPE, Object.class}, TopicSelectionResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicSelectionResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = topicSelectionResultObj.topic_list;
        }
        if ((i10 & 2) != 0) {
            arrayList2 = topicSelectionResultObj.hashtag_list;
        }
        if ((i10 & 4) != 0) {
            str = topicSelectionResultObj.recSrc;
        }
        return topicSelectionResultObj.copy(arrayList, arrayList2, str);
    }

    @e
    public final ArrayList<BBSTopicObj> component1() {
        return this.topic_list;
    }

    @e
    public final ArrayList<HashtagObj> component2() {
        return this.hashtag_list;
    }

    @e
    public final String component3() {
        return this.recSrc;
    }

    @d
    public final TopicSelectionResultObj copy(@e ArrayList<BBSTopicObj> arrayList, @e ArrayList<HashtagObj> arrayList2, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, arrayList2, str}, this, changeQuickRedirect, false, 14515, new Class[]{ArrayList.class, ArrayList.class, String.class}, TopicSelectionResultObj.class);
        return patchProxyResultProxy.isSupported ? (TopicSelectionResultObj) patchProxyResultProxy.result : new TopicSelectionResultObj(arrayList, arrayList2, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14519, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicSelectionResultObj)) {
            return false;
        }
        TopicSelectionResultObj topicSelectionResultObj = (TopicSelectionResultObj) obj;
        return f0.g(this.topic_list, topicSelectionResultObj.topic_list) && f0.g(this.hashtag_list, topicSelectionResultObj.hashtag_list) && f0.g(this.recSrc, topicSelectionResultObj.recSrc);
    }

    @e
    public final ArrayList<HashtagObj> getHashtag_list() {
        return this.hashtag_list;
    }

    @e
    public final String getRecSrc() {
        return this.recSrc;
    }

    @e
    public final ArrayList<BBSTopicObj> getTopic_list() {
        return this.topic_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14518, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<BBSTopicObj> arrayList = this.topic_list;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<HashtagObj> arrayList2 = this.hashtag_list;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        String str = this.recSrc;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setHashtag_list(@e ArrayList<HashtagObj> arrayList) {
        this.hashtag_list = arrayList;
    }

    public final void setRecSrc(@e String str) {
        this.recSrc = str;
    }

    public final void setTopic_list(@e ArrayList<BBSTopicObj> arrayList) {
        this.topic_list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14517, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TopicSelectionResultObj(topic_list=" + this.topic_list + ", hashtag_list=" + this.hashtag_list + ", recSrc=" + this.recSrc + ')';
    }
}
