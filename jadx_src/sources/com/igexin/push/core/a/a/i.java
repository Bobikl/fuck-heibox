package com.igexin.push.core.a.a;

import android.app.NotificationManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.igexin.push.config.k;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.bean.l;
import com.igexin.push.core.w;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63477a = k.f63422a;

    private void a(String... strArr) {
        try {
            com.igexin.a.a.c.b.a(f63477a + "|del condition taskid = " + strArr.toString(), new Object[0]);
            com.igexin.push.core.c.a().k().a("message", new String[]{"taskid"}, strArr);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f63477a + "|del condition" + th2.toString(), new Object[0]);
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
            l lVar = new l();
            lVar.setType("terminatetask");
            lVar.setActionId(jSONObject.getString("actionid"));
            lVar.setDoActionId(jSONObject.getString("do"));
            lVar.a(jSONObject.getString("taskid"));
            lVar.a(jSONObject.optBoolean("force"));
            return lVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:31:0x009a, B:33:0x00a0), top: B:39:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00a0, please report this as an issue */
    @Override // com.igexin.push.core.a.a.a
    public boolean b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        boolean z10;
        l lVar = (l) baseAction;
        String strA = lVar.a();
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
                    if (TextUtils.isEmpty(strA2)) {
                        z10 = false;
                    } else {
                        PushTaskBean pushTaskBean2 = com.igexin.push.core.d.f63658ac.get(strA2);
                        if (pushTaskBean2 != null) {
                            pushTaskBean2.setStop(true);
                        }
                        a(strA);
                        if (com.igexin.push.core.d.f63659ad.containsKey(strA)) {
                            notificationManager.cancel(com.igexin.push.core.d.f63659ad.get(strA).intValue());
                            try {
                                com.igexin.push.core.d.f63659ad.remove(strA);
                                z10 = true;
                            } catch (Throwable unused) {
                                z10 = true;
                                if (cursorA != null) {
                                }
                                if (!z10) {
                                    try {
                                        if (lVar.b()) {
                                            com.igexin.a.a.c.b.a(f63477a + " | cancelAll()", new Object[0]);
                                            notificationManager.cancelAll();
                                            com.igexin.assist.sdk.a.k(com.igexin.push.core.d.f63671e);
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                                if (!TextUtils.isEmpty(baseAction.getDoActionId())) {
                                    w.a().b(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
                                }
                                return true;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            } catch (Throwable unused3) {
                z10 = false;
            }
        }
        if (!z10) {
            if (lVar.b()) {
                com.igexin.a.a.c.b.a(f63477a + " | cancelAll()", new Object[0]);
                notificationManager.cancelAll();
                com.igexin.assist.sdk.a.k(com.igexin.push.core.d.f63671e);
            }
        }
        if (!TextUtils.isEmpty(baseAction.getDoActionId())) {
            w.a().b(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
        }
        return true;
    }
}
