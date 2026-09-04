package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: ActionFile.java */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f47150b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f47151c = "progressive";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47152d = "dash";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f47153e = "hls";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f47154f = "ss";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.b f47155a;

    public a(File file) {
        this.f47155a = new com.google.android.exoplayer2.util.b(file);
    }

    private static String c(Uri uri, @p0 String str) {
        return str != null ? str : uri.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    private static String d(String str) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != 3680) {
            if (iHashCode != 103407) {
                if (iHashCode != 3075986) {
                    if (iHashCode == 1131547531 && str.equals(f47151c)) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals(f47152d)) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(f47153e)) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("ss")) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return com.google.android.exoplayer2.util.y.f51585m0;
        }
        if (b10 != 1) {
            return b10 != 2 ? com.google.android.exoplayer2.util.y.f51608y : com.google.android.exoplayer2.util.y.f51589o0;
        }
        return com.google.android.exoplayer2.util.y.f51587n0;
    }

    private static DownloadRequest f(DataInputStream dataInputStream) throws IOException {
        byte[] bArr;
        String utf = dataInputStream.readUTF();
        int i10 = dataInputStream.readInt();
        Uri uri = Uri.parse(dataInputStream.readUTF());
        boolean z10 = dataInputStream.readBoolean();
        int i11 = dataInputStream.readInt();
        String utf2 = null;
        if (i11 != 0) {
            bArr = new byte[i11];
            dataInputStream.readFully(bArr);
        } else {
            bArr = null;
        }
        boolean z11 = true;
        boolean z12 = i10 == 0 && f47151c.equals(utf);
        ArrayList arrayList = new ArrayList();
        if (!z12) {
            int i12 = dataInputStream.readInt();
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(g(utf, i10, dataInputStream));
            }
        }
        if (i10 >= 2 || (!f47152d.equals(utf) && !f47153e.equals(utf) && !"ss".equals(utf))) {
            z11 = false;
        }
        if (!z11 && dataInputStream.readBoolean()) {
            utf2 = dataInputStream.readUTF();
        }
        String strC = i10 < 3 ? c(uri, utf2) : dataInputStream.readUTF();
        if (z10) {
            throw new DownloadRequest.UnsupportedRequestException();
        }
        return new DownloadRequest.b(strC, uri).e(d(utf)).f(arrayList).b(utf2).c(bArr).a();
    }

    private static StreamKey g(String str, int i10, DataInputStream dataInputStream) throws IOException {
        int i11;
        int i12;
        int i13;
        if ((f47153e.equals(str) || "ss".equals(str)) && i10 == 0) {
            i11 = 0;
            i12 = dataInputStream.readInt();
            i13 = dataInputStream.readInt();
        } else {
            i11 = dataInputStream.readInt();
            i12 = dataInputStream.readInt();
            i13 = dataInputStream.readInt();
        }
        return new StreamKey(i11, i12, i13);
    }

    public void a() {
        this.f47155a.a();
    }

    public boolean b() {
        return this.f47155a.c();
    }

    public DownloadRequest[] e() throws IOException {
        if (!b()) {
            return new DownloadRequest[0];
        }
        try {
            InputStream inputStreamD = this.f47155a.d();
            DataInputStream dataInputStream = new DataInputStream(inputStreamD);
            int i10 = dataInputStream.readInt();
            if (i10 > 0) {
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("Unsupported action file version: ");
                sb2.append(i10);
                throw new IOException(sb2.toString());
            }
            int i11 = dataInputStream.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i11; i12++) {
                try {
                    arrayList.add(f(dataInputStream));
                } catch (DownloadRequest.UnsupportedRequestException unused) {
                }
            }
            DownloadRequest[] downloadRequestArr = (DownloadRequest[]) arrayList.toArray(new DownloadRequest[0]);
            u0.p(inputStreamD);
            return downloadRequestArr;
        } catch (Throwable th2) {
            u0.p(null);
            throw th2;
        }
    }
}
