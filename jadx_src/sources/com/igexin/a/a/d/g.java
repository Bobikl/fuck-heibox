package com.igexin.a.a.d;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes7.dex */
public class g extends IntentFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f63264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f63265b;

    g(f fVar, Context context) {
        this.f63265b = fVar;
        this.f63264a = context;
        addAction("AlarmTaskSchedule." + context.getPackageName());
        addAction("AlarmTaskScheduleBak." + context.getPackageName());
        addAction("android.intent.action.SCREEN_OFF");
        addAction("android.intent.action.SCREEN_ON");
    }
}
