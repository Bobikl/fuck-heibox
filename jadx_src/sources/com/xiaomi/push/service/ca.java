package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.iq;
import com.xiaomi.push.ir;
import com.xiaomi.push.ix;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f107984a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static SimpleDateFormat f1072a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static AtomicLong f1073a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f1072a = simpleDateFormat;
        f107984a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    private static jm a(String str, String str2, iq iqVar) {
        return new jm("-1", false).d(str).b(str2).a(com.xiaomi.push.x.a(jx.a(iqVar))).c(ix.UploadTinyData.f623a);
    }

    public static synchronized String a() {
        String str;
        str = f1072a.format(Long.valueOf(System.currentTimeMillis()));
        if (!TextUtils.equals(f107984a, str)) {
            f1073a.set(0L);
            f107984a = str;
        }
        return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f1073a.incrementAndGet();
    }

    public static ArrayList<jm> a(List<ir> list, String str, String str2, int i10) {
        int length;
        if (list == null) {
            com.xiaomi.channel.commonutils.logger.b.d("requests can not be null in TinyDataHelper.transToThriftObj().");
            return null;
        }
        if (list.size() == 0) {
            com.xiaomi.channel.commonutils.logger.b.d("requests.length is 0 in TinyDataHelper.transToThriftObj().");
            return null;
        }
        ArrayList<jm> arrayList = new ArrayList<>();
        iq iqVar = new iq();
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ir irVar = list.get(i12);
            if (irVar != null) {
                if (irVar.m488a() == null || !irVar.m488a().containsKey("item_size")) {
                    length = 0;
                } else {
                    String str3 = irVar.m488a().get("item_size");
                    if (TextUtils.isEmpty(str3)) {
                        length = 0;
                    } else {
                        try {
                            length = Integer.parseInt(str3);
                        } catch (Exception unused) {
                            length = 0;
                        }
                    }
                    if (irVar.m488a().size() == 1) {
                        irVar.a((Map<String, String>) null);
                    } else {
                        irVar.m488a().remove("item_size");
                    }
                }
                if (length <= 0) {
                    length = jx.a(irVar).length;
                }
                if (length > i10) {
                    com.xiaomi.channel.commonutils.logger.b.d("TinyData is too big, ignore upload request item:" + irVar.d());
                } else {
                    if (i11 + length > i10) {
                        arrayList.add(a(str, str2, iqVar));
                        iqVar = new iq();
                        i11 = 0;
                    }
                    iqVar.a(irVar);
                    i11 += length;
                }
            }
        }
        if (iqVar.a() != 0) {
            arrayList.add(a(str, str2, iqVar));
        }
        return arrayList;
    }

    public static void a(Context context, String str, String str2, long j10, String str3) {
        ir irVar = new ir();
        irVar.d(str);
        irVar.c(str2);
        irVar.a(j10);
        irVar.b(str3);
        irVar.a("push_sdk_channel");
        irVar.g(context.getPackageName());
        irVar.e(context.getPackageName());
        irVar.a(true);
        irVar.b(System.currentTimeMillis());
        irVar.f(a());
        cb.a(context, irVar);
    }

    public static boolean a(ir irVar, boolean z10) {
        if (irVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("item is null, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!z10 && TextUtils.isEmpty(irVar.f595a)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("item.channel is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(irVar.f602d)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("item.category is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(irVar.f601c)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("item.name is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!com.xiaomi.push.bp.m191a(irVar.f602d)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("item.category can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!com.xiaomi.push.bp.m191a(irVar.f601c)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("item.name can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        String str = irVar.f600b;
        if (str == null || str.length() <= 30720) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("item.data is too large(" + irVar.f600b.length() + "), max size for data is 30720 , verfiy ClientUploadDataItem failed.");
        return true;
    }

    public static boolean a(String str) {
        return !C1339r.m659b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
