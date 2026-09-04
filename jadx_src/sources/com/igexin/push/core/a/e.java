package com.igexin.push.core.a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.exoplayer2.audio.q0;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.core.CoreConsts;
import com.igexin.push.core.bean.PushTaskBean;
import com.umeng.message.common.inter.ITagManager;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SparseArray<a> f63479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f63480c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f63481a = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private e() {
        SparseArray<a> sparseArray = new SparseArray<>();
        f63479b = sparseArray;
        sparseArray.put(0, new k());
        f63479b.put(5, new m());
        f63479b.put(37, new o());
        f63479b.put(9, new t());
        f63479b.put(20, new s());
        f63479b.put(26, new j());
        f63479b.put(97, new l());
    }

    public static e a() {
        if (f63480c == null) {
            f63480c = new e();
        }
        return f63480c;
    }

    public static boolean a(long j10) {
        return com.igexin.push.util.a.a(j10);
    }

    private void l() {
        com.igexin.push.core.c.a().i().i();
        if (com.igexin.push.core.w.a().b()) {
            com.igexin.a.a.c.b.a("CoreAction|network changed check condition status", new Object[0]);
            com.igexin.push.core.w.a().f();
        }
    }

    public Class a(Context context) {
        return com.igexin.push.core.x.a().b(context);
    }

    public String a(String str, String str2) {
        return str + ":" + str2;
    }

    public void a(Intent intent) throws Throwable {
        com.igexin.a.a.c.b.a("CoreAction|onServiceInitialize ##", new Object[0]);
        if (intent != null) {
            com.igexin.push.core.c.a().a(false);
            com.igexin.push.core.d.f63679m = false;
            if (com.igexin.push.core.d.f63678l) {
                com.igexin.push.core.r.a().c();
                com.igexin.push.core.d.f63679m = true;
            }
            if (!com.igexin.push.util.o.a(com.igexin.push.core.d.f63671e) || com.igexin.push.core.d.X == null) {
                return;
            }
            String name = com.igexin.push.core.x.a().b(com.igexin.push.core.d.f63671e).getName();
            if (!name.equals(CoreConsts.f63466p)) {
                byte[] bArrB = com.igexin.a.b.a.b(name.getBytes());
                if (bArrB != null) {
                    com.igexin.push.util.d.a(bArrB, com.igexin.push.core.d.X, false);
                    return;
                }
                return;
            }
            if (new File(com.igexin.push.core.d.X).delete()) {
                com.igexin.a.a.c.b.a("del " + com.igexin.push.core.d.X + " success ~~~", new Object[0]);
            }
        }
    }

    public void a(Bundle bundle) {
        com.igexin.push.core.v.a().a(bundle);
    }

    public void a(PushTaskBean pushTaskBean, String str) {
        a(pushTaskBean, AssistPushConsts.PUSHMESSAGE_ACTION_MULTI_BRAND_RECEIVE + str, ITagManager.SUCCESS);
    }

    public void a(PushTaskBean pushTaskBean, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "pushmessage_feedback");
            jSONObject.put("appid", pushTaskBean.getAppid());
            jSONObject.put("id", String.valueOf(jCurrentTimeMillis));
            jSONObject.put("appkey", pushTaskBean.getAppKey());
            jSONObject.put("messageid", pushTaskBean.getMessageId());
            jSONObject.put("taskid", pushTaskBean.getTaskId());
            jSONObject.put("actionid", str);
            jSONObject.put("result", str2);
            jSONObject.put("timestamp", String.valueOf(System.currentTimeMillis()));
        } catch (Exception unused) {
        }
        String string = jSONObject.toString();
        com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
        bVar.b();
        bVar.f63819a = (int) jCurrentTimeMillis;
        bVar.f63822d = "17258000";
        bVar.f63823e = string;
        bVar.f63825g = com.igexin.push.core.d.f63685s;
        com.igexin.push.core.b.e.a().a(new com.igexin.push.core.bean.h(jCurrentTimeMillis, string, (byte) 3, com.igexin.push.core.d.f63678l ? jCurrentTimeMillis : 0L));
        if (com.igexin.push.core.c.a().i() != null) {
            com.igexin.push.core.c.a().i().a("C-" + com.igexin.push.core.d.f63685s, bVar);
        }
        com.igexin.a.a.c.b.a("feedback|" + pushTaskBean.getTaskId() + "|" + pushTaskBean.getMessageId() + "|" + str, new Object[0]);
    }

    void a(String str) {
        this.f63481a.execute(new f(this, str));
    }

    void a(JSONObject jSONObject, String str) {
        try {
            PushTaskBean pushTaskBean = new PushTaskBean();
            pushTaskBean.parse(jSONObject);
            a(pushTaskBean, str);
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("CoreAction " + e10.toString(), new Object[0]);
        }
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(com.igexin.a.a.d.e eVar) {
        return false;
    }

    public boolean a(com.igexin.push.d.c.c cVar) {
        if (cVar == null) {
            return false;
        }
        a aVar = f63479b.get(cVar.f63827i);
        if ((cVar instanceof com.igexin.push.d.c.h) || (cVar instanceof com.igexin.push.d.c.k) || (cVar instanceof com.igexin.push.d.c.l) || (cVar instanceof com.igexin.push.d.c.o) || (cVar instanceof com.igexin.push.d.c.p) || (cVar instanceof com.igexin.push.d.c.f)) {
            com.igexin.a.a.c.b.a("CoreAction|receive : " + cVar.getClass().getName() + " resp ~~~~", new Object[0]);
            com.igexin.a.a.b.a.a.f.a().a(cVar.getClass().getName());
        }
        if ((cVar instanceof com.igexin.push.d.c.k) || (cVar instanceof com.igexin.push.d.c.l) || (cVar instanceof com.igexin.push.d.c.o)) {
            com.igexin.push.core.d.D = 0L;
            com.igexin.push.core.d.E = 1200000L;
            com.igexin.push.c.i.a().d().b();
        }
        if (aVar != null) {
            aVar.a(cVar);
        }
        com.igexin.push.f.b.b.i().j();
        return true;
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(Object obj) {
        com.igexin.push.e.a aVarI = com.igexin.push.core.c.a().i();
        if ((obj instanceof com.igexin.push.d.c.c) && aVarI != null) {
            aVarI.a((com.igexin.push.d.c.c) obj);
        } else if (obj instanceof com.igexin.push.d.b.b) {
            com.igexin.a.a.c.b.a("CoreAction|TcpExceptionNotify###", new Object[0]);
            aVarI.f();
        } else if (obj instanceof com.igexin.push.d.b.a) {
            com.igexin.a.a.c.b.a("CoreAction|TcpDisconnectSuccessNotify ###", new Object[0]);
            if (com.igexin.push.core.d.f63678l) {
                com.igexin.push.core.d.f63678l = false;
                com.igexin.a.a.c.b.a("CoreAction|broadcast online state = offline", new Object[0]);
                com.igexin.push.core.r.a().b();
            }
            aVarI.g();
        }
        return false;
    }

    public boolean a(String str, String str2, String str3) {
        return com.igexin.push.core.w.a().a(str, str2, str3);
    }

    public boolean a(JSONObject jSONObject, PushTaskBean pushTaskBean) {
        return com.igexin.push.core.w.a().a(jSONObject, pushTaskBean);
    }

    public void b() {
        com.igexin.a.a.c.b.a("CoreAction|send heart beat data ........", new Object[0]);
        com.igexin.push.core.c.a().i().a("H-" + com.igexin.push.core.d.f63685s, new com.igexin.push.d.c.f(), true);
    }

    public void b(Intent intent) {
        if (intent == null || !intent.hasExtra("isSlave")) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("isSlave", false);
        com.igexin.a.a.c.b.a("CoreAction|onServiceInitializeForSlave isSlave =" + booleanExtra, new Object[0]);
        if (booleanExtra) {
            com.igexin.push.core.c.a().a(true);
            if (com.igexin.push.core.d.f63678l) {
                com.igexin.push.core.r.a().c();
            }
        }
    }

    public void b(PushTaskBean pushTaskBean, String str) {
        a(pushTaskBean, str, ITagManager.SUCCESS);
    }

    void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "received");
            jSONObject.put("id", str);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        com.igexin.push.d.c.n nVar = new com.igexin.push.d.c.n();
        nVar.b();
        ((com.igexin.push.d.c.b) nVar).f63819a = (int) System.currentTimeMillis();
        nVar.f63822d = "17258000";
        nVar.f63823e = string;
        nVar.f63825g = com.igexin.push.core.d.f63685s;
        com.igexin.push.core.c.a().i().a("C-" + com.igexin.push.core.d.f63685s, nVar);
    }

    void c() {
        try {
            for (com.igexin.push.core.bean.h hVar : com.igexin.push.core.b.e.a().b()) {
                if (hVar.d() + q0.f44202v <= System.currentTimeMillis()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject(hVar.b());
                    com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
                    bVar.b();
                    bVar.f63819a = (int) jCurrentTimeMillis;
                    bVar.f63822d = "17258000";
                    if (jSONObject.has("extraData")) {
                        bVar.f63824f = com.igexin.push.util.h.a(jSONObject.optString("extraData").getBytes(), 0);
                        jSONObject.remove("extraData");
                    }
                    bVar.f63823e = hVar.b();
                    bVar.f63825g = com.igexin.push.core.d.f63685s;
                    com.igexin.a.a.c.b.a("freshral|" + hVar.b(), new Object[0]);
                    com.igexin.push.core.b.e.a().a(hVar.a(), System.currentTimeMillis());
                    com.igexin.push.core.c.a().i().a("C-" + com.igexin.push.core.d.f63685s, bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("CoreActionfreshRAL error :" + th2.toString(), new Object[0]);
        }
    }

    public void c(Intent intent) {
        StringBuilder sb2;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        try {
            String action = intent.getAction();
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                if (com.igexin.a.a.b.c.b() != null) {
                    l();
                    return;
                }
                return;
            }
            String str = CoreConsts.f63452b;
            if (str.equals(action)) {
                com.igexin.push.core.w.a().a(intent);
                return;
            }
            if (!CoreConsts.f63451a.equals(action)) {
                if ("android.intent.action.TIME_SET".equals(action)) {
                    if (com.igexin.push.config.l.f63424b != 0) {
                        com.igexin.push.a.a.c.c().d();
                        return;
                    }
                    return;
                } else if (!"android.intent.action.SCREEN_ON".equals(action)) {
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        com.igexin.push.core.d.f63683q = 0;
                        return;
                    }
                    return;
                } else {
                    com.igexin.push.core.d.f63683q = 1;
                    if (com.igexin.push.core.w.a().b()) {
                        com.igexin.push.core.w.a().f();
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        c("screen on");
                        return;
                    }
                    return;
                }
            }
            String stringExtra = intent.getStringExtra("checkpackage");
            String stringExtra2 = intent.getStringExtra("accesstoken");
            com.igexin.a.a.c.b.a("CoreAction|checkpackage = " + stringExtra + " , accesstoken = " + stringExtra2, new Object[0]);
            if (stringExtra == null || stringExtra2 == null || !stringExtra.equals(com.igexin.push.core.d.f63671e.getPackageName())) {
                return;
            }
            intent.setAction(str);
            intent.putExtra("accesstoken", com.igexin.push.core.d.f63664ai);
            com.igexin.push.core.w.a().a(intent);
            PushTaskBean pushTaskBean = new PushTaskBean();
            pushTaskBean.setAppid(intent.getStringExtra("appid"));
            pushTaskBean.setMessageId(intent.getStringExtra("messageid"));
            pushTaskBean.setTaskId(intent.getStringExtra("taskid"));
            pushTaskBean.setId(intent.getStringExtra("id"));
            try {
                int i10 = Integer.parseInt(intent.getStringExtra("feedbackid")) + 30010;
                pushTaskBean.setCurrentActionid(i10);
                if (intent.getBooleanExtra("isFloat", false)) {
                    sb2 = new StringBuilder();
                    sb2.append("notifyFloat:");
                    sb2.append(intent.getStringExtra("bigStyle"));
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("notifyStyle:");
                    sb2.append(intent.getStringExtra("notifyStyle"));
                }
                String string = sb2.toString();
                a().a(pushTaskBean, i10 + "", string);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("CoreAction" + th2.toString(), new Object[0]);
        }
    }

    public void c(PushTaskBean pushTaskBean, String str) {
        this.f63481a.execute(new i(this, pushTaskBean, str));
    }

    public void c(String str) {
        com.igexin.a.a.c.b.a("CoreAction|resetDelayTime from = " + str, new Object[0]);
        long j10 = com.igexin.push.core.d.D;
        if (j10 <= 10000 && (j10 != 0 || com.igexin.push.core.d.E != 1200000)) {
            com.igexin.a.a.c.b.a("CoreAction|resetDelayTime ignore, delay = " + com.igexin.push.core.d.D, new Object[0]);
            return;
        }
        int iRandom = (int) ((Math.random() * 200.0d) + 1000.0d);
        com.igexin.a.a.c.b.a("CoreAction|reConnectDelayTime = " + com.igexin.push.core.d.D + ", reset = " + iRandom, new Object[0]);
        com.igexin.push.f.b.f.i().b((long) iRandom);
    }

    void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "request_deviceid");
            jSONObject.put("id", String.valueOf(jCurrentTimeMillis));
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        com.igexin.push.d.c.b bVar = new com.igexin.push.d.c.b();
        bVar.b();
        bVar.f63819a = (int) jCurrentTimeMillis;
        bVar.f63822d = "17258000";
        bVar.f63823e = string;
        bVar.f63825g = com.igexin.push.core.d.f63685s;
        com.igexin.push.core.c.a().i().a("C-" + com.igexin.push.core.d.f63685s, bVar);
        com.igexin.a.a.c.b.a("CoreAction|deviceidReq", new Object[0]);
    }

    public void e() {
        try {
            if (System.currentTimeMillis() - com.igexin.push.core.d.G > 86400000) {
                com.igexin.push.core.b.i.a().b(0);
                com.igexin.push.core.b.i.a().d(System.currentTimeMillis());
            }
            if (com.igexin.push.core.d.as <= 5) {
                com.igexin.push.core.b.i.a().b(com.igexin.push.core.d.as + 1);
                com.igexin.a.a.b.c.b().a(new g(this), false, true);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean f() {
        return false;
    }

    public void g() {
        String[] list;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String str = simpleDateFormat.format(new Date());
        File file = new File("/sdcard/libs//");
        String str2 = com.igexin.push.core.d.f63669c;
        if (str2 == null) {
            str2 = "unknowPacageName";
        }
        if (file.exists() && (list = file.list()) != null) {
            int length = list.length;
            for (int i10 = 0; i10 < length; i10++) {
                int length2 = list[i10].length();
                if (list[i10].startsWith(str2) && list[i10].endsWith(".log") && length2 > str2.length() + 14 && str2.equals(list[i10].substring(0, length2 - 15))) {
                    try {
                        if (Math.abs((simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse(list[i10].substring(str2.length() + 1, length2 - 4)).getTime()) / 86400000) > 6) {
                            File file2 = new File("/sdcard/libs//" + list[i10]);
                            if (file2.exists()) {
                                file2.delete();
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public void h() {
        com.igexin.push.util.a.e();
    }

    public void i() {
        int i10 = com.igexin.push.core.d.f63661af - 100;
        if (i10 < 0) {
            i10 = 0;
        }
        com.igexin.push.core.d.f63661af = i10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<String, Long>> it = com.igexin.push.core.d.f63660ae.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Long> next = it.next();
            next.getKey();
            if (jCurrentTimeMillis - next.getValue().longValue() > 3600000) {
                it.remove();
            }
        }
    }

    public void j() {
        if (com.igexin.push.core.d.N < System.currentTimeMillis()) {
            com.igexin.push.core.b.i.a().a(false);
        }
    }

    public void k() {
        if (!com.igexin.push.core.d.Z) {
            com.igexin.push.core.d.Z = com.igexin.a.a.b.c.b().a(com.igexin.push.f.b.b.i(), false, true);
        }
        if (!com.igexin.push.core.d.f63656aa) {
            com.igexin.push.core.d.f63656aa = com.igexin.a.a.b.c.b().a(com.igexin.push.f.b.f.i(), true, true);
        }
        if (com.igexin.push.core.d.f63657ab) {
            return;
        }
        com.igexin.push.core.c.a().d();
    }
}
