package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f46971d;

    public class a implements Parcelable.Creator<PrivateCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    private PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f46969b = j11;
        this.f46970c = j10;
        this.f46971d = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f46969b = parcel.readLong();
        this.f46970c = parcel.readLong();
        this.f46971d = (byte[]) u0.k(parcel.createByteArray());
    }

    /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    static PrivateCommand a(e0 e0Var, int i10, long j10) {
        long jI = e0Var.I();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        e0Var.k(bArr, 0, i11);
        return new PrivateCommand(jI, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f46969b);
        parcel.writeLong(this.f46970c);
        parcel.writeByteArray(this.f46971d);
    }
}
