package com.sina.weibo.sdk.net;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f96824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Bundle f96825j = new Bundle();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bundle f96826k = new Bundle();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object<File>> f96827l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, byte[]> f96828m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f96829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f96830o;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f96831i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Bundle f96832j = new Bundle();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Bundle f96833k = new Bundle();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Map<String, Object<File>> f96834l = new HashMap();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Map<String, byte[]> f96835m = new HashMap();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f96836n = 30000;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f96837o = 60000;

        private void a(Bundle bundle, String str, Object obj) {
            if (obj != null) {
                if (obj instanceof String) {
                    bundle.putString(str, String.valueOf(obj));
                    return;
                }
                if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                    return;
                }
                if (obj instanceof Short) {
                    bundle.putShort(str, ((Short) obj).shortValue());
                    return;
                }
                if (obj instanceof Character) {
                    bundle.putChar(str, ((Character) obj).charValue());
                    return;
                }
                if (obj instanceof Byte) {
                    bundle.putByte(str, ((Byte) obj).byteValue());
                    return;
                }
                if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                    return;
                }
                if (obj instanceof Float) {
                    bundle.putFloat(str, ((Float) obj).floatValue());
                    return;
                }
                if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                    return;
                }
                if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof byte[]) {
                    this.f96835m.put(str, (byte[]) obj);
                } else {
                    if (!(obj instanceof Serializable)) {
                        throw new IllegalArgumentException("Unsupported params type!");
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            }
        }

        public final a a(String str, Object obj) {
            a(this.f96832j, str, obj);
            return this;
        }

        public final a b(String str, Object obj) {
            a(this.f96833k, str, obj);
            return this;
        }

        public final e e() {
            return new e(this);
        }
    }

    public e(a aVar) {
        this.f96824i = aVar.f96831i;
        this.f96825j.putAll(aVar.f96832j);
        this.f96826k.putAll(aVar.f96833k);
        this.f96827l.putAll(aVar.f96834l);
        this.f96828m.putAll(aVar.f96835m);
        this.f96829n = aVar.f96836n;
        this.f96830o = aVar.f96837o;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final Bundle d() {
        return this.f96826k;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final int getConnectTimeout() {
        return this.f96829n;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final Bundle getParams() {
        return this.f96825j;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final int getReadTimeout() {
        return this.f96830o;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final String getUrl() {
        return this.f96824i;
    }
}
