package com.max.xiaoheihe.module.bbs.post_edit;

import com.max.hbcommon.base.BaseViewModel;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicItems;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;

/* JADX INFO: compiled from: RecommendTopicViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class RecommendTopicViewModel extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f82727f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.i<RecommendedTopicItems> f82728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.n<RecommendedTopicItems> f82729e;

    public RecommendTopicViewModel() {
        kotlinx.coroutines.flow.i<RecommendedTopicItems> iVarB = kotlinx.coroutines.flow.o.b(1, 0, null, 6, null);
        this.f82728d = iVarB;
        this.f82729e = iVarB;
    }

    @dl.d
    public final kotlinx.coroutines.flow.n<RecommendedTopicItems> h() {
        return this.f82729e;
    }

    public final void i(@dl.e String str, @dl.d String title, @dl.d String text, @dl.d yh.l<? super Boolean, b2> callback) {
        if (PatchProxy.proxy(new Object[]{str, title, text, callback}, this, changeQuickRedirect, false, 30779, new Class[]{String.class, String.class, String.class, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(title, "title");
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlinx.coroutines.k.f(androidx.lifecycle.x0.a(this), null, null, new RecommendTopicViewModel$requestOutsideRecommend$1(str, title, text, callback, this, null), 3, null);
    }
}
