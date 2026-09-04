package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f48079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f48080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<VariantInfo> f48081d;

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f48084d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final String f48085e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        public final String f48086f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        public final String f48087g;

        public class a implements Parcelable.Creator<VariantInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public VariantInfo[] newArray(int i10) {
                return new VariantInfo[i10];
            }
        }

        public VariantInfo(int i10, int i11, @p0 String str, @p0 String str2, @p0 String str3, @p0 String str4) {
            this.f48082b = i10;
            this.f48083c = i11;
            this.f48084d = str;
            this.f48085e = str2;
            this.f48086f = str3;
            this.f48087g = str4;
        }

        VariantInfo(Parcel parcel) {
            this.f48082b = parcel.readInt();
            this.f48083c = parcel.readInt();
            this.f48084d = parcel.readString();
            this.f48085e = parcel.readString();
            this.f48086f = parcel.readString();
            this.f48087g = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f48082b == variantInfo.f48082b && this.f48083c == variantInfo.f48083c && TextUtils.equals(this.f48084d, variantInfo.f48084d) && TextUtils.equals(this.f48085e, variantInfo.f48085e) && TextUtils.equals(this.f48086f, variantInfo.f48086f) && TextUtils.equals(this.f48087g, variantInfo.f48087g);
        }

        public int hashCode() {
            int i10 = ((this.f48082b * 31) + this.f48083c) * 31;
            String str = this.f48084d;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f48085e;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f48086f;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f48087g;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f48082b);
            parcel.writeInt(this.f48083c);
            parcel.writeString(this.f48084d);
            parcel.writeString(this.f48085e);
            parcel.writeString(this.f48086f);
            parcel.writeString(this.f48087g);
        }
    }

    public class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry[] newArray(int i10) {
            return new HlsTrackMetadataEntry[i10];
        }
    }

    HlsTrackMetadataEntry(Parcel parcel) {
        this.f48079b = parcel.readString();
        this.f48080c = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f48081d = Collections.unmodifiableList(arrayList);
    }

    public HlsTrackMetadataEntry(@p0 String str, @p0 String str2, List<VariantInfo> list) {
        this.f48079b = str;
        this.f48080c = str2;
        this.f48081d = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f48079b, hlsTrackMetadataEntry.f48079b) && TextUtils.equals(this.f48080c, hlsTrackMetadataEntry.f48080c) && this.f48081d.equals(hlsTrackMetadataEntry.f48081d);
    }

    public int hashCode() {
        String str = this.f48079b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f48080c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f48081d.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void m(m2.b bVar) {
        com.google.android.exoplayer2.metadata.a.c(this, bVar);
    }

    public String toString() {
        String string;
        String str = this.f48079b;
        if (str != null) {
            String str2 = this.f48080c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
            sb2.append(" [");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(str2);
            sb2.append("]");
            string = sb2.toString();
        } else {
            string = "";
        }
        String strValueOf = String.valueOf(string);
        return strValueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(strValueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f48079b);
        parcel.writeString(this.f48080c);
        int size = this.f48081d.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f48081d.get(i11), 0);
        }
    }
}
