package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.b2;
import yh.l;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: functions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FunctionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final l<Object, Object> f128281a = new l<Object, Object>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$IDENTITY$1
        @Override // yh.l
        @dl.e
        public final Object invoke(@dl.e Object obj) {
            return obj;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final l<Object, Boolean> f128282b = new l<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_TRUE$1
        @Override // yh.l
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@dl.e Object obj) {
            return Boolean.TRUE;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final l<Object, Object> f128283c = new l() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_NULL$1
        @Override // yh.l
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@dl.e Object obj) {
            return null;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final l<Object, b2> f128284d = new l<Object, b2>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING$1
        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
            invoke2(obj);
            return b2.f124493a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@dl.e Object obj) {
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final p<Object, Object, b2> f128285e = new p<Object, Object, b2>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_2$1
        public final void a(@dl.e Object obj, @dl.e Object obj2) {
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ b2 invoke(Object obj, Object obj2) {
            a(obj, obj2);
            return b2.f124493a;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final q<Object, Object, Object, b2> f128286f = new q<Object, Object, Object, b2>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_3$1
        public final void a(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3) {
        }

        @Override // yh.q
        public /* bridge */ /* synthetic */ b2 invoke(Object obj, Object obj2, Object obj3) {
            a(obj, obj2, obj3);
            return b2.f124493a;
        }
    };

    @dl.d
    public static final <T> l<T, Boolean> a() {
        return (l<T, Boolean>) f128282b;
    }

    @dl.d
    public static final q<Object, Object, Object, b2> b() {
        return f128286f;
    }
}
