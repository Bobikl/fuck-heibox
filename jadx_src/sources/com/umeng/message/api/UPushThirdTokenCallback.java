package com.umeng.message.api;

/* JADX INFO: loaded from: classes4.dex */
public interface UPushThirdTokenCallback {
    public static final String TYPE_FCM = "fcm";
    public static final String TYPE_HONOR = "honor";
    public static final String TYPE_HUAWEI = "huawei";
    public static final String TYPE_MEIZU = "meizu";
    public static final String TYPE_OPPO = "oppo";
    public static final String TYPE_VIVO = "vivo";
    public static final String TYPE_XIAOMI = "xiaomi";

    void onToken(String str, String str2);
}
