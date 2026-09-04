package com.alipay.mobile.android.verify.bridge;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alipay.mobile.android.verify.sdk.R;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BridgeContainer.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Dialog implements j4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BridgeWebView f39335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f39336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f39337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f39338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<j4.c> f39340i;

    public a(Activity activity, String str) {
        super(activity, R.style.fullscreen);
        this.f39333b = "BridgeContainer";
        e();
        setOwnerActivity(activity);
        this.f39334c = str;
        getWindow().setWindowAnimations(R.style.dialogAnim);
    }

    private Typeface a(Context context) {
        try {
            return Typeface.createFromAsset(context.getAssets(), "fonts/iconfont.ttf");
        } catch (Exception e10) {
            Typeface typeface = Typeface.DEFAULT;
            com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").k(e10, "got error when got icon font", new Object[0]);
            return typeface;
        }
    }

    private void b() {
        if (this.f39340i == null) {
            this.f39340i = new ArrayList();
        }
        this.f39340i.add(new com.alipay.mobile.android.verify.bridge.b.b(this.f39335d));
        this.f39340i.add(new com.alipay.mobile.android.verify.bridge.b.a(this.f39335d));
        this.f39340i.add(new com.alipay.mobile.android.verify.bridge.b.g(this.f39337f, this.f39336e, this.f39338g));
        this.f39340i.add(new com.alipay.mobile.android.verify.bridge.b.d(this.f39335d));
        this.f39340i.add(new com.alipay.mobile.android.verify.bridge.b.c(getOwnerActivity()));
        this.f39340i.add(this);
    }

    private void e() {
        com.alipay.mobile.android.verify.logger.f.b();
        com.alipay.mobile.android.verify.logger.f.a(new i4.a(com.alipay.mobile.android.verify.logger.g.k().f("JS_BRIDGE").a()));
    }

    private void f() {
        try {
            if (this.f39340i != null) {
                com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("register plugins begin", new Object[0]);
                Iterator<j4.c> it = this.f39340i.iterator();
                while (it.hasNext()) {
                    b.a().register(it.next());
                }
                com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("register plugins end", new Object[0]);
            }
        } catch (Exception e10) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").k(e10, "register plugin got error", new Object[0]);
        }
    }

    private void g() {
        try {
            if (this.f39340i != null) {
                com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("unregister plugins begin", new Object[0]);
                Iterator<j4.c> it = this.f39340i.iterator();
                while (it.hasNext()) {
                    b.a().unregister(it.next());
                }
                this.f39340i.clear();
                com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("unregister plugins end", new Object[0]);
            }
        } catch (Exception e10) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").k(e10, "unregister plugin got error", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        BridgeWebView bridgeWebView;
        if (!this.f39339h || (bridgeWebView = this.f39335d) == null) {
            return;
        }
        if (bridgeWebView.canGoBack()) {
            this.f39335d.goBack();
            return;
        }
        j4.a aVar = new j4.a();
        aVar.f124238c = j4.b.f124244f;
        b.a().post(aVar);
    }

    public void d(j4.c cVar) {
        if (this.f39340i == null) {
            this.f39340i = new ArrayList();
        }
        this.f39340i.add(cVar);
    }

    @Override // j4.c
    @Subscribe
    public void handle(j4.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").d("null or empty action", new Object[0]);
            return;
        }
        j4.a aVarA = j4.a.a(aVar);
        aVarA.f124237b = j4.a.b();
        if (j4.b.f124248j.equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("handle allow back event", new Object[0]);
            this.f39339h = true;
            b.a().post(aVarA);
        } else if (j4.b.f124247i.equalsIgnoreCase(aVar.f124238c)) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("handle disallow back event", new Object[0]);
            this.f39339h = false;
            b.a().post(aVarA);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("bridge container attached to window", new Object[0]);
        f();
        if (TextUtils.isEmpty(this.f39334c)) {
            com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").d("null or empty target url", new Object[0]);
            dismiss();
        } else if (this.f39334c.startsWith("http://") || this.f39334c.startsWith("https://")) {
            this.f39335d.loadUrl(this.f39334c);
        } else {
            com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").d("invalid target url", new Object[0]);
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        h();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("bridge container create", new Object[0]);
        setContentView(R.layout.bridge_container);
        this.f39335d = (BridgeWebView) findViewById(R.id.webView);
        this.f39336e = (TextView) findViewById(R.id.content);
        TextView textView = (TextView) findViewById(R.id.button);
        this.f39337f = textView;
        textView.setTypeface(a(getContext().getApplicationContext()));
        this.f39337f.setOnClickListener(new d(this));
        this.f39338g = findViewById(R.id.divider);
        this.f39339h = true;
        b();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.alipay.mobile.android.verify.logger.f.k("BridgeContainer").a("bridge container detached from window", new Object[0]);
        g();
        this.f39335d.destroy();
        this.f39339h = true;
    }
}
