package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class cl extends cn {
    public cl(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    public static cl a(Context context, String str, int i10) {
        com.xiaomi.channel.commonutils.logger.b.b("delete  messages when db size is too bigger");
        String strM225a = cr.a(context).m225a(str);
        if (TextUtils.isEmpty(strM225a)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rowDataId in (select ");
        sb2.append("rowDataId from " + strM225a);
        sb2.append(" order by createTimeStamp asc");
        sb2.append(" limit ?)");
        return new cl(str, sb2.toString(), new String[]{String.valueOf(i10)}, "a job build to delete history message");
    }

    private void a(long j10) {
        String[] strArr = ((cr.d) this).f255a;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        strArr[0] = String.valueOf(j10);
    }

    @Override // com.xiaomi.push.cr.a
    public void a(Context context, Object obj) {
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            long jA = cx.a(m227a());
            long j10 = cj.f238a;
            if (jA <= j10) {
                com.xiaomi.channel.commonutils.logger.b.b("db size is suitable");
                return;
            }
            long j11 = (long) ((((jA - j10) * 1.2d) / j10) * jLongValue);
            a(j11);
            cf.a(context).a("begin delete " + j11 + "noUpload messages , because db size is " + jA + "B");
            super.a(context, obj);
        }
    }
}
