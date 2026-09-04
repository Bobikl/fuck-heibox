package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.annotation.l;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f37446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Justification f37447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f37449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f37450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l
    public final int f37451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l
    public final int f37452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f37453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f37454k;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f10, Justification justification, int i10, float f11, float f12, @l int i11, @l int i12, float f13, boolean z10) {
        this.f37444a = str;
        this.f37445b = str2;
        this.f37446c = f10;
        this.f37447d = justification;
        this.f37448e = i10;
        this.f37449f = f11;
        this.f37450g = f12;
        this.f37451h = i11;
        this.f37452i = i12;
        this.f37453j = f13;
        this.f37454k = z10;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f37444a.hashCode() * 31) + this.f37445b.hashCode()) * 31) + this.f37446c)) * 31) + this.f37447d.ordinal()) * 31) + this.f37448e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f37449f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f37451h;
    }
}
