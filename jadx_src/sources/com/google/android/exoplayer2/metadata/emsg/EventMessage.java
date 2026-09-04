package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @j1
    public static final String f46828h = "https://aomedia.org/emsg/ID3";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f46829i = "https://developer.apple.com/streaming/emsg-id3";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @j1
    public static final String f46830j = "urn:scte:scte35:2014:bin";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f46837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46838g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a2 f46831k = new a2.b().e0(y.f51591p0).E();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a2 f46832l = new a2.b().e0(y.A0).E();
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    public class a implements Parcelable.Creator<EventMessage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    EventMessage(Parcel parcel) {
        this.f46833b = (String) u0.k(parcel.readString());
        this.f46834c = (String) u0.k(parcel.readString());
        this.f46835d = parcel.readLong();
        this.f46836e = parcel.readLong();
        this.f46837f = (byte[]) u0.k(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f46833b = str;
        this.f46834c = str2;
        this.f46835d = j10;
        this.f46836e = j11;
        this.f46837f = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @p0
    public a2 J0() {
        String str = this.f46833b;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f46832l;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f46831k;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f46835d == eventMessage.f46835d && this.f46836e == eventMessage.f46836e && u0.c(this.f46833b, eventMessage.f46833b) && u0.c(this.f46834c, eventMessage.f46834c) && Arrays.equals(this.f46837f, eventMessage.f46837f);
    }

    public int hashCode() {
        if (this.f46838g == 0) {
            String str = this.f46833b;
            int iHashCode = (bb.c.b.f30674h7 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f46834c;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f46835d;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f46836e;
            this.f46838g = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f46837f);
        }
        return this.f46838g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void m(m2.b bVar) {
        com.google.android.exoplayer2.metadata.a.c(this, bVar);
    }

    public String toString() {
        String str = this.f46833b;
        long j10 = this.f46836e;
        long j11 = this.f46835d;
        String str2 = this.f46834c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j10);
        sb2.append(", durationMs=");
        sb2.append(j11);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @p0
    public byte[] v0() {
        if (J0() != null) {
            return this.f46837f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46833b);
        parcel.writeString(this.f46834c);
        parcel.writeLong(this.f46835d);
        parcel.writeLong(this.f46836e);
        parcel.writeByteArray(this.f46837f);
    }
}
