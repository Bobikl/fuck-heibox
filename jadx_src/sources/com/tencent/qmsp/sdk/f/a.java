package com.tencent.qmsp.sdk.f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f101921e = new a(102400);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Comparator<byte[]> f101922f = new C0995a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<byte[]> f101923a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<byte[]> f101924b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f101925c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f101926d;

    /* JADX INFO: renamed from: com.tencent.qmsp.sdk.f.a$a, reason: collision with other inner class name */
    public static final class C0995a implements Comparator<byte[]> {
        C0995a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public a(int i10) {
        this.f101926d = i10;
    }

    public static a a() {
        return f101921e;
    }

    private synchronized void b() {
        while (this.f101925c > this.f101926d) {
            byte[] bArrRemove = this.f101923a.remove(0);
            this.f101924b.remove(bArrRemove);
            this.f101925c -= bArrRemove.length;
        }
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f101926d) {
                this.f101923a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f101924b, bArr, f101922f);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f101924b.add(iBinarySearch, bArr);
                this.f101925c += bArr.length;
                b();
            }
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f101924b.size(); i11++) {
            byte[] bArr = this.f101924b.get(i11);
            if (bArr.length >= i10) {
                this.f101925c -= bArr.length;
                this.f101924b.remove(i11);
                this.f101923a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }
}
