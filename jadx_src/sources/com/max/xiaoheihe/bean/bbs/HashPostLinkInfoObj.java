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

/* JADX INFO: compiled from: HashPostLinkInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HashPostLinkInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<BBSTopicObj> topicinfos;

    public HashPostLinkInfoObj(@e ArrayList<BBSTopicObj> arrayList) {
        this.topicinfos = arrayList;
    }

    public static /* synthetic */ HashPostLinkInfoObj copy$default(HashPostLinkInfoObj hashPostLinkInfoObj, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hashPostLinkInfoObj, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 14294, new Class[]{HashPostLinkInfoObj.class, ArrayList.class, Integer.TYPE, Object.class}, HashPostLinkInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashPostLinkInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = hashPostLinkInfoObj.topicinfos;
        }
        return hashPostLinkInfoObj.copy(arrayList);
    }

    @e
    public final ArrayList<BBSTopicObj> component1() {
        return this.topicinfos;
    }

    @d
    public final HashPostLinkInfoObj copy(@e ArrayList<BBSTopicObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 14293, new Class[]{ArrayList.class}, HashPostLinkInfoObj.class);
        return patchProxyResultProxy.isSupported ? (HashPostLinkInfoObj) patchProxyResultProxy.result : new HashPostLinkInfoObj(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14297, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof HashPostLinkInfoObj) && f0.g(this.topicinfos, ((HashPostLinkInfoObj) obj).topicinfos);
    }

    @e
    public final ArrayList<BBSTopicObj> getTopicinfos() {
        return this.topicinfos;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14296, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<BBSTopicObj> arrayList = this.topicinfos;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setTopicinfos(@e ArrayList<BBSTopicObj> arrayList) {
        this.topicinfos = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14295, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HashPostLinkInfoObj(topicinfos=" + this.topicinfos + ')';
    }
}
