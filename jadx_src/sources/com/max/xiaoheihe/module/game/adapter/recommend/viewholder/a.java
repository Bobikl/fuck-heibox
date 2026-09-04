package com.max.xiaoheihe.module.game.adapter.recommend.viewholder;

import android.content.Context;
import androidx.annotation.k0;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.g;
import com.max.hbcommon.base.adapter.l;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.adapter.recommend.binder.RecommendVHBParam;
import com.max.xiaoheihe.module.game.adapter.recommend.binder.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommentBigBrotherViewHolder.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public class a extends g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86303j = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d l3.c binding) {
        super(binding);
        f0.p(binding, "binding");
    }

    @Override // com.max.hbcommon.base.adapter.g
    public void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36172, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.f();
        com.max.heybox.hblog.g.f74531b.q("RecommentBigBrotherViewHolder, onViewRecycled Tag = " + h(Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.a.a())));
    }

    @Override // com.max.hbcommon.base.adapter.g, androidx.recyclerview.widget.RecyclerView.ViewHolder
    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36173, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return super.toString() + ", tag = " + h(Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.a.a()));
    }

    @Override // com.max.hbcommon.base.adapter.g
    public void u() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36170, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.u();
        Object objH = h(Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.a.a()));
        if (objH instanceof r) {
            ((r) objH).o();
        }
    }

    @Override // com.max.hbcommon.base.adapter.g
    @k0
    public void v(@dl.d Context context, @dl.d s<?> adapter, @dl.d s.e viewHolder, @e Object obj) {
        if (PatchProxy.proxy(new Object[]{context, adapter, viewHolder, obj}, this, changeQuickRedirect, false, 36169, new Class[]{Context.class, s.class, s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(viewHolder, "viewHolder");
        super.v(context, adapter, viewHolder, obj);
        viewHolder.itemView.setTag(obj);
        Object objH = viewHolder.h(Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.a.a()));
        if (objH != null && (objH instanceof r) && (obj instanceof GameRecommendBaseObj)) {
            ((r) objH).h(viewHolder, (GameRecommendBaseObj) obj);
        }
    }

    @Override // com.max.hbcommon.base.adapter.g
    public void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36171, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.w();
    }

    @Override // com.max.hbcommon.base.adapter.g
    @e
    public Pair<l, RecyclerView> x(@dl.d Context context, @dl.d s<?> adapter, @dl.d s.e viewHolder, @e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, viewHolder, obj}, this, changeQuickRedirect, false, 36168, new Class[]{Context.class, s.class, s.e.class, Object.class}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(viewHolder, "viewHolder");
        super.x(context, adapter, viewHolder, obj);
        if ((obj instanceof GameRecommendBaseObj) && (adapter instanceof u)) {
            GameRecommendBaseObj gameRecommendBaseObj = (GameRecommendBaseObj) obj;
            r rVarA = com.max.xiaoheihe.module.game.adapter.recommend.binder.s.f86251a.a(new RecommendVHBParam(context, (u) adapter), gameRecommendBaseObj.getType());
            if (rVarA != null) {
                rVarA.f(viewHolder, gameRecommendBaseObj);
            }
            viewHolder.n(Integer.valueOf(com.max.xiaoheihe.module.game.adapter.recommend.a.a()), rVarA);
            l lVarJ = rVarA != null ? rVarA.j() : null;
            RecyclerView recyclerViewK = rVarA != null ? rVarA.k() : null;
            if (lVarJ != null && recyclerViewK != null) {
                return new Pair<>(lVarJ, recyclerViewK);
            }
        }
        return null;
    }
}
