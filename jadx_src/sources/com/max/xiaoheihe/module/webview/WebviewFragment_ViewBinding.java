package com.max.xiaoheihe.module.webview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.component.WebViewProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public class WebviewFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebviewFragment f94563b;

    @i1
    public WebviewFragment_ViewBinding(WebviewFragment webviewFragment, View view) {
        this.f94563b = webviewFragment;
        webviewFragment.mMessageView = butterknife.internal.f.e(view, R.id.vg_message, "field 'mMessageView'");
        webviewFragment.mProgressBar = (WebViewProgressBar) butterknife.internal.f.f(view, R.id.webView_progress, "field 'mProgressBar'", WebViewProgressBar.class);
        webviewFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        webviewFragment.vg_title_root = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_title_root, "field 'vg_title_root'", ViewGroup.class);
        webviewFragment.tb_web = (TitleBar) butterknife.internal.f.f(view, R.id.tb_web, "field 'tb_web'", TitleBar.class);
        webviewFragment.vg_loading = butterknife.internal.f.e(view, R.id.vg_loading, "field 'vg_loading'");
        webviewFragment.img_progress = (CircularProgressIndicator) butterknife.internal.f.f(view, R.id.img_progress, "field 'img_progress'", CircularProgressIndicator.class);
        webviewFragment.vg_webview_container = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_webview_container, "field 'vg_webview_container'", ViewGroup.class);
        webviewFragment.vg_bg = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_bg, "field 'vg_bg'", ViewGroup.class);
        webviewFragment.v_bg = (ImageView) butterknife.internal.f.f(view, R.id.v_bg, "field 'v_bg'", ImageView.class);
        webviewFragment.vg_bottom_bar_root = (ViewStub) butterknife.internal.f.f(view, R.id.vg_bottom_bar_root, "field 'vg_bottom_bar_root'", ViewStub.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47479, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebviewFragment webviewFragment = this.f94563b;
        if (webviewFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f94563b = null;
        webviewFragment.mMessageView = null;
        webviewFragment.mProgressBar = null;
        webviewFragment.mRefreshLayout = null;
        webviewFragment.vg_title_root = null;
        webviewFragment.tb_web = null;
        webviewFragment.vg_loading = null;
        webviewFragment.img_progress = null;
        webviewFragment.vg_webview_container = null;
        webviewFragment.vg_bg = null;
        webviewFragment.v_bg = null;
        webviewFragment.vg_bottom_bar_root = null;
    }
}
