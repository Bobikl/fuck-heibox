package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.a2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* JADX INFO: compiled from: RtpPayloadFormat.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48791e = "AC3";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f48792f = "MPEG4-GENERIC";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48793g = "H264";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f48796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImmutableMap<String, String> f48797d;

    public k(a2 a2Var, int i10, int i11, Map<String, String> map) {
        this.f48794a = i10;
        this.f48795b = i11;
        this.f48796c = a2Var;
        this.f48797d = ImmutableMap.g(map);
    }

    public static String a(String str) {
        String strJ = com.google.common.base.a.j(str);
        strJ.hashCode();
        switch (strJ) {
            case "MPEG4-GENERIC":
                return com.google.android.exoplayer2.util.y.A;
            case "AC3":
                return com.google.android.exoplayer2.util.y.L;
            case "H264":
                return "video/avc";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(b bVar) {
        String strJ = com.google.common.base.a.j(bVar.f48664j.f48675b);
        strJ.hashCode();
        switch (strJ) {
            case "MPEG4-GENERIC":
            case "AC3":
            case "H264":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f48794a == kVar.f48794a && this.f48795b == kVar.f48795b && this.f48796c.equals(kVar.f48796c) && this.f48797d.equals(kVar.f48797d);
    }

    public int hashCode() {
        return ((((((217 + this.f48794a) * 31) + this.f48795b) * 31) + this.f48796c.hashCode()) * 31) + this.f48797d.hashCode();
    }
}
