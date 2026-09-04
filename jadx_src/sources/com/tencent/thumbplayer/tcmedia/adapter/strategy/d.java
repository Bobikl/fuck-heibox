package com.tencent.thumbplayer.tcmedia.adapter.strategy;

import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f102420c;

    public d(com.tencent.thumbplayer.tcmedia.adapter.strategy.a.a aVar) {
        super(aVar);
        this.f102419b = 0;
        int[] iArrC = aVar.c();
        this.f102420c = iArrC;
        if (iArrC == null || iArrC.length == 0) {
            this.f102420c = new int[1];
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.b, com.tencent.thumbplayer.tcmedia.adapter.strategy.a
    public int a(com.tencent.thumbplayer.tcmedia.adapter.b bVar) {
        int[] iArr = this.f102420c;
        int length = iArr.length;
        int i10 = this.f102419b;
        int i11 = length > i10 ? iArr[i10] : 0;
        int i12 = (!(i11 == 2 || i11 == 3) || b(bVar)) ? i11 : 0;
        TPLogUtil.i("TPThumbPlayer[TPExtStrategy.java]", "strategyForOpen, playerType:".concat(String.valueOf(i12)));
        return i12;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.b, com.tencent.thumbplayer.tcmedia.adapter.strategy.a
    public int a(com.tencent.thumbplayer.tcmedia.adapter.b bVar, com.tencent.thumbplayer.tcmedia.adapter.strategy.a.b bVar2) {
        int i10;
        if (bVar2 != null && bVar2.a() == 0) {
            return a(bVar);
        }
        int[] iArr = this.f102420c;
        int length = iArr.length - 1;
        int i11 = this.f102419b;
        if (length > i11) {
            int i12 = i11 + 1;
            this.f102419b = i12;
            i10 = iArr[i12];
        } else {
            i10 = 0;
        }
        int i13 = (!(i10 == 2 || i10 == 3) || b(bVar)) ? i10 : 0;
        TPLogUtil.i("TPThumbPlayer[TPExtStrategy.java]", "strategyForRetry, playerType:".concat(String.valueOf(i13)));
        return i13;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.strategy.b, com.tencent.thumbplayer.tcmedia.adapter.strategy.a
    public int[] a() {
        StringBuilder sb2;
        int i10;
        int[] iArr = {-1};
        int i11 = this.f102419b;
        int[] iArr2 = this.f102420c;
        if (i11 >= iArr2.length) {
            sb2 = new StringBuilder("strategyForDec error, decType:");
            i10 = iArr[0];
        } else {
            int i12 = iArr2[i11];
            if (i12 == 1 || i12 == 2) {
                iArr[0] = 102;
            } else if (i12 == 3) {
                iArr[0] = 101;
            }
            sb2 = new StringBuilder("strategyForDec, decType:");
            i10 = iArr[0];
        }
        sb2.append(i10);
        TPLogUtil.i("TPThumbPlayer[TPExtStrategy.java]", sb2.toString());
        return iArr;
    }
}
