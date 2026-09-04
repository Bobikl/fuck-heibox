package com.max.xiaoheihe.module.mall.recommendboard;

import androidx.compose.runtime.internal.o;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.mall.RecommendBoardList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendBoardFragmentRepo.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91048b = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private a f91049a;

    @e
    public final a a() {
        return this.f91049a;
    }

    public final void b(int i10, int i11, @d com.max.xiaoheihe.base.mvvm.repository.a<Result<RecommendBoardList>> callBack) {
        Object[] objArr = {new Integer(i10), new Integer(i11), callBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42139, new Class[]{cls, cls, com.max.xiaoheihe.base.mvvm.repository.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callBack, "callBack");
        a aVar = new a(callBack);
        this.f91049a = aVar;
        f0.m(aVar);
        aVar.k(i10, i11);
    }

    public final void c(@e a aVar) {
        this.f91049a = aVar;
    }
}
