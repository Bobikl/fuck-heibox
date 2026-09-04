package com.max.xiaoheihe.module.webview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: WebViewDialogFragment.java */
/* JADX INFO: loaded from: classes12.dex */
public class b0 extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f94580f = "url";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f94581e;

    /* JADX INFO: compiled from: WebViewDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47177, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            b0.this.dismiss();
        }
    }

    public static b0 N3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47174, new Class[]{String.class}, b0.class);
        if (patchProxyResultProxy.isSupported) {
            return (b0) patchProxyResultProxy.result;
        }
        b0 b0Var = new b0();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        b0Var.setArguments(bundle);
        return b0Var;
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 47175, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (getArguments() != null) {
            this.f94581e = getArguments().getString("url");
        }
        return layoutInflater.inflate(R.layout.fragment_web_view_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 47176, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new a());
        if (bundle != null) {
            return;
        }
        getChildFragmentManager().u().b(R.id.fragment_container, new u(this.f94581e).f(getResources().getColor(R.color.transparent)).p(WebviewFragment.U4).a()).m();
    }
}
