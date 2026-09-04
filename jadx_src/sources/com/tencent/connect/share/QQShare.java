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
import com.tencent.open.utils.c;
import com.tencent.open.utils.d;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class QQShare extends BaseApi {
    public static final int QQ_SHARE_SUMMARY_MAX_LENGTH = 512;
    public static final int QQ_SHARE_TITLE_MAX_LENGTH = 128;
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_ARK_INFO = "share_to_qq_ark_info";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final int SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN = 1;
    public static final int SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE = 2;
    public static final String SHARE_TO_QQ_GAME_MESSAGE_EXT = "game_message_ext";
    public static final String SHARE_TO_QQ_GAME_TAG_NAME = "game_tag_name";
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QQ_MINI_PROGRAM = 7;
    public static final String SHARE_TO_QQ_MINI_PROGRAM_APPID = "mini_program_appid";
    public static final String SHARE_TO_QQ_MINI_PROGRAM_PATH = "mini_program_path";
    public static final String SHARE_TO_QQ_MINI_PROGRAM_TYPE = "mini_program_type";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final int SHARE_TO_QQ_TYPE_AUDIO = 2;
    public static final int SHARE_TO_QQ_TYPE_DEFAULT = 1;
    public static final int SHARE_TO_QQ_TYPE_IMAGE = 5;
    public String mViaShareQQType;

    public QQShare(Context context, QQToken qQToken) {
        super(qQToken);
        this.mViaShareQQType = "";
    }

    private void b(final Activity activity, final Bundle bundle, final IUiListener iUiListener) {
        SLog.i("openSDK_LOG.QQShare", "shareToMobileQQ() -- start.");
        String string = bundle.getString("imageUrl");
        final String string2 = bundle.getString("title");
        final String string3 = bundle.getString("summary");
        SLog.v("openSDK_LOG.QQShare", "shareToMobileQQ -- imageUrl: " + string);
        if (TextUtils.isEmpty(string)) {
            if (bundle.getInt("req_type", 1) == 5) {
                c(activity, bundle, iUiListener);
            } else {
                d(activity, bundle, iUiListener);
            }
        } else if (!m.h(string)) {
            bundle.putString("imageUrl", null);
            if (m.f(activity, "4.3.0")) {
                SLog.d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is < 4.3.0 ");
                d(activity, bundle, iUiListener);
            } else {
                SLog.d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is > 4.3.0:isAppSpecificDir=" + m.m(string) + ",hasSDPermission:" + m.c());
                a.a(activity, string, new d() { // from class: com.tencent.connect.share.QQShare.2
                    @Override // com.tencent.open.utils.d
                    public void a(int i10, String str) {
                        if (i10 == 0) {
                            bundle.putString("imageLocalUrl", str);
                        } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                            IUiListener iUiListener2 = iUiListener;
                            if (iUiListener2 != null) {
                                iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                                SLog.e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                            }
                            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                            return;
                        }
                        QQShare.this.d(activity, bundle, iUiListener);
                    }

                    @Override // com.tencent.open.utils.d
                    public void a(int i10, ArrayList<String> arrayList) {
                        if (i10 == 0) {
                            bundle.putStringArrayList("imageLocalUrlArray", arrayList);
                        } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                            IUiListener iUiListener2 = iUiListener;
                            if (iUiListener2 != null) {
                                iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                                SLog.e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                            }
                            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                            return;
                        }
                        QQShare.this.d(activity, bundle, iUiListener);
                    }
                });
            }
        } else if (m.f(activity, "4.3.0")) {
            new c(activity).a(string, new d() { // from class: com.tencent.connect.share.QQShare.1
                @Override // com.tencent.open.utils.d
                public void a(int i10, String str) {
                    if (i10 == 0) {
                        bundle.putString("imageLocalUrl", str);
                    } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
                        IUiListener iUiListener2 = iUiListener;
                        if (iUiListener2 != null) {
                            iUiListener2.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                            SLog.e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                        }
                        e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, ((BaseApi) QQShare.this).f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_GETIMG_ERROR);
                        return;
                    }
                    QQShare.this.d(activity, bundle, iUiListener);
                }

                @Override // com.tencent.open.utils.d
                public void a(int i10, ArrayList<String> arrayList) {
                }
            });
        } else {
            d(activity, bundle, iUiListener);
        }
        SLog.i("openSDK_LOG.QQShare", "shareToMobileQQ() -- end");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d6  */
    private void c(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String string = bundle.getString("imageLocalUrl");
        String str2 = null;
        if (new File(string).length() >= 5242880) {
            if (iUiListener != null) {
                iUiListener.onError(new UiError(-16, Constants.MSG_SHARE_IMAGE_TOO_LARGE_ERROR, null));
            }
            SLog.e("openSDK_LOG.QQShare", "doShareImageToQQ -- error: 图片太大，请压缩到5M内再分享!");
            return;
        }
        File fileA = g.a("Images");
        if (fileA != null) {
            str2 = fileA.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
        } else {
            SLog.i("openSDK_LOG.QQShare", "doShareImageToQQ() getExternalFilesDir return null");
        }
        File file = new File(string);
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        boolean zM = m.m(absolutePath);
        SLog.i("openSDK_LOG.QQShare", "doShareImageToQQ() check file: isAppSpecificDir=" + zM + ",hasSDPermission=" + m.c() + ",fileDir=" + absolutePath);
        ArrayList<String> arrayList = new ArrayList<>(2);
        if (zM || TextUtils.isEmpty(str2)) {
            str = absolutePath;
        } else {
            str = str2 + File.separator + name;
            boolean zA = m.a((Context) activity, absolutePath, str);
            SLog.i("openSDK_LOG.QQShare", "doShareImageToQQ() sd permission not denied. copy to app specific:" + str + ",isSuccess=" + zA);
            if (!zA) {
                str = absolutePath;
            }
        }
        arrayList.add(absolutePath);
        arrayList.add(str);
        SLog.i("openSDK_LOG.QQShare", "doShareImageToQQ() destFilePaths=[" + arrayList.get(0) + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP + arrayList.get(1) + "]");
        bundle.putStringArrayList("imageLocalUrlArray", arrayList);
        d(activity, bundle, iUiListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.QQShare", "doShareToQQ() -- start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_fri?src_type=app&version=1&file_type=news");
        String string = bundle.getString("imageUrl");
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        String string4 = bundle.getString("targetUrl");
        String string5 = bundle.getString("audio_url");
        int i10 = bundle.getInt("req_type", 1);
        String string6 = bundle.getString(SHARE_TO_QQ_ARK_INFO);
        String string7 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string8 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_PATH);
        String string9 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_TYPE);
        int i11 = bundle.getInt("cflag", 0);
        String string10 = bundle.getString("share_qq_ext_str");
        String strA = m.a(activity);
        if (strA == null) {
            strA = bundle.getString("appName");
        }
        String str = strA;
        String string11 = bundle.getString("imageLocalUrl");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageLocalUrlArray");
        String appId = this.f99424c.getAppId();
        String openIdWithCache = this.f99424c.getOpenIdWithCache();
        SLog.i("openSDK_LOG.QQShare", "doShareToQQ -- openid: " + openIdWithCache + ",appName=" + str);
        if (stringArrayList != null && stringArrayList.size() >= 2) {
            String str2 = stringArrayList.get(0);
            if (str2 == null) {
                str2 = "";
            }
            stringBuffer.append("&file_data=" + Base64.encodeToString(m.j(str2), 2));
            String str3 = stringArrayList.get(1);
            if (i10 == 7 && !TextUtils.isEmpty(str3) && k.c(activity, "8.3.3") < 0) {
                str3 = null;
                SLog.e("openSDK_LOG.QQShare", "doShareToQQ() share to mini program set file uri empty");
            }
            Uri uriA = m.a(activity, appId, str3);
            if (uriA != null) {
                stringBuffer.append("&file_uri=");
                stringBuffer.append(Base64.encodeToString(m.j(uriA.toString()), 2));
            }
        } else if (!TextUtils.isEmpty(string11)) {
            stringBuffer.append("&file_data=" + Base64.encodeToString(m.j(string11), 2));
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(string), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&title=" + Base64.encodeToString(m.j(string2), 2));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&description=" + Base64.encodeToString(m.j(string3), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string4)) {
            stringBuffer.append("&url=" + Base64.encodeToString(m.j(string4), 2));
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > 20) {
                str = str.substring(0, 20) + "...";
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(str), 2));
        }
        if (!TextUtils.isEmpty(openIdWithCache)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openIdWithCache), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(m.j(string5), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i10)), 2));
        if (!TextUtils.isEmpty(string7)) {
            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(m.j(String.valueOf(string7)), 2));
        }
        if (!TextUtils.isEmpty(string8)) {
            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(m.j(String.valueOf(string8)), 2));
        }
        if (!TextUtils.isEmpty(string9)) {
            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(m.j(String.valueOf(string9)), 2));
        }
        if (!TextUtils.isEmpty(string6)) {
            stringBuffer.append("&share_to_qq_ark_info=" + Base64.encodeToString(m.j(string6), 2));
        }
        if (!TextUtils.isEmpty(string10)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(m.j(string10), 2));
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(m.j(String.valueOf(i11)), 2));
        stringBuffer.append("&third_sd=" + Base64.encodeToString(m.j(String.valueOf(m.c())), 2));
        SLog.v("openSDK_LOG.QQShare", "doShareToQQ -- url: " + stringBuffer.toString());
        com.tencent.connect.a.a.a(g.a(), this.f99424c, "requireApi", "shareToNativeQQ");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f99424c.getOpenId(), i11 == 1 ? "11" : "10", "3", Constants.VIA_SHARE_TO_QQ, this.f99424c.getAppId(), this.mViaShareQQType, "", "", "0", "1", "0"));
        intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        if (m.f(activity, "4.6.0")) {
            SLog.i("openSDK_LOG.QQShare", "doShareToQQ, qqver below 4.6.");
            UIListenerManager.getInstance().setListenerWithRequestcode(11103, iUiListener);
            a(activity, intent, 11103);
        } else {
            SLog.i("openSDK_LOG.QQShare", "doShareToQQ, qqver greater than 4.6.");
            if (UIListenerManager.getInstance().setListnerWithAction("shareToQQ", iUiListener) != null) {
                SLog.i("openSDK_LOG.QQShare", "doShareToQQ, last listener is not null, cancel it.");
            }
            a(activity, 10103, intent, true);
        }
        SLog.i("openSDK_LOG.QQShare", "doShareToQQ() --end");
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
    }

    public void shareToQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        int i10;
        Bundle bundle2;
        String str;
        SLog.i("openSDK_LOG.QQShare", "shareToQQ() -- start.");
        if (com.tencent.connect.a.a("openSDK_LOG.QQShare", iUiListener)) {
            return;
        }
        String string = bundle.getString("imageUrl");
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        String string4 = bundle.getString("targetUrl");
        String string5 = bundle.getString("imageLocalUrl");
        String string6 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string7 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_PATH);
        int i11 = bundle.getInt("req_type", 1);
        SLog.i("openSDK_LOG.QQShare", "shareToQQ -- type: " + i11);
        if (i11 == 1) {
            this.mViaShareQQType = "1";
        } else if (i11 == 2) {
            this.mViaShareQQType = "3";
        } else if (i11 == 5) {
            this.mViaShareQQType = "2";
        } else if (i11 == 7) {
            this.mViaShareQQType = "9";
        }
        if (!m.a() && m.f(activity, "4.5.0")) {
            iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
            SLog.e("openSDK_LOG.QQShare", "shareToQQ sdcard is null--end");
            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ sdcard is null");
            return;
        }
        if (i11 == 5) {
            if (m.f(activity, "4.3.0")) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_QQ_VERSION_ERROR, null));
                SLog.e("openSDK_LOG.QQShare", "shareToQQ, version below 4.3 is not support.");
                e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, version below 4.3 is not support.");
                return;
            } else if (!m.i(string5)) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                SLog.e("openSDK_LOG.QQShare", "shareToQQ -- error: 非法的图片地址!");
                e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR);
                return;
            }
        }
        if (i11 != 5) {
            i10 = 7;
            if (i11 != 7) {
                if (TextUtils.isEmpty(string4) || !(string4.startsWith("http://") || string4.startsWith("https://"))) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_ERROR, null));
                    SLog.e("openSDK_LOG.QQShare", "shareToQQ, targetUrl is empty or illegal..");
                    e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, targetUrl is empty or illegal..");
                    return;
                } else {
                    if (TextUtils.isEmpty(string2)) {
                        iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
                        SLog.e("openSDK_LOG.QQShare", "shareToQQ, title is empty.");
                        e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, title is empty.");
                        return;
                    }
                    i10 = 7;
                }
            }
        } else {
            i10 = 7;
        }
        if (i11 == i10) {
            if (TextUtils.isEmpty(string6) || TextUtils.isEmpty(string7) || TextUtils.isEmpty(string4) || TextUtils.isEmpty(this.f99424c.getAppId())) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid || path || url empty."));
                return;
            }
            if (!(k.c(activity, "8.0.8") >= 0 || k.d(activity, "3.1") >= 0)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_QQ_VERSION_ERROR, "版本过低，不支持分享小程序"));
                return;
            } else if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "title || summary empty."));
                return;
            }
        }
        if (!TextUtils.isEmpty(string) && !string.startsWith("http://") && !string.startsWith("https://") && !new File(string).exists()) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
            SLog.e("openSDK_LOG.QQShare", "shareToQQ, image url is emprty or illegal.");
            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, image url is emprty or illegal.");
            return;
        }
        if (TextUtils.isEmpty(string2) || string2.length() <= 128) {
            bundle2 = bundle;
            str = null;
        } else {
            str = null;
            bundle2 = bundle;
            bundle2.putString("title", m.a(string2, 128, (String) null, (String) null));
        }
        if (!TextUtils.isEmpty(string3) && string3.length() > 512) {
            bundle2.putString("summary", m.a(string3, 512, str, str));
        }
        if (m.a(activity, bundle2.getInt("cflag", 0) == 1)) {
            SLog.i("openSDK_LOG.QQShare", "shareToQQ, support share");
            b(activity, bundle, iUiListener);
        } else {
            try {
                SLog.w("openSDK_LOG.QQShare", "shareToQQ, don't support share, will show download dialog");
                new TDialog(activity, "", a(""), null, this.f99424c).show();
            } catch (RuntimeException e10) {
                SLog.e("openSDK_LOG.QQShare", " shareToQQ, TDialog.show not in main thread", e10);
                iUiListener.onError(new UiError(-6, Constants.MSG_NOT_CALL_ON_MAIN_THREAD, null));
            }
        }
        SLog.i("openSDK_LOG.QQShare", "shareToQQ() -- end.");
    }
}
