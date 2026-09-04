package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.push.in;
import com.xiaomi.push.ir;
import com.xiaomi.push.ja;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.ca;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile a f106736a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private Context f105a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private Boolean f107a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f108a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private C1063a f106a = new C1063a();

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private final ArrayList<ir> f109a = new ArrayList<>();

        /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a, reason: collision with other inner class name */
        public class C1063a {

            /* JADX INFO: renamed from: a, reason: collision with other field name */
            private ScheduledFuture<?> f112a;

            /* JADX INFO: renamed from: a, reason: collision with other field name */
            private ScheduledThreadPoolExecutor f113a = new ScheduledThreadPoolExecutor(1);

            /* JADX INFO: renamed from: a, reason: collision with other field name */
            public final ArrayList<ir> f111a = new ArrayList<>();

            /* JADX INFO: renamed from: a, reason: collision with other field name */
            private final Runnable f110a = new ab(this);

            public C1063a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a() {
                if (this.f112a == null) {
                    this.f112a = this.f113a.scheduleAtFixedRate(this.f110a, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b() {
                ir irVarRemove = this.f111a.remove(0);
                for (jm jmVar : ca.a(Arrays.asList(irVarRemove), a.this.f105a.getPackageName(), b.m111a(a.this.f105a).m112a(), 30720)) {
                    com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + irVarRemove.d());
                    ao.a(a.this.f105a).a(jmVar, in.Notification, true, (ja) null);
                }
            }

            public void a(ir irVar) {
                this.f113a.execute(new aa(this, irVar));
            }
        }

        public static a a() {
            if (f106736a == null) {
                synchronized (a.class) {
                    if (f106736a == null) {
                        f106736a = new a();
                    }
                }
            }
            return f106736a;
        }

        private void a(ir irVar) {
            synchronized (this.f109a) {
                if (!this.f109a.contains(irVar)) {
                    this.f109a.add(irVar);
                    if (this.f109a.size() > 100) {
                        this.f109a.remove(0);
                    }
                }
            }
        }

        private boolean a(Context context) {
            if (!ao.a(context).m104a()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                return packageInfo != null && packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        private boolean b(Context context) {
            return b.m111a(context).m112a() == null && !a(this.f105a);
        }

        private boolean b(ir irVar) {
            if (ca.a(irVar, false)) {
                return false;
            }
            if (!this.f107a.booleanValue()) {
                this.f106a.a(irVar);
                return true;
            }
            com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + irVar.d());
            ao.a(this.f105a).a(irVar);
            return true;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public void m82a(Context context) {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.b.m62a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f105a = context;
            this.f107a = Boolean.valueOf(a(context));
            b(MiTinyDataClient.PENDING_REASON_INIT);
        }

        public synchronized void a(String str) {
            if (TextUtils.isEmpty(str)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
            } else {
                this.f108a = str;
                b(MiTinyDataClient.PENDING_REASON_CHANNEL);
            }
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m83a() {
            return this.f105a != null;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public synchronized boolean m84a(ir irVar) {
            if (irVar == null) {
                return false;
            }
            if (ca.a(irVar, true)) {
                return false;
            }
            boolean z10 = TextUtils.isEmpty(irVar.m487a()) && TextUtils.isEmpty(this.f108a);
            boolean z11 = !m83a();
            Context context = this.f105a;
            boolean z12 = context == null || b(context);
            if (!z11 && !z10 && !z12) {
                com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Send item immediately." + irVar.d());
                if (TextUtils.isEmpty(irVar.d())) {
                    irVar.f(bc.a());
                }
                if (TextUtils.isEmpty(irVar.m487a())) {
                    irVar.a(this.f108a);
                }
                if (TextUtils.isEmpty(irVar.c())) {
                    irVar.e(this.f105a.getPackageName());
                }
                if (irVar.a() <= 0) {
                    irVar.b(System.currentTimeMillis());
                }
                return b(irVar);
            }
            if (z10) {
                com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Pending " + irVar.b() + " reason is " + MiTinyDataClient.PENDING_REASON_CHANNEL);
            } else if (z11) {
                com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Pending " + irVar.b() + " reason is " + MiTinyDataClient.PENDING_REASON_INIT);
            } else if (z12) {
                com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Pending " + irVar.b() + " reason is " + MiTinyDataClient.PENDING_REASON_APPID);
            }
            a(irVar);
            return true;
        }

        public void b(String str) {
            com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.f109a) {
                arrayList.addAll(this.f109a);
                this.f109a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m84a((ir) it.next());
            }
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        a.a().m82a(context);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            a.a().a(str);
        }
    }

    public static boolean upload(Context context, ir irVar) {
        com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient.upload " + irVar.d());
        if (!a.a().m83a()) {
            a.a().m82a(context);
        }
        return a.a().m84a(irVar);
    }

    public static boolean upload(Context context, String str, String str2, long j10, String str3) {
        ir irVar = new ir();
        irVar.d(str);
        irVar.c(str2);
        irVar.a(j10);
        irVar.b(str3);
        irVar.a(true);
        irVar.a("push_sdk_channel");
        return upload(context, irVar);
    }

    public static boolean upload(String str, String str2, long j10, String str3) {
        ir irVar = new ir();
        irVar.d(str);
        irVar.c(str2);
        irVar.a(j10);
        irVar.b(str3);
        return a.a().m84a(irVar);
    }
}
