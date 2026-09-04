package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.o;
import com.max.component.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserLevelView.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
@n9.a({g.class})
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f78905a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 24938, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        UserLevelView userLevelView = new UserLevelView(context);
        userLevelView.setLevel(24);
        return userLevelView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/dab4c5d7591a109e7065dc3c82c3ca1a.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        return "UserLevelView";
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return "user";
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "用户等级";
    }
}
