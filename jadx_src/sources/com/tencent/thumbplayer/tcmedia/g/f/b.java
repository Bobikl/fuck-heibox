package com.tencent.thumbplayer.tcmedia.g.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f102772e = new b(1920, 1920);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102775c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f102773a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f102776d = a.First;

    public enum a {
        First,
        SAME
    }

    public b(int i10, int i11) {
        this.f102774b = i10;
        this.f102775c = i11;
    }

    public final String toString() {
        return "[initWidth:" + this.f102774b + ", initHeight:" + this.f102775c + ", reConfigByRealFormat:" + this.f102773a + ']';
    }
}
