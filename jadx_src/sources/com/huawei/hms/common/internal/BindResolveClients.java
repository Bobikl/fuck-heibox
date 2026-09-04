package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes7.dex */
public class BindResolveClients {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f60520b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<ResolveClientBean> f60521a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final BindResolveClients f60522a = new BindResolveClients();
    }

    private BindResolveClients() {
        this.f60521a = new ArrayList<>();
    }

    public static BindResolveClients getInstance() {
        return b.f60522a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean zContains;
        synchronized (f60520b) {
            zContains = this.f60521a.contains(resolveClientBean);
        }
        return zContains;
    }

    public void notifyClientReconnect() {
        synchronized (f60520b) {
            ListIterator<ResolveClientBean> listIterator = this.f60521a.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next().clientReconnect();
            }
            this.f60521a.clear();
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f60520b) {
            if (!this.f60521a.contains(resolveClientBean)) {
                this.f60521a.add(resolveClientBean);
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f60520b) {
            if (this.f60521a.contains(resolveClientBean)) {
                ListIterator<ResolveClientBean> listIterator = this.f60521a.listIterator();
                while (listIterator.hasNext()) {
                    if (resolveClientBean.equals(listIterator.next())) {
                        listIterator.remove();
                        break;
                    }
                }
            }
        }
    }

    public void unRegisterAll() {
        synchronized (f60520b) {
            this.f60521a.clear();
        }
    }
}
