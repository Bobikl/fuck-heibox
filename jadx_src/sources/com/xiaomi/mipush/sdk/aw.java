package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ax;
import com.xiaomi.push.bp;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.bc;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class aw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106773a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f139a;

    aw(Context context, boolean z10) {
        this.f106773a = context;
        this.f139a = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.b.m62a("do sync info");
        jm jmVar = new jm(bc.a(), false);
        b bVarM111a = b.m111a(this.f106773a);
        jmVar.c(ix.SyncInfo.f623a);
        jmVar.b(bVarM111a.m112a());
        jmVar.d(this.f106773a.getPackageName());
        HashMap map = new HashMap();
        jmVar.f763a = map;
        Context context = this.f106773a;
        com.xiaomi.push.k.a(map, "app_version", com.xiaomi.push.g.m393a(context, context.getPackageName()));
        Map<String, String> map2 = jmVar.f763a;
        Context context2 = this.f106773a;
        com.xiaomi.push.k.a(map2, "app_version_code", Integer.toString(com.xiaomi.push.g.a(context2, context2.getPackageName())));
        com.xiaomi.push.k.a(jmVar.f763a, "push_sdk_vn", BuildConfig.VERSION_NAME);
        com.xiaomi.push.k.a(jmVar.f763a, "push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
        com.xiaomi.push.k.a(jmVar.f763a, "token", bVarM111a.b());
        if (!com.xiaomi.push.j.m526d()) {
            String strA = bp.a(com.xiaomi.push.i.c(this.f106773a));
            String strE = com.xiaomi.push.i.e(this.f106773a);
            if (!TextUtils.isEmpty(strE)) {
                strA = strA + Constants.ACCEPT_TIME_SEPARATOR_SP + strE;
            }
            if (!TextUtils.isEmpty(strA)) {
                com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_IMEI_MD5, strA);
            }
        }
        ax.a(this.f106773a).a(jmVar.f763a);
        com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_REG_ID, bVarM111a.m119c());
        com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_REG_SECRET, bVarM111a.d());
        com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(this.f106773a).replace(Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        if (this.f139a) {
            com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_ALIASES_MD5, av.c(MiPushClient.getAllAlias(this.f106773a)));
            com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_TOPICS_MD5, av.c(MiPushClient.getAllTopic(this.f106773a)));
            com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_ACCOUNTS_MD5, av.c(MiPushClient.getAllUserAccount(this.f106773a)));
        } else {
            com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_ALIASES, av.d(MiPushClient.getAllAlias(this.f106773a)));
            com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_TOPICS, av.d(MiPushClient.getAllTopic(this.f106773a)));
            com.xiaomi.push.k.a(jmVar.f763a, Constants.EXTRA_KEY_ACCOUNTS, av.d(MiPushClient.getAllUserAccount(this.f106773a)));
        }
        ao.a(this.f106773a).a(jmVar, in.Notification, false, (ja) null);
    }
}
