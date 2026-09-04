package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class SteamStorePurchaseGameActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SteamStorePurchaseGameActivity f89928b;

    @i1
    public SteamStorePurchaseGameActivity_ViewBinding(SteamStorePurchaseGameActivity steamStorePurchaseGameActivity) {
        this(steamStorePurchaseGameActivity, steamStorePurchaseGameActivity.getWindow().getDecorView());
    }

    @i1
    public SteamStorePurchaseGameActivity_ViewBinding(SteamStorePurchaseGameActivity steamStorePurchaseGameActivity, View view) {
        this.f89928b = steamStorePurchaseGameActivity;
        steamStorePurchaseGameActivity.mStatusTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_status, "field 'mStatusTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41081, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamStorePurchaseGameActivity steamStorePurchaseGameActivity = this.f89928b;
        if (steamStorePurchaseGameActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89928b = null;
        steamStorePurchaseGameActivity.mStatusTextView = null;
    }
}
