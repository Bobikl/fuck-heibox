package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* JADX INFO: compiled from: SessionDescription.java */
/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f48798m = "0";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f48799n = "control";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f48800o = "fmtp";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f48801p = "length";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f48802q = "range";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f48803r = "rtpmap";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f48804s = "tool";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f48805t = "type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap<String, String> f48806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<com.google.android.exoplayer2.source.rtsp.b> f48807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    public final Uri f48812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f48813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f48814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f48815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f48816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f48817l;

    /* JADX INFO: compiled from: SessionDescription.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f48818a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList.a<com.google.android.exoplayer2.source.rtsp.b> f48819b = new ImmutableList.a<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f48820c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private Uri f48824g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48825h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48826i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48827j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48828k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48829l;

        public b m(String str, String str2) {
            this.f48818a.put(str, str2);
            return this;
        }

        public b n(com.google.android.exoplayer2.source.rtsp.b bVar) {
            this.f48819b.a(bVar);
            return this;
        }

        public k0 o() {
            if (this.f48821d == null || this.f48822e == null || this.f48823f == null) {
                throw new IllegalStateException("One of more mandatory SDP fields are not set.");
            }
            return new k0(this);
        }

        public b p(int i10) {
            this.f48820c = i10;
            return this;
        }

        public b q(String str) {
            this.f48825h = str;
            return this;
        }

        public b r(String str) {
            this.f48828k = str;
            return this;
        }

        public b s(String str) {
            this.f48826i = str;
            return this;
        }

        public b t(String str) {
            this.f48822e = str;
            return this;
        }

        public b u(String str) {
            this.f48829l = str;
            return this;
        }

        public b v(String str) {
            this.f48827j = str;
            return this;
        }

        public b w(String str) {
            this.f48821d = str;
            return this;
        }

        public b x(String str) {
            this.f48823f = str;
            return this;
        }

        public b y(Uri uri) {
            this.f48824g = uri;
            return this;
        }
    }

    private k0(b bVar) {
        this.f48806a = ImmutableMap.g(bVar.f48818a);
        this.f48807b = bVar.f48819b.e();
        this.f48808c = (String) u0.k(bVar.f48821d);
        this.f48809d = (String) u0.k(bVar.f48822e);
        this.f48810e = (String) u0.k(bVar.f48823f);
        this.f48812g = bVar.f48824g;
        this.f48813h = bVar.f48825h;
        this.f48811f = bVar.f48820c;
        this.f48814i = bVar.f48826i;
        this.f48815j = bVar.f48828k;
        this.f48816k = bVar.f48829l;
        this.f48817l = bVar.f48827j;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f48811f == k0Var.f48811f && this.f48806a.equals(k0Var.f48806a) && this.f48807b.equals(k0Var.f48807b) && this.f48809d.equals(k0Var.f48809d) && this.f48808c.equals(k0Var.f48808c) && this.f48810e.equals(k0Var.f48810e) && u0.c(this.f48817l, k0Var.f48817l) && u0.c(this.f48812g, k0Var.f48812g) && u0.c(this.f48815j, k0Var.f48815j) && u0.c(this.f48816k, k0Var.f48816k) && u0.c(this.f48813h, k0Var.f48813h) && u0.c(this.f48814i, k0Var.f48814i);
    }

    public int hashCode() {
        int iHashCode = (((((((((((217 + this.f48806a.hashCode()) * 31) + this.f48807b.hashCode()) * 31) + this.f48809d.hashCode()) * 31) + this.f48808c.hashCode()) * 31) + this.f48810e.hashCode()) * 31) + this.f48811f) * 31;
        String str = this.f48817l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f48812g;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.f48815j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48816k;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48813h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f48814i;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
