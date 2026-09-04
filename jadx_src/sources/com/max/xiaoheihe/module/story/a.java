package com.max.xiaoheihe.module.story;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StoryConfigBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final od.a a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 43524, new Class[]{Context.class}, od.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (od.a) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        return new StoryConfigBuilder(context).j();
    }
}
