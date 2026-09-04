package com.umeng.socialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.handler.UMSSOHandler;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.utils.CommonUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UMShareAPI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UMShareAPI f106045a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f106046b = true;
    public boolean isZyb = true;

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean a() {
        try {
            Class<?> clsA = a("com.umeng.commonsdk.framework.UMEnvelopeBuild");
            return (clsA == null || clsA.getDeclaredMethod("buildEnvelopeWithExtHeader", Context.class, JSONObject.class, JSONObject.class, String.class, String.class, String.class) == null) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean a(final Context context) {
        if (a()) {
            return true;
        }
        new Thread() { // from class: com.umeng.socialize.UMShareAPI.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    Looper.prepare();
                    Toast.makeText(context.getApplicationContext(), UmengText.CHECK.DEPENDENT_COMMON_NOT_MATCH, 1).show();
                    Looper.loop();
                } catch (Throwable unused) {
                }
            }
        }.start();
        SLog.E(UmengText.CHECK.DEPENDENT_COMMON_NOT_MATCH);
        return false;
    }

    public static UMShareAPI get(Context context) {
        if (!a(context) || CommonUtil.isSilentMode(context)) {
            b bVar = new b(context);
            f106045a = bVar;
            return bVar;
        }
        if (f106045a == null) {
            f106045a = new a(context);
            SLog.welcome();
        }
        return f106045a;
    }

    public static String getSdkVersion() {
        return "7.3.2";
    }

    public static boolean getSmartEnableFlag() {
        return f106046b;
    }

    public static void init(Context context, String str) {
        if (a(context)) {
            SocializeConstants.APPKEY = str;
            get(context);
            UMWorkDispatch.sendEvent(context, SocializeConstants.REGIST_TO_WORK_QUEUE, CommonNetImpl.get(context), null);
        }
    }

    public static void setSmartEnable(boolean z10) {
        f106046b = z10;
    }

    public void deleteOauth(Activity activity, SHARE_MEDIA share_media, UMAuthListener uMAuthListener) {
        f106045a.deleteOauth(activity, share_media, uMAuthListener);
    }

    @Deprecated
    public void doOauthVerify(Activity activity, SHARE_MEDIA share_media, UMAuthListener uMAuthListener) {
        f106045a.doOauthVerify(activity, share_media, uMAuthListener);
    }

    public void doShare(Activity activity, ShareAction shareAction, UMShareListener uMShareListener) {
        f106045a.doShare(activity, shareAction, uMShareListener);
    }

    public void fetchAuthResultWithBundle(Activity activity, Bundle bundle, UMAuthListener uMAuthListener) {
        f106045a.fetchAuthResultWithBundle(activity, bundle, uMAuthListener);
    }

    public UMSSOHandler getHandler(SHARE_MEDIA share_media) {
        return f106045a.getHandler(share_media);
    }

    public void getPlatformInfo(Activity activity, SHARE_MEDIA share_media, UMAuthListener uMAuthListener) {
        f106045a.getPlatformInfo(activity, share_media, uMAuthListener);
    }

    public String getversion(Activity activity, SHARE_MEDIA share_media) {
        return f106045a.getversion(activity, share_media);
    }

    public boolean isAuthorize(Activity activity, SHARE_MEDIA share_media) {
        return f106045a.isAuthorize(activity, share_media);
    }

    public boolean isInstall(Activity activity, SHARE_MEDIA share_media) {
        return f106045a.isInstall(activity, share_media);
    }

    public boolean isSupport(Activity activity, SHARE_MEDIA share_media) {
        return f106045a.isSupport(activity, share_media);
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        f106045a.onActivityResult(i10, i11, intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        f106045a.onSaveInstanceState(bundle);
    }

    public void release() {
        f106045a.release();
    }

    public void setShareConfig(UMShareConfig uMShareConfig) {
        f106045a.setShareConfig(uMShareConfig);
    }
}
