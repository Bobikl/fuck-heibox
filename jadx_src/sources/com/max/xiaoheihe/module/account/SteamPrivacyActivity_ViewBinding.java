package com.max.xiaoheihe.module.account;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class SteamPrivacyActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SteamPrivacyActivity f78466b;

    @i1
    public SteamPrivacyActivity_ViewBinding(SteamPrivacyActivity steamPrivacyActivity) {
        this(steamPrivacyActivity, steamPrivacyActivity.getWindow().getDecorView());
    }

    @i1
    public SteamPrivacyActivity_ViewBinding(SteamPrivacyActivity steamPrivacyActivity, View view) {
        this.f78466b = steamPrivacyActivity;
        steamPrivacyActivity.tv_refresh = (TextView) butterknife.internal.f.f(view, R.id.tv_refresh, "field 'tv_refresh'", TextView.class);
        steamPrivacyActivity.iv_img = (ImageView) butterknife.internal.f.f(view, R.id.iv_img, "field 'iv_img'", ImageView.class);
        steamPrivacyActivity.tv_personal_state = (TextView) butterknife.internal.f.f(view, R.id.tv_personal_state, "field 'tv_personal_state'", TextView.class);
        steamPrivacyActivity.tv_inventory_state = (TextView) butterknife.internal.f.f(view, R.id.tv_inventory_state, "field 'tv_inventory_state'", TextView.class);
        steamPrivacyActivity.vg_open_oversea = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_open_oversea, "field 'vg_open_oversea'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24317, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamPrivacyActivity steamPrivacyActivity = this.f78466b;
        if (steamPrivacyActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f78466b = null;
        steamPrivacyActivity.tv_refresh = null;
        steamPrivacyActivity.iv_img = null;
        steamPrivacyActivity.tv_personal_state = null;
        steamPrivacyActivity.tv_inventory_state = null;
        steamPrivacyActivity.vg_open_oversea = null;
    }
}
