package androidx.compose.ui.text.font;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.g2;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030(\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/m2;", "", "Lkotlin/b2;", "g", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/u;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/text/font/u;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "b", "Ljava/util/List;", "fontList", "Landroidx/compose/ui/text/font/e1;", ak.aF, "Landroidx/compose/ui/text/font/e1;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "d", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/q0;", "f", "Landroidx/compose/ui/text/font/q0;", "platformFontLoader", "<set-?>", "Landroidx/compose/runtime/a1;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "Z", "e", "()Z", "i", "(Z)V", "cacheable", "initialType", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/f1$b;", "onCompletion", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/e1;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lyh/l;Landroidx/compose/ui/text/font/q0;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class AsyncFontListLoader implements m2<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<u> fontList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TypefaceRequest typefaceRequest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AsyncTypefaceCache asyncTypefaceCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<f1.b, b2> f16437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0 platformFontLoader;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 value;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean cacheable;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(@dl.d List<? extends u> fontList, @dl.d Object initialType, @dl.d TypefaceRequest typefaceRequest, @dl.d AsyncTypefaceCache asyncTypefaceCache, @dl.d yh.l<? super f1.b, b2> onCompletion, @dl.d q0 platformFontLoader) {
        kotlin.jvm.internal.f0.p(fontList, "fontList");
        kotlin.jvm.internal.f0.p(initialType, "initialType");
        kotlin.jvm.internal.f0.p(typefaceRequest, "typefaceRequest");
        kotlin.jvm.internal.f0.p(asyncTypefaceCache, "asyncTypefaceCache");
        kotlin.jvm.internal.f0.p(onCompletion, "onCompletion");
        kotlin.jvm.internal.f0.p(platformFontLoader, "platformFontLoader");
        this.fontList = fontList;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.f16437e = onCompletion;
        this.platformFontLoader = platformFontLoader;
        this.value = h2.g(initialType, null, 2, null);
        this.cacheable = true;
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0102 -> B:42:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010a -> B:46:0x010c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @dl.e
    public final java.lang.Object g(@dl.d kotlin.coroutines.c<? super kotlin.b2> r20) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.g(kotlin.coroutines.c):java.lang.Object");
    }

    @Override // androidx.compose.runtime.m2
    @dl.d
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object h(@dl.d u uVar, @dl.d kotlin.coroutines.c<Object> cVar) throws Throwable {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        if (cVar instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) cVar;
            int i10 = asyncFontListLoader$loadWithTimeoutOrNull$1.f16455e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$1.f16455e = i10 - Integer.MIN_VALUE;
            } else {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, cVar);
            }
        } else {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, cVar);
        }
        Object objE = asyncFontListLoader$loadWithTimeoutOrNull$1.f16453c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = asyncFontListLoader$loadWithTimeoutOrNull$1.f16455e;
        Object obj = null;
        try {
            if (i11 == 0) {
                kotlin.t0.n(objE);
                AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, uVar, null);
                asyncFontListLoader$loadWithTimeoutOrNull$1.f16452b = uVar;
                asyncFontListLoader$loadWithTimeoutOrNull$1.f16455e = 1;
                objE = TimeoutKt.e(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                if (objE == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar = (u) asyncFontListLoader$loadWithTimeoutOrNull$1.f16452b;
                kotlin.t0.n(objE);
            }
            obj = objE;
            return obj;
        } catch (CancellationException e10) {
            if (g2.C(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                return obj;
            }
            throw e10;
        } catch (Exception e11) {
            kotlinx.coroutines.l0 l0Var = (kotlinx.coroutines.l0) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().f(kotlinx.coroutines.l0.INSTANCE);
            if (l0Var == null) {
                return obj;
            }
            l0Var.C(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + uVar, e11));
            return obj;
        }
    }

    public final void i(boolean z10) {
        this.cacheable = z10;
    }
}
