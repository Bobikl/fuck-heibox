package com.huawei.hms.push;

import android.app.Notification;
import android.text.TextUtils;

/* JADX INFO: compiled from: NotificationUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class h {
    public static i a(m mVar) {
        i iVar = i.STYLE_DEFAULT;
        return (mVar.w() < 0 || mVar.w() >= i.values().length) ? iVar : i.values()[mVar.w()];
    }

    public static void a(Notification.Builder builder, String str, m mVar) {
        Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
        if (!TextUtils.isEmpty(mVar.h())) {
            bigTextStyle.setBigContentTitle(mVar.h());
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            bigTextStyle.bigText(str);
        }
        builder.setStyle(bigTextStyle);
    }
}
