package com.xiaomi.push;

import android.net.NetworkInfo;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NetworkInfo f106873a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ConcurrentHashMap<String, Object> f214a = new ConcurrentHashMap<>();

    public bj(NetworkInfo networkInfo) {
        this.f106873a = networkInfo;
    }

    private <T> T a(String str) {
        Object objValueOf;
        if (this.f214a.containsKey(str)) {
            return (T) this.f214a.get(str);
        }
        synchronized (str) {
            objValueOf = null;
            if (!this.f214a.contains(str)) {
                switch (str) {
                    case "getType":
                        objValueOf = Integer.valueOf(this.f106873a.getType());
                        break;
                    case "getTypeName":
                        objValueOf = this.f106873a.getTypeName();
                        break;
                    case "getSubtype":
                        objValueOf = Integer.valueOf(this.f106873a.getSubtype());
                        break;
                    case "getSubtypeName":
                        objValueOf = this.f106873a.getSubtypeName();
                        break;
                    case "isConnectedOrConnecting":
                        objValueOf = Boolean.valueOf(this.f106873a.isConnectedOrConnecting());
                        break;
                    case "isConnected":
                        objValueOf = Boolean.valueOf(this.f106873a.isConnected());
                        break;
                    case "isAvailable":
                        objValueOf = Boolean.valueOf(this.f106873a.isAvailable());
                        break;
                    case "isFailover":
                        objValueOf = Boolean.valueOf(this.f106873a.isFailover());
                        break;
                    case "isRoaming":
                        objValueOf = Boolean.valueOf(this.f106873a.isRoaming());
                        break;
                    case "getState":
                        objValueOf = this.f106873a.getState();
                        break;
                    case "getDetailedState":
                        objValueOf = this.f106873a.getDetailedState();
                        break;
                    case "getReason":
                        objValueOf = this.f106873a.getReason();
                        break;
                    case "getExtraInfo":
                        objValueOf = this.f106873a.getExtraInfo();
                        break;
                    case "toString":
                        objValueOf = this.f106873a.toString();
                        break;
                }
                if (objValueOf != null) {
                    this.f214a.put(str, objValueOf);
                }
            }
        }
        return (T) objValueOf;
    }

    public int a() {
        return ((Integer) a("getType")).intValue();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public NetworkInfo.DetailedState m180a() {
        return (NetworkInfo.DetailedState) a("getDetailedState");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public NetworkInfo.State m181a() {
        return (NetworkInfo.State) a("getState");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m182a() {
        return (String) a("getTypeName");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m183a() {
        return ((Boolean) a("isConnected")).booleanValue();
    }

    public int b() {
        return ((Integer) a("getSubtype")).intValue();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public String m184b() {
        return (String) a("getSubtypeName");
    }

    public String c() {
        return (String) a("getExtraInfo");
    }

    public String toString() {
        return (String) a("toString");
    }
}
