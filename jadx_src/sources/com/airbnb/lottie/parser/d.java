package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: AnimatableValueParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    private d() {
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> a(JsonReader jsonReader, float f10, com.airbnb.lottie.g gVar, n0<T> n0Var) throws IOException {
        return u.a(jsonReader, gVar, f10, n0Var, false);
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> b(JsonReader jsonReader, com.airbnb.lottie.g gVar, n0<T> n0Var) throws IOException {
        return u.a(jsonReader, gVar, 1.0f, n0Var, false);
    }

    static com.airbnb.lottie.model.animatable.a c(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.a(b(jsonReader, gVar, g.f37691a));
    }

    static com.airbnb.lottie.model.animatable.j d(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.j(b(jsonReader, gVar, i.f37696a));
    }

    public static com.airbnb.lottie.model.animatable.b e(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return f(jsonReader, gVar, true);
    }

    public static com.airbnb.lottie.model.animatable.b f(JsonReader jsonReader, com.airbnb.lottie.g gVar, boolean z10) throws IOException {
        return new com.airbnb.lottie.model.animatable.b(a(jsonReader, z10 ? com.airbnb.lottie.utils.j.e() : 1.0f, gVar, l.f37713a));
    }

    static com.airbnb.lottie.model.animatable.c g(JsonReader jsonReader, com.airbnb.lottie.g gVar, int i10) throws IOException {
        return new com.airbnb.lottie.model.animatable.c(b(jsonReader, gVar, new o(i10)));
    }

    static com.airbnb.lottie.model.animatable.d h(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.d(b(jsonReader, gVar, r.f37793a));
    }

    static com.airbnb.lottie.model.animatable.f i(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.f(u.a(jsonReader, gVar, com.airbnb.lottie.utils.j.e(), c0.f37684a, true));
    }

    static com.airbnb.lottie.model.animatable.g j(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.g((List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>>) b(jsonReader, gVar, g0.f37692a));
    }

    static com.airbnb.lottie.model.animatable.h k(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.h(a(jsonReader, com.airbnb.lottie.utils.j.e(), gVar, h0.f37694a));
    }
}
