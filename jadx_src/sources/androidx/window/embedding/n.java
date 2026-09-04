package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.extensions.embedding.SplitInfo;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EmbeddingTranslatingCallback.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.window.core.d
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/window/embedding/n;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "Lkotlin/b2;", ak.av, "Landroidx/window/embedding/l$a;", "b", "Landroidx/window/embedding/l$a;", "callback", "Landroidx/window/embedding/i;", ak.aF, "Landroidx/window/embedding/i;", "adapter", "<init>", "(Landroidx/window/embedding/l$a;Landroidx/window/embedding/i;)V", "window_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"NewApi"})
public final class n implements Consumer<List<? extends SplitInfo>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l.a callback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i adapter;

    public n(@dl.d l.a callback, @dl.d i adapter) {
        f0.p(callback, "callback");
        f0.p(adapter, "adapter");
        this.callback = callback;
        this.adapter = adapter;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(@dl.d List<? extends SplitInfo> splitInfoList) {
        f0.p(splitInfoList, "splitInfoList");
        this.callback.a(this.adapter.i(splitInfoList));
    }
}
