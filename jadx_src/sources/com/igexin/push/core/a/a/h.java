package com.igexin.push.core.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.r;
import com.igexin.push.util.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63476a = "com.igexin.push.core.a.a.h";

    private static void a(Context context, String str) {
        try {
            PackageInfo packageInfoB = n.b(context);
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(packageInfoB.packageName);
            ResolveInfo next = context.getPackageManager().queryIntentActivities(intent, 0).iterator().next();
            if (next != null) {
                ActivityInfo activityInfo = next.activityInfo;
                String str2 = activityInfo.packageName;
                String str3 = activityInfo.name;
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.LAUNCHER");
                intent2.setFlags(270532608);
                intent2.setComponent(new ComponentName(str2, str3));
                context.startActivity(intent2);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return com.igexin.push.core.a.success;
    }

    @Override // com.igexin.push.core.a.a.a
    public BaseAction a(JSONObject jSONObject) {
        try {
            com.igexin.push.core.bean.i iVar = new com.igexin.push.core.bean.i();
            iVar.setType("startapp");
            iVar.setActionId(jSONObject.getString("actionid"));
            iVar.setDoActionId(jSONObject.getString("do"));
            if (jSONObject.has("appstartupid")) {
                iVar.a(jSONObject.getJSONObject("appstartupid").getString("android"));
            }
            if (jSONObject.has("is_autostart")) {
                iVar.d(jSONObject.getString("is_autostart"));
            }
            if (jSONObject.has("appid")) {
                iVar.b(jSONObject.getString("appid"));
            }
            if (jSONObject.has("noinstall_action")) {
                iVar.c(jSONObject.getString("noinstall_action"));
            }
            return iVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a A[Catch: Exception -> 0x00d6, TRY_ENTER, TryCatch #0 {Exception -> 0x00d6, blocks: (B:15:0x004a, B:17:0x0065, B:18:0x006c, B:20:0x0072, B:21:0x007e, B:22:0x0082, B:23:0x0086, B:25:0x009f, B:29:0x00ac, B:31:0x00b2, B:32:0x00bf, B:34:0x00c5), top: B:38:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0065 A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:15:0x004a, B:17:0x0065, B:18:0x006c, B:20:0x0072, B:21:0x007e, B:22:0x0082, B:23:0x0086, B:25:0x009f, B:29:0x00ac, B:31:0x00b2, B:32:0x00bf, B:34:0x00c5), top: B:38:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0072 A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:15:0x004a, B:17:0x0065, B:18:0x006c, B:20:0x0072, B:21:0x007e, B:22:0x0082, B:23:0x0086, B:25:0x009f, B:29:0x00ac, B:31:0x00b2, B:32:0x00bf, B:34:0x00c5), top: B:38:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0086 A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:15:0x004a, B:17:0x0065, B:18:0x006c, B:20:0x0072, B:21:0x007e, B:22:0x0082, B:23:0x0086, B:25:0x009f, B:29:0x00ac, B:31:0x00b2, B:32:0x00bf, B:34:0x00c5), top: B:38:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:15:0x004a, B:17:0x0065, B:18:0x006c, B:20:0x0072, B:21:0x007e, B:22:0x0082, B:23:0x0086, B:25:0x009f, B:29:0x00ac, B:31:0x00b2, B:32:0x00bf, B:34:0x00c5), top: B:38:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2 A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:15:0x004a, B:17:0x0065, B:18:0x006c, B:20:0x0072, B:21:0x007e, B:22:0x0082, B:23:0x0086, B:25:0x009f, B:29:0x00ac, B:31:0x00b2, B:32:0x00bf, B:34:0x00c5), top: B:38:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:15:0x004a, B:17:0x0065, B:18:0x006c, B:20:0x0072, B:21:0x007e, B:22:0x0082, B:23:0x0086, B:25:0x009f, B:29:0x00ac, B:31:0x00b2, B:32:0x00bf, B:34:0x00c5), top: B:38:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[Catch: Exception -> 0x00d6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d6, blocks: (B:15:0x004a, B:17:0x0065, B:18:0x006c, B:20:0x0072, B:21:0x007e, B:22:0x0082, B:23:0x0086, B:25:0x009f, B:29:0x00ac, B:31:0x00b2, B:32:0x00bf, B:34:0x00c5), top: B:38:0x0048 }] */
    @Override // com.igexin.push.core.a.a.a
    public boolean b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        boolean z10;
        com.igexin.push.core.a.e eVarA;
        String taskId;
        String messageId;
        String strC;
        if (pushTaskBean != null && baseAction != null) {
            com.igexin.push.core.bean.i iVar = (com.igexin.push.core.bean.i) baseAction;
            String strB = iVar.b();
            try {
                if (strB.equals("")) {
                    strB = com.igexin.push.core.d.f63655a;
                } else {
                    if (!com.igexin.push.core.d.f63655a.equals(iVar.b())) {
                        z10 = false;
                    }
                    com.igexin.a.a.c.b.a("doStartApp|" + z10 + "|" + strB, new Object[0]);
                    if (z10) {
                        r.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), strB, (String) null);
                        if (((com.igexin.push.core.bean.i) baseAction).d().equals("true")) {
                            a(com.igexin.push.core.d.f63671e, com.igexin.push.core.d.f63669c);
                        }
                        if (iVar.getDoActionId() != null) {
                            eVarA = com.igexin.push.core.a.e.a();
                            taskId = pushTaskBean.getTaskId();
                            messageId = pushTaskBean.getMessageId();
                            strC = iVar.getDoActionId();
                            eVarA.a(taskId, messageId, strC);
                        }
                    } else {
                        r.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), strB, (String) null);
                        if (iVar.d().equals("true") || com.igexin.push.util.a.a(iVar.a())) {
                            if (iVar.getDoActionId() != null) {
                                eVarA = com.igexin.push.core.a.e.a();
                                taskId = pushTaskBean.getTaskId();
                                messageId = pushTaskBean.getMessageId();
                                strC = iVar.getDoActionId();
                                eVarA.a(taskId, messageId, strC);
                            }
                        } else if (iVar.c() != null) {
                            eVarA = com.igexin.push.core.a.e.a();
                            taskId = pushTaskBean.getTaskId();
                            messageId = pushTaskBean.getMessageId();
                            strC = iVar.c();
                            eVarA.a(taskId, messageId, strC);
                        }
                    }
                }
                if (z10) {
                    r.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), strB, (String) null);
                    if (((com.igexin.push.core.bean.i) baseAction).d().equals("true")) {
                        a(com.igexin.push.core.d.f63671e, com.igexin.push.core.d.f63669c);
                    }
                    if (iVar.getDoActionId() != null) {
                        eVarA = com.igexin.push.core.a.e.a();
                        taskId = pushTaskBean.getTaskId();
                        messageId = pushTaskBean.getMessageId();
                        strC = iVar.getDoActionId();
                        eVarA.a(taskId, messageId, strC);
                    }
                } else {
                    r.a().a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), strB, (String) null);
                    if (iVar.d().equals("true") || com.igexin.push.util.a.a(iVar.a())) {
                        if (iVar.getDoActionId() != null) {
                            eVarA = com.igexin.push.core.a.e.a();
                            taskId = pushTaskBean.getTaskId();
                            messageId = pushTaskBean.getMessageId();
                            strC = iVar.getDoActionId();
                            eVarA.a(taskId, messageId, strC);
                        }
                    } else if (iVar.c() != null) {
                        eVarA = com.igexin.push.core.a.e.a();
                        taskId = pushTaskBean.getTaskId();
                        messageId = pushTaskBean.getMessageId();
                        strC = iVar.c();
                        eVarA.a(taskId, messageId, strC);
                    }
                }
            } catch (Exception unused) {
            }
            z10 = true;
            com.igexin.a.a.c.b.a("doStartApp|" + z10 + "|" + strB, new Object[0]);
        }
        return true;
    }
}
