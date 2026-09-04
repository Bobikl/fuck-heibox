package com.max.xiaoheihe.module.game.adapter.recommend;

import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.DiffUtil;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameRecommendCallback.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class d extends DiffUtil.Callback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86290c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<GameRecommendBaseObj> f86291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<GameRecommendBaseObj> f86292b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.d List<? extends GameRecommendBaseObj> oldList, @dl.d List<? extends GameRecommendBaseObj> newList) {
        f0.p(oldList, "oldList");
        f0.p(newList, "newList");
        this.f86291a = oldList;
        this.f86292b = newList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35905, new Class[]{cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(this.f86291a.get(i10), this.f86292b.get(i11));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35904, new Class[]{cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(this.f86291a.get(i10).getType(), this.f86292b.get(i11).getType());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35903, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f86292b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35902, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f86291a.size();
    }
}
