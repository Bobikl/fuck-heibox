package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ContentMetadataMutations.java */
/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f51062a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f51063b = new ArrayList();

    private n a(String str, Object obj) {
        this.f51062a.put((String) com.google.android.exoplayer2.util.a.g(str), com.google.android.exoplayer2.util.a.g(obj));
        this.f51063b.remove(str);
        return this;
    }

    public static n h(n nVar, long j10) {
        return nVar.e(m.f51061c, j10);
    }

    public static n i(n nVar, @p0 Uri uri) {
        return uri == null ? nVar.d(m.f51060b) : nVar.f(m.f51060b, uri.toString());
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap(this.f51062a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f51063b));
    }

    public n d(String str) {
        this.f51063b.add(str);
        this.f51062a.remove(str);
        return this;
    }

    public n e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    public n f(String str, String str2) {
        return a(str, str2);
    }

    public n g(String str, byte[] bArr) {
        return a(str, Arrays.copyOf(bArr, bArr.length));
    }
}
