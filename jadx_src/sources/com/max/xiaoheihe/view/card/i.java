package com.max.xiaoheihe.view.card;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcassette.bean.CassetteTagObj;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SaleTagCardCreator.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class i implements com.max.hbcommon.component.card.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95929a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.component.card.a
    @dl.d
    public View a(@dl.d ViewGroup containerView, int i10, @dl.d CardParam<?> param) {
        int iE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerView, new Integer(i10), param}, this, changeQuickRedirect, false, 49572, new Class[]{ViewGroup.class, Integer.TYPE, CardParam.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(containerView, "containerView");
        f0.p(param, "param");
        Object obj = param.d().get(i10);
        f0.n(obj, "null cannot be cast to non-null type com.max.hbcassette.bean.CassetteTagObj");
        CassetteTagObj cassetteTagObj = (CassetteTagObj) obj;
        TextView textView = new TextView(param.c());
        String color = cassetteTagObj.getColor();
        if (color == null || color.length() == 0) {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
            iE = com.max.xiaoheihe.utils.d.E(R.color.border_color_1);
        } else {
            textView.setTextColor(com.max.xiaoheihe.utils.d.e1(cassetteTagObj.getColor()));
            iE = com.max.xiaoheihe.utils.d.e1(cassetteTagObj.getColor());
        }
        textView.setBackgroundDrawable(q.O(q.o(param.c(), R.color.transparent, 2.0f), param.c(), iE, 0.5f));
        textView.setGravity(17);
        textView.setText(cassetteTagObj.getValue());
        textView.setTextSize(1, 10.0f);
        textView.setPadding(ViewUtils.f(param.c(), 4.0f), 0, ViewUtils.f(param.c(), 4.0f), 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ViewUtils.f(param.c(), 16.0f));
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        if (i10 != 0) {
            layoutParams.leftMargin = param.f();
        }
        textView.setTag(cassetteTagObj);
        return textView;
    }
}
