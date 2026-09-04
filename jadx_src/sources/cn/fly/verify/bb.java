package cn.fly.verify;

/* JADX INFO: loaded from: classes6.dex */
public enum bb {
    JP("jp", "Japan"),
    US("us", "United States of America"),
    DEFAULT(null, null);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f35825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35826e;

    bb(String str, String str2) {
        this.f35825d = str;
        this.f35826e = str2;
    }

    public static bb a(String str) {
        if (str == null) {
            return DEFAULT;
        }
        for (bb bbVar : values()) {
            if (str.equalsIgnoreCase(bbVar.f35825d)) {
                return bbVar;
            }
        }
        return DEFAULT;
    }

    public String a() {
        return this.f35825d;
    }
}
