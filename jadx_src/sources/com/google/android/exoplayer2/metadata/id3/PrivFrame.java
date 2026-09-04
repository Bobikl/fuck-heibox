package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f46925e = "PRIV";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f46927d;

    public class a implements Parcelable.Creator<PrivFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    }

    PrivFrame(Parcel parcel) {
        super(f46925e);
        this.f46926c = (String) u0.k(parcel.readString());
        this.f46927d = (byte[]) u0.k(parcel.createByteArray());
    }

    public PrivFrame(String str, byte[] bArr) {
        super(f46925e);
        this.f46926c = str;
        this.f46927d = bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return u0.c(this.f46926c, privFrame.f46926c) && Arrays.equals(this.f46927d, privFrame.f46927d);
    }

    public int hashCode() {
        String str = this.f46926c;
        return ((bb.c.b.f30674h7 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f46927d);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f46914b;
        String str2 = this.f46926c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46926c);
        parcel.writeByteArray(this.f46927d);
    }
}
