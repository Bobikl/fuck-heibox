package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: ParcelableCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class x {

    /* JADX INFO: compiled from: ParcelableCompat.java */
    public static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y<T> f20994a;

        a(y<T> yVar) {
            this.f20994a = yVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f20994a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f20994a.createFromParcel(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i10) {
            return this.f20994a.newArray(i10);
        }
    }

    private x() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(y<T> yVar) {
        return new a(yVar);
    }
}
