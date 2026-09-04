package com.google.android.exoplayer2.metadata.dvbsi;

import androidx.annotation.p0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.metadata.g;
import com.google.android.exoplayer2.util.d0;
import com.google.common.base.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: AppInfoTableDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f46824a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f46825b = 21;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f46826c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46827d = 116;

    @p0
    private static Metadata c(d0 d0Var) {
        d0Var.s(12);
        int iD = (d0Var.d() + d0Var.h(12)) - 4;
        d0Var.s(44);
        d0Var.t(d0Var.h(12));
        d0Var.s(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM = null;
            if (d0Var.d() >= iD) {
                break;
            }
            d0Var.s(48);
            int iH = d0Var.h(8);
            d0Var.s(4);
            int iD2 = d0Var.d() + d0Var.h(12);
            String strM2 = null;
            while (d0Var.d() < iD2) {
                int iH2 = d0Var.h(8);
                int iH3 = d0Var.h(8);
                int iD3 = d0Var.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = d0Var.h(16);
                    d0Var.s(8);
                    if (iH4 == 3) {
                        while (d0Var.d() < iD3) {
                            strM = d0Var.m(d0Var.h(8), c.f56719a);
                            int iH5 = d0Var.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                d0Var.t(d0Var.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strM2 = d0Var.m(iH3, c.f56719a);
                }
                d0Var.q(iD3 * 8);
            }
            d0Var.q(iD2 * 8);
            if (strM != null && strM2 != null) {
                arrayList.add(new AppInfoTable(iH, strM2.length() != 0 ? strM.concat(strM2) : new String(strM)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // com.google.android.exoplayer2.metadata.g
    @p0
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new d0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
