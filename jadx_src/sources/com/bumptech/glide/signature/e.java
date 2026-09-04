package com.bumptech.glide.signature;

import androidx.annotation.n0;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;

/* JADX INFO: compiled from: ObjectKey.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements com.bumptech.glide.load.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f41973c;

    public e(@n0 Object obj) {
        this.f41973c = m.e(obj);
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        messageDigest.update(this.f41973c.toString().getBytes(com.bumptech.glide.load.c.f40833b));
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f41973c.equals(((e) obj).f41973c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f41973c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f41973c + '}';
    }
}
