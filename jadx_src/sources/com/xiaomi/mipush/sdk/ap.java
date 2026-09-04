package com.xiaomi.mipush.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ap extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f106762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(ao aoVar, Looper looper) {
        super(looper);
        this.f106762a = aoVar;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        if (message.what != 19) {
            return;
        }
        String str = (String) message.obj;
        int i10 = message.arg1;
        synchronized (af.class) {
            if (af.a(this.f106762a.f127a).m89a(str)) {
                if (af.a(this.f106762a.f127a).a(str) < 10) {
                    String string = message.getData() != null ? message.getData().getString("third_sync_reason") : "";
                    au auVar = au.DISABLE_PUSH;
                    if (auVar.ordinal() == i10 && "syncing".equals(af.a(this.f106762a.f127a).a(auVar))) {
                        this.f106762a.a(str, auVar, true, (HashMap<String, String>) null);
                    } else {
                        au auVar2 = au.ENABLE_PUSH;
                        if (auVar2.ordinal() == i10 && "syncing".equals(af.a(this.f106762a.f127a).a(auVar2))) {
                            this.f106762a.a(str, auVar2, true, (HashMap<String, String>) null);
                        } else {
                            au auVar3 = au.UPLOAD_HUAWEI_TOKEN;
                            if (auVar3.ordinal() == i10 && "syncing".equals(af.a(this.f106762a.f127a).a(auVar3))) {
                                HashMap<String, String> mapM130a = i.m130a(this.f106762a.f127a, e.ASSEMBLE_PUSH_HUAWEI);
                                mapM130a.put("third_sync_reason", string);
                                this.f106762a.a(str, auVar3, false, (HashMap<String, String>) mapM130a);
                            } else {
                                au auVar4 = au.UPLOAD_FCM_TOKEN;
                                if (auVar4.ordinal() == i10 && "syncing".equals(af.a(this.f106762a.f127a).a(auVar4))) {
                                    ao aoVar = this.f106762a;
                                    aoVar.a(str, auVar4, false, (HashMap<String, String>) i.m130a(aoVar.f127a, e.ASSEMBLE_PUSH_FCM));
                                } else {
                                    au auVar5 = au.UPLOAD_COS_TOKEN;
                                    if (auVar5.ordinal() == i10 && "syncing".equals(af.a(this.f106762a.f127a).a(auVar5))) {
                                        HashMap<String, String> mapM130a2 = i.m130a(this.f106762a.f127a, e.ASSEMBLE_PUSH_COS);
                                        mapM130a2.put("third_sync_reason", string);
                                        this.f106762a.a(str, auVar5, false, (HashMap<String, String>) mapM130a2);
                                    } else {
                                        au auVar6 = au.UPLOAD_FTOS_TOKEN;
                                        if (auVar6.ordinal() == i10 && "syncing".equals(af.a(this.f106762a.f127a).a(auVar6))) {
                                            HashMap<String, String> mapM130a3 = i.m130a(this.f106762a.f127a, e.ASSEMBLE_PUSH_FTOS);
                                            mapM130a3.put("third_sync_reason", string);
                                            this.f106762a.a(str, auVar6, false, (HashMap<String, String>) mapM130a3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    af.a(this.f106762a.f127a).b(str);
                } else {
                    af.a(this.f106762a.f127a).c(str);
                }
            }
        }
    }
}
