package com.tencent.mm.opensdk.diffdev.a;

/* JADX INFO: loaded from: classes4.dex */
public enum d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(bb.c.b.S4),
    UUID_ERROR(500);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f100924a;

    d(int i10) {
        this.f100924a = i10;
    }

    public int a() {
        return this.f100924a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f100924a;
    }
}
