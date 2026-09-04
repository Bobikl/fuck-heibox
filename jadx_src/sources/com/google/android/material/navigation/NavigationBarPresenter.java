package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.r;
import com.google.android.material.badge.b;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarPresenter implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f54655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NavigationBarMenuView f54656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54657d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54658e;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f54659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        ParcelableSparseArray f54660c;

        public class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState() {
        }

        SavedState(@n0 Parcel parcel) {
            this.f54659b = parcel.readInt();
            this.f54660c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            parcel.writeInt(this.f54659b);
            parcel.writeParcelable(this.f54660c, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(@p0 g gVar, boolean z10) {
    }

    public void b(int i10) {
        this.f54658e = i10;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c(@p0 g gVar, @p0 j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    @n0
    public Parcelable d() {
        SavedState savedState = new SavedState();
        savedState.f54659b = this.f54656c.getSelectedItemId();
        savedState.f54660c = b.h(this.f54656c.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.m
    public void e(boolean z10) {
        if (this.f54657d) {
            return;
        }
        if (z10) {
            this.f54656c.d();
        } else {
            this.f54656c.r();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(@p0 g gVar, @p0 j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f54658e;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(@n0 Context context, @n0 g gVar) {
        this.f54655b = gVar;
        this.f54656c.a(gVar);
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(@p0 m.a aVar) {
    }

    public void j(@n0 NavigationBarMenuView navigationBarMenuView) {
        this.f54656c = navigationBarMenuView;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(@n0 Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f54656c.q(savedState.f54659b);
            this.f54656c.p(b.g(this.f54656c.getContext(), savedState.f54660c));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(@p0 r rVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    @p0
    public n m(@p0 ViewGroup viewGroup) {
        return this.f54656c;
    }

    public void n(boolean z10) {
        this.f54657d = z10;
    }
}
