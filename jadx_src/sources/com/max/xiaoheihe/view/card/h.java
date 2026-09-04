package com.max.xiaoheihe.view.card;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.card.CardParam;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.view.richtext.RichViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RichTextLabelCreator.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class h implements com.max.hbcommon.component.card.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f95928a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.component.card.a
    @dl.d
    public View a(@dl.d ViewGroup containerView, int i10, @dl.d CardParam<?> param) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{containerView, new Integer(i10), param}, this, changeQuickRedirect, false, 49571, new Class[]{ViewGroup.class, Integer.TYPE, CardParam.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(containerView, "containerView");
        f0.p(param, "param");
        Object obj = param.d().get(i10);
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.rich.RichAttributeModelObj");
        RichViewGroup richViewGroup = new RichViewGroup(param.c());
        RichViewGroup.setRichText$default(richViewGroup, (RichAttributeModelObj) obj, false, 2, null);
        return richViewGroup;
    }
}
