package com.max.xiaoheihe.view.card;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TopicCardCreator.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class j implements com.max.hbcommon.component.card.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95930a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.component.card.a
    @dl.d
    public View a(@dl.d ViewGroup containerView, int i10, @dl.d CardParam<?> param) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerView, new Integer(i10), param}, this, changeQuickRedirect, false, 49573, new Class[]{ViewGroup.class, Integer.TYPE, CardParam.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(containerView, "containerView");
        f0.p(param, "param");
        Object obj = param.d().get(i10);
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.BBSTopicObj");
        BBSTopicObj bBSTopicObj = (BBSTopicObj) obj;
        View viewInflate = LayoutInflater.from(param.c()).inflate(R.layout.item_topic_card, containerView, false);
        f0.o(viewInflate, "from(param.context)\n    …rd, containerView, false)");
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        viewInflate.setBackground(androidx.core.content.res.i.g(param.c().getResources(), R.drawable.btn_divider_concept_2dp, null));
        textView.setTextColor(param.k());
        textView.setText(bBSTopicObj.getName());
        textView.setTextSize(1, 12.0f);
        if (bBSTopicObj.getPic_url() != null) {
            imageView.setVisibility(0);
            com.max.hbimage.b.d0(bBSTopicObj.getPic_url(), imageView, ViewUtils.f(param.c(), 1.0f));
        } else {
            imageView.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = marginLayoutParams.rightMargin;
        textView.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.leftMargin = param.f();
        if (i10 == param.d().size() - 1 && param.e() == CardParam.DISPLAY_MODE.INF) {
            marginLayoutParams2.rightMargin = param.f();
        }
        viewInflate.setLayoutParams(marginLayoutParams2);
        viewInflate.setTag(bBSTopicObj.getTopic_id());
        viewInflate.setOnClickListener(param.h());
        return viewInflate;
    }
}
