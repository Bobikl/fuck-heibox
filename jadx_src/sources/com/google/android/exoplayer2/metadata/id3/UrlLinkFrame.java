package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f46930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46931d;

    public class a implements Parcelable.Creator<UrlLinkFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame[] newArray(int i10) {
            return new UrlLinkFrame[i10];
        }
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) u0.k(parcel.readString()));
        this.f46930c = parcel.readString();
        this.f46931d = (String) u0.k(parcel.readString());
    }

    public UrlLinkFrame(String str, @p0 String str2, String str3) {
        super(str);
        this.f46930c = str2;
        this.f46931d = str3;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f46914b.equals(urlLinkFrame.f46914b) && u0.c(this.f46930c, urlLinkFrame.f46930c) && u0.c(this.f46931d, urlLinkFrame.f46931d);
    }

    public int hashCode() {
        int iHashCode = (bb.c.b.f30674h7 + this.f46914b.hashCode()) * 31;
        String str = this.f46930c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46931d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f46914b;
        String str2 = this.f46931d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46914b);
        parcel.writeString(this.f46930c);
        parcel.writeString(this.f46931d);
    }
}
