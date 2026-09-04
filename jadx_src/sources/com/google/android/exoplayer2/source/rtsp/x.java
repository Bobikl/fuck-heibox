package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.j1;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: RtspMediaTrack.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f48970c = "profile-level-id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48971d = "sprop-parameter-sets";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48972e = "mp4a.40.";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f48973f = "avc1.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48974g = "*";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f48975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f48976b;

    public x(b bVar, Uri uri) {
        com.google.android.exoplayer2.util.a.a(bVar.f48663i.containsKey("control"));
        this.f48975a = b(bVar);
        this.f48976b = a(uri, (String) u0.k(bVar.f48663i.get("control")));
    }

    private static Uri a(Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @j1
    static k b(b bVar) {
        int iD;
        byte b10;
        a2.b bVar2 = new a2.b();
        int i10 = bVar.f48659e;
        if (i10 > 0) {
            bVar2.G(i10);
        }
        b.d dVar = bVar.f48664j;
        int i11 = dVar.f48674a;
        String strA = k.a(dVar.f48675b);
        bVar2.e0(strA);
        int i12 = bVar.f48664j.f48676c;
        if ("audio".equals(bVar.f48655a)) {
            iD = d(bVar.f48664j.f48677d, strA);
            bVar2.f0(i12).H(iD);
        } else {
            iD = -1;
        }
        ImmutableMap<String, String> immutableMapA = bVar.a();
        int iHashCode = strA.hashCode();
        if (iHashCode != -53558318) {
            if (iHashCode != 187078296) {
                if (iHashCode == 1331836730 && strA.equals("video/avc")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (strA.equals(com.google.android.exoplayer2.util.y.L)) {
                b10 = 2;
            } else {
                b10 = -1;
            }
        } else if (strA.equals(com.google.android.exoplayer2.util.y.A)) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            com.google.android.exoplayer2.util.a.a(iD != -1);
            com.google.android.exoplayer2.util.a.a(!immutableMapA.isEmpty());
            e(bVar2, immutableMapA, iD, i12);
        } else if (b10 == 1) {
            com.google.android.exoplayer2.util.a.a(!immutableMapA.isEmpty());
            f(bVar2, immutableMapA);
        }
        com.google.android.exoplayer2.util.a.a(i12 > 0);
        com.google.android.exoplayer2.util.a.a(i11 >= 96);
        return new k(bVar2.E(), i11, i12, immutableMapA);
    }

    private static byte[] c(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = com.google.android.exoplayer2.util.z.f51618b;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    private static int d(int i10, String str) {
        if (i10 != -1) {
            return i10;
        }
        return str.equals(com.google.android.exoplayer2.util.y.L) ? 6 : 1;
    }

    private static void e(a2.b bVar, ImmutableMap<String, String> immutableMap, int i10, int i11) {
        com.google.android.exoplayer2.util.a.a(immutableMap.containsKey(f48970c));
        String strValueOf = String.valueOf((String) com.google.android.exoplayer2.util.a.g(immutableMap.get(f48970c)));
        bVar.I(strValueOf.length() != 0 ? f48972e.concat(strValueOf) : new String(f48972e));
        bVar.T(ImmutableList.D(com.google.android.exoplayer2.audio.a.a(i11, i10)));
    }

    private static void f(a2.b bVar, ImmutableMap<String, String> immutableMap) {
        com.google.android.exoplayer2.util.a.a(immutableMap.containsKey(f48971d));
        String[] strArrP1 = u0.p1((String) com.google.android.exoplayer2.util.a.g(immutableMap.get(f48971d)), Constants.ACCEPT_TIME_SEPARATOR_SP);
        com.google.android.exoplayer2.util.a.a(strArrP1.length == 2);
        ImmutableList immutableListE = ImmutableList.E(c(strArrP1[0]), c(strArrP1[1]));
        bVar.T(immutableListE);
        byte[] bArr = immutableListE.get(0);
        com.google.android.exoplayer2.util.z.c cVarL = com.google.android.exoplayer2.util.z.l(bArr, com.google.android.exoplayer2.util.z.f51618b.length, bArr.length);
        bVar.a0(cVarL.f51645g);
        bVar.Q(cVarL.f51644f);
        bVar.j0(cVarL.f51643e);
        String str = immutableMap.get(f48970c);
        if (str != null) {
            bVar.I(str.length() != 0 ? f48973f.concat(str) : new String(f48973f));
        } else {
            bVar.I(com.google.android.exoplayer2.util.f.a(cVarL.f51639a, cVarL.f51640b, cVarL.f51641c));
        }
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f48975a.equals(xVar.f48975a) && this.f48976b.equals(xVar.f48976b);
    }

    public int hashCode() {
        return ((217 + this.f48975a.hashCode()) * 31) + this.f48976b.hashCode();
    }
}
