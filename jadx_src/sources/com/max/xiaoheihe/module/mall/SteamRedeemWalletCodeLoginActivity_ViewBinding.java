package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class SteamRedeemWalletCodeLoginActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SteamRedeemWalletCodeLoginActivity f89883b;

    @i1
    public SteamRedeemWalletCodeLoginActivity_ViewBinding(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity) {
        this(steamRedeemWalletCodeLoginActivity, steamRedeemWalletCodeLoginActivity.getWindow().getDecorView());
    }

    @i1
    public SteamRedeemWalletCodeLoginActivity_ViewBinding(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity, View view) {
        this.f89883b = steamRedeemWalletCodeLoginActivity;
        steamRedeemWalletCodeLoginActivity.mStatusTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_status, "field 'mStatusTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41002, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity = this.f89883b;
        if (steamRedeemWalletCodeLoginActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89883b = null;
        steamRedeemWalletCodeLoginActivity.mStatusTextView = null;
    }
}
