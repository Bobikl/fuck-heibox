package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"BanParcelableUsage"})
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f23474p = "FragmentManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f23475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<String> f23476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f23477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int[] f23478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f23479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f23480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f23481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f23482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final CharSequence f23483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f23484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final CharSequence f23485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList<String> f23486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ArrayList<String> f23487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f23488o;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    BackStackRecordState(Parcel parcel) {
        this.f23475b = parcel.createIntArray();
        this.f23476c = parcel.createStringArrayList();
        this.f23477d = parcel.createIntArray();
        this.f23478e = parcel.createIntArray();
        this.f23479f = parcel.readInt();
        this.f23480g = parcel.readString();
        this.f23481h = parcel.readInt();
        this.f23482i = parcel.readInt();
        this.f23483j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f23484k = parcel.readInt();
        this.f23485l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f23486m = parcel.createStringArrayList();
        this.f23487n = parcel.createStringArrayList();
        this.f23488o = parcel.readInt() != 0;
    }

    BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f23783c.size();
        this.f23475b = new int[size * 6];
        if (!aVar.f23789i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f23476c = new ArrayList<>(size);
        this.f23477d = new int[size];
        this.f23478e = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            p0.a aVar2 = aVar.f23783c.get(i10);
            int i12 = i11 + 1;
            this.f23475b[i11] = aVar2.f23800a;
            ArrayList<String> arrayList = this.f23476c;
            Fragment fragment = aVar2.f23801b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f23475b;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f23802c ? 1 : 0;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f23803d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f23804e;
            int i16 = i15 + 1;
            iArr[i15] = aVar2.f23805f;
            iArr[i16] = aVar2.f23806g;
            this.f23477d[i10] = aVar2.f23807h.ordinal();
            this.f23478e[i10] = aVar2.f23808i.ordinal();
            i10++;
            i11 = i16 + 1;
        }
        this.f23479f = aVar.f23788h;
        this.f23480g = aVar.f23791k;
        this.f23481h = aVar.P;
        this.f23482i = aVar.f23792l;
        this.f23483j = aVar.f23793m;
        this.f23484k = aVar.f23794n;
        this.f23485l = aVar.f23795o;
        this.f23486m = aVar.f23796p;
        this.f23487n = aVar.f23797q;
        this.f23488o = aVar.f23798r;
    }

    private void a(@androidx.annotation.n0 androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f23475b.length) {
                aVar.f23788h = this.f23479f;
                aVar.f23791k = this.f23480g;
                aVar.f23789i = true;
                aVar.f23792l = this.f23482i;
                aVar.f23793m = this.f23483j;
                aVar.f23794n = this.f23484k;
                aVar.f23795o = this.f23485l;
                aVar.f23796p = this.f23486m;
                aVar.f23797q = this.f23487n;
                aVar.f23798r = this.f23488o;
                return;
            }
            p0.a aVar2 = new p0.a();
            int i12 = i10 + 1;
            aVar2.f23800a = this.f23475b[i10];
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f23475b[i12]);
            }
            aVar2.f23807h = Lifecycle.State.values()[this.f23477d[i11]];
            aVar2.f23808i = Lifecycle.State.values()[this.f23478e[i11]];
            int[] iArr = this.f23475b;
            int i13 = i12 + 1;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f23802c = z10;
            int i14 = i13 + 1;
            int i15 = iArr[i13];
            aVar2.f23803d = i15;
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            aVar2.f23804e = i17;
            int i18 = i16 + 1;
            int i19 = iArr[i16];
            aVar2.f23805f = i19;
            int i20 = iArr[i18];
            aVar2.f23806g = i20;
            aVar.f23784d = i15;
            aVar.f23785e = i17;
            aVar.f23786f = i19;
            aVar.f23787g = i20;
            aVar.i(aVar2);
            i11++;
            i10 = i18 + 1;
        }
    }

    @androidx.annotation.n0
    public androidx.fragment.app.a b(@androidx.annotation.n0 FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.P = this.f23481h;
        for (int i10 = 0; i10 < this.f23476c.size(); i10++) {
            String str = this.f23476c.get(i10);
            if (str != null) {
                aVar.f23783c.get(i10).f23801b = fragmentManager.o0(str);
            }
        }
        aVar.Q(1);
        return aVar;
    }

    @androidx.annotation.n0
    public androidx.fragment.app.a c(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Map<String, Fragment> map) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        for (int i10 = 0; i10 < this.f23476c.size(); i10++) {
            String str = this.f23476c.get(i10);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f23480g + " failed due to missing saved state for Fragment (" + str + ")");
                }
                aVar.f23783c.get(i10).f23801b = fragment;
            }
        }
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f23475b);
        parcel.writeStringList(this.f23476c);
        parcel.writeIntArray(this.f23477d);
        parcel.writeIntArray(this.f23478e);
        parcel.writeInt(this.f23479f);
        parcel.writeString(this.f23480g);
        parcel.writeInt(this.f23481h);
        parcel.writeInt(this.f23482i);
        TextUtils.writeToParcel(this.f23483j, parcel, 0);
        parcel.writeInt(this.f23484k);
        TextUtils.writeToParcel(this.f23485l, parcel, 0);
        parcel.writeStringList(this.f23486m);
        parcel.writeStringList(this.f23487n);
        parcel.writeInt(this.f23488o ? 1 : 0);
    }
}
