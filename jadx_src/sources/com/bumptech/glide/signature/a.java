package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.n0;
import com.bumptech.glide.util.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: AndroidResourceSignature.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements com.bumptech.glide.load.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.c f41966d;

    private a(int i10, com.bumptech.glide.load.c cVar) {
        this.f41965c = i10;
        this.f41966d = cVar;
    }

    @n0
    public static com.bumptech.glide.load.c c(@n0 Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        this.f41966d.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f41965c).array());
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f41965c == aVar.f41965c && this.f41966d.equals(aVar.f41966d);
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return o.r(this.f41966d, this.f41965c);
    }
}
