package com.umeng.socialize.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.socialize.bean.PlatformName;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.ResContainer;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseDialog extends Dialog {
    public final ResContainer R;
    public Activity mActivity;
    public View mContent;
    public Context mContext;
    public int mFlag;
    public Handler mHandler;
    public SHARE_MEDIA mPlatform;
    public View mProgressbar;
    public Bundle mValues;
    public String mWaitUrl;
    public WebView mWebView;
    public TextView titleMidTv;

    public BaseDialog(Activity activity, SHARE_MEDIA share_media) {
        super(activity, ResContainer.get(activity).style("umeng_socialize_popup_dialog"));
        this.mFlag = 0;
        this.mWaitUrl = "error";
        this.mHandler = new Handler() { // from class: com.umeng.socialize.view.BaseDialog.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                View view;
                super.handleMessage(message);
                if (message.what != 1 || (view = BaseDialog.this.mProgressbar) == null) {
                    return;
                }
                view.setVisibility(8);
            }
        };
        Context applicationContext = activity.getApplicationContext();
        this.mContext = applicationContext;
        this.R = ResContainer.get(applicationContext);
        this.mActivity = activity;
        this.mPlatform = share_media;
    }

    public void initViews() {
        setOwnerActivity(this.mActivity);
        LayoutInflater layoutInflater = (LayoutInflater) this.mActivity.getSystemService("layout_inflater");
        int iLayout = this.R.layout("umeng_socialize_oauth_dialog");
        int iId = this.R.id("umeng_socialize_follow");
        String str = null;
        View viewInflate = layoutInflater.inflate(iLayout, (ViewGroup) null);
        this.mContent = viewInflate;
        final View viewFindViewById = viewInflate.findViewById(iId);
        viewFindViewById.setVisibility(8);
        int iId2 = this.R.id("progress_bar_parent");
        int iId3 = this.R.id("umeng_back");
        int iId4 = this.R.id("umeng_share_btn");
        int iId5 = this.R.id("umeng_title");
        int iId6 = this.R.id("umeng_socialize_titlebar");
        View viewFindViewById2 = this.mContent.findViewById(iId2);
        this.mProgressbar = viewFindViewById2;
        viewFindViewById2.setVisibility(0);
        ((RelativeLayout) this.mContent.findViewById(iId3)).setOnClickListener(new View.OnClickListener() { // from class: com.umeng.socialize.view.BaseDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseDialog.this.dismiss();
            }
        });
        this.mContent.findViewById(iId4).setVisibility(8);
        this.titleMidTv = (TextView) this.mContent.findViewById(iId5);
        if (this.mPlatform.toString().equals("SINA")) {
            str = PlatformName.SINA;
        } else if (this.mPlatform.toString().equals("DOUBAN")) {
            str = PlatformName.DOUBAN;
        }
        this.titleMidTv.setText("授权" + str);
        setUpWebView();
        final View viewFindViewById3 = this.mContent.findViewById(iId6);
        final int iDip2Px = SocializeUtils.dip2Px(this.mContext, 200.0f);
        FrameLayout frameLayout = new FrameLayout(this.mContext) { // from class: com.umeng.socialize.view.BaseDialog.3
            private void a(final View view, final View view2, int i10, int i11) {
                if (view2.getVisibility() == 0 && i11 < i10) {
                    BaseDialog.this.mHandler.post(new Runnable() { // from class: com.umeng.socialize.view.BaseDialog.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            view2.setVisibility(8);
                            if (view.getVisibility() == 0) {
                                view.setVisibility(8);
                            }
                            requestLayout();
                        }
                    });
                } else {
                    if (view2.getVisibility() == 0 || i11 < i10) {
                        return;
                    }
                    BaseDialog.this.mHandler.post(new Runnable() { // from class: com.umeng.socialize.view.BaseDialog.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            view2.setVisibility(0);
                            requestLayout();
                        }
                    });
                }
            }

            @Override // android.view.View
            protected void onSizeChanged(int i10, int i11, int i12, int i13) {
                super.onSizeChanged(i10, i11, i12, i13);
                if (SocializeUtils.isFloatWindowStyle(BaseDialog.this.mContext)) {
                    return;
                }
                a(viewFindViewById, viewFindViewById3, iDip2Px, i11);
            }
        };
        frameLayout.addView(this.mContent, -1, -1);
        setContentView(frameLayout);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (SocializeUtils.isFloatWindowStyle(this.mContext)) {
            int[] floatWindowSize = SocializeUtils.getFloatWindowSize(this.mContext);
            attributes.width = floatWindowSize[0];
            attributes.height = floatWindowSize[1];
        } else {
            attributes.height = -1;
            attributes.width = -1;
        }
        attributes.gravity = 17;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    public void releaseWebView() {
        try {
            ((ViewGroup) this.mWebView.getParent()).removeView(this.mWebView);
        } catch (Exception unused) {
        }
        try {
            this.mWebView.removeAllViews();
        } catch (Exception unused2) {
        }
        this.mWebView = null;
    }

    public void removeJavascriptInterface(WebView webView) {
    }

    public abstract void setClient(WebView webView);

    public boolean setUpWebView() {
        WebView webView = (WebView) this.mContent.findViewById(this.R.id("webView"));
        this.mWebView = webView;
        setClient(webView);
        this.mWebView.requestFocusFromTouch();
        this.mWebView.setVerticalScrollBarEnabled(false);
        this.mWebView.setHorizontalScrollBarEnabled(false);
        this.mWebView.setScrollBarStyle(0);
        this.mWebView.getSettings().setCacheMode(2);
        this.mWebView.setBackgroundColor(-1);
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception e10) {
            SLog.error(e10);
        }
        try {
            this.mWebView.removeJavascriptInterface("searchBoxJavaBridge_");
            this.mWebView.removeJavascriptInterface("accessibility");
            this.mWebView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
        return true;
    }

    public void setWaitUrl(String str) {
        this.mWaitUrl = str;
    }
}
