package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.max.xiaoheihe.module.mall.SteamStoreRedeemWalletCodeActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bf f107910a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, HashMap<String, b>> f1034a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private List<a> f1033a = new ArrayList();

    public interface a {
        void a();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public Context f1035a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        Messenger f1037a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private XMPushService f1039a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public k f1042a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public String f1043a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public boolean f1045a;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        public String f1046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f107913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f107914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f107915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f107916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f107917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f107918h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f107919i;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        c f1041a = c.unbind;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f107911a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private final CopyOnWriteArrayList<a> f1044a = new CopyOnWriteArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f107912b = null;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f1047b = false;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private XMPushService.c f1038a = new XMPushService.c(this);

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        IBinder.DeathRecipient f1036a = null;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        final C1065b f1040a = new C1065b();

        public interface a {
            void a(c cVar, c cVar2, int i10);
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.bf$b$b, reason: collision with other inner class name */
        public class C1065b extends XMPushService.j {

            /* JADX INFO: renamed from: a, reason: collision with other field name */
            String f1048a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f107921b;

            /* JADX INFO: renamed from: b, reason: collision with other field name */
            String f1049b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f107922c;

            public C1065b() {
                super(0);
            }

            public XMPushService.j a(int i10, int i11, String str, String str2) {
                this.f107921b = i10;
                this.f107922c = i11;
                this.f1049b = str2;
                this.f1048a = str;
                return this;
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* JADX INFO: renamed from: a */
            public void mo404a() {
                if (b.this.a(this.f107921b, this.f107922c, this.f1049b)) {
                    b.this.a(this.f107921b, this.f107922c, this.f1048a, this.f1049b);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.b(" ignore notify client :" + b.this.f107917g);
            }
        }

        public class c implements IBinder.DeathRecipient {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Messenger f107923a;

            /* JADX INFO: renamed from: a, reason: collision with other field name */
            final b f1050a;

            c(b bVar, Messenger messenger) {
                this.f1050a = bVar;
                this.f107923a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                com.xiaomi.channel.commonutils.logger.b.b("peer died, chid = " + this.f1050a.f107917g);
                b.this.f1039a.a(new bh(this, 0), 0L);
                if ("9".equals(this.f1050a.f107917g) && "com.xiaomi.xmsf".equals(b.this.f1039a.getPackageName())) {
                    b.this.f1039a.a(new bi(this, 0), 60000L);
                }
            }
        }

        public b() {
        }

        public b(XMPushService xMPushService) {
            this.f1039a = xMPushService;
            a(new bg(this));
        }

        public static String a(String str) {
            int iLastIndexOf;
            return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf("/")) == -1) ? "" : str.substring(iLastIndexOf + 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10, int i11, String str, String str2) {
            c cVar = this.f1041a;
            this.f107912b = cVar;
            if (i10 == 2) {
                this.f1042a.a(this.f1035a, this, i11);
                return;
            }
            if (i10 == 3) {
                this.f1042a.a(this.f1035a, this, str2, str);
                return;
            }
            if (i10 == 1) {
                boolean z10 = cVar == c.binded;
                if (!z10 && SteamStoreRedeemWalletCodeActivity.N3.equals(str2)) {
                    this.f107911a++;
                } else if (z10) {
                    this.f107911a = 0;
                    if (this.f1037a != null) {
                        try {
                            this.f1037a.send(Message.obtain(null, 16, this.f1039a.f956a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f1042a.a(this.f1039a, this, z10, i11, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(int i10, int i11, String str) {
            boolean z10;
            c cVar = this.f107912b;
            if (cVar == null || !(z10 = this.f1047b)) {
                return true;
            }
            if (cVar == this.f1041a) {
                com.xiaomi.channel.commonutils.logger.b.b(" status recovered, don't notify client:" + this.f107917g);
                return false;
            }
            if (this.f1037a == null || !z10) {
                com.xiaomi.channel.commonutils.logger.b.b("peer died, ignore notify " + this.f107917g);
                return false;
            }
            com.xiaomi.channel.commonutils.logger.b.b("Peer alive notify status to client:" + this.f107917g);
            return true;
        }

        private boolean b(int i10, int i11, String str) {
            if (i10 == 1) {
                return (this.f1041a == c.binded || !this.f1039a.m687c() || i11 == 21 || (i11 == 7 && SteamStoreRedeemWalletCodeActivity.N3.equals(str))) ? false : true;
            }
            if (i10 == 2) {
                return this.f1039a.m687c();
            }
            if (i10 != 3) {
                return false;
            }
            return !SteamStoreRedeemWalletCodeActivity.N3.equals(str);
        }

        public long a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.f107911a + 1) * 15))) * 1000;
        }

        public String a(int i10) {
            if (i10 == 1) {
                return "OPEN";
            }
            if (i10 != 2) {
                return i10 != 3 ? "unknown" : "KICK";
            }
            return "CLOSE";
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        void m732a() {
            try {
                Messenger messenger = this.f1037a;
                if (messenger != null && this.f1036a != null) {
                    messenger.getBinder().unlinkToDeath(this.f1036a, 0);
                }
            } catch (Exception unused) {
            }
            this.f107912b = null;
        }

        void a(Messenger messenger) {
            m732a();
            try {
                if (messenger != null) {
                    this.f1037a = messenger;
                    this.f1047b = true;
                    this.f1036a = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f1036a, 0);
                } else {
                    com.xiaomi.channel.commonutils.logger.b.b("peer linked with old sdk chid = " + this.f107917g);
                }
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.b("peer linkToDeath err: " + e10.getMessage());
                this.f1037a = null;
                this.f1047b = false;
            }
        }

        public void a(a aVar) {
            this.f1044a.add(aVar);
        }

        public void a(c cVar, int i10, int i11, String str, String str2) {
            boolean z10;
            for (a aVar : this.f1044a) {
                if (aVar != null) {
                    aVar.a(this.f1041a, cVar, i11);
                }
            }
            c cVar2 = this.f1041a;
            int i12 = 0;
            if (cVar2 != cVar) {
                com.xiaomi.channel.commonutils.logger.b.m62a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar2, cVar, a(i10), bj.a(i11), str, str2, this.f107917g));
                this.f1041a = cVar;
            }
            if (this.f1042a == null) {
                com.xiaomi.channel.commonutils.logger.b.d("status changed while the client dispatcher is missing");
                return;
            }
            if (cVar == c.binding) {
                return;
            }
            if (this.f107912b != null && (z10 = this.f1047b)) {
                i12 = (this.f1037a == null || !z10) ? 10100 : 1000;
            }
            this.f1039a.b(this.f1040a);
            if (b(i10, i11, str2)) {
                a(i10, i11, str, str2);
            } else {
                this.f1039a.a(this.f1040a.a(i10, i11, str, str2), i12);
            }
        }

        public void b(a aVar) {
            this.f1044a.remove(aVar);
        }
    }

    public enum c {
        unbind,
        binding,
        binded
    }

    private bf() {
    }

    public static synchronized bf a() {
        if (f107910a == null) {
            f107910a = new bf();
        }
        return f107910a;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("@");
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized int m724a() {
        return this.f1034a.size();
    }

    public synchronized b a(String str, String str2) {
        HashMap<String, b> map = this.f1034a.get(str);
        if (map == null) {
            return null;
        }
        return map.get(a(str2));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<b> m725a() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        Iterator<HashMap<String, b>> it = this.f1034a.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().values());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized Collection<b> m726a(String str) {
        if (this.f1034a.containsKey(str)) {
            return ((HashMap) this.f1034a.get(str).clone()).values();
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized List<String> m727a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<HashMap<String, b>> it = this.f1034a.values().iterator();
        while (it.hasNext()) {
            for (b bVar : it.next().values()) {
                if (str.equals(bVar.f1043a)) {
                    arrayList.add(bVar.f107917g);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m728a() {
        Iterator<b> it = m725a().iterator();
        while (it.hasNext()) {
            it.next().m732a();
        }
        this.f1034a.clear();
    }

    public synchronized void a(Context context) {
        Iterator<HashMap<String, b>> it = this.f1034a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().a(c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    public synchronized void a(Context context, int i10) {
        Iterator<HashMap<String, b>> it = this.f1034a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().a(c.unbind, 2, i10, (String) null, (String) null);
            }
        }
    }

    public synchronized void a(a aVar) {
        this.f1033a.add(aVar);
    }

    public synchronized void a(b bVar) {
        HashMap<String, b> map = this.f1034a.get(bVar.f107917g);
        if (map == null) {
            map = new HashMap<>();
            this.f1034a.put(bVar.f107917g, map);
        }
        map.put(a(bVar.f1046b), bVar);
        com.xiaomi.channel.commonutils.logger.b.m62a("add active client. " + bVar.f1043a);
        Iterator<a> it = this.f1033a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m729a(String str) {
        HashMap<String, b> map = this.f1034a.get(str);
        if (map != null) {
            Iterator<b> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().m732a();
            }
            map.clear();
            this.f1034a.remove(str);
        }
        Iterator<a> it2 = this.f1033a.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m730a(String str, String str2) {
        HashMap<String, b> map = this.f1034a.get(str);
        if (map != null) {
            b bVar = map.get(a(str2));
            if (bVar != null) {
                bVar.m732a();
            }
            map.remove(a(str2));
            if (map.isEmpty()) {
                this.f1034a.remove(str);
            }
        }
        Iterator<a> it = this.f1033a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public synchronized void b() {
        this.f1033a.clear();
    }
}
