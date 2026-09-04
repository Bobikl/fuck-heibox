package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.content.k;
import java.util.List;

/* JADX INFO: compiled from: FontCharacter.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<k> f37480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f37481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f37482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f37483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f37485f;

    public c(List<k> list, char c10, double d10, double d11, String str, String str2) {
        this.f37480a = list;
        this.f37481b = c10;
        this.f37482c = d10;
        this.f37483d = d11;
        this.f37484e = str;
        this.f37485f = str2;
    }

    public static int e(char c10, String str, String str2) {
        return ((((0 + c10) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<k> a() {
        return this.f37480a;
    }

    double b() {
        return this.f37482c;
    }

    String c() {
        return this.f37484e;
    }

    public double d() {
        return this.f37483d;
    }

    public int hashCode() {
        return e(this.f37481b, this.f37485f, this.f37484e);
    }
}
