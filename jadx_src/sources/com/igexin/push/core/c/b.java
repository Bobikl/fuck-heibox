package com.igexin.push.core.c;

import android.text.TextUtils;
import com.igexin.push.config.l;
import com.igexin.push.core.b.i;
import com.igexin.push.core.d;
import com.igexin.push.core.v;
import com.igexin.push.core.w;
import com.umeng.message.common.inter.ITagManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.igexin.push.f.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63652a = "com.igexin.push.core.c.b";

    public b(String str) {
        super(str);
        b();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    private void c(byte[] bArr) {
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            com.igexin.a.a.c.b.a(f63652a + "|parse sdk config from server resp = " + jSONObject, new Object[0]);
            i.a().c(System.currentTimeMillis());
            if (jSONObject.has("result") && ITagManager.SUCCESS.equals(jSONObject.getString("result")) && jSONObject.has("config")) {
                if (jSONObject.has("tag")) {
                    l.f63441s = jSONObject.getString("tag");
                }
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString("config"));
                if (jSONObject2.has("sdk.sdcard.enabled")) {
                    if (jSONObject2.optBoolean("sdk.sdcard.enabled", true)) {
                        new com.igexin.sdk.a.b(d.f63671e).b();
                    } else {
                        new com.igexin.sdk.a.b(d.f63671e).a();
                    }
                }
                if (jSONObject2.has("sdk.ups.push.disable.brand")) {
                    l.L = jSONObject2.getString("sdk.ups.push.disable.brand");
                }
                if (TextUtils.isEmpty(l.L)) {
                    l.L = "null";
                }
                if (jSONObject2.has("sdk.startservice.limit")) {
                    l.K = jSONObject2.getString("sdk.startservice.limit");
                }
                if (jSONObject2.has("sdk.feature.sendmessage.enable")) {
                    String string = jSONObject2.getString("sdk.feature.sendmessage.enable");
                    if (string.equals("true") || string.equals("false")) {
                        l.f63429g = Boolean.parseBoolean(string);
                    }
                }
                if (jSONObject2.has("sdk.domainbackup.enable")) {
                    String string2 = jSONObject2.getString("sdk.domainbackup.enable");
                    if (string2.equals("true") || string2.equals("false")) {
                        l.f63428f = Boolean.parseBoolean(string2);
                    }
                }
                if (jSONObject2.has("sdk.feature.setsilenttime.enable")) {
                    String string3 = jSONObject2.getString("sdk.feature.setsilenttime.enable");
                    if ((string3.equals("true") || string3.equals("false")) && l.f63424b != 0) {
                        v.a().a(12, 0, "server");
                    }
                }
                if (jSONObject2.has("sdk.needlook.enable")) {
                    String string4 = jSONObject2.getString("sdk.needlook.enable");
                    if (string4.equals("true") || string4.equals("false")) {
                        l.f63433k = Boolean.parseBoolean(string4);
                        try {
                            d(string4.getBytes());
                        } catch (Throwable th2) {
                            th = th2;
                            com.igexin.a.a.c.b.a(f63652a + "|" + th.toString(), new Object[0]);
                            return;
                        }
                    }
                }
                if (jSONObject2.has("sdk.report.initialize.enable")) {
                    String string5 = jSONObject2.getString("sdk.report.initialize.enable");
                    if (string5.equals("true") || string5.equals("false")) {
                        l.f63435m = Boolean.parseBoolean(string5);
                    }
                }
                if (jSONObject2.has("sdk.watchout.app")) {
                    l.f63431i = jSONObject2.getString("sdk.watchout.app");
                }
                if (jSONObject2.has("sdk.watchout.service")) {
                    l.f63432j = jSONObject2.getString("sdk.watchout.service");
                }
                if (jSONObject2.has("sdk.polling.dis.cnt")) {
                    l.f63442t = Integer.parseInt(jSONObject2.getString("sdk.polling.dis.cnt"));
                }
                if (jSONObject2.has("sdk.polling.login.interval")) {
                    l.f63443u = Integer.parseInt(jSONObject2.getString("sdk.polling.login.interval")) * 1000;
                }
                if (jSONObject2.has("sdk.polling.exit.heartbeat.cnt")) {
                    l.f63444v = Integer.parseInt(jSONObject2.getString("sdk.polling.exit.heartbeat.cnt"));
                }
                if (jSONObject2.has("sdk.httpdata.maxsize")) {
                    l.f63445w = Integer.parseInt(jSONObject2.getString("sdk.httpdata.maxsize"));
                }
                if (jSONObject2.has("sdk.hide.righticon.blacklist")) {
                    l.f63446x = jSONObject2.getString("sdk.hide.righticon.blacklist");
                }
                if (jSONObject2.has("sdk.taskid.blacklist")) {
                    String string6 = jSONObject2.getString("sdk.taskid.blacklist");
                    l.f63447y = string6;
                    if (TextUtils.isEmpty(string6)) {
                        l.f63447y = "none";
                    } else {
                        w.a().e();
                    }
                }
                if (jSONObject2.has("sdk.applink.feedback.enable")) {
                    String string7 = jSONObject2.getString("sdk.applink.feedback.enable");
                    if (string7.equals("true") || string7.equals("false")) {
                        l.f63448z = Boolean.parseBoolean(string7);
                    }
                }
                if (jSONObject2.has("sdk.applink.domains")) {
                    String string8 = jSONObject2.getString("sdk.applink.domains");
                    l.A = string8;
                    if (TextUtils.isEmpty(string8)) {
                        l.A = "none";
                    }
                }
                if (jSONObject2.has("sdk.del.alarm.brand")) {
                    String string9 = jSONObject2.getString("sdk.del.alarm.brand");
                    l.B = string9;
                    if (TextUtils.isEmpty(string9)) {
                        l.B = "none";
                    }
                }
                if (jSONObject2.has("sdk.miuipush.enable")) {
                    String string10 = jSONObject2.getString("sdk.miuipush.enable");
                    if (string10.equals("true") || string10.equals("false")) {
                        l.C = Boolean.parseBoolean(string10);
                    }
                }
                if (jSONObject2.has("sdk.flymepush.enable")) {
                    String string11 = jSONObject2.getString("sdk.flymepush.enable");
                    if (string11.equals("true") || string11.equals("false")) {
                        l.D = Boolean.parseBoolean(string11);
                    }
                }
                if (jSONObject2.has("sdk.hmspush.enable")) {
                    String string12 = jSONObject2.getString("sdk.hmspush.enable");
                    if (string12.equals("true") || string12.equals("false")) {
                        l.E = Boolean.parseBoolean(string12);
                    }
                }
                if (jSONObject2.has("sdk.colorospush.enable")) {
                    String string13 = jSONObject2.getString("sdk.colorospush.enable");
                    if (string13.equals("true") || string13.equals("false")) {
                        l.F = Boolean.parseBoolean(string13);
                    }
                }
                if (jSONObject2.has("sdk.vivopush.enable")) {
                    String string14 = jSONObject2.getString("sdk.vivopush.enable");
                    if (string14.equals("true") || string14.equals("false")) {
                        l.G = Boolean.parseBoolean(string14);
                    }
                }
                if (jSONObject2.has("sdk.stpush.enable")) {
                    String string15 = jSONObject2.getString("sdk.stpush.enable");
                    if (string15.equals("true") || string15.equals("false")) {
                        l.I = Boolean.parseBoolean(string15);
                    }
                }
                if (jSONObject2.has("sdk.fcmpush.enable")) {
                    String string16 = jSONObject2.getString("sdk.fcmpush.enable");
                    if (string16.equals("true") || string16.equals("false")) {
                        l.H = Boolean.valueOf(string16).booleanValue();
                    }
                }
                if (jSONObject2.has("sdk.oaid.enable")) {
                    String string17 = jSONObject2.getString("sdk.oaid.enable");
                    if (string17.equals("true") || string17.equals("false")) {
                        l.J = Boolean.parseBoolean(string17);
                    }
                }
                if (jSONObject2.has("sdk.upload.gzip.limit")) {
                    l.M = jSONObject2.getLong("sdk.upload.gzip.limit");
                }
                com.igexin.push.config.a.a().f();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void d(byte[] bArr) {
        try {
            com.igexin.a.a.b.c.b().a(new c(this, bArr), false, true);
        } catch (Exception unused) {
        }
    }

    @Override // com.igexin.push.f.a.b
    public void a(byte[] bArr) throws Exception {
        if (bArr != null) {
            c(bArr);
        }
    }

    public void b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "sdkconfig");
            jSONObject.put("cid", d.f63685s);
            jSONObject.put("appid", d.f63655a);
            jSONObject.put("sdk_version", "4.4.3.15");
            jSONObject.put("tag", l.f63441s);
            b(jSONObject.toString().getBytes());
        } catch (Exception unused) {
        }
    }

    @Override // com.igexin.a.a.d.a.e
    public int b_() {
        return 0;
    }
}
