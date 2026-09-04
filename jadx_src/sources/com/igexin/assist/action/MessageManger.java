package com.igexin.assist.action;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.igexin.a.a.c.a.f;
import com.igexin.assist.MessageBean;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.assist.util.AssistUtils;
import com.igexin.push.core.CoreConsts;
import com.igexin.push.core.a.e;
import com.igexin.push.core.b.i;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.r;
import com.igexin.push.util.o;
import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.message.GTTransmitMessage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MessageManger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f63286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f63288c;

    private MessageManger() {
        this.f63286a = Executors.newSingleThreadExecutor();
    }

    /* synthetic */ MessageManger(a aVar) {
        this();
    }

    private PushTaskBean a(d dVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        PushTaskBean pushTaskBean = new PushTaskBean();
        pushTaskBean.setAppid(dVar.d());
        pushTaskBean.setMessageId(dVar.c());
        pushTaskBean.setTaskId(dVar.b());
        pushTaskBean.setId(String.valueOf(jCurrentTimeMillis));
        pushTaskBean.setCurrentActionid(1);
        return pushTaskBean;
    }

    private Class a(Context context) {
        try {
            String str = (String) o.c(context, "uis", "", new String[0]);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, d dVar) {
        if (!com.igexin.push.core.d.f63672f.get()) {
            AssistUtils.startGetuiService(context);
        }
        if (dVar == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = CoreConsts.f63462l;
        messageObtain.obj = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putString("content", dVar.g());
        if (dVar.a() != null) {
            bundle.putByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD, dVar.a());
        }
        messageObtain.setData(bundle);
        com.igexin.push.core.c.a().a(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new com.igexin.push.core.b.d(context).c(str);
        if (com.igexin.push.core.d.f63672f.get()) {
            a(str, z10);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new a(this, str, z10), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, Context context) {
        StringBuilder sb2;
        if (dVar == null || context == null) {
            return;
        }
        try {
            com.igexin.push.core.b.d dVar2 = new com.igexin.push.core.b.d(context);
            if (dVar2.a(dVar.b())) {
                sb2 = new StringBuilder();
                sb2.append(getBrandCode(context));
                sb2.append("1");
            } else {
                dVar2.b(dVar.b());
                if (this.f63288c == null) {
                    Class clsA = a(context);
                    this.f63288c = clsA;
                    if (clsA == null) {
                        this.f63288c = (Class) com.igexin.push.util.b.a(context, GTIntentService.class).second;
                    }
                }
                if (this.f63288c != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("action", 10001);
                    bundle.putSerializable(PushConsts.KEY_MESSAGE_DATA, new GTTransmitMessage(dVar.b(), dVar.c(), dVar.c() + ":" + dVar.b(), dVar.a()));
                    r.a().a(bundle);
                } else {
                    Intent intent = new Intent();
                    intent.addFlags(32);
                    intent.setAction("com.igexin.sdk.action." + dVar.d());
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("action", 10001);
                    bundle2.putString("taskid", dVar.b());
                    bundle2.putString("messageid", dVar.c());
                    bundle2.putString("appid", dVar.d());
                    bundle2.putString("payloadid", dVar.c() + ":" + dVar.b());
                    bundle2.putString("packagename", dVar.f());
                    bundle2.putByteArray(AssistPushConsts.MSG_TYPE_PAYLOAD, dVar.a());
                    intent.putExtras(bundle2);
                    context.sendBroadcast(intent, com.igexin.push.core.d.az);
                }
                sb2 = new StringBuilder();
                sb2.append(getBrandCode(context));
                sb2.append("0");
            }
            feedbackPushMessage(context, dVar, sb2.toString());
        } catch (Throwable unused) {
        }
    }

    private void a(String str) {
        try {
            r.a().a(str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:4:0x001b, B:6:0x0023, B:8:0x002e, B:10:0x0038), top: B:14:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0023 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:4:0x001b, B:6:0x0023, B:8:0x002e, B:10:0x0038), top: B:14:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:8:0x002e A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:4:0x001b, B:6:0x0023, B:8:0x002e, B:10:0x0038), top: B:14:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[DONT_INVERT] */
    public void a(String str, boolean z10) {
        Log.e("Assist_MessageManger", "other token = " + str);
        a(str);
        if (z10) {
            i.a().c(str);
            if (com.igexin.push.core.d.f63678l) {
                e.a().e();
            } else if (z10) {
                i.a().d("");
            }
        } else {
            try {
                if (!str.equals(com.igexin.push.core.d.f63692z)) {
                    i.a().c(str);
                    if (com.igexin.push.core.d.f63678l) {
                        e.a().e();
                    } else if (z10) {
                        i.a().d("");
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static MessageManger getInstance() {
        return c.f63294a;
    }

    public void addMessage(MessageBean messageBean) {
        ExecutorService executorService = this.f63286a;
        if (executorService != null) {
            executorService.execute(new b(this, messageBean));
        }
    }

    public void feedbackPushMessage(Context context, d dVar, String str) {
        try {
            if (com.igexin.push.core.d.f63672f.get()) {
                e.a().a(a(dVar), str);
            } else {
                com.igexin.push.core.b.d dVar2 = new com.igexin.push.core.b.d(context);
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", String.valueOf(jCurrentTimeMillis));
                jSONObject.put("messageid", dVar.c());
                jSONObject.put("taskid", dVar.b());
                jSONObject.put("multaid", str);
                jSONObject.put("timestamp", String.valueOf(System.currentTimeMillis()));
                dVar2.a(dVar.b(), jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public String getBrandCode(Context context) {
        String str;
        if (!TextUtils.isEmpty(this.f63287b)) {
            return this.f63287b;
        }
        if (com.igexin.assist.sdk.a.e(context)) {
            str = "2";
        } else if (com.igexin.assist.sdk.a.b(context)) {
            str = "3";
        } else if (com.igexin.assist.sdk.a.c(context)) {
            str = "4";
        } else if (com.igexin.assist.sdk.a.f(context)) {
            str = "5";
        } else {
            if (!com.igexin.assist.sdk.a.g(context)) {
                if (com.igexin.assist.sdk.a.h(context)) {
                    str = "7";
                }
                return this.f63287b;
            }
            str = "6";
        }
        this.f63287b = str;
        return this.f63287b;
    }

    public void log(String str) {
        f.a().a(str);
    }
}
