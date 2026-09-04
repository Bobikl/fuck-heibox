package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.fq;
import com.xiaomi.push.jj;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ar {
    abstract fq a(Context context, int i10, String str, Map<String, String> map);

    abstract void a(jj jjVar, Map<String, String> map, int i10, Notification notification);

    abstract void a(String str);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    abstract boolean m705a(Context context, int i10, String str, Map<String, String> map);

    abstract boolean a(Map<String, String> map, int i10, Notification notification);
}
