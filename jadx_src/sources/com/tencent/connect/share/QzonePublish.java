package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.TDialog;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class QzonePublish extends BaseApi {
    public static final String HULIAN_CALL_BACK = "hulian_call_back";
    public static final String HULIAN_EXTRA_SCENE = "hulian_extra_scene";
    public static final String PUBLISH_TO_QZONE_APP_NAME = "appName";
    public static final String PUBLISH_TO_QZONE_EXTMAP = "extMap";
    public static final String PUBLISH_TO_QZONE_IMAGE_URL = "imageUrl";
    public static final String PUBLISH_TO_QZONE_KEY_TYPE = "req_type";
    public static final String PUBLISH_TO_QZONE_SUMMARY = "summary";
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD = 3;
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO = 4;
    public static final String PUBLISH_TO_QZONE_VIDEO_DURATION = "videoDuration";
    public static final String PUBLISH_TO_QZONE_VIDEO_PATH = "videoPath";
    public static final String PUBLISH_TO_QZONE_VIDEO_SIZE = "videoSize";

    public QzonePublish(Context context, QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0172  */
    /* JADX WARN: Code duplicated, block: B:49:0x017d  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x020c  */
    /* JADX WARN: Code duplicated, block: B:58:0x022f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0249  */
    /* JADX WARN: Code duplicated, block: B:64:0x026c  */
    /* JADX WARN: Code duplicated, block: B:67:0x028f  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x017d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x01a4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x020c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x022f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0249, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x026c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x028f, please report this as an issue */
    public void b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        String str2;
        String string;
        String appId;
        String openId;
        String str3;
        String str4;
        String strA;
        SLog.i("openSDK_LOG.QzonePublish", "doPublishToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://qzone/publish?src_type=app&version=1&file_type=news");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string2 = bundle.getString("summary");
        int i10 = bundle.getInt("req_type", 3);
        String string3 = bundle.getString("appName");
        String string4 = bundle.getString(PUBLISH_TO_QZONE_VIDEO_PATH);
        int i11 = bundle.getInt(PUBLISH_TO_QZONE_VIDEO_DURATION);
        long j10 = bundle.getLong(PUBLISH_TO_QZONE_VIDEO_SIZE);
        try {
            Bundle bundle2 = bundle.getBundle("extMap");
            if (bundle2 != null) {
                Set<String> setKeySet = bundle2.keySet();
                str = "";
                try {
                    JSONObject jSONObject = new JSONObject();
                    Iterator<String> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        Iterator<String> it2 = it;
                        String next = it.next();
                        if (TextUtils.isEmpty(bundle2.getString(next))) {
                            str2 = string3;
                        } else {
                            str2 = string3;
                            try {
                                jSONObject.put(next, bundle2.getString(next));
                            } catch (Exception e10) {
                                e = e10;
                                SLog.e("openSDK_LOG.QzonePublish", "publishToQzone()  --error parse extmap", e);
                                string = str;
                                appId = this.f99424c.getAppId();
                                openId = this.f99424c.getOpenId();
                                SLog.v("openSDK_LOG.QzonePublish", "openId:" + openId);
                                if (3 == i10) {
                                    str3 = openId;
                                    str4 = str;
                                } else {
                                    str3 = openId;
                                    str4 = str;
                                }
                                if (4 == i10) {
                                    stringBuffer.append("&videoPath=" + Base64.encodeToString(m.j(string4), 2));
                                    strA = m.a(appId, activity, string4, iUiListener);
                                    if (!TextUtils.isEmpty(strA)) {
                                        stringBuffer.append("&videoUri=" + Base64.encodeToString(m.j(strA), 2));
                                    }
                                    stringBuffer.append("&videoDuration=" + Base64.encodeToString(m.j(String.valueOf(i11)), 2));
                                    stringBuffer.append("&videoSize=" + Base64.encodeToString(m.j(String.valueOf(j10)), 2));
                                    str4 = "8";
                                }
                                String str5 = str4;
                                if (!TextUtils.isEmpty(string2)) {
                                    stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
                                }
                                if (!TextUtils.isEmpty(appId)) {
                                    stringBuffer.append("&share_id=" + appId);
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(str2), 2));
                                }
                                if (!m.e(str3)) {
                                    stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(str3), 2));
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(m.j(string), 2));
                                }
                                stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i10)), 2));
                                SLog.v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
                                com.tencent.connect.a.a.a(g.a(), this.f99424c, "requireApi", "shareToNativeQQ");
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setPackage("com.tencent.mobileqq");
                                intent.setData(Uri.parse(stringBuffer.toString()));
                                intent.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                                intent.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f99424c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f99424c.getAppId(), str5, "", "", "0", "1", "0"));
                                a(activity, 10104, intent, false);
                                SLog.i(SLog.TAG, "doPublishToQzone() --end");
                            }
                        }
                        it = it2;
                        string3 = str2;
                    }
                    str2 = string3;
                    if (jSONObject.length() > 0) {
                        string = jSONObject.toString();
                    }
                } catch (Exception e11) {
                    e = e11;
                    str2 = string3;
                    SLog.e("openSDK_LOG.QzonePublish", "publishToQzone()  --error parse extmap", e);
                    string = str;
                    appId = this.f99424c.getAppId();
                    openId = this.f99424c.getOpenId();
                    SLog.v("openSDK_LOG.QzonePublish", "openId:" + openId);
                    if (3 == i10) {
                        str3 = openId;
                        str4 = str;
                    } else {
                        str3 = openId;
                        str4 = str;
                    }
                    if (4 == i10) {
                        stringBuffer.append("&videoPath=" + Base64.encodeToString(m.j(string4), 2));
                        strA = m.a(appId, activity, string4, iUiListener);
                        if (!TextUtils.isEmpty(strA)) {
                            stringBuffer.append("&videoUri=" + Base64.encodeToString(m.j(strA), 2));
                        }
                        stringBuffer.append("&videoDuration=" + Base64.encodeToString(m.j(String.valueOf(i11)), 2));
                        stringBuffer.append("&videoSize=" + Base64.encodeToString(m.j(String.valueOf(j10)), 2));
                        str4 = "8";
                    }
                    String str6 = str4;
                    if (!TextUtils.isEmpty(string2)) {
                        stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
                    }
                    if (!TextUtils.isEmpty(appId)) {
                        stringBuffer.append("&share_id=" + appId);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(str2), 2));
                    }
                    if (!m.e(str3)) {
                        stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(str3), 2));
                    }
                    if (!TextUtils.isEmpty(string)) {
                        stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(m.j(string), 2));
                    }
                    stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i10)), 2));
                    SLog.v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
                    com.tencent.connect.a.a.a(g.a(), this.f99424c, "requireApi", "shareToNativeQQ");
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setPackage("com.tencent.mobileqq");
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                    intent2.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                    intent2.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f99424c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f99424c.getAppId(), str6, "", "", "0", "1", "0"));
                    a(activity, 10104, intent2, false);
                    SLog.i(SLog.TAG, "doPublishToQzone() --end");
                }
                appId = this.f99424c.getAppId();
                openId = this.f99424c.getOpenId();
                SLog.v("openSDK_LOG.QzonePublish", "openId:" + openId);
                if (3 == i10 || stringArrayList == null) {
                    str3 = openId;
                    str4 = str;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    StringBuffer stringBuffer3 = new StringBuffer();
                    int size = stringArrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        String str7 = openId;
                        stringBuffer2.append(URLEncoder.encode(stringArrayList.get(i12)));
                        String strA2 = m.a(appId, activity, stringArrayList.get(i12), iUiListener);
                        if (!TextUtils.isEmpty(strA2)) {
                            stringBuffer3.append(URLEncoder.encode(strA2));
                        }
                        if (i12 != size - 1) {
                            stringBuffer2.append(";");
                            stringBuffer3.append(";");
                        }
                        i12++;
                        openId = str7;
                    }
                    str3 = openId;
                    stringBuffer.append("&image_url=" + Base64.encodeToString(m.j(stringBuffer2.toString()), 2));
                    if (!TextUtils.isEmpty(stringBuffer3.toString())) {
                        stringBuffer.append("&image_uri=" + Base64.encodeToString(m.j(stringBuffer3.toString()), 2));
                    }
                    str4 = "7";
                }
                if (4 == i10) {
                    stringBuffer.append("&videoPath=" + Base64.encodeToString(m.j(string4), 2));
                    strA = m.a(appId, activity, string4, iUiListener);
                    if (!TextUtils.isEmpty(strA)) {
                        stringBuffer.append("&videoUri=" + Base64.encodeToString(m.j(strA), 2));
                    }
                    stringBuffer.append("&videoDuration=" + Base64.encodeToString(m.j(String.valueOf(i11)), 2));
                    stringBuffer.append("&videoSize=" + Base64.encodeToString(m.j(String.valueOf(j10)), 2));
                    str4 = "8";
                }
                String str8 = str4;
                if (!TextUtils.isEmpty(string2)) {
                    stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
                }
                if (!TextUtils.isEmpty(appId)) {
                    stringBuffer.append("&share_id=" + appId);
                }
                if (!TextUtils.isEmpty(str2)) {
                    stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(str2), 2));
                }
                if (!m.e(str3)) {
                    stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(str3), 2));
                }
                if (!TextUtils.isEmpty(string)) {
                    stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(m.j(string), 2));
                }
                stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i10)), 2));
                SLog.v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
                com.tencent.connect.a.a.a(g.a(), this.f99424c, "requireApi", "shareToNativeQQ");
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setPackage("com.tencent.mobileqq");
                intent3.setData(Uri.parse(stringBuffer.toString()));
                intent3.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
                intent3.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f99424c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f99424c.getAppId(), str8, "", "", "0", "1", "0"));
                a(activity, 10104, intent3, false);
                SLog.i(SLog.TAG, "doPublishToQzone() --end");
            }
            str = "";
            str2 = string3;
        } catch (Exception e12) {
            e = e12;
            str = "";
        }
        string = str;
        appId = this.f99424c.getAppId();
        openId = this.f99424c.getOpenId();
        SLog.v("openSDK_LOG.QzonePublish", "openId:" + openId);
        if (3 == i10) {
            str3 = openId;
            str4 = str;
        } else {
            str3 = openId;
            str4 = str;
        }
        if (4 == i10) {
            stringBuffer.append("&videoPath=" + Base64.encodeToString(m.j(string4), 2));
            strA = m.a(appId, activity, string4, iUiListener);
            if (!TextUtils.isEmpty(strA)) {
                stringBuffer.append("&videoUri=" + Base64.encodeToString(m.j(strA), 2));
            }
            stringBuffer.append("&videoDuration=" + Base64.encodeToString(m.j(String.valueOf(i11)), 2));
            stringBuffer.append("&videoSize=" + Base64.encodeToString(m.j(String.valueOf(j10)), 2));
            str4 = "8";
        }
        String str9 = str4;
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&description=" + Base64.encodeToString(m.j(string2), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(str2)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(str2), 2));
        }
        if (!m.e(str3)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(str3), 2));
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&share_qzone_ext_str=" + Base64.encodeToString(m.j(string), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(m.j(String.valueOf(i10)), 2));
        SLog.v("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
        com.tencent.connect.a.a.a(g.a(), this.f99424c, "requireApi", "shareToNativeQQ");
        Intent intent4 = new Intent("android.intent.action.VIEW");
        intent4.setPackage("com.tencent.mobileqq");
        intent4.setData(Uri.parse(stringBuffer.toString()));
        intent4.putExtra(Constants.PARAM_PKG_NAME, activity.getPackageName());
        intent4.putExtra(Constants.KEY_PASS_REPORT_VIA_PARAM, m.a(this.f99424c.getOpenId(), "11", "3", Constants.VIA_SHARE_TO_QZONE, this.f99424c.getAppId(), str9, "", "", "0", "1", "0"));
        a(activity, 10104, intent4, false);
        SLog.i(SLog.TAG, "doPublishToQzone() --end");
    }

    public void publishToQzone(final Activity activity, final Bundle bundle, final IUiListener iUiListener) {
        SLog.i("openSDK_LOG.QzonePublish", "publishToQzone() -- start");
        if (com.tencent.connect.a.a("openSDK_LOG.QzonePublish", iUiListener)) {
            return;
        }
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            SLog.e("openSDK_LOG.QzonePublish", "-->publishToQzone, params is null");
            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        if (!m.f(activity)) {
            iUiListener.onError(new UiError(-15, Constants.MSG_PARAM_VERSION_TOO_LOW, null));
            SLog.e("openSDK_LOG.QzonePublish", "-->publishToQzone, this is not support below qq 5.9.5");
            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publicToQzone, this is not support below qq 5.9.5");
            new TDialog(activity, "", a(""), null, this.f99424c).show();
            return;
        }
        String strA = m.a(activity);
        int i10 = 0;
        if (strA == null) {
            strA = bundle.getString("appName");
        } else if (strA.length() > 20) {
            strA = strA.substring(0, 20) + "...";
        }
        if (!TextUtils.isEmpty(strA)) {
            bundle.putString("appName", strA);
        }
        int i11 = bundle.getInt("req_type");
        if (i11 == 3) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
            if (stringArrayList != null && stringArrayList.size() > 0) {
                while (i10 < stringArrayList.size()) {
                    if (!m.i(stringArrayList.get(i10))) {
                        stringArrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                bundle.putStringArrayList("imageUrl", stringArrayList);
            }
            b(activity, bundle, iUiListener);
            SLog.i("openSDK_LOG.QzonePublish", "publishToQzone() --end");
            return;
        }
        if (i11 != 4) {
            iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
            SLog.e("openSDK_LOG.QzonePublish", "publishToQzone() error--end请选择支持的分享类型");
            e.a().a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publishToQzone() 请选择支持的分享类型");
            return;
        }
        final String string = bundle.getString(PUBLISH_TO_QZONE_VIDEO_PATH);
        if (!m.i(string)) {
            SLog.e("openSDK_LOG.QzonePublish", "publishToQzone() video url invalid");
            iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.tencent.connect.share.QzonePublish.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer2) {
                long length = new File(string).length();
                int duration = mediaPlayer2.getDuration();
                bundle.putString(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, string);
                bundle.putInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, duration);
                bundle.putLong(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, length);
                QzonePublish.this.b(activity, bundle, iUiListener);
                SLog.i("openSDK_LOG.QzonePublish", "publishToQzone() --end");
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.tencent.connect.share.QzonePublish.2
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer2, int i12, int i13) {
                SLog.e("openSDK_LOG.QzonePublish", "publishToQzone() mediaplayer onError()");
                iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
                return false;
            }
        });
        try {
            mediaPlayer.setDataSource(string);
            mediaPlayer.prepareAsync();
        } catch (Exception unused) {
            SLog.e("openSDK_LOG.QzonePublish", "publishToQzone() exception(s) occurred when preparing mediaplayer");
            iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
        }
    }
}
