package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes5.dex */
public class GifViewSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<GifViewSavedState> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[][] f138334b;

    public class a implements Parcelable.Creator<GifViewSavedState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GifViewSavedState createFromParcel(Parcel parcel) {
            return new GifViewSavedState(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GifViewSavedState[] newArray(int i10) {
            return new GifViewSavedState[i10];
        }
    }

    private GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.f138334b = new long[parcel.readInt()][];
        int i10 = 0;
        while (true) {
            long[][] jArr = this.f138334b;
            if (i10 >= jArr.length) {
                return;
            }
            jArr[i10] = parcel.createLongArray();
            i10++;
        }
    }

    /* synthetic */ GifViewSavedState(Parcel parcel, a aVar) {
        this(parcel);
    }

    GifViewSavedState(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.f138334b = new long[][]{jArr};
    }

    GifViewSavedState(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f138334b = new long[drawableArr.length][];
        for (int i10 = 0; i10 < drawableArr.length; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable instanceof d) {
                this.f138334b[i10] = ((d) drawable).f138345h.o();
            } else {
                this.f138334b[i10] = null;
            }
        }
    }

    void a(Drawable drawable, int i10) {
        long[] jArr = this.f138334b[i10];
        if (jArr == null || !(drawable instanceof d)) {
            return;
        }
        d dVar = (d) drawable;
        dVar.L(dVar.f138345h.E(jArr, dVar.f138344g));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f138334b.length);
        for (long[] jArr : this.f138334b) {
            parcel.writeLongArray(jArr);
        }
    }
}
