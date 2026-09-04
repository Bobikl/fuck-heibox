package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ColorResourcesTableCreator.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final short f53645a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final short f53646b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final short f53647c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final short f53648d = 513;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final short f53649e = 514;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f53650f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f53651g = 127;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f53652h = "color";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte f53653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d f53654j = new d(1, "android");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Comparator<b> f53655k = new a();

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.f53658c - bVar2.f53658c;
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f53656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte f53657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final short f53658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f53659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.l
        private final int f53660e;

        b(int i10, String str, int i11) {
            this.f53659d = str;
            this.f53660e = i11;
            this.f53658c = (short) (65535 & i10);
            this.f53657b = (byte) ((i10 >> 16) & 255);
            this.f53656a = (byte) ((i10 >> 24) & 255);
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final short f53661f = 288;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f53662g = 128;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0423e f53663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f53664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f53665c = new h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f53666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final k f53667e;

        c(d dVar, List<b> list) {
            this.f53664b = dVar;
            String[] strArr = new String[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                strArr[i10] = list.get(i10).f53659d;
            }
            this.f53666d = new h(true, strArr);
            this.f53667e = new k(list);
            this.f53663a = new C0423e(e.f53647c, f53661f, a());
        }

        int a() {
            return this.f53665c.a() + bb.c.b.C2 + this.f53666d.a() + this.f53667e.b();
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f53663a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(e.j(this.f53664b.f53668a));
            char[] charArray = this.f53664b.f53669b.toCharArray();
            for (int i10 = 0; i10 < 128; i10++) {
                if (i10 < charArray.length) {
                    byteArrayOutputStream.write(e.h(charArray[i10]));
                } else {
                    byteArrayOutputStream.write(e.h((char) 0));
                }
            }
            byteArrayOutputStream.write(e.j(bb.c.b.C2));
            byteArrayOutputStream.write(e.j(0));
            byteArrayOutputStream.write(e.j(this.f53665c.a() + bb.c.b.C2));
            byteArrayOutputStream.write(e.j(0));
            byteArrayOutputStream.write(e.j(0));
            this.f53665c.c(byteArrayOutputStream);
            this.f53666d.c(byteArrayOutputStream);
            this.f53667e.c(byteArrayOutputStream);
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f53669b;

        d(int i10, String str) {
            this.f53668a = i10;
            this.f53669b = str;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class C0423e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short f53670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final short f53671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f53672c;

        C0423e(short s10, short s11, int i10) {
            this.f53670a = s10;
            this.f53671b = s11;
            this.f53672c = i10;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(e.k(this.f53670a));
            byteArrayOutputStream.write(e.k(this.f53671b));
            byteArrayOutputStream.write(e.j(this.f53672c));
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final short f53673c = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final short f53674d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final short f53675e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte f53676f = 28;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f53677g = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f53678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53679b;

        f(int i10, @androidx.annotation.l int i11) {
            this.f53678a = i10;
            this.f53679b = i11;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(e.k((short) 8));
            byteArrayOutputStream.write(e.k((short) 2));
            byteArrayOutputStream.write(e.j(this.f53678a));
            byteArrayOutputStream.write(e.k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(e.j(this.f53679b));
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final short f53680e = 12;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0423e f53681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53682b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<c> f53684d = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h f53683c = new h(new String[0]);

        g(Map<d, List<b>> map) {
            this.f53682b = map.size();
            for (Map.Entry<d, List<b>> entry : map.entrySet()) {
                List<b> value = entry.getValue();
                Collections.sort(value, e.f53655k);
                this.f53684d.add(new c(entry.getKey(), value));
            }
            this.f53681a = new C0423e((short) 2, (short) 12, a());
        }

        private int a() {
            Iterator<c> it = this.f53684d.iterator();
            int iA = 0;
            while (it.hasNext()) {
                iA += it.next().a();
            }
            return this.f53683c.a() + 12 + iA;
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f53681a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(e.j(this.f53682b));
            this.f53683c.c(byteArrayOutputStream);
            Iterator<c> it = this.f53684d.iterator();
            while (it.hasNext()) {
                it.next().b(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class h {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final short f53685m = 28;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f53686n = 256;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f53687o = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0423e f53688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f53690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f53691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f53692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<Integer> f53693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<Integer> f53694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List<byte[]> f53695h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List<List<i>> f53696i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f53697j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f53698k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f53699l;

        h(boolean z10, String... strArr) {
            this.f53693f = new ArrayList();
            this.f53694g = new ArrayList();
            this.f53695h = new ArrayList();
            this.f53696i = new ArrayList();
            this.f53697j = z10;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<i>> pairB = b(str);
                this.f53693f.add(Integer.valueOf(length));
                Object obj = pairB.first;
                length += ((byte[]) obj).length;
                this.f53695h.add((byte[]) obj);
                this.f53696i.add((List) pairB.second);
            }
            int size = 0;
            for (List<i> list : this.f53696i) {
                for (i iVar : list) {
                    this.f53693f.add(Integer.valueOf(length));
                    length += iVar.f53700a.length;
                    this.f53695h.add(iVar.f53700a);
                }
                this.f53694g.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i10 = length % 4;
            int i11 = i10 == 0 ? 0 : 4 - i10;
            this.f53698k = i11;
            int size2 = this.f53695h.size();
            this.f53689b = size2;
            this.f53690c = this.f53695h.size() - strArr.length;
            boolean z11 = this.f53695h.size() - strArr.length > 0;
            if (!z11) {
                this.f53694g.clear();
                this.f53696i.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.f53694g.size() * 4);
            this.f53691d = size3;
            int i12 = length + i11;
            this.f53692e = z11 ? size3 + i12 : 0;
            int i13 = size3 + i12 + (z11 ? size : 0);
            this.f53699l = i13;
            this.f53688a = new C0423e((short) 1, f53685m, i13);
        }

        h(String... strArr) {
            this(false, strArr);
        }

        private Pair<byte[], List<i>> b(String str) {
            return new Pair<>(this.f53697j ? e.m(str) : e.l(str), Collections.emptyList());
        }

        int a() {
            return this.f53699l;
        }

        void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f53688a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(e.j(this.f53689b));
            byteArrayOutputStream.write(e.j(this.f53690c));
            byteArrayOutputStream.write(e.j(this.f53697j ? 256 : 0));
            byteArrayOutputStream.write(e.j(this.f53691d));
            byteArrayOutputStream.write(e.j(this.f53692e));
            Iterator<Integer> it = this.f53693f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(e.j(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.f53694g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(e.j(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.f53695h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i10 = this.f53698k;
            if (i10 > 0) {
                byteArrayOutputStream.write(new byte[i10]);
            }
            Iterator<List<i>> it4 = this.f53696i.iterator();
            while (it4.hasNext()) {
                Iterator<i> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(e.j(-1));
            }
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f53700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f53703d;

        private i() {
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(e.j(this.f53701b));
            byteArrayOutputStream.write(e.j(this.f53702c));
            byteArrayOutputStream.write(e.j(this.f53703d));
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f53704f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final short f53705g = 84;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final byte f53706h = 64;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0423e f53707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f53709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f53710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final f[] f53711e;

        j(List<b> list, Set<Short> set, int i10) {
            byte[] bArr = new byte[64];
            this.f53709c = bArr;
            this.f53708b = i10;
            bArr[0] = 64;
            this.f53711e = new f[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f53711e[i11] = new f(i11, list.get(i11).f53660e);
            }
            this.f53710d = new int[i10];
            int i12 = 0;
            for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
                if (set.contains(Short.valueOf(s10))) {
                    this.f53710d[s10] = i12;
                    i12 += 16;
                } else {
                    this.f53710d[s10] = -1;
                }
            }
            this.f53707a = new C0423e(e.f53648d, f53705g, a());
        }

        private int b() {
            return c() + 84;
        }

        private int c() {
            return this.f53710d.length * 4;
        }

        int a() {
            return b() + (this.f53711e.length * 16);
        }

        void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f53707a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{e.f53653i, 0, 0, 0});
            byteArrayOutputStream.write(e.j(this.f53708b));
            byteArrayOutputStream.write(e.j(b()));
            byteArrayOutputStream.write(this.f53709c);
            for (int i10 : this.f53710d) {
                byteArrayOutputStream.write(e.j(i10));
            }
            for (f fVar : this.f53711e) {
                fVar.a(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    public static class k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final short f53712e = 16;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f53713f = 1073741824;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0423e f53714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f53716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j f53717d;

        k(List<b> list) {
            this.f53715b = list.get(list.size() - 1).f53658c + 1;
            HashSet hashSet = new HashSet();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f53658c));
            }
            this.f53716c = new int[this.f53715b];
            for (short s10 = 0; s10 < this.f53715b; s10 = (short) (s10 + 1)) {
                if (hashSet.contains(Short.valueOf(s10))) {
                    this.f53716c[s10] = 1073741824;
                }
            }
            this.f53714a = new C0423e(e.f53649e, (short) 16, a());
            this.f53717d = new j(list, hashSet, this.f53715b);
        }

        private int a() {
            return (this.f53715b * 4) + 16;
        }

        int b() {
            return a() + this.f53717d.a();
        }

        void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f53714a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{e.f53653i, 0, 0, 0});
            byteArrayOutputStream.write(e.j(this.f53715b));
            for (int i10 : this.f53716c) {
                byteArrayOutputStream.write(e.j(i10));
            }
            this.f53717d.d(byteArrayOutputStream);
        }
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] h(char c10) {
        return new byte[]{(byte) (c10 & 255), (byte) ((c10 >> '\b') & 255)};
    }

    static byte[] i(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        d dVar2 = new d(127, context.getPackageName());
        HashMap map2 = new HashMap();
        b bVar = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            b bVar2 = new b(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + bVar2.f53659d + ", typeId=" + Integer.toHexString(bVar2.f53657b & 255));
            }
            if (bVar2.f53656a == 1) {
                dVar = f53654j;
            } else {
                if (bVar2.f53656a != 127) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) bVar2.f53656a));
                }
                dVar = dVar2;
            }
            if (!map2.containsKey(dVar)) {
                map2.put(dVar, new ArrayList());
            }
            ((List) map2.get(dVar)).add(bVar2);
            bVar = bVar2;
        }
        byte b10 = bVar.f53657b;
        f53653i = b10;
        if (b10 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new g(map2).b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] j(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] k(short s10) {
        return new byte[]{(byte) (s10 & 255), (byte) ((s10 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] l(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] bArrK = k((short) charArray.length);
        bArr[0] = bArrK[0];
        bArr[1] = bArrK[1];
        for (int i10 = 0; i10 < charArray.length; i10++) {
            byte[] bArrH = h(charArray[i10]);
            int i11 = i10 * 2;
            bArr[i11 + 2] = bArrH[0];
            bArr[i11 + 3] = bArrH[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}
