package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.is;
import com.xiaomi.push.service.az;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class f implements AbstractPushManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f106787a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f150a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private PushConfiguration f151a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f153a = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Map<e, AbstractPushManager> f152a = new HashMap();

    private f(Context context) {
        this.f150a = context.getApplicationContext();
    }

    public static f a(Context context) {
        if (f106787a == null) {
            synchronized (f.class) {
                if (f106787a == null) {
                    f106787a = new f(context);
                }
            }
        }
        return f106787a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x019b  */
    private void a() {
        e eVar;
        AbstractPushManager abstractPushManagerA;
        e eVar2;
        AbstractPushManager abstractPushManagerA2;
        e eVar3;
        AbstractPushManager abstractPushManagerA3;
        AbstractPushManager abstractPushManagerA4;
        PushConfiguration pushConfiguration = this.f151a;
        if (pushConfiguration != null) {
            if (pushConfiguration.getOpenHmsPush()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ASSEMBLE_PUSH : ");
                sb2.append(" HW user switch : " + this.f151a.getOpenHmsPush() + " HW online switch : " + i.m135a(this.f150a, e.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + n.m139a(this.f150a));
                com.xiaomi.channel.commonutils.logger.b.m62a(sb2.toString());
            }
            if (this.f151a.getOpenHmsPush()) {
                Context context = this.f150a;
                e eVar4 = e.ASSEMBLE_PUSH_HUAWEI;
                if (i.m135a(context, eVar4) && n.m139a(this.f150a)) {
                    if (!m129a(eVar4)) {
                        a(eVar4, ak.a(this.f150a, eVar4));
                    }
                    com.xiaomi.channel.commonutils.logger.b.c("hw manager add to list");
                } else {
                    eVar = e.ASSEMBLE_PUSH_HUAWEI;
                    if (m129a(eVar) && (abstractPushManagerA = a(eVar)) != null) {
                        m128a(eVar);
                        abstractPushManagerA.unregister();
                    }
                }
            } else {
                eVar = e.ASSEMBLE_PUSH_HUAWEI;
                if (m129a(eVar)) {
                    m128a(eVar);
                    abstractPushManagerA.unregister();
                }
            }
            if (this.f151a.getOpenFCMPush()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ASSEMBLE_PUSH : ");
                sb3.append(" FCM user switch : " + this.f151a.getOpenFCMPush() + " FCM online switch : " + i.m135a(this.f150a, e.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + n.b(this.f150a));
                com.xiaomi.channel.commonutils.logger.b.m62a(sb3.toString());
            }
            if (this.f151a.getOpenFCMPush()) {
                Context context2 = this.f150a;
                e eVar5 = e.ASSEMBLE_PUSH_FCM;
                if (i.m135a(context2, eVar5) && n.b(this.f150a)) {
                    if (!m129a(eVar5)) {
                        a(eVar5, ak.a(this.f150a, eVar5));
                    }
                    com.xiaomi.channel.commonutils.logger.b.c("fcm manager add to list");
                } else {
                    eVar2 = e.ASSEMBLE_PUSH_FCM;
                    if (m129a(eVar2) && (abstractPushManagerA2 = a(eVar2)) != null) {
                        m128a(eVar2);
                        abstractPushManagerA2.unregister();
                    }
                }
            } else {
                eVar2 = e.ASSEMBLE_PUSH_FCM;
                if (m129a(eVar2)) {
                    m128a(eVar2);
                    abstractPushManagerA2.unregister();
                }
            }
            if (this.f151a.getOpenCOSPush()) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("ASSEMBLE_PUSH : ");
                sb4.append(" COS user switch : " + this.f151a.getOpenCOSPush() + " COS online switch : " + i.m135a(this.f150a, e.ASSEMBLE_PUSH_COS) + " COS isSupport : " + n.c(this.f150a));
                com.xiaomi.channel.commonutils.logger.b.m62a(sb4.toString());
            }
            if (this.f151a.getOpenCOSPush()) {
                Context context3 = this.f150a;
                e eVar6 = e.ASSEMBLE_PUSH_COS;
                if (i.m135a(context3, eVar6) && n.c(this.f150a)) {
                    a(eVar6, ak.a(this.f150a, eVar6));
                } else {
                    eVar3 = e.ASSEMBLE_PUSH_COS;
                    if (m129a(eVar3) && (abstractPushManagerA3 = a(eVar3)) != null) {
                        m128a(eVar3);
                        abstractPushManagerA3.unregister();
                    }
                }
            } else {
                eVar3 = e.ASSEMBLE_PUSH_COS;
                if (m129a(eVar3)) {
                    m128a(eVar3);
                    abstractPushManagerA3.unregister();
                }
            }
            if (this.f151a.getOpenFTOSPush()) {
                Context context4 = this.f150a;
                e eVar7 = e.ASSEMBLE_PUSH_FTOS;
                if (i.m135a(context4, eVar7) && n.d(this.f150a)) {
                    a(eVar7, ak.a(this.f150a, eVar7));
                    return;
                }
            }
            e eVar8 = e.ASSEMBLE_PUSH_FTOS;
            if (!m129a(eVar8) || (abstractPushManagerA4 = a(eVar8)) == null) {
                return;
            }
            m128a(eVar8);
            abstractPushManagerA4.unregister();
        }
    }

    public AbstractPushManager a(e eVar) {
        return this.f152a.get(eVar);
    }

    public void a(PushConfiguration pushConfiguration) {
        this.f151a = pushConfiguration;
        this.f153a = az.a(this.f150a).a(is.AggregatePushSwitch.a(), true);
        if (this.f151a.getOpenHmsPush() || this.f151a.getOpenFCMPush() || this.f151a.getOpenCOSPush() || this.f151a.getOpenFTOSPush()) {
            az.a(this.f150a).a(new g(this, 101, "assemblePush"));
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m128a(e eVar) {
        this.f152a.remove(eVar);
    }

    public void a(e eVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f152a.containsKey(eVar)) {
                this.f152a.remove(eVar);
            }
            this.f152a.put(eVar, abstractPushManager);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m129a(e eVar) {
        return this.f152a.containsKey(eVar);
    }

    public boolean b(e eVar) {
        int i10 = h.f106789a[eVar.ordinal()];
        boolean openCOSPush = false;
        if (i10 == 1) {
            PushConfiguration pushConfiguration = this.f151a;
            if (pushConfiguration != null) {
                return pushConfiguration.getOpenHmsPush();
            }
            return false;
        }
        if (i10 == 2) {
            PushConfiguration pushConfiguration2 = this.f151a;
            if (pushConfiguration2 != null) {
                return pushConfiguration2.getOpenFCMPush();
            }
            return false;
        }
        if (i10 == 3) {
            PushConfiguration pushConfiguration3 = this.f151a;
            if (pushConfiguration3 != null) {
                openCOSPush = pushConfiguration3.getOpenCOSPush();
            }
        } else if (i10 != 4) {
            return false;
        }
        PushConfiguration pushConfiguration4 = this.f151a;
        return pushConfiguration4 != null ? pushConfiguration4.getOpenFTOSPush() : openCOSPush;
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void register() {
        com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : assemble push register");
        if (this.f152a.size() <= 0) {
            a();
        }
        if (this.f152a.size() > 0) {
            for (AbstractPushManager abstractPushManager : this.f152a.values()) {
                if (abstractPushManager != null) {
                    abstractPushManager.register();
                }
            }
            i.m131a(this.f150a);
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void unregister() {
        com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager abstractPushManager : this.f152a.values()) {
            if (abstractPushManager != null) {
                abstractPushManager.unregister();
            }
        }
        this.f152a.clear();
    }
}
