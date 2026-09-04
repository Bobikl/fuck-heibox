package com.max.xiaoheihe.module.bbs;

import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TopicInfoManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f80775b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80776c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private static b0 f80777d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final HashMap<String, BBSTopicObj> f80778a = new HashMap<>();

    /* JADX INFO: compiled from: TopicInfoManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final synchronized b0 a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26937, new Class[0], b0.class);
            if (patchProxyResultProxy.isSupported) {
                return (b0) patchProxyResultProxy.result;
            }
            if (b0.f80777d == null) {
                b0.f80777d = new b0();
            }
            b0 b0Var = b0.f80777d;
            kotlin.jvm.internal.f0.m(b0Var);
            return b0Var;
        }
    }

    @dl.d
    @xh.m
    public static final synchronized b0 f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26936, new Class[0], b0.class);
        if (patchProxyResultProxy.isSupported) {
            return (b0) patchProxyResultProxy.result;
        }
        return f80775b.a();
    }

    public final void c(@dl.e BBSTopicObj bBSTopicObj) {
        if (PatchProxy.proxy(new Object[]{bBSTopicObj}, this, changeQuickRedirect, false, 26933, new Class[]{BBSTopicObj.class}, Void.TYPE).isSupported || bBSTopicObj == null || this.f80778a.containsKey(bBSTopicObj.getTopic_id()) || com.max.hbcommon.utils.c.u(bBSTopicObj.getTopic_id()) || com.max.hbcommon.utils.c.u(bBSTopicObj.getName()) || com.max.hbcommon.utils.c.u(bBSTopicObj.getPic_url())) {
            return;
        }
        HashMap<String, BBSTopicObj> map = this.f80778a;
        String topic_id = bBSTopicObj.getTopic_id();
        kotlin.jvm.internal.f0.o(topic_id, "it.topic_id");
        map.put(topic_id, bBSTopicObj);
    }

    public final void d(@dl.e List<BBSTopicObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26934, new Class[]{List.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        kotlin.jvm.internal.f0.m(list);
        Iterator<BBSTopicObj> it = list.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    @dl.e
    public final BBSTopicObj e(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26935, new Class[]{String.class}, BBSTopicObj.class);
        return patchProxyResultProxy.isSupported ? (BBSTopicObj) patchProxyResultProxy.result : this.f80778a.get(str);
    }
}
