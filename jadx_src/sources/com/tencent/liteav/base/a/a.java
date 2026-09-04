package com.tencent.liteav.base.a;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static a f99560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f99561b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f99562c = 70;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f99563d = 80;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f99564e = 50;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f99565f = 10;

    public static a a() {
        if (f99560a == null) {
            synchronized (a.class) {
                if (f99560a == null) {
                    f99560a = new a();
                }
            }
        }
        return f99560a;
    }
}
