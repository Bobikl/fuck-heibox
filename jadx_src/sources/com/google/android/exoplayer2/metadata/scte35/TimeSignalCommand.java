package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.n0;
import org.apache.tools.tar.c;

/* JADX INFO: loaded from: classes7.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47003c;

    public class a implements Parcelable.Creator<TimeSignalCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    private TimeSignalCommand(long j10, long j11) {
        this.f47002b = j10;
        this.f47003c = j11;
    }

    /* synthetic */ TimeSignalCommand(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static TimeSignalCommand a(e0 e0Var, long j10, n0 n0Var) {
        long jB = b(e0Var, j10);
        return new TimeSignalCommand(jB, n0Var.b(jB));
    }

    static long b(e0 e0Var, long j10) {
        long jG = e0Var.G();
        return (128 & jG) != 0 ? c.f137288j & ((((jG & 1) << 32) | e0Var.I()) + j10) : j.f46377b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f47002b);
        parcel.writeLong(this.f47003c);
    }
}
