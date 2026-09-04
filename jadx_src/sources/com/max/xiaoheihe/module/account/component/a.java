package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import com.max.component.g;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AvatarView.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
@n9.a({g.class})
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f78901a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 24839, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        AvatarView avatarView = new AvatarView(context);
        avatarView.setLayoutParams(new ViewGroup.LayoutParams(120, 120));
        avatarView.setAvatar("https://imgheybox.max-c.com/heybox/avatar/steamcommunity/public/images/2022/07/14/623045dac3bcc49a69a54d1d167a295c.jpg");
        AvatarDecorationObj avatarDecorationObj = new AvatarDecorationObj();
        avatarDecorationObj.setSrc_url("https://imgheybox.max-c.com/oa/2024/08/19/02e11b983bbd0fdcd5d9db03989ad713.gif");
        avatarView.setDecoration(avatarDecorationObj);
        return avatarView;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/7a08bf409a58a52999abc3b7f83e1fb5.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        return "AvatarView";
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return "common";
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "AvatarView";
    }
}
