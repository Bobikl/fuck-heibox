package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.bp;
import com.xiaomi.push.is;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.az;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class av {
    public static void a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        long j10 = sharedPreferences.getLong("last_sync_info", -1L);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long jA = az.a(context).a(is.SyncInfoFrequency.a(), 1209600);
        if (j10 == -1) {
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        } else if (Math.abs(jCurrentTimeMillis - j10) > jA) {
            a(context, true);
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        }
    }

    public static void a(Context context, jm jmVar) {
        com.xiaomi.channel.commonutils.logger.b.m62a("need to update local info with: " + jmVar.m580a());
        String str = jmVar.m580a().get(Constants.EXTRA_KEY_ACCEPT_TIME);
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (strArrSplit.length == 2) {
                MiPushClient.addAcceptTime(context, strArrSplit[0], strArrSplit[1]);
                if ("00:00".equals(strArrSplit[0]) && "00:00".equals(strArrSplit[1])) {
                    b.m111a(context).a(true);
                } else {
                    b.m111a(context).a(false);
                }
            }
        }
        String str2 = jmVar.m580a().get(Constants.EXTRA_KEY_ALIASES);
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                for (String str3 : str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addAlias(context, str3);
                }
            }
        }
        String str4 = jmVar.m580a().get(Constants.EXTRA_KEY_TOPICS);
        if (str4 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str4)) {
                for (String str5 : str4.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addTopic(context, str5);
                }
            }
        }
        String str6 = jmVar.m580a().get(Constants.EXTRA_KEY_ACCOUNTS);
        if (str6 != null) {
            MiPushClient.removeAllAccounts(context);
            if ("".equals(str6)) {
                return;
            }
            for (String str7 : str6.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                MiPushClient.addAccount(context, str7);
            }
        }
    }

    public static void a(Context context, boolean z10) {
        com.xiaomi.push.ah.a(context).a(new aw(context, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(List<String> list) {
        String strA = bp.a(d(list));
        return (TextUtils.isEmpty(strA) || strA.length() <= 4) ? "" : strA.substring(0, 4).toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(List<String> list) {
        String str = "";
        if (com.xiaomi.push.ac.a(list)) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            str = str + str2;
        }
        return str;
    }
}
