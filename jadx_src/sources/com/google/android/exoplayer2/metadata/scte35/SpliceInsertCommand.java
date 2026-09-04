package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f46977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f46978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<b> f46979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f46980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f46981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f46982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f46983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f46984n;

    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f46987c;

        private b(int i10, long j10, long j11) {
            this.f46985a = i10;
            this.f46986b = j10;
            this.f46987c = j11;
        }

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f46985a);
            parcel.writeLong(this.f46986b);
            parcel.writeLong(this.f46987c);
        }
    }

    private SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f46972b = j10;
        this.f46973c = z10;
        this.f46974d = z11;
        this.f46975e = z12;
        this.f46976f = z13;
        this.f46977g = j11;
        this.f46978h = j12;
        this.f46979i = Collections.unmodifiableList(list);
        this.f46980j = z14;
        this.f46981k = j13;
        this.f46982l = i10;
        this.f46983m = i11;
        this.f46984n = i12;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f46972b = parcel.readLong();
        this.f46973c = parcel.readByte() == 1;
        this.f46974d = parcel.readByte() == 1;
        this.f46975e = parcel.readByte() == 1;
        this.f46976f = parcel.readByte() == 1;
        this.f46977g = parcel.readLong();
        this.f46978h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f46979i = Collections.unmodifiableList(arrayList);
        this.f46980j = parcel.readByte() == 1;
        this.f46981k = parcel.readLong();
        this.f46982l = parcel.readInt();
        this.f46983m = parcel.readInt();
        this.f46984n = parcel.readInt();
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    static SpliceInsertCommand a(e0 e0Var, long j10, n0 n0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int iM;
        int iG;
        int iG2;
        boolean z13;
        boolean z14;
        long jI;
        long jI2 = e0Var.I();
        boolean z15 = (e0Var.G() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            z10 = false;
            z11 = false;
            j11 = j.f46377b;
            z12 = false;
            j12 = j.f46377b;
            iM = 0;
            iG = 0;
            iG2 = 0;
            z13 = false;
        } else {
            int iG3 = e0Var.G();
            boolean z16 = (iG3 & 128) != 0;
            boolean z17 = (iG3 & 64) != 0;
            boolean z18 = (iG3 & 32) != 0;
            boolean z19 = (iG3 & 16) != 0;
            long jB = (!z17 || z19) ? j.f46377b : TimeSignalCommand.b(e0Var, j10);
            if (!z17) {
                int iG4 = e0Var.G();
                ArrayList arrayList = new ArrayList(iG4);
                for (int i10 = 0; i10 < iG4; i10++) {
                    int iG5 = e0Var.G();
                    long jB2 = !z19 ? TimeSignalCommand.b(e0Var, j10) : j.f46377b;
                    arrayList.add(new b(iG5, jB2, n0Var.b(jB2), null));
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jG = e0Var.G();
                boolean z20 = (128 & jG) != 0;
                jI = ((((jG & 1) << 32) | e0Var.I()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                jI = j.f46377b;
            }
            iM = e0Var.M();
            z13 = z17;
            iG = e0Var.G();
            iG2 = e0Var.G();
            list = listEmptyList;
            long j13 = jB;
            z12 = z14;
            j12 = jI;
            z11 = z19;
            z10 = z16;
            j11 = j13;
        }
        return new SpliceInsertCommand(jI2, z15, z10, z13, z11, j11, n0Var.b(j11), list, z12, j12, iM, iG, iG2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f46972b);
        parcel.writeByte(this.f46973c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46974d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46975e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f46976f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f46977g);
        parcel.writeLong(this.f46978h);
        int size = this.f46979i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f46979i.get(i11).b(parcel);
        }
        parcel.writeByte(this.f46980j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f46981k);
        parcel.writeInt(this.f46982l);
        parcel.writeInt(this.f46983m);
        parcel.writeInt(this.f46984n);
    }
}
