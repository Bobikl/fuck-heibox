package q8;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f138631a = "WavHeaderReader";

    /* JADX INFO: compiled from: WavHeaderReader.java */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f138632c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f138633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f138634b;

        private a(int i10, long j10) {
            this.f138633a = i10;
            this.f138634b = j10;
        }

        public static a a(l lVar, e0 e0Var) throws IOException {
            lVar.l(e0Var.d(), 0, 8);
            e0Var.S(0);
            return new a(e0Var.o(), e0Var.v());
        }
    }

    private d() {
    }

    public static boolean a(l lVar) throws IOException {
        e0 e0Var = new e0(8);
        if (a.a(lVar, e0Var).f138633a != 1380533830) {
            return false;
        }
        lVar.l(e0Var.d(), 0, 4);
        e0Var.S(0);
        int iO = e0Var.o();
        if (iO == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Unsupported form type: ");
        sb2.append(iO);
        u.d(f138631a, sb2.toString());
        return false;
    }

    public static c b(l lVar) throws IOException {
        byte[] bArr;
        e0 e0Var = new e0(16);
        a aVarA = a.a(lVar, e0Var);
        while (aVarA.f138633a != 1718449184) {
            lVar.t(((int) aVarA.f138634b) + 8);
            aVarA = a.a(lVar, e0Var);
        }
        com.google.android.exoplayer2.util.a.i(aVarA.f138634b >= 16);
        lVar.l(e0Var.d(), 0, 16);
        e0Var.S(0);
        int iY = e0Var.y();
        int iY2 = e0Var.y();
        int iX = e0Var.x();
        int iX2 = e0Var.x();
        int iY3 = e0Var.y();
        int iY4 = e0Var.y();
        int i10 = ((int) aVarA.f138634b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            lVar.l(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = u0.f51541f;
        }
        lVar.t((int) (lVar.q() - lVar.getPosition()));
        return new c(iY, iY2, iX, iX2, iY3, iY4, bArr);
    }

    public static Pair<Long, Long> c(l lVar) throws IOException {
        lVar.o();
        e0 e0Var = new e0(8);
        a aVarA = a.a(lVar, e0Var);
        while (true) {
            int i10 = aVarA.f138633a;
            if (i10 == 1684108385) {
                lVar.t(8);
                long position = lVar.getPosition();
                long j10 = aVarA.f138634b + position;
                long length = lVar.getLength();
                if (length != -1 && j10 > length) {
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("Data exceeds input length: ");
                    sb2.append(j10);
                    sb2.append(", ");
                    sb2.append(length);
                    u.m(f138631a, sb2.toString());
                    j10 = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j10));
            }
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Ignoring unknown WAV chunk: ");
            sb3.append(i10);
            u.m(f138631a, sb3.toString());
            long j11 = aVarA.f138634b + 8;
            if (j11 > 2147483647L) {
                int i11 = aVarA.f138633a;
                StringBuilder sb4 = new StringBuilder(51);
                sb4.append("Chunk is too large (~2GB+) to skip; id: ");
                sb4.append(i11);
                throw ParserException.e(sb4.toString());
            }
            lVar.t((int) j11);
            aVarA = a.a(lVar, e0Var);
        }
    }
}
