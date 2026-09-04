package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import bb.c;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes7.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46961f;

    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata[] newArray(int i10) {
            return new MotionPhotoMetadata[i10];
        }
    }

    public MotionPhotoMetadata(long j10, long j11, long j12, long j13, long j14) {
        this.f46957b = j10;
        this.f46958c = j11;
        this.f46959d = j12;
        this.f46960e = j13;
        this.f46961f = j14;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f46957b = parcel.readLong();
        this.f46958c = parcel.readLong();
        this.f46959d = parcel.readLong();
        this.f46960e = parcel.readLong();
        this.f46961f = parcel.readLong();
    }

    /* synthetic */ MotionPhotoMetadata(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ a2 J0() {
        return com.google.android.exoplayer2.metadata.a.b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f46957b == motionPhotoMetadata.f46957b && this.f46958c == motionPhotoMetadata.f46958c && this.f46959d == motionPhotoMetadata.f46959d && this.f46960e == motionPhotoMetadata.f46960e && this.f46961f == motionPhotoMetadata.f46961f;
    }

    public int hashCode() {
        return ((((((((c.b.f30674h7 + Longs.k(this.f46957b)) * 31) + Longs.k(this.f46958c)) * 31) + Longs.k(this.f46959d)) * 31) + Longs.k(this.f46960e)) * 31) + Longs.k(this.f46961f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void m(m2.b bVar) {
        com.google.android.exoplayer2.metadata.a.c(this, bVar);
    }

    public String toString() {
        long j10 = this.f46957b;
        long j11 = this.f46958c;
        long j12 = this.f46959d;
        long j13 = this.f46960e;
        long j14 = this.f46961f;
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j10);
        sb2.append(", photoSize=");
        sb2.append(j11);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j12);
        sb2.append(", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f46957b);
        parcel.writeLong(this.f46958c);
        parcel.writeLong(this.f46959d);
        parcel.writeLong(this.f46960e);
        parcel.writeLong(this.f46961f);
    }
}
