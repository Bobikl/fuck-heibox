package com.max.hbcommon.component;

import android.content.Context;
import android.view.View;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FilterButtonView.kt */
/* JADX INFO: loaded from: classes9.dex */
@n9.a({com.max.component.g.class})
public final class f implements com.max.component.g {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.f31319j7, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(context, "context");
        FilterButtonView filterButtonView = new FilterButtonView(context);
        filterButtonView.setText("按钮");
        filterButtonView.setImage(R.drawable.common_filter_filled_24x24);
        return filterButtonView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/28/45dd8ea382491962c209e89e1bf91042.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        return "FilterButtonView";
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return com.max.component.b.f65478e;
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "FilterButtonView";
    }
}
