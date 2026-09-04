package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class SteamStoreLoginActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SteamStoreLoginActivity f89916b;

    @i1
    public SteamStoreLoginActivity_ViewBinding(SteamStoreLoginActivity steamStoreLoginActivity) {
        this(steamStoreLoginActivity, steamStoreLoginActivity.getWindow().getDecorView());
    }

    @i1
    public SteamStoreLoginActivity_ViewBinding(SteamStoreLoginActivity steamStoreLoginActivity, View view) {
        this.f89916b = steamStoreLoginActivity;
        steamStoreLoginActivity.mStatusTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_status, "field 'mStatusTextView'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41059, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamStoreLoginActivity steamStoreLoginActivity = this.f89916b;
        if (steamStoreLoginActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89916b = null;
        steamStoreLoginActivity.mStatusTextView = null;
    }
}
