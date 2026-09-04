package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.u0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: RtspAuthenticationInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48849e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48850f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48851g = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f48852h = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f48853i = "MD5";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48857d;

    public m(int i10, String str, String str2, String str3) {
        this.f48854a = i10;
        this.f48855b = str;
        this.f48856c = str2;
        this.f48857d = str3;
    }

    private String b(c0.a aVar) {
        String str = aVar.f48689a;
        String str2 = aVar.f48690b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return Base64.encodeToString(c0.c(sb2.toString()), 0);
    }

    private String c(c0.a aVar, Uri uri, int i10) throws ParserException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(f48853i);
            String strS = c0.s(i10);
            String str = aVar.f48689a;
            String str2 = this.f48855b;
            String str3 = aVar.f48690b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb2.append(str);
            sb2.append(":");
            sb2.append(str2);
            sb2.append(":");
            sb2.append(str3);
            String strW1 = u0.w1(messageDigest.digest(c0.c(sb2.toString())));
            String strValueOf = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strS).length() + 1 + strValueOf.length());
            sb3.append(strS);
            sb3.append(":");
            sb3.append(strValueOf);
            String strW2 = u0.w1(messageDigest.digest(c0.c(sb3.toString())));
            String str4 = this.f48856c;
            StringBuilder sb4 = new StringBuilder(String.valueOf(strW1).length() + 2 + String.valueOf(str4).length() + String.valueOf(strW2).length());
            sb4.append(strW1);
            sb4.append(":");
            sb4.append(str4);
            sb4.append(":");
            sb4.append(strW2);
            String strW3 = u0.w1(messageDigest.digest(c0.c(sb4.toString())));
            return this.f48857d.isEmpty() ? u0.H(f48851g, aVar.f48689a, this.f48855b, this.f48856c, uri, strW3) : u0.H(f48852h, aVar.f48689a, this.f48855b, this.f48856c, uri, strW3, this.f48857d);
        } catch (NoSuchAlgorithmException e10) {
            throw ParserException.d(null, e10);
        }
    }

    public String a(c0.a aVar, Uri uri, int i10) throws ParserException {
        int i11 = this.f48854a;
        if (i11 == 1) {
            return b(aVar);
        }
        if (i11 == 2) {
            return c(aVar, uri, i10);
        }
        throw ParserException.d(null, new UnsupportedOperationException());
    }
}
