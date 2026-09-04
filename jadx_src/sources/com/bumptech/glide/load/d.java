package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.n0;
import com.bumptech.glide.load.engine.s;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: MultiTransformation.java */
/* JADX INFO: loaded from: classes6.dex */
public class d<T> implements i<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<? extends i<T>> f40834c;

    public d(@n0 Collection<? extends i<T>> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f40834c = collection;
    }

    @SafeVarargs
    public d(@n0 i<T>... iVarArr) {
        if (iVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f40834c = Arrays.asList(iVarArr);
    }

    @Override // com.bumptech.glide.load.i
    @n0
    public s<T> a(@n0 Context context, @n0 s<T> sVar, int i10, int i11) {
        Iterator<? extends i<T>> it = this.f40834c.iterator();
        s<T> sVar2 = sVar;
        while (it.hasNext()) {
            s<T> sVarA = it.next().a(context, sVar2, i10, i11);
            if (sVar2 != null && !sVar2.equals(sVar) && !sVar2.equals(sVarA)) {
                sVar2.recycle();
            }
            sVar2 = sVarA;
        }
        return sVar2;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        Iterator<? extends i<T>> it = this.f40834c.iterator();
        while (it.hasNext()) {
            it.next().b(messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f40834c.equals(((d) obj).f40834c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f40834c.hashCode();
    }
}
