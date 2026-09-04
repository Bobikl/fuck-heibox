package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: NavBackStackEntryState.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavBackStackEntryState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryState.kt\nandroidx/navigation/NavBackStackEntryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f24744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final Bundle f24746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final Bundle f24747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final b f24743f = new b(null);

    @dl.d
    @xh.e
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    /* JADX INFO: compiled from: NavBackStackEntryState.kt */
    public static final class a implements Parcelable.Creator<NavBackStackEntryState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState createFromParcel(Parcel inParcel) {
            kotlin.jvm.internal.f0.p(inParcel, "inParcel");
            return new NavBackStackEntryState(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState[] newArray(int i10) {
            return new NavBackStackEntryState[i10];
        }
    }

    /* JADX INFO: compiled from: NavBackStackEntryState.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public NavBackStackEntryState(@dl.d Parcel inParcel) {
        kotlin.jvm.internal.f0.p(inParcel, "inParcel");
        String string = inParcel.readString();
        kotlin.jvm.internal.f0.m(string);
        this.f24744b = string;
        this.f24745c = inParcel.readInt();
        this.f24746d = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        kotlin.jvm.internal.f0.m(bundle);
        this.f24747e = bundle;
    }

    public NavBackStackEntryState(@dl.d NavBackStackEntry entry) {
        kotlin.jvm.internal.f0.p(entry, "entry");
        this.f24744b = entry.f();
        this.f24745c = entry.e().A();
        this.f24746d = entry.c();
        Bundle bundle = new Bundle();
        this.f24747e = bundle;
        entry.j(bundle);
    }

    @dl.e
    public final Bundle a() {
        return this.f24746d;
    }

    public final int b() {
        return this.f24745c;
    }

    @dl.d
    public final String c() {
        return this.f24744b;
    }

    @dl.d
    public final Bundle d() {
        return this.f24747e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @dl.d
    public final NavBackStackEntry f(@dl.d Context context, @dl.d NavDestination destination, @dl.d Lifecycle.State hostLifecycleState, @dl.e w wVar) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f24746d;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return NavBackStackEntry.f24725p.a(context, destination, bundle, hostLifecycleState, wVar, this.f24744b, this.f24747e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@dl.d Parcel parcel, int i10) {
        kotlin.jvm.internal.f0.p(parcel, "parcel");
        parcel.writeString(this.f24744b);
        parcel.writeInt(this.f24745c);
        parcel.writeBundle(this.f24746d);
        parcel.writeBundle(this.f24747e);
    }
}
