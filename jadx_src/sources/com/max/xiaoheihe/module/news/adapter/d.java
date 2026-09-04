package com.max.xiaoheihe.module.news.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HashtagLinkHorAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class d extends s<BBSLinkObj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91309c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f91310b;

    /* JADX INFO: compiled from: HashtagLinkHorAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSLinkObj f91312c;

        a(BBSLinkObj bBSLinkObj) {
            this.f91312c = bBSLinkObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42597, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.E(d.this.m(), this.f91312c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d Context context, @dl.d List<BBSLinkObj> list) {
        super(context, list, R.layout.item_hashtag_link_hor);
        f0.p(context, "context");
        f0.p(list, "list");
        this.f91310b = context;
    }

    private final void o(ImageView imageView, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{imageView, bBSLinkObj}, this, changeQuickRedirect, false, 42595, new Class[]{ImageView.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String str = null;
        if (bBSLinkObj.getThumbs() != null && bBSLinkObj.getThumbs().size() > 0) {
            str = bBSLinkObj.getThumbs().get(0);
        } else if (bBSLinkObj.getImgs() != null && bBSLinkObj.getImgs().size() > 0) {
            str = bBSLinkObj.getImgs().get(0);
        }
        com.max.hbimage.b.L(str, imageView, R.drawable.common_default_placeholder_375x210);
    }

    @dl.d
    public final Context m() {
        return this.f91310b;
    }

    public void n(@e s.e eVar, @e BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 42594, new Class[]{s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported || eVar == null || bBSLinkObj == null) {
            return;
        }
        eVar.itemView.setTag(bBSLinkObj);
        ImageView iv_image = (ImageView) eVar.i(R.id.iv_image);
        TextView textView = (TextView) eVar.i(R.id.tv_title);
        TextView textView2 = (TextView) eVar.i(R.id.tv_name);
        TextView textView3 = (TextView) eVar.i(R.id.tv_comment_num);
        View viewI = eVar.i(R.id.v_border);
        f0.o(iv_image, "iv_image");
        o(iv_image, bBSLinkObj);
        String title = bBSLinkObj.getTitle();
        if (title == null) {
            title = bBSLinkObj.getDescription();
        }
        textView.setText(title);
        BBSUserInfoObj user = bBSLinkObj.getUser();
        textView2.setText(user != null ? user.getUsername() : null);
        textView3.setText(bBSLinkObj.getComment_num());
        viewI.setBackground(q.L(this.f91310b, R.color.divider_secondary_1_color, 0.5f, 5.0f));
        eVar.itemView.setOnClickListener(new a(bBSLinkObj));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, BBSLinkObj bBSLinkObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 42596, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, bBSLinkObj);
    }
}
