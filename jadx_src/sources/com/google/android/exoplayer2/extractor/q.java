package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtractorsFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f45683a = new q() { // from class: com.google.android.exoplayer2.extractor.o
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ k[] a(Uri uri, Map map) {
            return p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final k[] b() {
            return p.b();
        }
    };

    k[] a(Uri uri, Map<String, List<String>> map);

    k[] b();
}
