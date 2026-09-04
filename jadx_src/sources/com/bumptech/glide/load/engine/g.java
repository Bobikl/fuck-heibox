package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DecodePath.java */
/* JADX INFO: loaded from: classes6.dex */
public class g<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f41146f = "DecodePath";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<DataType> f41147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> f41148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> f41149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.core.util.n.a<List<Throwable>> f41150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f41151e;

    /* JADX INFO: compiled from: DecodePath.java */
    public interface a<ResourceType> {
        @n0
        s<ResourceType> a(@n0 s<ResourceType> sVar);
    }

    public g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> list, com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> eVar, androidx.core.util.n.a<List<Throwable>> aVar) {
        this.f41147a = cls;
        this.f41148b = list;
        this.f41149c = eVar;
        this.f41150d = aVar;
        this.f41151e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + z5.g.f141884d;
    }

    @n0
    private s<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.m.e(this.f41150d.a());
        try {
            return c(eVar, i10, i11, fVar, list);
        } finally {
            this.f41150d.b(list);
        }
    }

    @n0
    private s<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @n0 com.bumptech.glide.load.f fVar, List<Throwable> list) throws GlideException {
        int size = this.f41148b.size();
        s<ResourceType> sVarB = null;
        for (int i12 = 0; i12 < size; i12++) {
            com.bumptech.glide.load.g<DataType, ResourceType> gVar = this.f41148b.get(i12);
            try {
                if (gVar.a(eVar.a(), fVar)) {
                    sVarB = gVar.b(eVar.a(), i10, i11, fVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable(f41146f, 2)) {
                    Log.v(f41146f, "Failed to decode data for " + gVar, e10);
                }
                list.add(e10);
            }
            if (sVarB != null) {
                break;
            }
        }
        if (sVarB != null) {
            return sVarB;
        }
        throw new GlideException(this.f41151e, new ArrayList(list));
    }

    public s<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, @n0 com.bumptech.glide.load.f fVar, a<ResourceType> aVar) throws GlideException {
        return this.f41149c.a(aVar.a(b(eVar, i10, i11, fVar)), fVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f41147a + ", decoders=" + this.f41148b + ", transcoder=" + this.f41149c + '}';
    }
}
