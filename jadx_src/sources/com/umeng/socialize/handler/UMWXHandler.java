package com.umeng.socialize.handler;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.max.hblogistics.bean.address.AdminRegionObj;
import com.max.mediaselector.lib.config.h;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.StringName;
import com.umeng.socialize.bean.UmengErrorCode;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.WeiXinShareContent;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import com.umeng.socialize.utils.UrlUtil;
import com.umeng.socialize.weixin.net.WXAuthUtils;
import g0.a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UMWXHandler extends UMSSOHandler {
    private static final String ERRMSG = "errmsg";
    private static final String ERRORCODE = "errcode";
    private static final String ERROR_CODE_TOKEN_ACCESS_FAIL = "42002";
    private static final String ERROR_CODE_TOKEN_FAIL = "40001";
    private static final String ERROR_CODE_TOKEN_REFESH_FAIL = "40030";
    private static final String HEADIMGURL = "headimgurl";
    private static final String LANGUAGE = "language";
    private static final String NICKNAME = "nickname";
    private static final String PRIVILEGE = "privilege";
    private static final int REFRESH_TOKEN_EXPIRES = 604800;
    private static final String REFRESH_TOKEN_EXPIRES_KEY = "refresh_token_expires";
    private static final int RESP_TYPE_AUTH = 1;
    private static final int RESP_TYPE_SHARE = 2;
    private static final String SEX = "sex";
    private static final String TAG = "UMWXHandler";
    private static String sScope = "snsapi_userinfo,snsapi_friend,snsapi_message";
    private PlatformConfig.APPIDPlatform config;
    private Context mAppContext;
    private UMAuthListener mAuthListener;
    private String mFileProvider;
    private IWXAPI mWXApi;
    private UMShareListener umShareListener;
    private WeixinPreferences weixinPreferences;
    private String VERSION = "7.3.0";
    private SHARE_MEDIA mTarget = SHARE_MEDIA.WEIXIN;
    private IWXAPIEventHandler mEventHandler = new IWXAPIEventHandler() { // from class: com.umeng.socialize.handler.UMWXHandler.22
        @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
        public void onReq(BaseReq baseReq) {
        }

        @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
        public void onResp(BaseResp baseResp) {
            int type = baseResp.getType();
            if (type == 1) {
                UMWXHandler.this.onAuthCallback((SendAuth.Resp) baseResp);
            } else {
                if (type != 2) {
                    return;
                }
                UMWXHandler.this.onShareCallback((SendMessageToWX.Resp) baseResp);
            }
        }
    };

    /* JADX INFO: renamed from: com.umeng.socialize.handler.UMWXHandler$23, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass23 {
        static final /* synthetic */ int[] $SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA;

        static {
            int[] iArr = new int[SHARE_MEDIA.values().length];
            $SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA = iArr;
            try {
                iArr[SHARE_MEDIA.WEIXIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA[SHARE_MEDIA.WEIXIN_CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA[SHARE_MEDIA.WEIXIN_FAVORITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private String buildTransaction(String str) {
        if (str == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return str + System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchUserInfo(final UMAuthListener uMAuthListener) {
        String openid = getOpenid();
        final String strRequest = WXAuthUtils.request("https://api.weixin.qq.com/sns/userinfo?access_token=" + getAccessToken() + "&openid=" + openid + "&lang=zh_CN");
        if (TextUtils.isEmpty(strRequest) || strRequest.startsWith("##")) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.6
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.WEIXIN, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + strRequest));
                }
            });
            return;
        }
        final Map<String, String> userInfo = parseUserInfo(strRequest);
        if (userInfo == null) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.7
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.WEIXIN, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + strRequest));
                }
            });
            return;
        }
        if (!userInfo.containsKey("errcode")) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.9
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 2, userInfo);
                }
            });
        } else if (!userInfo.get("errcode").equals(ERROR_CODE_TOKEN_FAIL)) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.8
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.WEIXIN, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + ((String) userInfo.get("errcode"))));
                }
            });
        } else {
            weixinPreferencesDelete();
            authorize(uMAuthListener);
        }
    }

    private String getAccessToken() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        return weixinPreferences != null ? weixinPreferences.getAccessToken() : "";
    }

    private long getAccessTokenTTL() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        if (weixinPreferences != null) {
            return weixinPreferences.getAccessTokenTTL();
        }
        return 0L;
    }

    private void getAuthWithCode(String str, final UMAuthListener uMAuthListener) {
        final StringBuilder sb2 = new StringBuilder();
        String str2 = this.config.appkey;
        if (str2 != null && !str2.isEmpty()) {
            sb2.append("https://api.weixin.qq.com/sns/oauth2/access_token?");
            sb2.append("appid=");
            sb2.append(this.config.appId);
            sb2.append("&secret=");
            sb2.append(this.config.appkey);
            sb2.append("&code=");
            sb2.append(str);
            sb2.append("&grant_type=authorization_code");
            QueuedWork.runInBack(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    String strRequest = WXAuthUtils.request(sb2.toString());
                    try {
                        final Map<String, String> mapJsonToMap = SocializeUtils.jsonToMap(strRequest);
                        if (mapJsonToMap == null || mapJsonToMap.size() == 0) {
                            UMWXHandler.this.getMap();
                        }
                        UMWXHandler.this.setBundle(UMWXHandler.this.parseAuthData(strRequest));
                        QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (mapJsonToMap.get("errcode") != null) {
                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                    UMWXHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.WEIXIN, 0, new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + ((String) mapJsonToMap.get(UMWXHandler.ERRMSG))));
                                } else {
                                    AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                                    UMWXHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 0, mapJsonToMap);
                                }
                                mapJsonToMap.put(CommonNetImpl.AID, UMWXHandler.this.config.appId);
                                mapJsonToMap.put(CommonNetImpl.AS, UMWXHandler.this.config.appkey);
                                Map map = mapJsonToMap;
                                map.put("uid", map.get("openid"));
                                Map map2 = mapJsonToMap;
                                map2.put("unionid", map2.get("unionid"));
                            }
                        });
                    } catch (Exception e10) {
                        SLog.error(e10);
                    }
                }
            }, true);
            return;
        }
        sb2.append("https://oauth2.umeng.com/oauth/token/acquire?");
        String appkey = SocializeUtils.getAppkey(getContext());
        sb2.append("appkey=");
        sb2.append(appkey);
        sb2.append("&source=");
        sb2.append("wechat");
        sb2.append("&appId=");
        sb2.append(this.config.appId);
        sb2.append("&code=");
        sb2.append(str);
        QueuedWork.runInBack(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.4
            @Override // java.lang.Runnable
            public void run() {
                String strRequest = WXAuthUtils.request(sb2.toString());
                try {
                    final HashMap map = new HashMap();
                    JSONObject jSONObjectJsonObjectExt = SocializeUtils.jsonObjectExt(strRequest);
                    if (jSONObjectJsonObjectExt != null) {
                        if (jSONObjectJsonObjectExt.getInt("code") == 200) {
                            jSONObjectJsonObjectExt = jSONObjectJsonObjectExt.getJSONObject("data");
                        }
                        Iterator<String> itKeys = jSONObjectJsonObjectExt.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectJsonObjectExt.get(next) + "");
                        }
                    }
                    if (map.size() == 0) {
                        UMWXHandler.this.getMap();
                    }
                    if (jSONObjectJsonObjectExt != null) {
                        UMWXHandler.this.setBundle(UMWXHandler.this.parseAuthData(jSONObjectJsonObjectExt.toString()));
                    }
                    QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (map.get("errcode") == null && map.get("code") == null) {
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                UMWXHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 0, map);
                            } else {
                                Throwable th2 = new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + ((String) map.get(UMWXHandler.ERRMSG)));
                                AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                                UMWXHandler.this.getAuthListener(uMAuthListener).onError(SHARE_MEDIA.WEIXIN, 0, th2);
                            }
                            map.put(CommonNetImpl.AID, UMWXHandler.this.config.appId);
                            map.put(CommonNetImpl.AS, UMWXHandler.this.config.appkey);
                            Map map2 = map;
                            map2.put("uid", map2.get("openid"));
                            Map map3 = map;
                            map3.put("unionid", map3.get("unionid"));
                        }
                    });
                } catch (Exception e10) {
                    SLog.error(e10);
                }
            }
        }, true);
    }

    private Map<String, String> getAuthWithRefreshToken(String str) {
        Map<String, String> mapJsonToMap;
        try {
            mapJsonToMap = SocializeUtils.jsonToMap(WXAuthUtils.request("https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=" + this.config.appId + "&grant_type=refresh_token&refresh_token=" + str));
            try {
                mapJsonToMap.put("unionid", getUid());
            } catch (Exception e10) {
                e = e10;
                SLog.error(e);
            }
        } catch (Exception e11) {
            e = e11;
            mapJsonToMap = null;
        }
        return mapJsonToMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMap() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        if (weixinPreferences != null) {
            return weixinPreferences.getMap();
        }
        return null;
    }

    private String getOpenid() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        return weixinPreferences != null ? weixinPreferences.getOpenid() : "";
    }

    private String getRefreshToken() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        return weixinPreferences != null ? weixinPreferences.getRefreshToken() : "";
    }

    private String getUid() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        return weixinPreferences != null ? weixinPreferences.getUID() : "";
    }

    private boolean isAbleShareEmoji(SHARE_MEDIA share_media, WeiXinShareContent weiXinShareContent) {
        if (weiXinShareContent.getmStyle() == 64) {
            return (share_media == SHARE_MEDIA.WEIXIN_CIRCLE || share_media == SHARE_MEDIA.WEIXIN_FAVORITE) ? false : true;
        }
        return true;
    }

    private boolean isAccessTokenAvailable() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        if (weixinPreferences != null) {
            return weixinPreferences.isAccessTokenAvailable();
        }
        return false;
    }

    private boolean isAuthValid() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        if (weixinPreferences != null) {
            return weixinPreferences.isAuthValid();
        }
        return false;
    }

    private void loadOauthData(String str) {
        setBundle(parseAuthData(WXAuthUtils.request(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAuthCallback(SendAuth.Resp resp) {
        int i10 = resp.errCode;
        if (i10 == 0) {
            getAuthWithCode(resp.code, this.mAuthListener);
            return;
        }
        if (i10 == -2) {
            getAuthListener(this.mAuthListener).onCancel(SHARE_MEDIA.WEIXIN, 0);
            return;
        }
        if (i10 == -6) {
            getAuthListener(this.mAuthListener).onError(SHARE_MEDIA.WEIXIN, 0, new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + UmengText.errorWithUrl(UmengText.AUTH.AUTH_DENIED, UrlUtil.WX_ERROR_SIGN)));
            return;
        }
        if (i10 == -4) {
            getAuthListener(this.mAuthListener).onCancel(SHARE_MEDIA.WEIXIN, 0);
            return;
        }
        CharSequence charSequenceConcat = TextUtils.concat("weixin auth error (", String.valueOf(i10), "):", resp.errStr);
        getAuthListener(this.mAuthListener).onError(SHARE_MEDIA.WEIXIN, 0, new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + ((Object) charSequenceConcat)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle parseAuthData(String str) {
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            return bundle;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next));
            }
            bundle.putLong(REFRESH_TOKEN_EXPIRES_KEY, 604800L);
            bundle.putString("accessToken", bundle.getString("access_token"));
            bundle.putString("expiration", bundle.getString("expires_in"));
            bundle.putString("refreshToken", bundle.getString("refresh_token"));
            bundle.putString("uid", bundle.getString("unionid"));
        } catch (JSONException e10) {
            SLog.error(e10);
        }
        return bundle;
    }

    private Map<String, String> parseUserInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errcode")) {
                map.put("errcode", jSONObject.getString("errcode"));
                map.put(ERRMSG, jSONObject.getString(ERRMSG));
                return map;
            }
            map.put("openid", jSONObject.optString("openid"));
            map.put("screen_name", jSONObject.optString("nickname"));
            map.put("name", jSONObject.optString("nickname"));
            map.put("language", jSONObject.optString("language"));
            map.put(AdminRegionObj.TYPE_CITY, jSONObject.optString(AdminRegionObj.TYPE_CITY));
            map.put(AdminRegionObj.TYPE_PROVINCE, jSONObject.optString(AdminRegionObj.TYPE_PROVINCE));
            map.put(ak.O, jSONObject.optString(ak.O));
            map.put("profile_image_url", jSONObject.optString(HEADIMGURL));
            map.put("iconurl", jSONObject.optString(HEADIMGURL));
            map.put("unionid", jSONObject.optString("unionid"));
            map.put("uid", jSONObject.optString("unionid"));
            map.put(a.G, getGender(jSONObject.optString("sex")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(PRIVILEGE);
            int length = jSONArrayOptJSONArray == null ? 0 : jSONArrayOptJSONArray.length();
            if (length > 0) {
                String[] strArr = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    strArr[i10] = jSONArrayOptJSONArray.get(i10).toString();
                }
                map.put(PRIVILEGE, strArr.toString());
            }
            map.put("access_token", getAccessToken());
            map.put("refreshToken", getRefreshToken());
            map.put("expires_in", String.valueOf(getAccessTokenTTL()));
            map.put("accessToken", getAccessToken());
            map.put("refreshToken", getRefreshToken());
            map.put("expiration", String.valueOf(getAccessTokenTTL()));
            return map;
        } catch (JSONException e10) {
            SLog.error(e10);
            return Collections.emptyMap();
        }
    }

    private void runInMainThread(Runnable runnable) {
        QueuedWork.runInMain(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundle(Bundle bundle) {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        if (weixinPreferences != null) {
            weixinPreferences.setBundle(bundle).commit();
        }
    }

    private boolean shareTo(WeiXinShareContent weiXinShareContent) {
        File fileAsFileImage;
        String fileUri;
        if (!weiXinShareContent.isBySystem()) {
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.transaction = buildTransaction(weiXinShareContent.getStrStyle());
            req.message = weiXinShareContent.getWxMediaMessage(this.mAppContext, checkVersionValid() && checkAndroidNotBelowN(), this.mFileProvider);
            int i10 = AnonymousClass23.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA[this.mTarget.ordinal()];
            if (i10 == 1) {
                req.scene = 0;
            } else if (i10 == 2) {
                req.scene = 1;
            } else if (i10 != 3) {
                req.scene = 2;
            } else {
                req.scene = 2;
            }
            WXMediaMessage wXMediaMessage = req.message;
            if (wXMediaMessage == null) {
                QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.19
                    @Override // java.lang.Runnable
                    public void run() {
                        UMWXHandler uMWXHandler = UMWXHandler.this;
                        uMWXHandler.getShareListener(uMWXHandler.umShareListener).onError(UMWXHandler.this.mTarget, new Throwable(UmengErrorCode.UnKnowCode.getMessage() + "message = null"));
                    }
                });
                return false;
            }
            if (wXMediaMessage.mediaObject == null) {
                QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.20
                    @Override // java.lang.Runnable
                    public void run() {
                        UMWXHandler uMWXHandler = UMWXHandler.this;
                        uMWXHandler.getShareListener(uMWXHandler.umShareListener).onError(UMWXHandler.this.mTarget, new Throwable(UmengErrorCode.UnKnowCode.getMessage() + "mediaobject = null"));
                    }
                });
                return false;
            }
            boolean zSendReq = this.mWXApi.sendReq(req);
            if (!zSendReq) {
                QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.21
                    @Override // java.lang.Runnable
                    public void run() {
                        UMWXHandler uMWXHandler = UMWXHandler.this;
                        uMWXHandler.getShareListener(uMWXHandler.umShareListener).onError(UMWXHandler.this.mTarget, new Throwable(UmengErrorCode.UnKnowCode.getMessage() + UmengText.SHARE.SHARE_CONTENT_FAIL));
                    }
                });
            }
            return zSendReq;
        }
        String text = weiXinShareContent.getText();
        UMImage image = weiXinShareContent.getImage();
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("android.intent.action.SEND");
        if (!TextUtils.isEmpty(text)) {
            intent.putExtra("android.intent.extra.TEXT", text);
            intent.putExtra("Kdescription", text);
        }
        Uri uri = null;
        if (image != null && (fileAsFileImage = image.asFileImage()) != null && (fileUri = weiXinShareContent.getFileUri(this.mAppContext, fileAsFileImage, this.mFileProvider)) != null) {
            uri = Uri.parse(fileUri);
        }
        intent.setPackage("com.tencent.mm");
        if (SHARE_MEDIA.WEIXIN.equals(this.mTarget)) {
            if (uri != null) {
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.setType(h.f75165f);
            } else {
                if (TextUtils.isEmpty(text)) {
                    runInMainThread(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.14
                        @Override // java.lang.Runnable
                        public void run() {
                            UMWXHandler.this.umShareListener.onError(SHARE_MEDIA.WEIXIN, new Exception("content empty!"));
                        }
                    });
                    return false;
                }
                intent.setType("text/plain");
            }
            intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"));
            this.mAppContext.startActivity(intent);
            runInMainThread(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.15
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.umShareListener.onResult(SHARE_MEDIA.WEIXIN);
                }
            });
            return true;
        }
        if (!SHARE_MEDIA.WEIXIN_CIRCLE.equals(this.mTarget)) {
            runInMainThread(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.18
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.umShareListener.onError(SHARE_MEDIA.WEIXIN, new Exception("Not Support!"));
                }
            });
            return false;
        }
        if (uri == null) {
            runInMainThread(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.16
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.umShareListener.onError(SHARE_MEDIA.WEIXIN, new Exception("image empty!"));
                }
            });
            return false;
        }
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType(h.f75165f);
        intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
        this.mAppContext.startActivity(intent);
        runInMainThread(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.17
            @Override // java.lang.Runnable
            public void run() {
                UMWXHandler.this.umShareListener.onResult(SHARE_MEDIA.WEIXIN_CIRCLE);
            }
        });
        return true;
    }

    private void weixinPreferencesDelete() {
        WeixinPreferences weixinPreferences = this.weixinPreferences;
        if (weixinPreferences != null) {
            weixinPreferences.delete();
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void authorize(final UMAuthListener uMAuthListener) {
        PlatformConfig.APPIDPlatform aPPIDPlatform = this.config;
        if (aPPIDPlatform != null) {
            this.mTarget = aPPIDPlatform.getName();
        }
        this.mAuthListener = uMAuthListener;
        if (!isInstall()) {
            if (Config.isJumptoAppStore) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("http://log.umsns.com/link/weixin/download/"));
                this.mWeakAct.get().startActivity(intent);
            }
            runInMainThread(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.getAuthListener(uMAuthListener).onError(UMWXHandler.this.mTarget, 0, new Throwable(UmengErrorCode.NotInstall.getMessage()));
                }
            });
            return;
        }
        if (!isAuthValid()) {
            SendAuth.Req req = new SendAuth.Req();
            req.scope = sScope;
            req.state = "none";
            this.mWXApi.sendReq(req);
            return;
        }
        String refreshToken = getRefreshToken();
        loadOauthData("https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=" + this.config.appId + "&grant_type=refresh_token&refresh_token=" + refreshToken);
        getRefreshToken();
        final Map<String, String> authWithRefreshToken = getAuthWithRefreshToken(refreshToken);
        if (!authWithRefreshToken.containsKey("errcode") || (!authWithRefreshToken.get("errcode").equals(ERROR_CODE_TOKEN_ACCESS_FAIL) && !authWithRefreshToken.get("errcode").equals(ERROR_CODE_TOKEN_REFESH_FAIL))) {
            runInMainThread(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.2
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler uMWXHandler = UMWXHandler.this;
                    uMWXHandler.getAuthListener(uMWXHandler.mAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 0, authWithRefreshToken);
                }
            });
        } else {
            weixinPreferencesDelete();
            authorize(uMAuthListener);
        }
    }

    public boolean checkAndroidNotBelowN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public boolean checkVersionValid() {
        return this.mWXApi.getWXAppSupportAPI() >= 654314752;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void deleteAuth(final UMAuthListener uMAuthListener) {
        weixinPreferencesDelete();
        QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.5
            @Override // java.lang.Runnable
            public void run() {
                UMWXHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 1, null);
            }
        });
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getGender(Object obj) {
        String str = StringName.male;
        String str2 = StringName.female;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (obj.equals("m") || obj.equals("1") || obj.equals(UmengText.MAN)) {
                return str;
            }
            return (obj.equals("f") || obj.equals("2") || obj.equals(UmengText.WOMAN)) ? str2 : obj.toString();
        }
        if (!(obj instanceof Integer)) {
            return obj.toString();
        }
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            return str;
        }
        return num.intValue() == 2 ? str2 : obj.toString();
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void getPlatformInfo(final UMAuthListener uMAuthListener) {
        if (getShareConfig().isNeedAuthOnGetUserInfo()) {
            weixinPreferencesDelete();
        }
        authorize(new UMAuthListener() { // from class: com.umeng.socialize.handler.UMWXHandler.10
            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i10) {
                UMWXHandler.this.getAuthListener(uMAuthListener).onCancel(share_media, i10);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
                QueuedWork.runInBack(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass10 anonymousClass10 = AnonymousClass10.this;
                        UMWXHandler.this.fetchUserInfo(uMAuthListener);
                    }
                }, true);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
                UMWXHandler.this.getAuthListener(uMAuthListener).onError(share_media, i10, th2);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        });
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public int getRequestCode() {
        return 10086;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getSDKVersion() {
        return "3.1.1";
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getVersion() {
        return this.VERSION;
    }

    public IWXAPI getWXApi() {
        return this.mWXApi;
    }

    public IWXAPIEventHandler getWXEventHandler() {
        return this.mEventHandler;
    }

    public boolean isAbleShareMin(SHARE_MEDIA share_media, WeiXinShareContent weiXinShareContent) {
        if (weiXinShareContent.getmStyle() == 128) {
            return (share_media == SHARE_MEDIA.WEIXIN_CIRCLE || share_media == SHARE_MEDIA.WEIXIN_FAVORITE) ? false : true;
        }
        return true;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isAuthorize() {
        return this.weixinPreferences.isAuth();
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isHasAuthListener() {
        return this.mAuthListener != null;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isInstall() {
        IWXAPI iwxapi = this.mWXApi;
        return iwxapi != null && iwxapi.isWXAppInstalled();
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupport() {
        return this.mWXApi.getWXAppSupportAPI() >= 553779201;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupportAuth() {
        return true;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(Context context, PlatformConfig.Platform platform) {
        super.onCreate(context, platform);
        Context applicationContext = context.getApplicationContext();
        this.mAppContext = applicationContext;
        this.weixinPreferences = new WeixinPreferences(applicationContext, "weixin");
        PlatformConfig.APPIDPlatform aPPIDPlatform = (PlatformConfig.APPIDPlatform) platform;
        this.config = aPPIDPlatform;
        if (TextUtils.isEmpty(aPPIDPlatform.getFileProvider())) {
            SLog.E(UmengText.WX.WEIXIN_FILE_PROVIDER_ERROR);
        } else {
            this.mFileProvider = this.config.getFileProvider();
        }
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context.getApplicationContext(), this.config.appId, getShareConfig().getOpenWXAnalytics());
        this.mWXApi = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(this.config.appId);
    }

    protected void onShareCallback(SendMessageToWX.Resp resp) {
        int i10 = resp.errCode;
        if (i10 == -6) {
            getShareListener(this.umShareListener).onError(this.mTarget, new Throwable(UmengErrorCode.ShareFailed.getMessage() + UmengText.errorWithUrl(UmengText.AUTH.AUTH_DENIED, UrlUtil.WX_ERROR_SIGN)));
            return;
        }
        if (i10 == -5) {
            getShareListener(this.umShareListener).onError(this.mTarget, new Throwable(UmengErrorCode.ShareFailed.getMessage() + UmengText.SHARE.VERSION_NOT_SUPPORT));
            return;
        }
        if (i10 != -3) {
            if (i10 == -2) {
                getShareListener(this.umShareListener).onCancel(this.mTarget);
                return;
            }
            if (i10 != -1) {
                if (i10 == 0) {
                    new HashMap().put("uid", resp.openId);
                    getShareListener(this.umShareListener).onResult(this.mTarget);
                    return;
                }
                getShareListener(this.umShareListener).onError(this.mTarget, new Throwable(UmengErrorCode.ShareFailed.getMessage() + "code:" + resp.errCode + "msg:" + resp.errStr));
                return;
            }
        }
        getShareListener(this.umShareListener).onError(this.mTarget, new Throwable(UmengErrorCode.ShareFailed.getMessage() + resp.errStr));
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void release() {
        super.release();
        this.mAuthListener = null;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void setAuthListener(UMAuthListener uMAuthListener) {
        super.setAuthListener(uMAuthListener);
        this.mAuthListener = uMAuthListener;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(ShareContent shareContent, final UMShareListener uMShareListener) {
        PlatformConfig.APPIDPlatform aPPIDPlatform = this.config;
        if (aPPIDPlatform != null) {
            this.mTarget = aPPIDPlatform.getName();
        }
        if (!isInstall()) {
            if (Config.isJumptoAppStore) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(SocializeConstants.DOWN_URL_WX));
                this.mWeakAct.get().startActivity(intent);
            }
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.11
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.getShareListener(uMShareListener).onError(UMWXHandler.this.mTarget, new Throwable(UmengErrorCode.NotInstall.getMessage()));
                }
            });
            return false;
        }
        WeiXinShareContent weiXinShareContent = new WeiXinShareContent(shareContent);
        UMShareConfig uMShareConfig = this.mShareConfig;
        if (uMShareConfig != null) {
            weiXinShareContent.setCompressListener(uMShareConfig.getCompressListener());
        }
        if (!isAbleShareEmoji(this.mTarget, weiXinShareContent)) {
            QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.12
                @Override // java.lang.Runnable
                public void run() {
                    UMWXHandler.this.getShareListener(uMShareListener).onError(UMWXHandler.this.mTarget, new Throwable(UmengErrorCode.ShareDataTypeIllegal.getMessage() + UmengText.WX.WX_CIRCLE_NOT_SUPPORT_EMOJ));
                }
            });
            return false;
        }
        if (isAbleShareMin(this.mTarget, weiXinShareContent)) {
            this.umShareListener = uMShareListener;
            return shareTo(weiXinShareContent);
        }
        QueuedWork.runInMain(new Runnable() { // from class: com.umeng.socialize.handler.UMWXHandler.13
            @Override // java.lang.Runnable
            public void run() {
                UMWXHandler.this.getShareListener(uMShareListener).onError(UMWXHandler.this.mTarget, new Throwable(UmengErrorCode.ShareDataTypeIllegal.getMessage() + UmengText.WX.WX_CIRCLE_NOT_SUPPORT_MIN));
            }
        });
        return false;
    }
}
