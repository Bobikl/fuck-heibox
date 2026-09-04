package com.max.xiaoheihe.view.card;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.card.CardParam;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WikiCardCreator.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class k implements com.max.hbcommon.component.card.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95931a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.component.card.a
    @dl.d
    public View a(@dl.d ViewGroup containerView, int i10, @dl.d CardParam<?> param) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerView, new Integer(i10), param}, this, changeQuickRedirect, false, 49574, new Class[]{ViewGroup.class, Integer.TYPE, CardParam.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(containerView, "containerView");
        f0.p(param, "param");
        Object obj = param.d().get(i10);
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.WikiArticelObj");
        WikiArticelObj wikiArticelObj = (WikiArticelObj) obj;
        View viewInflate = LayoutInflater.from(param.c()).inflate(R.layout.item_hashtag, containerView, false);
        f0.o(viewInflate, "from(param.context)\n    …ag, containerView, false)");
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
        viewInflate.setBackgroundColor(param.c().getResources().getColor(R.color.divider_secondary_1_color));
        textView.setTextColor(param.k());
        textView.setText(wikiArticelObj.getArticle_name());
        textView.setTextSize(12.0f);
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
        viewInflate.setTag(wikiArticelObj);
        viewInflate.setOnClickListener(param.h());
        return viewInflate;
    }
}
