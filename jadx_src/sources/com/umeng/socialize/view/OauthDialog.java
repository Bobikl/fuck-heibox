package com.umeng.socialize.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.socialize.Config;
import com.umeng.socialize.SocializeException;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UmengErrorCode;
import com.umeng.socialize.net.utils.SocializeNetUtils;
import com.umeng.socialize.utils.DeviceConfig;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.URLBuilder;
import com.umeng.socialize.utils.UmengText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class OauthDialog extends BaseDialog {
    private static final String BASE_URL = "https://log.umsns.com/";
    private static final String TAG = "OauthDialog";
    private static String mRedirectUri = "error";
    private a mListener;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private UMAuthListener f106410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SHARE_MEDIA f106411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f106412c;

        public a(UMAuthListener uMAuthListener, SHARE_MEDIA share_media) {
            this.f106410a = uMAuthListener;
            this.f106411b = share_media;
        }

        public void a() {
            UMAuthListener uMAuthListener = this.f106410a;
            if (uMAuthListener != null) {
                uMAuthListener.onCancel(this.f106411b, this.f106412c);
            }
        }

        public void a(Bundle bundle) {
            UMAuthListener uMAuthListener = this.f106410a;
            if (uMAuthListener != null) {
                uMAuthListener.onComplete(this.f106411b, this.f106412c, SocializeUtils.bundleTomap(bundle));
            }
        }

        public void a(Exception exc) {
            UMAuthListener uMAuthListener = this.f106410a;
            if (uMAuthListener != null) {
                uMAuthListener.onError(this.f106411b, this.f106412c, exc);
            }
        }
    }

    public static class b extends WebChromeClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<OauthDialog> f106413a;

        private b(OauthDialog oauthDialog) {
            this.f106413a = new WeakReference<>(oauthDialog);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            WeakReference<OauthDialog> weakReference = this.f106413a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                if (i10 < 90) {
                    oauthDialog.mProgressbar.setVisibility(0);
                } else {
                    oauthDialog.mHandler.sendEmptyMessage(1);
                }
            }
        }
    }

    public static class c extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<OauthDialog> f106414a;

        private c(OauthDialog oauthDialog) {
            this.f106414a = new WeakReference<>(oauthDialog);
        }

        private void a(String str) {
            WeakReference<OauthDialog> weakReference = this.f106414a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                oauthDialog.mFlag = 1;
                oauthDialog.mValues = SocializeUtils.parseUrl(str);
                if (oauthDialog.isShowing()) {
                    SocializeUtils.safeCloseDialog(oauthDialog);
                }
            }
        }

        private void b(String str) {
            WeakReference<OauthDialog> weakReference = this.f106414a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                oauthDialog.mFlag = 1;
                oauthDialog.mValues = SocializeNetUtils.parseUrl(str);
                if (oauthDialog.isShowing()) {
                    SocializeUtils.safeCloseDialog(oauthDialog);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            WeakReference<OauthDialog> weakReference = this.f106414a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                oauthDialog.mHandler.sendEmptyMessage(1);
                super.onPageFinished(webView, str);
                if (oauthDialog.mFlag == 0 && str.contains(oauthDialog.mWaitUrl)) {
                    a(str);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WeakReference<OauthDialog> weakReference = this.f106414a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                String strDecrypt = str.contains("?ud_get=") ? oauthDialog.decrypt(str) : "";
                if (strDecrypt.contains("access_key") && strDecrypt.contains("access_secret")) {
                    if (str.contains(oauthDialog.mWaitUrl)) {
                        a(str);
                        return;
                    }
                    return;
                } else if (str.startsWith(OauthDialog.mRedirectUri)) {
                    b(str);
                }
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            WeakReference<OauthDialog> weakReference = this.f106414a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                View view = oauthDialog.mProgressbar;
                if (view.getVisibility() == 0) {
                    view.setVisibility(8);
                }
            }
            super.onReceivedError(webView, i10, str, str2);
            if (oauthDialog != null) {
                SocializeUtils.safeCloseDialog(oauthDialog);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WeakReference<OauthDialog> weakReference = this.f106414a;
            OauthDialog oauthDialog = weakReference == null ? null : weakReference.get();
            if (oauthDialog != null) {
                Context applicationContext = oauthDialog.mContext.getApplicationContext();
                if (!DeviceConfig.isNetworkAvailable(applicationContext)) {
                    Toast.makeText(applicationContext, UmengText.NET.NET_INAVALIBLE, 0).show();
                    return true;
                }
                if (str.contains("?ud_get=")) {
                    str = oauthDialog.decrypt(str);
                }
                if (str.contains(oauthDialog.mWaitUrl)) {
                    a(str);
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public OauthDialog(Activity activity, SHARE_MEDIA share_media, UMAuthListener uMAuthListener) {
        super(activity, share_media);
        this.mListener = new a(uMAuthListener, share_media);
        initViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String decrypt(String str) {
        try {
            String[] strArrSplit = str.split("ud_get=");
            return strArrSplit[0] + strArrSplit[1];
        } catch (Exception e10) {
            SLog.error(e10);
            return str;
        }
    }

    private WebViewClient getAdapterWebViewClient() {
        return new c();
    }

    private String getUrl(SHARE_MEDIA share_media) {
        URLBuilder uRLBuilder = new URLBuilder(this.mContext);
        uRLBuilder.setHost("https://log.umsns.com/").setPath("share/auth/").setAppkey(SocializeUtils.getAppkey(this.mContext)).setEntityKey(Config.EntityKey).withMedia(share_media).withOpId("10").withSessionId(Config.SessionId).withUID(UMUtils.getUMId(this.mContext));
        return uRLBuilder.toEncript();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Bundle bundle = this.mValues;
        if (bundle != null) {
            String string = bundle.getString("uid");
            String string2 = this.mValues.getString("error_code");
            String string3 = this.mValues.getString("error_description");
            if (this.mPlatform == SHARE_MEDIA.SINA && !TextUtils.isEmpty(string3)) {
                this.mListener.a(new SocializeException(UmengErrorCode.AuthorizeFailed.getMessage() + "errorcode:" + string2 + " message:" + string3));
            } else if (TextUtils.isEmpty(string)) {
                this.mListener.a(new SocializeException(UmengErrorCode.AuthorizeFailed.getMessage() + "unfetch usid..."));
            } else {
                Bundle bundle2 = this.mValues;
                bundle2.putString("accessToken", bundle2.getString("access_key"));
                Bundle bundle3 = this.mValues;
                bundle3.putString("expiration", bundle3.getString("expires_in"));
                this.mListener.a(this.mValues);
            }
        } else {
            this.mListener.a();
        }
        super.dismiss();
        releaseWebView();
    }

    @Override // com.umeng.socialize.view.BaseDialog
    public void setClient(WebView webView) {
        webView.setWebViewClient(getAdapterWebViewClient());
        this.mWebView.setWebChromeClient(new b());
    }

    public void setmRedirectUri(String str) {
        mRedirectUri = str;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.mValues = null;
        SHARE_MEDIA share_media = this.mPlatform;
        if (share_media == SHARE_MEDIA.SINA) {
            this.mWebView.loadUrl(this.mWaitUrl);
        } else {
            this.mWebView.loadUrl(getUrl(share_media));
        }
    }
}
