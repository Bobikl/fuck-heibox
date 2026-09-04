package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HlsMasterPlaylist.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f48292n = new f("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f48293o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f48294p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f48295q = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f48296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f48297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f48298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f48299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f48300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f48301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    public final a2 f48302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    public final List<a2> f48303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f48304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DrmInitData> f48305m;

    /* JADX INFO: compiled from: HlsMasterPlaylist.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final Uri f48306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a2 f48307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f48308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f48309d;

        public a(@p0 Uri uri, a2 a2Var, String str, String str2) {
            this.f48306a = uri;
            this.f48307b = a2Var;
            this.f48308c = str;
            this.f48309d = str2;
        }
    }

    /* JADX INFO: compiled from: HlsMasterPlaylist.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f48310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a2 f48311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final String f48312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f48313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final String f48314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        public final String f48315f;

        public b(Uri uri, a2 a2Var, @p0 String str, @p0 String str2, @p0 String str3, @p0 String str4) {
            this.f48310a = uri;
            this.f48311b = a2Var;
            this.f48312c = str;
            this.f48313d = str2;
            this.f48314e = str3;
            this.f48315f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new a2.b().S("0").K(y.f51587n0).E(), null, null, null, null);
        }

        public b a(a2 a2Var) {
            return new b(this.f48310a, a2Var, this.f48312c, this.f48313d, this.f48314e, this.f48315f);
        }
    }

    public f(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @p0 a2 a2Var, @p0 List<a2> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        this.f48296d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f48297e = Collections.unmodifiableList(list2);
        this.f48298f = Collections.unmodifiableList(list3);
        this.f48299g = Collections.unmodifiableList(list4);
        this.f48300h = Collections.unmodifiableList(list5);
        this.f48301i = Collections.unmodifiableList(list6);
        this.f48302j = a2Var;
        this.f48303k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f48304l = Collections.unmodifiableMap(map);
        this.f48305m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f48306a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                StreamKey streamKey = list2.get(i12);
                if (streamKey.f47147c == i10 && streamKey.f47148d == i11) {
                    arrayList.add(t10);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static f e(String str) {
        return new f("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f48310a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.offline.z
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f a(List<StreamKey> list) {
        return new f(this.f48361a, this.f48362b, d(this.f48297e, 0, list), Collections.emptyList(), d(this.f48299g, 1, list), d(this.f48300h, 2, list), Collections.emptyList(), this.f48302j, this.f48303k, this.f48363c, this.f48304l, this.f48305m);
    }
}
