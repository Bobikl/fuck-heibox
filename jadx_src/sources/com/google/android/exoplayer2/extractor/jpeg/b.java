package com.google.android.exoplayer2.extractor.jpeg;

import androidx.annotation.p0;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: compiled from: MotionPhotoDescription.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f45066b;

    /* JADX INFO: compiled from: MotionPhotoDescription.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f45069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f45070d;

        public a(String str, String str2, long j10, long j11) {
            this.f45067a = str;
            this.f45068b = str2;
            this.f45069c = j10;
            this.f45070d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f45065a = j10;
        this.f45066b = list;
    }

    @p0
    public MotionPhotoMetadata a(long j10) {
        long j11;
        if (this.f45066b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f45066b.size() - 1; size >= 0; size--) {
            a aVar = this.f45066b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f45067a) | z10;
            if (size == 0) {
                j11 = j12 - aVar.f45070d;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= aVar.f45069c;
                j11 = j17;
            }
            if (!zEquals || j12 == j11) {
                z10 = zEquals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j13, j14, this.f45065a, j15, j16);
    }
}
