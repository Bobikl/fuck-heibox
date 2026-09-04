package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Entry[] f46817b;

    public interface Entry extends Parcelable {
        @p0
        a2 J0();

        void m(m2.b bVar);

        @p0
        byte[] v0();
    }

    public class a implements Parcelable.Creator<Metadata> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    Metadata(Parcel parcel) {
        this.f46817b = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f46817b;
            if (i10 >= entryArr.length) {
                return;
            }
            entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i10++;
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.f46817b = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Entry... entryArr) {
        this.f46817b = entryArr;
    }

    public Metadata a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) u0.Y0(this.f46817b, entryArr));
    }

    public Metadata b(@p0 Metadata metadata) {
        return metadata == null ? this : a(metadata.f46817b);
    }

    public Entry c(int i10) {
        return this.f46817b[i10];
    }

    public int d() {
        return this.f46817b.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f46817b, ((Metadata) obj).f46817b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f46817b);
    }

    public String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.f46817b));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46817b.length);
        for (Entry entry : this.f46817b) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
