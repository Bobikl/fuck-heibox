package com.umeng.ut.b.a.a;

import android.annotation.SuppressLint;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f106431d = true;

    /* JADX INFO: renamed from: com.umeng.ut.b.a.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1061a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f106432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f106433b;

        AbstractC1061a() {
        }
    }

    public static class b extends AbstractC1061a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final byte[] f106434b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86, 87, org.apache.tools.tar.c.R, 89, 90, 97, 98, 99, 100, 101, 102, org.apache.tools.tar.c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, org.apache.tools.tar.c.Q, 121, 122, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 43, 47};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final byte[] f106435c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86, 87, org.apache.tools.tar.c.R, 89, 90, 97, 98, 99, 100, 101, 102, org.apache.tools.tar.c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, org.apache.tools.tar.c.Q, 121, 122, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 45, 95};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ boolean f106436d = true;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        int f73c;
        private int count;

        /* JADX INFO: renamed from: d, reason: collision with other field name */
        private final byte[] f74d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f106437e;

        /* JADX INFO: renamed from: e, reason: collision with other field name */
        private final byte[] f75e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f106438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f106439g;

        public b(int i10, byte[] bArr) {
            this.f106432a = bArr;
            this.f106437e = (i10 & 1) == 0;
            boolean z10 = (i10 & 2) == 0;
            this.f106438f = z10;
            this.f106439g = (i10 & 4) != 0;
            this.f75e = (i10 & 8) == 0 ? f106434b : f106435c;
            this.f74d = new byte[2];
            this.f73c = 0;
            this.count = z10 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd A[EDGE_INSN: B:32:0x00dd->B:22:0x008a BREAK  A[LOOP:0: B:25:0x0090->B:33:0x00e4]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e4 A[LOOP:0: B:25:0x0090->B:33:0x00e4, LOOP_END] */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        public boolean a(byte[] r19, int r20, int r21, boolean r22) {
            /*
                Method dump skipped, instruction units count: 514
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.ut.b.a.a.a.b.a(byte[], int, int, boolean):boolean");
        }
    }

    private a() {
    }

    public static String a(byte[] bArr, int i10) {
        try {
            return new String(m58a(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m58a(byte[] bArr, int i10) {
        return a(bArr, 0, bArr.length, i10);
    }

    @SuppressLint({"Assert"})
    public static byte[] a(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!bVar.f106437e) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (bVar.f106438f && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (bVar.f106439g ? 2 : 1);
        }
        bVar.f106432a = new byte[i13];
        bVar.a(bArr, i10, i11, true);
        if (f106431d || bVar.f106433b == i13) {
            return bVar.f106432a;
        }
        throw new AssertionError();
    }
}
