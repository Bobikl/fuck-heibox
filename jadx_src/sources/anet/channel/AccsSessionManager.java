package anet.channel;

import android.content.Intent;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class AccsSessionManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CopyOnWriteArraySet<ISessionListener> f29489c = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SessionCenter f29490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Set<String> f29491b = Collections.EMPTY_SET;

    AccsSessionManager(SessionCenter sessionCenter) {
        this.f29490a = null;
        this.f29490a = sessionCenter;
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ALog.d("awcn.AccsSessionManager", "closeSessions", this.f29490a.f29569c, "host", str);
        this.f29490a.a(str).b(false);
    }

    private boolean b() {
        return !(GlobalAppRuntimeInfo.isAppBackground() && AwcnConfig.isAccsSessionCreateForbiddenInBg()) && NetworkStatusHelper.isConnected();
    }

    public synchronized void checkAndStartSession() {
        Collection<SessionInfo> collectionA = this.f29490a.f29573g.a();
        Set<String> treeSet = Collections.EMPTY_SET;
        if (!collectionA.isEmpty()) {
            treeSet = new TreeSet<>();
        }
        for (SessionInfo sessionInfo : collectionA) {
            if (sessionInfo.isKeepAlive) {
                treeSet.add(StringUtils.concatString(StrategyCenter.getInstance().getSchemeByHost(sessionInfo.host, sessionInfo.isAccs ? "https" : "http"), HttpConstant.SCHEME_SPLIT, sessionInfo.host));
            }
        }
        for (String str : this.f29491b) {
            if (!treeSet.contains(str)) {
                a(str);
            }
        }
        if (b()) {
            for (String str2 : treeSet) {
                try {
                    this.f29490a.get(str2, ConnType.TypeLevel.SPDY, 0L);
                } catch (Exception unused) {
                    ALog.e("start session failed", null, "host", str2);
                }
            }
            this.f29491b = treeSet;
        }
    }

    public synchronized void forceCloseSession(boolean z10) {
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.AccsSessionManager", "forceCloseSession", this.f29490a.f29569c, "reCreate", Boolean.valueOf(z10));
        }
        Iterator<String> it = this.f29491b.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        if (z10) {
            checkAndStartSession();
        }
    }

    public void notifyListener(Intent intent) {
        ThreadPoolExecutorFactory.submitScheduledTask(new a(this, intent));
    }

    public void registerListener(ISessionListener iSessionListener) {
        if (iSessionListener != null) {
            f29489c.add(iSessionListener);
        }
    }

    public void unregisterListener(ISessionListener iSessionListener) {
        f29489c.remove(iSessionListener);
    }
}
