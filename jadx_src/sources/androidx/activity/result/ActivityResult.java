package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    @n0
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final Intent f1498c;

    public class a implements Parcelable.Creator<ActivityResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(@n0 Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public ActivityResult(int i10, @p0 Intent intent) {
        this.f1497b = i10;
        this.f1498c = intent;
    }

    ActivityResult(Parcel parcel) {
        this.f1497b = parcel.readInt();
        this.f1498c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @n0
    public static String c(int i10) {
        if (i10 != -1) {
            return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @p0
    public Intent a() {
        return this.f1498c;
    }

    public int b() {
        return this.f1497b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f1497b) + ", data=" + this.f1498c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        parcel.writeInt(this.f1497b);
        parcel.writeInt(this.f1498c == null ? 0 : 1);
        Intent intent = this.f1498c;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
