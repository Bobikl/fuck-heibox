package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"BanParcelableUsage"})
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f23619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f23620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f23621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f23622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f23623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f23624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f23625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f23626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f23627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f23628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f23629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final String f23630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f23631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f23632o;

    public class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    FragmentState(Parcel parcel) {
        this.f23619b = parcel.readString();
        this.f23620c = parcel.readString();
        this.f23621d = parcel.readInt() != 0;
        this.f23622e = parcel.readInt();
        this.f23623f = parcel.readInt();
        this.f23624g = parcel.readString();
        this.f23625h = parcel.readInt() != 0;
        this.f23626i = parcel.readInt() != 0;
        this.f23627j = parcel.readInt() != 0;
        this.f23628k = parcel.readInt() != 0;
        this.f23629l = parcel.readInt();
        this.f23630m = parcel.readString();
        this.f23631n = parcel.readInt();
        this.f23632o = parcel.readInt() != 0;
    }

    FragmentState(Fragment fragment) {
        this.f23619b = fragment.getClass().getName();
        this.f23620c = fragment.mWho;
        this.f23621d = fragment.mFromLayout;
        this.f23622e = fragment.mFragmentId;
        this.f23623f = fragment.mContainerId;
        this.f23624g = fragment.mTag;
        this.f23625h = fragment.mRetainInstance;
        this.f23626i = fragment.mRemoving;
        this.f23627j = fragment.mDetached;
        this.f23628k = fragment.mHidden;
        this.f23629l = fragment.mMaxState.ordinal();
        this.f23630m = fragment.mTargetWho;
        this.f23631n = fragment.mTargetRequestCode;
        this.f23632o = fragment.mUserVisibleHint;
    }

    @androidx.annotation.n0
    Fragment a(@androidx.annotation.n0 s sVar, @androidx.annotation.n0 ClassLoader classLoader) {
        Fragment fragmentA = sVar.a(classLoader, this.f23619b);
        fragmentA.mWho = this.f23620c;
        fragmentA.mFromLayout = this.f23621d;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f23622e;
        fragmentA.mContainerId = this.f23623f;
        fragmentA.mTag = this.f23624g;
        fragmentA.mRetainInstance = this.f23625h;
        fragmentA.mRemoving = this.f23626i;
        fragmentA.mDetached = this.f23627j;
        fragmentA.mHidden = this.f23628k;
        fragmentA.mMaxState = Lifecycle.State.values()[this.f23629l];
        fragmentA.mTargetWho = this.f23630m;
        fragmentA.mTargetRequestCode = this.f23631n;
        fragmentA.mUserVisibleHint = this.f23632o;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @androidx.annotation.n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f23619b);
        sb2.append(" (");
        sb2.append(this.f23620c);
        sb2.append(")}:");
        if (this.f23621d) {
            sb2.append(" fromLayout");
        }
        if (this.f23623f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f23623f));
        }
        String str = this.f23624g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f23624g);
        }
        if (this.f23625h) {
            sb2.append(" retainInstance");
        }
        if (this.f23626i) {
            sb2.append(" removing");
        }
        if (this.f23627j) {
            sb2.append(" detached");
        }
        if (this.f23628k) {
            sb2.append(" hidden");
        }
        if (this.f23630m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f23630m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f23631n);
        }
        if (this.f23632o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23619b);
        parcel.writeString(this.f23620c);
        parcel.writeInt(this.f23621d ? 1 : 0);
        parcel.writeInt(this.f23622e);
        parcel.writeInt(this.f23623f);
        parcel.writeString(this.f23624g);
        parcel.writeInt(this.f23625h ? 1 : 0);
        parcel.writeInt(this.f23626i ? 1 : 0);
        parcel.writeInt(this.f23627j ? 1 : 0);
        parcel.writeInt(this.f23628k ? 1 : 0);
        parcel.writeInt(this.f23629l);
        parcel.writeString(this.f23630m);
        parcel.writeInt(this.f23631n);
        parcel.writeInt(this.f23632o ? 1 : 0);
    }
}
