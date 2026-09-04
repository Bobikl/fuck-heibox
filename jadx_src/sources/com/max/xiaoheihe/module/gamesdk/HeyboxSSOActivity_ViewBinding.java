package com.max.xiaoheihe.module.gamesdk;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.i;
import androidx.annotation.i1;
import butterknife.Unbinder;
import butterknife.internal.f;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class HeyboxSSOActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HeyboxSSOActivity f88591b;

    @i1
    public HeyboxSSOActivity_ViewBinding(HeyboxSSOActivity heyboxSSOActivity) {
        this(heyboxSSOActivity, heyboxSSOActivity.getWindow().getDecorView());
    }

    @i1
    public HeyboxSSOActivity_ViewBinding(HeyboxSSOActivity heyboxSSOActivity, View view) {
        this.f88591b = heyboxSSOActivity;
        heyboxSSOActivity.tv_auth_btn = (TextView) f.f(view, R.id.tv_auth_btn, "field 'tv_auth_btn'", TextView.class);
        heyboxSSOActivity.tv_username = (TextView) f.f(view, R.id.tv_username, "field 'tv_username'", TextView.class);
        heyboxSSOActivity.iv_avartar = (ImageView) f.f(view, R.id.iv_avartar, "field 'iv_avartar'", ImageView.class);
        heyboxSSOActivity.iv_app_icon = (ImageView) f.f(view, R.id.iv_app_icon, "field 'iv_app_icon'", ImageView.class);
        heyboxSSOActivity.tv_app_name = (TextView) f.f(view, R.id.tv_app_name, "field 'tv_app_name'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38462, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HeyboxSSOActivity heyboxSSOActivity = this.f88591b;
        if (heyboxSSOActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88591b = null;
        heyboxSSOActivity.tv_auth_btn = null;
        heyboxSSOActivity.tv_username = null;
        heyboxSSOActivity.iv_avartar = null;
        heyboxSSOActivity.iv_app_icon = null;
        heyboxSSOActivity.tv_app_name = null;
    }
}
