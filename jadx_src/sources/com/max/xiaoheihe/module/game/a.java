package com.max.xiaoheihe.module.game;

import android.view.View;
import android.webkit.WebView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityCenterFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f85509b = lb.a.f131023p3;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityCenterFragment.java */
    public class C0760a extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0760a() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (!PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 32075, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.l0.i0(webView.getUrl(), str) && ((com.max.hbcommon.base.d) a.this).mTitleBar != null && ((com.max.hbcommon.base.d) a.this).mTitleBar.getVisibility() == 0) {
                ((com.max.hbcommon.base.d) a.this).mTitleBar.setTitle(str);
            }
        }
    }

    public static a O3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32073, new Class[0], a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32074, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.mTitleBar.setTitle(R.string.activity_center);
        if (((WebviewFragment) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            WebviewFragment webviewFragmentU7 = WebviewFragment.u7(this.f85509b);
            webviewFragmentU7.Y7(new C0760a());
            getChildFragmentManager().u().b(R.id.fragment_container, webviewFragmentU7).m();
        }
    }
}
