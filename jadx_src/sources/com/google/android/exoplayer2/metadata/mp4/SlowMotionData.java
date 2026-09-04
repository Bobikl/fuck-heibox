package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.u0;
import com.google.common.base.s;
import com.google.common.collect.r;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Segment> f46962b;

    public static final class Segment implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f46965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f46966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Comparator<Segment> f46963e = new Comparator() { // from class: com.google.android.exoplayer2.metadata.mp4.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SlowMotionData.Segment.b((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        public class a implements Parcelable.Creator<Segment> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Segment[] newArray(int i10) {
                return new Segment[i10];
            }
        }

        public Segment(long j10, long j11, int i10) {
            com.google.android.exoplayer2.util.a.a(j10 < j11);
            this.f46964b = j10;
            this.f46965c = j11;
            this.f46966d = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(Segment segment, Segment segment2) {
            return r.n().g(segment.f46964b, segment2.f46964b).g(segment.f46965c, segment2.f46965c).f(segment.f46966d, segment2.f46966d).m();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f46964b == segment.f46964b && this.f46965c == segment.f46965c && this.f46966d == segment.f46966d;
        }

        public int hashCode() {
            return s.b(Long.valueOf(this.f46964b), Long.valueOf(this.f46965c), Integer.valueOf(this.f46966d));
        }

        public String toString() {
            return u0.H("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f46964b), Long.valueOf(this.f46965c), Integer.valueOf(this.f46966d));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f46964b);
            parcel.writeLong(this.f46965c);
            parcel.writeInt(this.f46966d);
        }
    }

    public class a implements Parcelable.Creator<SlowMotionData> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SlowMotionData[] newArray(int i10) {
            return new SlowMotionData[i10];
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f46962b = list;
        com.google.android.exoplayer2.util.a.a(!a(list));
    }

    private static boolean a(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f46965c;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f46964b < j10) {
                return true;
            }
            j10 = list.get(i10).f46965c;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ a2 J0() {
        return com.google.android.exoplayer2.metadata.a.b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f46962b.equals(((SlowMotionData) obj).f46962b);
    }

    public int hashCode() {
        return this.f46962b.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void m(m2.b bVar) {
        com.google.android.exoplayer2.metadata.a.c(this, bVar);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f46962b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21);
        sb2.append("SlowMotion: segments=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] v0() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f46962b);
    }
}
