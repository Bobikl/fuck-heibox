package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46905f = "COMM";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46908e;

    public class a implements Parcelable.Creator<CommentFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i10) {
            return new CommentFrame[i10];
        }
    }

    CommentFrame(Parcel parcel) {
        super(f46905f);
        this.f46906c = (String) u0.k(parcel.readString());
        this.f46907d = (String) u0.k(parcel.readString());
        this.f46908e = (String) u0.k(parcel.readString());
    }

    public CommentFrame(String str, String str2, String str3) {
        super(f46905f);
        this.f46906c = str;
        this.f46907d = str2;
        this.f46908e = str3;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return u0.c(this.f46907d, commentFrame.f46907d) && u0.c(this.f46906c, commentFrame.f46906c) && u0.c(this.f46908e, commentFrame.f46908e);
    }

    public int hashCode() {
        String str = this.f46906c;
        int iHashCode = (bb.c.b.f30674h7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46907d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46908e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f46914b;
        String str2 = this.f46906c;
        String str3 = this.f46907d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46914b);
        parcel.writeString(this.f46906c);
        parcel.writeString(this.f46908e);
    }
}
