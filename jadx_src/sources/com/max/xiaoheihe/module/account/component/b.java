package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import com.max.component.g;
import com.max.xiaoheihe.accelworld.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FollowButton.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
@n9.a({g.class})
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f78902a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @dl.d
    public View a(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 24852, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        FollowButton followButton = new FollowButton(context);
        followButton.setFollowState(FollowButton.FollowState.Follow);
        followButton.setLayoutParams(new ViewGroup.LayoutParams(l.c(80.0f, context), l.c(30.0f, context)));
        return followButton;
    }

    @Override // com.max.component.g
    @dl.e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/628b772b32b4f6961bf86e7aabc57d9d.png";
    }

    @Override // com.max.component.g
    @dl.d
    public String c() {
        return "FollowButton";
    }

    @Override // com.max.component.g
    @dl.d
    public String d() {
        return "bbs";
    }

    @Override // com.max.component.g
    @dl.d
    public String e() {
        return "FollowButton";
    }
}
