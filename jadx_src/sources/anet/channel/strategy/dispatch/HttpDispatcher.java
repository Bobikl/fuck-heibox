package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class HttpDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArraySet<IDispatchEventListener> f29914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private anet.channel.strategy.dispatch.a f29915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f29916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<String> f29917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f29918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f29919f;

    /* JADX INFO: compiled from: Taobao */
    public interface IDispatchEventListener {
        void onEvent(DispatchEvent dispatchEvent);
    }

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static HttpDispatcher f29920a = new HttpDispatcher();

        private a() {
        }
    }

    private HttpDispatcher() {
        this.f29914a = new CopyOnWriteArraySet<>();
        this.f29915b = new anet.channel.strategy.dispatch.a();
        this.f29916c = true;
        this.f29917d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f29918e = new TreeSet();
        this.f29919f = new AtomicBoolean();
        a();
    }

    private void a() {
        if (this.f29919f.get() || GlobalAppRuntimeInfo.getContext() == null || !this.f29919f.compareAndSet(false, true)) {
            return;
        }
        this.f29918e.add(DispatchConstants.getAmdcServerDomain());
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            this.f29918e.addAll(Arrays.asList(DispatchConstants.initHostArray));
        }
    }

    public static HttpDispatcher getInstance() {
        return a.f29920a;
    }

    public static void setInitHosts(List<String> list) {
        if (list != null) {
            DispatchConstants.initHostArray = (String[]) list.toArray(new String[0]);
        }
    }

    void a(DispatchEvent dispatchEvent) {
        Iterator<IDispatchEventListener> it = this.f29914a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEvent(dispatchEvent);
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void addHosts(List<String> list) {
        if (list != null) {
            this.f29918e.addAll(list);
            this.f29917d.clear();
        }
    }

    public void addListener(IDispatchEventListener iDispatchEventListener) {
        this.f29914a.add(iDispatchEventListener);
    }

    public synchronized Set<String> getInitHosts() {
        a();
        return new HashSet(this.f29918e);
    }

    public boolean isInitHostsChanged(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zContains = this.f29917d.contains(str);
        if (!zContains) {
            this.f29917d.add(str);
        }
        return !zContains;
    }

    public void removeListener(IDispatchEventListener iDispatchEventListener) {
        this.f29914a.remove(iDispatchEventListener);
    }

    public void sendAmdcRequest(Set<String> set, int i10) {
        if (!this.f29916c || set == null || set.isEmpty()) {
            ALog.e("awcn.HttpDispatcher", "invalid parameter", null, new Object[0]);
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i("awcn.HttpDispatcher", "sendAmdcRequest", null, "hosts", set.toString());
        }
        HashMap map = new HashMap();
        map.put("hosts", set);
        map.put(DispatchConstants.CONFIG_VERSION, String.valueOf(i10));
        this.f29915b.a(map);
    }

    public void setEnable(boolean z10) {
        this.f29916c = z10;
    }

    public void switchENV() {
        this.f29917d.clear();
        this.f29918e.clear();
        this.f29919f.set(false);
    }
}
