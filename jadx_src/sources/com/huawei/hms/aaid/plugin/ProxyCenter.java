package com.huawei.hms.aaid.plugin;

/* JADX INFO: loaded from: classes7.dex */
public class ProxyCenter {
    private PushProxy proxy;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static ProxyCenter f60252a = new ProxyCenter();
    }

    private static ProxyCenter getInstance() {
        return a.f60252a;
    }

    public static PushProxy getProxy() {
        return getInstance().proxy;
    }

    public static void register(PushProxy pushProxy) {
        getInstance().proxy = pushProxy;
    }
}
