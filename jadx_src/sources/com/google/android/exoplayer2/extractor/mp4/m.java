package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.e0;
import com.google.common.base.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SefReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f45524d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f45525e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f45526f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f45527g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f45528h = 2192;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f45529i = 2816;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45530j = 2817;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f45531k = 2819;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f45532l = 2820;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f45533m = "SefReader";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45534n = 1397048916;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45535o = 12;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45536p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f45537q = 12;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final z f45538r = z.h(':');

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final z f45539s = z.h('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f45540a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45541b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45542c;

    /* JADX INFO: compiled from: SefReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f45544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f45545c;

        public a(int i10, long j10, int i11) {
            this.f45543a = i10;
            this.f45544b = j10;
            this.f45545c = i11;
        }
    }

    private void a(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        e0 e0Var = new e0(8);
        lVar.readFully(e0Var.d(), 0, 8);
        this.f45542c = e0Var.r() + 8;
        if (e0Var.o() != f45534n) {
            zVar.f46218a = 0L;
        } else {
            zVar.f46218a = lVar.getPosition() - ((long) (this.f45542c - 12));
            this.f45541b = 2;
        }
    }

    private static int b(String str) throws ParserException {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.a("Invalid SEF name", null);
        }
    }

    private void d(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        long length = lVar.getLength();
        int i10 = (this.f45542c - 12) - 8;
        e0 e0Var = new e0(i10);
        lVar.readFully(e0Var.d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            e0Var.T(2);
            short sU = e0Var.u();
            if (sU == 2192 || sU == 2816 || sU == 2817 || sU == 2819 || sU == 2820) {
                this.f45540a.add(new a(sU, (length - ((long) this.f45542c)) - ((long) e0Var.r()), e0Var.r()));
            } else {
                e0Var.T(8);
            }
        }
        if (this.f45540a.isEmpty()) {
            zVar.f46218a = 0L;
        } else {
            this.f45541b = 3;
            zVar.f46218a = this.f45540a.get(0).f45544b;
        }
    }

    private void e(com.google.android.exoplayer2.extractor.l lVar, List<Metadata.Entry> list) throws IOException {
        long position = lVar.getPosition();
        int length = (int) ((lVar.getLength() - lVar.getPosition()) - ((long) this.f45542c));
        e0 e0Var = new e0(length);
        lVar.readFully(e0Var.d(), 0, length);
        for (int i10 = 0; i10 < this.f45540a.size(); i10++) {
            a aVar = this.f45540a.get(i10);
            e0Var.S((int) (aVar.f45544b - position));
            e0Var.T(4);
            int iR = e0Var.r();
            int iB = b(e0Var.D(iR));
            int i11 = aVar.f45545c - (iR + 8);
            if (iB == 2192) {
                list.add(f(e0Var, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData f(e0 e0Var, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listO = f45539s.o(e0Var.D(i10));
        for (int i11 = 0; i11 < listO.size(); i11++) {
            List<String> listO2 = f45538r.o(listO.get(i11));
            if (listO2.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listO2.get(0)), Long.parseLong(listO2.get(1)), 1 << (Integer.parseInt(listO2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw ParserException.a(null, e10);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int c(com.google.android.exoplayer2.extractor.l lVar, com.google.android.exoplayer2.extractor.z zVar, List<Metadata.Entry> list) throws IOException {
        int i10 = this.f45541b;
        long j10 = 0;
        if (i10 == 0) {
            long length = lVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            zVar.f46218a = j10;
            this.f45541b = 1;
        } else if (i10 == 1) {
            a(lVar, zVar);
        } else if (i10 == 2) {
            d(lVar, zVar);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            e(lVar, list);
            zVar.f46218a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f45540a.clear();
        this.f45541b = 0;
    }
}
