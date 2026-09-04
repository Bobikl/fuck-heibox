package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NotImplementedError;

/* JADX INFO: compiled from: Composables.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001a.\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aB\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aL\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aF\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0010\"\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aD\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0010\"\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a0\u0010\u001b\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a0\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0013\b\u0004\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001ad\u0010(\u001a\u00020\u0019\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001ad\u0010*\u001a\u00020\u0019\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010)\u001as\u0010+\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001as\u0010-\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010,\u001a\u0099\u0001\u00100\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&2$\b\b\u0010/\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0014¢\u0006\u0002\b&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a\u0099\u0001\u00102\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\"\u0018\u0001*\u0006\u0012\u0002\b\u00030!2\u000e\b\b\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0002¢\u0006\u0002\b&2$\b\b\u0010/\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\u0004\u0012\u00020\u00190$¢\u0006\u0002\b\u0014¢\u0006\u0002\b&2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00190\u0001¢\u0006\u0002\b\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00101\u001a\b\u00103\u001a\u00020\u0019H\u0001\u001a\u000f\u00105\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106\"\u0011\u0010:\u001a\u0002078G¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0011\u0010>\u001a\u00020;8G¢\u0006\u0006\u001a\u0004\b<\u0010=\"\u0017\u0010D\u001a\u00020?8G¢\u0006\f\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010A\"\u0011\u0010H\u001a\u00020E8G¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006I"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "Landroidx/compose/runtime/c0;", "calculation", ak.aB, "(Lyh/a;Landroidx/compose/runtime/p;I)Ljava/lang/Object;", "", "key1", "r", "(Ljava/lang/Object;Lyh/a;Landroidx/compose/runtime/p;I)Ljava/lang/Object;", "key2", "q", "(Ljava/lang/Object;Ljava/lang/Object;Lyh/a;Landroidx/compose/runtime/p;I)Ljava/lang/Object;", "key3", "p", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyh/a;Landroidx/compose/runtime/p;I)Ljava/lang/Object;", "", Constants.PARAM_KEYS, "t", "([Ljava/lang/Object;Lyh/a;Landroidx/compose/runtime/p;I)Ljava/lang/Object;", "Landroidx/compose/runtime/h;", "block", "o", "([Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)Ljava/lang/Object;", "key", "Lkotlin/b2;", "content", "g", "(Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)V", "", "active", RXScreenCaptureService.KEY_HEIGHT, "(ZLyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/runtime/e;", androidx.exifinterface.media.a.S4, "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/t;", "update", ak.av, "(Lyh/a;Lyh/l;Landroidx/compose/runtime/p;I)V", "d", "b", "(Lyh/a;Lyh/l;Lyh/p;Landroidx/compose/runtime/p;I)V", "e", "Landroidx/compose/runtime/v1;", "skippableUpdate", ak.aF, "(Lyh/a;Lyh/l;Lyh/q;Lyh/p;Landroidx/compose/runtime/p;I)V", "f", "n", "Landroidx/compose/runtime/r;", ak.aG, "(Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/r;", "Landroidx/compose/runtime/p;", "i", "(Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/p;", "currentComposer", "Landroidx/compose/runtime/n1;", "m", "(Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/n1;", "currentRecomposeScope", "Landroidx/compose/runtime/w;", "k", "(Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/w;", "getCurrentCompositionLocalContext$annotations", "()V", "currentCompositionLocalContext", "", "j", "(Landroidx/compose/runtime/p;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class ComposablesKt {
    @h
    public static final /* synthetic */ <T, E extends e<?>> void a(final yh.a<? extends T> factory, yh.l<? super Updater<T>, kotlin.b2> update, p pVar, int i10) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        kotlin.jvm.internal.f0.p(update, "update");
        pVar.T(1886828752);
        e<?> eVarG = pVar.G();
        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.S4);
        if (!(eVarG instanceof e)) {
            n();
        }
        pVar.J();
        if (pVar.D()) {
            pVar.L(new yh.a<T>() { // from class: androidx.compose.runtime.ComposablesKt$ComposeNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final T invoke() {
                    return factory.invoke();
                }
            });
        } else {
            pVar.d();
        }
        update.invoke(Updater.a(Updater.b(pVar)));
        pVar.f();
        pVar.c0();
    }

    @i(scheme = "[0[0]]")
    @h
    public static final /* synthetic */ <T, E extends e<?>> void b(yh.a<? extends T> factory, yh.l<? super Updater<T>, kotlin.b2> update, yh.p<? super p, ? super Integer, kotlin.b2> content, p pVar, int i10) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        kotlin.jvm.internal.f0.p(update, "update");
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(-548224868);
        e<?> eVarG = pVar.G();
        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.S4);
        if (!(eVarG instanceof e)) {
            n();
        }
        pVar.J();
        if (pVar.D()) {
            pVar.L(factory);
        } else {
            pVar.d();
        }
        update.invoke(Updater.a(Updater.b(pVar)));
        content.invoke(pVar, Integer.valueOf((i10 >> 6) & 14));
        pVar.f();
        pVar.c0();
    }

    @i(scheme = "[0[0][0]]")
    @h
    public static final /* synthetic */ <T, E extends e<?>> void c(yh.a<? extends T> factory, yh.l<? super Updater<T>, kotlin.b2> update, yh.q<? super v1<T>, ? super p, ? super Integer, kotlin.b2> skippableUpdate, yh.p<? super p, ? super Integer, kotlin.b2> content, p pVar, int i10) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        kotlin.jvm.internal.f0.p(update, "update");
        kotlin.jvm.internal.f0.p(skippableUpdate, "skippableUpdate");
        kotlin.jvm.internal.f0.p(content, "content");
        e<?> eVarG = pVar.G();
        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.S4);
        if (!(eVarG instanceof e)) {
            n();
        }
        pVar.J();
        if (pVar.D()) {
            pVar.L(factory);
        } else {
            pVar.d();
        }
        update.invoke(Updater.a(Updater.b(pVar)));
        skippableUpdate.invoke(v1.a(v1.b(pVar)), pVar, Integer.valueOf((i10 >> 3) & 112));
        pVar.T(2058660585);
        content.invoke(pVar, Integer.valueOf((i10 >> 9) & 14));
        pVar.c0();
        pVar.f();
    }

    @h
    public static final /* synthetic */ <T, E extends e<?>> void d(final yh.a<? extends T> factory, yh.l<? super Updater<T>, kotlin.b2> update, p pVar, int i10) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        kotlin.jvm.internal.f0.p(update, "update");
        pVar.T(1405779621);
        e<?> eVarG = pVar.G();
        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.S4);
        if (!(eVarG instanceof e)) {
            n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(new yh.a<T>() { // from class: androidx.compose.runtime.ComposablesKt$ReusableComposeNode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final T invoke() {
                    return factory.invoke();
                }
            });
        } else {
            pVar.d();
        }
        pVar.Y();
        update.invoke(Updater.a(Updater.b(pVar)));
        pVar.x();
        pVar.f();
        pVar.c0();
    }

    @i(scheme = "[0[0]]")
    @h
    public static final /* synthetic */ <T, E extends e<?>> void e(yh.a<? extends T> factory, yh.l<? super Updater<T>, kotlin.b2> update, yh.p<? super p, ? super Integer, kotlin.b2> content, p pVar, int i10) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        kotlin.jvm.internal.f0.p(update, "update");
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(-692256719);
        e<?> eVarG = pVar.G();
        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.S4);
        if (!(eVarG instanceof e)) {
            n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(factory);
        } else {
            pVar.d();
        }
        pVar.Y();
        update.invoke(Updater.a(Updater.b(pVar)));
        pVar.x();
        content.invoke(pVar, Integer.valueOf((i10 >> 6) & 14));
        pVar.f();
        pVar.c0();
    }

    @i(scheme = "[0[0][0]]")
    @h
    public static final /* synthetic */ <T, E extends e<?>> void f(yh.a<? extends T> factory, yh.l<? super Updater<T>, kotlin.b2> update, yh.q<? super v1<T>, ? super p, ? super Integer, kotlin.b2> skippableUpdate, yh.p<? super p, ? super Integer, kotlin.b2> content, p pVar, int i10) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        kotlin.jvm.internal.f0.p(update, "update");
        kotlin.jvm.internal.f0.p(skippableUpdate, "skippableUpdate");
        kotlin.jvm.internal.f0.p(content, "content");
        e<?> eVarG = pVar.G();
        kotlin.jvm.internal.f0.y(3, androidx.exifinterface.media.a.S4);
        if (!(eVarG instanceof e)) {
            n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(factory);
        } else {
            pVar.d();
        }
        pVar.Y();
        update.invoke(Updater.a(Updater.b(pVar)));
        pVar.x();
        skippableUpdate.invoke(v1.a(v1.b(pVar)), pVar, Integer.valueOf((i10 >> 3) & 112));
        pVar.T(2058660585);
        content.invoke(pVar, Integer.valueOf((i10 >> 9) & 14));
        pVar.c0();
        pVar.f();
    }

    @h
    public static final void g(@dl.e Object obj, @dl.d yh.p<? super p, ? super Integer, kotlin.b2> content, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.T(444418301);
        pVar.i(207, obj);
        content.invoke(pVar, Integer.valueOf((i10 >> 3) & 14));
        pVar.S();
        pVar.c0();
    }

    @i(scheme = "[0[0]]")
    @h
    public static final void h(boolean z10, @dl.d yh.p<? super p, ? super Integer, kotlin.b2> content, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(content, "content");
        pVar.i(207, Boolean.valueOf(z10));
        boolean zU = pVar.u(z10);
        if (z10) {
            content.invoke(pVar, Integer.valueOf((i10 >> 3) & 14));
        } else {
            pVar.a(zU);
        }
        pVar.S();
    }

    @dl.d
    @m1
    @xh.h(name = "getCurrentComposer")
    @h
    public static final p i(@dl.e p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(-554250212, i10, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @xh.h(name = "getCurrentCompositeKeyHash")
    @h
    public static final int j(@dl.e p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int iA0 = pVar.a0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return iA0;
    }

    @dl.d
    @xh.h(name = "getCurrentCompositionLocalContext")
    @h
    public static final w k(@dl.e p pVar, int i10) {
        pVar.T(-43352356);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-43352356, i10, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        w wVar = new w(pVar.q().e());
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return wVar;
    }

    public static /* synthetic */ void l() {
    }

    @dl.d
    @m1
    @xh.h(name = "getCurrentRecomposeScope")
    @h
    public static final n1 m(@dl.e p pVar, int i10) {
        if (ComposerKt.g0()) {
            ComposerKt.w0(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        n1 n1VarR = pVar.R();
        if (n1VarR == null) {
            throw new IllegalStateException("no recompose scope found".toString());
        }
        pVar.p(n1VarR);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return n1VarR;
    }

    @kotlin.r0
    public static final void n() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @i(scheme = "[0[0]]")
    @h
    public static final <T> T o(@dl.d Object[] keys, @dl.d yh.p<? super p, ? super Integer, ? extends T> block, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        kotlin.jvm.internal.f0.p(block, "block");
        pVar.T(-11941951);
        T tInvoke = block.invoke(pVar, Integer.valueOf((i10 >> 3) & 14));
        pVar.c0();
        return tInvoke;
    }

    @h
    public static final <T> T p(@dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @dl.d yh.a<? extends T> calculation, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(calculation, "calculation");
        pVar.T(1618982084);
        boolean zS = pVar.s(obj) | pVar.s(obj2) | pVar.s(obj3);
        T tInvoke = (T) pVar.U();
        if (zS || tInvoke == p.INSTANCE.a()) {
            tInvoke = calculation.invoke();
            pVar.N(tInvoke);
        }
        pVar.c0();
        return tInvoke;
    }

    @h
    public static final <T> T q(@dl.e Object obj, @dl.e Object obj2, @dl.d yh.a<? extends T> calculation, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(calculation, "calculation");
        pVar.T(511388516);
        boolean zS = pVar.s(obj) | pVar.s(obj2);
        T tInvoke = (T) pVar.U();
        if (zS || tInvoke == p.INSTANCE.a()) {
            tInvoke = calculation.invoke();
            pVar.N(tInvoke);
        }
        pVar.c0();
        return tInvoke;
    }

    @h
    public static final <T> T r(@dl.e Object obj, @dl.d yh.a<? extends T> calculation, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(calculation, "calculation");
        pVar.T(1157296644);
        boolean zS = pVar.s(obj);
        T tInvoke = (T) pVar.U();
        if (zS || tInvoke == p.INSTANCE.a()) {
            tInvoke = calculation.invoke();
            pVar.N(tInvoke);
        }
        pVar.c0();
        return tInvoke;
    }

    @h
    public static final <T> T s(@dl.d yh.a<? extends T> calculation, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(calculation, "calculation");
        pVar.T(-492369756);
        T tInvoke = (T) pVar.U();
        if (tInvoke == p.INSTANCE.a()) {
            tInvoke = calculation.invoke();
            pVar.N(tInvoke);
        }
        pVar.c0();
        return tInvoke;
    }

    @h
    public static final <T> T t(@dl.d Object[] keys, @dl.d yh.a<? extends T> calculation, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        kotlin.jvm.internal.f0.p(calculation, "calculation");
        pVar.T(-568225417);
        boolean zS = false;
        for (Object obj : keys) {
            zS |= pVar.s(obj);
        }
        T tInvoke = (T) pVar.U();
        if (zS || tInvoke == p.INSTANCE.a()) {
            tInvoke = calculation.invoke();
            pVar.N(tInvoke);
        }
        pVar.c0();
        return tInvoke;
    }

    @dl.d
    @h
    public static final r u(@dl.e p pVar, int i10) {
        pVar.T(-1165786124);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:486)");
        }
        r rVarQ = pVar.q();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return rVarQ;
    }
}
