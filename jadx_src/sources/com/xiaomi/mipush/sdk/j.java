package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106790a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ e f154a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f155a;

    j(String str, Context context, e eVar) {
        this.f155a = str;
        this.f106790a = context;
        this.f154a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strSubstring;
        if (TextUtils.isEmpty(this.f155a)) {
            return;
        }
        String[] strArrSplit = this.f155a.split(Constants.WAVE_SEPARATOR);
        int length = strArrSplit.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                strSubstring = "";
                break;
            }
            String str = strArrSplit[i10];
            if (!TextUtils.isEmpty(str) && str.startsWith("token:")) {
                strSubstring = str.substring(str.indexOf(":") + 1);
                break;
            }
            i10++;
        }
        if (TextUtils.isEmpty(strSubstring)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : receive incorrect token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : receive correct token");
        i.d(this.f106790a, this.f154a, strSubstring);
        i.m131a(this.f106790a);
    }
}
