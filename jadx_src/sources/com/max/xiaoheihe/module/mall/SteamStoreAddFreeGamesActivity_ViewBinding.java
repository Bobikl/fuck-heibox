package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class SteamStoreAddFreeGamesActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SteamStoreAddFreeGamesActivity f89905b;

    @i1
    public SteamStoreAddFreeGamesActivity_ViewBinding(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity) {
        this(steamStoreAddFreeGamesActivity, steamStoreAddFreeGamesActivity.getWindow().getDecorView());
    }

    @i1
    public SteamStoreAddFreeGamesActivity_ViewBinding(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity, View view) {
        this.f89905b = steamStoreAddFreeGamesActivity;
        steamStoreAddFreeGamesActivity.mStatusTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_status, "field 'mStatusTextView'", TextView.class);
        steamStoreAddFreeGamesActivity.mProgressView = butterknife.internal.f.e(view, R.id.progress, "field 'mProgressView'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41041, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity = this.f89905b;
        if (steamStoreAddFreeGamesActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89905b = null;
        steamStoreAddFreeGamesActivity.mStatusTextView = null;
        steamStoreAddFreeGamesActivity.mProgressView = null;
    }
}
