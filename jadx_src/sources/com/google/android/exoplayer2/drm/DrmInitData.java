package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SchemeData[] f44650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f44652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44653e;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f44654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f44655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f44656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f44657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        public final byte[] f44658f;

        public class a implements Parcelable.Creator<SchemeData> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        SchemeData(Parcel parcel) {
            this.f44655c = new UUID(parcel.readLong(), parcel.readLong());
            this.f44656d = parcel.readString();
            this.f44657e = (String) u0.k(parcel.readString());
            this.f44658f = parcel.createByteArray();
        }

        public SchemeData(UUID uuid, @androidx.annotation.p0 String str, String str2, @androidx.annotation.p0 byte[] bArr) {
            this.f44655c = (UUID) com.google.android.exoplayer2.util.a.g(uuid);
            this.f44656d = str;
            this.f44657e = (String) com.google.android.exoplayer2.util.a.g(str2);
            this.f44658f = bArr;
        }

        public SchemeData(UUID uuid, String str, @androidx.annotation.p0 byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(SchemeData schemeData) {
            return c() && !schemeData.c() && d(schemeData.f44655c);
        }

        public SchemeData b(@androidx.annotation.p0 byte[] bArr) {
            return new SchemeData(this.f44655c, this.f44656d, this.f44657e, bArr);
        }

        public boolean c() {
            return this.f44658f != null;
        }

        public boolean d(UUID uuid) {
            return com.google.android.exoplayer2.j.U1.equals(this.f44655c) || uuid.equals(this.f44655c);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return u0.c(this.f44656d, schemeData.f44656d) && u0.c(this.f44657e, schemeData.f44657e) && u0.c(this.f44655c, schemeData.f44655c) && Arrays.equals(this.f44658f, schemeData.f44658f);
        }

        public int hashCode() {
            if (this.f44654b == 0) {
                int iHashCode = this.f44655c.hashCode() * 31;
                String str = this.f44656d;
                this.f44654b = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f44657e.hashCode()) * 31) + Arrays.hashCode(this.f44658f);
            }
            return this.f44654b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f44655c.getMostSignificantBits());
            parcel.writeLong(this.f44655c.getLeastSignificantBits());
            parcel.writeString(this.f44656d);
            parcel.writeString(this.f44657e);
            parcel.writeByteArray(this.f44658f);
        }
    }

    public class a implements Parcelable.Creator<DrmInitData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    DrmInitData(Parcel parcel) {
        this.f44652d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) u0.k((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f44650b = schemeDataArr;
        this.f44653e = schemeDataArr.length;
    }

    public DrmInitData(@androidx.annotation.p0 String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    private DrmInitData(@androidx.annotation.p0 String str, boolean z10, SchemeData... schemeDataArr) {
        this.f44652d = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f44650b = schemeDataArr;
        this.f44653e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(@androidx.annotation.p0 String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    private static boolean b(ArrayList<SchemeData> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f44655c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @androidx.annotation.p0
    public static DrmInitData d(@androidx.annotation.p0 DrmInitData drmInitData, @androidx.annotation.p0 DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f44652d;
            for (SchemeData schemeData : drmInitData.f44650b) {
                if (schemeData.c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f44652d;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f44650b) {
                if (schemeData2.c() && !b(arrayList, size, schemeData2.f44655c)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = com.google.android.exoplayer2.j.U1;
        if (uuid.equals(schemeData.f44655c)) {
            return uuid.equals(schemeData2.f44655c) ? 0 : 1;
        }
        return schemeData.f44655c.compareTo(schemeData2.f44655c);
    }

    public DrmInitData c(@androidx.annotation.p0 String str) {
        return u0.c(this.f44652d, str) ? this : new DrmInitData(str, false, this.f44650b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return u0.c(this.f44652d, drmInitData.f44652d) && Arrays.equals(this.f44650b, drmInitData.f44650b);
    }

    public SchemeData f(int i10) {
        return this.f44650b[i10];
    }

    public DrmInitData h(DrmInitData drmInitData) {
        String str;
        String str2 = this.f44652d;
        com.google.android.exoplayer2.util.a.i(str2 == null || (str = drmInitData.f44652d) == null || TextUtils.equals(str2, str));
        String str3 = this.f44652d;
        if (str3 == null) {
            str3 = drmInitData.f44652d;
        }
        return new DrmInitData(str3, (SchemeData[]) u0.Y0(this.f44650b, drmInitData.f44650b));
    }

    public int hashCode() {
        if (this.f44651c == 0) {
            String str = this.f44652d;
            this.f44651c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f44650b);
        }
        return this.f44651c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f44652d);
        parcel.writeTypedArray(this.f44650b, 0);
    }
}
