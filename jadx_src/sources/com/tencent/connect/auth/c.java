package com.tencent.connect.auth;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AuthAgent f99355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private QQToken f99356b;

    private c(String str, Context context) {
        SLog.i("openSDK_LOG.QQAuth", "new QQAuth() --start");
        this.f99356b = new QQToken(str);
        this.f99355a = new AuthAgent(this.f99356b);
        com.tencent.connect.a.a.c(context, this.f99356b);
        a(context, Constants.SDK_VERSION);
        SLog.i("openSDK_LOG.QQAuth", "new QQAuth() --end");
    }

    private int a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2) {
        return a(activity, fragment, str, iUiListener, str2, false);
    }

    private int a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z10) {
        return a(activity, fragment, str, iUiListener, str2, z10, (Map<String, Object>) null);
    }

    private int a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z10, Map<String, Object> map) {
        try {
            String strA = k.a(activity);
            if (strA != null) {
                String strA2 = com.tencent.open.utils.b.a(new File(strA));
                if (!TextUtils.isEmpty(strA2)) {
                    SLog.v("openSDK_LOG.QQAuth", "-->login channelId: " + strA2);
                    return a(activity, str, iUiListener, z10, strA2, strA2, "");
                }
            }
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.QQAuth", "-->login get channel id exception.", th2);
        }
        SLog.d("openSDK_LOG.QQAuth", "-->login channelId is null ");
        BaseApi.isOEM = false;
        return this.f99355a.doLogin(activity, str, iUiListener, false, fragment, z10, map);
    }

    public static c a(String str, Context context) {
        g.a(context.getApplicationContext());
        SLog.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        c cVar = new c(str, context);
        SLog.i("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return cVar;
    }

    public static void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", str);
        editorEdit.apply();
    }

    public int a(Activity activity, IUiListener iUiListener, Map<String, Object> map) {
        SLog.i("openSDK_LOG.QQAuth", "login--params");
        return a(activity, (Fragment) null, m.a(map, Constants.KEY_SCOPE, "all"), iUiListener, "", m.a(map, Constants.KEY_QRCODE, false), map);
    }

    public int a(Activity activity, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.QQAuth", "login()");
        return a(activity, str, iUiListener, "");
    }

    public int a(Activity activity, String str, IUiListener iUiListener, String str2) {
        SLog.i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return a(activity, (Fragment) null, str, iUiListener, str2);
    }

    public int a(Activity activity, String str, IUiListener iUiListener, boolean z10) {
        SLog.i("openSDK_LOG.QQAuth", "login()");
        return a(activity, null, str, iUiListener, "", z10);
    }

    @Deprecated
    public int a(Activity activity, String str, IUiListener iUiListener, boolean z10, String str2, String str3, String str4) {
        SLog.i("openSDK_LOG.QQAuth", "loginWithOEM");
        BaseApi.isOEM = true;
        if (str2.equals("")) {
            str2 = "null";
        }
        if (str3.equals("")) {
            str3 = "null";
        }
        if (str4.equals("")) {
            str4 = "null";
        }
        BaseApi.installChannel = str3;
        BaseApi.registerChannel = str2;
        BaseApi.businessId = str4;
        return this.f99355a.a(activity, str, iUiListener, false, null, z10);
    }

    public int a(Fragment fragment, String str, IUiListener iUiListener, String str2) {
        FragmentActivity activity = fragment.getActivity();
        SLog.i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return a(activity, fragment, str, iUiListener, str2);
    }

    public int a(Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z10) {
        FragmentActivity activity = fragment.getActivity();
        SLog.i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return a(activity, fragment, str, iUiListener, str2, z10);
    }

    public void a() {
        this.f99355a.a((IUiListener) null);
    }

    public void a(IUiListener iUiListener) {
        this.f99355a.b(iUiListener);
    }

    public void a(String str, String str2) {
        SLog.i("openSDK_LOG.QQAuth", "setAccessToken(), validTimeInSecond = " + str2 + "");
        this.f99356b.setAccessToken(str, str2);
    }

    public int b(Activity activity, String str, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.QQAuth", "reAuth()");
        return this.f99355a.a(activity, str, iUiListener, true, null, false);
    }

    public QQToken b() {
        return this.f99356b;
    }

    public void b(Context context, String str) {
        SLog.i("openSDK_LOG.QQAuth", "setOpenId() --start");
        this.f99356b.setOpenId(str);
        com.tencent.connect.a.a.d(context, this.f99356b);
        SLog.i("openSDK_LOG.QQAuth", "setOpenId() --end");
    }

    public boolean c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isSessionValid(), result = ");
        sb2.append(this.f99356b.isSessionValid() ? "true" : "false");
        SLog.i("openSDK_LOG.QQAuth", sb2.toString());
        return this.f99356b.isSessionValid();
    }
}
