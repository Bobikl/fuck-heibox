package com.bumptech.glide;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.util.n;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Registry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f40557k = "Animation";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final String f40558l = "Animation";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f40559m = "Bitmap";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f40560n = "BitmapDrawable";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f40561o = "legacy_prepend_all";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f40562p = "legacy_append";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f40563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.provider.a f40564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.provider.e f40565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.provider.f f40566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f40567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.f f40568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.provider.b f40569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.provider.d f40570h = new com.bumptech.glide.provider.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.provider.c f40571i = new com.bumptech.glide.provider.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n.a<List<Throwable>> f40572j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@n0 String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@n0 Class<?> cls, @n0 Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public NoModelLoaderAvailableException(@n0 Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@n0 M m10, @n0 List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@n0 Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@n0 Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        n.a<List<Throwable>> aVarG = com.bumptech.glide.util.pool.a.g();
        this.f40572j = aVarG;
        this.f40563a = new q(aVarG);
        this.f40564b = new com.bumptech.glide.provider.a();
        this.f40565c = new com.bumptech.glide.provider.e();
        this.f40566d = new com.bumptech.glide.provider.f();
        this.f40567e = new com.bumptech.glide.load.data.f();
        this.f40568f = new com.bumptech.glide.load.resource.transcode.f();
        this.f40569g = new com.bumptech.glide.provider.b();
        z(Arrays.asList("Animation", f40559m, f40560n));
    }

    @n0
    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.g<Data, TResource, Transcode>> f(@n0 Class<Data> cls, @n0 Class<TResource> cls2, @n0 Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f40565c.d(cls, cls2)) {
            for (Class cls5 : this.f40568f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.g(cls, cls4, cls5, this.f40565c.b(cls, cls4), this.f40568f.a(cls4, cls5), this.f40572j));
            }
        }
        return arrayList;
    }

    @n0
    public <Data> Registry a(@n0 Class<Data> cls, @n0 com.bumptech.glide.load.a<Data> aVar) {
        this.f40564b.a(cls, aVar);
        return this;
    }

    @n0
    public <TResource> Registry b(@n0 Class<TResource> cls, @n0 com.bumptech.glide.load.h<TResource> hVar) {
        this.f40566d.a(cls, hVar);
        return this;
    }

    @n0
    public <Data, TResource> Registry c(@n0 Class<Data> cls, @n0 Class<TResource> cls2, @n0 com.bumptech.glide.load.g<Data, TResource> gVar) {
        e(f40562p, cls, cls2, gVar);
        return this;
    }

    @n0
    public <Model, Data> Registry d(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<Model, Data> pVar) {
        this.f40563a.a(cls, cls2, pVar);
        return this;
    }

    @n0
    public <Data, TResource> Registry e(@n0 String str, @n0 Class<Data> cls, @n0 Class<TResource> cls2, @n0 com.bumptech.glide.load.g<Data, TResource> gVar) {
        this.f40565c.a(str, gVar, cls, cls2);
        return this;
    }

    @n0
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f40569g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    @p0
    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.q<Data, TResource, Transcode> h(@n0 Class<Data> cls, @n0 Class<TResource> cls2, @n0 Class<Transcode> cls3) {
        com.bumptech.glide.load.engine.q<Data, TResource, Transcode> qVarA = this.f40571i.a(cls, cls2, cls3);
        if (this.f40571i.c(qVarA)) {
            return null;
        }
        if (qVarA == null) {
            List<com.bumptech.glide.load.engine.g<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
            qVarA = listF.isEmpty() ? null : new com.bumptech.glide.load.engine.q<>(cls, cls2, cls3, listF, this.f40572j);
            this.f40571i.d(cls, cls2, cls3, qVarA);
        }
        return qVarA;
    }

    @n0
    public <Model> List<o<Model, ?>> i(@n0 Model model) {
        return this.f40563a.e(model);
    }

    @n0
    public <Model, TResource, Transcode> List<Class<?>> j(@n0 Class<Model> cls, @n0 Class<TResource> cls2, @n0 Class<Transcode> cls3) {
        List<Class<?>> listB = this.f40570h.b(cls, cls2, cls3);
        if (listB == null) {
            listB = new ArrayList<>();
            Iterator<Class<?>> it = this.f40563a.d(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f40565c.d(it.next(), cls2)) {
                    if (!this.f40568f.b(cls4, cls3).isEmpty() && !listB.contains(cls4)) {
                        listB.add(cls4);
                    }
                }
            }
            this.f40570h.c(cls, cls2, cls3, Collections.unmodifiableList(listB));
        }
        return listB;
    }

    @n0
    public <X> com.bumptech.glide.load.h<X> k(@n0 s<X> sVar) throws NoResultEncoderAvailableException {
        com.bumptech.glide.load.h<X> hVarB = this.f40566d.b(sVar.b());
        if (hVarB != null) {
            return hVarB;
        }
        throw new NoResultEncoderAvailableException(sVar.b());
    }

    @n0
    public <X> com.bumptech.glide.load.data.e<X> l(@n0 X x10) {
        return this.f40567e.a(x10);
    }

    @n0
    public <X> com.bumptech.glide.load.a<X> m(@n0 X x10) throws NoSourceEncoderAvailableException {
        com.bumptech.glide.load.a<X> aVarB = this.f40564b.b(x10.getClass());
        if (aVarB != null) {
            return aVarB;
        }
        throw new NoSourceEncoderAvailableException(x10.getClass());
    }

    public boolean n(@n0 s<?> sVar) {
        return this.f40566d.b(sVar.b()) != null;
    }

    @n0
    public <Data> Registry o(@n0 Class<Data> cls, @n0 com.bumptech.glide.load.a<Data> aVar) {
        this.f40564b.c(cls, aVar);
        return this;
    }

    @n0
    public <TResource> Registry p(@n0 Class<TResource> cls, @n0 com.bumptech.glide.load.h<TResource> hVar) {
        this.f40566d.c(cls, hVar);
        return this;
    }

    @n0
    public <Data, TResource> Registry q(@n0 Class<Data> cls, @n0 Class<TResource> cls2, @n0 com.bumptech.glide.load.g<Data, TResource> gVar) {
        s(f40561o, cls, cls2, gVar);
        return this;
    }

    @n0
    public <Model, Data> Registry r(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<Model, Data> pVar) {
        this.f40563a.g(cls, cls2, pVar);
        return this;
    }

    @n0
    public <Data, TResource> Registry s(@n0 String str, @n0 Class<Data> cls, @n0 Class<TResource> cls2, @n0 com.bumptech.glide.load.g<Data, TResource> gVar) {
        this.f40565c.e(str, gVar, cls, cls2);
        return this;
    }

    @n0
    public Registry t(@n0 ImageHeaderParser imageHeaderParser) {
        this.f40569g.a(imageHeaderParser);
        return this;
    }

    @n0
    public Registry u(@n0 com.bumptech.glide.load.data.e.a<?> aVar) {
        this.f40567e.b(aVar);
        return this;
    }

    @n0
    @Deprecated
    public <Data> Registry v(@n0 Class<Data> cls, @n0 com.bumptech.glide.load.a<Data> aVar) {
        return a(cls, aVar);
    }

    @n0
    @Deprecated
    public <TResource> Registry w(@n0 Class<TResource> cls, @n0 com.bumptech.glide.load.h<TResource> hVar) {
        return b(cls, hVar);
    }

    @n0
    public <TResource, Transcode> Registry x(@n0 Class<TResource> cls, @n0 Class<Transcode> cls2, @n0 com.bumptech.glide.load.resource.transcode.e<TResource, Transcode> eVar) {
        this.f40568f.c(cls, cls2, eVar);
        return this;
    }

    @n0
    public <Model, Data> Registry y(@n0 Class<Model> cls, @n0 Class<Data> cls2, @n0 p<? extends Model, ? extends Data> pVar) {
        this.f40563a.i(cls, cls2, pVar);
        return this;
    }

    @n0
    public final Registry z(@n0 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f40561o);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(f40562p);
        this.f40565c.f(arrayList);
        return this;
    }
}
