package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"BanParcelableUsage"})
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List<String> f23489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<BackStackRecordState> f23490c;

    public class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    BackStackState(@androidx.annotation.n0 Parcel parcel) {
        this.f23489b = parcel.createStringArrayList();
        this.f23490c = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    BackStackState(List<String> list, List<BackStackRecordState> list2) {
        this.f23489b = list;
        this.f23490c = list2;
    }

    @androidx.annotation.n0
    List<androidx.fragment.app.a> a(@androidx.annotation.n0 FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap map2 = new HashMap(this.f23489b.size());
        for (String str : this.f23489b) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle bundleC = fragmentManager.I0().C(str, null);
                if (bundleC != null) {
                    ClassLoader classLoader = fragmentManager.K0().f().getClassLoader();
                    Fragment fragmentA = ((FragmentState) bundleC.getParcelable("state")).a(fragmentManager.H0(), classLoader);
                    fragmentA.mSavedFragmentState = bundleC;
                    if (bundleC.getBundle("savedInstanceState") == null) {
                        fragmentA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleC.getBundle(com.tekartik.sqflite.b.f98603v);
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentA.setArguments(bundle);
                    map2.put(fragmentA.mWho, fragmentA);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BackStackRecordState> it = this.f23490c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(fragmentManager, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.n0 Parcel parcel, int i10) {
        parcel.writeStringList(this.f23489b);
        parcel.writeTypedList(this.f23490c);
    }
}
