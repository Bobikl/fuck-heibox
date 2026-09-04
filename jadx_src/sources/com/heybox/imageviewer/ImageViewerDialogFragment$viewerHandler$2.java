package com.heybox.imageviewer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageViewerDialogFragment.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ImageViewerDialogFragment$viewerHandler$2 extends Lambda implements yh.a<Handler> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageViewerDialogFragment f59620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageViewerDialogFragment$viewerHandler$2(ImageViewerDialogFragment imageViewerDialogFragment) {
        super(0);
        this.f59620b = imageViewerDialogFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(ImageViewerDialogFragment this$0, Message it) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, 82, new Class[]{ImageViewerDialogFragment.class, Message.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(this$0, "this$0");
        f0.p(it, "it");
        it.getTarget().removeMessages(it.what);
        com.heybox.imageviewer.core.j jVarB4 = ImageViewerDialogFragment.b4(this$0);
        int i10 = it.arg1;
        Object obj = it.obj;
        f0.n(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
        jVarB4.i(i10, (RecyclerView.ViewHolder) obj);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yh.a
    @dl.d
    public final Handler invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 81, new Class[0], Handler.class);
        if (patchProxyResultProxy.isSupported) {
            return (Handler) patchProxyResultProxy.result;
        }
        Looper mainLooper = Looper.getMainLooper();
        final ImageViewerDialogFragment imageViewerDialogFragment = this.f59620b;
        return new Handler(mainLooper, new Handler.Callback() { // from class: com.heybox.imageviewer.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return ImageViewerDialogFragment$viewerHandler$2.b(imageViewerDialogFragment, message);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Handler, java.lang.Object] */
    @Override // yh.a
    public /* bridge */ /* synthetic */ Handler invoke() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 83, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
    }
}
