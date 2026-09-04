package com.max.xiaoheihe.module.game.adapter.recommend.viewholder;

import android.content.Context;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.g;
import com.max.hbcommon.base.adapter.l;
import com.max.hbcommon.base.adapter.s;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.RecommendGameListItemObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.module.game.adapter.recommend.binder.v;
import com.max.xiaoheihe.module.game.component.VerGameCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.c10;
import dl.e;
import kotlin.Pair;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VerGameCardBBViewHolder.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class c extends g {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f86342n = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final Context f86343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final v f86344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final GameRecommendBaseObj f86345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private c10 f86346m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d Context context, @dl.d v vhb, @dl.d GameRecommendBaseObj data, @dl.d c10 binding) {
        super(binding);
        f0.p(context, "context");
        f0.p(vhb, "vhb");
        f0.p(data, "data");
        f0.p(binding, "binding");
        this.f86343j = context;
        this.f86344k = vhb;
        this.f86345l = data;
        this.f86346m = binding;
    }

    @dl.d
    public final c10 B() {
        return this.f86346m;
    }

    @dl.d
    public final Context C() {
        return this.f86343j;
    }

    @dl.d
    public final GameRecommendBaseObj D() {
        return this.f86345l;
    }

    @dl.d
    public final v E() {
        return this.f86344k;
    }

    public final void F(@dl.d c10 c10Var) {
        if (PatchProxy.proxy(new Object[]{c10Var}, this, changeQuickRedirect, false, 36204, new Class[]{c10.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(c10Var, "<set-?>");
        this.f86346m = c10Var;
    }

    @Override // com.max.hbcommon.base.adapter.g
    @e
    public Pair<l, RecyclerView> x(@dl.d Context context, @dl.d s<?> adapter, @dl.d s.e viewHolder, @e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, viewHolder, obj}, this, changeQuickRedirect, false, 36205, new Class[]{Context.class, s.class, s.e.class, Object.class}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(viewHolder, "viewHolder");
        super.x(context, adapter, viewHolder, obj);
        if (obj instanceof GameCardObj) {
            GameCardObj gameCardObj = (GameCardObj) obj;
            VerGameCardView ver_game_card = (VerGameCardView) viewHolder.i(R.id.ver_game_card);
            if (ver_game_card != null) {
                f0.o(ver_game_card, "ver_game_card");
                new d(context).onViewBind(ver_game_card, obj);
                v vVar = this.f86344k;
                GameRecommendBaseObj gameRecommendBaseObj = this.f86345l;
                RecommendGameListItemObj game = gameCardObj.getGame();
                String appid = game != null ? game.getAppid() : null;
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                RecommendGameListItemObj game2 = gameCardObj.getGame();
                vVar.s(ver_game_card, gameRecommendBaseObj, appid, bindingAdapterPosition, game2 != null ? game2.getGame_name() : null);
            }
        }
        return null;
    }
}
