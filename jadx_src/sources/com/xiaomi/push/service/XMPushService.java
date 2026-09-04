package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.dd;
import com.xiaomi.push.dm;
import com.xiaomi.push.dv;
import com.xiaomi.push.ed;
import com.xiaomi.push.ef;
import com.xiaomi.push.fd;
import com.xiaomi.push.fn;
import com.xiaomi.push.fo;
import com.xiaomi.push.fu;
import com.xiaomi.push.gc;
import com.xiaomi.push.gm;
import com.xiaomi.push.go;
import com.xiaomi.push.gq;
import com.xiaomi.push.gx;
import com.xiaomi.push.hb;
import com.xiaomi.push.hc;
import com.xiaomi.push.he;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hm;
import com.xiaomi.push.hq;
import com.xiaomi.push.hr;
import com.xiaomi.push.hs;
import com.xiaomi.push.hu;
import com.xiaomi.push.ig;
import com.xiaomi.push.ii;
import com.xiaomi.push.il;
import com.xiaomi.push.in;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.jx;
import com.xiaomi.push.kd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class XMPushService extends Service implements he {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f107833b = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ContentObserver f955a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gx f957a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private hb f958a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private hc f959a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f961a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private f f962a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private k f963a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private r f964a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private t f965a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private bp f967a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.k f968a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Object f971a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f974a = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107834a = 0;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int f975b = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f954a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected Class f970a = XMJobService.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107835c = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private bd f966a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.q f969a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    Messenger f956a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Collection<aq> f973a = Collections.synchronizedCollection(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ArrayList<n> f972a = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private hg f960a = new cj(this);

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private final Object f976a;

        private a() {
            this.f976a = new Object();
        }

        /* synthetic */ a(XMPushService xMPushService, cj cjVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f976a) {
                try {
                    this.f976a.notifyAll();
                } catch (Exception e10) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("[Alarm] notify lock. " + e10);
                }
            }
        }

        private void a(long j10) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f976a) {
                try {
                    this.f976a.wait(j10);
                } catch (InterruptedException e10) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("[Alarm] interrupt from waiting state. " + e10);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.xiaomi.channel.commonutils.logger.b.c("[Alarm] heartbeat alarm has been triggered.");
            if (!bj.f107947q.equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.b.m62a("[Alarm] cancel the old ping timer");
                fu.a();
                return;
            }
            if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    a(3000L);
                    com.xiaomi.channel.commonutils.logger.b.m62a("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        bf.b f977a;

        public b(bf.b bVar) {
            super(9);
            this.f977a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "bind the client. " + this.f977a.f107917g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            try {
                if (XMPushService.this.m687c()) {
                    bf bfVarA = bf.a();
                    bf.b bVar = this.f977a;
                    bf.b bVarA = bfVarA.a(bVar.f107917g, bVar.f1046b);
                    if (bVarA == null) {
                        com.xiaomi.channel.commonutils.logger.b.m62a("ignore bind because the channel " + this.f977a.f107917g + " is removed ");
                    } else if (bVarA.f1041a == bf.c.unbind) {
                        bVarA.a(bf.c.binding, 0, 0, (String) null, (String) null);
                        XMPushService.this.f958a.a(bVarA);
                        go.a(XMPushService.this, bVarA);
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m62a("trying duplicate bind, ingore! " + bVarA.f1041a);
                    }
                } else {
                    com.xiaomi.channel.commonutils.logger.b.d("trying bind while the connection is not created, quit!");
                }
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d("Meet error when trying to bind. " + e10);
                XMPushService.this.a(10, e10);
            } catch (Throwable unused) {
            }
        }
    }

    public static class c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final bf.b f107838a;

        public c(bf.b bVar) {
            super(12);
            this.f107838a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "bind time out. chid=" + this.f107838a.f107917g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            this.f107838a.a(bf.c.unbind, 1, 21, (String) null, (String) null);
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return TextUtils.equals(((c) obj).f107838a.f107917g, this.f107838a.f107917g);
            }
            return false;
        }

        public int hashCode() {
            return this.f107838a.f107917g.hashCode();
        }
    }

    public class d extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private gq f107839a;

        public d(gq gqVar) {
            super(8);
            this.f107839a = gqVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            XMPushService.this.f966a.a(this.f107839a);
            if (com.xiaomi.push.service.e.a(this.f107839a)) {
                XMPushService.this.a(new bq.a(), 15000L);
            }
        }
    }

    public class e extends j {
        e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "do reconnect..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            if (XMPushService.this.m682a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("should not connect. quit the job.");
        }
    }

    public class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.push.bg.m178a();
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class g extends j {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public Exception f979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f107843b;

        g(int i10, Exception exc) {
            super(2);
            this.f107843b = i10;
            this.f979a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            XMPushService.this.a(this.f107843b, this.f979a);
        }
    }

    public class h extends j {
        h() {
            super(65535);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "Init Job";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            XMPushService.this.c();
        }
    }

    public class i extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Intent f107845a;

        public i(Intent intent) {
            super(15);
            this.f107845a = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "Handle intent action = " + this.f107845a.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            XMPushService.this.d(this.f107845a);
        }
    }

    public static abstract class j extends com.xiaomi.push.service.q.b {
        public j(int i10) {
            super(i10);
        }

        public abstract String a();

        /* JADX INFO: renamed from: a */
        public abstract void mo404a();

        @Override // java.lang.Runnable
        public void run() {
            int i10 = this.f108022a;
            if (i10 != 4 && i10 != 8) {
                com.xiaomi.channel.commonutils.logger.b.m63a(com.xiaomi.channel.commonutils.logger.a.f106712a, a());
            }
            mo404a();
        }
    }

    public class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.b.m62a("[HB] hold short heartbeat, " + com.xiaomi.push.j.a(intent));
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class l extends j {
        public l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            XMPushService.this.f969a.m762a();
        }
    }

    public class m extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private hs f107848a;

        public m(hs hsVar) {
            super(8);
            this.f107848a = hsVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            XMPushService.this.f966a.a(this.f107848a);
        }
    }

    public interface n {
        /* JADX INFO: renamed from: a */
        void mo482a();
    }

    public class o extends j {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        boolean f982a;

        public o(boolean z10) {
            super(4);
            this.f982a = z10;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            if (XMPushService.this.m687c()) {
                try {
                    if (!this.f982a) {
                        go.a();
                    }
                    XMPushService.this.f958a.b(this.f982a);
                } catch (hm e10) {
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                    XMPushService.this.a(10, e10);
                }
            }
        }
    }

    public class p extends j {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        bf.b f983a;

        public p(bf.b bVar) {
            super(4);
            this.f983a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "rebind the client. " + this.f983a.f107917g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            try {
                this.f983a.a(bf.c.unbind, 1, 16, (String) null, (String) null);
                hb hbVar = XMPushService.this.f958a;
                bf.b bVar = this.f983a;
                hbVar.a(bVar.f107917g, bVar.f1046b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.a(xMPushService.new b(this.f983a), 300L);
            } catch (hm e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
                XMPushService.this.a(10, e10);
            }
        }
    }

    public class q extends j {
        q() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "reset the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.m682a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                }
            }
        }
    }

    public class r extends BroadcastReceiver {
        r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class s extends j {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        bf.b f984a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        String f985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f107854b;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        String f986b;

        public s(bf.b bVar, int i10, String str, String str2) {
            super(9);
            this.f984a = bVar;
            this.f107854b = i10;
            this.f985a = str;
            this.f986b = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "unbind the channel. " + this.f984a.f107917g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo404a() {
            if (this.f984a.f1041a != bf.c.unbind && XMPushService.this.f958a != null) {
                try {
                    hb hbVar = XMPushService.this.f958a;
                    bf.b bVar = this.f984a;
                    hbVar.a(bVar.f107917g, bVar.f1046b);
                } catch (hm e10) {
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                    XMPushService.this.a(10, e10);
                }
            }
            this.f984a.a(bf.c.unbind, this.f107854b, 0, this.f986b, this.f985a);
        }
    }

    public class t extends BroadcastReceiver {
        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f974a) {
                XMPushService.this.f974a = true;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    private hs a(hs hsVar, String str, String str2) {
        bf bfVarA = bf.a();
        List<String> listM727a = bfVarA.m727a(str);
        if (listM727a.isEmpty()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("open channel should be called first before sending a packet, pkg=" + str);
            return null;
        }
        hsVar.o(str);
        String strK = hsVar.k();
        if (TextUtils.isEmpty(strK)) {
            strK = listM727a.get(0);
            hsVar.l(strK);
        }
        bf.b bVarA = bfVarA.a(strK, hsVar.m());
        if (!m687c()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("drop a packet as the channel is not connected, chid=" + strK);
            return null;
        }
        if (bVarA == null || bVarA.f1041a != bf.c.binded) {
            com.xiaomi.channel.commonutils.logger.b.m62a("drop a packet as the channel is not opened, chid=" + strK);
            return null;
        }
        if (TextUtils.equals(str2, bVarA.f107919i)) {
            return hsVar;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("invalid session. " + str2);
        return null;
    }

    private bf.b a(String str, Intent intent) {
        bf.b bVarA = bf.a().a(str, intent.getStringExtra(bj.f107949s));
        if (bVarA == null) {
            bVarA = new bf.b(this);
        }
        bVarA.f107917g = intent.getStringExtra(bj.f107952v);
        bVarA.f1046b = intent.getStringExtra(bj.f107949s);
        bVarA.f107913c = intent.getStringExtra(bj.f107956z);
        bVarA.f1043a = intent.getStringExtra(bj.F);
        bVarA.f107915e = intent.getStringExtra(bj.D);
        bVarA.f107916f = intent.getStringExtra(bj.E);
        bVarA.f1045a = intent.getBooleanExtra(bj.C, false);
        bVarA.f107918h = intent.getStringExtra(bj.B);
        bVarA.f107919i = intent.getStringExtra(bj.J);
        bVarA.f107914d = intent.getStringExtra(bj.A);
        bVarA.f1042a = this.f968a;
        bVarA.a((Messenger) intent.getParcelableExtra(bj.N));
        bVarA.f1035a = getApplicationContext();
        bf.a().a(bVarA);
        return bVarA;
    }

    private String a() {
        String strM518a = com.xiaomi.push.j.m518a("ro.miui.region");
        return TextUtils.isEmpty(strM518a) ? com.xiaomi.push.j.m518a("ro.product.locale.region") : strM518a;
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
            }
        }
    }

    private void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("digest");
        com.xiaomi.push.service.p.a(getApplicationContext()).m757a(string);
        dm.a(this, string);
    }

    private void a(Intent intent, int i10) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        jm jmVar = new jm();
        try {
            jx.a(jmVar, byteArrayExtra);
            com.xiaomi.push.ah.a(getApplicationContext()).a((com.xiaomi.push.ah.a) new com.xiaomi.push.service.b(jmVar, new WeakReference(this), booleanExtra), i10);
        } catch (kd unused) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_ping : send help app ping  error");
        }
    }

    private static void a(String str) {
        if (com.xiaomi.push.m.China.name().equals(str)) {
            dd.a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            dd.a("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            dd.a("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            dd.a("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            dd.a("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            dd.a("resolver.msg.xiaomi.net", "111.13.142.153:443");
            dd.a("resolver.msg.xiaomi.net", "111.202.1.252:443");
        }
    }

    private void a(String str, int i10) {
        Collection<bf.b> collectionM726a = bf.a().m726a(str);
        if (collectionM726a != null) {
            for (bf.b bVar : collectionM726a) {
                if (bVar != null) {
                    a(new s(bVar, i10, null, null));
                }
            }
        }
        bf.a().m729a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            com.xiaomi.push.an.a();
            for (int i10 = 100; i10 > 0; i10--) {
                if (com.xiaomi.push.bg.c(context)) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m670a(String str, Intent intent) {
        bf.b bVarA = bf.a().a(str, intent.getStringExtra(bj.f107949s));
        boolean z10 = false;
        if (bVarA != null && str != null) {
            String stringExtra = intent.getStringExtra(bj.J);
            String stringExtra2 = intent.getStringExtra(bj.B);
            if (!TextUtils.isEmpty(bVarA.f107919i) && !TextUtils.equals(stringExtra, bVarA.f107919i)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("session changed. old session=" + bVarA.f107919i + ", new session=" + stringExtra + " chid = " + str);
                z10 = true;
            }
            if (!stringExtra2.equals(bVarA.f107918h)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("security changed. chid = " + str + " sechash = " + com.xiaomi.push.bo.a(stringExtra2));
                return true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private int[] m671a() {
        String[] strArrSplit;
        String strA = az.a(getApplicationContext()).a(is.FallDownTimeRange.a(), "");
        if (!TextUtils.isEmpty(strA) && (strArrSplit = strA.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null && strArrSplit.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(strArrSplit[0]).intValue();
                int iIntValue = Integer.valueOf(strArrSplit[1]).intValue();
                iArr[1] = iIntValue;
                int i10 = iArr[0];
                if (i10 >= 0 && i10 <= 23 && iIntValue >= 0 && iIntValue <= 23 && i10 != iIntValue) {
                    return iArr;
                }
            } catch (NumberFormatException e10) {
                com.xiaomi.channel.commonutils.logger.b.d("parse falldown time range failure: " + e10);
            }
        }
        return null;
    }

    private String b() {
        String strA;
        com.xiaomi.push.an.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i10 = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            bm bmVarA = bm.a(this);
            String strA2 = null;
            while (true) {
                if (!TextUtils.isEmpty(strA2) && bmVarA.a() != 0) {
                    strA = a();
                    break;
                }
                if (TextUtils.isEmpty(strA2)) {
                    strA2 = a();
                }
                try {
                    synchronized (obj) {
                        if (i10 < 30) {
                            try {
                                obj.wait(1000L);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } else {
                            obj.wait(30000L);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i10++;
            }
        } else {
            strA = com.huawei.hms.feature.dynamic.f.e.f60734e;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("wait coutrycode :" + strA + " cost = " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " , count = " + i10);
        return strA;
    }

    private void b(Intent intent) {
        long j10;
        String stringExtra = intent.getStringExtra(bj.F);
        String stringExtra2 = intent.getStringExtra(bj.J);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        bf bfVarA = bf.a();
        gq gqVarA = null;
        if (bundleExtra != null) {
            hr hrVar = (hr) a(new hr(bundleExtra), stringExtra, stringExtra2);
            if (hrVar == null) {
                return;
            } else {
                gqVarA = gq.a(hrVar, bfVarA.a(hrVar.k(), hrVar.m()).f107918h);
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j10 = Long.parseLong(intent.getStringExtra(bj.f107949s));
                } catch (NumberFormatException unused) {
                    j10 = 0;
                }
                String stringExtra3 = intent.getStringExtra(bj.f107950t);
                String stringExtra4 = intent.getStringExtra(bj.f107951u);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                bf.b bVarA = bfVarA.a(stringExtra5, String.valueOf(j10));
                if (bVarA != null) {
                    gq gqVar = new gq();
                    try {
                        gqVar.a(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    gqVar.a("SECMSG", (String) null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    gqVar.a(j10, stringExtra3, stringExtra4);
                    gqVar.a(intent.getStringExtra("ext_pkt_id"));
                    gqVar.a(byteArrayExtra, bVarA.f107918h);
                    com.xiaomi.channel.commonutils.logger.b.m62a("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    gqVarA = gqVar;
                }
            }
        }
        if (gqVarA != null) {
            c(new bu(this, gqVarA));
        }
    }

    private void b(boolean z10) {
        this.f954a = SystemClock.elapsedRealtime();
        if (!m687c()) {
            a(true);
        } else if (com.xiaomi.push.bg.b(this)) {
            c(new o(z10));
        } else {
            c(new g(17, null));
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df A[Catch: Exception -> 0x00e5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e5, blocks: (B:26:0x00d9, B:28:0x00df), top: B:36:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public void c() {
        String str;
        dd.a().m249d();
        com.xiaomi.push.service.p.a(getApplicationContext()).m756a();
        com.xiaomi.push.service.a aVarA = com.xiaomi.push.service.a.a(getApplicationContext());
        String strA = aVarA.a();
        com.xiaomi.channel.commonutils.logger.b.m63a("XMPushService", "region of cache is " + strA);
        String strName = "";
        if (TextUtils.isEmpty(strA)) {
            String strB = b();
            str = strB;
            strA = com.xiaomi.push.j.a(strB).name();
        } else {
            str = "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(strA);
        String str2 = com.huawei.hms.feature.dynamic.f.e.f60734e;
        try {
            if (zIsEmpty || !com.xiaomi.push.m.China.name().equals(strA)) {
                if (TextUtils.isEmpty(strA)) {
                    strA = com.xiaomi.push.m.China.name();
                } else {
                    if ("com.xiaomi.xmsf".equals(getPackageName())) {
                        str2 = "";
                    } else {
                        strName = com.xiaomi.push.m.China.name();
                    }
                    aVarA.a(strName, true);
                    aVarA.b(str2, true);
                    strA = strName;
                }
                com.xiaomi.channel.commonutils.logger.b.m64a("XMPushService", "after check, appRegion is ", strA, ", countryCode=", str);
                if (com.xiaomi.push.m.China.name().equals(strA)) {
                    hc.a("cn.app.chat.xiaomi.net");
                }
                a(strA);
                if (m676h()) {
                    com.xiaomi.channel.commonutils.logger.b.m63a("XMPushService", "-->postOnCreate(): try trigger connect now");
                    cv cvVar = new cv(this, 11);
                    a(cvVar);
                    v.a(new cw(this, cvVar));
                }
                if (C1339r.m657a()) {
                    this.f968a.a(this);
                }
                if ("com.xiaomi.xmsf".equals(getPackageName())) {
                    com.xiaomi.push.g.a((Context) this, getApplicationInfo(), true);
                }
            }
            aVarA.a(strA, true);
            aVarA.b(com.huawei.hms.feature.dynamic.f.e.f60734e, true);
            if (C1339r.m657a()) {
                this.f968a.a(this);
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
        str = str2;
        com.xiaomi.channel.commonutils.logger.b.m64a("XMPushService", "after check, appRegion is ", strA, ", countryCode=", str);
        if (com.xiaomi.push.m.China.name().equals(strA)) {
            hc.a("cn.app.chat.xiaomi.net");
        }
        a(strA);
        if (m676h()) {
            com.xiaomi.channel.commonutils.logger.b.m63a("XMPushService", "-->postOnCreate(): try trigger connect now");
            cv cvVar2 = new cv(this, 11);
            a(cvVar2);
            v.a(new cw(this, cvVar2));
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            com.xiaomi.push.g.a((Context) this, getApplicationInfo(), true);
        }
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra(bj.F);
        String stringExtra2 = intent.getStringExtra(bj.J);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        hr[] hrVarArr = new hr[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i10 = 0; i10 < parcelableArrayExtra.length; i10++) {
            hr hrVar = new hr((Bundle) parcelableArrayExtra[i10]);
            hrVarArr[i10] = hrVar;
            hr hrVar2 = (hr) a(hrVar, stringExtra, stringExtra2);
            hrVarArr[i10] = hrVar2;
            if (hrVar2 == null) {
                return;
            }
        }
        bf bfVarA = bf.a();
        gq[] gqVarArr = new gq[length];
        for (int i11 = 0; i11 < length; i11++) {
            hr hrVar3 = hrVarArr[i11];
            gqVarArr[i11] = gq.a(hrVar3, bfVarA.a(hrVar3.k(), hrVar3.m()).f107918h);
        }
        c(new com.xiaomi.push.service.c(this, gqVarArr));
    }

    private void c(j jVar) {
        this.f969a.a(jVar);
    }

    private void c(boolean z10) {
        try {
            if (C1339r.m657a()) {
                if (!z10) {
                    sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
                    return;
                }
                sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                for (aq aqVar : (aq[]) this.f973a.toArray(new aq[0])) {
                    aqVar.mo745a();
                }
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
    }

    private void d() {
        com.xiaomi.push.bj bjVarM172a = com.xiaomi.push.bg.m172a();
        com.xiaomi.push.service.p.a(getApplicationContext()).a(bjVarM172a);
        if (bjVarM172a != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("network changed,");
            sb2.append(com.meituan.robust.Constants.ARRAY_TYPE + "type: " + bjVarM172a.m182a() + com.meituan.robust.Constants.ARRAY_TYPE + bjVarM172a.m184b() + "], state: " + bjVarM172a.m181a() + "/" + bjVarM172a.m180a());
            com.xiaomi.channel.commonutils.logger.b.m63a("XMPushService", sb2.toString());
            NetworkInfo.State stateM181a = bjVarM172a.m181a();
            if (stateM181a == NetworkInfo.State.SUSPENDED || stateM181a == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.m63a("XMPushService", "network changed, no active network");
        }
        if (gm.a() != null) {
            gm.a().m406a();
        }
        ig.m480a((Context) this);
        this.f957a.d();
        if (com.xiaomi.push.bg.b(this)) {
            if (m687c() && m674f()) {
                b(false);
            }
            if (!m687c() && !m688d()) {
                this.f969a.a(1);
                a(new e());
            }
            ef.a(this).a();
        } else {
            a(new g(2, null));
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        int i10;
        String strB;
        SharedPreferences sharedPreferences;
        bf bfVarA = bf.a();
        boolean z10 = true;
        int i11 = 0;
        if (bj.f107934d.equalsIgnoreCase(intent.getAction()) || bj.f107940j.equalsIgnoreCase(intent.getAction())) {
            String stringExtra = intent.getStringExtra(bj.f107952v);
            if (TextUtils.isEmpty(intent.getStringExtra(bj.B))) {
                com.xiaomi.channel.commonutils.logger.b.m62a("security is empty. ignore.");
                return;
            }
            if (TextUtils.isEmpty(stringExtra)) {
                com.xiaomi.channel.commonutils.logger.b.d("channel id is empty, do nothing!");
                return;
            }
            boolean zM670a = m670a(stringExtra, intent);
            bf.b bVarA = a(stringExtra, intent);
            if (!com.xiaomi.push.bg.c(this)) {
                this.f968a.a(this, bVarA, false, 2, null);
                return;
            }
            if (!m687c()) {
                a(true);
                return;
            }
            bf.c cVar = bVarA.f1041a;
            if (cVar == bf.c.unbind) {
                c(new b(bVarA));
                return;
            }
            if (zM670a) {
                c(new p(bVarA));
                return;
            } else if (cVar == bf.c.binding) {
                com.xiaomi.channel.commonutils.logger.b.m62a(String.format("the client is binding. %1$s %2$s.", bVarA.f107917g, bf.b.a(bVarA.f1046b)));
                return;
            } else {
                if (cVar == bf.c.binded) {
                    this.f968a.a(this, bVarA, true, 0, null);
                    return;
                }
                return;
            }
        }
        if (bj.f107939i.equalsIgnoreCase(intent.getAction())) {
            String stringExtra2 = intent.getStringExtra(bj.F);
            String stringExtra3 = intent.getStringExtra(bj.f107952v);
            String stringExtra4 = intent.getStringExtra(bj.f107949s);
            com.xiaomi.channel.commonutils.logger.b.m62a("Service called close channel chid = " + stringExtra3 + " res = " + bf.b.a(stringExtra4));
            if (TextUtils.isEmpty(stringExtra3)) {
                Iterator<String> it = bfVarA.m727a(stringExtra2).iterator();
                while (it.hasNext()) {
                    a(it.next(), 2);
                }
                return;
            } else if (TextUtils.isEmpty(stringExtra4)) {
                a(stringExtra3, 2);
                return;
            } else {
                a(stringExtra3, stringExtra4, 2, null, null);
                return;
            }
        }
        if (bj.f107935e.equalsIgnoreCase(intent.getAction())) {
            b(intent);
            return;
        }
        if (bj.f107937g.equalsIgnoreCase(intent.getAction())) {
            c(intent);
            return;
        }
        if (bj.f107936f.equalsIgnoreCase(intent.getAction())) {
            hs hsVarA = a(new hq(intent.getBundleExtra("ext_packet")), intent.getStringExtra(bj.F), intent.getStringExtra(bj.J));
            if (hsVarA != null) {
                c(new bu(this, gq.a(hsVarA, bfVarA.a(hsVarA.k(), hsVarA.m()).f107918h)));
                return;
            }
            return;
        }
        if (bj.f107938h.equalsIgnoreCase(intent.getAction())) {
            hs hsVarA2 = a(new hu(intent.getBundleExtra("ext_packet")), intent.getStringExtra(bj.F), intent.getStringExtra(bj.J));
            if (hsVarA2 != null) {
                c(new bu(this, gq.a(hsVarA2, bfVarA.a(hsVarA2.k(), hsVarA2.m()).f107918h)));
                return;
            }
            return;
        }
        if (bj.f107941k.equals(intent.getAction())) {
            String stringExtra5 = intent.getStringExtra(bj.f107952v);
            String stringExtra6 = intent.getStringExtra(bj.f107949s);
            if (stringExtra5 != null) {
                com.xiaomi.channel.commonutils.logger.b.m62a("request reset connection from chid = " + stringExtra5);
                bf.b bVarA2 = bf.a().a(stringExtra5, stringExtra6);
                if (bVarA2 != null && bVarA2.f107918h.equals(intent.getStringExtra(bj.B)) && bVarA2.f1041a == bf.c.binded) {
                    hb hbVarM679a = m679a();
                    if (hbVarM679a == null || !hbVarM679a.a(SystemClock.elapsedRealtime() - 15000)) {
                        c(new q());
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String string = null;
        bVarA = null;
        bf.b bVarA3 = null;
        string = null;
        if (bj.f107942l.equals(intent.getAction())) {
            String stringExtra7 = intent.getStringExtra(bj.F);
            List<String> listM727a = bfVarA.m727a(stringExtra7);
            if (listM727a.isEmpty()) {
                com.xiaomi.channel.commonutils.logger.b.m62a("open channel should be called first before update info, pkg=" + stringExtra7);
                return;
            }
            String stringExtra8 = intent.getStringExtra(bj.f107952v);
            String stringExtra9 = intent.getStringExtra(bj.f107949s);
            if (TextUtils.isEmpty(stringExtra8)) {
                stringExtra8 = listM727a.get(0);
            }
            if (TextUtils.isEmpty(stringExtra9)) {
                Collection<bf.b> collectionM726a = bfVarA.m726a(stringExtra8);
                if (collectionM726a != null && !collectionM726a.isEmpty()) {
                    bVarA3 = collectionM726a.iterator().next();
                }
            } else {
                bVarA3 = bfVarA.a(stringExtra8, stringExtra9);
            }
            if (bVarA3 != null) {
                if (intent.hasExtra(bj.D)) {
                    bVarA3.f107915e = intent.getStringExtra(bj.D);
                }
                if (intent.hasExtra(bj.E)) {
                    bVarA3.f107916f = intent.getStringExtra(bj.E);
                    return;
                }
                return;
            }
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) || "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && m677i() && fu.m389a()) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("enter falldown mode, stop alarm.");
                    fu.a();
                    return;
                }
                return;
            }
            if (m677i()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("exit falldown mode, activate alarm.");
            e();
            if (m687c() || m688d()) {
                return;
            }
            a(true);
            return;
        }
        if ("com.xiaomi.mipush.REGISTER_APP".equals(intent.getAction())) {
            if (bm.a(getApplicationContext()).m734a() && bm.a(getApplicationContext()).a() == 0) {
                com.xiaomi.channel.commonutils.logger.b.m62a("register without being provisioned. " + intent.getStringExtra("mipush_app_package"));
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            String stringExtra10 = intent.getStringExtra("mipush_app_package");
            boolean booleanExtra = intent.getBooleanExtra("mipush_env_chanage", false);
            int intExtra = intent.getIntExtra("mipush_env_type", 1);
            w.a(this).d(stringExtra10);
            if (!booleanExtra || "com.xiaomi.xmsf".equals(getPackageName())) {
                a(byteArrayExtra, stringExtra10);
                return;
            } else {
                c(new ck(this, 14, intExtra, stringExtra10, byteArrayExtra));
                return;
            }
        }
        if ("com.xiaomi.mipush.SEND_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
            String stringExtra11 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra2 = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
            if (com.xiaomi.push.service.n.a(byteArrayExtra2, stringExtra11)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("duplicate msg from: " + String.valueOf(stringExtra11));
                return;
            }
            if ("com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                w.a(this).a(stringExtra11);
                if (com.xiaomi.push.j.m521a(getApplicationContext())) {
                    ah.a(stringExtra11);
                }
            }
            a(stringExtra11, byteArrayExtra2, booleanExtra2);
            return;
        }
        if (bn.f107959a.equals(intent.getAction())) {
            String stringExtra12 = intent.getStringExtra("uninstall_pkg_name");
            if (stringExtra12 == null || TextUtils.isEmpty(stringExtra12.trim())) {
                return;
            }
            try {
                PackageInfo packageInfo = getPackageManager().getPackageInfo(stringExtra12, 0);
                if (packageInfo == null || packageInfo.applicationInfo == null || !com.xiaomi.push.i.m469a((Context) this, packageInfo.packageName)) {
                    z10 = false;
                } else {
                    com.xiaomi.channel.commonutils.logger.b.m62a("dual space's app uninstalled " + stringExtra12);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if ("com.xiaomi.channel".equals(stringExtra12) && !bf.a().m726a("1").isEmpty() && z10) {
                a("1", 0);
                com.xiaomi.channel.commonutils.logger.b.m62a("close the miliao channel as the app is uninstalled.");
                return;
            }
            SharedPreferences sharedPreferences2 = getSharedPreferences("pref_registered_pkg_names", 0);
            String string2 = sharedPreferences2.getString(stringExtra12, null);
            if (TextUtils.isEmpty(string2) || !z10) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            editorEdit.remove(stringExtra12);
            editorEdit.commit();
            if (al.m701b((Context) this, stringExtra12)) {
                al.c(this, stringExtra12);
            }
            al.m695a((Context) this, stringExtra12);
            as.a(getApplicationContext(), stringExtra12);
            if (!m687c() || string2 == null) {
                return;
            }
            try {
                ai.a(this, ai.a(stringExtra12, string2));
                com.xiaomi.channel.commonutils.logger.b.m62a("uninstall " + stringExtra12 + " msg sent");
                return;
            } catch (hm e10) {
                com.xiaomi.channel.commonutils.logger.b.d("Fail to send Message: " + e10.getMessage());
                a(10, e10);
                return;
            }
        }
        if (bn.f107960b.equals(intent.getAction())) {
            String stringExtra13 = intent.getStringExtra("data_cleared_pkg_name");
            if (TextUtils.isEmpty(stringExtra13)) {
                return;
            }
            try {
                sharedPreferences = getSharedPreferences("pref_registered_pkg_names", 0);
                if (sharedPreferences != null) {
                    try {
                        string = sharedPreferences.getString(stringExtra13, null);
                    } catch (Throwable th2) {
                        th = th2;
                        com.xiaomi.channel.commonutils.logger.b.m62a("Fail to get sp or appId : " + th);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                sharedPreferences = null;
            }
            if (!TextUtils.isEmpty(string)) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.remove(stringExtra13);
                editorEdit2.commit();
                if (al.m701b((Context) this, stringExtra13)) {
                    al.c(this, stringExtra13);
                }
                al.m695a((Context) this, stringExtra13);
                a(stringExtra13, jx.a(ai.b(stringExtra13, string)), true);
            }
            as.a((Context) this, stringExtra13);
            if (com.xiaomi.push.j.m521a(getApplicationContext())) {
                ah.a(stringExtra13);
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.CLEAR_NOTIFICATION".equals(intent.getAction())) {
            String stringExtra14 = intent.getStringExtra(bj.F);
            int intExtra2 = intent.getIntExtra(bj.G, -2);
            if (TextUtils.isEmpty(stringExtra14)) {
                return;
            }
            if (intExtra2 >= -1) {
                al.a(this, stringExtra14, intExtra2, intent.getIntExtra(bj.H, -1));
                return;
            } else {
                al.a(this, stringExtra14, intent.getStringExtra(bj.L), intent.getStringExtra(bj.M));
                return;
            }
        }
        if ("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION".equals(intent.getAction())) {
            String stringExtra15 = intent.getStringExtra(bj.F);
            if (TextUtils.isEmpty(stringExtra15)) {
                return;
            }
            al.m700b((Context) this, stringExtra15);
            return;
        }
        if ("com.xiaomi.mipush.SET_NOTIFICATION_TYPE".equals(intent.getAction())) {
            String stringExtra16 = intent.getStringExtra(bj.F);
            String stringExtra17 = intent.getStringExtra(bj.K);
            if (intent.hasExtra(bj.I)) {
                int intExtra3 = intent.getIntExtra(bj.I, 0);
                strB = com.xiaomi.push.bo.b(stringExtra16 + intExtra3);
                z10 = false;
                i11 = intExtra3;
            } else {
                strB = com.xiaomi.push.bo.b(stringExtra16);
            }
            if (TextUtils.isEmpty(stringExtra16) || !TextUtils.equals(stringExtra17, strB)) {
                com.xiaomi.channel.commonutils.logger.b.d("invalid notification for " + stringExtra16);
                return;
            }
            if (z10) {
                al.c(this, stringExtra16);
                return;
            } else {
                al.b(this, stringExtra16, i11);
                return;
            }
        }
        if ("com.xiaomi.mipush.DISABLE_PUSH".equals(intent.getAction())) {
            String stringExtra18 = intent.getStringExtra("mipush_app_package");
            if (!TextUtils.isEmpty(stringExtra18)) {
                w.a(this).b(stringExtra18);
            }
            if ("com.xiaomi.xmsf".equals(getPackageName())) {
                return;
            }
            a(19, (Exception) null);
            e();
            stopSelf();
            return;
        }
        if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
            String stringExtra19 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            String stringExtra20 = intent.getStringExtra("mipush_app_id");
            String stringExtra21 = intent.getStringExtra("mipush_app_token");
            if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                w.a(this).c(stringExtra19);
            }
            if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                w.a(this).e(stringExtra19);
                w.a(this).f(stringExtra19);
            }
            if (byteArrayExtra3 == null) {
                y.a(this, stringExtra19, byteArrayExtra3, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
                return;
            }
            y.b(stringExtra19, byteArrayExtra3);
            a(new x(this, stringExtra19, stringExtra20, stringExtra21, byteArrayExtra3));
            if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                if (this.f962a == null) {
                    this.f962a = new f();
                    registerReceiver(this.f962a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
                if (this.f971a == null) {
                    this.f971a = com.xiaomi.push.bg.m174a((Context) this);
                    return;
                }
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
            String stringExtra22 = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra4 = intent.getByteArrayExtra("mipush_payload");
            ir irVar = new ir();
            try {
                jx.a(irVar, byteArrayExtra4);
                il.a(this).a(irVar, stringExtra22);
                return;
            } catch (kd e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
                return;
            }
        }
        if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction())) {
            com.xiaomi.channel.commonutils.logger.b.m62a("[Alarm] Service called on timer");
            if (!m677i()) {
                fu.a(false);
                if (m674f()) {
                    b(false);
                }
            } else if (fu.m389a()) {
                com.xiaomi.channel.commonutils.logger.b.m62a("enter falldown mode, stop alarm");
                fu.a();
            }
            a aVar = this.f961a;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        if ("com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
            com.xiaomi.channel.commonutils.logger.b.m62a("Service called on check alive.");
            if (m674f()) {
                b(false);
                return;
            }
            return;
        }
        if ("com.xiaomi.mipush.thirdparty".equals(intent.getAction())) {
            com.xiaomi.channel.commonutils.logger.b.m62a("on thirdpart push :" + intent.getStringExtra("com.xiaomi.mipush.thirdparty_DESC"));
            fu.a(this, intent.getIntExtra("com.xiaomi.mipush.thirdparty_LEVEL", 0));
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            d();
            return;
        }
        if ("miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
            a(intent);
            return;
        }
        if ("com.xiaomi.xmsf.USE_INTELLIGENT_HB".equals(intent.getAction())) {
            if (intent.getExtras() == null || (i10 = intent.getExtras().getInt("effectivePeriod", 0)) <= 0 || i10 > 604800) {
                return;
            }
            com.xiaomi.push.service.p.a(getApplicationContext()).a(i10);
            return;
        }
        if ("action_cr_config".equals(intent.getAction())) {
            boolean booleanExtra3 = intent.getBooleanExtra("action_cr_event_switch", false);
            long longExtra = intent.getLongExtra("action_cr_event_frequency", 86400L);
            boolean booleanExtra4 = intent.getBooleanExtra("action_cr_perf_switch", false);
            long longExtra2 = intent.getLongExtra("action_cr_perf_frequency", 86400L);
            boolean booleanExtra5 = intent.getBooleanExtra("action_cr_event_en", true);
            long longExtra3 = intent.getLongExtra("action_cr_max_file_size", 1048576L);
            Config configBuild = Config.getBuilder().setEventUploadSwitchOpen(booleanExtra3).setEventUploadFrequency(longExtra).setPerfUploadSwitchOpen(booleanExtra4).setPerfUploadFrequency(longExtra2).setAESKey(com.xiaomi.push.cb.a(getApplicationContext())).setEventEncrypted(booleanExtra5).setMaxFileLength(longExtra3).build(getApplicationContext());
            if ("com.xiaomi.xmsf".equals(getPackageName()) || longExtra <= 0 || longExtra2 <= 0 || longExtra3 <= 0) {
                return;
            }
            fn.a(getApplicationContext(), configBuild);
            return;
        }
        if (!"action_help_ping".equals(intent.getAction())) {
            if ("action_aw_app_logic".equals(intent.getAction())) {
                e(intent);
                return;
            }
            if (bj.f107944n.equals(intent.getAction())) {
                com.xiaomi.push.service.o.a(getApplicationContext(), intent);
                return;
            } else {
                if (bj.f107945o.equals(intent.getAction())) {
                    String stringExtra23 = intent.getStringExtra("ext_downward_pkt_id");
                    if (TextUtils.isEmpty(stringExtra23)) {
                        return;
                    }
                    bq.a().b(stringExtra23, intent.getLongExtra("ext_app_receive_time", 0L));
                    return;
                }
                return;
            }
        }
        boolean booleanExtra6 = intent.getBooleanExtra("extra_help_ping_switch", false);
        int intExtra4 = intent.getIntExtra("extra_help_ping_frequency", 0);
        if (intExtra4 >= 0 && intExtra4 < 30) {
            com.xiaomi.channel.commonutils.logger.b.c("aw_ping: frquency need > 30s.");
            intExtra4 = 30;
        }
        boolean z11 = intExtra4 >= 0 ? booleanExtra6 : false;
        com.xiaomi.channel.commonutils.logger.b.m62a("aw_ping: receive a aw_ping message. switch: " + z11 + " frequency: " + intExtra4);
        if (!z11 || intExtra4 <= 0 || "com.xiaomi.xmsf".equals(getPackageName())) {
            return;
        }
        a(intent, intExtra4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!m682a()) {
            fu.a();
        } else {
            if (fu.m389a()) {
                return;
            }
            fu.a(true);
        }
    }

    private void e(Intent intent) {
        int i10;
        try {
            fd.a(getApplicationContext()).a(new bl());
            String stringExtra = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra == null) {
                return;
            }
            jm jmVar = new jm();
            jx.a(jmVar, byteArrayExtra);
            String strB = jmVar.b();
            Map<String, String> mapM580a = jmVar.m580a();
            if (mapM580a != null) {
                String str = mapM580a.get("extra_help_aw_info");
                String str2 = mapM580a.get("extra_aw_app_online_cmd");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    i10 = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                    i10 = 0;
                }
                int i11 = i10;
                if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(strB) || TextUtils.isEmpty(str)) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("packageName", stringExtra);
                map.put("appId", strB);
                map.put("awkInfo", str);
                map.put("cmdId", String.valueOf(i11));
                gc.a().a("check_doAWLogic", (Object) map);
                fd.a(getApplicationContext()).a(this, str, i11, stringExtra, strB);
            }
        } catch (kd e10) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_logic: translate fail. " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static boolean m673e() {
        return f107833b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        hb hbVar = this.f958a;
        if (hbVar != null && hbVar.m443b()) {
            com.xiaomi.channel.commonutils.logger.b.d("try to connect while connecting.");
            return;
        }
        hb hbVar2 = this.f958a;
        if (hbVar2 != null && hbVar2.m444c()) {
            com.xiaomi.channel.commonutils.logger.b.d("try to connect while is connected.");
            return;
        }
        this.f959a.b(com.xiaomi.push.bg.m175a((Context) this));
        g();
        if (this.f958a == null) {
            bf.a().a(this);
            c(false);
        }
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private boolean m674f() {
        if (SystemClock.elapsedRealtime() - this.f954a < 30000) {
            return false;
        }
        return com.xiaomi.push.bg.d(this);
    }

    private void g() {
        try {
            this.f957a.a(this.f960a, new cn(this));
            this.f957a.e();
            this.f958a = this.f957a;
        } catch (hm e10) {
            com.xiaomi.channel.commonutils.logger.b.a("fail to create Slim connection", e10);
            this.f957a.b(3, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public boolean m675g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    private void h() {
    }

    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    private boolean m676h() {
        boolean zEquals;
        String packageName = getPackageName();
        if ("com.xiaomi.xmsf".equals(packageName)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("current sdk expect region is cn");
            zEquals = com.xiaomi.push.m.China.name().equals(com.xiaomi.push.service.a.a(getApplicationContext()).a());
        } else {
            zEquals = !w.a(this).m778b(packageName);
        }
        if (!zEquals) {
            com.xiaomi.channel.commonutils.logger.b.m64a("XMPushService", "-->isPushEnabled(): isEnabled=", Boolean.valueOf(zEquals), ", package=", packageName, ", region=", com.xiaomi.push.service.a.a(getApplicationContext()).a());
        }
        return zEquals;
    }

    private void i() {
        synchronized (this.f972a) {
            this.f972a.clear();
        }
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    private boolean m677i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && j() && !com.xiaomi.push.i.m471b((Context) this) && !com.xiaomi.push.i.m468a(getApplicationContext());
    }

    private boolean j() {
        int iIntValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i10 = this.f107834a;
        int i11 = this.f975b;
        if (i10 > i11) {
            if (iIntValue >= i10 || iIntValue < i11) {
                return true;
            }
        } else if (i10 < i11 && iIntValue >= i10 && iIntValue < i11) {
            return true;
        }
        return false;
    }

    private boolean k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return az.a(this).a(is.ForegroundServiceSwitch.a(), false);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int m678a() {
        if (this.f107835c < 0) {
            this.f107835c = com.xiaomi.push.g.a((Context) this, "com.xiaomi.xmsf");
        }
        return this.f107835c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public hb m679a() {
        return this.f958a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public com.xiaomi.push.service.k m680a() {
        return new com.xiaomi.push.service.k();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    void m681a() {
        if (SystemClock.elapsedRealtime() - this.f954a >= hh.a() && com.xiaomi.push.bg.d(this)) {
            b(true);
        }
    }

    public void a(int i10) {
        this.f969a.a(i10);
    }

    public void a(int i10, Exception exc) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("disconnect ");
        sb2.append(hashCode());
        sb2.append(", ");
        hb hbVar = this.f958a;
        sb2.append(hbVar == null ? null : Integer.valueOf(hbVar.hashCode()));
        com.xiaomi.channel.commonutils.logger.b.m62a(sb2.toString());
        hb hbVar2 = this.f958a;
        if (hbVar2 != null) {
            hbVar2.b(i10, exc);
            this.f958a = null;
        }
        a(7);
        a(4);
        bf.a().a(this, i10);
    }

    public void a(gq gqVar) throws hm {
        hb hbVar = this.f958a;
        if (hbVar == null) {
            throw new hm("try send msg while connection is null.");
        }
        hbVar.b(gqVar);
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar) {
        com.xiaomi.channel.commonutils.logger.b.c("begin to connect...");
        gm.a().a(hbVar);
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar, int i10, Exception exc) {
        gm.a().a(hbVar, i10, exc);
        if (m677i()) {
            return;
        }
        a(false);
    }

    @Override // com.xiaomi.push.he
    public void a(hb hbVar, Exception exc) {
        gm.a().a(hbVar, exc);
        c(false);
        if (m677i()) {
            return;
        }
        a(false);
    }

    public void a(j jVar) {
        a(jVar, 0L);
    }

    public void a(j jVar, long j10) {
        try {
            this.f969a.a(jVar, j10);
        } catch (IllegalStateException e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("can't execute job err = " + e10.getMessage());
        }
    }

    public void a(n nVar) {
        synchronized (this.f972a) {
            this.f972a.add(nVar);
        }
    }

    public void a(bf.b bVar) {
        if (bVar != null) {
            long jA = bVar.a();
            com.xiaomi.channel.commonutils.logger.b.m62a("schedule rebind job in " + (jA / 1000));
            a(new b(bVar), jA);
        }
    }

    public void a(String str, String str2, int i10, String str3, String str4) {
        bf.b bVarA = bf.a().a(str, str2);
        if (bVarA != null) {
            a(new s(bVarA, i10, str4, str3));
        }
        bf.a().m730a(str, str2);
    }

    void a(String str, byte[] bArr, boolean z10) {
        Collection<bf.b> collectionM726a = bf.a().m726a("5");
        if (collectionM726a.isEmpty()) {
            if (z10) {
                y.b(str, bArr);
            }
        } else if (collectionM726a.iterator().next().f1041a == bf.c.binded) {
            a(new cl(this, 4, str, bArr));
        } else if (z10) {
            y.b(str, bArr);
        }
    }

    public void a(boolean z10) {
        this.f967a.a(z10);
    }

    public void a(byte[] bArr, String str) {
        if (bArr == null) {
            y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            com.xiaomi.channel.commonutils.logger.b.m62a("register request without payload");
            return;
        }
        jj jjVar = new jj();
        try {
            jx.a(jjVar, bArr);
            if (jjVar.f744a == in.Registration) {
                jn jnVar = new jn();
                try {
                    jx.a(jnVar, jjVar.m570a());
                    a(new x(this, jjVar.b(), jnVar.b(), jnVar.c(), bArr));
                    fo.a(getApplicationContext()).a(jjVar.b(), "E100003", jnVar.a(), 6002, null);
                } catch (kd e10) {
                    com.xiaomi.channel.commonutils.logger.b.d("app register error. " + e10);
                    y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                com.xiaomi.channel.commonutils.logger.b.m62a("register request with invalid payload");
            }
        } catch (kd e11) {
            com.xiaomi.channel.commonutils.logger.b.d("app register fail. " + e11);
            y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    public void a(gq[] gqVarArr) throws hm {
        hb hbVar = this.f958a;
        if (hbVar == null) {
            throw new hm("try send msg while connection is null.");
        }
        hbVar.a(gqVarArr);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m682a() {
        boolean zB = com.xiaomi.push.bg.b(this);
        boolean z10 = bf.a().m724a() > 0;
        boolean z11 = !m686b();
        boolean zM676h = m676h();
        boolean z12 = !m675g();
        boolean z13 = zB && z10 && z11 && zM676h && z12;
        if (!z13) {
            com.xiaomi.channel.commonutils.logger.b.e(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(zB), Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(zM676h), Boolean.valueOf(z12)));
        }
        return z13;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m683a(int i10) {
        return this.f969a.m764a(i10);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public com.xiaomi.push.service.k m684b() {
        return this.f968a;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    void m685b() {
        com.xiaomi.push.service.p.a(getApplicationContext()).m761d();
        Iterator it = new ArrayList(this.f972a).iterator();
        while (it.hasNext()) {
            ((n) it.next()).mo482a();
        }
    }

    @Override // com.xiaomi.push.he
    public void b(hb hbVar) {
        gm.a().b(hbVar);
        c(true);
        this.f967a.m736a();
        if (!fu.m389a() && !m677i()) {
            com.xiaomi.channel.commonutils.logger.b.m62a("reconnection successful, reactivate alarm.");
            fu.a(true);
        }
        Iterator<bf.b> it = bf.a().m725a().iterator();
        while (it.hasNext()) {
            a(new b(it.next()));
        }
        if (this.f974a || !com.xiaomi.push.j.m521a(getApplicationContext())) {
            return;
        }
        com.xiaomi.push.ah.a(getApplicationContext()).a(new co(this));
    }

    public void b(j jVar) {
        this.f969a.a(jVar.f108022a, jVar);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m686b() {
        try {
            Class<?> clsA = C1339r.a(this, "miui.os.Build");
            return clsA.getField("IS_CM_CUSTOMIZATION_TEST").getBoolean(null) || clsA.getField("IS_CU_CUSTOMIZATION_TEST").getBoolean(null) || clsA.getField("IS_CT_CUSTOMIZATION_TEST").getBoolean(null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m687c() {
        hb hbVar = this.f958a;
        return hbVar != null && hbVar.m444c();
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m688d() {
        hb hbVar = this.f958a;
        return hbVar != null && hbVar.m443b();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f956a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] strArrSplit;
        super.onCreate();
        com.xiaomi.channel.commonutils.logger.b.a(getApplicationContext());
        C1339r.a((Context) this);
        u uVarM773a = v.m773a((Context) this);
        if (uVarM773a != null) {
            com.xiaomi.push.aa.a(uVarM773a.f108037a);
        }
        if (com.xiaomi.push.j.m521a(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f961a = new a(this, null);
            com.xiaomi.push.l.a(this, this.f961a, new IntentFilter(bj.f107947q), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler, 4);
            f107833b = true;
            handler.post(new cp(this));
        }
        this.f956a = new Messenger(new cq(this));
        bk.a(this);
        cr crVar = new cr(this, null, bb.c.f.We, "xiaomi.com", null);
        this.f959a = crVar;
        crVar.a(true);
        this.f957a = new gx(this, this.f959a);
        this.f968a = m680a();
        fu.a(this);
        this.f957a.a(this);
        this.f966a = new bd(this);
        this.f967a = new bp(this);
        new com.xiaomi.push.service.l().a();
        gm.m407a().a(this);
        this.f969a = new com.xiaomi.push.service.q("Connection Controller Thread");
        bf bfVarA = bf.a();
        bfVarA.b();
        bfVarA.a(new cs(this));
        if (k()) {
            h();
        }
        il.a(this).a(new com.xiaomi.push.service.s(this), "UPLOADER_PUSH_CHANNEL");
        a(new ii(this));
        a(new ch(this));
        if (com.xiaomi.push.j.m521a((Context) this)) {
            a(new be());
            if (com.xiaomi.push.i.m467a()) {
                a(new ct(this));
            }
        }
        a(new h());
        this.f973a.add(by.a(this));
        if (m676h()) {
            this.f962a = new f();
            registerReceiver(this.f962a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            com.xiaomi.push.bg.m174a((Context) this);
        }
        if (com.xiaomi.push.j.m521a(getApplicationContext())) {
            this.f965a = new t();
            com.xiaomi.push.l.a(this, this.f965a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null, 2);
            k kVar = new k();
            this.f963a = kVar;
            com.xiaomi.push.l.a(this, kVar, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null, 2);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f955a = new cu(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f955a);
                } catch (Throwable th2) {
                    com.xiaomi.channel.commonutils.logger.b.d("register super-power-mode observer err:" + th2.getMessage());
                }
            }
            int[] iArrM671a = m671a();
            if (iArrM671a != null) {
                this.f964a = new r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.f964a, intentFilter);
                this.f107834a = iArrM671a[0];
                this.f975b = iArrM671a[1];
                com.xiaomi.channel.commonutils.logger.b.m62a("falldown initialized: " + this.f107834a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f975b);
            }
        }
        dm.a(this, this.f957a);
        dv.a(this, this.f957a);
        String str = "";
        if (uVarM773a != null) {
            try {
                if (!TextUtils.isEmpty(uVarM773a.f1114a) && (strArrSplit = uVarM773a.f1114a.split("@")) != null && strArrSplit.length > 0) {
                    str = strArrSplit[0];
                }
            } catch (Exception unused) {
            }
        }
        ed.a(this);
        com.xiaomi.channel.commonutils.logger.b.e("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + com.xiaomi.push.g.a(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f fVar = this.f962a;
        if (fVar != null) {
            a(fVar);
            this.f962a = null;
        }
        try {
            Object obj = this.f971a;
            if (obj != null && (obj instanceof ConnectivityManager.NetworkCallback)) {
                ((ConnectivityManager) getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f971a);
            }
        } catch (Exception unused) {
        }
        t tVar = this.f965a;
        if (tVar != null) {
            a(tVar);
            this.f965a = null;
        }
        k kVar = this.f963a;
        if (kVar != null) {
            a(kVar);
            this.f963a = null;
        }
        r rVar = this.f964a;
        if (rVar != null) {
            a(rVar);
            this.f964a = null;
        }
        a aVar = this.f961a;
        if (aVar != null) {
            a(aVar);
            this.f961a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f955a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f955a);
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.d("unregister super-power-mode err:" + th2.getMessage());
            }
        }
        this.f973a.clear();
        this.f969a.m765b();
        a(new cm(this, 2));
        a(new l());
        bf.a().b();
        bf.a().a(this, 15);
        bf.a().m728a();
        this.f957a.b(this);
        bw.a().m743a();
        fu.a();
        i();
        dm.b(this, this.f957a);
        dv.b(this, this.f957a);
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.b.m62a("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.b.d("onStart() with intent NULL");
        } else {
            try {
                String stringExtra = intent.getStringExtra(bj.f107952v);
                String stringExtra2 = intent.getStringExtra(bj.F);
                String stringExtra3 = intent.getStringExtra("mipush_app_package");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                    com.xiaomi.channel.commonutils.logger.b.m63a("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, intent = %s", intent.getAction(), stringExtra, stringExtra2, stringExtra3, com.xiaomi.push.j.a(intent)));
                } else {
                    com.xiaomi.channel.commonutils.logger.b.m63a("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), stringExtra, stringExtra2, stringExtra3));
                }
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.d("onStart() cause error: " + th2.getMessage());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f969a.m763a()) {
                    com.xiaomi.channel.commonutils.logger.b.d("ERROR, the job controller is blocked.");
                    bf.a().a(this, 14);
                    stopSelf();
                } else {
                    a(new i(intent));
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                a(new i(intent));
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 50) {
            com.xiaomi.channel.commonutils.logger.b.c("[Prefs] spend " + jCurrentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        onStart(intent, i11);
        return 1;
    }
}
