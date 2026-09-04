package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.ts.h0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.n0;
import com.google.android.exoplayer2.util.y;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DefaultHlsExtractorFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f48109d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f48111c;

    public e() {
        this(0, true);
    }

    public e(int i10, boolean z10) {
        this.f48110b = i10;
        this.f48111c = z10;
    }

    private static void b(int i10, List<Integer> list) {
        if (Ints.m(f48109d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    @SuppressLint({"SwitchIntDef"})
    @p0
    private com.google.android.exoplayer2.extractor.k d(int i10, a2 a2Var, @p0 List<a2> list, n0 n0Var) {
        if (i10 == 0) {
            return new com.google.android.exoplayer2.extractor.ts.b();
        }
        if (i10 == 1) {
            return new com.google.android.exoplayer2.extractor.ts.e();
        }
        if (i10 == 2) {
            return new com.google.android.exoplayer2.extractor.ts.h();
        }
        if (i10 == 7) {
            return new com.google.android.exoplayer2.extractor.mp3.f(0, 0L);
        }
        if (i10 == 8) {
            return e(n0Var, a2Var, list);
        }
        if (i10 == 11) {
            return f(this.f48110b, this.f48111c, a2Var, list, n0Var);
        }
        if (i10 != 13) {
            return null;
        }
        return new w(a2Var.f43584d, n0Var);
    }

    private static com.google.android.exoplayer2.extractor.mp4.g e(n0 n0Var, a2 a2Var, @p0 List<a2> list) {
        int i10 = g(a2Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new com.google.android.exoplayer2.extractor.mp4.g(i10, n0Var, null, list);
    }

    private static h0 f(int i10, boolean z10, a2 a2Var, @p0 List<a2> list, n0 n0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(new a2.b().e0(y.f51593q0).E()) : Collections.emptyList();
        }
        String str = a2Var.f43590j;
        if (!TextUtils.isEmpty(str)) {
            if (!y.b(str, y.A)) {
                i11 |= 2;
            }
            if (!y.b(str, "video/avc")) {
                i11 |= 4;
            }
        }
        return new h0(2, n0Var, new com.google.android.exoplayer2.extractor.ts.j(i11, list));
    }

    private static boolean g(a2 a2Var) {
        Metadata metadata = a2Var.f43591k;
        if (metadata == null) {
            return false;
        }
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) entryC).f48081d.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(com.google.android.exoplayer2.extractor.k kVar, com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        try {
            return kVar.f(lVar);
        } catch (EOFException unused) {
            return false;
        } finally {
            lVar.o();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, a2 a2Var, @p0 List<a2> list, n0 n0Var, Map<String, List<String>> map, com.google.android.exoplayer2.extractor.l lVar) throws IOException {
        int iA = com.google.android.exoplayer2.util.n.a(a2Var.f43593m);
        int iB = com.google.android.exoplayer2.util.n.b(map);
        int iC = com.google.android.exoplayer2.util.n.c(uri);
        int[] iArr = f48109d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(iA, arrayList);
        b(iB, arrayList);
        b(iC, arrayList);
        for (int i10 : iArr) {
            b(i10, arrayList);
        }
        com.google.android.exoplayer2.extractor.k kVar = null;
        lVar.o();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            com.google.android.exoplayer2.extractor.k kVar2 = (com.google.android.exoplayer2.extractor.k) com.google.android.exoplayer2.util.a.g(d(iIntValue, a2Var, list, n0Var));
            if (h(kVar2, lVar)) {
                return new c(kVar2, a2Var, n0Var);
            }
            if (kVar == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                kVar = kVar2;
            }
        }
        return new c((com.google.android.exoplayer2.extractor.k) com.google.android.exoplayer2.util.a.g(kVar), a2Var, n0Var);
    }
}
