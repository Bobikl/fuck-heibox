package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
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
public final class TopicSelectionSearchResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<TopicHashtagWrapper> search_result;

    public TopicSelectionSearchResultObj(@e ArrayList<TopicHashtagWrapper> arrayList) {
        this.search_result = arrayList;
    }

    public static /* synthetic */ TopicSelectionSearchResultObj copy$default(TopicSelectionSearchResultObj topicSelectionSearchResultObj, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{topicSelectionSearchResultObj, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14521, new Class[]{TopicSelectionSearchResultObj.class, ArrayList.class, Integer.TYPE, Object.class}, TopicSelectionSearchResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicSelectionSearchResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = topicSelectionSearchResultObj.search_result;
        }
        return topicSelectionSearchResultObj.copy(arrayList);
    }

    @e
    public final ArrayList<TopicHashtagWrapper> component1() {
        return this.search_result;
    }

    @d
    public final TopicSelectionSearchResultObj copy(@e ArrayList<TopicHashtagWrapper> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 14520, new Class[]{ArrayList.class}, TopicSelectionSearchResultObj.class);
        return patchProxyResultProxy.isSupported ? (TopicSelectionSearchResultObj) patchProxyResultProxy.result : new TopicSelectionSearchResultObj(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14524, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof TopicSelectionSearchResultObj) && f0.g(this.search_result, ((TopicSelectionSearchResultObj) obj).search_result);
    }

    @e
    public final ArrayList<TopicHashtagWrapper> getSearch_result() {
        return this.search_result;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14523, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<TopicHashtagWrapper> arrayList = this.search_result;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setSearch_result(@e ArrayList<TopicHashtagWrapper> arrayList) {
        this.search_result = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14522, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TopicSelectionSearchResultObj(search_result=" + this.search_result + ')';
    }
}
