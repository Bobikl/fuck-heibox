package com.tencent.rtmp.downloader.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.rtmp.TXPlayerAuthBuilder;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: loaded from: classes4.dex */
public class a extends TXVodDownloadDataSource implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.tencent.rtmp.downloader.a.a.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
            return new a[i10];
        }
    };

    public a(int i10, String str, int i11, String str2, String str3) {
        super(i10, str, i11, str2, str3);
    }

    a(Parcel parcel) {
        this.appId = parcel.readInt();
        this.fileId = parcel.readString();
        this.pSign = parcel.readString();
        this.quality = parcel.readInt();
        this.userName = parcel.readString();
        if (TextUtils.isEmpty(this.pSign)) {
            return;
        }
        this.overlayKey = parcel.readString();
        this.overlayIv = parcel.readString();
    }

    a(TXPlayerAuthBuilder tXPlayerAuthBuilder, int i10) {
        super(tXPlayerAuthBuilder, i10);
    }

    a(TXPlayerAuthBuilder tXPlayerAuthBuilder, String str) {
        super(tXPlayerAuthBuilder, str);
    }

    static int a(int i10) {
        if (i10 != 1000) {
            switch (i10) {
                case 0:
                    break;
                case 1:
                    return 360;
                case 2:
                    return 540;
                case 3:
                    return 720;
                case 4:
                    return 1080;
                case 5:
                    return bb.c.b.Hv;
                case 6:
                    return bb.c.d.Rj;
                default:
                    return i10;
            }
        }
        return 0;
    }

    static String b(int i10) {
        if (i10 == 1) {
            return "FLU";
        }
        if (i10 == 2) {
            return "SD";
        }
        if (i10 == 3) {
            return "HD";
        }
        if (i10 == 4) {
            return "FHD";
        }
        if (i10 == 5) {
            return "2K";
        }
        return i10 == 6 ? "4K" : "";
    }

    final void a(String str) {
        this.overlayKey = str;
    }

    final void b(String str) {
        this.overlayIv = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.appId);
        parcel.writeString(this.fileId);
        parcel.writeString(this.pSign);
        parcel.writeInt(this.quality);
        parcel.writeString(this.userName);
        if (TextUtils.isEmpty(this.pSign)) {
            return;
        }
        parcel.writeString(this.overlayKey);
        parcel.writeString(this.overlayIv);
    }
}
