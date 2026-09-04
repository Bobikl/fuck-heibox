package com.max.xiaoheihe.module.game.adapter.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.g;
import com.max.hbcommon.base.adapter.l;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.aw;
import df.bw;
import df.ce;
import df.de;
import df.i00;
import df.lw;
import df.mw;
import df.nw;
import df.ow;
import df.pq;
import df.pw;
import df.rv;
import df.s3;
import df.sp;
import df.tm;
import df.tv;
import df.um;
import df.uq;
import df.va0;
import df.vq;
import df.wv;
import df.yv;
import df.zv;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameRecommendBBAdapterDelegate.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b implements com.max.hbcommon.base.adapter.e<GameRecommendBaseObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f85991d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private Map<String, Integer> f85993c;

    public b(@dl.d Context mContext) {
        f0.p(mContext, "mContext");
        this.f85992b = mContext;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f85993c = linkedHashMap;
        linkedHashMap.putAll(s0.W(c1.a("mini_app", 1), c1.a("mini_app_v2", 25), c1.a(GameRecommendAdapter.f85963m, 2), c1.a(GameRecommendAdapter.f85964n, 26), c1.a(GameRecommendAdapter.f85971u, 3), c1.a(GameRecommendAdapter.f85969s, 4), c1.a(GameRecommendAdapter.f85976z, 5), c1.a(GameRecommendAdapter.f85965o, 6), c1.a("title", 8), c1.a("header", 9), c1.a(GameRecommendAdapter.f85959i, 10), c1.a(GameRecommendAdapter.A, 11), c1.a(GameRecommendAdapter.B, 12), c1.a("space", 13), c1.a(GameRecommendAdapter.f85958h, 14), c1.a(GameRecommendAdapter.f85968r, 16), c1.a(GameRecommendAdapter.f85972v, 17), c1.a("big_game_card", 18), c1.a("game_comment", 19), c1.a(GameRecommendAdapter.f85973w, 20), c1.a(GameRecommendAdapter.f85974x, 21), c1.a(GameRecommendAdapter.D, 22), c1.a("middle_game_card", 23), c1.a(GameRecommendAdapter.E, 24)));
    }

    @dl.e
    public Integer a(@dl.d GameRecommendBaseObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{data}, this, changeQuickRedirect, false, 35896, new Class[]{GameRecommendBaseObj.class}, Integer.class);
        if (patchProxyResultProxy.isSupported) {
            return (Integer) patchProxyResultProxy.result;
        }
        f0.p(data, "data");
        return this.f85993c.get(data.getType());
    }

    @dl.d
    public final Context b() {
        return this.f85992b;
    }

    @Override // com.max.hbcommon.base.adapter.e
    public void c(@dl.d g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 35897, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.base.adapter.e.a.b(this, gVar);
    }

    @dl.d
    public final Map<String, Integer> d() {
        return this.f85993c;
    }

    @Override // com.max.hbcommon.base.adapter.e
    public /* bridge */ /* synthetic */ Integer e(GameRecommendBaseObj gameRecommendBaseObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameRecommendBaseObj}, this, changeQuickRedirect, false, 35901, new Class[]{Object.class}, Integer.class);
        return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : a(gameRecommendBaseObj);
    }

    @dl.e
    public Pair<l, RecyclerView> f(@dl.d g viewHolder, @dl.d s<?> adapter, @dl.d GameRecommendBaseObj data) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewHolder, adapter, data}, this, changeQuickRedirect, false, 35895, new Class[]{g.class, s.class, GameRecommendBaseObj.class}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(adapter, "adapter");
        f0.p(data, "data");
        return viewHolder.x(this.f85992b, adapter, viewHolder, data);
    }

    public void g(@dl.d g viewHolder, @dl.d s<?> adapter, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, adapter, data}, this, changeQuickRedirect, false, 35894, new Class[]{g.class, s.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(adapter, "adapter");
        f0.p(data, "data");
        com.max.heybox.hblog.g.f74531b.q("GameRecommendBBAdapterDelegate, hasPreBind = " + viewHolder.s());
        viewHolder.v(this.f85992b, adapter, viewHolder, data);
    }

    @Override // com.max.hbcommon.base.adapter.e
    public /* bridge */ /* synthetic */ void h(g gVar, s sVar, GameRecommendBaseObj gameRecommendBaseObj) {
        if (PatchProxy.proxy(new Object[]{gVar, sVar, gameRecommendBaseObj}, this, changeQuickRedirect, false, 35899, new Class[]{g.class, s.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        g(gVar, sVar, gameRecommendBaseObj);
    }

    @Override // com.max.hbcommon.base.adapter.e
    @dl.e
    public g i(@dl.d ViewGroup parent, int i10) {
        l3.c cVarD;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 35893, new Class[]{ViewGroup.class, Integer.TYPE}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        f0.p(parent, "parent");
        if (this.f85993c.isEmpty()) {
            return null;
        }
        switch (i10) {
            case 1:
                cVarD = uq.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 2:
            case 26:
                cVarD = tm.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 3:
                cVarD = pw.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 4:
                cVarD = de.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 5:
                cVarD = tv.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 6:
                cVarD = s3.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 7:
                cVarD = zv.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 8:
                cVarD = sp.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 9:
                cVarD = i00.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 10:
                cVarD = ow.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 11:
                cVarD = mw.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 12:
                cVarD = yv.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 13:
                cVarD = va0.c(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 14:
                cVarD = pq.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 15:
            default:
                cVarD = null;
                break;
            case 16:
                cVarD = lw.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 17:
                cVarD = nw.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 18:
                cVarD = ce.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 19:
                cVarD = rv.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 20:
            case 21:
                cVarD = wv.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 22:
                cVarD = um.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 23:
                cVarD = aw.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 24:
                cVarD = bw.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
            case 25:
                cVarD = vq.d(LayoutInflater.from(this.f85992b), parent, false);
                break;
        }
        com.max.heybox.hblog.g.f74531b.q("GameRecommendBBAdapterDelegate, onCreateBBViewHolder, viewTypeMask = " + i10 + ", binding = " + cVarD);
        if (cVarD != null) {
            return new com.max.xiaoheihe.module.game.adapter.recommend.viewholder.a(cVarD);
        }
        return null;
    }

    @Override // com.max.hbcommon.base.adapter.e
    public /* bridge */ /* synthetic */ Pair j(g gVar, s sVar, GameRecommendBaseObj gameRecommendBaseObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, sVar, gameRecommendBaseObj}, this, changeQuickRedirect, false, 35900, new Class[]{g.class, s.class, Object.class}, Pair.class);
        return patchProxyResultProxy.isSupported ? (Pair) patchProxyResultProxy.result : f(gVar, sVar, gameRecommendBaseObj);
    }

    public final void k(@dl.d Map<String, Integer> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 35892, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(map, "<set-?>");
        this.f85993c = map;
    }

    @Override // com.max.hbcommon.base.adapter.e
    public void l(@dl.d g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 35898, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.base.adapter.e.a.c(this, gVar);
    }
}
