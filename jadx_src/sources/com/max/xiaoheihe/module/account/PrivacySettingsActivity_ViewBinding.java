package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.i1;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class PrivacySettingsActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PrivacySettingsActivity f78234b;

    @i1
    public PrivacySettingsActivity_ViewBinding(PrivacySettingsActivity privacySettingsActivity) {
        this(privacySettingsActivity, privacySettingsActivity.getWindow().getDecorView());
    }

    @i1
    public PrivacySettingsActivity_ViewBinding(PrivacySettingsActivity privacySettingsActivity, View view) {
        this.f78234b = privacySettingsActivity;
        privacySettingsActivity.vgUserRelations = (RelativeLayout) butterknife.internal.f.f(view, R.id.vg_user_relations, "field 'vgUserRelations'", RelativeLayout.class);
        privacySettingsActivity.vgMomentsPrivacy = (SettingItemView) butterknife.internal.f.f(view, R.id.vg_moments_privacy, "field 'vgMomentsPrivacy'", SettingItemView.class);
        privacySettingsActivity.vgBans = (RelativeLayout) butterknife.internal.f.f(view, R.id.vg_bans, "field 'vgBans'", RelativeLayout.class);
        privacySettingsActivity.siv_recommend = (SettingItemView) butterknife.internal.f.f(view, R.id.siv_recommend, "field 'siv_recommend'", SettingItemView.class);
        privacySettingsActivity.siv_online_state = (SettingItemView) butterknife.internal.f.f(view, R.id.siv_online_state, "field 'siv_online_state'", SettingItemView.class);
        privacySettingsActivity.siv_show_game = (SettingItemView) butterknife.internal.f.f(view, R.id.siv_show_game, "field 'siv_show_game'", SettingItemView.class);
        privacySettingsActivity.siv_show_music = (SettingItemView) butterknife.internal.f.f(view, R.id.siv_show_music, "field 'siv_show_music'", SettingItemView.class);
        privacySettingsActivity.vg_online_settings = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_online_settings, "field 'vg_online_settings'", ViewGroup.class);
        privacySettingsActivity.onlineSettingCard = (CardView) butterknife.internal.f.f(view, R.id.online_settings_card, "field 'onlineSettingCard'", CardView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23836, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PrivacySettingsActivity privacySettingsActivity = this.f78234b;
        if (privacySettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78234b = null;
        privacySettingsActivity.vgUserRelations = null;
        privacySettingsActivity.vgMomentsPrivacy = null;
        privacySettingsActivity.vgBans = null;
        privacySettingsActivity.siv_recommend = null;
        privacySettingsActivity.siv_online_state = null;
        privacySettingsActivity.siv_show_game = null;
        privacySettingsActivity.siv_show_music = null;
        privacySettingsActivity.vg_online_settings = null;
        privacySettingsActivity.onlineSettingCard = null;
    }
}
