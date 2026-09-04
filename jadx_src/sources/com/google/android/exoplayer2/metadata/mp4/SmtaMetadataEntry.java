package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import bb.c;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Floats;

/* JADX INFO: loaded from: classes7.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f46967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46968c;

    public class a implements Parcelable.Creator<SmtaMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry[] newArray(int i10) {
            return new SmtaMetadataEntry[i10];
        }
    }

    public SmtaMetadataEntry(float f10, int i10) {
        this.f46967b = f10;
        this.f46968c = i10;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f46967b = parcel.readFloat();
        this.f46968c = parcel.readInt();
    }

    /* synthetic */ SmtaMetadataEntry(Parcel parcel, a aVar) {
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
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f46967b == smtaMetadataEntry.f46967b && this.f46968c == smtaMetadataEntry.f46968c;
    }

    public int hashCode() {
        return ((c.b.f30674h7 + Floats.i(this.f46967b)) * 31) + this.f46968c;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void m(m2.b bVar) {
        com.google.android.exoplayer2.metadata.a.c(this, bVar);
    }

    public String toString() {
        float f10 = this.f46967b;
        int i10 = this.f46968c;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f46967b);
        parcel.writeInt(this.f46968c);
    }
}
