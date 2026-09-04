package com.max.xiaoheihe.network;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: CaptchaDialogFragmentV2.java */
/* JADX INFO: loaded from: classes12.dex */
public class a extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f94827k = "title";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f94828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f94829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f94830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f94831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private qb.b.InterfaceC1257b f94832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private qb.a f94833j;

    /* JADX INFO: renamed from: com.max.xiaoheihe.network.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CaptchaDialogFragmentV2.java */
    public class ViewOnClickListenerC0897a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0897a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47644, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: CaptchaDialogFragmentV2.java */
    public class b extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(WebProtocolObj webProtocolObj) {
            if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47645, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!WebProtocolObj.PROTOCOL_TYPE_SET_TENCENT_CAPTCHA_SIZE.equals(webProtocolObj.getProtocol_type())) {
                if (WebProtocolObj.PROTOCOL_TYPE_TENCENT_CAPTCHA_CALLBACK.equals(webProtocolObj.getProtocol_type())) {
                    if ("0".equals(webProtocolObj.valueOf("ret"))) {
                        a.this.f94833j = new qb.a(qb.a.f138641d, webProtocolObj.valueOf("ticket"), webProtocolObj.valueOf("randstr"));
                    } else {
                        a.this.f94833j = null;
                    }
                    a.this.dismissAllowingStateLoss();
                    return;
                }
                return;
            }
            if (a.this.f94831h == null) {
                return;
            }
            Context context = a.this.f94831h.getContext();
            ViewGroup.LayoutParams layoutParams = a.this.f94830g.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = a.this.f94831h.getLayoutParams();
            layoutParams.width = ViewUtils.f(context, n.q(webProtocolObj.valueOf("width")));
            layoutParams2.height = ViewUtils.f(context, n.q(webProtocolObj.valueOf("height")));
            a.this.f94830g.setLayoutParams(layoutParams);
            a.this.f94831h.setLayoutParams(layoutParams2);
        }
    }

    public static a Q3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47638, new Class[]{String.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    private void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47643, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f94828e)) {
            this.f94829f.setVisibility(8);
        } else {
            this.f94829f.setVisibility(0);
            this.f94829f.setText(this.f94828e);
        }
        WebviewFragment webviewFragmentU7 = WebviewFragment.u7("file:///android_asset/www/tencent-captcha.html");
        webviewFragmentU7.Y7(new b());
        webviewFragmentU7.setMenuVisibility(true);
        webviewFragmentU7.setUserVisibleHint(true);
        getChildFragmentManager().u().y(R.id.fragment_container, webviewFragmentU7).n();
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public void S3(qb.b.InterfaceC1257b interfaceC1257b) {
        this.f94832i = interfaceC1257b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 47639, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f94828e = getArguments().getString("title");
        }
        setCancelable(false);
        return layoutInflater.inflate(R.layout.fragment_captcha_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@n0 DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 47642, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        qb.b.InterfaceC1257b interfaceC1257b = this.f94832i;
        if (interfaceC1257b != null) {
            qb.a aVar = this.f94833j;
            if (aVar != null) {
                interfaceC1257b.a(aVar);
            } else {
                interfaceC1257b.b();
            }
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47641, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        R3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 47640, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.iv_window_close).setOnClickListener(new ViewOnClickListenerC0897a());
        this.f94829f = (TextView) view.findViewById(R.id.tv_title);
        this.f94830g = view.findViewById(R.id.vg_content);
        this.f94831h = view.findViewById(R.id.fragment_container);
    }
}
