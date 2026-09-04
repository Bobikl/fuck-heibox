package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: NotificationManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20024c = "NotifManCompat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20025d = "checkOpNoThrow";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20026e = "OP_POST_NOTIFICATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20027f = "android.support.useSideChannel";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f20028g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f20029h = 19;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f20030i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f20031j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f20032k = "enabled_notification_listeners";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("sEnabledNotificationListenersLock")
    private static String f20034m = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.b0("sLock")
    private static h f20037p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f20038q = -1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f20039r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f20040s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f20041t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f20042u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f20043v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f20044w = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f20046b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f20033l = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.b0("sEnabledNotificationListenersLock")
    private static Set<String> f20035n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f20036o = new Object();

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    @androidx.annotation.w0(24)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        @androidx.annotation.u
        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    @androidx.annotation.w0(26)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        @androidx.annotation.u
        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        @androidx.annotation.u
        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        @androidx.annotation.u
        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        @androidx.annotation.u
        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        @androidx.annotation.u
        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        @androidx.annotation.u
        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @androidx.annotation.u
        static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @androidx.annotation.u
        static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        @androidx.annotation.u
        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        @androidx.annotation.u
        static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    @androidx.annotation.w0(28)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    @androidx.annotation.w0(30)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        @androidx.annotation.u
        static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    public static class e implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f20047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f20048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f20049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f20050d;

        e(String str) {
            this.f20047a = str;
            this.f20048b = 0;
            this.f20049c = null;
            this.f20050d = true;
        }

        e(String str, int i10, String str2) {
            this.f20047a = str;
            this.f20048b = i10;
            this.f20049c = str2;
            this.f20050d = false;
        }

        @Override // androidx.core.app.l2.i
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f20050d) {
                iNotificationSideChannel.cancelAll(this.f20047a);
            } else {
                iNotificationSideChannel.cancel(this.f20047a, this.f20048b, this.f20049c);
            }
        }

        @androidx.annotation.n0
        public String toString() {
            return "CancelTask[packageName:" + this.f20047a + ", id:" + this.f20048b + ", tag:" + this.f20049c + ", all:" + this.f20050d + "]";
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    public static class f implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f20051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f20052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f20053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f20054d;

        f(String str, int i10, String str2, Notification notification) {
            this.f20051a = str;
            this.f20052b = i10;
            this.f20053c = str2;
            this.f20054d = notification;
        }

        @Override // androidx.core.app.l2.i
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f20051a, this.f20052b, this.f20053c, this.f20054d);
        }

        @androidx.annotation.n0
        public String toString() {
            return "NotifyTask[packageName:" + this.f20051a + ", id:" + this.f20052b + ", tag:" + this.f20053c + "]";
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f20055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f20056b;

        g(ComponentName componentName, IBinder iBinder) {
            this.f20055a = componentName;
            this.f20056b = iBinder;
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    public static class h implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f20057g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f20058h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f20059i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f20060j = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f20061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HandlerThread f20062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f20063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map<ComponentName, a> f20064e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Set<String> f20065f = new HashSet();

        /* JADX INFO: compiled from: NotificationManagerCompat.java */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f20066a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            INotificationSideChannel f20068c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f20067b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque<i> f20069d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f20070e = 0;

            a(ComponentName componentName) {
                this.f20066a = componentName;
            }
        }

        h(Context context) {
            this.f20061b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f20062c = handlerThread;
            handlerThread.start();
            this.f20063d = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f20067b) {
                return true;
            }
            boolean zBindService = this.f20061b.bindService(new Intent(l2.f20028g).setComponent(aVar.f20066a), this, 33);
            aVar.f20067b = zBindService;
            if (zBindService) {
                aVar.f20070e = 0;
            } else {
                Log.w(l2.f20024c, "Unable to bind to listener " + aVar.f20066a);
                this.f20061b.unbindService(this);
            }
            return aVar.f20067b;
        }

        private void b(a aVar) {
            if (aVar.f20067b) {
                this.f20061b.unbindService(this);
                aVar.f20067b = false;
            }
            aVar.f20068c = null;
        }

        private void c(i iVar) {
            j();
            for (a aVar : this.f20064e.values()) {
                aVar.f20069d.add(iVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f20064e.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f20064e.get(componentName);
            if (aVar != null) {
                aVar.f20068c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f20070e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f20064e.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable(l2.f20024c, 3)) {
                Log.d(l2.f20024c, "Processing component " + aVar.f20066a + ", " + aVar.f20069d.size() + " queued tasks");
            }
            if (aVar.f20069d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f20068c == null) {
                i(aVar);
                return;
            }
            while (true) {
                i iVarPeek = aVar.f20069d.peek();
                if (iVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(l2.f20024c, 3)) {
                        Log.d(l2.f20024c, "Sending task " + iVarPeek);
                    }
                    iVarPeek.a(aVar.f20068c);
                    aVar.f20069d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(l2.f20024c, 3)) {
                        Log.d(l2.f20024c, "Remote service has died: " + aVar.f20066a);
                    }
                } catch (RemoteException e10) {
                    Log.w(l2.f20024c, "RemoteException communicating with " + aVar.f20066a, e10);
                }
            }
            if (aVar.f20069d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f20063d.hasMessages(3, aVar.f20066a)) {
                return;
            }
            int i10 = aVar.f20070e + 1;
            aVar.f20070e = i10;
            if (i10 <= 6) {
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable(l2.f20024c, 3)) {
                    Log.d(l2.f20024c, "Scheduling retry for " + i11 + " ms");
                }
                this.f20063d.sendMessageDelayed(this.f20063d.obtainMessage(3, aVar.f20066a), i11);
                return;
            }
            Log.w(l2.f20024c, "Giving up on delivering " + aVar.f20069d.size() + " tasks to " + aVar.f20066a + " after " + aVar.f20070e + " retries");
            aVar.f20069d.clear();
        }

        private void j() {
            Set<String> setQ = l2.q(this.f20061b);
            if (setQ.equals(this.f20065f)) {
                return;
            }
            this.f20065f = setQ;
            List<ResolveInfo> listQueryIntentServices = this.f20061b.getPackageManager().queryIntentServices(new Intent().setAction(l2.f20028g), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setQ.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(l2.f20024c, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f20064e.containsKey(componentName2)) {
                    if (Log.isLoggable(l2.f20024c, 3)) {
                        Log.d(l2.f20024c, "Adding listener record for " + componentName2);
                    }
                    this.f20064e.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f20064e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(l2.f20024c, 3)) {
                        Log.d(l2.f20024c, "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(i iVar) {
            this.f20063d.obtainMessage(0, iVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((i) message.obj);
                return true;
            }
            if (i10 == 1) {
                g gVar = (g) message.obj;
                e(gVar.f20055a, gVar.f20056b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(l2.f20024c, 3)) {
                Log.d(l2.f20024c, "Connected to service " + componentName);
            }
            this.f20063d.obtainMessage(1, new g(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(l2.f20024c, 3)) {
                Log.d(l2.f20024c, "Disconnected from service " + componentName);
            }
            this.f20063d.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: NotificationManagerCompat.java */
    public interface i {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private l2(Context context) {
        this.f20045a = context;
        this.f20046b = (NotificationManager) context.getSystemService("notification");
    }

    private void E(i iVar) {
        synchronized (f20036o) {
            if (f20037p == null) {
                f20037p = new h(this.f20045a.getApplicationContext());
            }
            f20037p.h(iVar);
        }
    }

    private static boolean F(Notification notification) {
        Bundle bundleN = o0.n(notification);
        return bundleN != null && bundleN.getBoolean(f20027f);
    }

    @androidx.annotation.n0
    public static l2 p(@androidx.annotation.n0 Context context) {
        return new l2(context);
    }

    @androidx.annotation.n0
    public static Set<String> q(@androidx.annotation.n0 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), f20032k);
        synchronized (f20033l) {
            if (string != null) {
                if (!string.equals(f20034m)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f20035n = hashSet;
                    f20034m = string;
                }
                set = f20035n;
            } else {
                set = f20035n;
            }
            throw th;
        }
        return set;
    }

    @androidx.annotation.n0
    public List<NotificationChannel> A() {
        return Build.VERSION.SDK_INT >= 26 ? b.k(this.f20046b) : Collections.emptyList();
    }

    @androidx.annotation.n0
    public List<e0> B() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> listA = A();
            if (!listA.isEmpty()) {
                ArrayList arrayList = new ArrayList(listA.size());
                Iterator<NotificationChannel> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(new e0(it.next()));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @androidx.annotation.z0("android.permission.POST_NOTIFICATIONS")
    public void C(int i10, @androidx.annotation.n0 Notification notification) {
        D(null, i10, notification);
    }

    @androidx.annotation.z0("android.permission.POST_NOTIFICATIONS")
    public void D(@androidx.annotation.p0 String str, int i10, @androidx.annotation.n0 Notification notification) {
        if (!F(notification)) {
            this.f20046b.notify(str, i10, notification);
        } else {
            E(new f(this.f20045a.getPackageName(), i10, str, notification));
            this.f20046b.cancel(str, i10);
        }
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f20046b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f20045a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f20045a.getApplicationInfo();
        String packageName = this.f20045a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod(f20025d, cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField(f20026e).get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(@androidx.annotation.p0 String str, int i10) {
        this.f20046b.cancel(str, i10);
    }

    public void d() {
        this.f20046b.cancelAll();
    }

    public void e(@androidx.annotation.n0 NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f20046b, notificationChannel);
        }
    }

    public void f(@androidx.annotation.n0 e0 e0Var) {
        e(e0Var.m());
    }

    public void g(@androidx.annotation.n0 NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.b(this.f20046b, notificationChannelGroup);
        }
    }

    public void h(@androidx.annotation.n0 k0 k0Var) {
        g(k0Var.f());
    }

    public void i(@androidx.annotation.n0 List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.c(this.f20046b, list);
        }
    }

    public void j(@androidx.annotation.n0 List<k0> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<k0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f());
        }
        b.c(this.f20046b, arrayList);
    }

    public void k(@androidx.annotation.n0 List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.d(this.f20046b, list);
        }
    }

    public void l(@androidx.annotation.n0 List<e0> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<e0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m());
        }
        b.d(this.f20046b, arrayList);
    }

    public void m(@androidx.annotation.n0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.e(this.f20046b, str);
        }
    }

    public void n(@androidx.annotation.n0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.f(this.f20046b, str);
        }
    }

    public void o(@androidx.annotation.n0 Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel notificationChannel : b.k(this.f20046b)) {
                if (!collection.contains(b.g(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(d.b(notificationChannel)))) {
                    b.e(this.f20046b, b.g(notificationChannel));
                }
            }
        }
    }

    public int r() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.b(this.f20046b);
        }
        return -1000;
    }

    @androidx.annotation.p0
    public NotificationChannel s(@androidx.annotation.n0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.i(this.f20046b, str);
        }
        return null;
    }

    @androidx.annotation.p0
    public NotificationChannel t(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        return Build.VERSION.SDK_INT >= 30 ? d.a(this.f20046b, str, str2) : s(str);
    }

    @androidx.annotation.p0
    public e0 u(@androidx.annotation.n0 String str) {
        NotificationChannel notificationChannelS;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannelS = s(str)) == null) {
            return null;
        }
        return new e0(notificationChannelS);
    }

    @androidx.annotation.p0
    public e0 v(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        NotificationChannel notificationChannelT;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannelT = t(str, str2)) == null) {
            return null;
        }
        return new e0(notificationChannelT);
    }

    @androidx.annotation.p0
    public NotificationChannelGroup w(@androidx.annotation.n0 String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return c.a(this.f20046b, str);
        }
        if (i10 >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : y()) {
                if (b.h(notificationChannelGroup).equals(str)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    @androidx.annotation.p0
    public k0 x(@androidx.annotation.n0 String str) {
        NotificationChannelGroup notificationChannelGroupW;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            NotificationChannelGroup notificationChannelGroupW2 = w(str);
            if (notificationChannelGroupW2 != null) {
                return new k0(notificationChannelGroupW2);
            }
            return null;
        }
        if (i10 < 26 || (notificationChannelGroupW = w(str)) == null) {
            return null;
        }
        return new k0(notificationChannelGroupW, A());
    }

    @androidx.annotation.n0
    public List<NotificationChannelGroup> y() {
        return Build.VERSION.SDK_INT >= 26 ? b.j(this.f20046b) : Collections.emptyList();
    }

    @androidx.annotation.n0
    public List<k0> z() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            List<NotificationChannelGroup> listY = y();
            if (!listY.isEmpty()) {
                List<NotificationChannel> listEmptyList = i10 >= 28 ? Collections.emptyList() : A();
                ArrayList arrayList = new ArrayList(listY.size());
                for (NotificationChannelGroup notificationChannelGroup : listY) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new k0(notificationChannelGroup));
                    } else {
                        arrayList.add(new k0(notificationChannelGroup, listEmptyList));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }
}
