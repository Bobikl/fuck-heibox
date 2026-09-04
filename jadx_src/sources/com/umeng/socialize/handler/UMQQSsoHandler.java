package com.umeng.socialize.handler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.max.hblogistics.bean.address.AdminRegionObj;
import com.tencent.connect.UserInfo;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UmengErrorCode;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.media.QQShareContent;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import g0.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UMQQSsoHandler extends UMTencentSSOHandler {
    private static final String TAG = "UMQQSsoHandler";
    private IUiListener mShareListener;
    private QQPreferences qqPreferences;
    private final String UNIONID_REQUEST_URL = "https://graph.qq.com/oauth2.0/me?access_token=";
    private final String UNIONID_PARAM = "&unionid=1";
    private IUiListener holder = null;

    /* JADX INFO: renamed from: com.umeng.socialize.handler.UMQQSsoHandler$5, reason: invalid class name */
    public class AnonymousClass5 implements IUiListener {
        final /* synthetic */ UMAuthListener val$listener;

        AnonymousClass5(UMAuthListener uMAuthListener) {
            this.val$listener = uMAuthListener;
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            UMQQSsoHandler.this.getAuthListener(this.val$listener).onCancel(SHARE_MEDIA.QQ, 0);
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(final Object obj) {
            SocializeUtils.safeCloseDialog(UMQQSsoHandler.this.mProgressDialog);
            final Bundle oauthData = UMQQSsoHandler.this.parseOauthData(obj);
            if (UMQQSsoHandler.this.qqPreferences == null && UMQQSsoHandler.this.getContext() != null) {
                UMQQSsoHandler.this.qqPreferences = new QQPreferences(UMQQSsoHandler.this.getContext(), SHARE_MEDIA.QQ.toString());
            }
            if (UMQQSsoHandler.this.qqPreferences != null) {
                UMQQSsoHandler.this.qqPreferences.setAuthData(oauthData).commit();
            }
            QueuedWork.runInBack(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.5.1
                @Override // java.lang.Runnable
                public void run() {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https://graph.qq.com/oauth2.0/me?access_token=");
                    UMQQSsoHandler uMQQSsoHandler = UMQQSsoHandler.this;
                    sb2.append(uMQQSsoHandler.getAccessToken(uMQQSsoHandler.qqPreferences));
                    sb2.append("&unionid=1");
                    String unionIdRequest = UMQQSsoHandler.this.getUnionIdRequest(sb2.toString());
                    if (!TextUtils.isEmpty(unionIdRequest)) {
                        try {
                            JSONObject jSONObject = new JSONObject(unionIdRequest.replace("callback", "").replace("(", "").replace(")", ""));
                            String strOptString = jSONObject.optString("unionid");
                            UMQQSsoHandler.this.setmOpenid(jSONObject.optString("openid"));
                            UMQQSsoHandler.this.setUnionid(strOptString);
                            if (UMQQSsoHandler.this.qqPreferences != null) {
                                UMQQSsoHandler.this.qqPreferences.commit();
                            }
                            String strOptString2 = jSONObject.optString("error_description");
                            if (!TextUtils.isEmpty(strOptString2)) {
                                SLog.E(UmengText.QQ.ERRORINFO + strOptString2);
                            }
                        } catch (JSONException e10) {
                            SLog.error(e10);
                        }
                    }
                    UMQQSsoHandler.this.initOpenidAndToken((JSONObject) obj);
                    final Map<String, String> mapBundleTomap = SocializeUtils.bundleTomap(oauthData);
                    UMQQSsoHandler uMQQSsoHandler2 = UMQQSsoHandler.this;
                    mapBundleTomap.put("unionid", uMQQSsoHandler2.getUnionid(uMQQSsoHandler2.qqPreferences));
                    QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.5.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            UMQQSsoHandler.this.getAuthListener(anonymousClass5.val$listener).onComplete(SHARE_MEDIA.QQ, 0, mapBundleTomap);
                        }
                    });
                    PlatformConfig.APPIDPlatform aPPIDPlatform = UMQQSsoHandler.this.config;
                    if (aPPIDPlatform != null) {
                        mapBundleTomap.put(CommonNetImpl.AID, aPPIDPlatform.appId);
                        mapBundleTomap.put(CommonNetImpl.AS, UMQQSsoHandler.this.config.appkey);
                    }
                }
            }, true);
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            UMQQSsoHandler.this.getAuthListener(this.val$listener).onError(SHARE_MEDIA.QQ, 0, new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + "==> errorCode = " + uiError.errorCode + ", errorMsg = " + uiError.errorMessage + ", detail = " + uiError.errorDetail));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendTokenToUserInfo(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String accessToken = getAccessToken(this.qqPreferences);
        String openId = getOpenId(this.qqPreferences);
        String expiresIn = getExpiresIn(this.qqPreferences);
        String unionid = getUnionid(this.qqPreferences);
        map.put("openid", openId);
        map.put("uid", openId);
        map.put("access_token", accessToken);
        map.put("expires_in", expiresIn);
        map.put("accessToken", accessToken);
        map.put("expiration", expiresIn);
        map.put("unionid", unionid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void authAndFetchUserInfo(final UMAuthListener uMAuthListener) {
        authorize(new UMAuthListener() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.11
            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i10) {
                UMQQSsoHandler.this.getAuthListener(uMAuthListener).onCancel(SHARE_MEDIA.QQ, 2);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
                UMQQSsoHandler.this.fetchUserInfo(uMAuthListener);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
                UMQQSsoHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.QQ, 2, th2);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        });
    }

    private Bundle buildShareContent(ShareContent shareContent) {
        QQShareContent qQShareContent = new QQShareContent(shareContent);
        UMShareConfig uMShareConfig = this.mShareConfig;
        if (uMShareConfig != null) {
            qQShareContent.setCompressListener(uMShareConfig.getCompressListener());
        }
        Bundle bundleBuildParams = qQShareContent.buildParams(getShareConfig().isHideQzoneOnQQFriendList(), getShareConfig().getAppName());
        bundleBuildParams.putString("appName", getShareConfig().getAppName());
        return bundleBuildParams;
    }

    private static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line + "/n");
                    } catch (Throwable th2) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            SLog.error(e10);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    SLog.error(e11);
                    inputStream.close();
                }
            } catch (IOException e12) {
                SLog.error(e12);
            }
        }
        inputStream.close();
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchUserInfo(final UMAuthListener uMAuthListener) {
        String accessToken = getAccessToken(this.qqPreferences);
        if (this.mTencent == null || !isValidAccessToken(accessToken)) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.9
                @Override // java.lang.Runnable
                public void run() {
                    UMQQSsoHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.QQ, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + "token is invalid"));
                }
            });
            return;
        }
        try {
            String expiresIn = getExpiresIn(this.qqPreferences);
            String openId = getOpenId(this.qqPreferences);
            if (!TextUtils.isEmpty(accessToken) && !TextUtils.isEmpty(expiresIn) && !TextUtils.isEmpty(openId)) {
                this.mTencent.setAccessToken(accessToken, expiresIn);
                this.mTencent.setOpenId(openId);
            }
            new UserInfo(getContext(), this.mTencent.getQQToken()).getUserInfo(getFetchUserInfoListener(uMAuthListener));
        } catch (Exception e10) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.8
                @Override // java.lang.Runnable
                public void run() {
                    UMQQSsoHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.QQ, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + e10.getMessage()));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAccessToken(QQPreferences qQPreferences) {
        if (qQPreferences != null) {
            return qQPreferences.getmAccessToken();
        }
        return null;
    }

    private String getExpiresIn(QQPreferences qQPreferences) {
        if (qQPreferences == null) {
            return null;
        }
        return QQPreferences.getExpiresIn() + "";
    }

    private IUiListener getFetchUserInfoListener(final UMAuthListener uMAuthListener) {
        return new IUiListener() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.10
            @Override // com.tencent.tauth.IUiListener
            public void onCancel() {
                UMQQSsoHandler.this.getAuthListener(uMAuthListener).onCancel(SHARE_MEDIA.QQ, 2);
            }

            @Override // com.tencent.tauth.IUiListener
            public void onComplete(Object obj) {
                if (uMAuthListener == null) {
                    return;
                }
                try {
                    Map<String, String> userInfo = UMQQSsoHandler.this.parseUserInfo(obj.toString());
                    UMQQSsoHandler.this.appendTokenToUserInfo(userInfo);
                    if (TextUtils.isEmpty(userInfo.get("ret")) || !userInfo.get("ret").equals("100030")) {
                        UMQQSsoHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.QQ, 2, userInfo);
                    } else {
                        UMQQSsoHandler.this.qqPreferencesDelete();
                        UMQQSsoHandler.this.authAndFetchUserInfo(uMAuthListener);
                    }
                } catch (JSONException unused) {
                    UMQQSsoHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.QQ, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + "parse json error"));
                }
            }

            @Override // com.tencent.tauth.IUiListener
            public void onError(UiError uiError) {
                UMQQSsoHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.QQ, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + uiError.errorMessage));
            }

            @Override // com.tencent.tauth.IUiListener
            public void onWarning(int i10) {
            }
        };
    }

    private String getOpenId(QQPreferences qQPreferences) {
        if (qQPreferences != null) {
            return qQPreferences.getmUID();
        }
        return null;
    }

    private IUiListener getQQSharelistener(final UMShareListener uMShareListener) {
        return new IUiListener() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.4
            @Override // com.tencent.tauth.IUiListener
            public void onCancel() {
                UMQQSsoHandler.this.getShareListener(uMShareListener).onCancel(SHARE_MEDIA.QQ);
            }

            @Override // com.tencent.tauth.IUiListener
            public void onComplete(Object obj) {
                UMQQSsoHandler.this.getShareListener(uMShareListener).onResult(SHARE_MEDIA.QQ);
            }

            @Override // com.tencent.tauth.IUiListener
            public void onError(UiError uiError) {
                String str = uiError == null ? "" : uiError.errorMessage;
                UMQQSsoHandler.this.getShareListener(uMShareListener).onError(SHARE_MEDIA.QQ, new Throwable(UmengErrorCode.ShareFailed.getMessage() + str));
            }

            @Override // com.tencent.tauth.IUiListener
            public void onWarning(int i10) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUnionIdRequest(String str) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (uRLConnectionOpenConnection == null) {
                return "";
            }
            uRLConnectionOpenConnection.connect();
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            return inputStream == null ? "" : convertStreamToString(inputStream);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUnionid(QQPreferences qQPreferences) {
        if (qQPreferences != null) {
            return qQPreferences.getUnionid();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOpenidAndToken(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("access_token");
            String string2 = jSONObject.getString("expires_in");
            String string3 = jSONObject.getString("openid");
            if (this.mTencent == null || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return;
            }
            this.mTencent.setAccessToken(string, string2);
            this.mTencent.setOpenId(string3);
        } catch (Exception e10) {
            SLog.error(UmengText.QQ.OPENIDANDTOKEN, e10);
        }
    }

    private boolean isValidAccessToken(String str) {
        return !TextUtils.isEmpty(str);
    }

    private void loginDeal() {
        if (!isInstall()) {
            if (this.holder == null) {
                this.holder = getQQAuthlistener(this.mAuthListener);
            }
            Tencent tencent = this.mTencent;
            if (tencent != null) {
                tencent.loginServerSide(this.mWeakAct.get(), "all", this.holder);
                return;
            }
            return;
        }
        if (this.mWeakAct.get() == null || this.mWeakAct.get().isFinishing()) {
            return;
        }
        if (this.holder == null) {
            this.holder = getQQAuthlistener(this.mAuthListener);
        }
        Tencent tencent2 = this.mTencent;
        if (tencent2 != null) {
            tencent2.login(this.mWeakAct.get(), "all", this.holder);
        }
    }

    private void onNotInstall(final UMShareListener uMShareListener) {
        if (Config.isJumptoAppStore) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(SocializeConstants.DOWN_URL_QQ));
            this.mWeakAct.get().startActivity(intent);
        }
        QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.2
            @Override // java.lang.Runnable
            public void run() {
                UMQQSsoHandler.this.getShareListener(uMShareListener).onError(SHARE_MEDIA.QQ, new Throwable(UmengErrorCode.NotInstall.getMessage()));
            }
        });
    }

    private void onShareParamsError(final UMShareListener uMShareListener, final String str) {
        QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.3
            @Override // java.lang.Runnable
            public void run() {
                UMQQSsoHandler.this.getShareListener(uMShareListener).onError(SHARE_MEDIA.QQ, new Throwable(UmengErrorCode.ShareDataTypeIllegal.getMessage() + str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> parseUserInfo(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        map.put("screen_name", jSONObject.optString("nickname"));
        map.put("name", jSONObject.optString("nickname"));
        map.put(a.G, getGender(jSONObject.optString(a.G)));
        map.put("profile_image_url", jSONObject.optString("figureurl_qq_2"));
        map.put("iconurl", jSONObject.optString("figureurl_qq_2"));
        map.put("is_yellow_year_vip", jSONObject.optString("is_yellow_year_vip"));
        map.put("yellow_vip_level", jSONObject.optString("yellow_vip_level"));
        map.put("msg", jSONObject.optString("msg"));
        map.put(AdminRegionObj.TYPE_CITY, jSONObject.optString(AdminRegionObj.TYPE_CITY));
        map.put("vip", jSONObject.optString("vip"));
        map.put("ret", jSONObject.optString("ret"));
        map.put("level", jSONObject.optString("level"));
        map.put(AdminRegionObj.TYPE_PROVINCE, jSONObject.optString(AdminRegionObj.TYPE_PROVINCE));
        map.put("is_yellow_vip", jSONObject.optString("is_yellow_vip"));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qqPreferencesDelete() {
        QQPreferences qQPreferences = this.qqPreferences;
        if (qQPreferences != null) {
            qQPreferences.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnionid(String str) {
        QQPreferences qQPreferences = this.qqPreferences;
        if (qQPreferences != null) {
            qQPreferences.setUnionid(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setmOpenid(String str) {
        QQPreferences qQPreferences = this.qqPreferences;
        if (qQPreferences != null) {
            qQPreferences.setmOpenid(str);
        }
    }

    private void shareToQQ(final Bundle bundle) {
        if (validTencent()) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.7
                @Override // java.lang.Runnable
                public void run() {
                    UMQQSsoHandler uMQQSsoHandler = UMQQSsoHandler.this;
                    if (uMQQSsoHandler.mTencent == null || uMQQSsoHandler.mWeakAct.get() == null || UMQQSsoHandler.this.mWeakAct.get().isFinishing()) {
                        return;
                    }
                    UMQQSsoHandler uMQQSsoHandler2 = UMQQSsoHandler.this;
                    uMQQSsoHandler2.mTencent.shareToQQ(uMQQSsoHandler2.mWeakAct.get(), bundle, UMQQSsoHandler.this.mShareListener);
                }
            });
            return;
        }
        IUiListener iUiListener = this.mShareListener;
        String str = UmengText.QQ.QQ_ERROR;
        iUiListener.onError(new UiError(-1, str, str));
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void authorize(UMAuthListener uMAuthListener) {
        this.mAuthListener = uMAuthListener;
        loginDeal();
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void deleteAuth(final UMAuthListener uMAuthListener) {
        Tencent tencent = this.mTencent;
        if (tencent != null) {
            tencent.logout(getContext());
        }
        qqPreferencesDelete();
        QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.6
            @Override // java.lang.Runnable
            public void run() {
                UMQQSsoHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.QQ, 1, null);
                if (UMQQSsoHandler.this.holder != null) {
                    UMQQSsoHandler.this.holder = null;
                }
            }
        });
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void getPlatformInfo(UMAuthListener uMAuthListener) {
        if (!isAuthorize() || getShareConfig().isNeedAuthOnGetUserInfo()) {
            authAndFetchUserInfo(uMAuthListener);
        } else {
            fetchUserInfo(uMAuthListener);
        }
    }

    protected IUiListener getQQAuthlistener(UMAuthListener uMAuthListener) {
        return new AnonymousClass5(uMAuthListener);
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public int getRequestCode() {
        return 10103;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getSDKVersion() {
        return gg.a.f119052f;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isAuthorize() {
        QQPreferences qQPreferences = this.qqPreferences;
        if (qQPreferences != null) {
            return qQPreferences.isAuthValid();
        }
        return false;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isHasAuthListener() {
        return this.mAuthListener != null;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isInstall() {
        Tencent tencent = this.mTencent;
        return tencent != null && tencent.isSupportSSOLogin(this.mWeakAct.get());
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupport() {
        Tencent tencent = this.mTencent;
        return tencent != null && tencent.isSupportSSOLogin(this.mWeakAct.get());
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupportAuth() {
        return true;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 10103) {
            Tencent.onActivityResultData(i10, i11, intent, this.mShareListener);
        }
        if (i10 == 11101) {
            if (this.holder == null) {
                this.holder = getQQAuthlistener(this.mAuthListener);
            }
            Tencent.onActivityResultData(i10, i11, intent, this.holder);
        }
    }

    @Override // com.umeng.socialize.handler.UMTencentSSOHandler, com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(Context context, PlatformConfig.Platform platform) {
        super.onCreate(context, platform);
        if (context != null) {
            this.qqPreferences = new QQPreferences(context, SHARE_MEDIA.QQ.toString());
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void release() {
        super.release();
        if (this.holder != null) {
            this.holder = null;
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void setAuthListener(UMAuthListener uMAuthListener) {
        super.setAuthListener(uMAuthListener);
        this.mAuthListener = uMAuthListener;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(ShareContent shareContent, final UMShareListener uMShareListener) {
        if (this.mTencent == null) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMQQSsoHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    UMQQSsoHandler.this.getShareListener(uMShareListener).onError(SHARE_MEDIA.QQ, new Throwable(UmengErrorCode.ShareFailed.getMessage() + UmengText.tencentEmpty(Config.isUmengQQ.booleanValue())));
                }
            });
            return false;
        }
        if (!isInstall()) {
            onNotInstall(uMShareListener);
            return false;
        }
        Bundle bundleBuildShareContent = buildShareContent(shareContent);
        String string = bundleBuildShareContent.getString("error");
        if (!TextUtils.isEmpty(string)) {
            onShareParamsError(uMShareListener, string);
            return false;
        }
        this.mShareListener = getQQSharelistener(uMShareListener);
        shareToQQ(bundleBuildShareContent);
        return false;
    }
}
