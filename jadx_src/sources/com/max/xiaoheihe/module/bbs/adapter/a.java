package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: AtUserAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends com.max.hbcommon.base.adapter.u<BBSUserInfoObj> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f80305b;

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.adapter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtUserAdapter.java */
    public class ViewOnClickListenerC0677a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSUserInfoObj f80306b;

        ViewOnClickListenerC0677a(BBSUserInfoObj bBSUserInfoObj) {
            this.f80306b = bBSUserInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27171, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("user_id", this.f80306b.getUserid());
            intent.putExtra("user_name", this.f80306b.getUsername());
            a.this.f80305b.J(intent);
        }
    }

    /* JADX INFO: compiled from: AtUserAdapter.java */
    public interface b {
        void J(Intent intent);
    }

    public a(Context context, List<BBSUserInfoObj> list, b bVar) {
        super(context, list);
        this.f80305b = bVar;
    }

    @Override // com.max.hbcommon.base.adapter.u
    public /* bridge */ /* synthetic */ int m(int i10, BBSUserInfoObj bBSUserInfoObj) {
        Object[] objArr = {new Integer(i10), bBSUserInfoObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27169, new Class[]{cls, Object.class}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, bBSUserInfoObj);
    }

    public int o(int i10, BBSUserInfoObj bBSUserInfoObj) {
        Object[] objArr = {new Integer(i10), bBSUserInfoObj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 27168, new Class[]{cls, BBSUserInfoObj.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return bBSUserInfoObj.getUserid() == null ? R.layout.item_group_title : R.layout.item_at_user;
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
        if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 27170, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        p(eVar, (BBSUserInfoObj) obj);
    }

    public void p(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
        if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 27167, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ((TextView) eVar.i(R.id.tv_name)).setText(bBSUserInfoObj.getUsername());
        if (eVar.d() == R.layout.item_at_user) {
            ((HeyBoxAvatarView) eVar.i(R.id.avatar)).setAvatar(bBSUserInfoObj.getAvartar(), bBSUserInfoObj.getAvatar_decoration());
            eVar.b().setOnClickListener(new ViewOnClickListenerC0677a(bBSUserInfoObj));
        }
    }
}
