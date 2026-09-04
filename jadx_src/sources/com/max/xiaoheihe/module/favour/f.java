package com.max.xiaoheihe.module.favour;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CollectionGroupRVAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class f extends s<CollectionFolder> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83897d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f83898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final ArrayList<CollectionFolder> f83899c;

    /* JADX INFO: compiled from: CollectionGroupRVAdapter.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31624, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f.this.m().startActivity(WikiFavourFolder.M.a(f.this.m()));
        }
    }

    /* JADX INFO: compiled from: CollectionGroupRVAdapter.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31625, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.f(f.this.m(), lb.d.I1).A();
        }
    }

    /* JADX INFO: compiled from: CollectionGroupRVAdapter.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31626, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(f.this.m(), lb.a.f131042s4);
        }
    }

    /* JADX INFO: compiled from: CollectionGroupRVAdapter.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CollectionFolder f83904c;

        d(CollectionFolder collectionFolder) {
            this.f83904c = collectionFolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31627, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context contextM = f.this.m();
            FavourLinkFolderActivity.a aVar = FavourLinkFolderActivity.T;
            Context contextM2 = f.this.m();
            CollectionFolder collectionFolder = this.f83904c;
            String strValueOf = String.valueOf(collectionFolder != null ? collectionFolder.getId() : null);
            CollectionFolder collectionFolder2 = this.f83904c;
            contextM.startActivity(aVar.e(contextM2, strValueOf, collectionFolder2 != null ? collectionFolder2.is_default() : null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d Context context, @dl.d ArrayList<CollectionFolder> dataList) {
        super(context, dataList, R.layout.item_favour_folder);
        f0.p(context, "context");
        f0.p(dataList, "dataList");
        this.f83898b = context;
        this.f83899c = dataList;
    }

    @dl.d
    public final Context m() {
        return this.f83898b;
    }

    @dl.d
    public final ArrayList<CollectionFolder> n() {
        return this.f83899c;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    public void o(@dl.e s.e eVar, @dl.e CollectionFolder collectionFolder) {
        View viewB;
        View viewB2;
        View viewB3;
        View viewB4;
        if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 31622, new Class[]{s.e.class, CollectionFolder.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = eVar != null ? (TextView) eVar.i(R.id.tv_title) : null;
        TextView textView2 = eVar != null ? (TextView) eVar.i(R.id.tv_num) : null;
        TextView textView3 = eVar != null ? (TextView) eVar.i(R.id.tv_update) : null;
        if (textView != null) {
            textView.setText(collectionFolder != null ? collectionFolder.getName() : null);
        }
        if ((collectionFolder != null ? collectionFolder.getCount() : null) != null) {
            if (textView2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(collectionFolder != null ? collectionFolder.getCount() : null);
                sb2.append((char) 31687);
                textView2.setText(sb2.toString());
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        if ((collectionFolder != null ? collectionFolder.getUnread() : null) != null) {
            Integer unread = collectionFolder.getUnread();
            f0.m(unread);
            if (unread.intValue() > 0) {
                Drawable drawableJ = ViewUtils.j(ViewUtils.f(this.f83898b, 4.0f), com.max.hbcommon.utils.l.a(R.color.red));
                drawableJ.setBounds(0, 0, ViewUtils.f(this.f83898b, 8.0f), ViewUtils.f(this.f83898b, 8.0f));
                if (textView3 != null) {
                    textView3.setText(collectionFolder.getUnread() + "篇内容更新");
                }
                if (textView3 != null) {
                    textView3.setCompoundDrawables(null, null, drawableJ, null);
                }
                if (textView3 != null) {
                    textView3.setCompoundDrawablePadding(ViewUtils.f(this.f83898b, 6.0f));
                }
            } else if (textView3 != null) {
                textView3.setCompoundDrawables(null, null, null, null);
            }
        } else if (textView3 != null) {
            textView3.setCompoundDrawables(null, null, null, null);
        }
        Integer numValueOf = collectionFolder != null ? Integer.valueOf(collectionFolder.getSpType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (eVar == null || (viewB4 = eVar.b()) == null) {
                return;
            }
            viewB4.setOnClickListener(new a());
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (eVar == null || (viewB3 = eVar.b()) == null) {
                return;
            }
            viewB3.setOnClickListener(new b());
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            if (eVar == null || (viewB2 = eVar.b()) == null) {
                return;
            }
            viewB2.setOnClickListener(new c());
            return;
        }
        if (eVar == null || (viewB = eVar.b()) == null) {
            return;
        }
        viewB.setOnClickListener(new d(collectionFolder));
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, CollectionFolder collectionFolder) {
        if (PatchProxy.proxy(new Object[]{eVar, collectionFolder}, this, changeQuickRedirect, false, 31623, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        o(eVar, collectionFolder);
    }
}
