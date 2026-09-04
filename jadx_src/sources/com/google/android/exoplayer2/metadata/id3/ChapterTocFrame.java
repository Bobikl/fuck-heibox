package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f46899h = "CTOC";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f46903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Id3Frame[] f46904g;

    public class a implements Parcelable.Creator<ChapterTocFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    ChapterTocFrame(Parcel parcel) {
        super(f46899h);
        this.f46900c = (String) u0.k(parcel.readString());
        this.f46901d = parcel.readByte() != 0;
        this.f46902e = parcel.readByte() != 0;
        this.f46903f = (String[]) u0.k(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f46904g = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f46904g[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super(f46899h);
        this.f46900c = str;
        this.f46901d = z10;
        this.f46902e = z11;
        this.f46903f = strArr;
        this.f46904g = id3FrameArr;
    }

    public Id3Frame a(int i10) {
        return this.f46904g[i10];
    }

    public int b() {
        return this.f46904g.length;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f46901d == chapterTocFrame.f46901d && this.f46902e == chapterTocFrame.f46902e && u0.c(this.f46900c, chapterTocFrame.f46900c) && Arrays.equals(this.f46903f, chapterTocFrame.f46903f) && Arrays.equals(this.f46904g, chapterTocFrame.f46904g);
    }

    public int hashCode() {
        int i10 = (((bb.c.b.f30674h7 + (this.f46901d ? 1 : 0)) * 31) + (this.f46902e ? 1 : 0)) * 31;
        String str = this.f46900c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46900c);
        parcel.writeByte(this.f46901d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46902e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f46903f);
        parcel.writeInt(this.f46904g.length);
        for (Id3Frame id3Frame : this.f46904g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
