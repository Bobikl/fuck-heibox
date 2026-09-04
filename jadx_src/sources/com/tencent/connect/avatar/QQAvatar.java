package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class QQAvatar extends BaseApi {
    public static final String FROM_SDK_AVATAR_SET_IMAGE = "FROM_SDK_AVATAR_SET_IMAGE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IUiListener f99393a;

    public QQAvatar(QQToken qQToken) {
        super(qQToken);
    }

    private Intent a(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, ImageActivity.class);
        return intent;
    }

    private void a(Activity activity, Bundle bundle, Intent intent) {
        a(bundle);
        intent.putExtra(Constants.KEY_ACTION, "action_avatar");
        intent.putExtra(Constants.KEY_PARAMS, bundle);
        UIListenerManager.getInstance().setListenerWithRequestcode(11102, this.f99393a);
        a(activity, intent, 11102);
    }

    private void a(Bundle bundle) {
        QQToken qQToken = this.f99424c;
        if (qQToken != null) {
            bundle.putString("appid", qQToken.getAppId());
            if (this.f99424c.isSessionValid()) {
                bundle.putString(Constants.PARAM_KEY_STR, this.f99424c.getAccessToken());
                bundle.putString(Constants.PARAM_KEY_TYPE, "0x80");
            }
            String openId = this.f99424c.getOpenId();
            if (openId != null) {
                bundle.putString("hopenid", openId);
            }
            bundle.putString("platform", "androidqz");
            try {
                bundle.putString("pf", g.a().getSharedPreferences(Constants.PREFERENCE_PF, 0).getString("pf", Constants.DEFAULT_PF));
            } catch (Exception e10) {
                e10.printStackTrace();
                bundle.putString("pf", Constants.DEFAULT_PF);
            }
        }
        bundle.putString(SocializeProtocolConstants.PROTOCOL_KEY_VERSION, Constants.SDK_VERSION);
        bundle.putString("sdkp", ak.av);
    }

    public void setAvatar(Activity activity, Uri uri, IUiListener iUiListener, int i10) {
        if (com.tencent.connect.a.a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f99393a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f99393a = iUiListener;
        Bundle bundle = new Bundle();
        bundle.putString("picture", uri.toString());
        bundle.putInt("exitAnim", i10);
        bundle.putString("appid", this.f99424c.getAppId());
        bundle.putString("access_token", this.f99424c.getAccessToken());
        bundle.putLong("expires_in", this.f99424c.getExpireTimeInSecond());
        bundle.putString("openid", this.f99424c.getOpenId());
        Intent intentA = a(activity);
        Bundle bundleA = m.a(this.f99424c.getOpenId(), Constants.VIA_SET_AVATAR, "12", "18", this.f99424c.getAppId());
        intentA.putExtra(Constants.KEY_PASS_REPORT_VIA_TIMELY, true);
        intentA.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, bundleA);
        a(activity, bundle, intentA);
    }

    public void setAvatarByQQ(Activity activity, Uri uri, IUiListener iUiListener) {
        if (com.tencent.connect.a.a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f99393a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f99393a = iUiListener;
        if (!k.b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (k.c(activity, "8.0.0") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置头像功能。", 1).show();
            return;
        }
        String strA = m.a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_avatar_edit?");
        if (!TextUtils.isEmpty(strA)) {
            if (strA.length() > 20) {
                strA = strA.substring(0, 20) + "...";
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(strA), 2));
        }
        String appId = this.f99424c.getAppId();
        String openId = this.f99424c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openId), 2));
        }
        String strB = m.b(activity, uri);
        if (!TextUtils.isEmpty(strB)) {
            try {
                activity.grantUriPermission("com.tencent.mobileqq", uri, 3);
                stringBuffer.append("&set_uri=" + Base64.encodeToString(m.j(uri.toString()), 2));
            } catch (Exception e10) {
                SLog.e("QQAvatar", "Exception", e10);
            }
        }
        if (!TextUtils.isEmpty(strB)) {
            stringBuffer.append("&set_path=" + Base64.encodeToString(m.j(strB), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(m.j(Constants.SDK_VERSION), 2));
        SLog.v("QQAVATAR", "-->set avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.tencent.mobileqq");
        intent.putExtra("FROM_WHERE", FROM_SDK_AVATAR_SET_IMAGE);
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setData(Uri.parse(stringBuffer.toString()));
        UIListenerManager.getInstance().setListenerWithRequestcode(10108, iUiListener);
        a(activity, 10108, intent, false);
    }

    public void setDynamicAvatar(Activity activity, Uri uri, IUiListener iUiListener) {
        if (com.tencent.connect.a.a("QQAvatar", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f99393a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f99393a = iUiListener;
        if (!k.b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (k.c(activity, "8.0.5") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置头像功能。", 1).show();
            return;
        }
        String strA = m.a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_dynamic_avatar_edit?");
        if (!TextUtils.isEmpty(strA)) {
            if (strA.length() > 20) {
                strA = strA.substring(0, 20) + "...";
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(strA), 2));
        }
        String appId = this.f99424c.getAppId();
        String openId = this.f99424c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openId), 2));
        }
        String strB = m.b(activity, uri);
        if (!TextUtils.isEmpty(strB)) {
            try {
                activity.grantUriPermission("com.tencent.mobileqq", uri, 3);
                stringBuffer.append("&video_uri=");
                stringBuffer.append(Base64.encodeToString(m.j(uri.toString()), 2));
            } catch (Exception e10) {
                SLog.e("QQAvatar", "Exception", e10);
            }
        }
        if (!TextUtils.isEmpty(strB)) {
            stringBuffer.append("&video_path=" + Base64.encodeToString(m.j(strB), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(m.j(Constants.SDK_VERSION), 2));
        SLog.v("QQAVATAR", "-->set dynamic avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.tencent.mobileqq");
        intent.putExtra("FROM_WHERE", FROM_SDK_AVATAR_SET_IMAGE);
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.setData(Uri.parse(stringBuffer.toString()));
        UIListenerManager.getInstance().setListenerWithRequestcode(10110, iUiListener);
        a(activity, 10110, intent, false);
    }
}
