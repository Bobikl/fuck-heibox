package com.max.hbcommon.component;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ListSectionHeader.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class f0 implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Uc, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        ListSectionHeader listSectionHeader = new ListSectionHeader(context);
        listSectionHeader.setTitleText("标题");
        listSectionHeader.setDescText("描述");
        listSectionHeader.setMoreButtonVisible(true);
        listSectionHeader.setMoreText("更多");
        listSectionHeader.setMoreTextVisible(true);
        return listSectionHeader;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/bbs/2022/11/14/f01984943d3af3cd2549baf622362266.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Tc, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strF = kotlin.jvm.internal.n0.d(ListSectionHeader.class).F();
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
        return "GroupBarTitle";
    }
}
