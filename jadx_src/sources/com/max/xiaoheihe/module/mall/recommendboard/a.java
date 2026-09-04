package com.max.xiaoheihe.module.mall.recommendboard;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.base.mvvm.repository.BaseFakeRemoteDataSource;
import com.max.xiaoheihe.bean.mall.RecommendBoardList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendBoardDataSource.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class a extends BaseFakeRemoteDataSource<Result<RecommendBoardList>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f91047f = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d com.max.xiaoheihe.base.mvvm.repository.a<Result<RecommendBoardList>> callBack) {
        super(callBack);
        f0.p(callBack, "callBack");
    }

    public final void k(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42106, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        j(g().I5(i10, i11));
        h(true);
    }
}
