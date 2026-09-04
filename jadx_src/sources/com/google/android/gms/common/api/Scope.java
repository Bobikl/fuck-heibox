package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @n0
    public static final Parcelable.Creator<Scope> CREATOR = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f52332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getScopeUri", id = 2)
    private final String f52333c;

    @SafeParcelable.b
    Scope(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str) {
        p.i(str, "scopeUri must not be null or empty");
        this.f52332b = i10;
        this.f52333c = str;
    }

    public Scope(@n0 String str) {
        this(1, str);
    }

    @n0
    @v8.a
    public String b() {
        return this.f52333c;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f52333c.equals(((Scope) obj).f52333c);
        }
        return false;
    }

    public int hashCode() {
        return this.f52333c.hashCode();
    }

    @n0
    public String toString() {
        return this.f52333c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.F(parcel, 1, this.f52332b);
        x8.a.Y(parcel, 2, b(), false);
        x8.a.b(parcel, iA);
    }
}
