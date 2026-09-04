package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"BanParcelableUsage"})
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<String> f23611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<String> f23612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    BackStackRecordState[] f23613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f23614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f23615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<String> f23616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<BackStackState> f23617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f23618i;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f23615f = null;
        this.f23616g = new ArrayList<>();
        this.f23617h = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f23615f = null;
        this.f23616g = new ArrayList<>();
        this.f23617h = new ArrayList<>();
        this.f23611b = parcel.createStringArrayList();
        this.f23612c = parcel.createStringArrayList();
        this.f23613d = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f23614e = parcel.readInt();
        this.f23615f = parcel.readString();
        this.f23616g = parcel.createStringArrayList();
        this.f23617h = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f23618i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f23611b);
        parcel.writeStringList(this.f23612c);
        parcel.writeTypedArray(this.f23613d, i10);
        parcel.writeInt(this.f23614e);
        parcel.writeString(this.f23615f);
        parcel.writeStringList(this.f23616g);
        parcel.writeTypedList(this.f23617h);
        parcel.writeTypedList(this.f23618i);
    }
}
