package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f46988b;

    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46990b;

        private b(int i10, long j10) {
            this.f46989a = i10;
            this.f46990b = j10;
        }

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f46989a);
            parcel.writeLong(this.f46990b);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f46994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f46995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f46996f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f46997g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f46998h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f46999i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f47000j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f47001k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f46991a = j10;
            this.f46992b = z10;
            this.f46993c = z11;
            this.f46994d = z12;
            this.f46996f = Collections.unmodifiableList(list);
            this.f46995e = j11;
            this.f46997g = z13;
            this.f46998h = j12;
            this.f46999i = i10;
            this.f47000j = i11;
            this.f47001k = i12;
        }

        private c(Parcel parcel) {
            this.f46991a = parcel.readLong();
            this.f46992b = parcel.readByte() == 1;
            this.f46993c = parcel.readByte() == 1;
            this.f46994d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f46996f = Collections.unmodifiableList(arrayList);
            this.f46995e = parcel.readLong();
            this.f46997g = parcel.readByte() == 1;
            this.f46998h = parcel.readLong();
            this.f46999i = parcel.readInt();
            this.f47000j = parcel.readInt();
            this.f47001k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(e0 e0Var) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int iG;
            boolean z12;
            boolean z13;
            long jI;
            long jI2 = e0Var.I();
            boolean z14 = (e0Var.G() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = j.f46377b;
                z11 = false;
                j11 = j.f46377b;
                i10 = 0;
                i11 = 0;
                iG = 0;
                z12 = false;
            } else {
                int iG2 = e0Var.G();
                boolean z15 = (iG2 & 128) != 0;
                boolean z16 = (iG2 & 64) != 0;
                boolean z17 = (iG2 & 32) != 0;
                long jI3 = z16 ? e0Var.I() : j.f46377b;
                if (!z16) {
                    int iG3 = e0Var.G();
                    ArrayList arrayList3 = new ArrayList(iG3);
                    for (int i12 = 0; i12 < iG3; i12++) {
                        arrayList3.add(new b(e0Var.G(), e0Var.I(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jG = e0Var.G();
                    boolean z18 = (128 & jG) != 0;
                    jI = ((((jG & 1) << 32) | e0Var.I()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jI = j.f46377b;
                }
                int iM = e0Var.M();
                int iG4 = e0Var.G();
                z12 = z16;
                iG = e0Var.G();
                j11 = jI;
                arrayList = arrayList2;
                long j12 = jI3;
                i10 = iM;
                i11 = iG4;
                j10 = j12;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(jI2, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, iG);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f46991a);
            parcel.writeByte(this.f46992b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f46993c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f46994d ? (byte) 1 : (byte) 0);
            int size = this.f46996f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f46996f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f46995e);
            parcel.writeByte(this.f46997g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f46998h);
            parcel.writeInt(this.f46999i);
            parcel.writeInt(this.f47000j);
            parcel.writeInt(this.f47001k);
        }
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f46988b = Collections.unmodifiableList(arrayList);
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    private SpliceScheduleCommand(List<c> list) {
        this.f46988b = Collections.unmodifiableList(list);
    }

    static SpliceScheduleCommand a(e0 e0Var) {
        int iG = e0Var.G();
        ArrayList arrayList = new ArrayList(iG);
        for (int i10 = 0; i10 < iG; i10++) {
            arrayList.add(c.e(e0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f46988b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f46988b.get(i11).f(parcel);
        }
    }
}
