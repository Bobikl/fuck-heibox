package com.max.xiaoheihe.module.bbs.adapter.viewholderbinder;

import androidx.annotation.d0;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WikiViewHolderBinderFactory.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class k implements cb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final k f80702a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80703b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private k() {
    }

    @dl.e
    public final j a(@dl.d i param, @d0 int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{param, new Integer(i10)}, this, changeQuickRedirect, false, 27568, new Class[]{i.class, Integer.TYPE}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        f0.p(param, "param");
        if (R.layout.component_list_title == i10) {
            return new g(param);
        }
        if (R.layout.item_wiki_item == i10) {
            return new f(param);
        }
        if (R.layout.item_wiki_apply_addition == i10) {
            return new e(param);
        }
        if (R.layout.item_wiki_search_grid == i10) {
            return new h(param);
        }
        return null;
    }
}
