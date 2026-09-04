package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LazyHeaders.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<j>> f41357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f41358d;

    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f41359d = "User-Agent";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f41360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Map<String, List<j>> f41361f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f41362a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, List<j>> f41363b = f41361f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f41364c = true;

        static {
            String strG = g();
            f41360e = strG;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strG)) {
                map.put("User-Agent", Collections.singletonList(new b(strG)));
            }
            f41361f = Collections.unmodifiableMap(map);
        }

        private Map<String, List<j>> d() {
            HashMap map = new HashMap(this.f41363b.size());
            for (Map.Entry<String, List<j>> entry : this.f41363b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        private void e() {
            if (this.f41362a) {
                this.f41362a = false;
                this.f41363b = d();
            }
        }

        private List<j> f(String str) {
            List<j> list = this.f41363b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f41363b.put(str, arrayList);
            return arrayList;
        }

        @j1
        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(@n0 String str, @n0 j jVar) {
            if (this.f41364c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public a b(@n0 String str, @n0 String str2) {
            return a(str, new b(str2));
        }

        public k c() {
            this.f41362a = true;
            return new k(this.f41363b);
        }

        public a h(@n0 String str, @p0 j jVar) {
            e();
            if (jVar == null) {
                this.f41363b.remove(str);
            } else {
                List<j> listF = f(str);
                listF.clear();
                listF.add(jVar);
            }
            if (this.f41364c && "User-Agent".equalsIgnoreCase(str)) {
                this.f41364c = false;
            }
            return this;
        }

        public a i(@n0 String str, @p0 String str2) {
            return h(str, str2 == null ? null : new b(str2));
        }
    }

    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        private final String f41365a;

        b(@n0 String str) {
            this.f41365a = str;
        }

        @Override // com.bumptech.glide.load.model.j
        public String a() {
            return this.f41365a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f41365a.equals(((b) obj).f41365a);
            }
            return false;
        }

        public int hashCode() {
            return this.f41365a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f41365a + "'}";
        }
    }

    k(Map<String, List<j>> map) {
        this.f41357c = Collections.unmodifiableMap(map);
    }

    @n0
    private String a(@n0 List<j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = list.get(i10).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f41357c.entrySet()) {
            String strA = a(entry.getValue());
            if (!TextUtils.isEmpty(strA)) {
                map.put(entry.getKey(), strA);
            }
        }
        return map;
    }

    @Override // com.bumptech.glide.load.model.i
    public Map<String, String> b() {
        if (this.f41358d == null) {
            synchronized (this) {
                if (this.f41358d == null) {
                    this.f41358d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f41358d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f41357c.equals(((k) obj).f41357c);
        }
        return false;
    }

    public int hashCode() {
        return this.f41357c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f41357c + '}';
    }
}
