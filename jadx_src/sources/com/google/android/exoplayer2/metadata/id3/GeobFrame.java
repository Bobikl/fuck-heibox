package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f46909g = "GEOB";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f46913f;

    public class a implements Parcelable.Creator<GeobFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    GeobFrame(Parcel parcel) {
        super(f46909g);
        this.f46910c = (String) u0.k(parcel.readString());
        this.f46911d = (String) u0.k(parcel.readString());
        this.f46912e = (String) u0.k(parcel.readString());
        this.f46913f = (byte[]) u0.k(parcel.createByteArray());
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(f46909g);
        this.f46910c = str;
        this.f46911d = str2;
        this.f46912e = str3;
        this.f46913f = bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return u0.c(this.f46910c, geobFrame.f46910c) && u0.c(this.f46911d, geobFrame.f46911d) && u0.c(this.f46912e, geobFrame.f46912e) && Arrays.equals(this.f46913f, geobFrame.f46913f);
    }

    public int hashCode() {
        String str = this.f46910c;
        int iHashCode = (bb.c.b.f30674h7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46911d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46912e;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f46913f);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f46914b;
        String str2 = this.f46910c;
        String str3 = this.f46911d;
        String str4 = this.f46912e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", filename=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46910c);
        parcel.writeString(this.f46911d);
        parcel.writeString(this.f46912e);
        parcel.writeByteArray(this.f46913f);
    }
}
