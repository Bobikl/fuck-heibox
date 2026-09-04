package com.hihonor.push.sdk;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HonorPushClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HonorPushClient f59994a = new HonorPushClient();

    public static HonorPushClient getInstance() {
        return f59994a;
    }

    public boolean checkSupportHonorPush(Context context) {
        return l.f60050e.a(context);
    }

    public void deletePushToken(HonorPushCallback<Void> honorPushCallback) {
        l lVar = l.f60050e;
        lVar.a(new g(lVar, honorPushCallback), honorPushCallback);
    }

    public void getNotificationCenterStatus(HonorPushCallback<Boolean> honorPushCallback) {
        l lVar = l.f60050e;
        lVar.a(new h(lVar, honorPushCallback), honorPushCallback);
    }

    public void getPushToken(HonorPushCallback<String> honorPushCallback) {
        l lVar = l.f60050e;
        lVar.a(new f(lVar, honorPushCallback, false), honorPushCallback);
    }

    public void getUnReadMessageBox(HonorPushCallback<List<HonorPushDataMsg>> honorPushCallback) {
        l lVar = l.f60050e;
        lVar.a(new k(lVar, honorPushCallback), honorPushCallback);
    }

    public void init(Context context, boolean z10) {
        l lVar = l.f60050e;
        v vVar = new v();
        vVar.f60092a = context.getApplicationContext();
        vVar.f60093b = z10;
        b1.a(new e(lVar, vVar));
    }

    public void turnOffNotificationCenter(HonorPushCallback<Void> honorPushCallback) {
        l lVar = l.f60050e;
        lVar.a(new j(lVar, honorPushCallback), honorPushCallback);
    }

    public void turnOnNotificationCenter(HonorPushCallback<Void> honorPushCallback) {
        l lVar = l.f60050e;
        lVar.a(new i(lVar, honorPushCallback), honorPushCallback);
    }
}
