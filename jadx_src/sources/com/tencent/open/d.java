package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.b.h;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.j;
import com.tencent.open.utils.m;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class d extends com.tencent.open.c implements com.tencent.open.c.a.InterfaceC0976a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static Toast f101078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f101079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IUiListener f101080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f101081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f101082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.tencent.open.c.a f101083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.tencent.open.c.b f101084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference<Context> f101085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f101086k;

    /* JADX INFO: compiled from: ProGuard */
    public class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            d.this.f101084i.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.v("openSDK_LOG.PKDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            d.this.f101081f.onError(new UiError(i10, str, str2));
            if (d.this.f101085j != null && d.this.f101085j.get() != null) {
                Toast.makeText((Context) d.this.f101085j.get(), "网络连接异常或系统错误", 0).show();
            }
            d.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.v("openSDK_LOG.PKDialog", "Redirect URL: " + str);
            if (str.startsWith(j.a().a((Context) d.this.f101085j.get(), "auth://tauth.qq.com/"))) {
                d.this.f101081f.onComplete(m.c(str));
                d.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                d.this.f101081f.onCancel();
                d.this.dismiss();
                return true;
            }
            if (!str.startsWith(Constants.CLOSE_URI)) {
                return false;
            }
            d.this.dismiss();
            return true;
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class b extends com.tencent.open.b.C0975b {
        private b() {
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public static class c extends DefaultUiListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f101089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f101090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Context> f101091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f101092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IUiListener f101093e;

        public c(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.f101091c = new WeakReference<>(context);
            this.f101092d = str;
            this.f101089a = str2;
            this.f101090b = str3;
            this.f101093e = iUiListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            try {
                onComplete(m.d(str));
            } catch (JSONException e10) {
                e10.printStackTrace();
                onError(new UiError(-4, Constants.MSG_JSON_ERROR, str));
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f101093e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f101093e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            h.a().a(this.f101092d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f101089a, false);
            IUiListener iUiListener = this.f101093e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f101093e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f101089a;
            } else {
                str = this.f101089a;
            }
            h hVarA = h.a();
            hVarA.a(this.f101092d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str, false);
            IUiListener iUiListener = this.f101093e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f101093e = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProGuard */
    public class HandlerC0977d extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f101095b;

        public HandlerC0977d(c cVar, Looper looper) {
            super(looper);
            this.f101095b = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.d("openSDK_LOG.PKDialog", "msg = " + message.what);
            int i10 = message.what;
            if (i10 == 1) {
                this.f101095b.a((String) message.obj);
                return;
            }
            if (i10 == 2) {
                this.f101095b.onCancel();
                return;
            }
            if (i10 == 3) {
                if (d.this.f101085j == null || d.this.f101085j.get() == null) {
                    return;
                }
                d.c((Context) d.this.f101085j.get(), (String) message.obj);
                return;
            }
            if (i10 != 5 || d.this.f101085j == null || d.this.f101085j.get() == null) {
                return;
            }
            d.d((Context) d.this.f101085j.get(), (String) message.obj);
        }
    }

    public d(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f101085j = new WeakReference<>(context);
        this.f101079d = str2;
        this.f101081f = new c(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f101082g = new HandlerC0977d(this.f101081f, context.getMainLooper());
        this.f101080e = iUiListener;
        this.f101086k = Math.round(context.getResources().getDisplayMetrics().density * 185.0f);
        SLog.e("openSDK_LOG.PKDialog", "density=" + context.getResources().getDisplayMetrics().density + "; webviewHeight=" + this.f101086k);
    }

    private void b() {
        com.tencent.open.c.a aVar = new com.tencent.open.c.a(this.f101085j.get());
        this.f101083h = aVar;
        aVar.setBackgroundColor(1711276032);
        this.f101083h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        com.tencent.open.c.b bVar = new com.tencent.open.c.b(this.f101085j.get());
        this.f101084i = bVar;
        bVar.setBackgroundColor(0);
        this.f101084i.setBackgroundDrawable(null);
        try {
            View.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this.f101084i, 1, new Paint());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f101086k);
        layoutParams.addRule(13, -1);
        this.f101084i.setLayoutParams(layoutParams);
        this.f101083h.addView(this.f101084i);
        this.f101083h.a(this);
        setContentView(this.f101083h);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void c() {
        this.f101084i.setVerticalScrollBarEnabled(false);
        this.f101084i.setHorizontalScrollBarEnabled(false);
        this.f101084i.setWebViewClient(new a());
        this.f101084i.setWebChromeClient(this.f101069b);
        this.f101084i.clearFormData();
        WebSettings settings = this.f101084i.getSettings();
        if (settings == null) {
            return;
        }
        com.tencent.open.web.a.a(this.f101084i);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        WeakReference<Context> weakReference = this.f101085j;
        if (weakReference != null && weakReference.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f101085j.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.f101068a.a(new b(), "sdk_js_if");
        this.f101084i.clearView();
        this.f101084i.loadUrl(this.f101079d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str) {
        try {
            JSONObject jSONObjectD = m.d(str);
            int i10 = jSONObjectD.getInt("type");
            String string = jSONObjectD.getString("msg");
            if (i10 == 0) {
                Toast toast = f101078c;
                if (toast == null) {
                    f101078c = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    f101078c.setText(string);
                    f101078c.setDuration(0);
                }
                f101078c.show();
                return;
            }
            if (i10 == 1) {
                Toast toast2 = f101078c;
                if (toast2 == null) {
                    f101078c = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    f101078c.setText(string);
                    f101078c.setDuration(1);
                }
                f101078c.show();
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectD = m.d(str);
            jSONObjectD.getInt("action");
            jSONObjectD.getString("msg");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tencent.open.c.a.InterfaceC0976a
    public void a() {
        this.f101084i.getLayoutParams().height = this.f101086k;
        SLog.e("openSDK_LOG.PKDialog", "onKeyboardHidden keyboard hide");
    }

    @Override // com.tencent.open.c.a.InterfaceC0976a
    public void a(int i10) {
        WeakReference<Context> weakReference = this.f101085j;
        if (weakReference != null && weakReference.get() != null) {
            if (i10 >= this.f101086k || 2 != this.f101085j.get().getResources().getConfiguration().orientation) {
                this.f101084i.getLayoutParams().height = this.f101086k;
            } else {
                this.f101084i.getLayoutParams().height = i10;
            }
        }
        SLog.e("openSDK_LOG.PKDialog", "onKeyboardShown keyboard show");
    }

    @Override // com.tencent.open.c
    protected void a(String str) {
        SLog.d("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.f101068a.a(this.f101084i, str);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.open.c, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        b();
        c();
    }
}
