package com.max.xiaoheihe.view.card;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.ConceptPostTagObj;
import com.max.xiaoheihe.module.bbs.HashtagDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConceptPostTagCreator.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class b implements com.max.hbcommon.component.card.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95918a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ConceptPostTagCreator.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f95919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ConceptPostTagObj f95920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CardParam<?> f95921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewGroup f95922e;

        a(boolean z10, ConceptPostTagObj conceptPostTagObj, CardParam<?> cardParam, ViewGroup viewGroup) {
            this.f95919b = z10;
            this.f95920c = conceptPostTagObj;
            this.f95921d = cardParam;
            this.f95922e = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49564, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f95919b) {
                BBSTopicObj bBSTopicObj = new BBSTopicObj();
                bBSTopicObj.setTopic_id(this.f95920c.getTopic_id());
                com.max.xiaoheihe.module.bbs.utils.b.H(this.f95921d.c(), bBSTopicObj);
            } else {
                if (com.max.hbcommon.utils.c.u(this.f95920c.getProtocol())) {
                    this.f95921d.c().startActivity(new Intent(HashtagDetailActivity.x2(this.f95921d.c(), this.f95920c.getName())));
                    return;
                }
                Context context = this.f95922e.getContext();
                f0.o(context, "containerView.context");
                com.max.xiaoheihe.base.router.b.k0(context, this.f95920c.getProtocol());
            }
        }
    }

    @Override // com.max.hbcommon.component.card.a
    @dl.d
    public View a(@dl.d ViewGroup containerView, int i10, @dl.d CardParam<?> param) {
        int iF;
        int iF2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerView, new Integer(i10), param}, this, changeQuickRedirect, false, 49563, new Class[]{ViewGroup.class, Integer.TYPE, CardParam.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(containerView, "containerView");
        f0.p(param, "param");
        Object obj = param.d().get(i10);
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.ConceptPostTagObj");
        ConceptPostTagObj conceptPostTagObj = (ConceptPostTagObj) obj;
        View viewInflate = LayoutInflater.from(param.c()).inflate(R.layout.item_link_hashtag, containerView, false);
        f0.o(viewInflate, "from(param.context)\n    …ag, containerView, false)");
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) viewInflate.findViewById(R.id.iv_pic);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_hot_tag);
        boolean zG = f0.g(conceptPostTagObj.getType(), "topic");
        textView.setText(conceptPostTagObj.getName());
        qMUIRadiusImageView.setCornerRadius(ViewUtils.p(BaseApplication.a(), qMUIRadiusImageView, ViewUtils.ViewType.IMAGE));
        int iO = ViewUtils.o(BaseApplication.a(), viewInflate);
        if (zG) {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            com.max.hbimage.b.L(conceptPostTagObj.getPic_url(), qMUIRadiusImageView, R.drawable.common_default_game_avatar_74x74);
            qMUIRadiusImageView.clearColorFilter();
            iF2 = ViewUtils.f(BaseApplication.a(), 6.0f);
            iF = ViewUtils.f(BaseApplication.a(), 16.0f);
            viewInflate.setBackground(ViewUtils.G(iO, com.max.xiaoheihe.utils.d.E(R.color.background_card_1_color)));
        } else {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            if (com.max.hbcommon.utils.c.u(conceptPostTagObj.getPic_url())) {
                qMUIRadiusImageView.setImageResource(R.drawable.bbs_topic_filled_24x24);
                qMUIRadiusImageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.click_blue));
            } else {
                qMUIRadiusImageView.clearColorFilter();
                com.max.hbimage.b.K(conceptPostTagObj.getPic_url(), qMUIRadiusImageView);
            }
            iF = ViewUtils.f(BaseApplication.a(), 12.0f);
            iF2 = ViewUtils.f(BaseApplication.a(), 3.0f);
            viewInflate.setBackground(ViewUtils.G(iO, com.max.xiaoheihe.utils.d.E(R.color.click_blue_alpha10)));
        }
        qMUIRadiusImageView.getLayoutParams().width = iF;
        qMUIRadiusImageView.getLayoutParams().height = iF;
        ViewGroup.LayoutParams layoutParams = qMUIRadiusImageView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(iF2);
        if (com.max.hbcommon.utils.c.u(conceptPostTagObj.getSub_title())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(conceptPostTagObj.getSub_title());
            textView2.setBackground(ViewUtils.w(ViewUtils.o(BaseApplication.a(), textView2), com.max.xiaoheihe.utils.d.e1(conceptPostTagObj.getStart_color()), com.max.xiaoheihe.utils.d.e1(conceptPostTagObj.getEnd_color()), GradientDrawable.Orientation.BL_TR));
        }
        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = param.f();
        textView.setTag(conceptPostTagObj);
        viewInflate.setOnClickListener(new a(zG, conceptPostTagObj, param, containerView));
        return viewInflate;
    }
}
