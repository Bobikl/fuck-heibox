package com.tencent.connect.auth;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.connect.common.Constants;
import com.tencent.open.b.h;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.m;
import com.tencent.open.web.security.JniInterface;
import com.tencent.open.web.security.SecureJsInterface;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f99313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f99314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IUiListener f99315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f99316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FrameLayout f99317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f99318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FrameLayout f99319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ProgressBar f99320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f99321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.tencent.open.c.d f99322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f99323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.tencent.open.web.security.b f99324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f99325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f99327o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f99328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f99329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f99330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private HashMap<String, Runnable> f99331s;

    /* JADX INFO: renamed from: com.tencent.connect.auth.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProGuard */
    public class C0955a extends WebViewClient {
        private C0955a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            SLog.v("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
            a.this.f99319g.setVisibility(8);
            if (a.this.f99322j != null) {
                a.this.f99322j.setVisibility(0);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a.this.f99316d.removeCallbacks((Runnable) a.this.f99331s.remove(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            SLog.v("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            a.this.f99319g.setVisibility(0);
            a.this.f99329q = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(a.this.f99327o)) {
                a.this.f99316d.removeCallbacks((Runnable) a.this.f99331s.remove(a.this.f99327o));
            }
            a.this.f99327o = str;
            a aVar = a.this;
            d dVar = aVar.new d(aVar.f99327o);
            a.this.f99331s.put(str, dVar);
            a.this.f99316d.postDelayed(dVar, 120000L);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            SLog.i("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i10 + " | description: " + str);
            if (!m.b(a.this.f99323k)) {
                a.this.f99314b.onError(new UiError(9001, "当前网络不可用，请稍后重试！", str2));
                a.this.dismiss();
                return;
            }
            if (a.this.f99327o.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
                a.this.f99314b.onError(new UiError(i10, str, str2));
                a.this.dismiss();
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - a.this.f99329q;
            if (a.this.f99326n >= 1 || jElapsedRealtime >= a.this.f99330r) {
                a.this.f99322j.loadUrl(a.this.a());
            } else {
                a.m(a.this);
                a.this.f99316d.postDelayed(new Runnable() { // from class: com.tencent.connect.auth.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f99322j.loadUrl(a.this.f99327o);
                    }
                }, 500L);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            SLog.e("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SLog.v("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
            if (str.startsWith("auth://browser")) {
                JSONObject jSONObjectC = m.c(str);
                a aVar = a.this;
                aVar.f99325m = aVar.e();
                if (!a.this.f99325m) {
                    if (jSONObjectC.optString("fail_cb", null) != null) {
                        a.this.a(jSONObjectC.optString("fail_cb"), "");
                    } else if (jSONObjectC.optInt("fall_to_wv") == 1) {
                        a aVar2 = a.this;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a.this.f99313a);
                        sb2.append(a.this.f99313a.indexOf("?") > -1 ? "&" : "?");
                        aVar2.f99313a = sb2.toString();
                        a.this.f99313a = a.this.f99313a + "browser_error=1";
                        a.this.f99322j.loadUrl(a.this.f99313a);
                    } else {
                        String strOptString = jSONObjectC.optString("redir", null);
                        if (strOptString != null) {
                            a.this.f99322j.loadUrl(strOptString);
                        }
                    }
                }
                return true;
            }
            if (str.startsWith("auth://tauth.qq.com/")) {
                a.this.f99314b.onComplete(m.c(str));
                a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CANCEL_URI)) {
                a.this.f99314b.onCancel();
                a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.CLOSE_URI)) {
                a.this.dismiss();
                return true;
            }
            if (str.startsWith(Constants.DOWNLOAD_URI) || str.endsWith(".apk")) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", str.startsWith(Constants.DOWNLOAD_URI) ? Uri.parse(Uri.decode(str.substring(11))) : Uri.parse(Uri.decode(str)));
                    intent.addFlags(268435456);
                    a.this.f99323k.startActivity(intent);
                } catch (Exception e10) {
                    SLog.e("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e10);
                }
                return true;
            }
            if (!str.startsWith("auth://progress")) {
                if (str.startsWith("auth://onLoginSubmit")) {
                    try {
                        List<String> pathSegments = Uri.parse(str).getPathSegments();
                        if (!pathSegments.isEmpty()) {
                            a.this.f99328p = pathSegments.get(0);
                        }
                    } catch (Exception unused) {
                    }
                    return true;
                }
                if (a.this.f99324l.a(a.this.f99322j, str)) {
                    return true;
                }
                SLog.i("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                return false;
            }
            try {
                List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                if (pathSegments2.isEmpty()) {
                    return true;
                }
                int iIntValue = Integer.valueOf(pathSegments2.get(0)).intValue();
                if (iIntValue == 0) {
                    a.this.f99319g.setVisibility(8);
                    a.this.f99322j.setVisibility(0);
                } else if (iIntValue == 1) {
                    a.this.f99319g.setVisibility(0);
                }
            } catch (Exception unused2) {
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class b extends DefaultUiListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f99338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f99339b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f99341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IUiListener f99342e;

        public b(String str, String str2, String str3, IUiListener iUiListener) {
            this.f99341d = str;
            this.f99338a = str2;
            this.f99339b = str3;
            this.f99342e = iUiListener;
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
            IUiListener iUiListener = this.f99342e;
            if (iUiListener != null) {
                iUiListener.onCancel();
                this.f99342e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            h.a().a(this.f99341d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, jSONObject.optInt("ret", -6), this.f99338a, false);
            IUiListener iUiListener = this.f99342e;
            if (iUiListener != null) {
                iUiListener.onComplete(jSONObject);
                this.f99342e = null;
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            String str;
            if (uiError.errorMessage != null) {
                str = uiError.errorMessage + this.f99338a;
            } else {
                str = this.f99338a;
            }
            h.a().a(this.f99341d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, uiError.errorCode, str, false);
            a.this.a(str);
            IUiListener iUiListener = this.f99342e;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
                this.f99342e = null;
            }
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class c extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f99344b;

        public c(b bVar, Looper looper) {
            super(looper);
            this.f99344b = bVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                this.f99344b.a((String) message.obj);
            } else if (i10 == 2) {
                this.f99344b.onCancel();
            } else {
                if (i10 != 3) {
                    return;
                }
                a.b(a.this.f99323k, (String) message.obj);
            }
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f99345a;

        public d(String str) {
            this.f99345a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SLog.v("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.f99345a + " | mRetryUrl: " + a.this.f99327o);
            if (this.f99345a.equals(a.this.f99327o)) {
                a.this.f99314b.onError(new UiError(9002, "请求页面超时，请稍后重试！", a.this.f99327o));
                a.this.dismiss();
            }
        }
    }

    public a(Context context, String str, String str2, IUiListener iUiListener, QQToken qQToken) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f99325m = false;
        this.f99329q = 0L;
        this.f99330r = 30000L;
        this.f99323k = context;
        this.f99313a = str2;
        this.f99314b = new b(str, str2, qQToken.getAppId(), iUiListener);
        this.f99316d = new c(this.f99314b, context.getMainLooper());
        this.f99315c = iUiListener;
        this.f99321i = str;
        this.f99324l = new com.tencent.open.web.security.b();
        getWindow().setSoftInputMode(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        String str = this.f99313a;
        String str2 = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + str.substring(str.indexOf("?") + 1);
        SLog.i("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.f99328p) && this.f99328p.length() >= 4) {
            String str2 = this.f99328p;
            String strSubstring = str2.substring(str2.length() - 4);
            sb2.append("_u_");
            sb2.append(strSubstring);
        }
        return sb2.toString();
    }

    private void a(ViewGroup viewGroup) {
        ImageView imageView = new ImageView(this.f99323k);
        int iA = com.tencent.connect.avatar.a.a(this.f99323k, 15.6f);
        int iA2 = com.tencent.connect.avatar.a.a(this.f99323k, 25.2f);
        int iA3 = com.tencent.connect.avatar.a.a(this.f99323k, 10.0f);
        int i10 = iA3 * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA + i10, iA2 + i10);
        layoutParams.leftMargin = iA3;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(iA3, iA3, iA3, iA3);
        imageView.setImageDrawable(m.a("h5_qr_back.png", this.f99323k));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.connect.auth.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.dismiss();
                if (a.this.f99325m || a.this.f99314b == null) {
                    return;
                }
                a.this.f99314b.onCancel();
            }
        });
        viewGroup.addView(imageView);
    }

    private void b() {
        try {
            c();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            com.tencent.open.c.d dVar = new com.tencent.open.c.d(this.f99323k);
            this.f99322j = dVar;
            dVar.setLayerType(1, null);
            this.f99322j.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            com.tencent.open.c.c cVar = new com.tencent.open.c.c(this.f99323k);
            cVar.setLayoutParams(layoutParams);
            cVar.addView(this.f99322j);
            FrameLayout frameLayout = new FrameLayout(this.f99323k);
            this.f99317e = frameLayout;
            frameLayout.addView(cVar);
            this.f99317e.setBackgroundColor(-1);
            this.f99317e.addView(this.f99319g);
            String string = m.b(this.f99313a).getString("style");
            if (string != null && "qr".equals(string)) {
                a(this.f99317e);
            }
            setContentView(this.f99317e);
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.AuthDialog", "onCreateView exception", e10);
            com.tencent.open.a.a(this, this.f99316d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        try {
            JSONObject jSONObjectD = m.d(str);
            int i10 = jSONObjectD.getInt("type");
            Toast.makeText(context.getApplicationContext(), jSONObjectD.getString("msg"), i10).show();
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        TextView textView;
        this.f99320h = new ProgressBar(this.f99323k);
        this.f99320h.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f99318f = new LinearLayout(this.f99323k);
        if (this.f99321i.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(this.f99323k);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        } else {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.f99318f.setLayoutParams(layoutParams2);
        this.f99318f.addView(this.f99320h);
        if (textView != null) {
            this.f99318f.addView(textView);
        }
        this.f99319g = new FrameLayout(this.f99323k);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f99319g.setLayoutParams(layoutParams3);
        this.f99319g.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f99319g.addView(this.f99318f);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void d() {
        this.f99322j.setVerticalScrollBarEnabled(false);
        this.f99322j.setHorizontalScrollBarEnabled(false);
        this.f99322j.setWebViewClient(new C0955a());
        this.f99322j.setWebChromeClient(new WebChromeClient());
        this.f99322j.clearFormData();
        this.f99322j.clearSslPreferences();
        this.f99322j.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.tencent.connect.auth.a.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        });
        this.f99322j.setOnTouchListener(new View.OnTouchListener() { // from class: com.tencent.connect.auth.a.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if ((action != 0 && action != 1) || view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        WebSettings settings = this.f99322j.getSettings();
        com.tencent.open.web.a.a(this.f99322j);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.f99323k.getDir("databases", 0).getPath());
        settings.setDomStorageEnabled(true);
        SLog.v("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f99313a);
        String str = this.f99313a;
        this.f99327o = str;
        this.f99322j.loadUrl(str);
        this.f99322j.setVisibility(4);
        this.f99324l.a(new SecureJsInterface(), "SecureJsInterface");
        SecureJsInterface.isPWDEdit = false;
        super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tencent.connect.auth.a.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                try {
                    if (JniInterface.isJniOk) {
                        JniInterface.clearAllPWD();
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        com.tencent.connect.auth.b bVarA = com.tencent.connect.auth.b.a();
        String strC = bVarA.c();
        com.tencent.connect.auth.b.a aVar = new com.tencent.connect.auth.b.a();
        aVar.f99352a = this.f99315c;
        aVar.f99353b = this;
        aVar.f99354c = strC;
        String strA = bVarA.a(aVar);
        String str = this.f99313a;
        String strSubstring = str.substring(0, str.indexOf("?"));
        Bundle bundleB = m.b(this.f99313a);
        bundleB.putString("token_key", strC);
        bundleB.putString("serial", strA);
        bundleB.putString("browser", "1");
        String str2 = strSubstring + "?" + HttpUtils.encodeUrl(bundleB);
        this.f99313a = str2;
        return m.a(this.f99323k, str2);
    }

    static /* synthetic */ int m(a aVar) {
        int i10 = aVar.f99326n;
        aVar.f99326n = i10 + 1;
        return i10;
    }

    public void a(String str, String str2) {
        this.f99322j.loadUrl("javascript:" + str + "(" + str2 + ");void(" + System.currentTimeMillis() + ");");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f99331s.clear();
        this.f99316d.removeCallbacksAndMessages(null);
        try {
            Context context = this.f99323k;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                SLog.i("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e10);
        }
        com.tencent.open.c.d dVar = this.f99322j;
        if (dVar != null) {
            dVar.destroy();
            this.f99322j = null;
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (!this.f99325m) {
            this.f99314b.onCancel();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        com.tencent.open.a.a(getWindow());
        b();
        d();
        this.f99331s = new HashMap<>();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
    }
}
