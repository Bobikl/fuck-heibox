package com.alipay.deviceid.module.x;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: compiled from: ApdidUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class by {
    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(com.max.hbutils.utils.w.f73604k);
        String[] strArr = {"2016-11-10 2016-11-11", "2016-12-11 2016-12-12"};
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                String[] strArrSplit = strArr[i10].split(" ");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    Date date = new Date();
                    Date date2 = simpleDateFormat.parse(strArrSplit[0] + " 00:00:00");
                    Date date3 = simpleDateFormat.parse(strArrSplit[1] + " 23:59:59");
                    if (date.after(date2) && date.before(date3)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static synchronized boolean a(Context context, String str) {
        try {
            if (Math.abs(System.currentTimeMillis() - bx.b(context, str)) < 86400000) {
                return true;
            }
        } catch (Throwable th2) {
            x.a(th2);
        }
        return false;
    }
}
