package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.View;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.TitleObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TitleVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class u extends r {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86255h = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86256g;

    /* JADX INFO: compiled from: TitleVHB.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameRecommendBaseObj f86257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f86258c;

        a(GameRecommendBaseObj gameRecommendBaseObj, Context context) {
            this.f86257b = gameRecommendBaseObj;
            this.f86258c = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36158, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.l.f66572a.l(((TitleObj) this.f86257b).getReport_path() + lb.d.f131256t2, ((TitleObj) this.f86257b).getReport_additional());
            com.max.xiaoheihe.base.router.b.k0(this.f86258c, ((TitleObj) this.f86257b).getProt());
        }
    }

    public u(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86256g = param;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36157, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        if (data instanceof TitleObj) {
            Context contextB = this.f86256g.b();
            ListSectionHeader listSectionHeader = (ListSectionHeader) viewHolder.i(R.id.lsh_title);
            TitleObj titleObj = (TitleObj) data;
            listSectionHeader.setTitleText(titleObj.getName());
            listSectionHeader.setDescText(titleObj.getDesc());
            listSectionHeader.setMoreColor(this.f86256g.b().getResources().getColor(R.color.text_primary_1_color));
            String prot = titleObj.getProt();
            if (prot == null || prot.length() == 0) {
                listSectionHeader.setMoreButtonVisible(false);
            } else {
                listSectionHeader.setMoreButtonVisible(true);
                String more_button_text = titleObj.getMore_button_text();
                if (more_button_text == null) {
                    more_button_text = contextB.getResources().getString(R.string.more);
                    f0.o(more_button_text, "mContext.resources.getString(R.string.more)");
                }
                listSectionHeader.setMoreText(more_button_text);
                listSectionHeader.setMoreClickListener(new a(data, contextB));
            }
            if (com.max.hbcommon.utils.c.u(titleObj.getBg_color())) {
                listSectionHeader.setBackgroundResource(R.color.transparent);
            } else {
                listSectionHeader.setBackgroundColor(com.max.xiaoheihe.utils.d.H(contextB, titleObj.getBg_color()));
            }
            listSectionHeader.setBottomPaddingDp(ListSectionHeader.f67141f.a() + com.max.hbutils.utils.n.q(titleObj.getBottom()));
        }
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86256g;
    }

    public final void w(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36156, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86256g = recommendVHBParam;
    }
}
