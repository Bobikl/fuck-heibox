package com.igexin.push.extension.distribution.basic.a;

import android.app.NotificationManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class i implements com.igexin.push.core.a.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63916a = "EXT-" + i.class.getName();

    private void a(String str) {
        if (com.igexin.push.extension.distribution.basic.c.e.f63972l.a()) {
            try {
                com.igexin.a.a.c.b.a(f63916a + "|del condition taskid = " + str, new Object[0]);
                com.igexin.push.extension.distribution.basic.c.e.f63972l.a("message", new String[]{"taskid"}, new String[]{str});
                com.igexin.push.extension.distribution.basic.c.e.f63972l.close();
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a(f63916a + "|del condition" + th2.toString(), new Object[0]);
            }
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return com.igexin.push.core.a.success;
    }

    @Override // com.igexin.push.core.a.a.a
    public BaseAction a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("do") || !jSONObject.has("actionid") || !jSONObject.has("taskid")) {
                return null;
            }
            com.igexin.push.extension.distribution.basic.b.e eVar = new com.igexin.push.extension.distribution.basic.b.e();
            eVar.setType("terminatetask");
            eVar.setActionId(jSONObject.getString("actionid"));
            eVar.setDoActionId(jSONObject.getString("do"));
            eVar.a(jSONObject.getString("taskid"));
            eVar.a(jSONObject.optBoolean("force"));
            return eVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9 A[PHI: r3 r4
  0x00e9: PHI (r3v6 boolean) = (r3v5 boolean), (r3v8 boolean) binds: [B:39:0x00ef, B:35:0x00e7] A[DONT_GENERATE, DONT_INLINE]
  0x00e9: PHI (r4v5 android.database.Cursor) = (r4v4 android.database.Cursor), (r4v6 android.database.Cursor) binds: [B:39:0x00ef, B:35:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc A[Catch: all -> 0x011c, TRY_LEAVE, TryCatch #0 {all -> 0x011c, blocks: (B:43:0x00f6, B:45:0x00fc), top: B:53:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00fc, please report this as an issue */
    @Override // com.igexin.push.core.a.a.a
    public boolean b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        boolean z10;
        PushTaskBean pushTaskBean2;
        com.igexin.push.extension.distribution.basic.b.e eVar = (com.igexin.push.extension.distribution.basic.b.e) baseAction;
        String strA = eVar.a();
        NotificationManager notificationManager = (NotificationManager) com.igexin.push.core.d.f63671e.getSystemService("notification");
        if (TextUtils.isEmpty(strA)) {
            z10 = false;
        } else {
            Cursor cursorA = null;
            try {
                cursorA = com.igexin.push.core.c.a().k().a("message", new String[]{"taskid"}, new String[]{strA}, null, "id ASC");
                if (cursorA == null) {
                    z10 = false;
                } else {
                    String strA2 = cursorA.moveToFirst() ? com.igexin.push.core.a.e.a().a(strA, cursorA.getString(cursorA.getColumnIndex("messageid"))) : "";
                    if (strA2.equals("") || (pushTaskBean2 = com.igexin.push.core.d.f63658ac.get(strA2)) == null) {
                        z10 = false;
                    } else {
                        pushTaskBean2.setStop(true);
                        try {
                            a(strA);
                            String strValueOf = String.valueOf(pushTaskBean2.getPerActionid());
                            if (!strValueOf.equals("0") && pushTaskBean2.getBaseAction(strValueOf).getType().equals("notification") && com.igexin.push.core.d.f63659ad.containsKey(strA)) {
                                notificationManager.cancel(com.igexin.push.core.d.f63659ad.get(strA).intValue());
                                try {
                                    com.igexin.push.core.d.f63659ad.remove(strA);
                                    com.igexin.a.a.c.b.a(f63916a + "remove terminateTaskId from cache", new Object[0]);
                                    z10 = true;
                                } catch (Throwable unused) {
                                    z10 = true;
                                    if (cursorA != null) {
                                        cursorA.close();
                                    }
                                    if (!z10) {
                                        try {
                                            if (eVar.b()) {
                                                com.igexin.a.a.c.b.a(f63916a + " | cancelAll()", new Object[0]);
                                                notificationManager.cancelAll();
                                                com.igexin.push.extension.distribution.basic.g.a.c(com.igexin.push.core.d.f63671e);
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    if (!baseAction.getDoActionId().equals("")) {
                                        com.igexin.push.core.a.e.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
                                    }
                                    return true;
                                }
                            } else {
                                z10 = false;
                            }
                            try {
                                com.igexin.push.core.f.a aVarA = com.igexin.push.core.f.b.a().a((Long) 11111111L);
                                if (aVarA != null && aVarA.b().equals(strA)) {
                                    com.igexin.push.core.f.b.a().b(aVarA);
                                }
                            } catch (Throwable unused3) {
                                if (cursorA != null) {
                                }
                                if (!z10) {
                                    if (eVar.b()) {
                                        com.igexin.a.a.c.b.a(f63916a + " | cancelAll()", new Object[0]);
                                        notificationManager.cancelAll();
                                        com.igexin.push.extension.distribution.basic.g.a.c(com.igexin.push.core.d.f63671e);
                                    }
                                }
                                if (!baseAction.getDoActionId().equals("")) {
                                    com.igexin.push.core.a.e.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
                                }
                                return true;
                            }
                        } catch (Throwable unused4) {
                            z10 = false;
                            if (cursorA != null) {
                                cursorA.close();
                            }
                            if (!z10) {
                                if (eVar.b()) {
                                    com.igexin.a.a.c.b.a(f63916a + " | cancelAll()", new Object[0]);
                                    notificationManager.cancelAll();
                                    com.igexin.push.extension.distribution.basic.g.a.c(com.igexin.push.core.d.f63671e);
                                }
                            }
                            if (!baseAction.getDoActionId().equals("")) {
                                com.igexin.push.core.a.e.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
                            }
                            return true;
                        }
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            } catch (Throwable unused5) {
            }
        }
        if (!z10) {
            if (eVar.b()) {
                com.igexin.a.a.c.b.a(f63916a + " | cancelAll()", new Object[0]);
                notificationManager.cancelAll();
                com.igexin.push.extension.distribution.basic.g.a.c(com.igexin.push.core.d.f63671e);
            }
        }
        if (!baseAction.getDoActionId().equals("")) {
            com.igexin.push.core.a.e.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
        }
        return true;
    }
}
