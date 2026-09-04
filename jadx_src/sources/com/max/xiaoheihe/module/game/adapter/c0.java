package com.max.xiaoheihe.module.game.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.component.RecommendGameView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: HorRecommendGameAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class c0 extends com.max.hbcommon.base.adapter.s<GameObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f85657c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f85658b;

    /* JADX INFO: compiled from: HorRecommendGameAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameObj f85659b;

        a(GameObj gameObj) {
            this.f85659b = gameObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35680, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.k.o();
            com.max.hbcommon.utils.k.f(this.f85659b.getReport_id(), UiKitSpanObj.TYPE_CLICK, this.f85659b.getCustom_index(), this.f85659b.getCustom_suggested_from());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@dl.d Context mContext, @dl.d List<GameObj> list) {
        super(mContext, list, R.layout.item_hor_recommend_game);
        kotlin.jvm.internal.f0.p(mContext, "mContext");
        kotlin.jvm.internal.f0.p(list, "list");
        this.f85658b = mContext;
    }

    @dl.d
    public final Context m() {
        return this.f85658b;
    }

    public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e GameObj gameObj) {
        View vg_game_price;
        if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 35678, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported || gameObj == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = null;
        RecommendGameView recommendGameView = eVar != null ? (RecommendGameView) eVar.i(R.id.rgv) : null;
        a aVar = new a(gameObj);
        if (recommendGameView != null) {
            RecommendGameView.e(recommendGameView, gameObj, ViewUtils.f(this.f85658b, 71.0f), aVar, false, 8, null);
        }
        CardView cv_img = recommendGameView != null ? recommendGameView.getCv_img() : null;
        if (cv_img != null) {
            cv_img.setRadius(ViewUtils.f(this.f85658b, 3.0f));
        }
        View view = eVar != null ? eVar.itemView : null;
        if (view != null) {
            view.setTag(gameObj);
        }
        if (recommendGameView != null && (vg_game_price = recommendGameView.getVg_game_price()) != null) {
            layoutParams = vg_game_price.getLayoutParams();
        }
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 35679, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, gameObj);
    }
}
