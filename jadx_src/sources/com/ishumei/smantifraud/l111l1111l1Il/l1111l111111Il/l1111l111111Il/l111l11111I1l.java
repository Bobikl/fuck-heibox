package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111I1l {
    private static Comparator<byte[]> l111l1111l1Il = new Comparator<byte[]>() { // from class: com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111I1l.1
        private static int l1111l111111Il(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private final List<byte[]> l1111l111111Il = new ArrayList();
    private final List<byte[]> l111l11111lIl = new ArrayList(64);
    private int l111l11111I1l = 0;
    private final int l111l11111Il = 4096;

    public l111l11111I1l(int i10) {
    }

    private synchronized void l1111l111111Il() {
        while (this.l111l11111I1l > this.l111l11111Il) {
            byte[] bArrRemove = this.l1111l111111Il.remove(0);
            this.l111l11111lIl.remove(bArrRemove);
            this.l111l11111I1l -= bArrRemove.length;
        }
    }

    public final synchronized void l1111l111111Il(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.l111l11111Il) {
                this.l1111l111111Il.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.l111l11111lIl, bArr, l111l1111l1Il);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.l111l11111lIl.add(iBinarySearch, bArr);
                this.l111l11111I1l += bArr.length;
                l1111l111111Il();
            }
        }
    }

    public final synchronized byte[] l1111l111111Il(int i10) {
        for (int i11 = 0; i11 < this.l111l11111lIl.size(); i11++) {
            byte[] bArr = this.l111l11111lIl.get(i11);
            if (bArr.length >= i10) {
                this.l111l11111I1l -= bArr.length;
                this.l111l11111lIl.remove(i11);
                this.l1111l111111Il.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }
}
