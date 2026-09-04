package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SystemManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SystemManager f60325a = new SystemManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f60326b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SystemNotifier f60327c = new a();

    public class a implements SystemNotifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SystemObserver> f60328a = new ArrayList();

        a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i10) {
            synchronized (SystemManager.f60326b) {
                Iterator<SystemObserver> it = this.f60328a.iterator();
                while (it.hasNext()) {
                    if (it.next().onNoticeResult(i10)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i10) {
            synchronized (SystemManager.f60326b) {
                Iterator<SystemObserver> it = this.f60328a.iterator();
                while (it.hasNext()) {
                    if (it.next().onUpdateResult(i10)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.f60326b) {
                Iterator<SystemObserver> it = this.f60328a.iterator();
                while (it.hasNext()) {
                    if (it.next().onSolutionResult(intent, str)) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver == null || this.f60328a.contains(systemObserver)) {
                return;
            }
            synchronized (SystemManager.f60326b) {
                this.f60328a.add(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.f60326b) {
                this.f60328a.remove(systemObserver);
            }
        }
    }

    private SystemManager() {
    }

    public static SystemManager getInstance() {
        return f60325a;
    }

    public static SystemNotifier getSystemNotifier() {
        return f60327c;
    }

    public void notifyNoticeResult(int i10) {
        f60327c.notifyNoticeObservers(i10);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        f60327c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i10) {
        f60327c.notifyObservers(i10);
    }
}
