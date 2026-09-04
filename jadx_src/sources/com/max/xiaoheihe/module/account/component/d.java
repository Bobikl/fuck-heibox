package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.component.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SettingItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
@n9.a({g.class})
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f78904a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 24934, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        SettingItemView settingItemView = new SettingItemView(context);
        settingItemView.setTitle("标题");
        settingItemView.setTitleDesc("标题描述");
        settingItemView.setRightType(SettingItemView.Type.Arrow);
        settingItemView.setRightDesc("右侧描述");
        settingItemView.d(true);
        return settingItemView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/811d8338c2f5fcbdcf3c932ba57ae8e7.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        return "SettingItemView";
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return "common";
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "SettingItem";
    }
}
