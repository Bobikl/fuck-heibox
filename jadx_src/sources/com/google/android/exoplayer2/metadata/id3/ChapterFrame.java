package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f46892i = "CHAP";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f46897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Id3Frame[] f46898h;

    public class a implements Parcelable.Creator<ChapterFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    ChapterFrame(Parcel parcel) {
        super(f46892i);
        this.f46893c = (String) u0.k(parcel.readString());
        this.f46894d = parcel.readInt();
        this.f46895e = parcel.readInt();
        this.f46896f = parcel.readLong();
        this.f46897g = parcel.readLong();
        int i10 = parcel.readInt();
        this.f46898h = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f46898h[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super(f46892i);
        this.f46893c = str;
        this.f46894d = i10;
        this.f46895e = i11;
        this.f46896f = j10;
        this.f46897g = j11;
        this.f46898h = id3FrameArr;
    }

    public Id3Frame a(int i10) {
        return this.f46898h[i10];
    }

    public int b() {
        return this.f46898h.length;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f46894d == chapterFrame.f46894d && this.f46895e == chapterFrame.f46895e && this.f46896f == chapterFrame.f46896f && this.f46897g == chapterFrame.f46897g && u0.c(this.f46893c, chapterFrame.f46893c) && Arrays.equals(this.f46898h, chapterFrame.f46898h);
    }

    public int hashCode() {
        int i10 = (((((((bb.c.b.f30674h7 + this.f46894d) * 31) + this.f46895e) * 31) + ((int) this.f46896f)) * 31) + ((int) this.f46897g)) * 31;
        String str = this.f46893c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46893c);
        parcel.writeInt(this.f46894d);
        parcel.writeInt(this.f46895e);
        parcel.writeLong(this.f46896f);
        parcel.writeLong(this.f46897g);
        parcel.writeInt(this.f46898h.length);
        for (Id3Frame id3Frame : this.f46898h) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
