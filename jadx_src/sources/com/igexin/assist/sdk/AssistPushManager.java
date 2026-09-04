package com.igexin.assist.sdk;

import android.content.Context;
import com.igexin.assist.control.AbstractPushManager;
import com.igexin.push.core.b.i;
import com.igexin.push.core.d;

/* JADX INFO: loaded from: classes7.dex */
public class AssistPushManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractPushManager f63302a;

    private AssistPushManager() {
    }

    public static boolean checkSupportDevice(Context context) {
        return a.i(context);
    }

    public static AssistPushManager getInstance() {
        return c.f63312a;
    }

    public static String getToken() {
        return d.f63692z;
    }

    public String getSpToken() {
        try {
            return new com.igexin.push.core.b.d(d.f63671e).e();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void initialize(Context context) {
        this.f63302a = a.a(context);
    }

    public void register(Context context) {
        AbstractPushManager abstractPushManager = this.f63302a;
        if (abstractPushManager != null) {
            abstractPushManager.register(context);
        }
    }

    public void saveToken(String str) {
        i.a().c(str);
    }

    public void setSilentTime(Context context, int i10, int i11) {
        AbstractPushManager abstractPushManager = this.f63302a;
        if (abstractPushManager != null) {
            abstractPushManager.setSilentTime(context, i10, i11);
        }
    }

    public void turnOffPush(Context context) {
        AbstractPushManager abstractPushManager = this.f63302a;
        if (abstractPushManager != null) {
            abstractPushManager.turnOffPush(context);
        }
    }

    public void turnOnPush(Context context) {
        AbstractPushManager abstractPushManager = this.f63302a;
        if (abstractPushManager != null) {
            abstractPushManager.turnOnPush(context);
        }
    }

    public void unregister(Context context) {
        AbstractPushManager abstractPushManager = this.f63302a;
        if (abstractPushManager != null) {
            abstractPushManager.unregister(context);
        }
    }
}
