package com.starlightc.ucropplus.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbimage.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.model.puzzle.ImageModuleObj;
import com.starlightc.ucropplus.ui.adapter.ModulePreviewAdapter;
import dl.d;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModulePreviewAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ModulePreviewAdapter extends s<ImageModuleObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private Context content;

    @e
    private OnCheckedListener listener;

    /* JADX INFO: compiled from: ModulePreviewAdapter.kt */
    public interface OnCheckedListener {
        void onChecked(@e ImageModuleObj imageModuleObj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModulePreviewAdapter(@d Context content, @d ArrayList<ImageModuleObj> list, @e OnCheckedListener onCheckedListener) {
        super(content, list, R.layout.item_module_list);
        f0.p(content, "content");
        f0.p(list, "list");
        this.content = content;
        this.listener = onCheckedListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(ModulePreviewAdapter this$0, ImageModuleObj imageModuleObj, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, imageModuleObj, view}, null, changeQuickRedirect, true, 50893, new Class[]{ModulePreviewAdapter.class, ImageModuleObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        OnCheckedListener onCheckedListener = this$0.listener;
        if (onCheckedListener != null) {
            onCheckedListener.onChecked(imageModuleObj);
        }
    }

    @d
    public final Context getContent() {
        return this.content;
    }

    @e
    public final OnCheckedListener getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(@e s.e eVar, @e final ImageModuleObj imageModuleObj) {
        if (PatchProxy.proxy(new Object[]{eVar, imageModuleObj}, this, changeQuickRedirect, false, 50892, new Class[]{s.e.class, ImageModuleObj.class}, Void.TYPE).isSupported || imageModuleObj == null) {
            return;
        }
        ImageView imageView = eVar != null ? (ImageView) eVar.i(R.id.iv) : null;
        f0.n(imageView, "null cannot be cast to non-null type android.widget.ImageView");
        View viewI = eVar.i(R.id.tv);
        f0.o(viewI, "getView(...)");
        b.K(imageModuleObj.getSample_img(), imageView);
        ((TextView) viewI).setText(imageModuleObj.getName());
        eVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: vg.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModulePreviewAdapter.onBindViewHolder$lambda$1$lambda$0(this.f140883b, imageModuleObj, view);
            }
        });
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, ImageModuleObj imageModuleObj) {
        if (PatchProxy.proxy(new Object[]{eVar, imageModuleObj}, this, changeQuickRedirect, false, 50894, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        onBindViewHolder2(eVar, imageModuleObj);
    }

    public final void setContent(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 50891, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "<set-?>");
        this.content = context;
    }

    public final void setListener(@e OnCheckedListener onCheckedListener) {
        this.listener = onCheckedListener;
    }
}
