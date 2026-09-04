package com.tencent.tauth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.connect.api.QQAuthManage;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import com.tencent.connect.avatar.QQAvatar;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.connect.commonchannel.CommonChannelApi;
import com.tencent.connect.emotion.QQEmotion;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzonePublish;
import com.tencent.connect.share.QzoneShare;
import com.tencent.open.SocialOperation;
import com.tencent.open.apireq.IApiCallback;
import com.tencent.open.b.b;
import com.tencent.open.im.IM;
import com.tencent.open.log.SLog;
import com.tencent.open.log.Tracer;
import com.tencent.open.miniapp.MiniApp;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.f;
import com.tencent.open.utils.g;
import com.tencent.open.utils.i;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.qmsp.sdk.u.U;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class Tencent {
    public static final int REQUEST_LOGIN = 10001;
    public static boolean USE_ONE_HOUR = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Tencent f102126c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f102127d = false;
    public static boolean disableResetOrientation = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f102128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102129b;

    private Tencent(String str, Context context) {
        this.f102128a = c.a(str, context);
        b.a().a(str, context);
        f.a().a(context);
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0 || objArr.length % 2 != 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            if (i10 > 0) {
                sb2.append('|');
            }
            sb2.append(objArr[i10]);
            sb2.append(':');
            sb2.append(objArr[i10 + 1]);
        }
        return sb2.toString();
    }

    private static void a(String str, Object obj) {
        b.a().a(str, obj);
    }

    private static void a(String str, Object... objArr) {
        b.a().a(str, a(objArr));
    }

    private static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            SLog.e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity" + (("没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent" + str + "\" />,详细信息请查看官网文档.") + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent" + str + "\" />\n</intent-filter>\n</activity>"));
            return false;
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.Tencent", "checkManifestConfig exception", th2);
        }
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            SLog.e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n" + ("没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"));
            return false;
        } catch (Throwable th3) {
            SLog.e("openSDK_LOG.Tencent", "checkManifestConfig exception", th3);
            return true;
        }
    }

    public static synchronized Tencent createInstance(String str, Context context) {
        g.a(context.getApplicationContext());
        SLog.i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str);
        if (TextUtils.isEmpty(str)) {
            SLog.e("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        Tencent tencent = f102126c;
        if (tencent == null) {
            f102126c = new Tencent(str, context);
        } else if (!str.equals(tencent.getAppId())) {
            f102126c.logout(context);
            f102126c = new Tencent(str, context);
        }
        if (!a(context, str)) {
            return null;
        }
        a("createInstance", "appid", str);
        com.tencent.open.a.f.a().a(i.a(context, str));
        SLog.i("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f102126c;
    }

    public static synchronized Tencent createInstance(String str, Context context, String str2) {
        Tencent tencentCreateInstance;
        tencentCreateInstance = createInstance(str, context);
        SLog.i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str + ", authorities=" + str2);
        a("createInstance_authority", "appid", str, "authorities", str2);
        if (tencentCreateInstance != null) {
            tencentCreateInstance.f102129b = str2;
        } else {
            SLog.i("openSDK_LOG.Tencent", "null == tencent set mAuthorities fail");
        }
        return tencentCreateInstance;
    }

    public static synchronized String getAuthorities(String str) {
        a("getAuthorities", "appid", str);
        if (TextUtils.isEmpty(str)) {
            SLog.i("openSDK_LOG.Tencent", "TextUtils.isEmpty(appId)");
            return null;
        }
        Tencent tencent = f102126c;
        if (tencent != null) {
            return str.equals(tencent.getAppId()) ? f102126c.f102129b : "";
        }
        SLog.i("openSDK_LOG.Tencent", "sInstance == null");
        return null;
    }

    public static void handleResultData(Intent intent, IUiListener iUiListener) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleResultData() data = null ? ");
        sb2.append(intent == null);
        sb2.append(", listener = null ? ");
        sb2.append(iUiListener == null);
        SLog.i("openSDK_LOG.Tencent", sb2.toString());
        a("handleResultData", new Object[0]);
        UIListenerManager.getInstance().handleDataToListener(intent, iUiListener);
    }

    public static boolean isPermissionNotGranted() {
        return !f102127d || TextUtils.isEmpty(f.a().b());
    }

    public static boolean isSupportPushToQZone(Context context) {
        boolean z10 = k.c(context, "5.9.5") >= 0;
        SLog.i("openSDK_LOG.Tencent", "isSupportPushToQZone() support=" + z10);
        a("isSupportPushToQZone", Boolean.valueOf(z10));
        return z10;
    }

    public static boolean isSupportShareToQQ(Context context) {
        SLog.i("openSDK_LOG.Tencent", "isSupportShareToQQ()");
        boolean z10 = true;
        if (m.c(context) && k.a(context, Constants.PACKAGE_QQ_PAD) != null) {
            a("isSupportShareToQQ", Boolean.TRUE);
            return true;
        }
        if (k.c(context, U.BEACON_ID_VERSION) < 0 && k.a(context, Constants.PACKAGE_TIM) == null) {
            z10 = false;
        }
        SLog.i("openSDK_LOG.Tencent", "isSupportShareToQQ() support=" + z10);
        a("isSupportShareToQQ", Boolean.valueOf(z10));
        return z10;
    }

    public static boolean onActivityResultData(int i10, int i11, Intent intent, IUiListener iUiListener) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onActivityResultData() reqcode = ");
        sb2.append(i10);
        sb2.append(", resultcode = ");
        sb2.append(i11);
        sb2.append(", data = null ? ");
        sb2.append(intent == null);
        sb2.append(", listener = null ? ");
        sb2.append(iUiListener == null);
        SLog.i("openSDK_LOG.Tencent", sb2.toString());
        a("onActivityResultData", "requestCode", Integer.valueOf(i10), com.taobao.agoo.a.a.b.JSON_ERRORCODE, Integer.valueOf(i11));
        return UIListenerManager.getInstance().onActivityResult(i10, i11, intent, iUiListener);
    }

    public static Map<String, String> parseMiniParameters(Intent intent) {
        a("parseMiniParameters", new Object[0]);
        HashMap map = new HashMap();
        if (intent == null) {
            SLog.e("openSDK_LOG.Tencent", "parseMiniParameters null == intent");
            return map;
        }
        try {
            String stringExtra = intent.getStringExtra("appParameter");
            if (!TextUtils.isEmpty(stringExtra)) {
                SLog.d("openSDK_LOG.Tencent", "parseMiniParameters appParameter=" + stringExtra);
                JSONObject jSONObject = new JSONObject(stringExtra);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
                return map;
            }
            Uri data = intent.getData();
            if (data == null) {
                SLog.d("openSDK_LOG.Tencent", "parseMiniParameters uri==null");
                return map;
            }
            String string = data.toString();
            if (TextUtils.isEmpty(string)) {
                SLog.d("openSDK_LOG.Tencent", "parseMiniParameters uriStr isEmpty");
                return map;
            }
            String strSubstring = string.substring(string.lastIndexOf(63) + 1);
            if (TextUtils.isEmpty(strSubstring)) {
                SLog.d("openSDK_LOG.Tencent", "parseMiniParameters uriParam is empty");
                return map;
            }
            SLog.d("openSDK_LOG.Tencent", "parseMiniParameters uriParam=" + strSubstring);
            String[] strArrSplit = strSubstring.split("&");
            int length = strArrSplit.length;
            for (int i10 = 0; i10 < length; i10++) {
                String[] strArrSplit2 = strArrSplit[i10].split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (strArrSplit2.length == 2) {
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                }
            }
            return map;
        } catch (Exception e10) {
            SLog.e("openSDK_LOG.Tencent", "parseMiniParameters Exception", e10);
        }
    }

    public static void resetQQAppInfoCache() {
        k.a("com.tencent.mobileqq");
    }

    public static void resetTargetAppInfoCache() {
        k.a();
    }

    public static void resetTimAppInfoCache() {
        k.a(Constants.PACKAGE_TIM);
    }

    public static void setCustomLogger(Tracer tracer) {
        SLog.i("openSDK_LOG.Tencent", "setCustomLogger");
        a("setCustomLogger", new Object[0]);
        SLog.getInstance().setCustomLogger(tracer);
    }

    public static void setIsPermissionGranted(boolean z10) {
        String strB;
        SLog.i("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: " + z10);
        if (z10) {
            f.a().a(g.a());
            strB = f.a().b();
            if (strB == null || strB.isEmpty()) {
                strB = Build.MODEL;
            }
        } else {
            strB = "";
        }
        setIsPermissionGranted(z10, strB);
    }

    public static void setIsPermissionGranted(boolean z10, String str) {
        SLog.i("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: " + z10 + ", model = " + str);
        if (!z10) {
            str = null;
        } else if (str == null || str.trim().isEmpty()) {
            SLog.e("openSDK_LOG.Tencent", "setIsPermissionGranted error! model= [" + str + "]");
            z10 = false;
            str = null;
        }
        f102127d = z10;
        f.a().a(g.a(), str);
    }

    public void bindQQGroup(Activity activity, String str, String str2, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "bindQQGroup()");
        a("bindQQGroup", "organizationId", str, "organizationName", str2);
        new SocialOperation(getQQToken()).bindQQGroup(activity, str, str2, iUiListener);
    }

    public void callCommonChannelApi(Activity activity, Bundle bundle, IUiListener iUiListener) {
        c cVar = this.f102128a;
        SLog.i("openSDK_LOG.Tencent", "callCommonChannelApi ret: " + new CommonChannelApi(cVar, cVar.b()).launchQQ(activity, bundle, iUiListener));
    }

    public void checkLogin(IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "checkLogin()");
        a("checkLogin", new Object[0]);
        this.f102128a.a(iUiListener);
    }

    public String getAccessToken() {
        String accessToken = this.f102128a.b().getAccessToken();
        SLog.i("openSDK_LOG.Tencent", "getAccessToken() accessToken = " + accessToken);
        a("getAccessToken", new Object[0]);
        return accessToken;
    }

    public String getAppId() {
        String appId = this.f102128a.b().getAppId();
        SLog.i("openSDK_LOG.Tencent", "getAppId() appid =" + appId);
        a("getAppId", appId);
        return appId;
    }

    public long getExpiresIn() {
        long expireTimeInSecond = this.f102128a.b().getExpireTimeInSecond();
        SLog.i("openSDK_LOG.Tencent", "getExpiresIn() expiresin= " + expireTimeInSecond);
        a("getExpiresIn", Long.valueOf(expireTimeInSecond));
        return expireTimeInSecond;
    }

    public String getOpenId() {
        String openId = this.f102128a.b().getOpenId();
        SLog.i("openSDK_LOG.Tencent", "getOpenId() openid= " + openId);
        a("getOpenId", new Object[0]);
        return openId;
    }

    public QQToken getQQToken() {
        SLog.i("openSDK_LOG.Tencent", "getQQToken()");
        a("getQQToken", new Object[0]);
        return this.f102128a.b();
    }

    @Deprecated
    public void handleLoginData(Intent intent, IUiListener iUiListener) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleLoginData() data = null ? ");
        sb2.append(intent == null);
        sb2.append(", listener = null ? ");
        sb2.append(iUiListener == null);
        SLog.i("openSDK_LOG.Tencent", sb2.toString());
        a("handleLoginData", new Object[0]);
        UIListenerManager.getInstance().handleDataToListener(intent, iUiListener);
    }

    public void initSessionCache(JSONObject jSONObject) {
        a("initSessionCache", new Object[0]);
        try {
            String string = jSONObject.getString("access_token");
            String string2 = jSONObject.getString("expires_in");
            String string3 = jSONObject.getString("openid");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                setAccessToken(string, string2);
                setOpenId(string3);
            }
            SLog.i("openSDK_LOG.Tencent", "initSessionCache()");
        } catch (Exception e10) {
            SLog.i("QQToken", "initSessionCache " + e10.toString());
        }
    }

    public boolean isQQInstalled(Context context) {
        boolean zB = k.b(context);
        SLog.i("openSDK_LOG.Tencent", "isQQInstalled() installed=" + zB);
        a("isQQInstalled", Boolean.valueOf(zB));
        return zB;
    }

    public boolean isQQInstalled(Context context, String str) {
        boolean z10 = k.c(context, str) >= 0;
        SLog.i("openSDK_LOG.Tencent", "isQQInstalled version[" + str + "] = " + z10);
        return z10;
    }

    public boolean isReady() {
        boolean z10 = isSessionValid() && getOpenId() != null;
        SLog.i("openSDK_LOG.Tencent", "isReady() --ready=" + z10);
        a("isReady", Boolean.valueOf(z10));
        return z10;
    }

    public boolean isSessionValid() {
        boolean zC = this.f102128a.c();
        SLog.i("openSDK_LOG.Tencent", "isSessionValid() isvalid =" + zC);
        a("isSessionValid", Boolean.valueOf(zC));
        return zC;
    }

    public boolean isSupportSSOLogin(Activity activity) {
        SLog.i("openSDK_LOG.Tencent", "isSupportSSOLogin()");
        boolean z10 = true;
        if (m.c(activity) && k.a((Context) activity, Constants.PACKAGE_QQ_PAD) != null) {
            a("isSupportSSOLogin", Boolean.TRUE);
            return true;
        }
        if (k.c(activity, U.BEACON_ID_VERSION) < 0 && k.d(activity, "1.1") < 0) {
            z10 = false;
        }
        SLog.i("openSDK_LOG.Tencent", "isSupportSSOLogin() support=" + z10);
        a("isSupportSSOLogin", Boolean.valueOf(z10));
        return z10;
    }

    public void joinQQGroup(Activity activity, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "joinQQGroup()");
        a("joinQQGroup", "organizationId", str);
        new SocialOperation(getQQToken()).joinGroup(activity, str, iUiListener);
    }

    public JSONObject loadSession(String str) {
        JSONObject jSONObjectLoadSession = this.f102128a.b().loadSession(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadSession() appid ");
        sb2.append(str);
        sb2.append(", length=");
        sb2.append(jSONObjectLoadSession != null ? jSONObjectLoadSession.length() : 0);
        SLog.i("openSDK_LOG.Tencent", sb2.toString());
        a("loadSession", "appid", str);
        return jSONObjectLoadSession;
    }

    public int login(Activity activity, IUiListener iUiListener, Map<String, Object> map) {
        SLog.i("openSDK_LOG.Tencent", "login activity with params");
        a("login_param", new Object[0]);
        return this.f102128a.a(activity, iUiListener, map);
    }

    public int login(Activity activity, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "login() with activity, scope is " + str);
        a("login_scope", "scope", str);
        return this.f102128a.a(activity, str, iUiListener);
    }

    public int login(Activity activity, String str, IUiListener iUiListener, boolean z10) {
        SLog.i("openSDK_LOG.Tencent", "login() with activity, scope is " + str);
        a("login_qrcode", "scope", str, "qrcode", Boolean.valueOf(z10));
        return this.f102128a.a(activity, str, iUiListener, z10);
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "login() with fragment, scope is " + str);
        a("login_fragment_scope", "scope", str);
        return this.f102128a.a(fragment, str, iUiListener, "");
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener, boolean z10) {
        SLog.i("openSDK_LOG.Tencent", "login() with fragment, scope is " + str);
        a("login_fragment_scope_qrcode", "scope", str, "qrcode", Boolean.valueOf(z10));
        return this.f102128a.a(fragment, str, iUiListener, "", z10);
    }

    public int loginServerSide(Activity activity, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "loginServerSide() with activity, scope = " + str + ",server_side");
        a("loginServerSide_activity", "scope", str);
        return this.f102128a.a(activity, str + ",server_side", iUiListener);
    }

    public int loginServerSide(Fragment fragment, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "loginServerSide() with fragment, scope = " + str + ",server_side");
        a("loginServerSide_fragment", "scope", str);
        return this.f102128a.a(fragment, str + ",server_side", iUiListener, "");
    }

    public int loginWithOEM(Activity activity, String str, IUiListener iUiListener, boolean z10, String str2, String str3, String str4) {
        SLog.i("openSDK_LOG.Tencent", "loginWithOEM() with activity, scope = " + str);
        a("loginWithOEM", "scope", str, "qrcode", Boolean.valueOf(z10), "registerChannel", str2, "installChannel", str3, com.taobao.accs.common.Constants.KEY_BUSINESSID, str4);
        return this.f102128a.a(activity, str, iUiListener, z10, str2, str3, str4);
    }

    public void logout(Context context) {
        SLog.i("openSDK_LOG.Tencent", "logout()");
        a("logout", new Object[0]);
        this.f102128a.b().setAccessToken(null, "0");
        this.f102128a.b().setOpenId(null);
        this.f102128a.b().removeSession(this.f102128a.b().getAppId());
    }

    public void publishToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "publishToQzone()");
        a("publishToQzone", new Object[0]);
        new QzonePublish(activity, this.f102128a.b()).publishToQzone(activity, bundle, iUiListener);
    }

    public int reAuth(Activity activity, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "reAuth() with activity, scope = " + str);
        a("reAuth", "scope", str);
        return this.f102128a.b(activity, str, iUiListener);
    }

    public void reportDAU() {
        SLog.i("openSDK_LOG.Tencent", "reportDAU() ");
        a("reportDAU", new Object[0]);
        this.f102128a.a();
    }

    public JSONObject request(String str, Bundle bundle, String str2) throws JSONException, IOException, HttpUtils.NetworkUnavailableException, HttpUtils.HttpStatusException {
        SLog.i("openSDK_LOG.Tencent", "request()");
        a("request", "graphPath", str, "httpMethod", str2);
        return HttpUtils.request(this.f102128a.b(), g.a(), str, bundle, str2);
    }

    public void requestAsync(String str, Bundle bundle, String str2, IRequestListener iRequestListener) {
        SLog.i("openSDK_LOG.Tencent", "requestAsync()");
        a("requestAsync", "graphPath", str, "httpMethod", str2);
        HttpUtils.requestAsync(this.f102128a.b(), g.a(), str, bundle, str2, iRequestListener);
    }

    public void saveSession(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("saveSession() length=");
        sb2.append(jSONObject != null ? jSONObject.length() : 0);
        SLog.i("openSDK_LOG.Tencent", sb2.toString());
        a("saveSession", new Object[0]);
        this.f102128a.b().saveSession(jSONObject);
    }

    public void setAccessToken(String str, String str2) {
        SLog.i("openSDK_LOG.Tencent", "setAccessToken(), expiresIn = " + str2 + "");
        a("setAccessToken", new Object[0]);
        this.f102128a.a(str, str2);
    }

    public void setAvatar(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "setAvatar()");
        a("setAvatar", new Object[0]);
        String string = bundle.getString("picture");
        new QQAvatar(this.f102128a.b()).setAvatar(activity, Uri.parse(string), iUiListener, bundle.getInt("exitAnim"));
    }

    public void setAvatar(Activity activity, Bundle bundle, IUiListener iUiListener, int i10, int i11) {
        SLog.i("openSDK_LOG.Tencent", "setAvatar()");
        a("setAvatar_anim", new Object[0]);
        bundle.putInt("exitAnim", i11);
        activity.overridePendingTransition(i10, 0);
        setAvatar(activity, bundle, iUiListener);
    }

    public void setAvatarByQQ(Activity activity, Uri uri, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "setAvatarByQQ()");
        a("setAvatarByQQ", new Object[0]);
        new QQAvatar(this.f102128a.b()).setAvatarByQQ(activity, uri, iUiListener);
    }

    public void setDynamicAvatar(Activity activity, Uri uri, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "setDynamicAvatar()");
        a("setDynamicAvatar", new Object[0]);
        new QQAvatar(this.f102128a.b()).setDynamicAvatar(activity, uri, iUiListener);
    }

    public void setEmotions(Activity activity, ArrayList<Uri> arrayList, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "saveQQEmotions()");
        a("setEmotions", new Object[0]);
        new QQEmotion(this.f102128a.b()).setEmotions(activity, arrayList, iUiListener);
    }

    public void setOpenId(String str) {
        SLog.i("openSDK_LOG.Tencent", "setOpenId() --start");
        a("setOpenId", new Object[0]);
        this.f102128a.b(g.a(), str);
        SLog.i("openSDK_LOG.Tencent", "setOpenId() --end");
    }

    public void shareToQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "shareToQQ()");
        a("shareToQQ", new Object[0]);
        if (TextUtils.isEmpty(this.f102129b)) {
            iUiListener.onWarning(-19);
        }
        new QQShare(activity, this.f102128a.b()).shareToQQ(activity, bundle, iUiListener);
    }

    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "shareToQzone()");
        a("shareToQzone", new Object[0]);
        new QzoneShare(activity, this.f102128a.b()).shareToQzone(activity, bundle, iUiListener);
    }

    public void startAuthManagePage(Activity activity, IApiCallback iApiCallback) {
        SLog.i("openSDK_LOG.Tencent", "startAuthManagePage");
        new QQAuthManage(this.f102128a, getQQToken()).gotoManagePage(activity, iApiCallback);
    }

    public int startIMAio(Activity activity, String str, String str2) {
        SLog.i("openSDK_LOG.Tencent", "startIMAio()");
        a("startIMAio", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, IM.CHAT_TYPE_AIO, str, str2);
    }

    public int startIMAudio(Activity activity, String str, String str2) {
        SLog.i("openSDK_LOG.Tencent", "startIMAudio()");
        a("startIMAudio", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, IM.CHAT_TYPE_AUDIO_CHAT, str, str2);
    }

    public int startIMConversation(Activity activity, String str, String str2, String str3) {
        a("startIMConversation", "chatType", str, "uin", str2, Constants.PARAM_PKG_NAME, str3);
        return new IM(getQQToken()).startIMConversation(activity, str, str2, str3);
    }

    public int startIMVideo(Activity activity, String str, String str2) {
        SLog.i("openSDK_LOG.Tencent", "startIMVideo()");
        a("startIMVideo", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, IM.CHAT_TYPE_VIDEO_CHAT, str, str2);
    }

    public int startMiniApp(Activity activity, String str, String str2, String str3) {
        SLog.i("openSDK_LOG.Tencent", "startMiniApp()");
        a("startMiniApp", "miniAppId", str, "miniAppPath", str2, "miniAppVersion", str3);
        return new MiniApp(getQQToken()).startMiniApp(activity, MiniApp.MINIAPP_TYPE_NORMAL, str, "21", str2, str3);
    }

    public void unBindQQGroup(Context context, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.Tencent", "unBindQQGroup()");
        a("unBindQQGroup", "organizationId", str);
        new SocialOperation(getQQToken()).unBindGroup(context, str, iUiListener);
    }
}
