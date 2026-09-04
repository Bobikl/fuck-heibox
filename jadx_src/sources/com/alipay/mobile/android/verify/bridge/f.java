package com.alipay.mobile.android.verify.bridge;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.mobile.android.verify.sdk.R;

/* JADX INFO: compiled from: PopWebViewDialog.java */
/* JADX INFO: loaded from: classes6.dex */
public class f extends Dialog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BridgeWebView f39355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f39356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f39357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f39358f;

    public f(Activity activity, String str) {
        super(activity, R.style.fullscreen);
        this.f39354b = "PopWebViewDialog";
        setOwnerActivity(activity);
        this.f39358f = str;
        getWindow().setWindowAnimations(R.style.dialogAnim);
    }

    private Typeface a(Context context) {
        try {
            return Typeface.createFromAsset(context.getAssets(), "fonts/iconfont.ttf");
        } catch (Exception e10) {
            Typeface typeface = Typeface.DEFAULT;
            com.alipay.mobile.android.verify.logger.f.k("PopWebViewDialog").k(e10, "got error when got icon font", new Object[0]);
            return typeface;
        }
    }

    private void b() {
        this.f39355c.setWebChromeClient(new h(this));
        this.f39355c.setWebViewClient(new i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        BridgeWebView bridgeWebView = this.f39355c;
        if (bridgeWebView == null || !bridgeWebView.canGoBack()) {
            dismiss();
        } else {
            this.f39355c.goBack();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.alipay.mobile.android.verify.logger.f.k("PopWebViewDialog").a("PopWebViewDialog attached to window", new Object[0]);
        if (!TextUtils.isEmpty(this.f39358f)) {
            this.f39355c.loadUrl(this.f39358f);
        } else {
            com.alipay.mobile.android.verify.logger.f.k("PopWebViewDialog").d("null or empty target url", new Object[0]);
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        e();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.alipay.mobile.android.verify.logger.f.k("PopWebViewDialog").a("PopWebViewDialog create", new Object[0]);
        setContentView(R.layout.bridge_container);
        this.f39355c = (BridgeWebView) findViewById(R.id.webView);
        this.f39356d = (TextView) findViewById(R.id.content);
        TextView textView = (TextView) findViewById(R.id.button);
        this.f39357e = textView;
        textView.setTypeface(a(getContext().getApplicationContext()));
        this.f39357e.setOnClickListener(new g(this));
        b();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.alipay.mobile.android.verify.logger.f.k("PopWebViewDialog").a("PopWebViewDialog detached from window", new Object[0]);
        this.f39355c.destroy();
    }
}
