package com.igexin.push.util;

/* JADX INFO: loaded from: classes6.dex */
public class k extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f64056g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f64057h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86, 87, org.apache.tools.tar.c.R, 89, 90, 97, 98, 99, 100, 101, 102, org.apache.tools.tar.c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, org.apache.tools.tar.c.Q, 121, 122, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 43, 47};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f64058i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, org.apache.tools.tar.c.N, org.apache.tools.tar.c.O, 77, 78, 79, 80, 81, 82, org.apache.tools.tar.c.P, 84, 85, 86, 87, org.apache.tools.tar.c.R, 89, 90, 97, 98, 99, 100, 101, 102, org.apache.tools.tar.c.S, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, org.apache.tools.tar.c.Q, 121, 122, org.apache.tools.tar.c.F, org.apache.tools.tar.c.G, org.apache.tools.tar.c.H, org.apache.tools.tar.c.I, org.apache.tools.tar.c.J, org.apache.tools.tar.c.K, org.apache.tools.tar.c.L, org.apache.tools.tar.c.M, 56, 57, 45, 95};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f64059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f64061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f64062f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f64063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f64064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final byte[] f64065l;

    public k(int i10, byte[] bArr) {
        this.f64049a = bArr;
        this.f64060d = (i10 & 1) == 0;
        boolean z10 = (i10 & 2) == 0;
        this.f64061e = z10;
        this.f64062f = (i10 & 4) != 0;
        this.f64065l = (i10 & 8) == 0 ? f64057h : f64058i;
        this.f64063j = new byte[2];
        this.f64059c = 0;
        this.f64064k = z10 ? 19 : -1;
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
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.util.k.a(byte[], int, int, boolean):boolean");
    }
}
