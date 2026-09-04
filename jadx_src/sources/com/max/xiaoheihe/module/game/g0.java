package com.max.xiaoheihe.module.game;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.RouterActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Map;

/* JADX INFO: compiled from: GameOpenGameCenterFragment.java */
/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.Q2)
public class g0 extends com.max.hbcommon.base.d implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f87433d = "title";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f87434e = "url";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f87435b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f87436c = "";

    /* JADX INFO: compiled from: GameOpenGameCenterFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33353, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) g0.this).mContext, (Class<?>) RouterActivity.class);
            intent.setData(Uri.parse("heybox://opengamecenter"));
            com.max.hbcommon.utils.q.c(((com.max.hbcommon.base.d) g0.this).mContext, "heybox-game-center", "黑盒游戏中心", BitmapFactory.decodeResource(((com.max.hbcommon.base.d) g0.this).mContext.getResources(), R.mipmap.ic_shortcut_gamecenter), new Intent[]{intent});
        }
    }

    /* JADX INFO: compiled from: GameOpenGameCenterFragment.java */
    public class b extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (!PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 33354, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.l0.i0(webView.getUrl(), str) && ((com.max.hbcommon.base.d) g0.this).mTitleBar != null && ((com.max.hbcommon.base.d) g0.this).mTitleBar.getVisibility() == 0) {
                ((com.max.hbcommon.base.d) g0.this).mTitleBar.setTitle(str);
            }
        }
    }

    public static g0 R3(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 33350, new Class[]{String.class, String.class}, g0.class);
        if (patchProxyResultProxy.isSupported) {
            return (g0) patchProxyResultProxy.result;
        }
        g0 g0Var = new g0();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("url", str2);
        g0Var.setArguments(bundle);
        return g0Var;
    }

    @Override // com.max.hbminiprogram.k
    public /* synthetic */ boolean I0() {
        return com.max.hbminiprogram.j.a(this);
    }

    @Override // com.max.hbminiprogram.d
    @androidx.annotation.p0
    public Fragment a2(@androidx.annotation.p0 Map<String, ?> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 33352, new Class[]{Map.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (map != null) {
            this.f87435b = (String) map.get("title");
            this.f87436c = (String) map.get("url");
        }
        return R3(this.f87435b, this.f87436c);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33351, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBar.setActionXIcon(R.drawable.common_shortcut_24x24);
        this.mTitleBar.getAppbarActionButtonXView().setPadding(0, 0, ViewUtils.f(this.mContext, 12.0f), 0);
        this.mTitleBar.getAppbarActionButtonView().setPadding(0, 0, ViewUtils.f(this.mContext, 9.0f), 0);
        this.mTitleBar.setActionXIconOnClickListener(new a());
        setContentView(R.layout.layout_sample_fragment_container);
        if (getArguments() != null) {
            this.f87435b = getArguments().getString("title");
            this.f87436c = getArguments().getString("url");
        }
        this.mTitleBar.setTitle(this.f87435b);
        if (((WebviewFragment) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            WebviewFragment webviewFragmentU7 = WebviewFragment.u7(this.f87436c);
            webviewFragmentU7.Y7(new b());
            getChildFragmentManager().u().b(R.id.fragment_container, webviewFragmentU7).m();
        }
    }
}
