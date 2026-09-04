package androidx.compose.animation.core;

import com.lzy.okgo.model.Progress;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0010\u0017B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/p0;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/a0;", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "converter", "Landroidx/compose/animation/core/s1;", "g", "Landroidx/compose/animation/core/p0$b;", ak.av, "Landroidx/compose/animation/core/p0$b;", "f", "()Landroidx/compose/animation/core/p0$b;", "config", "<init>", "(Landroidx/compose/animation/core/p0$b;)V", "b", "animation-core_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.runtime.m0
public final class p0<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b<T> config;

    /* JADX INFO: compiled from: AnimationSpec.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0014\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u0007\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0014\u001a\u00028\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/p0$a;", androidx.exifinterface.media.a.f23244d5, "", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Lkotlin/Function1;", "convertToVector", "Lkotlin/Pair;", "Landroidx/compose/animation/core/b0;", "d", "(Lyh/l;)Lkotlin/Pair;", "other", "", "equals", "", "hashCode", ak.av, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "value", "Landroidx/compose/animation/core/b0;", "()Landroidx/compose/animation/core/b0;", ak.aF, "(Landroidx/compose/animation/core/b0;)V", "easing", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/b0;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f4480c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final T value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private b0 easing;

        public a(T t10, @dl.d b0 easing) {
            kotlin.jvm.internal.f0.p(easing, "easing");
            this.value = t10;
            this.easing = easing;
        }

        public /* synthetic */ a(Object obj, b0 b0Var, int i10, kotlin.jvm.internal.u uVar) {
            this(obj, (i10 & 2) != 0 ? d0.c() : b0Var);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getEasing() {
            return this.easing;
        }

        public final T b() {
            return this.value;
        }

        public final void c(@dl.d b0 b0Var) {
            kotlin.jvm.internal.f0.p(b0Var, "<set-?>");
            this.easing = b0Var;
        }

        @dl.d
        public final <V extends p> Pair<V, b0> d(@dl.d yh.l<? super T, ? extends V> convertToVector) {
            kotlin.jvm.internal.f0.p(convertToVector, "convertToVector");
            return kotlin.c1.a(convertToVector.invoke(this.value), this.easing);
        }

        public boolean equals(@dl.e Object other) {
            if (other instanceof a) {
                a aVar = (a) other;
                if (kotlin.jvm.internal.f0.g(aVar.value, this.value) && kotlin.jvm.internal.f0.g(aVar.easing, this.easing)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T t10 = this.value;
            return ((t10 != null ? t10.hashCode() : 0) * 31) + this.easing.hashCode();
        }
    }

    /* JADX INFO: compiled from: AnimationSpec.kt */
    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\"\u0010#J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u00028\u00012\u0006\u0010\t\u001a\u00020\bH\u0086\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0086\u0004J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\"\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroidx/compose/animation/core/p0$b;", androidx.exifinterface.media.a.f23244d5, "", "", "timeStamp", "Landroidx/compose/animation/core/p0$a;", ak.av, "(Ljava/lang/Object;I)Landroidx/compose/animation/core/p0$a;", "", Progress.G, "b", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/p0$a;", "Landroidx/compose/animation/core/b0;", "easing", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "other", "", "equals", "hashCode", "I", "d", "()I", "g", "(I)V", "durationMillis", ak.aF, "f", "delayMillis", "", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "keyframes", "<init>", "()V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f4483d = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int delayMillis;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int durationMillis = 300;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final Map<Integer, a<T>> keyframes = new LinkedHashMap();

        /* JADX WARN: Multi-variable type inference failed */
        @dl.d
        public final a<T> a(T t10, int i10) {
            a<T> aVar = new a<>(t10, null, 2, 0 == true ? 1 : 0);
            this.keyframes.put(Integer.valueOf(i10), aVar);
            return aVar;
        }

        @dl.d
        public final a<T> b(T t10, float f10) {
            return a(t10, di.d.L0(this.durationMillis * f10));
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getDelayMillis() {
            return this.delayMillis;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getDurationMillis() {
            return this.durationMillis;
        }

        @dl.d
        public final Map<Integer, a<T>> e() {
            return this.keyframes;
        }

        public boolean equals(@dl.e Object other) {
            if (other instanceof b) {
                b bVar = (b) other;
                if (this.delayMillis == bVar.delayMillis && this.durationMillis == bVar.durationMillis && kotlin.jvm.internal.f0.g(this.keyframes, bVar.keyframes)) {
                    return true;
                }
            }
            return false;
        }

        public final void f(int i10) {
            this.delayMillis = i10;
        }

        public final void g(int i10) {
            this.durationMillis = i10;
        }

        public final void h(@dl.d a<T> aVar, @dl.d b0 easing) {
            kotlin.jvm.internal.f0.p(aVar, "<this>");
            kotlin.jvm.internal.f0.p(easing, "easing");
            aVar.c(easing);
        }

        public int hashCode() {
            return (((this.durationMillis * 31) + this.delayMillis) * 31) + this.keyframes.hashCode();
        }
    }

    public p0(@dl.d b<T> config) {
        kotlin.jvm.internal.f0.p(config, "config");
        this.config = config;
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof p0) && kotlin.jvm.internal.f0.g(this.config, ((p0) other).config);
    }

    @dl.d
    public final b<T> f() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.f0, androidx.compose.animation.core.h
    @dl.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public <V extends p> s1<V> a(@dl.d f1<T, V> converter) {
        kotlin.jvm.internal.f0.p(converter, "converter");
        Map<Integer, a<T>> mapE = this.config.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.r0.j(mapE.size()));
        Iterator<T> it = mapE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((a) entry.getValue()).d(converter.a()));
        }
        return new s1<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }

    public int hashCode() {
        return this.config.hashCode();
    }
}
