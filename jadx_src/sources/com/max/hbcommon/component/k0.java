package com.max.hbcommon.component;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MoreButton.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class k0 implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31371ld, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        MoreButton moreButton = new MoreButton(context);
        moreButton.setArrowVisible(true);
        moreButton.setText("更多");
        return moreButton;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/bbs/2022/11/14/4ba2ccb36ea86f603e3548bf582597a0.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31348kd, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strF = kotlin.jvm.internal.n0.d(MoreButton.class).F();
        return strF == null ? "javaClass" : strF;
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return "common";
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "MoreButton";
    }
}
