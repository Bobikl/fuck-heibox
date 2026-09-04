package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import bb.c;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f46863h = "Icy-MetaData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f46864i = "1";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f46865j = "IcyHeaders";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f46866k = "icy-br";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f46867l = "icy-genre";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f46868m = "icy-name";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f46869n = "icy-url";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f46870o = "icy-pub";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f46871p = "icy-metaint";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f46873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f46874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final String f46875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46877g;

    public class a implements Parcelable.Creator<IcyHeaders> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int i10) {
            return new IcyHeaders[i10];
        }
    }

    public IcyHeaders(int i10, @p0 String str, @p0 String str2, @p0 String str3, boolean z10, int i11) {
        com.google.android.exoplayer2.util.a.a(i11 == -1 || i11 > 0);
        this.f46872b = i10;
        this.f46873c = str;
        this.f46874d = str2;
        this.f46875e = str3;
        this.f46876f = z10;
        this.f46877g = i11;
    }

    IcyHeaders(Parcel parcel) {
        this.f46872b = parcel.readInt();
        this.f46873c = parcel.readString();
        this.f46874d = parcel.readString();
        this.f46875e = parcel.readString();
        this.f46876f = u0.f1(parcel);
        this.f46877g = parcel.readInt();
    }

    @p0
    public static IcyHeaders a(Map<String, List<String>> map) {
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List<String> list = map.get(f46866k);
        int i12 = -1;
        boolean z11 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        String strValueOf = String.valueOf(str4);
                        u.m(f46865j, strValueOf.length() != 0 ? "Invalid bitrate: ".concat(strValueOf) : new String("Invalid bitrate: "));
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        String strValueOf2 = String.valueOf(str4);
                        u.m(f46865j, strValueOf2.length() != 0 ? "Invalid bitrate header: ".concat(strValueOf2) : new String("Invalid bitrate header: "));
                    }
                    z10 = false;
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            i10 = -1;
            z10 = false;
        }
        List<String> list2 = map.get(f46867l);
        if (list2 != null) {
            str = list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get(f46868m);
        if (list3 != null) {
            str2 = list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get(f46869n);
        if (list4 != null) {
            str3 = list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get(f46870o);
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get(f46871p);
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        String strValueOf3 = String.valueOf(str5);
                        u.m(f46865j, strValueOf3.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf3) : new String("Invalid metadata interval: "));
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        String strValueOf4 = String.valueOf(str5);
                        u.m(f46865j, strValueOf4.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf4) : new String("Invalid metadata interval: "));
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z10) {
            return new IcyHeaders(i10, str, str2, str3, zEquals, i12);
        }
        return null;
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f46872b == icyHeaders.f46872b && u0.c(this.f46873c, icyHeaders.f46873c) && u0.c(this.f46874d, icyHeaders.f46874d) && u0.c(this.f46875e, icyHeaders.f46875e) && this.f46876f == icyHeaders.f46876f && this.f46877g == icyHeaders.f46877g;
    }

    public int hashCode() {
        int i10 = (c.b.f30674h7 + this.f46872b) * 31;
        String str = this.f46873c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46874d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46875e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f46876f ? 1 : 0)) * 31) + this.f46877g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void m(m2.b bVar) {
        com.google.android.exoplayer2.metadata.a.c(this, bVar);
    }

    public String toString() {
        String str = this.f46874d;
        String str2 = this.f46873c;
        int i10 = this.f46872b;
        int i11 = this.f46877g;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i10);
        sb2.append(", metadataInterval=");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46872b);
        parcel.writeString(this.f46873c);
        parcel.writeString(this.f46874d);
        parcel.writeString(this.f46875e);
        u0.C1(parcel, this.f46876f);
        parcel.writeInt(this.f46877g);
    }
}
