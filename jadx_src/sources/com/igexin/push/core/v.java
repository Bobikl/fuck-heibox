package com.igexin.push.core;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushManager;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.sdk.PushConsts;
import com.umeng.analytics.pro.ak;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static v f63784a;

    private v() {
    }

    public static v a() {
        if (f63784a == null) {
            f63784a = new v();
        }
        return f63784a;
    }

    public void a(int i10, int i11, String str) {
        com.igexin.push.config.l.f63423a = i10;
        com.igexin.push.config.l.f63424b = i11;
        com.igexin.push.config.a.a().b();
        com.igexin.push.a.a.c.c().d();
    }

    public void a(int i10, String str) {
        com.igexin.push.config.l.f63426d = i10;
        com.igexin.push.config.a.a().c();
        if (d.f63678l) {
            com.igexin.a.a.c.b.a("setHeartbeatInterval heartbeatReq", new Object[0]);
            if (System.currentTimeMillis() - d.O > 5000) {
                d.O = System.currentTimeMillis();
                com.igexin.push.core.a.e.a().b();
            }
        }
    }

    public void a(Bundle bundle) {
        com.igexin.a.a.c.a.f fVarA;
        String str;
        String string = bundle.getString("action");
        com.igexin.a.a.c.b.a("PushController|action pushmanager action = " + string, new Object[0]);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (string.equals("setTag")) {
            a(bundle.getString("tags"), bundle.getString("sn"));
            return;
        }
        if (string.equals("setSilentTime")) {
            int i10 = bundle.getInt("beginHour", 0);
            int i11 = bundle.getInt("duration", 0);
            a(i10, i11, d.f63671e.getPackageName());
            AssistPushManager.getInstance().setSilentTime(d.f63671e, i10, i11);
            return;
        }
        if (string.equals("sendMessage")) {
            com.igexin.a.a.c.b.a("PushController onPushManagerMessage recevie action : sendMessage", new Object[0]);
            if (com.igexin.push.config.l.f63429g) {
                String string2 = bundle.getString("taskid");
                byte[] byteArray = bundle.getByteArray("extraData");
                com.igexin.a.a.c.b.a("PushController receive broadcast msg data , task id : " + string2 + " ######@##@@@#", new Object[0]);
                a(string2, byteArray);
                return;
            }
            return;
        }
        if (string.equals("setHeartbeatInterval")) {
            a(bundle.getInt(ak.aT, 0), d.f63671e.getPackageName());
            return;
        }
        if (string.equals("setSocketTimeout")) {
            b(bundle.getInt(l5.a.f130839h0, 0), d.f63671e.getPackageName());
            return;
        }
        if (string.equals("sendFeedbackMessage")) {
            if (d.f63661af <= 200) {
                String string3 = bundle.getString("taskid");
                String string4 = bundle.getString("messageid");
                String string5 = bundle.getString("actionid");
                String str2 = string3 + ":" + string4 + ":" + string5;
                if (d.f63660ae.get(str2) == null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    PushTaskBean pushTaskBean = new PushTaskBean();
                    pushTaskBean.setTaskId(string3);
                    pushTaskBean.setMessageId(string4);
                    pushTaskBean.setAppid(d.f63655a);
                    com.igexin.push.core.a.e.a().b(pushTaskBean, string5);
                    d.f63661af++;
                    d.f63660ae.put(str2, Long.valueOf(jCurrentTimeMillis));
                    return;
                }
                return;
            }
            return;
        }
        if (string.equals("turnOffPush")) {
            c.a().g();
            AssistPushManager.getInstance().turnOffPush(d.f63671e);
            return;
        }
        if (string.equals("bindAlias")) {
            String string6 = bundle.getString("alias");
            String string7 = bundle.getString("sn");
            com.igexin.a.a.c.b.a("PushController|onPushManagerMessage bindAlias...", new Object[0]);
            b(string6, string7);
            return;
        }
        if (string.equals("unbindAlias")) {
            String string8 = bundle.getString("alias");
            String string9 = bundle.getString("sn");
            boolean z10 = bundle.getBoolean("isSeft");
            com.igexin.a.a.c.b.a("PushController|onPushManagerMessage unbindAlias...", new Object[0]);
            a(string8, string9, z10);
            return;
        }
        if (string.equals("sendApplinkFeedback")) {
            a(bundle.getString("url"));
            return;
        }
        if (string.equals("setHwBadgeNum")) {
            com.igexin.push.util.b.a(bundle.getInt("badgeNum"), true);
            return;
        }
        if (string.equals("setNotificationIcon")) {
            d.ax = bundle.getString("smallIcon", "");
            d.ay = bundle.getString("largeIcon", "");
            com.igexin.push.core.b.i.a().a(d.ax, d.ay);
            fVarA = com.igexin.a.a.c.a.f.a();
            str = "[PushController] setNotificationIcon success";
        } else {
            if (!string.equals("setBadgeNum")) {
                if (!string.equals("setDeviceToken")) {
                    if (string.equals("queryPushOnLine")) {
                        r.a().b();
                        return;
                    }
                    return;
                }
                String string10 = bundle.getString("token", "");
                if (!TextUtils.isEmpty(string10) && d.b().booleanValue() && !string10.equals(d.f63692z)) {
                    com.igexin.push.core.b.i.a().c(string10);
                    if (d.f63678l) {
                        com.igexin.a.a.c.b.a("PushController", "set token online, send addphoneinfo");
                        com.igexin.push.core.a.e.a().e();
                    }
                }
                com.igexin.a.a.c.a.f.a().a("[PushController] setDeviceToken success " + string10);
                return;
            }
            if (com.igexin.push.util.n.a().equalsIgnoreCase("huawei") || com.igexin.push.util.n.a().equalsIgnoreCase("honor")) {
                com.igexin.push.util.b.a(bundle.getInt("badgeNum"), true);
            } else if (com.igexin.push.util.n.a().equalsIgnoreCase("oppo")) {
                com.igexin.push.util.b.c(bundle.getInt("badgeNum"), true);
            } else if (com.igexin.push.util.n.a().equalsIgnoreCase("vivo")) {
                com.igexin.push.util.b.b(bundle.getInt("badgeNum"), true);
            }
            fVarA = com.igexin.a.a.c.a.f.a();
            str = "[PushController] setBadgeNum success";
        }
        fVarA.a(str);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            com.igexin.a.a.c.a.f.a().a("sendApplinkFeedback, url is invalid");
            return;
        }
        try {
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("p");
            if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(queryParameter)) {
                if (!com.igexin.push.config.l.f63448z) {
                    com.igexin.a.a.c.b.a("PushController|isApplinkFeedback is false, not feedback", new Object[0]);
                    return;
                }
                if (!com.igexin.push.util.a.c(host)) {
                    com.igexin.a.a.c.b.a("PushController|checkIsWhiteApplinkDomain is false, not feedback", new Object[0]);
                    return;
                }
                com.igexin.a.a.c.b.a("PushController|isApplinkFeedback is true and checkIsWhiteApplinkDomain is true, to feedback", new Object[0]);
                PushTaskBean pushTaskBean = new PushTaskBean();
                pushTaskBean.setTaskId("getuiapplinkup");
                pushTaskBean.setMessageId(queryParameter);
                pushTaskBean.setAppid(d.f63655a);
                com.igexin.push.core.a.e.a().b(pushTaskBean, PushConsts.SEND_MESSAGE_ERROR);
                return;
            }
            com.igexin.a.a.c.b.a("PushController|url " + str + " is invalid", new Object[0]);
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("PushController|" + e10.toString(), new Object[0]);
        }
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(d.f63685s)) {
            com.igexin.a.a.c.a.f.a().a("setTag : " + str + ", failed, has not get clientid");
            r.a().a(str2, String.valueOf(20008));
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", "set_tag");
                jSONObject.put("id", String.valueOf(jCurrentTimeMillis));
                jSONObject.put("cid", d.f63685s);
                jSONObject.put("appid", d.f63655a);
                jSONObject.put("tags", URLEncoder.encode(str, "utf-8"));
                jSONObject.put("sn", str2);
            } catch (Exception unused) {
            }
            String string = jSONObject.toString();
            com.igexin.push.core.b.e.a().a(new com.igexin.push.core.bean.h(jCurrentTimeMillis, string, (byte) 2, d.f63678l ? jCurrentTimeMillis : 0L));
            com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
            bVar.b();
            bVar.f63822d = "17258000";
            bVar.f63823e = string;
            c.a().i().a("C-" + d.f63685s, bVar);
            com.igexin.a.a.c.b.a("settag", new Object[0]);
        } catch (Exception unused2) {
        }
    }

    public void a(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(d.f63685s)) {
            com.igexin.a.a.c.a.f.a().a("unbindAlias : " + str + ", failed, has not get clientid");
            r.a().c(str2, String.valueOf(PushConsts.ALIAS_CID_LOST));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - d.Q <= 1000) {
            com.igexin.a.a.c.b.a("PushController|unbindAlias frequently called", new Object[0]);
            return;
        }
        String str3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(jCurrentTimeMillis));
        if (!str3.equals(d.P)) {
            com.igexin.push.core.b.i.a().f(str3);
            com.igexin.push.core.b.i.a().a(0);
        }
        if (d.R < 100) {
            com.igexin.a.a.c.b.a("start unbindAlias ###", new Object[0]);
            d.Q = jCurrentTimeMillis;
            com.igexin.push.core.b.i.a().a(d.R + 1);
            a(str, str2, true, z10);
            return;
        }
        com.igexin.a.a.c.b.a("PushController|unbindAlias times exceed", new Object[0]);
        com.igexin.a.a.c.a.f.a().a("unbindAlias : " + str + ", failed, , the number of calls per day cannot exceed 100");
        r.a().c(str2, String.valueOf(PushConsts.ALIAS_REQUEST_FILTER));
    }

    public void a(String str, String str2, boolean z10, boolean z11) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            String str3 = z10 ? "unbind_alias" : "bind_alias";
            byte b10 = z10 ? (byte) 8 : (byte) 7;
            try {
                jSONObject.put("action", str3);
                jSONObject.put("id", String.valueOf(jCurrentTimeMillis));
                jSONObject.put("cid", d.f63685s);
                jSONObject.put("appid", d.f63655a);
                jSONObject.put("alias", str);
                jSONObject.put("sn", str2);
                if (z10) {
                    jSONObject.put("is_self", z11);
                }
            } catch (Exception unused) {
            }
            String string = jSONObject.toString();
            com.igexin.push.core.b.e.a().a(new com.igexin.push.core.bean.h(jCurrentTimeMillis, string, b10, d.f63678l ? jCurrentTimeMillis : 0L));
            com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
            bVar.b();
            bVar.f63822d = "17258000";
            bVar.f63823e = string;
            c.a().i().a("C-" + d.f63685s, bVar);
            com.igexin.a.a.c.b.a(str3 + " = " + string, new Object[0]);
        } catch (Exception unused2) {
        }
    }

    public void a(String str, byte[] bArr) {
        if (d.f63685s != null) {
            JSONObject jSONObject = new JSONObject();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                jSONObject.put("action", "sendmessage");
                jSONObject.put("id", String.valueOf(jCurrentTimeMillis));
                jSONObject.put("cid", d.f63685s);
                jSONObject.put("appid", d.f63655a);
                jSONObject.put("taskid", str);
                jSONObject.put("extraData", com.igexin.push.util.h.b(bArr, 0));
                String string = jSONObject.toString();
                com.igexin.push.core.b.e.a().a(new com.igexin.push.core.bean.h(jCurrentTimeMillis, string, (byte) 6, jCurrentTimeMillis));
                com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
                bVar.b();
                bVar.f63819a = (int) jCurrentTimeMillis;
                String str2 = d.f63685s;
                bVar.f63822d = str2;
                bVar.f63823e = string;
                bVar.f63824f = bArr;
                bVar.f63825g = str2;
                c.a().i().a("C-" + d.f63685s, bVar);
                if (str == null || !str.startsWith("4T5@S_")) {
                    return;
                }
                com.igexin.a.a.c.b.a("PushController sending lbs report message : " + string, new Object[0]);
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a("PushController|" + th2.toString(), new Object[0]);
            }
        }
    }

    public void b(int i10, String str) {
        com.igexin.push.config.l.f63427e = i10;
        com.igexin.push.config.a.a().d();
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(d.f63685s)) {
            com.igexin.a.a.c.a.f.a().a("bindAlias : " + str + ", failed, has not get clientid");
            r.a().b(str2, String.valueOf(PushConsts.ALIAS_CID_LOST));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - d.Q <= 1000) {
            com.igexin.a.a.c.b.a("PushController|bindAlias frequently called", new Object[0]);
            return;
        }
        String str3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(jCurrentTimeMillis));
        if (!str3.equals(d.P)) {
            com.igexin.push.core.b.i.a().f(str3);
            com.igexin.push.core.b.i.a().a(0);
        }
        com.igexin.a.a.c.b.a("-> CoreRuntimeInfo.opAliasTimes:" + d.R, new Object[0]);
        if (d.R < 100) {
            com.igexin.a.a.c.b.a("start bindAlias ###", new Object[0]);
            d.Q = jCurrentTimeMillis;
            com.igexin.push.core.b.i.a().a(d.R + 1);
            a(str, str2, false, true);
            return;
        }
        com.igexin.a.a.c.b.a("PushController|bindAlias times exceed", new Object[0]);
        com.igexin.a.a.c.a.f.a().a("bindAlias : " + str + ", failed, , the number of calls per day cannot exceed 100");
        r.a().b(str2, String.valueOf(PushConsts.ALIAS_REQUEST_FILTER));
    }
}
