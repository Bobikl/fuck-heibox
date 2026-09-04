package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: RecommendVideoAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class s extends com.max.hbcommon.base.adapter.s<BBSLinkObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f80630c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f80631b;

    /* JADX INFO: compiled from: RecommendVideoAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f80633c;

        a(BBSLinkObj bBSLinkObj) {
            this.f80633c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27463, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(s.this.n(), this.f80633c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@dl.d Context mContext, @dl.e List<? extends BBSLinkObj> list) {
        super(mContext, list, R.layout.item_video_recommend_line);
        f0.p(mContext, "mContext");
        this.f80631b = mContext;
    }

    private final void m(BBSLinkObj bBSLinkObj) {
        int iIndexOf;
        if (!PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 27461, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported && (iIndexOf = getDataList().indexOf(bBSLinkObj)) >= 0 && iIndexOf < getDataList().size()) {
            getDataList().remove(iIndexOf);
            notifyItemRemoved(iIndexOf);
        }
    }

    @dl.d
    public final Context n() {
        return this.f80631b;
    }

    public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.e BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{viewHolder, bBSLinkObj}, this, changeQuickRedirect, false, 27460, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        if (bBSLinkObj != null) {
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_cover);
            TextView textView = (TextView) viewHolder.i(R.id.tv_duration);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_title);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_desc);
            viewHolder.i(R.id.iv_more);
            if (bBSLinkObj.getVideo_thumb() != null) {
                com.max.hbimage.b.d0(bBSLinkObj.getVideo_thumb(), imageView, ViewUtils.f(this.f80631b, 2.0f));
            } else {
                List<String> imgs = bBSLinkObj.getImgs();
                if ((imgs != null ? imgs.size() : 0) > 0) {
                    com.max.hbimage.b.d0(bBSLinkObj.getImgs().get(0), imageView, ViewUtils.f(this.f80631b, 2.0f));
                } else {
                    com.max.hbimage.b.c(imageView);
                }
            }
            textView.setText(bBSLinkObj.getVideo_info().getDuration());
            textView2.setText(bBSLinkObj.getTitle());
            if (bBSLinkObj.getUser() != null) {
                v0 v0Var = v0.f124986a;
                String str = String.format(bBSLinkObj.getUser().getUsername() + kotlin.text.y.f128610s + bBSLinkObj.getClick() + "%s", Arrays.copyOf(new Object[]{this.f80631b.getString(R.string.play)}, 1));
                f0.o(str, "format(format, *args)");
                textView3.setText(str);
            }
            View viewB = viewHolder.b();
            viewB.setTag(bBSLinkObj);
            viewB.setOnClickListener(new a(bBSLinkObj));
        }
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 27462, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, bBSLinkObj);
    }
}
