package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.j1;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: RtspTrackTiming.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f48790c;

    private j0(long j10, int i10, Uri uri) {
        this.f48788a = j10;
        this.f48789b = i10;
        this.f48790c = uri;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    public static ImmutableList<j0> a(String str, Uri uri) throws ParserException {
        byte b10;
        ImmutableList.a aVar = new ImmutableList.a();
        String[] strArrP1 = u0.p1(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int length = strArrP1.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            String str2 = strArrP1[i11];
            String[] strArrP2 = u0.p1(str2, ";");
            int length2 = strArrP2.length;
            int i12 = i10;
            Uri uriB = null;
            int i13 = -1;
            long j10 = com.google.android.exoplayer2.j.f46377b;
            while (i12 < length2) {
                String str3 = strArrP2[i12];
                try {
                    String[] strArrQ1 = u0.q1(str3, ContainerUtils.KEY_VALUE_DELIMITER);
                    String str4 = strArrQ1[i10];
                    String str5 = strArrQ1[1];
                    int iHashCode = str4.hashCode();
                    String[] strArr = strArrP1;
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode == 1524180539 && str4.equals("rtptime")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                        } else if (str4.equals("url")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                    } else if (str4.equals("seq")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        uriB = b(str5, uri);
                    } else if (b10 == 1) {
                        i13 = Integer.parseInt(str5);
                    } else {
                        if (b10 != 2) {
                            throw ParserException.c(str4, null);
                        }
                        j10 = Long.parseLong(str5);
                    }
                    i12++;
                    strArrP1 = strArr;
                    i10 = 0;
                } catch (Exception e10) {
                    throw ParserException.c(str3, e10);
                }
            }
            String[] strArr2 = strArrP1;
            if (uriB != null && uriB.getScheme() != null) {
                long j11 = j10;
                if (i13 != -1 || j11 != com.google.android.exoplayer2.j.f46377b) {
                    aVar.a(new j0(j11, i13, uriB));
                    i11++;
                    strArrP1 = strArr2;
                    i10 = 0;
                }
            }
            throw ParserException.c(str2, null);
        }
        return aVar.e();
    }

    @j1
    static Uri b(String str, Uri uri) {
        com.google.android.exoplayer2.util.a.a(((String) com.google.android.exoplayer2.util.a.g(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        String strValueOf = String.valueOf(str);
        Uri uri3 = Uri.parse(strValueOf.length() != 0 ? "rtsp://".concat(strValueOf) : new String("rtsp://"));
        String string = uri.toString();
        if (((String) com.google.android.exoplayer2.util.a.g(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        return string.endsWith("/") ? com.google.android.exoplayer2.util.q0.f(string, str) : com.google.android.exoplayer2.util.q0.f(string.concat("/"), str);
    }
}
