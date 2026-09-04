package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TopicListInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TopicListInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<BBSTopicObj> topic_infos;

    public TopicListInfoObj(@e List<BBSTopicObj> list) {
        this.topic_infos = list;
    }

    public static /* synthetic */ TopicListInfoObj copy$default(TopicListInfoObj topicListInfoObj, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicListInfoObj, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14501, new Class[]{TopicListInfoObj.class, List.class, Integer.TYPE, Object.class}, TopicListInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicListInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = topicListInfoObj.topic_infos;
        }
        return topicListInfoObj.copy(list);
    }

    @e
    public final List<BBSTopicObj> component1() {
        return this.topic_infos;
    }

    @d
    public final TopicListInfoObj copy(@e List<BBSTopicObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14500, new Class[]{List.class}, TopicListInfoObj.class);
        return patchProxyResultProxy.isSupported ? (TopicListInfoObj) patchProxyResultProxy.result : new TopicListInfoObj(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14504, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof TopicListInfoObj) && f0.g(this.topic_infos, ((TopicListInfoObj) obj).topic_infos);
    }

    @e
    public final List<BBSTopicObj> getTopic_infos() {
        return this.topic_infos;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14503, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<BBSTopicObj> list = this.topic_infos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setTopic_infos(@e List<BBSTopicObj> list) {
        this.topic_infos = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14502, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TopicListInfoObj(topic_infos=" + this.topic_infos + ')';
    }
}
