package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.p0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DefaultContentMetadata.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f51064f = new o(Collections.emptyMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, byte[]> f51066e;

    public o() {
        this(Collections.emptyMap());
    }

    public o(Map<String, byte[]> map) {
        this.f51066e = Collections.unmodifiableMap(map);
    }

    private static void d(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), h(entry.getValue()));
        }
    }

    private static Map<String, byte[]> e(Map<String, byte[]> map, n nVar) {
        HashMap map2 = new HashMap(map);
        j(map2, nVar.c());
        d(map2, nVar.b());
        return map2;
    }

    private static byte[] h(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(com.google.common.base.c.f56721c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean i(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void j(HashMap<String, byte[]> map, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.remove(list.get(i10));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.m
    public final long a(String str, long j10) {
        byte[] bArr = this.f51066e.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.m
    @p0
    public final String b(String str, @p0 String str2) {
        byte[] bArr = this.f51066e.get(str);
        return bArr != null ? new String(bArr, com.google.common.base.c.f56721c) : str2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.m
    @p0
    public final byte[] c(String str, @p0 byte[] bArr) {
        byte[] bArr2 = this.f51066e.get(str);
        return bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.m
    public final boolean contains(String str) {
        return this.f51066e.containsKey(str);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return i(this.f51066e, ((o) obj).f51066e);
    }

    public o f(n nVar) {
        Map<String, byte[]> mapE = e(this.f51066e, nVar);
        return i(this.f51066e, mapE) ? this : new o(mapE);
    }

    public Set<Map.Entry<String, byte[]>> g() {
        return this.f51066e.entrySet();
    }

    public int hashCode() {
        if (this.f51065d == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f51066e.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f51065d = iHashCode;
        }
        return this.f51065d;
    }
}
