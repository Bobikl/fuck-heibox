package com.max.xiaoheihe.view.card;

import android.graphics.drawable.StateListDrawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HashtagCardCreator.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class e implements com.max.hbcommon.component.card.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95925a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    private final SpannableStringBuilder b(SpannableStringBuilder spannableStringBuilder, HashtagObj hashtagObj, CardParam<?> cardParam) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{spannableStringBuilder, hashtagObj, cardParam}, this, changeQuickRedirect, false, 49568, new Class[]{SpannableStringBuilder.class, HashtagObj.class, CardParam.class}, SpannableStringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableStringBuilder) patchProxyResultProxy.result;
        }
        String sub_title = hashtagObj.getSub_title();
        int iE1 = com.max.xiaoheihe.utils.d.e1(hashtagObj.getStart_color());
        int iE2 = com.max.xiaoheihe.utils.d.e1(hashtagObj.getEnd_color());
        int dimensionPixelSize = cardParam.c().getResources().getDimensionPixelSize(R.dimen.text_size_10);
        int color = cardParam.c().getResources().getColor(R.color.white);
        int iF = ViewUtils.f(cardParam.c(), 1.0f);
        spannableStringBuilder.append("  ").append((CharSequence) sub_title);
        spannableStringBuilder.setSpan(new com.max.hbcustomview.spans.b(new com.max.hbcustomview.f(sub_title, dimensionPixelSize, color, iE1, iE2, iF, ViewUtils.f(cardParam.c(), 2.0f), ViewUtils.f(cardParam.c(), 1.0f)), 0), spannableStringBuilder.length() - sub_title.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.max.hbcommon.component.card.a
    @dl.d
    public View a(@dl.d ViewGroup containerView, int i10, @dl.d CardParam<?> param) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerView, new Integer(i10), param}, this, changeQuickRedirect, false, 49567, new Class[]{ViewGroup.class, Integer.TYPE, CardParam.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(containerView, "containerView");
        f0.p(param, "param");
        Object obj = param.d().get(i10);
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.bbs.HashtagObj");
        HashtagObj hashtagObj = (HashtagObj) obj;
        View viewInflate = LayoutInflater.from(param.c()).inflate(R.layout.item_hashtag, containerView, false);
        f0.o(viewInflate, "from(param.context).infl…ag, containerView, false)");
        float fH0 = ViewUtils.h0(param.c(), ViewUtils.m(param.c(), ViewUtils.f(param.c(), 30.0f), ViewUtils.f(param.c(), 30.0f)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, q.o(param.c(), R.color.background_card_1_color, fH0));
        stateListDrawable.addState(new int[0], q.o(param.c(), R.color.divider_secondary_1_color, fH0));
        viewInflate.setBackground(stateListDrawable);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
        textView.setTextColor(param.k());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder('#' + hashtagObj.getName() + '#');
        if (!com.max.hbcommon.utils.c.u(hashtagObj.getSub_title())) {
            spannableStringBuilder = b(spannableStringBuilder, hashtagObj, param);
        }
        textView.setTextSize(1, 12.0f);
        textView.setText(spannableStringBuilder);
        textView.setIncludeFontPadding(false);
        int iF = ViewUtils.f(textView.getContext(), 7.0f);
        int iF2 = ViewUtils.f(textView.getContext(), 12.0f);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = iF2;
        marginLayoutParams.rightMargin = iF2;
        marginLayoutParams.topMargin = iF;
        marginLayoutParams.bottomMargin = iF;
        textView.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.leftMargin = param.f();
        if (i10 == param.d().size() - 1 && param.e() == CardParam.DISPLAY_MODE.INF) {
            marginLayoutParams2.rightMargin = param.f();
        }
        viewInflate.setLayoutParams(marginLayoutParams2);
        viewInflate.setTag(hashtagObj.getName());
        viewInflate.setOnClickListener(param.h());
        return viewInflate;
    }
}
