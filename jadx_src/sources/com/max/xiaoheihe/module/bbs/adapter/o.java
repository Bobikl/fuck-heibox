package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserNotifyObj;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: NotifyListAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class o extends com.max.hbcommon.base.adapter.s<BBSUserNotifyObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f80602b;

    /* JADX INFO: compiled from: NotifyListAdapter.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserNotifyObj f80603b;

        a(BBSUserNotifyObj bBSUserNotifyObj) {
            this.f80603b = bBSUserNotifyObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27436, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.F4, null, this.f80603b.getReport_extra());
            if (!com.max.hbcommon.utils.c.u(this.f80603b.getMaxjia())) {
                com.max.xiaoheihe.base.router.b.k0(o.this.f80602b, this.f80603b.getMaxjia());
                return;
            }
            if ("link".equalsIgnoreCase(this.f80603b.getObj_type())) {
                com.max.xiaoheihe.module.bbs.utils.b.F(o.this.f80602b, null, this.f80603b.getObj_id(), this.f80603b.getLink_tag(), this.f80603b.getHas_video(), null);
                return;
            }
            if (com.max.hbcommon.utils.c.u(this.f80603b.getObj_content())) {
                if (SwitchDetailActivity.P.equalsIgnoreCase(this.f80603b.getObj_type())) {
                    com.max.xiaoheihe.base.router.b.k0(o.this.f80602b, this.f80603b.getProtocol());
                }
            } else {
                Intent intent = new Intent(o.this.f80602b, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", this.f80603b.getObj_content());
                intent.putExtra("title", this.f80603b.getTitle());
                o.this.f80602b.startActivity(intent);
            }
        }
    }

    public o(Context context, List<BBSUserNotifyObj> list) {
        super(context, list, R.layout.item_user_notify_list);
        this.f80602b = context;
    }

    public void n(com.max.hbcommon.base.adapter.s.e eVar, BBSUserNotifyObj bBSUserNotifyObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserNotifyObj}, this, changeQuickRedirect, false, 27434, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_create_at);
        TextView textView2 = (TextView) eVar.i(R.id.tv_title);
        TextView textView3 = (TextView) eVar.i(R.id.tv_text);
        ImageView imageView = (ImageView) eVar.i(R.id.iv_img);
        View viewI = eVar.i(R.id.vg_view_detail);
        if (bBSUserNotifyObj.getCreate_at() == null && bBSUserNotifyObj.getTimestamp() == null) {
            textView.setVisibility(8);
        } else if (bBSUserNotifyObj.getCreate_at() == null) {
            textView.setVisibility(0);
            textView.setText(com.max.hbutils.utils.w.v(this.f80602b, bBSUserNotifyObj.getTimestamp()));
        } else {
            textView.setVisibility(0);
            textView.setText(com.max.hbutils.utils.w.v(this.f80602b, bBSUserNotifyObj.getCreate_at()));
        }
        textView2.setText(bBSUserNotifyObj.getTitle());
        if (com.max.hbcommon.utils.c.u(bBSUserNotifyObj.getText())) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(bBSUserNotifyObj.getText());
        }
        textView3.setTextIsSelectable(true);
        if (bBSUserNotifyObj.getThumb() != null) {
            com.max.hbimage.b.K(bBSUserNotifyObj.getThumb(), imageView);
        } else {
            com.max.hbimage.b.K(bBSUserNotifyObj.getImg(), imageView);
        }
        if (com.max.hbcommon.utils.c.u(bBSUserNotifyObj.getMaxjia()) && !"link".equalsIgnoreCase(bBSUserNotifyObj.getObj_type()) && !SwitchDetailActivity.P.equalsIgnoreCase(bBSUserNotifyObj.getObj_type()) && com.max.hbcommon.utils.c.u(bBSUserNotifyObj.getObj_content())) {
            viewI.setVisibility(8);
        } else {
            viewI.setVisibility(0);
        }
        eVar.b().setOnClickListener(new a(bBSUserNotifyObj));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSUserNotifyObj bBSUserNotifyObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserNotifyObj}, this, changeQuickRedirect, false, 27435, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        n(eVar, bBSUserNotifyObj);
    }
}
