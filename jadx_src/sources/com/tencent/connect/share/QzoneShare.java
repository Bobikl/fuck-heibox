package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.TDialog;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class QzoneShare extends BaseApi {
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final String SHARE_TO_QZONE_EXTMAP = "extMap";
    public static final String SHARE_TO_QZONE_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QZONE_TYPE_IMAGE = 5;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE_TEXT = 1;
    public static final int SHARE_TO_QZONE_TYPE_MINI_PROGRAM = 7;
    public static final int SHARE_TO_QZONE_TYPE_NO_TYPE = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f99453a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f99455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f99456f;
    public String mViaShareQzoneType;

    public QzoneShare(Context context, QQToken qQToken) {
        super(qQToken);
        this.mViaShareQzoneType = "";
        this.f99453a = true;
        this.f99454d = false;
        this.f99455e = false;
        this.f99456f = false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x012c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0136  */
    /* JADX WARN: Code duplicated, block: B:40:0x015c  */
    /* JADX WARN: Code duplicated, block: B:43:0x017e  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0220  */
    /* JADX WARN: Code duplicated, block: B:61:0x0262  */
    /* JADX WARN: Code duplicated, block: B:64:0x0288  */
    /* JADX WARN: Code duplicated, block: B:67:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:77:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x03cc  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0136, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x015c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x017e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x01a0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x01ba, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x01dc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x01fe, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0220, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0262, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0288, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x02ae, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x02d4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x02f6, please report this as an issue */
    private void b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        int i10;
        String str;
        String str2;
        String appId;
        String openIdWithCache;
        Intent intent;
        String str3;
        String strA;
        SLog.i("openSDK_LOG.QzoneShare", "doshareToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_qzone?src_type=app&version=1&file_type=news");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString("audio_url");
        int i11 = bundle.getInt("req_type", 1);
        String string5 = bundle.getString("appName");
        String string6 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string7 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        String string8 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_TYPE);
        int i12 = bundle.getInt("cflag", 0);
        String string9 = bundle.getString("share_qq_ext_str");
        String string10 = "";
        try {
            Bundle bundle2 = bundle.getBundle("extMap");
            if (bundle2 != null) {
                Set<String> setKeySet = bundle2.keySet();
                str2 = string9;
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (String str4 : setKeySet) {
                        str = string6;
                        try {
                            i10 = i11;
                            try {
                                jSONObject.put(str4, bundle2.get(str4));
                                i11 = i10;
                                string6 = str;
                            } catch (Exception e10) {
                                e = e10;
                                SLog.e("openSDK_LOG.QzoneShare", "ShareToQzone()  --error parse extmap", e);
                                appId = this.f99424c.getAppId();
                                openIdWithCache = this.f99424c.getOpenIdWithCache();
                                SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                                if (stringArrayList != null) {
                                    str3 = stringArrayList.get(0);
                                    stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(URLEncoder.encode(str3)), 2));
                                    if (!m.h(str3)) {
                                        strA = m.a(appId, activity, str3, iUiListener);
                                        if (!TextUtils.isEmpty(strA)) {
                                            stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(URLEncoder.encode(strA)), 2));
                                        }
                                    }
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    stringBuffer.append("&title=" + Base64.encodeToString(m.j(string), 2));
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
                                }
                                if (!TextUtils.isEmpty(appId)) {
                                    stringBuffer.append("&share_id=" + appId);
                                }
                                if (!TextUtils.isEmpty(string3)) {
                                    stringBuffer.append("&url=" + Base64.encodeToString(m.j(string3), 2));
                                }
                                if (!TextUtils.isEmpty(string5)) {
                                    stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(string5), 2));
                                }
                                if (!m.e(openIdWithCache)) {
                                    stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openIdWithCache), 2));
                                }
                                if (!m.e(string4)) {
                                    stringBuffer.append("&audioUrl=" + Base64.encodeToString(m.j(string4), 2));
                                }
                                stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i10)), 2));
                                if (!TextUtils.isEmpty(str)) {
                                    stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(m.j(String.valueOf(str)), 2));
                                }
                                if (!TextUtils.isEmpty(string7)) {
                                    stringBuffer.append("&mini_program_path=" + Base64.encodeToString(m.j(String.valueOf(string7)), 2));
                                }
                                if (!TextUtils.isEmpty(string8)) {
                                    stringBuffer.append("&mini_program_type=" + Base64.encodeToString(m.j(String.valueOf(string8)), 2));
                                }
                                if (!m.e(str2)) {
                                    stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(m.j(str2), 2));
                                }
                                if (!TextUtils.isEmpty(string10)) {
                                    stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(m.j(string10), 2));
                                }
                                stringBuffer.append("&cflag=" + Base64.encodeToString(m.j(String.valueOf(i12)), 2));
                                SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                                com.tencent.connect.a.a.a(g.a(), this.f99424c, "requireApi", "shareToNativeQQ");
                                intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(stringBuffer.toString()));
                                intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                                intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f99424c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f99424c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
                                if (m.g(activity, "4.6.0")) {
                                    UIListenerManager.getInstance().setListenerWithRequestcode(11104, iUiListener);
                                    a(activity, intent, 11104);
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                                } else {
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                                    if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                                        SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                                    }
                                    a(activity, 10104, intent, false);
                                }
                                SLog.i(SLog.TAG, "doShareToQzone() --end");
                            }
                        } catch (Exception e11) {
                            e = e11;
                            i10 = i11;
                            SLog.e("openSDK_LOG.QzoneShare", "ShareToQzone()  --error parse extmap", e);
                            appId = this.f99424c.getAppId();
                            openIdWithCache = this.f99424c.getOpenIdWithCache();
                            SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
                            if (stringArrayList != null) {
                                str3 = stringArrayList.get(0);
                                stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(URLEncoder.encode(str3)), 2));
                                if (!m.h(str3)) {
                                    strA = m.a(appId, activity, str3, iUiListener);
                                    if (!TextUtils.isEmpty(strA)) {
                                        stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(URLEncoder.encode(strA)), 2));
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(string)) {
                                stringBuffer.append("&title=" + Base64.encodeToString(m.j(string), 2));
                            }
                            if (!TextUtils.isEmpty(string2)) {
                                stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
                            }
                            if (!TextUtils.isEmpty(appId)) {
                                stringBuffer.append("&share_id=" + appId);
                            }
                            if (!TextUtils.isEmpty(string3)) {
                                stringBuffer.append("&url=" + Base64.encodeToString(m.j(string3), 2));
                            }
                            if (!TextUtils.isEmpty(string5)) {
                                stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(string5), 2));
                            }
                            if (!m.e(openIdWithCache)) {
                                stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openIdWithCache), 2));
                            }
                            if (!m.e(string4)) {
                                stringBuffer.append("&audioUrl=" + Base64.encodeToString(m.j(string4), 2));
                            }
                            stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i10)), 2));
                            if (!TextUtils.isEmpty(str)) {
                                stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(m.j(String.valueOf(str)), 2));
                            }
                            if (!TextUtils.isEmpty(string7)) {
                                stringBuffer.append("&mini_program_path=" + Base64.encodeToString(m.j(String.valueOf(string7)), 2));
                            }
                            if (!TextUtils.isEmpty(string8)) {
                                stringBuffer.append("&mini_program_type=" + Base64.encodeToString(m.j(String.valueOf(string8)), 2));
                            }
                            if (!m.e(str2)) {
                                stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(m.j(str2), 2));
                            }
                            if (!TextUtils.isEmpty(string10)) {
                                stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(m.j(string10), 2));
                            }
                            stringBuffer.append("&cflag=" + Base64.encodeToString(m.j(String.valueOf(i12)), 2));
                            SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
                            com.tencent.connect.a.a.a(g.a(), this.f99424c, "requireApi", "shareToNativeQQ");
                            intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(stringBuffer.toString()));
                            intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                            intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f99424c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f99424c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
                            if (m.g(activity, "4.6.0")) {
                                UIListenerManager.getInstance().setListenerWithRequestcode(11104, iUiListener);
                                a(activity, intent, 11104);
                                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
                            } else {
                                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
                                if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                                    SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
                                }
                                a(activity, 10104, intent, false);
                            }
                            SLog.i(SLog.TAG, "doShareToQzone() --end");
                        }
                    }
                    i10 = i11;
                    str = string6;
                    if (setKeySet.size() > 0) {
                        string10 = jSONObject.toString();
                    }
                } catch (Exception e12) {
                    e = e12;
                    i10 = i11;
                    str = string6;
                }
            } else {
                i10 = i11;
                str = string6;
                str2 = string9;
            }
        } catch (Exception e13) {
            e = e13;
            i10 = i11;
            str = string6;
            str2 = string9;
        }
        appId = this.f99424c.getAppId();
        openIdWithCache = this.f99424c.getOpenIdWithCache();
        SLog.v("openSDK_LOG.QzoneShare", "openId:" + openIdWithCache);
        if (stringArrayList != null && stringArrayList.size() > 0) {
            str3 = stringArrayList.get(0);
            stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(URLEncoder.encode(str3)), 2));
            if (!m.h(str3)) {
                strA = m.a(appId, activity, str3, iUiListener);
                if (!TextUtils.isEmpty(strA)) {
                    stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(URLEncoder.encode(strA)), 2));
                }
            }
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&title=" + Base64.encodeToString(m.j(string), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&url=" + Base64.encodeToString(m.j(string3), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(string5), 2));
        }
        if (!m.e(openIdWithCache)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openIdWithCache), 2));
        }
        if (!m.e(string4)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(m.j(string4), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i10)), 2));
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(m.j(String.valueOf(str)), 2));
        }
        if (!TextUtils.isEmpty(string7)) {
            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(m.j(String.valueOf(string7)), 2));
        }
        if (!TextUtils.isEmpty(string8)) {
            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(m.j(String.valueOf(string8)), 2));
        }
        if (!m.e(str2)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(m.j(str2), 2));
        }
        if (!TextUtils.isEmpty(string10)) {
            stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(m.j(string10), 2));
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(m.j(String.valueOf(i12)), 2));
        SLog.v("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + stringBuffer.toString());
        com.tencent.connect.a.a.a(g.a(), this.f99424c, "requireApi", "shareToNativeQQ");
        intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f99424c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f99424c.getAppId(), this.mViaShareQzoneType, "", "", "0", "1", "0"));
        if (m.g(activity, "4.6.0")) {
            UIListenerManager.getInstance().setListenerWithRequestcode(11104, iUiListener);
            a(activity, intent, 11104);
            SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
        } else {
            SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
            if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                SLog.i("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
            }
            a(activity, 10104, intent, false);
        }
        SLog.i(SLog.TAG, "doShareToQzone() --end");
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0375  */
    /* JADX WARN: Code duplicated, block: B:106:0x0379  */
    /* JADX WARN: Code duplicated, block: B:110:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:130:0x044a  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0139  */
    /* JADX WARN: Code duplicated, block: B:42:0x0145  */
    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0194  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:59:0x022f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0235  */
    /* JADX WARN: Code duplicated, block: B:65:0x0275  */
    /* JADX WARN: Code duplicated, block: B:66:0x0282  */
    /* JADX WARN: Code duplicated, block: B:77:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ff  */
    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        int i10;
        Bundle bundle2;
        String str2;
        SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() -- start");
        if (com.tencent.connect.a.a("openSDK_LOG.QzoneShare", iUiListener)) {
            return;
        }
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() params is null");
            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string5 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String strA = m.a(activity);
        if (strA != null) {
            str = "appName";
            if (strA.length() > 20) {
                strA = strA.substring(0, 20) + "...";
            }
            i10 = bundle.getInt("req_type");
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() get SHARE_TO_QZONE_KEY_TYPE: " + i10);
            if (i10 == 1 && i10 == 5) {
                this.mViaShareQzoneType = "2";
            } else {
                this.mViaShareQzoneType = "1";
            }
            if (i10 != 1) {
                SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true");
                this.f99453a = true;
                this.f99454d = false;
                this.f99455e = true;
                this.f99456f = false;
            } else {
                if (i10 != 5) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
                    e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 请选择支持的分享类型");
                    return;
                }
                if (i10 != 7) {
                    if (m.e(string) || !m.e(string2)) {
                        this.f99453a = true;
                    } else if (stringArrayList == null || stringArrayList.size() == 0) {
                        string = "来自" + strA + "的分享";
                        this.f99453a = true;
                    } else {
                        this.f99453a = false;
                    }
                    this.f99454d = false;
                    SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i10);
                    this.f99455e = true;
                    this.f99456f = false;
                } else {
                    if (TextUtils.isEmpty(string4) || TextUtils.isEmpty(string5)) {
                        iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
                    }
                    this.f99455e = false;
                    this.f99456f = false;
                    this.f99453a = false;
                }
            }
            if (m.a() && m.g(activity, "4.5.0")) {
                iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() sdcard is null--end");
                e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_NOSD_ERROR);
                return;
            }
            if (this.f99453a) {
                if (TextUtils.isEmpty(string3)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                    e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                    return;
                } else if (!m.h(string3)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                    e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                    return;
                }
            }
            if (this.f99454d) {
                bundle2 = bundle;
                bundle2.putString("title", "");
                bundle2.putString("summary", "");
            } else {
                bundle2 = bundle;
                if (!this.f99455e && m.e(string)) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() title is null--end");
                    e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() title is null");
                    return;
                }
                if (!m.e(string) || string.length() <= 200) {
                    str2 = null;
                } else {
                    str2 = null;
                    bundle2.putString("title", m.a(string, 200, (String) null, (String) null));
                }
                if (!m.e(string2) && string2.length() > 600) {
                    bundle2.putString("summary", m.a(string2, 600, str2, str2));
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                bundle2.putString(str, strA);
            }
            if (stringArrayList == null && stringArrayList.size() != 0) {
                int i11 = 0;
                while (i11 < stringArrayList.size()) {
                    String str3 = stringArrayList.get(i11);
                    if (!m.h(str3) && !m.i(str3)) {
                        stringArrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                if (stringArrayList.size() == 0) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
                    e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 非法的图片地址!");
                    return;
                }
                bundle2.putStringArrayList("imageUrl", stringArrayList);
            } else if (this.f99456f) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                return;
            }
            if (!m.g(activity, "4.6.0")) {
                SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
                b(activity, bundle, iUiListener);
            } else if (k.c(activity, "4.2.0") >= 0 || k.c(activity, "4.6.0") >= 0) {
                SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
                new TDialog(activity, "", a(""), null, this.f99424c).show();
            } else {
                SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver between 4.2.0 and 4.6.0, will use qqshare");
                QQShare qQShare = new QQShare(activity, this.f99424c);
                if (stringArrayList != null && stringArrayList.size() > 0) {
                    String str4 = stringArrayList.get(0);
                    if (i10 == 5 && !m.i(str4)) {
                        iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_MUST_BE_LOCAL, null));
                        SLog.e("openSDK_LOG.QzoneShare", "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                        e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                        return;
                    }
                    bundle2.putString("imageLocalUrl", str4);
                }
                if (!m.g(activity, "4.5.0")) {
                    bundle2.putInt("cflag", 1);
                }
                qQShare.shareToQQ(activity, bundle2, iUiListener);
            }
            SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
        }
        strA = bundle.getString("appName");
        str = "appName";
        i10 = bundle.getInt("req_type");
        SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() get SHARE_TO_QZONE_KEY_TYPE: " + i10);
        if (i10 == 1) {
            this.mViaShareQzoneType = "1";
        } else {
            this.mViaShareQzoneType = "1";
        }
        if (i10 != 1) {
            SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true");
            this.f99453a = true;
            this.f99454d = false;
            this.f99455e = true;
            this.f99456f = false;
        } else {
            if (i10 != 5) {
                iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
                e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 请选择支持的分享类型");
                return;
            }
            if (i10 != 7) {
                if (m.e(string)) {
                    this.f99453a = true;
                } else {
                    this.f99453a = true;
                }
                this.f99454d = false;
                SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i10);
                this.f99455e = true;
                this.f99456f = false;
            } else {
                if (TextUtils.isEmpty(string4)) {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
                } else {
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
                }
                this.f99455e = false;
                this.f99456f = false;
                this.f99453a = false;
            }
        }
        if (m.a()) {
        }
        if (this.f99453a) {
            if (TextUtils.isEmpty(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                return;
            } else if (!m.h(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                return;
            }
        }
        if (this.f99454d) {
            bundle2 = bundle;
            bundle2.putString("title", "");
            bundle2.putString("summary", "");
        } else {
            bundle2 = bundle;
            if (!this.f99455e) {
            }
            if (m.e(string)) {
                str2 = null;
            } else {
                str2 = null;
            }
            if (!m.e(string2)) {
                bundle2.putString("summary", m.a(string2, 600, str2, str2));
            }
        }
        if (!TextUtils.isEmpty(strA)) {
            bundle2.putString(str, strA);
        }
        if (stringArrayList == null) {
            if (this.f99456f) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                return;
            }
        } else if (this.f99456f) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
            return;
        }
        if (!m.g(activity, "4.6.0")) {
            SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
            b(activity, bundle, iUiListener);
        } else if (k.c(activity, "4.2.0") >= 0) {
            SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", a(""), null, this.f99424c).show();
        } else {
            SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", a(""), null, this.f99424c).show();
        }
        SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
    }
}
