package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f47095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final String f47096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<StreamKey> f47097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    public final byte[] f47098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public final String f47099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f47100h;

    public static class UnsupportedRequestException extends IOException {
    }

    public class a implements Parcelable.Creator<DownloadRequest> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i10) {
            return new DownloadRequest[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f47102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private String f47103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private List<StreamKey> f47104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private byte[] f47105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private String f47106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private byte[] f47107g;

        public b(String str, Uri uri) {
            this.f47101a = str;
            this.f47102b = uri;
        }

        public DownloadRequest a() {
            String str = this.f47101a;
            Uri uri = this.f47102b;
            String str2 = this.f47103c;
            List listB = this.f47104d;
            if (listB == null) {
                listB = ImmutableList.B();
            }
            return new DownloadRequest(str, uri, str2, listB, this.f47105e, this.f47106f, this.f47107g, null);
        }

        public b b(@p0 String str) {
            this.f47106f = str;
            return this;
        }

        public b c(@p0 byte[] bArr) {
            this.f47107g = bArr;
            return this;
        }

        public b d(@p0 byte[] bArr) {
            this.f47105e = bArr;
            return this;
        }

        public b e(@p0 String str) {
            this.f47103c = str;
            return this;
        }

        public b f(@p0 List<StreamKey> list) {
            this.f47104d = list;
            return this;
        }
    }

    DownloadRequest(Parcel parcel) {
        this.f47094b = (String) u0.k(parcel.readString());
        this.f47095c = Uri.parse((String) u0.k(parcel.readString()));
        this.f47096d = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f47097e = Collections.unmodifiableList(arrayList);
        this.f47098f = parcel.createByteArray();
        this.f47099g = parcel.readString();
        this.f47100h = (byte[]) u0.k(parcel.createByteArray());
    }

    private DownloadRequest(String str, Uri uri, @p0 String str2, List<StreamKey> list, @p0 byte[] bArr, @p0 String str3, @p0 byte[] bArr2) {
        int iD0 = u0.D0(uri, str2);
        if (iD0 == 0 || iD0 == 2 || iD0 == 1) {
            boolean z10 = str3 == null;
            StringBuilder sb2 = new StringBuilder(49);
            sb2.append("customCacheKey must be null for type: ");
            sb2.append(iD0);
            com.google.android.exoplayer2.util.a.b(z10, sb2.toString());
        }
        this.f47094b = str;
        this.f47095c = uri;
        this.f47096d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f47097e = Collections.unmodifiableList(arrayList);
        this.f47098f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f47099g = str3;
        this.f47100h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : u0.f51541f;
    }

    /* synthetic */ DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, a aVar) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    public DownloadRequest a(String str) {
        return new DownloadRequest(str, this.f47095c, this.f47096d, this.f47097e, this.f47098f, this.f47099g, this.f47100h);
    }

    public DownloadRequest b(@p0 byte[] bArr) {
        return new DownloadRequest(this.f47094b, this.f47095c, this.f47096d, this.f47097e, bArr, this.f47099g, this.f47100h);
    }

    public DownloadRequest c(DownloadRequest downloadRequest) {
        List listEmptyList;
        com.google.android.exoplayer2.util.a.a(this.f47094b.equals(downloadRequest.f47094b));
        if (this.f47097e.isEmpty() || downloadRequest.f47097e.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = new ArrayList(this.f47097e);
            for (int i10 = 0; i10 < downloadRequest.f47097e.size(); i10++) {
                StreamKey streamKey = downloadRequest.f47097e.get(i10);
                if (!listEmptyList.contains(streamKey)) {
                    listEmptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f47094b, downloadRequest.f47095c, downloadRequest.f47096d, listEmptyList, downloadRequest.f47098f, downloadRequest.f47099g, downloadRequest.f47100h);
    }

    public i2 d() {
        return new i2.c().D(this.f47094b).K(this.f47095c).l(this.f47099g).F(this.f47096d).G(this.f47097e).a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f47094b.equals(downloadRequest.f47094b) && this.f47095c.equals(downloadRequest.f47095c) && u0.c(this.f47096d, downloadRequest.f47096d) && this.f47097e.equals(downloadRequest.f47097e) && Arrays.equals(this.f47098f, downloadRequest.f47098f) && u0.c(this.f47099g, downloadRequest.f47099g) && Arrays.equals(this.f47100h, downloadRequest.f47100h);
    }

    public final int hashCode() {
        int iHashCode = ((this.f47094b.hashCode() * 31 * 31) + this.f47095c.hashCode()) * 31;
        String str = this.f47096d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f47097e.hashCode()) * 31) + Arrays.hashCode(this.f47098f)) * 31;
        String str2 = this.f47099g;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f47100h);
    }

    public String toString() {
        String str = this.f47096d;
        String str2 = this.f47094b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f47094b);
        parcel.writeString(this.f47095c.toString());
        parcel.writeString(this.f47096d);
        parcel.writeInt(this.f47097e.size());
        for (int i11 = 0; i11 < this.f47097e.size(); i11++) {
            parcel.writeParcelable(this.f47097e.get(i11), 0);
        }
        parcel.writeByteArray(this.f47098f);
        parcel.writeString(this.f47099g);
        parcel.writeByteArray(this.f47100h);
    }
}
