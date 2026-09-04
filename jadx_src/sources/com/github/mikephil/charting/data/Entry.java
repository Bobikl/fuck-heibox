package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes6.dex */
public class Entry extends BaseEntry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new Parcelable.Creator<Entry>() { // from class: com.github.mikephil.charting.data.Entry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Entry[] newArray(int i10) {
            return new Entry[i10];
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f43137x;

    public Entry() {
        this.f43137x = 0.0f;
    }

    public Entry(float f10, float f11) {
        super(f11);
        this.f43137x = f10;
    }

    public Entry(float f10, float f11, Drawable drawable) {
        super(f11, drawable);
        this.f43137x = f10;
    }

    public Entry(float f10, float f11, Drawable drawable, Object obj) {
        super(f11, drawable, obj);
        this.f43137x = f10;
    }

    public Entry(float f10, float f11, Object obj) {
        super(f11, obj);
        this.f43137x = f10;
    }

    protected Entry(Parcel parcel) {
        this.f43137x = 0.0f;
        this.f43137x = parcel.readFloat();
        setY(parcel.readFloat());
        if (parcel.readInt() == 1) {
            setData(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }

    public Entry copy() {
        return new Entry(this.f43137x, getY(), getData());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equalTo(Entry entry) {
        if (entry == null || entry.getData() != getData()) {
            return false;
        }
        float fAbs = Math.abs(entry.f43137x - this.f43137x);
        float f10 = Utils.FLOAT_EPSILON;
        return fAbs <= f10 && Math.abs(entry.getY() - getY()) <= f10;
    }

    public float getX() {
        return this.f43137x;
    }

    public void setX(float f10) {
        this.f43137x = f10;
    }

    public String toString() {
        return "Entry, x: " + this.f43137x + " y: " + getY();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f43137x);
        parcel.writeFloat(getY());
        if (getData() == null) {
            parcel.writeInt(0);
        } else {
            if (!(getData() instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) getData(), i10);
        }
    }
}
