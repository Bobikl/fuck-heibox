package com.umeng.socialize.handler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.openapi.WBAPIFactory;
import com.sina.weibo.sdk.share.WbShareCallback;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UmengErrorCode;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.media.SinaShareContent;
import com.umeng.socialize.net.DeleteRequest;
import com.umeng.socialize.net.UserinfoRequest;
import com.umeng.socialize.net.UserinfoResponse;
import com.umeng.socialize.net.base.SocializeClient;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import g0.a;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SinaSsoHandler extends UMSSOHandler {
    private static final int REQUEST_CODE = 10001;
    private static final String REQUEST_USERINFO = "https://api.weibo.com/2/users/show.json";
    private static final String SCOPE = "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write";
    private static final String TAG = "SinaSsoHandler";
    private static final String USERNAME = "userName";
    private Activity activity;
    WeakReference<Activity> mActivityStack;
    private Context mAppContext;
    private AuthInfo mAuthInfo;
    private AuthListener mAuthListener;
    private String mFileProvider;
    private ShareListener mShareListener;
    private IWBAPI mWBAPI;
    private WeiboMultiMessage message;
    private UMShareListener shareListener;
    private SinaPreferences sinaPreferences;
    UMAuthListener umAuthListener;
    private PlatformConfig.APPIDPlatform config = null;
    private boolean startAuthRequest = false;
    protected String VERSION = "7.3.0";
    private boolean mWBinit = false;
    private boolean ShareTag = false;
    private boolean LoginTag = false;
    public ShareContent shareContent = new ShareContent();

    public class AuthListener implements WbAuthListener {
        private UMAuthListener mListener;

        AuthListener(UMAuthListener uMAuthListener) {
            this.mListener = uMAuthListener;
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onCancel() {
            UMAuthListener uMAuthListener = this.mListener;
            if (uMAuthListener != null) {
                uMAuthListener.onCancel(SHARE_MEDIA.SINA, 0);
                SinaSsoHandler.this.startAuthRequest = false;
            }
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onComplete(Oauth2AccessToken oauth2AccessToken) {
            Bundle bundle = SinaSsoHandler.this.tokenToBundle(oauth2AccessToken);
            SinaSsoHandler.this.setAuthData(bundle);
            if (this.mListener != null) {
                bundle.putString(CommonNetImpl.AID, SinaSsoHandler.this.config.appId);
                bundle.putString(CommonNetImpl.AS, SinaSsoHandler.this.config.appkey);
                bundle.putString("name", bundle.getString(SinaSsoHandler.USERNAME));
                bundle.putString("accessToken", bundle.getString("access_token"));
                bundle.putString("refreshToken", bundle.getString("refresh_token"));
                bundle.putString("expiration", bundle.getString("expires_in"));
                this.mListener.onComplete(SHARE_MEDIA.SINA, 0, SocializeUtils.bundleTomap(bundle));
                SinaSsoHandler.this.startAuthRequest = false;
            }
        }

        @Override // com.sina.weibo.sdk.auth.WbAuthListener
        public void onError(UiError uiError) {
            UMAuthListener uMAuthListener = this.mListener;
            if (uMAuthListener != null) {
                uMAuthListener.onError(SHARE_MEDIA.SINA, 0, new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + uiError.errorMessage));
                SinaSsoHandler.this.startAuthRequest = false;
            }
        }
    }

    public class ShareListener implements WbShareCallback {
        private UMShareListener shareListenerInner;

        public ShareListener(UMShareListener uMShareListener) {
            this.shareListenerInner = uMShareListener;
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onCancel() {
            UMShareListener uMShareListener = this.shareListenerInner;
            if (uMShareListener != null) {
                uMShareListener.onCancel(SHARE_MEDIA.SINA);
            }
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onComplete() {
            UMShareListener uMShareListener = this.shareListenerInner;
            if (uMShareListener != null) {
                uMShareListener.onResult(SHARE_MEDIA.SINA);
            }
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onError(UiError uiError) {
            UMShareListener uMShareListener = this.shareListenerInner;
            if (uMShareListener != null) {
                String str = uiError.errorMessage;
                uMShareListener.onError(SHARE_MEDIA.SINA, new Throwable(UmengErrorCode.ShareFailed.getMessage() + str));
            }
        }
    }

    private void authAndFetchUserInfo(final UMAuthListener uMAuthListener) {
        authorize(new UMAuthListener() { // from class: com.umeng.socialize.handler.SinaSsoHandler.6
            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i10) {
                uMAuthListener.onCancel(share_media, i10);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
                QueuedWork.runInBack(new Runnable() { // from class: com.umeng.socialize.handler.SinaSsoHandler.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                        SinaSsoHandler.this.userinfo(uMAuthListener);
                    }
                }, false);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
                uMAuthListener.onError(share_media, i10, th2);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        });
    }

    private String getUID() {
        SinaPreferences sinaPreferences = this.sinaPreferences;
        return sinaPreferences != null ? sinaPreferences.getUID() : "";
    }

    private String getmAccessToken() {
        SinaPreferences sinaPreferences = this.sinaPreferences;
        return (sinaPreferences == null || sinaPreferences.getmAccessToken() == null) ? "" : this.sinaPreferences.getmAccessToken();
    }

    private String getmRefreshToken() {
        SinaPreferences sinaPreferences = this.sinaPreferences;
        return sinaPreferences != null ? sinaPreferences.getmRefreshToken() : "";
    }

    private long getmTTL() {
        SinaPreferences sinaPreferences = this.sinaPreferences;
        if (sinaPreferences != null) {
            return sinaPreferences.getmTTL();
        }
        return 0L;
    }

    private boolean isClientInstalled() {
        return this.mWBAPI.isWBAppInstalled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthData(Bundle bundle) {
        SinaPreferences sinaPreferences = this.sinaPreferences;
        if (sinaPreferences != null) {
            sinaPreferences.setAuthData(bundle).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle tokenToBundle(Oauth2AccessToken oauth2AccessToken) {
        Bundle bundle = new Bundle();
        bundle.putString(USERNAME, oauth2AccessToken.getUid());
        bundle.putString("uid", oauth2AccessToken.getUid());
        bundle.putString("access_token", oauth2AccessToken.getAccessToken());
        bundle.putString("refresh_token", oauth2AccessToken.getRefreshToken());
        bundle.putString("expires_in", oauth2AccessToken.getExpiresTime() + "");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void userinfo(final UMAuthListener uMAuthListener) {
        UserinfoResponse userinfoResponse = (UserinfoResponse) new SocializeClient().execute(new UserinfoRequest(getUID(), getmAccessToken(), this.config.appId));
        if (userinfoResponse == null) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.SinaSsoHandler.2
                @Override // java.lang.Runnable
                public void run() {
                    uMAuthListener.onError(SHARE_MEDIA.SINA, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed + UmengText.SINA.SINA_GET_ERROR));
                }
            });
            return;
        }
        final Map<String, String> map = userinfoResponse.result;
        if (map == null || map.containsKey("error")) {
            if (map == null) {
                QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.SinaSsoHandler.5
                    @Override // java.lang.Runnable
                    public void run() {
                        uMAuthListener.onError(SHARE_MEDIA.SINA, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed + UmengText.AUTH.DATA_EMPTY));
                    }
                });
                return;
            }
            SinaPreferences sinaPreferences = this.sinaPreferences;
            if (sinaPreferences != null) {
                sinaPreferences.delete();
            }
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.SinaSsoHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    uMAuthListener.onError(SHARE_MEDIA.SINA, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed + ((String) map.get("error")).toString()));
                }
            });
            return;
        }
        map.put("iconurl", map.get("profile_image_url"));
        map.put("name", map.get("screen_name"));
        map.put(a.G, getGender(map.get(a.G)));
        SinaPreferences sinaPreferences2 = this.sinaPreferences;
        if (sinaPreferences2 != null) {
            map.put("uid", sinaPreferences2.getUID());
            map.put("access_token", this.sinaPreferences.getmAccessToken());
            map.put("refreshToken", this.sinaPreferences.getmRefreshToken());
            map.put("expires_in", String.valueOf(this.sinaPreferences.getmTTL()));
            map.put("accessToken", this.sinaPreferences.getmAccessToken());
            map.put("refreshToken", this.sinaPreferences.getmRefreshToken());
            map.put("expiration", String.valueOf(this.sinaPreferences.getmTTL()));
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.SinaSsoHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    uMAuthListener.onComplete(SHARE_MEDIA.SINA, 2, map);
                }
            });
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void authorize(UMAuthListener uMAuthListener) {
        if (!this.mWBinit) {
            this.LoginTag = true;
            this.umAuthListener = uMAuthListener;
            return;
        }
        this.mAuthListener = new AuthListener(uMAuthListener);
        if (this.mWBAPI != null) {
            if (getShareConfig().isSinaAuthWithWebView()) {
                this.startAuthRequest = true;
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> SINA:authorize: authorizeWeb");
                this.mWBAPI.authorizeWeb(this.activity, this.mAuthListener);
            } else {
                this.startAuthRequest = true;
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> SINA:authorize: authorize");
                this.mWBAPI.authorize(this.activity, this.mAuthListener);
            }
        }
    }

    public boolean checkAndroidNotBelowN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void deleteAuth(final UMAuthListener uMAuthListener) {
        DeleteRequest deleteRequest = new DeleteRequest(this.config.appId, getmAccessToken());
        SinaPreferences sinaPreferences = this.sinaPreferences;
        if (sinaPreferences != null) {
            sinaPreferences.delete();
        }
        SinaPreferences sinaPreferences2 = this.sinaPreferences;
        if (sinaPreferences2 != null) {
            sinaPreferences2.delete();
        }
        QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.SinaSsoHandler.7
            @Override // java.lang.Runnable
            public void run() {
                uMAuthListener.onComplete(SinaSsoHandler.this.getConfig().getName(), 1, null);
            }
        });
    }

    public boolean getActivity() {
        return this.mActivityStack.get() != null;
    }

    public WeiboMultiMessage getMessage() {
        return this.message;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void getPlatformInfo(UMAuthListener uMAuthListener) {
        if (getShareConfig().isNeedAuthOnGetUserInfo() || !this.sinaPreferences.isAuthValid()) {
            authAndFetchUserInfo(uMAuthListener);
        } else {
            userinfo(uMAuthListener);
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public int getRequestCode() {
        return 10001;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getSDKVersion() {
        return "11.11.1";
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getVersion() {
        return this.VERSION;
    }

    public IWBAPI getWbHandler() {
        return this.mWBAPI;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isAuthorize() {
        SinaPreferences sinaPreferences = this.sinaPreferences;
        if (sinaPreferences != null) {
            return sinaPreferences.isAuthorized();
        }
        return false;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isInstall() {
        return isClientInstalled();
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupport() {
        return true;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupportAuth() {
        return true;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mWBAPI != null && getActivity()) {
            if (this.startAuthRequest) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> SINA:onActivityResult:auth callback.");
                this.mWBAPI.authorizeCallback(this.activity, i10, i11, intent);
            } else {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> SINA:onActivityResult:share callback.");
                this.mWBAPI.doResultIntent(intent, this.mShareListener);
            }
        }
        this.mWBAPI = null;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(Context context, PlatformConfig.Platform platform) {
        super.onCreate(context, platform);
        this.mAppContext = context.getApplicationContext();
        PlatformConfig.APPIDPlatform aPPIDPlatform = (PlatformConfig.APPIDPlatform) platform;
        this.config = aPPIDPlatform;
        if (TextUtils.isEmpty(aPPIDPlatform.getFileProvider())) {
            SLog.E(UmengText.SINA.SINA_FILE_PROVIDER_ERROR);
        } else {
            this.mFileProvider = this.config.getFileProvider();
        }
        this.sinaPreferences = new SinaPreferences(context, "sina");
        this.mAuthInfo = new AuthInfo(context, aPPIDPlatform.appId, ((PlatformConfig.APPIDPlatform) getConfig()).redirectUrl, SCOPE);
        if (context instanceof Activity) {
            this.activity = (Activity) context;
            this.mActivityStack = new WeakReference<>(this.activity);
            IWBAPI iwbapiCreateWBAPI = WBAPIFactory.createWBAPI(context);
            this.mWBAPI = iwbapiCreateWBAPI;
            iwbapiCreateWBAPI.registerApp(context, this.mAuthInfo, new SdkListener() { // from class: com.umeng.socialize.handler.SinaSsoHandler.1
                @Override // com.sina.weibo.sdk.openapi.SdkListener
                public void onInitFailure(Exception exc) {
                    SinaSsoHandler.this.mWBinit = false;
                }

                @Override // com.sina.weibo.sdk.openapi.SdkListener
                public void onInitSuccess() {
                    SinaSsoHandler.this.mWBinit = true;
                    if (SinaSsoHandler.this.ShareTag) {
                        SinaSsoHandler.this.ShareTag = false;
                        SinaSsoHandler sinaSsoHandler = SinaSsoHandler.this;
                        sinaSsoHandler.share(sinaSsoHandler.shareContent, sinaSsoHandler.shareListener);
                    }
                    if (SinaSsoHandler.this.LoginTag) {
                        SinaSsoHandler.this.LoginTag = false;
                        SinaSsoHandler sinaSsoHandler2 = SinaSsoHandler.this;
                        sinaSsoHandler2.authorize(sinaSsoHandler2.umAuthListener);
                    }
                }
            });
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void release() {
        super.release();
        this.mWBAPI = null;
        this.activity = null;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(ShareContent shareContent, UMShareListener uMShareListener) {
        if (!this.mWBinit) {
            this.ShareTag = true;
            this.shareContent = shareContent;
            this.shareListener = uMShareListener;
            return false;
        }
        Log.e("UMRTLog.RTLOG_TAG", "分享中");
        boolean zCheckAndroidNotBelowN = checkAndroidNotBelowN();
        SinaShareContent sinaShareContent = new SinaShareContent(shareContent);
        UMShareConfig uMShareConfig = this.mShareConfig;
        if (uMShareConfig != null) {
            sinaShareContent.setCompressListener(uMShareConfig.getCompressListener());
        }
        sinaShareContent.setSupport(this.mWBAPI.isWBAppSupportMultipleImage());
        this.message = sinaShareContent.getMessage(this.mAppContext, zCheckAndroidNotBelowN, this.mFileProvider);
        this.shareListener = uMShareListener;
        this.mShareListener = new ShareListener(uMShareListener);
        this.startAuthRequest = false;
        if (this.mWeakAct.get() != null && !this.mWeakAct.get().isFinishing() && this.mWBAPI != null) {
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> SINA: share");
            this.mWBAPI.shareMessage(this.activity, this.message, false);
        }
        return true;
    }
}
