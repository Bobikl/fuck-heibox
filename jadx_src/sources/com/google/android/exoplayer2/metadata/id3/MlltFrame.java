package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f46919h = "MLLT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f46923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f46924g;

    public class a implements Parcelable.Creator<MlltFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super(f46919h);
        this.f46920c = i10;
        this.f46921d = i11;
        this.f46922e = i12;
        this.f46923f = iArr;
        this.f46924g = iArr2;
    }

    MlltFrame(Parcel parcel) {
        super(f46919h);
        this.f46920c = parcel.readInt();
        this.f46921d = parcel.readInt();
        this.f46922e = parcel.readInt();
        this.f46923f = (int[]) u0.k(parcel.createIntArray());
        this.f46924g = (int[]) u0.k(parcel.createIntArray());
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f46920c == mlltFrame.f46920c && this.f46921d == mlltFrame.f46921d && this.f46922e == mlltFrame.f46922e && Arrays.equals(this.f46923f, mlltFrame.f46923f) && Arrays.equals(this.f46924g, mlltFrame.f46924g);
    }

    public int hashCode() {
        return ((((((((bb.c.b.f30674h7 + this.f46920c) * 31) + this.f46921d) * 31) + this.f46922e) * 31) + Arrays.hashCode(this.f46923f)) * 31) + Arrays.hashCode(this.f46924g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46920c);
        parcel.writeInt(this.f46921d);
        parcel.writeInt(this.f46922e);
        parcel.writeIntArray(this.f46923f);
        parcel.writeIntArray(this.f46924g);
    }
}
