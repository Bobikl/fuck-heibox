package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import com.xiaomi.push.bp;
import com.xiaomi.push.cf;
import com.xiaomi.push.dt;
import com.xiaomi.push.fn;
import com.xiaomi.push.fo;
import com.xiaomi.push.fy;
import com.xiaomi.push.in;
import com.xiaomi.push.is;
import com.xiaomi.push.ix;
import com.xiaomi.push.iz;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jd;
import com.xiaomi.push.je;
import com.xiaomi.push.ji;
import com.xiaomi.push.jj;
import com.xiaomi.push.jk;
import com.xiaomi.push.jl;
import com.xiaomi.push.jm;
import com.xiaomi.push.jo;
import com.xiaomi.push.jq;
import com.xiaomi.push.js;
import com.xiaomi.push.ju;
import com.xiaomi.push.jw;
import com.xiaomi.push.jx;
import com.xiaomi.push.jy;
import com.xiaomi.push.kd;
import com.xiaomi.push.service.ax;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.bj;
import com.xiaomi.push.service.bs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static am f106756a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Object f122a = new Object();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Queue<String> f123a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f124a;

    private am(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f124a = applicationContext;
        if (applicationContext == null) {
            this.f124a = context;
        }
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i10) {
        return com.xiaomi.push.service.al.b(context, str, map, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private PushMessageHandler.a a(jj jjVar, boolean z10, byte[] bArr, String str, int i10, Intent intent) {
        MiPushMessage miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        miPushMessage = null;
        ArrayList arrayList3 = null;
        miPushMessage = null;
        try {
            jy jyVarA = ai.a(this.f124a, jjVar);
            if (jyVarA == null) {
                com.xiaomi.channel.commonutils.logger.b.d("receiving an un-recognized message. " + jjVar.f744a);
                fo.a(this.f124a).b(this.f124a.getPackageName(), fn.m375a(i10), str, "18");
                s.c(this.f124a, jjVar, z10);
                return null;
            }
            in inVarA = jjVar.a();
            com.xiaomi.channel.commonutils.logger.b.m64a("processing a message, action=", inVarA, ", hasNotified=", Boolean.valueOf(z10));
            switch (an.f106757a[inVarA.ordinal()]) {
                case 1:
                    if (!jjVar.m572b()) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt message(SendMessage).");
                        return null;
                    }
                    if (b.m111a(this.f124a).m122e() && !z10) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("receive a message in pause state. drop it");
                        fo.a(this.f124a).a(this.f124a.getPackageName(), fn.m375a(i10), str, "12");
                        return null;
                    }
                    jq jqVar = (jq) jyVarA;
                    iz izVarA = jqVar.a();
                    if (izVarA == null) {
                        com.xiaomi.channel.commonutils.logger.b.d("receive an empty message without push content, drop it");
                        fo.a(this.f124a).b(this.f124a.getPackageName(), fn.m375a(i10), str, "22");
                        s.d(this.f124a, jjVar, z10);
                        return null;
                    }
                    int intExtra = intent.getIntExtra("notification_click_button", 0);
                    if (z10) {
                        if (com.xiaomi.push.service.al.m698a(jjVar)) {
                            MiPushClient.reportIgnoreRegMessageClicked(this.f124a, izVarA.m511a(), jjVar.m564a(), jjVar.f751b, izVarA.b());
                        } else {
                            ja jaVar = jjVar.m564a() != null ? new ja(jjVar.m564a()) : new ja();
                            if (jaVar.m531a() == null) {
                                jaVar.a(new HashMap());
                            }
                            jaVar.m531a().put("notification_click_button", String.valueOf(intExtra));
                            MiPushClient.reportMessageClicked(this.f124a, izVarA.m511a(), jaVar, izVarA.b());
                        }
                    }
                    if (!z10) {
                        if (!TextUtils.isEmpty(jqVar.d()) && MiPushClient.aliasSetTime(this.f124a, jqVar.d()) < 0) {
                            MiPushClient.addAlias(this.f124a, jqVar.d());
                        } else if (!TextUtils.isEmpty(jqVar.c()) && MiPushClient.topicSubscribedTime(this.f124a, jqVar.c()) < 0) {
                            MiPushClient.addTopic(this.f124a, jqVar.c());
                        }
                    }
                    ja jaVar2 = jjVar.f745a;
                    String strM511a = (jaVar2 == null || jaVar2.m531a() == null) ? null : jjVar.f745a.f659a.get("jobkey");
                    String str2 = strM511a;
                    if (TextUtils.isEmpty(strM511a)) {
                        strM511a = izVarA.m511a();
                    }
                    if (z10 || !m90a(this.f124a, strM511a)) {
                        MiPushMessage miPushMessageGenerateMessage = PushMessageHelper.generateMessage(jqVar, jjVar.m564a(), z10);
                        if (miPushMessageGenerateMessage.getPassThrough() == 0 && !z10 && com.xiaomi.push.service.al.m699a(miPushMessageGenerateMessage.getExtra())) {
                            com.xiaomi.push.service.al.m694a(this.f124a, jjVar, bArr);
                            return null;
                        }
                        String strA = com.xiaomi.push.service.al.a(miPushMessageGenerateMessage.getExtra(), intExtra);
                        com.xiaomi.channel.commonutils.logger.b.m64a("receive a message, msgid=", izVarA.m511a(), ", jobkey=", strM511a, ", btn=", Integer.valueOf(intExtra), ", typeId=", strA, ", hasNotified=", Boolean.valueOf(z10));
                        if (z10 && miPushMessageGenerateMessage.getExtra() != null && !TextUtils.isEmpty(strA)) {
                            Map<String, String> extra = miPushMessageGenerateMessage.getExtra();
                            if (intExtra != 0 && jjVar.m564a() != null) {
                                ao.a(this.f124a).a(jjVar.m564a().c(), intExtra);
                            }
                            if (com.xiaomi.push.service.al.m698a(jjVar)) {
                                Intent intentA = a(this.f124a, jjVar.f751b, extra, intExtra);
                                intentA.putExtra("eventMessageType", i10);
                                intentA.putExtra("messageId", str);
                                intentA.putExtra("jobkey", str2);
                                String strC = izVarA.c();
                                if (!TextUtils.isEmpty(strC)) {
                                    intentA.putExtra(AssistPushConsts.MSG_TYPE_PAYLOAD, strC);
                                }
                                this.f124a.startActivity(intentA);
                                s.a(this.f124a, jjVar);
                                fo.a(this.f124a).a(this.f124a.getPackageName(), fn.m375a(i10), str, bb.c.d.Ph, strA);
                                com.xiaomi.channel.commonutils.logger.b.m63a("PushMessageProcessor", "start business activity succ");
                            } else {
                                Context context = this.f124a;
                                Intent intentA2 = a(context, context.getPackageName(), extra, intExtra);
                                if (intentA2 != null) {
                                    if (!strA.equals(bj.f107933c)) {
                                        intentA2.putExtra(PushMessageHelper.KEY_MESSAGE, miPushMessageGenerateMessage);
                                        intentA2.putExtra("eventMessageType", i10);
                                        intentA2.putExtra("messageId", str);
                                        intentA2.putExtra("jobkey", str2);
                                    }
                                    this.f124a.startActivity(intentA2);
                                    s.a(this.f124a, jjVar);
                                    com.xiaomi.channel.commonutils.logger.b.m63a("PushMessageProcessor", "start activity succ");
                                    fo.a(this.f124a).a(this.f124a.getPackageName(), fn.m375a(i10), str, 1006, strA);
                                    if (strA.equals(bj.f107933c)) {
                                        fo.a(this.f124a).a(this.f124a.getPackageName(), fn.m375a(i10), str, "13");
                                    }
                                } else {
                                    com.xiaomi.channel.commonutils.logger.b.c("PushMessageProcessor", "missing target intent for message: " + izVarA.m511a() + ", typeId=" + strA);
                                }
                            }
                            com.xiaomi.channel.commonutils.logger.b.m63a("PushMessageProcessor", "pre-def msg process done.");
                            return null;
                        }
                        miPushMessage = miPushMessageGenerateMessage;
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m62a("drop a duplicate message, key=" + strM511a);
                        fo.a(this.f124a).c(this.f124a.getPackageName(), fn.m375a(i10), str, "2:" + strM511a);
                    }
                    if (jjVar.m564a() == null && !z10) {
                        a(jqVar, jjVar);
                    }
                    return miPushMessage;
                case 2:
                    jo joVar = (jo) jyVarA;
                    String str3 = b.m111a(this.f124a).f142a;
                    if (TextUtils.isEmpty(str3) || !TextUtils.equals(str3, joVar.m593a())) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("bad Registration result:");
                        fo.a(this.f124a).b(this.f124a.getPackageName(), fn.m375a(i10), str, "21");
                        return null;
                    }
                    long jM100a = ao.a(this.f124a).m100a();
                    if (jM100a > 0 && SystemClock.elapsedRealtime() - jM100a > 900000) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("The received registration result has expired.");
                        fo.a(this.f124a).b(this.f124a.getPackageName(), fn.m375a(i10), str, "26");
                        return null;
                    }
                    b.m111a(this.f124a).f142a = null;
                    if (joVar.f807a == 0) {
                        b.m111a(this.f124a).b(joVar.f819e, joVar.f820f, joVar.f826l);
                        FCMPushHelper.persistIfXmsfSupDecrypt(this.f124a);
                        fo.a(this.f124a).a(this.f124a.getPackageName(), fn.m375a(i10), str, 6006, "1");
                    } else {
                        fo.a(this.f124a).a(this.f124a.getPackageName(), fn.m375a(i10), str, 6006, "2");
                    }
                    if (!TextUtils.isEmpty(joVar.f819e)) {
                        arrayList3 = new ArrayList();
                        arrayList3.add(joVar.f819e);
                    }
                    MiPushCommandMessage miPushCommandMessageGenerateCommandMessage = PushMessageHelper.generateCommandMessage(fy.COMMAND_REGISTER.f447a, arrayList3, joVar.f807a, joVar.f818d, null, joVar.m594a());
                    ao.a(this.f124a).m109d();
                    return miPushCommandMessageGenerateCommandMessage;
                case 3:
                    if (!jjVar.m572b()) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((ju) jyVarA).f885a == 0) {
                        b.m111a(this.f124a).m113a();
                        MiPushClient.clearExtras(this.f124a);
                    }
                    PushMessageHandler.a();
                    return miPushMessage;
                case 4:
                    js jsVar = (js) jyVarA;
                    if (jsVar.f860a == 0) {
                        MiPushClient.addTopic(this.f124a, jsVar.b());
                    }
                    if (!TextUtils.isEmpty(jsVar.b())) {
                        arrayList2 = new ArrayList();
                        arrayList2.add(jsVar.b());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resp-cmd:");
                    fy fyVar = fy.COMMAND_SUBSCRIBE_TOPIC;
                    sb2.append(fyVar);
                    sb2.append(", ");
                    sb2.append(jsVar.a());
                    com.xiaomi.channel.commonutils.logger.b.e(sb2.toString());
                    return PushMessageHelper.generateCommandMessage(fyVar.f447a, arrayList2, jsVar.f860a, jsVar.f866d, jsVar.c(), null);
                case 5:
                    jw jwVar = (jw) jyVarA;
                    if (jwVar.f905a == 0) {
                        MiPushClient.removeTopic(this.f124a, jwVar.b());
                    }
                    if (!TextUtils.isEmpty(jwVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(jwVar.b());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("resp-cmd:");
                    fy fyVar2 = fy.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb3.append(fyVar2);
                    sb3.append(", ");
                    sb3.append(jwVar.a());
                    com.xiaomi.channel.commonutils.logger.b.e(sb3.toString());
                    return PushMessageHelper.generateCommandMessage(fyVar2.f447a, arrayList, jwVar.f905a, jwVar.f911d, jwVar.c(), null);
                case 6:
                    dt.a(this.f124a.getPackageName(), this.f124a, jyVarA, in.Command, bArr.length);
                    ji jiVar = (ji) jyVarA;
                    String strB = jiVar.b();
                    List<String> listM558a = jiVar.m558a();
                    if (jiVar.f732a == 0) {
                        if (TextUtils.equals(strB, fy.COMMAND_SET_ACCEPT_TIME.f447a) && listM558a != null && listM558a.size() > 1) {
                            MiPushClient.addAcceptTime(this.f124a, listM558a.get(0), listM558a.get(1));
                            if ("00:00".equals(listM558a.get(0)) && "00:00".equals(listM558a.get(1))) {
                                b.m111a(this.f124a).a(true);
                            } else {
                                b.m111a(this.f124a).a(false);
                            }
                            listM558a = a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), listM558a);
                        } else if (TextUtils.equals(strB, fy.COMMAND_SET_ALIAS.f447a) && listM558a != null && listM558a.size() > 0) {
                            MiPushClient.addAlias(this.f124a, listM558a.get(0));
                        } else if (TextUtils.equals(strB, fy.COMMAND_UNSET_ALIAS.f447a) && listM558a != null && listM558a.size() > 0) {
                            MiPushClient.removeAlias(this.f124a, listM558a.get(0));
                        } else if (TextUtils.equals(strB, fy.COMMAND_SET_ACCOUNT.f447a) && listM558a != null && listM558a.size() > 0) {
                            MiPushClient.addAccount(this.f124a, listM558a.get(0));
                        } else if (TextUtils.equals(strB, fy.COMMAND_UNSET_ACCOUNT.f447a) && listM558a != null && listM558a.size() > 0) {
                            MiPushClient.removeAccount(this.f124a, listM558a.get(0));
                        } else if (TextUtils.equals(strB, fy.COMMAND_CHK_VDEVID.f447a)) {
                            return null;
                        }
                    }
                    List<String> list = listM558a;
                    com.xiaomi.channel.commonutils.logger.b.e("resp-cmd:" + strB + ", " + jiVar.a());
                    return PushMessageHelper.generateCommandMessage(strB, list, jiVar.f732a, jiVar.f740d, jiVar.c(), null);
                case 7:
                    dt.a(this.f124a.getPackageName(), this.f124a, jyVarA, in.Notification, bArr.length);
                    if (jyVarA instanceof je) {
                        je jeVar = (je) jyVarA;
                        String strA2 = jeVar.a();
                        com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + jeVar.b() + ", code:" + jeVar.f702a + ", " + strA2);
                        if (ix.DisablePushMessage.f623a.equalsIgnoreCase(jeVar.f709d)) {
                            if (jeVar.f702a == 0) {
                                synchronized (af.class) {
                                    if (af.a(this.f124a).m89a(strA2)) {
                                        af.a(this.f124a).c(strA2);
                                        af afVarA = af.a(this.f124a);
                                        au auVar = au.DISABLE_PUSH;
                                        if ("syncing".equals(afVarA.a(auVar))) {
                                            af.a(this.f124a).a(auVar, "synced");
                                            MiPushClient.clearNotification(this.f124a);
                                            MiPushClient.clearLocalNotificationType(this.f124a);
                                            PushMessageHandler.a();
                                            ao.a(this.f124a).m106b();
                                        }
                                    }
                                }
                            } else if ("syncing".equals(af.a(this.f124a).a(au.DISABLE_PUSH))) {
                                synchronized (af.class) {
                                    if (af.a(this.f124a).m89a(strA2)) {
                                        if (af.a(this.f124a).a(strA2) < 10) {
                                            af.a(this.f124a).b(strA2);
                                            ao.a(this.f124a).a(true, strA2);
                                        } else {
                                            af.a(this.f124a).c(strA2);
                                        }
                                    }
                                }
                            } else {
                                af.a(this.f124a).c(strA2);
                            }
                            break;
                        } else if (ix.EnablePushMessage.f623a.equalsIgnoreCase(jeVar.f709d)) {
                            if (jeVar.f702a == 0) {
                                synchronized (af.class) {
                                    if (af.a(this.f124a).m89a(strA2)) {
                                        af.a(this.f124a).c(strA2);
                                        af afVarA2 = af.a(this.f124a);
                                        au auVar2 = au.ENABLE_PUSH;
                                        if ("syncing".equals(afVarA2.a(auVar2))) {
                                            af.a(this.f124a).a(auVar2, "synced");
                                        }
                                    }
                                }
                            } else if ("syncing".equals(af.a(this.f124a).a(au.ENABLE_PUSH))) {
                                synchronized (af.class) {
                                    if (af.a(this.f124a).m89a(strA2)) {
                                        if (af.a(this.f124a).a(strA2) < 10) {
                                            af.a(this.f124a).b(strA2);
                                            ao.a(this.f124a).a(false, strA2);
                                        } else {
                                            af.a(this.f124a).c(strA2);
                                        }
                                    }
                                }
                            } else {
                                af.a(this.f124a).c(strA2);
                            }
                            break;
                        } else if (ix.ThirdPartyRegUpdate.f623a.equalsIgnoreCase(jeVar.f709d)) {
                            b(jeVar);
                        } else if (ix.UploadTinyData.f623a.equalsIgnoreCase(jeVar.f709d)) {
                            a(jeVar);
                        }
                    } else if (jyVarA instanceof jm) {
                        jm jmVar = (jm) jyVarA;
                        if ("registration id expired".equalsIgnoreCase(jmVar.f768d)) {
                            List<String> allAlias = MiPushClient.getAllAlias(this.f124a);
                            List<String> allTopic = MiPushClient.getAllTopic(this.f124a);
                            List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f124a);
                            String acceptTime = MiPushClient.getAcceptTime(this.f124a);
                            com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + jmVar.f768d + ", " + jmVar.m579a());
                            MiPushClient.reInitialize(this.f124a, jb.RegIdExpired);
                            for (String str4 : allAlias) {
                                MiPushClient.removeAlias(this.f124a, str4);
                                MiPushClient.setAlias(this.f124a, str4, null);
                            }
                            for (String str5 : allTopic) {
                                MiPushClient.removeTopic(this.f124a, str5);
                                MiPushClient.subscribe(this.f124a, str5, null);
                            }
                            for (String str6 : allUserAccount) {
                                MiPushClient.removeAccount(this.f124a, str6);
                                MiPushClient.setUserAccount(this.f124a, str6, null);
                            }
                            String[] strArrSplit = acceptTime.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            if (strArrSplit.length == 2) {
                                MiPushClient.removeAcceptTime(this.f124a);
                                MiPushClient.addAcceptTime(this.f124a, strArrSplit[0], strArrSplit[1]);
                            }
                        } else if (ix.ClientInfoUpdateOk.f623a.equalsIgnoreCase(jmVar.f768d)) {
                            if (jmVar.m580a() != null && jmVar.m580a().containsKey("app_version")) {
                                b.m111a(this.f124a).m114a(jmVar.m580a().get("app_version"));
                            }
                        } else if (!ix.AwakeApp.f623a.equalsIgnoreCase(jmVar.f768d)) {
                            try {
                                if (ix.NormalClientConfigUpdate.f623a.equalsIgnoreCase(jmVar.f768d)) {
                                    jl jlVar = new jl();
                                    jx.a(jlVar, jmVar.m585a());
                                    ba.a(az.a(this.f124a), jlVar);
                                } else if (ix.CustomClientConfigUpdate.f623a.equalsIgnoreCase(jmVar.f768d)) {
                                    jk jkVar = new jk();
                                    jx.a(jkVar, jmVar.m585a());
                                    ba.a(az.a(this.f124a), jkVar);
                                } else if (ix.SyncInfoResult.f623a.equalsIgnoreCase(jmVar.f768d)) {
                                    av.a(this.f124a, jmVar);
                                } else if (ix.ForceSync.f623a.equalsIgnoreCase(jmVar.f768d)) {
                                    com.xiaomi.channel.commonutils.logger.b.m62a("receive force sync notification");
                                    av.a(this.f124a, false);
                                } else if (ix.CancelPushMessage.f623a.equals(jmVar.f768d)) {
                                    com.xiaomi.channel.commonutils.logger.b.e("resp-type:" + jmVar.f768d + ", " + jmVar.m579a());
                                    if (jmVar.m580a() != null) {
                                        int i11 = -2;
                                        if (jmVar.m580a().containsKey(bj.Q)) {
                                            String str7 = jmVar.m580a().get(bj.Q);
                                            if (!TextUtils.isEmpty(str7)) {
                                                try {
                                                    i11 = Integer.parseInt(str7);
                                                } catch (NumberFormatException e10) {
                                                    e10.printStackTrace();
                                                }
                                            }
                                        }
                                        if (i11 >= -1) {
                                            MiPushClient.clearNotification(this.f124a, i11);
                                        } else {
                                            MiPushClient.clearNotification(this.f124a, jmVar.m580a().containsKey(bj.O) ? jmVar.m580a().get(bj.O) : "", jmVar.m580a().containsKey(bj.P) ? jmVar.m580a().get(bj.P) : "");
                                        }
                                    }
                                    a(jmVar);
                                    break;
                                } else if (ix.HybridRegisterResult.f623a.equals(jmVar.f768d)) {
                                    try {
                                        jo joVar2 = new jo();
                                        jx.a(joVar2, jmVar.m585a());
                                        MiPushClient4Hybrid.onReceiveRegisterResult(this.f124a, joVar2);
                                    } catch (kd e11) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e11);
                                    }
                                    break;
                                } else if (ix.HybridUnregisterResult.f623a.equals(jmVar.f768d)) {
                                    try {
                                        ju juVar = new ju();
                                        jx.a(juVar, jmVar.m585a());
                                        MiPushClient4Hybrid.onReceiveUnregisterResult(this.f124a, juVar);
                                    } catch (kd e12) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e12);
                                    }
                                    break;
                                } else if (!ix.PushLogUpload.f623a.equals(jmVar.f768d)) {
                                    if (ix.DetectAppAlive.f623a.equals(jmVar.f768d)) {
                                        com.xiaomi.channel.commonutils.logger.b.b("receive detect msg");
                                        b(jmVar);
                                    } else if (com.xiaomi.push.service.j.a(jmVar)) {
                                        com.xiaomi.channel.commonutils.logger.b.b("receive notification handle by cpra");
                                    }
                                }
                                break;
                            } catch (kd unused) {
                            }
                        } else if (jjVar.m572b() && jmVar.m580a() != null && jmVar.m580a().containsKey("awake_info")) {
                            String str8 = jmVar.m580a().get("awake_info");
                            Context context2 = this.f124a;
                            o.a(context2, b.m111a(context2).m112a(), az.a(this.f124a).a(is.AwakeInfoUploadWaySwitch.a(), 0), str8);
                        }
                    }
                    return miPushMessage;
                default:
                    return miPushMessage;
            }
        } catch (u e13) {
            com.xiaomi.channel.commonutils.logger.b.a(e13);
            a(jjVar);
            fo.a(this.f124a).b(this.f124a.getPackageName(), fn.m375a(i10), str, "19");
            s.c(this.f124a, jjVar, z10);
            return null;
        } catch (kd e14) {
            com.xiaomi.channel.commonutils.logger.b.a(e14);
            com.xiaomi.channel.commonutils.logger.b.d("receive a message which action string is not valid. is the reg expired?");
            fo.a(this.f124a).b(this.f124a.getPackageName(), fn.m375a(i10), str, "20");
            s.c(this.f124a, jjVar, z10);
            return null;
        }
    }

    private PushMessageHandler.a a(jj jjVar, byte[] bArr) {
        String str = null;
        try {
            jy jyVarA = ai.a(this.f124a, jjVar);
            if (jyVarA == null) {
                com.xiaomi.channel.commonutils.logger.b.d("message arrived: receiving an un-recognized message. " + jjVar.f744a);
                return null;
            }
            in inVarA = jjVar.a();
            com.xiaomi.channel.commonutils.logger.b.m62a("message arrived: processing an arrived message, action=" + inVarA);
            if (an.f106757a[inVarA.ordinal()] != 1) {
                return null;
            }
            if (!jjVar.m572b()) {
                com.xiaomi.channel.commonutils.logger.b.d("message arrived: receiving an un-encrypt message(SendMessage).");
                return null;
            }
            jq jqVar = (jq) jyVarA;
            iz izVarA = jqVar.a();
            if (izVarA == null) {
                com.xiaomi.channel.commonutils.logger.b.d("message arrived: receive an empty message without push content, drop it");
                return null;
            }
            ja jaVar = jjVar.f745a;
            if (jaVar != null && jaVar.m531a() != null) {
                str = jjVar.f745a.f659a.get("jobkey");
            }
            MiPushMessage miPushMessageGenerateMessage = PushMessageHelper.generateMessage(jqVar, jjVar.m564a(), false);
            miPushMessageGenerateMessage.setArrivedMessage(true);
            com.xiaomi.channel.commonutils.logger.b.m62a("message arrived: receive a message, msgid=" + izVarA.m511a() + ", jobkey=" + str);
            return miPushMessageGenerateMessage;
        } catch (u e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            com.xiaomi.channel.commonutils.logger.b.d("message arrived: receive a message but decrypt failed. report when click.");
            return null;
        } catch (kd e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            com.xiaomi.channel.commonutils.logger.b.d("message arrived: receive a message which action string is not valid. is the reg expired?");
            return null;
        }
    }

    public static am a(Context context) {
        if (f106756a == null) {
            f106756a = new am(context);
        }
        return f106756a;
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f124a.getSharedPreferences("mipush_extra", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0L)) > 1800000) {
            MiPushClient.reInitialize(this.f124a, jb.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, jCurrentTimeMillis).commit();
        }
    }

    public static void a(Context context, String str) {
        synchronized (f122a) {
            f123a.remove(str);
            b.m111a(context);
            SharedPreferences sharedPreferencesA = b.a(context);
            String strA = bp.a(f123a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("pref_msg_ids", strA);
            com.xiaomi.push.p.a(editorEdit);
        }
    }

    private void a(je jeVar) {
        String strA = jeVar.a();
        com.xiaomi.channel.commonutils.logger.b.b("receive ack " + strA);
        Map<String, String> mapM545a = jeVar.m545a();
        if (mapM545a != null) {
            String str = mapM545a.get("real_source");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.b("receive ack : messageId = " + strA + "  realSource = " + str);
            cf.a(this.f124a).a(strA, str, Boolean.valueOf(jeVar.f702a == 0));
        }
    }

    private void a(jj jjVar) {
        com.xiaomi.channel.commonutils.logger.b.m62a("receive a message but decrypt failed. report now.");
        jm jmVar = new jm(jjVar.m564a().f657a, false);
        jmVar.c(ix.DecryptMessageFail.f623a);
        jmVar.b(jjVar.m565a());
        jmVar.d(jjVar.f751b);
        HashMap map = new HashMap();
        jmVar.f763a = map;
        map.put("regid", MiPushClient.getRegId(this.f124a));
        ao.a(this.f124a).a(jmVar, in.Notification, false, (ja) null);
    }

    private void a(jm jmVar) {
        je jeVar = new je();
        jeVar.c(ix.CancelPushMessageACK.f623a);
        jeVar.a(jmVar.m579a());
        jeVar.a(jmVar.a());
        jeVar.b(jmVar.b());
        jeVar.e(jmVar.c());
        jeVar.a(0L);
        jeVar.d("success clear push message.");
        ao.a(this.f124a).a(jeVar, in.Notification, false, true, null, false, this.f124a.getPackageName(), b.m111a(this.f124a).m112a(), false);
    }

    private void a(jq jqVar, jj jjVar) {
        ja jaVarM564a = jjVar.m564a();
        if (jaVarM564a != null) {
            jaVarM564a = bs.a(jaVarM564a.m529a());
        }
        jd jdVar = new jd();
        jdVar.b(jqVar.b());
        jdVar.a(jqVar.m602a());
        jdVar.a(jqVar.a().a());
        if (!TextUtils.isEmpty(jqVar.c())) {
            jdVar.c(jqVar.c());
        }
        if (!TextUtils.isEmpty(jqVar.d())) {
            jdVar.d(jqVar.d());
        }
        jdVar.a(jx.m630a(this.f124a, jjVar));
        ao.a(this.f124a).a(jdVar, in.AckMessage, jaVarM564a);
    }

    private void a(String str, long j10, e eVar) {
        au auVarA = l.a(eVar);
        if (auVarA == null) {
            return;
        }
        if (j10 == 0) {
            synchronized (af.class) {
                if (af.a(this.f124a).m89a(str)) {
                    af.a(this.f124a).c(str);
                    if ("syncing".equals(af.a(this.f124a).a(auVarA))) {
                        af.a(this.f124a).a(auVarA, "synced");
                    }
                }
            }
            return;
        }
        if (!"syncing".equals(af.a(this.f124a).a(auVarA))) {
            af.a(this.f124a).c(str);
            return;
        }
        synchronized (af.class) {
            if (af.a(this.f124a).m89a(str)) {
                if (af.a(this.f124a).a(str) < 10) {
                    af.a(this.f124a).b(str);
                    ao.a(this.f124a).a(str, auVarA, eVar, "retry");
                } else {
                    af.a(this.f124a).c(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m90a(Context context, String str) {
        synchronized (f122a) {
            b.m111a(context);
            SharedPreferences sharedPreferencesA = b.a(context);
            if (f123a == null) {
                String[] strArrSplit = sharedPreferencesA.getString("pref_msg_ids", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                f123a = new LinkedList();
                for (String str2 : strArrSplit) {
                    f123a.add(str2);
                }
            }
            if (f123a.contains(str)) {
                return true;
            }
            f123a.add(str);
            if (f123a.size() > 25) {
                f123a.poll();
            }
            String strA = bp.a(f123a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("pref_msg_ids", strA);
            com.xiaomi.push.p.a(editorEdit);
            return false;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m91a(jj jjVar) {
        Map<String, String> mapM531a = jjVar.m564a() == null ? null : jjVar.m564a().m531a();
        if (mapM531a == null) {
            return false;
        }
        String str = mapM531a.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }

    private void b(je jeVar) {
        com.xiaomi.channel.commonutils.logger.b.c("ASSEMBLE_PUSH : " + jeVar.toString());
        String strA = jeVar.a();
        Map<String, String> mapM545a = jeVar.m545a();
        if (mapM545a != null) {
            String str = mapM545a.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("brand:" + ag.FCM.name())) {
                com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : receive fcm token sync ack");
                Context context = this.f124a;
                e eVar = e.ASSEMBLE_PUSH_FCM;
                i.b(context, eVar, str);
                a(strA, jeVar.f702a, eVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("brand:");
            ag agVar = ag.HUAWEI;
            sb2.append(agVar.name());
            if (!str.contains(sb2.toString())) {
                if (!str.contains("channel:" + agVar.name())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("brand:");
                    ag agVar2 = ag.OPPO;
                    sb3.append(agVar2.name());
                    if (!str.contains(sb3.toString())) {
                        if (!str.contains("channel:" + agVar2.name())) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("brand:");
                            ag agVar3 = ag.VIVO;
                            sb4.append(agVar3.name());
                            if (!str.contains(sb4.toString())) {
                                if (!str.contains("channel:" + agVar3.name())) {
                                    return;
                                }
                            }
                            com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                            Context context2 = this.f124a;
                            e eVar2 = e.ASSEMBLE_PUSH_FTOS;
                            i.b(context2, eVar2, str);
                            a(strA, jeVar.f702a, eVar2);
                            return;
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : receive COS token sync ack");
                    Context context3 = this.f124a;
                    e eVar3 = e.ASSEMBLE_PUSH_COS;
                    i.b(context3, eVar3, str);
                    a(strA, jeVar.f702a, eVar3);
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : receive hw token sync ack");
            Context context4 = this.f124a;
            e eVar4 = e.ASSEMBLE_PUSH_HUAWEI;
            i.b(context4, eVar4, str);
            a(strA, jeVar.f702a, eVar4);
        }
    }

    private void b(jj jjVar) {
        ja jaVarM564a = jjVar.m564a();
        if (jaVarM564a != null) {
            jaVarM564a = bs.a(jaVarM564a.m529a());
        }
        jd jdVar = new jd();
        jdVar.b(jjVar.m565a());
        jdVar.a(jaVarM564a.m530a());
        jdVar.a(jaVarM564a.m528a());
        if (!TextUtils.isEmpty(jaVarM564a.m535b())) {
            jdVar.c(jaVarM564a.m535b());
        }
        jdVar.a(jx.m630a(this.f124a, jjVar));
        ao.a(this.f124a).a(jdVar, in.AckMessage, false, jaVarM564a);
    }

    private void b(jm jmVar) {
        Map<String, String> mapM580a = jmVar.m580a();
        if (mapM580a == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("detect failed because null");
            return;
        }
        String str = (String) ax.a(mapM580a, "pkgList", (Object) null);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("detect failed because empty");
            return;
        }
        Map<String, String> mapM394a = com.xiaomi.push.g.m394a(this.f124a, str);
        if (mapM394a == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("detect failed because get status illegal");
            return;
        }
        String str2 = mapM394a.get("alive");
        String str3 = mapM394a.get("notAlive");
        if (TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.b("detect failed because no alive process");
            return;
        }
        jm jmVar2 = new jm();
        jmVar2.a(jmVar.m579a());
        jmVar2.b(jmVar.b());
        jmVar2.d(jmVar.c());
        jmVar2.c(ix.DetectAppAliveResult.f623a);
        HashMap map = new HashMap();
        jmVar2.f763a = map;
        map.put("alive", str2);
        if (Boolean.parseBoolean((String) ax.a(mapM580a, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str3)) {
            jmVar2.f763a.put("notAlive", str3);
        }
        ao.a(this.f124a).a(jmVar2, in.Notification, false, (ja) null);
    }

    public PushMessageHandler.a a(Intent intent) {
        String action = intent.getAction();
        com.xiaomi.channel.commonutils.logger.b.m62a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                com.xiaomi.channel.commonutils.logger.b.d("receiving an empty message, drop");
                fo.a(this.f124a).a(this.f124a.getPackageName(), intent, "12");
                return null;
            }
            jj jjVar = new jj();
            try {
                jx.a(jjVar, byteArrayExtra);
                b bVarM111a = b.m111a(this.f124a);
                ja jaVarM564a = jjVar.m564a();
                in inVarA = jjVar.a();
                in inVar = in.SendMessage;
                if (inVarA == inVar && jaVarM564a != null && !bVarM111a.m122e() && !booleanExtra) {
                    jaVarM564a.a("mrt", stringExtra);
                    jaVarM564a.a("mat", Long.toString(System.currentTimeMillis()));
                    if (m91a(jjVar)) {
                        com.xiaomi.channel.commonutils.logger.b.b("this is a mina's message, ack later");
                        jaVarM564a.a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(jaVarM564a.m528a()));
                        jaVarM564a.a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf((int) jx.m630a(this.f124a, jjVar)));
                    } else {
                        b(jjVar);
                    }
                }
                if (jjVar.a() == inVar && !jjVar.m572b()) {
                    if (com.xiaomi.push.service.al.m698a(jjVar)) {
                        Object[] objArr = new Object[2];
                        objArr[0] = jjVar.b();
                        objArr[1] = jaVarM564a != null ? jaVarM564a.m530a() : "";
                        com.xiaomi.channel.commonutils.logger.b.m62a(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", objArr));
                        fo.a(this.f124a).a(this.f124a.getPackageName(), intent, String.format("13: %1$s", jjVar.b()));
                    } else {
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = jjVar.b();
                        objArr2[1] = jaVarM564a != null ? jaVarM564a.m530a() : "";
                        com.xiaomi.channel.commonutils.logger.b.m62a(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2));
                        fo.a(this.f124a).a(this.f124a.getPackageName(), intent, String.format("14: %1$s", jjVar.b()));
                    }
                    s.a(this.f124a, jjVar, booleanExtra);
                    return null;
                }
                if (jjVar.a() == inVar && jjVar.m572b() && com.xiaomi.push.service.al.m698a(jjVar) && (!booleanExtra || jaVarM564a == null || jaVarM564a.m531a() == null || !jaVarM564a.m531a().containsKey("notify_effect"))) {
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = jjVar.b();
                    objArr3[1] = jaVarM564a != null ? jaVarM564a.m530a() : "";
                    com.xiaomi.channel.commonutils.logger.b.m62a(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", objArr3));
                    fo.a(this.f124a).a(this.f124a.getPackageName(), intent, String.format("25: %1$s", jjVar.b()));
                    s.b(this.f124a, jjVar, booleanExtra);
                    return null;
                }
                if (bVarM111a.m120c() || jjVar.f744a == in.Registration) {
                    if (!bVarM111a.m120c() || !bVarM111a.m123f()) {
                        return a(jjVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    if (jjVar.f744a != in.UnRegistration) {
                        s.e(this.f124a, jjVar, booleanExtra);
                        MiPushClient.unregisterPush(this.f124a);
                    } else if (jjVar.m572b()) {
                        bVarM111a.m113a();
                        MiPushClient.clearExtras(this.f124a);
                        PushMessageHandler.a();
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-encrypt unregistration message");
                    }
                } else {
                    if (com.xiaomi.push.service.al.m698a(jjVar)) {
                        return a(jjVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    s.e(this.f124a, jjVar, booleanExtra);
                    boolean zM121d = bVarM111a.m121d();
                    com.xiaomi.channel.commonutils.logger.b.d("receive message without registration. need re-register!registered?" + zM121d);
                    fo.a(this.f124a).a(this.f124a.getPackageName(), intent, "15");
                    if (zM121d) {
                        a();
                    }
                }
            } catch (kd e10) {
                fo.a(this.f124a).a(this.f124a.getPackageName(), intent, "16");
                com.xiaomi.channel.commonutils.logger.b.a(e10);
            } catch (Exception e11) {
                fo.a(this.f124a).a(this.f124a.getPackageName(), intent, "17");
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        } else {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
                jj jjVar2 = new jj();
                try {
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra2 != null) {
                        jx.a(jjVar2, byteArrayExtra2);
                    }
                } catch (kd unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(jjVar2.a()));
                miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                com.xiaomi.channel.commonutils.logger.b.d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
                return miPushCommandMessage;
            }
            if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra3 == null) {
                    com.xiaomi.channel.commonutils.logger.b.d("message arrived: receiving an empty message, drop");
                    return null;
                }
                jj jjVar3 = new jj();
                try {
                    jx.a(jjVar3, byteArrayExtra3);
                    b bVarM111a2 = b.m111a(this.f124a);
                    if (com.xiaomi.push.service.al.m698a(jjVar3)) {
                        com.xiaomi.channel.commonutils.logger.b.d("message arrived: receive ignore reg message, ignore!");
                    } else if (!bVarM111a2.m120c()) {
                        com.xiaomi.channel.commonutils.logger.b.d("message arrived: receive message without registration. need unregister or re-register!");
                    } else {
                        if (!bVarM111a2.m120c() || !bVarM111a2.m123f()) {
                            return a(jjVar3, byteArrayExtra3);
                        }
                        com.xiaomi.channel.commonutils.logger.b.d("message arrived: app info is invalidated");
                    }
                } catch (Exception e12) {
                    com.xiaomi.channel.commonutils.logger.b.d("fail to deal with arrived message. " + e12);
                }
            }
        }
        return null;
    }

    public List<String> a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long j10 = ((((Long.parseLong(list.get(0).split(":")[0]) * 60) + Long.parseLong(list.get(0).split(":")[1])) - rawOffset) + 1440) % 1440;
        long j11 = ((((Long.parseLong(list.get(1).split(":")[0]) * 60) + Long.parseLong(list.get(1).split(":")[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j10 / 60), Long.valueOf(j10 % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j11 / 60), Long.valueOf(j11 % 60)));
        return arrayList;
    }
}
