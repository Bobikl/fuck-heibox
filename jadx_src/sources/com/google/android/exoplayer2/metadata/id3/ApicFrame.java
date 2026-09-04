package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f46886g = "APIC";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f46888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f46890f;

    public class a implements Parcelable.Creator<ApicFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    ApicFrame(Parcel parcel) {
        super(f46886g);
        this.f46887c = (String) u0.k(parcel.readString());
        this.f46888d = parcel.readString();
        this.f46889e = parcel.readInt();
        this.f46890f = (byte[]) u0.k(parcel.createByteArray());
    }

    public ApicFrame(String str, @p0 String str2, int i10, byte[] bArr) {
        super(f46886g);
        this.f46887c = str;
        this.f46888d = str2;
        this.f46889e = i10;
        this.f46890f = bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f46889e == apicFrame.f46889e && u0.c(this.f46887c, apicFrame.f46887c) && u0.c(this.f46888d, apicFrame.f46888d) && Arrays.equals(this.f46890f, apicFrame.f46890f);
    }

    public int hashCode() {
        int i10 = (bb.c.b.f30674h7 + this.f46889e) * 31;
        String str = this.f46887c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46888d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f46890f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void m(m2.b bVar) {
        bVar.G(this.f46890f, this.f46889e);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f46914b;
        String str2 = this.f46887c;
        String str3 = this.f46888d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46887c);
        parcel.writeString(this.f46888d);
        parcel.writeInt(this.f46889e);
        parcel.writeByteArray(this.f46890f);
    }
}
