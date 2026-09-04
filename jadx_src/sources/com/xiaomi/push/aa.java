package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f106808a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final String f164a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean f165a;

    static {
        String str = ad.f106809a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f164a = str;
        f165a = false;
        f106808a = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            f106808a = 2;
        } else if (str.equalsIgnoreCase("ONEBOX")) {
            f106808a = 3;
        } else {
            f106808a = 1;
        }
    }

    public static int a() {
        return f106808a;
    }

    public static void a(int i10) {
        f106808a = i10;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m141a() {
        return f106808a == 2;
    }

    public static boolean b() {
        return f106808a == 3;
    }
}
