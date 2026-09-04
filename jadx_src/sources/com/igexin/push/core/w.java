package com.igexin.push.core;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.extension.stub.IPushExtension;
import com.umeng.analytics.AnalyticsConfig;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static w f63785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, com.igexin.push.core.a.a.a> f63786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Set<String> f63787c;

    private w() {
        f63787c = new HashSet();
        f63786b = new HashMap();
        f63787c.add("goto");
        f63787c.add("notification");
        f63787c.add("terminatetask");
        f63787c.add("startmyactivity");
        f63787c.add("startapp");
        f63787c.add("null");
        f63787c.add("startweb");
        f63787c.add("checkapp");
    }

    private com.igexin.push.core.a.a.a a(String str) {
        Map<String, com.igexin.push.core.a.a.a> map;
        com.igexin.push.core.a.a.a bVar;
        if (TextUtils.isEmpty(str) || !f63787c.contains(str)) {
            return null;
        }
        com.igexin.push.core.a.a.a aVar = f63786b.get(str);
        if (aVar != null) {
            return aVar;
        }
        String str2 = "goto";
        if (str.equals("goto")) {
            map = f63786b;
            bVar = new com.igexin.push.core.a.a.d();
        } else {
            str2 = "notification";
            if (str.equals("notification")) {
                map = f63786b;
                bVar = new com.igexin.push.core.a.a.e();
            } else {
                str2 = "terminatetask";
                if (str.equals("terminatetask")) {
                    map = f63786b;
                    bVar = new com.igexin.push.core.a.a.i();
                } else {
                    str2 = "startmyactivity";
                    if (str.equals("startmyactivity")) {
                        map = f63786b;
                        bVar = new com.igexin.push.core.a.a.f();
                    } else {
                        str2 = "startapp";
                        if (str.equals("startapp")) {
                            map = f63786b;
                            bVar = new com.igexin.push.core.a.a.h();
                        } else {
                            str2 = "null";
                            if (str.equals("null")) {
                                map = f63786b;
                                bVar = new com.igexin.push.core.a.a.c();
                            } else {
                                str2 = "startweb";
                                if (!str.equals("startweb")) {
                                    str2 = "checkapp";
                                    if (str.equals("checkapp")) {
                                        map = f63786b;
                                        bVar = new com.igexin.push.core.a.a.b();
                                    }
                                    return f63786b.get(str);
                                }
                                map = f63786b;
                                bVar = new com.igexin.push.core.a.a.g();
                            }
                        }
                    }
                }
            }
        }
        map.put(str2, bVar);
        return f63786b.get(str);
    }

    public static w a() {
        if (f63785a == null) {
            f63785a = new w();
        }
        return f63785a;
    }

    private void a(int i10, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i10));
        n.a().b(str, contentValues);
    }

    private boolean a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("condition");
            return (jSONObject2.has("wifi") || jSONObject2.has("screenOn") || jSONObject2.has("duration") || jSONObject2.has("netConnected")) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    private void b(JSONObject jSONObject, PushTaskBean pushTaskBean) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("condition");
            HashMap map = new HashMap();
            if (jSONObject2.has("wifi")) {
                map.put("wifi", jSONObject2.getString("wifi"));
            }
            if (jSONObject2.has("screenOn")) {
                map.put("screenOn", jSONObject2.getString("screenOn"));
            }
            if (jSONObject2.has("duration")) {
                String string = jSONObject2.getString("duration");
                if (string.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                    int iIndexOf = string.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    String strSubstring = string.substring(0, iIndexOf);
                    String strSubstring2 = string.substring(iIndexOf + 1, string.length());
                    map.put(AnalyticsConfig.RTD_START_TIME, strSubstring);
                    map.put("endTime", strSubstring2);
                }
            }
            if (jSONObject2.has("netConnected")) {
                map.put("netConnected", jSONObject2.getString("netConnected"));
            }
            if (jSONObject2.has("expiredTime")) {
                String string2 = jSONObject2.getString("expiredTime");
                if (!TextUtils.isEmpty(string2) && TextUtils.isDigitsOnly(string2)) {
                    map.put("expiredTime", string2);
                }
            }
            pushTaskBean.setConditionMap(map);
        } catch (Exception unused) {
        }
    }

    private boolean h() {
        if (d.f63658ac.isEmpty() && d.f63680n) {
            Cursor cursorA = null;
            try {
                cursorA = c.a().k().a("message", new String[]{"status"}, new String[]{"0"}, null, null);
                if (cursorA != null) {
                    while (cursorA.moveToNext()) {
                        byte[] blob = cursorA.getBlob(cursorA.getColumnIndex("msgextra"));
                        try {
                            JSONObject jSONObject = new JSONObject(new String(com.igexin.a.b.a.c(cursorA.getBlob(cursorA.getColumnIndex("info")))));
                            String string = jSONObject.getString("id");
                            String string2 = jSONObject.getString("appid");
                            String string3 = jSONObject.getString("messageid");
                            String string4 = jSONObject.getString("taskid");
                            String string5 = jSONObject.getString("appkey");
                            JSONArray jSONArray = jSONObject.getJSONArray("action_chains");
                            String strA = com.igexin.push.core.a.e.a().a(string4, string3);
                            PushTaskBean pushTaskBean = new PushTaskBean();
                            pushTaskBean.setAppid(string2);
                            pushTaskBean.setMessageId(string3);
                            pushTaskBean.setTaskId(string4);
                            pushTaskBean.setId(string);
                            pushTaskBean.setAppKey(string5);
                            pushTaskBean.setCurrentActionid(1);
                            pushTaskBean.setStatus(cursorA.getInt(cursorA.getColumnIndex("status")));
                            if (blob != null) {
                                pushTaskBean.setMsgExtra(blob);
                            }
                            if (jSONObject.has("condition")) {
                                b(jSONObject, pushTaskBean);
                            }
                            if (jSONArray.length() > 0 && !a(jSONObject, pushTaskBean)) {
                                com.igexin.a.a.c.b.a("PushMessageExecutor|load task from db parseActionChains result = false ####### " + jSONObject.toString(), new Object[0]);
                            }
                            d.f63658ac.put(strA, pushTaskBean);
                        } catch (JSONException unused) {
                        }
                    }
                }
                d.f63680n = false;
                if (cursorA != null) {
                }
            } catch (Throwable th2) {
                try {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|checkPushMessageMapValue error:" + th2.toString(), new Object[0]);
                } finally {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                }
            }
        }
        return d.f63658ac.isEmpty();
    }

    public void a(ContentValues contentValues) {
        try {
            if (d.at < 1000) {
                n.a().a(contentValues.getAsString("taskid"), contentValues);
            } else {
                int iA = c.a().k().a("message", "id IN (SELECT id from message where status IS NULL or status=1 or status=2 order by id asc limit 250)");
                d.at -= iA;
                if (iA < 250) {
                    d.at -= c.a().k().a("message", "id IN (SELECT id from message where status=0 order by id asc limit " + (250 - iA) + ")");
                }
                n.a().a(contentValues.getAsString("taskid"), contentValues);
            }
            d.at++;
        } catch (Throwable unused) {
        }
    }

    public void a(Intent intent) {
        String stringExtra = intent.getStringExtra("taskid");
        String stringExtra2 = intent.getStringExtra("messageid");
        String stringExtra3 = intent.getStringExtra("actionid");
        String stringExtra4 = intent.getStringExtra("accesstoken");
        String stringExtra5 = intent.hasExtra("title") ? intent.getStringExtra("title") : "";
        String stringExtra6 = intent.hasExtra("content") ? intent.getStringExtra("content") : "";
        int intExtra = intent.getIntExtra("notifID", 0);
        String stringExtra7 = intent.getStringExtra("url");
        String stringExtra8 = intent.getStringExtra(RemoteMessageConst.Notification.INTENT_URI);
        String stringExtra9 = intent.getStringExtra(AssistPushConsts.MSG_TYPE_PAYLOAD);
        NotificationManager notificationManager = (NotificationManager) d.f63671e.getSystemService("notification");
        if (intExtra != 0) {
            notificationManager.cancel(intExtra);
        } else if (d.f63659ad.containsKey(stringExtra)) {
            intExtra = d.f63659ad.get(stringExtra).intValue();
            notificationManager.cancel(intExtra);
        }
        d.f63659ad.remove(stringExtra);
        if (!stringExtra4.equals(d.f63664ai)) {
            com.igexin.a.a.c.b.a("PushMessageExecutor", "ACTION_BROADCAST_TO_DOACTION accesstoken NOT match.");
        } else {
            r.a().b(stringExtra, stringExtra2, stringExtra5, stringExtra6, stringExtra7, stringExtra8, stringExtra9);
            b(stringExtra, stringExtra2, stringExtra3);
        }
    }

    public void a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        Message messageObtain = Message.obtain();
        messageObtain.what = CoreConsts.f63458h;
        messageObtain.obj = bundle;
        c.a().a(messageObtain);
    }

    public boolean a(String str, String str2, String str3) {
        if (Thread.currentThread().getId() == c.a().e()) {
            b(str, str2, str3);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        bundle.putString("actionid", str3);
        Message messageObtain = Message.obtain();
        messageObtain.what = CoreConsts.f63459i;
        messageObtain.obj = bundle;
        return c.a().a(messageObtain);
    }

    public boolean a(JSONObject jSONObject, PushTaskBean pushTaskBean) {
        boolean z10;
        com.igexin.a.a.c.b.a("PushMessageExecutor------parse pushmessage actionchain json start-------", new Object[0]);
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("action_chains");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = ((JSONObject) jSONArray.get(i10)).getString("type");
                Iterator<IPushExtension> it = com.igexin.push.extension.a.a().b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (it.next().isActionSupported(string)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|extension not suport type = " + string, new Object[0]);
                    if (!f63787c.contains(string)) {
                        com.igexin.a.a.c.b.a("PushMessageExecutor|action cannot be supported! --" + string, new Object[0]);
                        return false;
                    }
                }
            }
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i11);
                String string2 = jSONObject2.getString("type");
                com.igexin.a.a.c.b.a("PushMessageExecutor|start parse type = " + string2, new Object[0]);
                BaseAction baseActionA = null;
                Iterator<IPushExtension> it2 = com.igexin.push.extension.a.a().b().iterator();
                while (it2.hasNext() && (baseActionA = it2.next().parseAction(jSONObject2)) == null) {
                }
                if (baseActionA == null) {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|extension can't process type = " + string2, new Object[0]);
                    com.igexin.push.core.a.a.a aVarA = a(string2);
                    if (aVarA != null && (baseActionA = aVarA.a(jSONObject2)) != null) {
                        baseActionA.setSupportExt(false);
                    }
                } else {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|extension process type = " + string2 + " success", new Object[0]);
                }
                if (baseActionA == null) {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|action chains can't parse, throw ++++++", new Object[0]);
                    return false;
                }
                arrayList.add(baseActionA);
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("PushMessageExecutor|" + th2.toString(), new Object[0]);
        }
        pushTaskBean.setActionChains(arrayList);
        com.igexin.a.a.c.b.a("PushMessageExecutor------parse pushmessage actionchain json end-------", new Object[0]);
        return true;
    }

    public boolean a(JSONObject jSONObject, byte[] bArr, boolean z10) {
        int i10;
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("pushmessage")) {
                return true;
            }
            String string = jSONObject.getString("id");
            String string2 = jSONObject.getString("appid");
            String string3 = jSONObject.getString("messageid");
            String string4 = jSONObject.getString("taskid");
            String string5 = jSONObject.getString("appkey");
            JSONArray jSONArray = jSONObject.getJSONArray("action_chains");
            com.igexin.a.a.c.b.a("pushmessage|" + string4 + "|" + string3 + "|" + string2 + "|" + z10, new Object[0]);
            if (!string2.equals(d.f63655a)) {
                com.igexin.a.a.c.b.a("PushMessageExecutor receieve error pushmessage", new Object[0]);
                return true;
            }
            PushTaskBean pushTaskBean = new PushTaskBean();
            pushTaskBean.setAppid(string2);
            pushTaskBean.setMessageId(string3);
            pushTaskBean.setTaskId(string4);
            pushTaskBean.setId(string);
            pushTaskBean.setAppKey(string5);
            pushTaskBean.setCurrentActionid(1);
            String strA = com.igexin.push.core.a.e.a().a(string4, string3);
            if (z10) {
                com.igexin.push.core.a.e.a().c(pushTaskBean, "0");
                if (com.igexin.push.util.a.b(string4)) {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|" + string4 + " in blacklist ###", new Object[0]);
                    return true;
                }
                if (com.igexin.push.util.a.a(System.currentTimeMillis())) {
                    return true;
                }
                if (com.igexin.push.util.a.a(jSONObject)) {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|message have loop", new Object[0]);
                    return true;
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("messageid", string3);
            contentValues.put("taskid", string4);
            contentValues.put("appid", string2);
            contentValues.put("key", "CACHE_" + strA);
            contentValues.put("info", com.igexin.a.b.a.b(jSONObject.toString().getBytes()));
            contentValues.put("createtime", Long.valueOf(System.currentTimeMillis()));
            if (bArr != null) {
                contentValues.put("msgextra", bArr);
                pushTaskBean.setMsgExtra(bArr);
            }
            if (jSONArray.length() > 0 && !a(jSONObject, pushTaskBean)) {
                com.igexin.a.a.c.b.a("PushMessageExecutor parseActionChains result = false #######", new Object[0]);
                return true;
            }
            if (!z10) {
                if (jSONObject.has("condition")) {
                    b(jSONObject, pushTaskBean);
                }
                pushTaskBean.setStatus(CoreConsts.f63464n);
                d.f63658ac.put(strA, pushTaskBean);
                return true;
            }
            try {
                if (n.a().a(string4)) {
                    return true;
                }
                if (jSONObject.has("condition")) {
                    b(jSONObject, pushTaskBean);
                    pushTaskBean.setStatus(CoreConsts.f63463m);
                    i10 = CoreConsts.f63463m;
                } else {
                    pushTaskBean.setStatus(CoreConsts.f63464n);
                    i10 = CoreConsts.f63464n;
                }
                contentValues.put("status", Integer.valueOf(i10));
                a(contentValues);
                d.f63658ac.put(strA, pushTaskBean);
                if (jSONObject.has("condition")) {
                    f();
                    return true;
                }
                a(string4, string3);
                return true;
            } catch (Exception unused) {
                return true;
            }
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a("PushMessageExecutor " + e10.toString(), new Object[0]);
            return true;
        }
    }

    public void b(String str, String str2) {
        com.igexin.a.a.c.b.a("PushMessageExecutor do processActionExecute", new Object[0]);
        if (str2 == null || str == null) {
            return;
        }
        try {
            if (c.a() == null || c(str, str2) != a.success) {
                return;
            }
            a(str, str2, "1");
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("PushMessageExecutor|" + th2.toString(), new Object[0]);
        }
    }

    public boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = d.I;
        if (j10 <= 0) {
            d.I = jCurrentTimeMillis - 60000;
            return true;
        }
        if (jCurrentTimeMillis - j10 <= 60000) {
            return false;
        }
        d.I = jCurrentTimeMillis;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff A[Catch: all -> 0x013f, TryCatch #4 {all -> 0x013f, blocks: (B:37:0x00f8, B:40:0x00ff, B:42:0x0105, B:43:0x0111, B:45:0x0117, B:48:0x0124), top: B:72:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0105 A[Catch: all -> 0x013f, TryCatch #4 {all -> 0x013f, blocks: (B:37:0x00f8, B:40:0x00ff, B:42:0x0105, B:43:0x0111, B:45:0x0117, B:48:0x0124), top: B:72:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0117 A[Catch: all -> 0x013f, TryCatch #4 {all -> 0x013f, blocks: (B:37:0x00f8, B:40:0x00ff, B:42:0x0105, B:43:0x0111, B:45:0x0117, B:48:0x0124), top: B:72:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:1: B:43:0x0111->B:78:?, LOOP_END, SYNTHETIC] */
    public boolean b(String str, String str2, String str3) {
        int executeTimes;
        BaseAction baseAction;
        com.igexin.push.core.a.a.a aVarA;
        Iterator<IPushExtension> it;
        String strA = com.igexin.push.core.a.e.a().a(str, str2);
        PushTaskBean pushTaskBean = d.f63658ac.get(strA);
        if (pushTaskBean == null) {
            Cursor cursorA = null;
            try {
                cursorA = c.a().k().a("message", new String[]{"taskid", "messageid"}, new String[]{str, str2}, null, null);
                if (cursorA != null && cursorA.getCount() > 0) {
                    while (cursorA.moveToNext()) {
                        a().a(new JSONObject(new String(com.igexin.a.b.a.c(cursorA.getBlob(cursorA.getColumnIndexOrThrow("info"))))), cursorA.getBlob(cursorA.getColumnIndexOrThrow("msgextra")), false);
                        PushTaskBean pushTaskBean2 = d.f63658ac.get(str + ":" + str2);
                        if (pushTaskBean2 == null) {
                            cursorA.close();
                            return false;
                        }
                        pushTaskBean = pushTaskBean2;
                    }
                    cursorA.close();
                }
                if (cursorA != null) {
                    cursorA.close();
                }
                return false;
            } catch (Throwable th2) {
                try {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|" + th2.toString(), new Object[0]);
                    if (cursorA != null) {
                    }
                    executeTimes = pushTaskBean.getExecuteTimes();
                    if (executeTimes >= 50) {
                        try {
                            d.f63658ac.remove(strA);
                        } catch (Exception e10) {
                            com.igexin.a.a.c.b.a("PushMessageExecutor|" + e10.toString(), new Object[0]);
                        }
                        return true;
                    }
                    pushTaskBean.setExecuteTimes(executeTimes + 1);
                    com.igexin.push.core.a.e.a().c(pushTaskBean, str3);
                    try {
                        baseAction = pushTaskBean.getBaseAction(str3);
                        if (baseAction == null) {
                            return false;
                        }
                        if (baseAction.isSupportExt()) {
                            it = com.igexin.push.extension.a.a().b().iterator();
                            while (it.hasNext()) {
                                if (it.next().executeAction(pushTaskBean, baseAction)) {
                                    return true;
                                }
                            }
                        }
                        try {
                            aVarA = a(baseAction.getType());
                            if (aVarA != null) {
                                return aVarA.b(pushTaskBean, baseAction);
                            }
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    throw th5;
                }
            }
        }
        executeTimes = pushTaskBean.getExecuteTimes();
        if (executeTimes >= 50) {
            d.f63658ac.remove(strA);
            return true;
        }
        pushTaskBean.setExecuteTimes(executeTimes + 1);
        com.igexin.push.core.a.e.a().c(pushTaskBean, str3);
        baseAction = pushTaskBean.getBaseAction(str3);
        if (baseAction == null) {
            return false;
        }
        if (baseAction.isSupportExt()) {
            it = com.igexin.push.extension.a.a().b().iterator();
            while (it.hasNext()) {
                if (it.next().executeAction(pushTaskBean, baseAction)) {
                    return true;
                }
            }
        }
        aVarA = a(baseAction.getType());
        if (aVarA != null && !pushTaskBean.isStop()) {
            return aVarA.b(pushTaskBean, baseAction);
        }
        return false;
        com.igexin.a.a.c.b.a("PushMessageExecutor|" + th.toString(), new Object[0]);
        return false;
    }

    public a c(String str, String str2) {
        a aVar = a.success;
        PushTaskBean pushTaskBean = d.f63658ac.get(com.igexin.push.core.a.e.a().a(str, str2));
        if (pushTaskBean == null) {
            return a.stop;
        }
        int i10 = 0;
        for (BaseAction baseAction : pushTaskBean.getActionChains()) {
            a aVarA = a.stop;
            if (baseAction == null) {
                return aVarA;
            }
            Iterator<IPushExtension> it = com.igexin.push.extension.a.a().b().iterator();
            while (it.hasNext() && (aVarA = it.next().prepareExecuteAction(pushTaskBean, baseAction)) == a.stop) {
            }
            a aVar2 = a.stop;
            if (aVarA == aVar2) {
                com.igexin.push.core.a.a.a aVarA2 = a(baseAction.getType());
                if (aVarA2 == null) {
                    return aVarA;
                }
                aVarA = aVarA2.a(pushTaskBean, baseAction);
                if (aVarA == aVar2) {
                    return aVarA;
                }
            }
            if (aVar == a.success) {
                aVar = aVarA;
            }
            if (aVarA == a.wait) {
                i10++;
            }
        }
        return (i10 == 0 || d.a(str, Integer.valueOf(i10), true)) ? aVar : a.success;
    }

    public void c() {
        long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
        c.a().k().a("message", "createtime <= " + jCurrentTimeMillis);
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
        c.a().k().a("at", "create_time <= " + jCurrentTimeMillis);
    }

    public void e() {
        try {
            if (!TextUtils.isEmpty(com.igexin.push.config.l.f63447y) && !"none".equals(com.igexin.push.config.l.f63447y)) {
                List<String> listAsList = Arrays.asList(com.igexin.push.config.l.f63447y.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
                if (listAsList.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, PushTaskBean>> it = d.f63658ac.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, PushTaskBean> next = it.next();
                    String key = next.getKey();
                    PushTaskBean value = next.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        for (String str : listAsList) {
                            if (!TextUtils.isEmpty(str) && key.startsWith(str)) {
                                arrayList.add(value.getTaskId());
                                it.remove();
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                String[] strArr = new String[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    strArr[i10] = (String) arrayList.get(i10);
                }
                c.a().k().a("message", new String[]{"taskid"}, strArr);
            }
        } catch (Throwable unused) {
        }
    }

    public void f() {
        int i10;
        try {
            if (h()) {
                return;
            }
            for (Map.Entry<String, PushTaskBean> entry : d.f63658ac.entrySet()) {
                try {
                    String key = entry.getKey();
                    PushTaskBean value = entry.getValue();
                    if (value == null) {
                        return;
                    }
                    if (value.getStatus() == CoreConsts.f63463m) {
                        String taskId = value.getTaskId();
                        Map<String, String> conditionMap = value.getConditionMap();
                        if (conditionMap == null) {
                            return;
                        }
                        if (com.igexin.push.util.a.b(taskId)) {
                            a(CoreConsts.f63465o, taskId, key);
                            i10 = CoreConsts.f63464n;
                        } else {
                            if (conditionMap.size() > 0) {
                                if (conditionMap.containsKey("expiredTime") && Long.parseLong(conditionMap.get("expiredTime")) < System.currentTimeMillis()) {
                                    a(CoreConsts.f63465o, taskId, key);
                                    i10 = CoreConsts.f63464n;
                                } else if (!conditionMap.containsKey("endTime") || Long.parseLong(conditionMap.get("endTime")) >= System.currentTimeMillis()) {
                                    if (conditionMap.containsKey("wifi")) {
                                        int i11 = Integer.parseInt(conditionMap.get("wifi"));
                                        com.igexin.push.util.a.d();
                                        if (i11 != d.f63682p) {
                                        }
                                    }
                                    if (conditionMap.containsKey("screenOn")) {
                                        int i12 = Integer.parseInt(conditionMap.get("screenOn"));
                                        com.igexin.push.util.a.e();
                                        if (i12 != d.f63683q) {
                                        }
                                    }
                                    if (!conditionMap.containsKey(AnalyticsConfig.RTD_START_TIME) || Long.parseLong(conditionMap.get(AnalyticsConfig.RTD_START_TIME)) <= System.currentTimeMillis()) {
                                        if (conditionMap.containsKey("netConnected")) {
                                            try {
                                                if (Integer.parseInt(conditionMap.get("netConnected")) != com.igexin.push.util.a.h()) {
                                                }
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                } else {
                                    a(CoreConsts.f63465o, taskId, key);
                                    i10 = CoreConsts.f63464n;
                                }
                            }
                            a(taskId, value.getMessageId());
                            a(CoreConsts.f63464n, taskId, key);
                            i10 = CoreConsts.f63464n;
                        }
                        value.setStatus(i10);
                    } else {
                        continue;
                    }
                } catch (Exception e10) {
                    com.igexin.a.a.c.b.a("PushMessageExecutor|" + e10.toString(), new Object[0]);
                }
            }
        } catch (Exception e11) {
            com.igexin.a.a.c.b.a("PushMessageExecutor|" + e11.toString(), new Object[0]);
        }
    }

    public void g() {
        Cursor cursorA = null;
        try {
            com.igexin.push.b.b bVarK = c.a().k();
            cursorA = bVarK.a("message", new String[]{"status"}, new String[]{"0"}, null, null);
            if (cursorA != null) {
                while (cursorA.moveToNext()) {
                    byte[] blob = cursorA.getBlob(cursorA.getColumnIndex("info"));
                    long j10 = cursorA.getLong(cursorA.getColumnIndex("createtime"));
                    try {
                        JSONObject jSONObject = new JSONObject(new String(com.igexin.a.b.a.c(blob)));
                        String string = jSONObject.getString("taskid");
                        if (jSONObject.has("condition") && !a(jSONObject) && System.currentTimeMillis() - j10 > 259200000) {
                            com.igexin.a.a.c.b.a("PushMessageExecutor|del condition taskid = " + string, new Object[0]);
                            bVarK.a("message", new String[]{"taskid"}, new String[]{string});
                        }
                    } catch (Throwable th2) {
                        com.igexin.a.a.c.b.a("PushMessageExecutor|del condition" + th2.toString(), new Object[0]);
                    }
                }
            }
            if (cursorA == null) {
            }
        } catch (Throwable th3) {
            try {
                com.igexin.a.a.c.b.a("PushMessageExecutor|del condition" + th3.toString(), new Object[0]);
            } finally {
                if (cursorA != null) {
                    cursorA.close();
                }
            }
        }
    }
}
