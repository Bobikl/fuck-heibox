package com.bumptech.glide.load.engine;

import androidx.annotation.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: LoadPath.java */
/* JADX INFO: loaded from: classes6.dex */
public class q<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<Data> f41266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.core.util.n.a<List<Throwable>> f41267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<? extends g<Data, ResourceType, Transcode>> f41268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41269d;

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<g<Data, ResourceType, Transcode>> list, androidx.core.util.n.a<List<Throwable>> aVar) {
        this.f41266a = cls;
        this.f41267b = aVar;
        this.f41268c = (List) com.bumptech.glide.util.m.d(list);
        this.f41269d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + z5.g.f141884d;
    }

    private s<Transcode> c(com.bumptech.glide.load.data.e<Data> eVar, @n0 com.bumptech.glide.load.f fVar, int i10, int i11, g.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f41268c.size();
        s<Transcode> sVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                sVarA = this.f41268c.get(i12).a(eVar, i10, i11, fVar, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (sVarA != null) {
                break;
            }
        }
        if (sVarA != null) {
            return sVarA;
        }
        throw new GlideException(this.f41269d, new ArrayList(list));
    }

    public Class<Data> a() {
        return this.f41266a;
    }

    public s<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, @n0 com.bumptech.glide.load.f fVar, int i10, int i11, g.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.m.e(this.f41267b.a());
        try {
            return c(eVar, fVar, i10, i11, aVar, list);
        } finally {
            this.f41267b.b(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f41268c.toArray()) + '}';
    }
}
