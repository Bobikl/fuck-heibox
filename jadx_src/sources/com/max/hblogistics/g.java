package com.max.hblogistics;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.max.hblogistics.bean.logistics.ExpressDetailObj;
import com.max.hblogistics.bean.logistics.ExpressTrailObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: LogisticsUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: LogisticsUtils.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpressDetailObj f71043b;

        a(ExpressDetailObj expressDetailObj) {
            this.f71043b = expressDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.Hh, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = view.getContext();
            if (context instanceof FragmentActivity) {
                f.V3(this.f71043b.getOrder_id()).show(((FragmentActivity) context).getSupportFragmentManager(), "logistics");
            }
        }
    }

    public static void a(View view, ExpressDetailObj expressDetailObj) {
        if (PatchProxy.proxy(new Object[]{view, expressDetailObj}, null, changeQuickRedirect, true, bb.c.g.Fh, new Class[]{View.class, ExpressDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        b(view, expressDetailObj, Boolean.FALSE);
    }

    public static void b(View view, ExpressDetailObj expressDetailObj, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{view, expressDetailObj, bool}, null, changeQuickRedirect, true, bb.c.g.Gh, new Class[]{View.class, ExpressDetailObj.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_img);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_status);
        TextView textView = (TextView) view.findViewById(R.id.tv_status);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_time);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_title);
        if (bool.booleanValue()) {
            com.max.hbimage.b.d0(expressDetailObj.getImg(), imageView, ViewUtils.f(imageView.getContext(), 2.0f));
            imageView.getLayoutParams().width = -1;
            imageView.getLayoutParams().height = -1;
        } else {
            com.max.hbimage.b.K(expressDetailObj.getImg(), imageView);
        }
        if (com.max.hbcommon.utils.c.u(expressDetailObj.getStatus_img())) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            com.max.hbimage.b.K(expressDetailObj.getStatus_img(), imageView2);
        }
        textView.setText(expressDetailObj.getDelivery_status());
        ExpressTrailObj expressTrailObj = (expressDetailObj.getTrails() == null || expressDetailObj.getTrails().size() <= 0) ? null : expressDetailObj.getTrails().get(0);
        textView2.setText(expressTrailObj != null ? expressTrailObj.getTime() : null);
        textView3.setText(expressTrailObj != null ? expressTrailObj.getStatus() : null);
        view.setOnClickListener(new a(expressDetailObj));
    }
}
