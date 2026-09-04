package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: HighLevelEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String[] f61627b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[][] f61628c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f61629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[][] f61630e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f61631a;

    /* JADX INFO: compiled from: HighLevelEncoder.java */
    public static class a<State> implements Comparator<b7> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b7 b7Var, b7 b7Var2) {
            return b7Var.b() - b7Var2.b();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        f61629d = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f61629d[0][i10] = (i10 - 65) + 2;
        }
        f61629d[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f61629d[1][i11] = (i11 - 97) + 2;
        }
        f61629d[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f61629d[2][i12] = (i12 - 48) + 2;
        }
        int[] iArr2 = f61629d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f61629d[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f61629d[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f61630e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        try {
            int[][] iArr7 = f61630e;
            if (w7.a(iArr7, 0) && w7.a(iArr7[0], 4)) {
                iArr7[0][4] = 0;
            }
            if (w7.a(iArr7, 1) && w7.a(iArr7[1], 4)) {
                iArr7[1][4] = 0;
            }
            if (w7.a(iArr7, 1) && w7.a(iArr7[1], 0)) {
                iArr7[1][0] = 28;
            }
            if (w7.a(iArr7, 3) && w7.a(iArr7[3], 4)) {
                iArr7[3][4] = 0;
            }
            if (w7.a(iArr7, 2) && w7.a(iArr7[2], 4)) {
                iArr7[2][4] = 0;
            }
            if (w7.a(iArr7, 2) && w7.a(iArr7[2], 0)) {
                iArr7[2][0] = 15;
            }
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public c4(byte[] bArr) {
        this.f61631a = bArr;
    }

    private static Collection<b7> a(Iterable<b7> iterable) {
        LinkedList linkedList = new LinkedList();
        for (b7 b7Var : iterable) {
            boolean z10 = true;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                b7 b7Var2 = (b7) it.next();
                if (b7Var2.a(b7Var)) {
                    z10 = false;
                    break;
                }
                if (b7Var.a(b7Var2)) {
                    it.remove();
                }
            }
            if (z10) {
                linkedList.add(b7Var);
            }
        }
        return linkedList;
    }

    private Collection<b7> a(Iterable<b7> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator<b7> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next(), i10, linkedList);
        }
        return a(linkedList);
    }

    private static Collection<b7> a(Iterable<b7> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<b7> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next(), i10, i11, linkedList);
        }
        return a(linkedList);
    }

    private static void a(b7 b7Var, int i10, int i11, Collection<b7> collection) {
        b7 b7VarB = b7Var.b(i10);
        collection.add(b7VarB.a(4, i11));
        if (b7Var.c() != 4) {
            collection.add(b7VarB.b(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(b7VarB.a(2, 16 - i11).a(2, 1));
        }
        if (b7Var.a() > 0) {
            collection.add(b7Var.a(i10).a(i10 + 1));
        }
    }

    private void a(b7 b7Var, int i10, Collection<b7> collection) {
        if (w7.a(this.f61631a, i10)) {
            char c10 = (char) (this.f61631a[i10] & 255);
            int[][] iArr = f61629d;
            boolean z10 = w7.a(iArr, b7Var.c()) && w7.a(iArr[b7Var.c()], (int) c10) && iArr[b7Var.c()][c10] > 0;
            b7 b7VarB = null;
            for (int i11 = 0; i11 <= 4; i11++) {
                int[][] iArr2 = f61629d;
                int i12 = (w7.a(iArr2, i11) && w7.a(iArr2[i11], (int) c10)) ? iArr2[i11][c10] : 0;
                if (i12 > 0) {
                    if (b7VarB == null) {
                        b7VarB = b7Var.b(i10);
                    }
                    if (!z10 || i11 == b7Var.c() || i11 == 2) {
                        collection.add(b7VarB.a(i11, i12));
                    }
                    if (!z10 && f61630e[b7Var.c()][i11] >= 0) {
                        collection.add(b7VarB.b(i11, i12));
                    }
                }
            }
            int[][] iArr3 = f61629d;
            if (w7.a(iArr3, b7Var.c()) && w7.a(iArr3[b7Var.c()], (int) c10)) {
                if (b7Var.a() > 0 || iArr3[b7Var.c()][c10] == 0) {
                    collection.add(b7Var.a(i10));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003d  */
    public r a() {
        int i10;
        Collection<b7> collectionSingletonList = Collections.singletonList(b7.f61587e);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f61631a;
            if (i11 >= bArr.length) {
                return ((b7) Collections.min(collectionSingletonList, new a())).a(this.f61631a);
            }
            int i12 = i11 + 1;
            byte b10 = i12 < bArr.length ? bArr[i12] : (byte) 0;
            byte b11 = bArr[i11];
            if (b11 != 13) {
                if (b11 != 44) {
                    if (b11 != 46) {
                        if (b11 == 58 && b10 == 32) {
                            i10 = 5;
                        } else {
                            i10 = 0;
                        }
                    } else if (b10 == 32) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                } else if (b10 == 32) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            } else if (b10 == 10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                collectionSingletonList = a(collectionSingletonList, i11, i10);
                i11 = i12;
            } else {
                collectionSingletonList = a(collectionSingletonList, i11);
            }
            i11++;
        }
    }
}
