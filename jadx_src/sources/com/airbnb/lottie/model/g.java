package com.airbnb.lottie.model;

/* JADX INFO: compiled from: Marker.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f37583d = "\r";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f37585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f37586c;

    public g(String str, float f10, float f11) {
        this.f37584a = str;
        this.f37586c = f11;
        this.f37585b = f10;
    }

    public boolean a(String str) {
        if (this.f37584a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f37584a.endsWith(f37583d)) {
            String str2 = this.f37584a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
