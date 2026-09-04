package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class EpicAddFreeGamesActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EpicAddFreeGamesActivity f89448b;

    @i1
    public EpicAddFreeGamesActivity_ViewBinding(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        this(epicAddFreeGamesActivity, epicAddFreeGamesActivity.getWindow().getDecorView());
    }

    @i1
    public EpicAddFreeGamesActivity_ViewBinding(EpicAddFreeGamesActivity epicAddFreeGamesActivity, View view) {
        this.f89448b = epicAddFreeGamesActivity;
        epicAddFreeGamesActivity.mStatusTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_status, "field 'mStatusTextView'", TextView.class);
        epicAddFreeGamesActivity.mProgressView = butterknife.internal.f.e(view, R.id.progress, "field 'mProgressView'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39864, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EpicAddFreeGamesActivity epicAddFreeGamesActivity = this.f89448b;
        if (epicAddFreeGamesActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89448b = null;
        epicAddFreeGamesActivity.mStatusTextView = null;
        epicAddFreeGamesActivity.mProgressView = null;
    }
}
