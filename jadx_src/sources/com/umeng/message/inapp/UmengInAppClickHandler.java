package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;

/* JADX INFO: loaded from: classes4.dex */
public class UmengInAppClickHandler implements UInAppHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f105629a = "com.umeng.message.inapp.UmengInAppClickHandler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f105630b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f105631c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f105632d = null;

    @Override // com.umeng.message.inapp.UInAppHandler
    public final void handleInAppMessage(Activity activity, UInAppMessage uInAppMessage, int i10) {
        switch (i10) {
            case 16:
                this.f105630b = uInAppMessage.action_type;
                this.f105631c = uInAppMessage.action_activity;
                this.f105632d = uInAppMessage.action_url;
                break;
            case 17:
                this.f105630b = uInAppMessage.bottom_action_type;
                this.f105631c = uInAppMessage.bottom_action_activity;
                this.f105632d = uInAppMessage.bottom_action_url;
                break;
            case 18:
                this.f105630b = uInAppMessage.plainTextActionType;
                this.f105631c = uInAppMessage.plainTextActivity;
                this.f105632d = uInAppMessage.plainTextUrl;
                break;
            case 19:
                this.f105630b = uInAppMessage.customButtonActionType;
                this.f105631c = uInAppMessage.customButtonActivity;
                this.f105632d = uInAppMessage.customButtonUrl;
                break;
        }
        if (TextUtils.isEmpty(this.f105630b)) {
            return;
        }
        if (TextUtils.equals("go_activity", this.f105630b)) {
            openActivity(activity, this.f105631c);
        } else if (TextUtils.equals("go_url", this.f105630b)) {
            openUrl(activity, this.f105632d);
        } else {
            TextUtils.equals("go_app", this.f105630b);
        }
    }

    public void openActivity(Activity activity, String str) {
        if (str != null) {
            try {
                if (TextUtils.isEmpty(str.trim())) {
                    return;
                }
                UMLog.mutlInfo(f105629a, 2, "打开Activity: ".concat(str));
                Intent intent = new Intent();
                intent.setClassName(activity, str);
                intent.setFlags(536870912);
                activity.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void openUrl(Activity activity, String str) {
        if (str != null) {
            try {
                if (TextUtils.isEmpty(str.trim())) {
                    return;
                }
                UMLog.mutlInfo(f105629a, 2, "打开链接: ".concat(str));
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
