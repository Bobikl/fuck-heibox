package com.max.xiaoheihe.view.card;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.bean.account.TaskAwardInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AwardCardCreator.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class a implements com.max.hbcommon.component.card.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95917a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.component.card.a
    @dl.d
    public View a(@dl.d ViewGroup containerView, int i10, @dl.d CardParam<?> param) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerView, new Integer(i10), param}, this, changeQuickRedirect, false, 49562, new Class[]{ViewGroup.class, Integer.TYPE, CardParam.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(containerView, "containerView");
        f0.p(param, "param");
        Object obj = param.d().get(i10);
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.account.TaskAwardInfo");
        TaskAwardInfo taskAwardInfo = (TaskAwardInfo) obj;
        ImageView imageView = new ImageView(param.c());
        TextView textView = new TextView(param.c());
        LinearLayout linearLayout = new LinearLayout(param.c());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = param.f();
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(param.k());
        textView.setText(taskAwardInfo.getDesc());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(ViewUtils.f(param.c(), 2.0f));
        layoutParams2.setMarginEnd(ViewUtils.f(param.c(), 3.0f));
        layoutParams2.gravity = 16;
        textView.setLayoutParams(layoutParams2);
        int iM = param.m();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewUtils.f(param.c(), 11.0f), ViewUtils.f(param.c(), 11.0f));
        layoutParams3.setMarginStart(ViewUtils.f(param.c(), 3.0f));
        layoutParams3.topMargin = iM;
        layoutParams3.bottomMargin = iM;
        layoutParams3.gravity = 16;
        com.max.hbimage.b.K(taskAwardInfo.getIcon(), imageView);
        imageView.setImageTintList(ColorStateList.valueOf(param.k()));
        imageView.setLayoutParams(layoutParams3);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        linearLayout.setBackground(q.o(param.c(), param.a(), ViewUtils.h0(param.c(), ViewUtils.m(param.c(), 0, 0))));
        return linearLayout;
    }
}
