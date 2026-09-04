package com.max.xiaoheihe.module.chat;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.i;
import androidx.annotation.i1;
import butterknife.Unbinder;
import butterknife.internal.f;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class IMFriendSettingActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IMFriendSettingActivity f83526b;

    @i1
    public IMFriendSettingActivity_ViewBinding(IMFriendSettingActivity iMFriendSettingActivity) {
        this(iMFriendSettingActivity, iMFriendSettingActivity.getWindow().getDecorView());
    }

    @i1
    public IMFriendSettingActivity_ViewBinding(IMFriendSettingActivity iMFriendSettingActivity, View view) {
        this.f83526b = iMFriendSettingActivity;
        iMFriendSettingActivity.siv = (SettingItemView) f.f(view, R.id.siv, "field 'siv'", SettingItemView.class);
        iMFriendSettingActivity.rl_userinfo = (RelativeLayout) f.f(view, R.id.rl_userinfo, "field 'rl_userinfo'", RelativeLayout.class);
        iMFriendSettingActivity.avatarView = (HeyBoxAvatarView) f.f(view, R.id.avatar, "field 'avatarView'", HeyBoxAvatarView.class);
        iMFriendSettingActivity.tv_name = (TextView) f.f(view, R.id.tv_name, "field 'tv_name'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31396, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        IMFriendSettingActivity iMFriendSettingActivity = this.f83526b;
        if (iMFriendSettingActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f83526b = null;
        iMFriendSettingActivity.siv = null;
        iMFriendSettingActivity.rl_userinfo = null;
        iMFriendSettingActivity.avatarView = null;
        iMFriendSettingActivity.tv_name = null;
    }
}
