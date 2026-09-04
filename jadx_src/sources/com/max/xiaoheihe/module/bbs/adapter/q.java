package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.PostRecommendItemObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostRecommendAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class q extends com.max.hbcommon.base.adapter.s<PostRecommendItemObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80613c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f80614b;

    /* JADX INFO: compiled from: PostRecommendAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostRecommendItemObj f80615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f80616c;

        a(PostRecommendItemObj postRecommendItemObj, q qVar) {
            this.f80615b = postRecommendItemObj;
            this.f80616c = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27445, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f80615b.getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f80616c.m(), this.f80615b.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@dl.d Context context, @dl.d List<PostRecommendItemObj> list) {
        super(context, list, R.layout.item_recommend_post);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f80614b = context;
    }

    @dl.d
    public final Context m() {
        return this.f80614b;
    }

    public void n(@dl.e com.max.hbcommon.base.adapter.s.e eVar, @dl.e PostRecommendItemObj postRecommendItemObj) {
        if (PatchProxy.proxy(new Object[]{eVar, postRecommendItemObj}, this, changeQuickRedirect, false, 27443, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PostRecommendItemObj.class}, Void.TYPE).isSupported || eVar == null || postRecommendItemObj == null) {
            return;
        }
        View viewI = eVar.i(R.id.iv_icon);
        f0.o(viewI, "viewHolder.getView(R.id.iv_icon)");
        View viewI2 = eVar.i(R.id.tv_desc);
        f0.o(viewI2, "viewHolder.getView(R.id.tv_desc)");
        View viewI3 = eVar.i(R.id.vg_botton);
        f0.o(viewI3, "viewHolder.getView(R.id.vg_botton)");
        View viewI4 = eVar.i(R.id.tv_botton);
        f0.o(viewI4, "viewHolder.getView(R.id.tv_botton)");
        View viewI5 = eVar.i(R.id.v_divider);
        f0.o(viewI5, "viewHolder.getView(R.id.v_divider)");
        com.max.hbimage.b.L(postRecommendItemObj.getThumb(), (ImageView) viewI, R.drawable.common_default_game_avatar_74x74);
        ((TextView) viewI2).setText(postRecommendItemObj.getTitle());
        ((TextView) viewI4).setText(postRecommendItemObj.getBotton_name());
        viewI3.setBackground(com.max.hbutils.utils.q.o(this.f80614b, R.color.divider_secondary_1_color, 2.0f));
        eVar.itemView.setOnClickListener(new a(postRecommendItemObj, this));
        viewI5.setVisibility(eVar.getAbsoluteAdapterPosition() == 0 ? 8 : 0);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PostRecommendItemObj postRecommendItemObj) {
        if (PatchProxy.proxy(new Object[]{eVar, postRecommendItemObj}, this, changeQuickRedirect, false, 27444, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, postRecommendItemObj);
    }
}
