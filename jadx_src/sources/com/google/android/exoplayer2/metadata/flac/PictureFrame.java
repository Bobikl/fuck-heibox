package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import bb.c;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f46860i;

    public class a implements Parcelable.Creator<PictureFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f46853b = i10;
        this.f46854c = str;
        this.f46855d = str2;
        this.f46856e = i11;
        this.f46857f = i12;
        this.f46858g = i13;
        this.f46859h = i14;
        this.f46860i = bArr;
    }

    PictureFrame(Parcel parcel) {
        this.f46853b = parcel.readInt();
        this.f46854c = (String) u0.k(parcel.readString());
        this.f46855d = (String) u0.k(parcel.readString());
        this.f46856e = parcel.readInt();
        this.f46857f = parcel.readInt();
        this.f46858g = parcel.readInt();
        this.f46859h = parcel.readInt();
        this.f46860i = (byte[]) u0.k(parcel.createByteArray());
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
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f46853b == pictureFrame.f46853b && this.f46854c.equals(pictureFrame.f46854c) && this.f46855d.equals(pictureFrame.f46855d) && this.f46856e == pictureFrame.f46856e && this.f46857f == pictureFrame.f46857f && this.f46858g == pictureFrame.f46858g && this.f46859h == pictureFrame.f46859h && Arrays.equals(this.f46860i, pictureFrame.f46860i);
    }

    public int hashCode() {
        return ((((((((((((((c.b.f30674h7 + this.f46853b) * 31) + this.f46854c.hashCode()) * 31) + this.f46855d.hashCode()) * 31) + this.f46856e) * 31) + this.f46857f) * 31) + this.f46858g) * 31) + this.f46859h) * 31) + Arrays.hashCode(this.f46860i);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void m(m2.b bVar) {
        bVar.G(this.f46860i, this.f46853b);
    }

    public String toString() {
        String str = this.f46854c;
        String str2 = this.f46855d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb2.append("Picture: mimeType=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46853b);
        parcel.writeString(this.f46854c);
        parcel.writeString(this.f46855d);
        parcel.writeInt(this.f46856e);
        parcel.writeInt(this.f46857f);
        parcel.writeInt(this.f46858g);
        parcel.writeInt(this.f46859h);
        parcel.writeByteArray(this.f46860i);
    }
}
