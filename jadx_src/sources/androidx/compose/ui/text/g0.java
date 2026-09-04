package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/g0;", "", "Landroidx/compose/ui/text/h0;", "key", "Landroidx/compose/ui/text/i0;", ak.av, "value", "b", ak.aF, "Landroidx/compose/ui/text/caches/b;", "Landroidx/compose/ui/text/e;", "Landroidx/compose/ui/text/caches/b;", "lruCache", "", "capacity", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.caches.b<e, TextLayoutResult> lruCache;

    public g0() {
        this(0, 1, null);
    }

    public g0(int i10) {
        this.lruCache = new androidx.compose.ui.text.caches.b<>(i10);
    }

    public /* synthetic */ g0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? l0.f16820a : i10);
    }

    @dl.e
    public final TextLayoutResult a(@dl.d TextLayoutInput key) {
        kotlin.jvm.internal.f0.p(key, "key");
        TextLayoutResult textLayoutResultG = this.lruCache.g(new e(key));
        if (textLayoutResultG == null || textLayoutResultG.getMultiParagraph().getIntrinsics().c()) {
            return null;
        }
        return textLayoutResultG;
    }

    @dl.e
    public final TextLayoutResult b(@dl.d TextLayoutInput key, @dl.d TextLayoutResult value) {
        kotlin.jvm.internal.f0.p(key, "key");
        kotlin.jvm.internal.f0.p(value, "value");
        return this.lruCache.k(new e(key), value);
    }

    @dl.e
    public final TextLayoutResult c(@dl.d TextLayoutInput key) {
        kotlin.jvm.internal.f0.p(key, "key");
        return this.lruCache.m(new e(key));
    }
}
