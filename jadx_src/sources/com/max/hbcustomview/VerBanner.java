package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ViewFlipper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class VerBanner extends ViewFlipper {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f68974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f68975c;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f68976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f68977c;

        a(int i10, List list) {
            this.f68976b = i10;
            this.f68977c = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.Wd, new Class[]{View.class}, Void.TYPE).isSupported || VerBanner.this.f68975c == null) {
                return;
            }
            b bVar = VerBanner.this.f68975c;
            int i10 = this.f68976b;
            bVar.a(i10, (View) this.f68977c.get(i10));
        }
    }

    public interface b {
        void a(int i10, View view);
    }

    public VerBanner(Context context) {
        super(context);
        b(context);
    }

    public VerBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    private void b(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.f.Ud, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68974b = context;
        setInAnimation(context, R.anim.hbcustomview_ver_banner_in);
        setOutAnimation(context, R.anim.hbcustomview_ver_banner_out);
    }

    public void setOnItemClickListener(b bVar) {
        this.f68975c = bVar;
    }

    public void setViews(List<View> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.f.Vd, new Class[]{List.class}, Void.TYPE).isSupported || list == null || list.size() == 0) {
            return;
        }
        removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.get(i10).setOnClickListener(new a(i10, list));
            addView(list.get(i10));
        }
    }
}
