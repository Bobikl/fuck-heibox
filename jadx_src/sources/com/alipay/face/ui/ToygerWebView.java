package com.alipay.face.ui;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.ProgressBar;
import com.alipay.zoloz.toyger.ToygerLog;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerWebView extends WebView {
    private Handler mHandler;
    private ProgressBar mProgressBar;

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            ToygerLog.e("onJsPrompt:" + str2);
            if ("face_auth".endsWith(str2)) {
                super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                jsPromptResult.cancel();
                ToygerWebView.this.mHandler.sendMessage(ToygerWebView.this.mHandler.obtainMessage(905));
                return true;
            }
            if ("navi_close".endsWith(str2)) {
                super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                jsPromptResult.cancel();
                ToygerWebView.this.mHandler.sendMessage(ToygerWebView.this.mHandler.obtainMessage(906));
                return true;
            }
            if (!"guide_log".endsWith(str2)) {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            jsPromptResult.cancel();
            Message messageObtainMessage = ToygerWebView.this.mHandler.obtainMessage(907);
            messageObtainMessage.obj = str3;
            ToygerWebView.this.mHandler.sendMessage(messageObtainMessage);
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                ToygerWebView.this.mProgressBar.setVisibility(8);
            } else {
                if (ToygerWebView.this.mProgressBar.getVisibility() == 8) {
                    ToygerWebView.this.mProgressBar.setVisibility(0);
                }
                ToygerWebView.this.mProgressBar.setProgress(i10);
            }
            super.onProgressChanged(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (str != null) {
                if (str.contains("404") || str.contains("500")) {
                    ToygerWebView.this.mHandler.sendMessage(ToygerWebView.this.mHandler.obtainMessage(908));
                }
            }
        }
    }

    public ToygerWebView(Context context, AttributeSet attributeSet) {
        super(getFixedContext(context), attributeSet);
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        this.mProgressBar = progressBar;
        progressBar.setLayoutParams(new AbsoluteLayout.LayoutParams(-1, 3, 0, 0));
        addView(this.mProgressBar);
        init();
    }

    private static Context getFixedContext(Context context) {
        return context;
    }

    public void init() {
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        setWebChromeClient(new a());
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) this.mProgressBar.getLayoutParams();
        layoutParams.x = i10;
        layoutParams.y = i11;
        this.mProgressBar.setLayoutParams(layoutParams);
        super.onScrollChanged(i10, i11, i12, i13);
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }
}
