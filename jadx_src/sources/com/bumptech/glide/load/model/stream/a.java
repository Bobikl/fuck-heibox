package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.model.i;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BaseGlideUrlLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<Model> implements o<Model, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<com.bumptech.glide.load.model.h, InputStream> f41403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final n<Model, com.bumptech.glide.load.model.h> f41404b;

    protected a(o<com.bumptech.glide.load.model.h, InputStream> oVar) {
        this(oVar, null);
    }

    protected a(o<com.bumptech.glide.load.model.h, InputStream> oVar, @p0 n<Model, com.bumptech.glide.load.model.h> nVar) {
        this.f41403a = oVar;
        this.f41404b = nVar;
    }

    private static List<com.bumptech.glide.load.c> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.bumptech.glide.load.model.h(it.next()));
        }
        return arrayList;
    }

    @Override // com.bumptech.glide.load.model.o
    @p0
    public o.a<InputStream> a(@n0 Model model, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        n<Model, com.bumptech.glide.load.model.h> nVar = this.f41404b;
        com.bumptech.glide.load.model.h hVarB = nVar != null ? nVar.b(model, i10, i11) : null;
        if (hVarB == null) {
            String strF = f(model, i10, i11, fVar);
            if (TextUtils.isEmpty(strF)) {
                return null;
            }
            com.bumptech.glide.load.model.h hVar = new com.bumptech.glide.load.model.h(strF, e(model, i10, i11, fVar));
            n<Model, com.bumptech.glide.load.model.h> nVar2 = this.f41404b;
            if (nVar2 != null) {
                nVar2.c(model, i10, i11, hVar);
            }
            hVarB = hVar;
        }
        List<String> listD = d(model, i10, i11, fVar);
        o.a<InputStream> aVarA = this.f41403a.a(hVarB, i10, i11, fVar);
        return (aVarA == null || listD.isEmpty()) ? aVarA : new o.a<>(aVarA.f41378a, c(listD), aVarA.f41380c);
    }

    protected List<String> d(Model model, int i10, int i11, com.bumptech.glide.load.f fVar) {
        return Collections.emptyList();
    }

    @p0
    protected i e(Model model, int i10, int i11, com.bumptech.glide.load.f fVar) {
        return i.f41356b;
    }

    protected abstract String f(Model model, int i10, int i11, com.bumptech.glide.load.f fVar);
}
