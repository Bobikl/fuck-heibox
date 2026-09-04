package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46915f = "----";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46918e;

    public class a implements Parcelable.Creator<InternalFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    InternalFrame(Parcel parcel) {
        super(f46915f);
        this.f46916c = (String) u0.k(parcel.readString());
        this.f46917d = (String) u0.k(parcel.readString());
        this.f46918e = (String) u0.k(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super(f46915f);
        this.f46916c = str;
        this.f46917d = str2;
        this.f46918e = str3;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return u0.c(this.f46917d, internalFrame.f46917d) && u0.c(this.f46916c, internalFrame.f46916c) && u0.c(this.f46918e, internalFrame.f46918e);
    }

    public int hashCode() {
        String str = this.f46916c;
        int iHashCode = (bb.c.b.f30674h7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46917d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46918e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f46914b;
        String str2 = this.f46916c;
        String str3 = this.f46917d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46914b);
        parcel.writeString(this.f46916c);
        parcel.writeString(this.f46918e);
    }
}
