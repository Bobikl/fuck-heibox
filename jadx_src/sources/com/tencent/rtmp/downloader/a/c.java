package com.tencent.rtmp.downloader.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.downloader.TXVodDownloadMediaInfo;

/* JADX INFO: loaded from: classes4.dex */
public class c extends TXVodDownloadMediaInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f102082a = c.class.getName();
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.tencent.rtmp.downloader.a.c.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ c[] newArray(int i10) {
            return new c[i10];
        }
    };

    public c() {
    }

    protected c(Parcel parcel) {
        int i10;
        int i11;
        this.dataSource = (a) parcel.readParcelable(a.class.getClassLoader());
        this.duration = parcel.readInt();
        this.size = parcel.readInt();
        this.downloadSize = parcel.readInt();
        this.segments = parcel.readInt();
        this.downloadSegments = parcel.readInt();
        this.playPath = parcel.readString();
        this.url = parcel.readString();
        if (this.dataSource == null) {
            this.userName = parcel.readString();
        }
        this.downloadState = parcel.readInt();
        this.playableDuration = parcel.readInt();
        long j10 = parcel.readLong();
        this.preferredResolution = j10;
        if (j10 <= 0) {
            this.preferredResolution = -1L;
        }
        String string = parcel.readString();
        if (!TextUtils.isEmpty(string)) {
            this.drmBuilder = new TXPlayerDrmBuilder(string, this.url);
        }
        this.speed = parcel.readInt();
        this.totalSize = parcel.readLong();
        long j11 = parcel.readLong();
        this.playableSize = j11;
        if (this.totalSize <= 0 && (i11 = this.size) > 0) {
            this.totalSize = i11;
        }
        if (j11 > 0 || (i10 = this.downloadSize) <= 0) {
            return;
        }
        this.playableSize = i10;
    }

    final void a() {
        this.isResourceBroken = true;
    }

    final void a(float f10) {
        this.progress = f10;
    }

    final void a(int i10) {
        this.duration = i10;
    }

    final void a(long j10) {
        this.totalSize = j10;
    }

    final void a(com.tencent.liteav.txcvodplayer.b.d dVar) {
        this.netApi = dVar;
    }

    public final void a(TXPlayerDrmBuilder tXPlayerDrmBuilder) {
        this.drmBuilder = tXPlayerDrmBuilder;
    }

    public final void a(a aVar) {
        this.dataSource = aVar;
    }

    final void a(String str) {
        this.playPath = str;
    }

    final void b(int i10) {
        this.playableDuration = i10;
    }

    final void b(long j10) {
        this.playableSize = j10;
    }

    public final void b(String str) {
        this.url = str;
    }

    final void c(int i10) {
        this.tid = i10;
    }

    public final void c(long j10) {
        if (j10 > 0) {
            this.preferredResolution = j10;
        }
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.userName = str;
    }

    final void d(int i10) {
        this.downloadState = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(int i10) {
        this.speed = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.dataSource, 0);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.size);
        parcel.writeInt(this.downloadSize);
        parcel.writeInt(this.segments);
        parcel.writeInt(this.downloadSegments);
        parcel.writeString(this.playPath);
        parcel.writeString(this.url);
        if (this.dataSource == null) {
            parcel.writeString(this.userName);
        }
        parcel.writeInt(this.downloadState);
        parcel.writeInt(this.playableDuration);
        parcel.writeLong(this.preferredResolution);
        TXPlayerDrmBuilder tXPlayerDrmBuilder = this.drmBuilder;
        parcel.writeString(tXPlayerDrmBuilder != null ? tXPlayerDrmBuilder.getKeyLicenseUrl() : "");
        parcel.writeInt(this.speed);
        parcel.writeLong(this.totalSize);
        parcel.writeLong(this.playableSize);
    }
}
