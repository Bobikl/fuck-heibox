package com.alipay.sdk.app;

/* JADX INFO: loaded from: classes6.dex */
public class EnvUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static EnvEnum f39433a = EnvEnum.ONLINE;

    public enum EnvEnum {
        ONLINE,
        SANDBOX
    }

    public static EnvEnum a() {
        return f39433a;
    }

    public static boolean b() {
        return f39433a == EnvEnum.SANDBOX;
    }

    public static void c(EnvEnum envEnum) {
        f39433a = envEnum;
    }
}
