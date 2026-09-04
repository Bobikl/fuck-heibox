package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46891c;

    public class a implements Parcelable.Creator<BinaryFrame> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BinaryFrame[] newArray(int i10) {
            return new BinaryFrame[i10];
        }
    }

    BinaryFrame(Parcel parcel) {
        super((String) u0.k(parcel.readString()));
        this.f46891c = (byte[]) u0.k(parcel.createByteArray());
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f46891c = bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f46914b.equals(binaryFrame.f46914b) && Arrays.equals(this.f46891c, binaryFrame.f46891c);
    }

    public int hashCode() {
        return ((bb.c.b.f30674h7 + this.f46914b.hashCode()) * 31) + Arrays.hashCode(this.f46891c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46914b);
        parcel.writeByteArray(this.f46891c);
    }
}
