package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
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
public class TDialog extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final FrameLayout.LayoutParams f100983c = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Toast f100984d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static WeakReference<ProgressDialog> f100985f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Context> f100986e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f100987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private OnTimeListener f100988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IUiListener f100989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FrameLayout f100990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.tencent.open.c.b f100991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Handler f100992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f100993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private QQToken f100994n;

    /* JADX INFO: compiled from: ProGuard */
    public class FbWebViewClient extends WebViewClient {
        private FbWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TDialog.this.f100991k.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.v("openSDK_LOG.TDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            TDialog.this.f100988h.onError(new UiError(i10, str, str2));
            if (TDialog.this.f100986e != null && TDialog.this.f100986e.get() != null) {
                Toast.makeText((Context) TDialog.this.f100986e.get(), "网络连接异常或系统错误", 0).show();
            }
            TDialog.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.v("openSDK_LOG.TDialog", "Redirect URL: " + str);
            if (str.startsWith(j.a().a((Context) TDialog.this.f100986e.get(), "auth://tauth.qq.com/"))) {
                TDialog.this.f100988h.onComplete(m.c(str));
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                TDialog.this.f100988h.onCancel();
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (str.startsWith(Constants.CLOSE_URI)) {
                if (TDialog.this.isShowing()) {
                    TDialog.this.dismiss();
                }
                return true;
            }
            if (!str.startsWith(Constants.DOWNLOAD_URI) && !str.endsWith(".apk")) {
                return str.startsWith("auth://progress");
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", str.startsWith(Constants.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                intent.addFlags(268435456);
                if (TDialog.this.f100986e != null && TDialog.this.f100986e.get() != null) {
                    ((Context) TDialog.this.f100986e.get()).startActivity(intent);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class JsListener extends b.C0975b {
        private JsListener() {
        }

        public void onAddShare(String str) {
            SLog.d("openSDK_LOG.TDialog", "JsListener onAddShare");
            onComplete(str);
        }

        public void onCancel(String str) {
            SLog.e("openSDK_LOG.TDialog", "JsListener onCancel --msg = " + str);
            TDialog.this.f100992l.obtainMessage(2, str).sendToTarget();
            TDialog.this.dismiss();
        }

        public void onCancelAddShare(String str) {
            SLog.e("openSDK_LOG.TDialog", "JsListener onCancelAddShare" + str);
            onCancel("cancel");
        }

        public void onCancelInvite() {
            SLog.e("openSDK_LOG.TDialog", "JsListener onCancelInvite");
            onCancel("");
        }

        public void onCancelLogin() {
            onCancel("");
        }

        public void onComplete(String str) {
            TDialog.this.f100992l.obtainMessage(1, str).sendToTarget();
            SLog.e("openSDK_LOG.TDialog", "JsListener onComplete" + str);
            TDialog.this.dismiss();
        }

        public void onInvite(String str) {
            onComplete(str);
        }

        public void onLoad(String str) {
            TDialog.this.f100992l.obtainMessage(4, str).sendToTarget();
        }

        public void showMsg(String str) {
            TDialog.this.f100992l.obtainMessage(3, str).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public static class OnTimeListener extends DefaultUiListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f100998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f100999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Context> f101000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f101001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IUiListener f101002e;

        public OnTimeListener(Context context, String str, String str2, String str3, IUiListener iUiListener) {
            this.f101000c = new WeakReference<>(context);
            this.f101001d = str;
            this.f100998a = str2;
            this.f100999b = str3;
            this.f101002e = iUiListener;
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
            IUiListener iUiListener = this.f101002e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f101002e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            h.a().a(this.f101001d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f100998a, false);
            IUiListener iUiListener = this.f101002e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f101002e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f100998a;
            } else {
                str = this.f100998a;
            }
            h hVarA = h.a();
            hVarA.a(this.f101001d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str, false);
            IUiListener iUiListener = this.f101002e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f101002e = null;
            }
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class THandler extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private OnTimeListener f101004b;

        public THandler(OnTimeListener onTimeListener, Looper looper) {
            super(looper);
            this.f101004b = onTimeListener;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SLog.d("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
            int i10 = message.what;
            if (i10 == 1) {
                this.f101004b.a((String) message.obj);
                return;
            }
            if (i10 == 2) {
                this.f101004b.onCancel();
                return;
            }
            if (i10 == 3) {
                if (TDialog.this.f100986e == null || TDialog.this.f100986e.get() == null) {
                    return;
                }
                TDialog.c((Context) TDialog.this.f100986e.get(), (String) message.obj);
                return;
            }
            if (i10 != 5 || TDialog.this.f100986e == null || TDialog.this.f100986e.get() == null) {
                return;
            }
            TDialog.d((Context) TDialog.this.f100986e.get(), (String) message.obj);
        }
    }

    public TDialog(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f100993m = false;
        this.f100994n = null;
        this.f100986e = new WeakReference<>(context);
        this.f100987g = str2;
        this.f100988h = new OnTimeListener(context, str, str2, qQToken.getAppId(), iUiListener);
        this.f100992l = new THandler(this.f100988h, context.getMainLooper());
        this.f100989i = iUiListener;
        this.f100994n = qQToken;
    }

    private void a() {
        try {
            new TextView(this.f100986e.get()).setText("test");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            com.tencent.open.c.b bVar = new com.tencent.open.c.b(this.f100986e.get());
            this.f100991k = bVar;
            bVar.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            com.tencent.open.c.c cVar = new com.tencent.open.c.c(this.f100986e.get());
            this.f100990j = cVar;
            cVar.setLayoutParams(layoutParams);
            this.f100990j.setBackgroundColor(-1);
            this.f100990j.addView(this.f100991k);
            setContentView(this.f100990j);
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.TDialog", "onCreateView exception", th2);
            a.a(this, this.f100992l);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        this.f100991k.setVerticalScrollBarEnabled(false);
        this.f100991k.setHorizontalScrollBarEnabled(false);
        this.f100991k.setWebViewClient(new FbWebViewClient());
        this.f100991k.setWebChromeClient(this.f101069b);
        this.f100991k.clearFormData();
        WebSettings settings = this.f100991k.getSettings();
        if (settings == null) {
            return;
        }
        com.tencent.open.web.a.a(this.f100991k);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        WeakReference<Context> weakReference = this.f100986e;
        if (weakReference != null && weakReference.get() != null) {
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(this.f100986e.get().getApplicationContext().getDir("databases", 0).getPath());
        }
        settings.setDomStorageEnabled(true);
        this.f101068a.a(new JsListener(), "sdk_js_if");
        this.f100991k.loadUrl(this.f100987g);
        this.f100991k.setLayoutParams(f100983c);
        this.f100991k.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str) {
        try {
            JSONObject jSONObjectD = m.d(str);
            int i10 = jSONObjectD.getInt("type");
            String string = jSONObjectD.getString("msg");
            if (i10 == 0) {
                Toast toast = f100984d;
                if (toast == null) {
                    f100984d = Toast.makeText(context, string, 0);
                } else {
                    toast.setView(toast.getView());
                    f100984d.setText(string);
                    f100984d.setDuration(0);
                }
                f100984d.show();
                return;
            }
            if (i10 == 1) {
                Toast toast2 = f100984d;
                if (toast2 == null) {
                    f100984d = Toast.makeText(context, string, 1);
                } else {
                    toast2.setView(toast2.getView());
                    f100984d.setText(string);
                    f100984d.setDuration(1);
                }
                f100984d.show();
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
            int i10 = jSONObjectD.getInt("action");
            String string = jSONObjectD.getString("msg");
            if (i10 == 1) {
                WeakReference<ProgressDialog> weakReference = f100985f;
                if (weakReference == null || weakReference.get() == null) {
                    ProgressDialog progressDialog = new ProgressDialog(context);
                    progressDialog.setMessage(string);
                    f100985f = new WeakReference<>(progressDialog);
                    progressDialog.show();
                } else {
                    f100985f.get().setMessage(string);
                    if (!f100985f.get().isShowing()) {
                        f100985f.get().show();
                    }
                }
            } else if (i10 == 0) {
                WeakReference<ProgressDialog> weakReference2 = f100985f;
                if (weakReference2 == null) {
                    return;
                }
                if (weakReference2.get() != null && f100985f.get().isShowing()) {
                    f100985f.get().dismiss();
                    f100985f = null;
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.tencent.open.c
    protected void a(String str) {
        SLog.d("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f101068a.a(this.f100991k, str);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        OnTimeListener onTimeListener = this.f100988h;
        if (onTimeListener != null) {
            onTimeListener.onCancel();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.c, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        a.a(getWindow());
        a();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.open.TDialog.1
            @Override // java.lang.Runnable
            public void run() {
                View decorView;
                View childAt;
                Window window = TDialog.this.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null || (childAt = ((ViewGroup) decorView).getChildAt(0)) == null) {
                    return;
                }
                childAt.setPadding(0, 0, 0, 0);
            }
        });
        b();
    }
}
