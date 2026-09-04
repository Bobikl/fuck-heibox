package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class SteamStoreRedeemWalletCodeActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SteamStoreRedeemWalletCodeActivity f89946b;

    @i1
    public SteamStoreRedeemWalletCodeActivity_ViewBinding(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity) {
        this(steamStoreRedeemWalletCodeActivity, steamStoreRedeemWalletCodeActivity.getWindow().getDecorView());
    }

    @i1
    public SteamStoreRedeemWalletCodeActivity_ViewBinding(SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity, View view) {
        this.f89946b = steamStoreRedeemWalletCodeActivity;
        steamStoreRedeemWalletCodeActivity.mStatusTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_status, "field 'mStatusTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41122, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamStoreRedeemWalletCodeActivity steamStoreRedeemWalletCodeActivity = this.f89946b;
        if (steamStoreRedeemWalletCodeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89946b = null;
        steamStoreRedeemWalletCodeActivity.mStatusTextView = null;
    }
}
