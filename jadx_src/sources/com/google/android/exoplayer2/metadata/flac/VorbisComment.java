package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import bb.c;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.u0;
import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46862c;

    public class a implements Parcelable.Creator<VorbisComment> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    VorbisComment(Parcel parcel) {
        this.f46861b = (String) u0.k(parcel.readString());
        this.f46862c = (String) u0.k(parcel.readString());
    }

    public VorbisComment(String str, String str2) {
        this.f46861b = str;
        this.f46862c = str2;
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
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f46861b.equals(vorbisComment.f46861b) && this.f46862c.equals(vorbisComment.f46862c);
    }

    public int hashCode() {
        return ((c.b.f30674h7 + this.f46861b.hashCode()) * 31) + this.f46862c.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void m(m2.b bVar) {
        String str = this.f46861b;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.L(this.f46862c);
                break;
            case "TITLE":
                bVar.j0(this.f46862c);
                break;
            case "DESCRIPTION":
                bVar.T(this.f46862c);
                break;
            case "ALBUMARTIST":
                bVar.K(this.f46862c);
                break;
            case "ARTIST":
                bVar.M(this.f46862c);
                break;
        }
    }

    public String toString() {
        String str = this.f46861b;
        String str2 = this.f46862c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46861b);
        parcel.writeString(this.f46862c);
    }
}
