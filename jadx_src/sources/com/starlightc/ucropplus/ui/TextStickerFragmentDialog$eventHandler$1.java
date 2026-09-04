package com.starlightc.ucropplus.ui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: TextStickerFragmentDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextStickerFragmentDialog$eventHandler$1 extends Handler {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ TextStickerFragmentDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextStickerFragmentDialog$eventHandler$1(TextStickerFragmentDialog textStickerFragmentDialog, Looper looper) {
        super(looper);
        this.this$0 = textStickerFragmentDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMessage$lambda$0(TextStickerFragmentDialog this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 50511, new Class[]{TextStickerFragmentDialog.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        ViewUtils.r0(this$0.getEditText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMessage$lambda$1(TextStickerFragmentDialog this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 50512, new Class[]{TextStickerFragmentDialog.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.showKeyboard = false;
    }

    @Override // android.os.Handler
    public void handleMessage(@dl.d Message msg) {
        if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 50510, new Class[]{Message.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(msg, "msg");
        super.handleMessage(msg);
        int i10 = msg.what;
        if (i10 == 0) {
            this.this$0.showKeyboard = true;
            sendEmptyMessage(1);
            final TextStickerFragmentDialog textStickerFragmentDialog = this.this$0;
            postDelayed(new Runnable() { // from class: com.starlightc.ucropplus.ui.z
                @Override // java.lang.Runnable
                public final void run() {
                    TextStickerFragmentDialog$eventHandler$1.handleMessage$lambda$0(textStickerFragmentDialog);
                }
            }, 500L);
            final TextStickerFragmentDialog textStickerFragmentDialog2 = this.this$0;
            postDelayed(new Runnable() { // from class: com.starlightc.ucropplus.ui.a0
                @Override // java.lang.Runnable
                public final void run() {
                    TextStickerFragmentDialog$eventHandler$1.handleMessage$lambda$1(textStickerFragmentDialog2);
                }
            }, 700L);
            return;
        }
        if (i10 == 1) {
            if (this.this$0.isViewCreated()) {
                this.this$0.getBinding().vgTab.setVisibility(8);
                this.this$0.isExpand = false;
                return;
            }
            return;
        }
        if (i10 == 2 && this.this$0.isViewCreated()) {
            this.this$0.getBinding().vgTab.setVisibility(0);
            this.this$0.isExpand = true;
        }
    }
}
