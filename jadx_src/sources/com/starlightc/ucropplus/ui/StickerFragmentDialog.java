package com.starlightc.ucropplus.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout;
import com.max.hbutils.utils.ViewUtils;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.databinding.FragmentStickerBinding;
import com.starlightc.ucropplus.model.StickerGroupInfo;
import com.starlightc.ucropplus.model.StickerInfo;
import com.starlightc.ucropplus.util.CommonRecyclerViewAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: StickerFragmentDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
@t0({"SMAP\nStickerFragmentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerFragmentDialog.kt\ncom/starlightc/ucropplus/ui/StickerFragmentDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n1#2:438\n*E\n"})
public final class StickerFragmentDialog extends BaseFragmentDialog {
    public static ChangeQuickRedirect changeQuickRedirect;
    public FragmentStickerBinding binding;
    private int lastPos;
    public androidx.activity.result.g<String> permissionLauncher;
    public TabLayout tabLayout;
    public ViewPager2 viewPager;
    public CommonRecyclerViewAdapter<StickerGroupInfo> vpAdapter;

    @dl.d
    public static final Companion Companion = new Companion(null);

    @dl.d
    private static final String SP_STICKER_LIST_RECENT = "sticker_list_recent";

    @dl.d
    private static final String SP_STICKER_LIST_MINE = "sticker_list_mine";

    @dl.d
    private final ArrayList<StickerGroupInfo> stickerGroupList = new ArrayList<>();

    @dl.d
    private List<StickerInfo> recentStickerList = new ArrayList();

    @dl.d
    private List<StickerInfo> myStickerList = new ArrayList();

    /* JADX INFO: compiled from: StickerFragmentDialog.kt */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String getSP_STICKER_LIST_MINE() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50417, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : StickerFragmentDialog.SP_STICKER_LIST_MINE;
        }

        @dl.d
        public final String getSP_STICKER_LIST_RECENT() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50416, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : StickerFragmentDialog.SP_STICKER_LIST_RECENT;
        }
    }

    public static final /* synthetic */ boolean access$alreadyExist(StickerFragmentDialog stickerFragmentDialog, StickerInfo stickerInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{stickerFragmentDialog, stickerInfo}, null, changeQuickRedirect, true, 50415, new Class[]{StickerFragmentDialog.class, StickerInfo.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : stickerFragmentDialog.alreadyExist(stickerInfo);
    }

    public static final /* synthetic */ void access$loadStickers(StickerFragmentDialog stickerFragmentDialog) {
        if (PatchProxy.proxy(new Object[]{stickerFragmentDialog}, null, changeQuickRedirect, true, 50414, new Class[]{StickerFragmentDialog.class}, Void.TYPE).isSupported) {
            return;
        }
        stickerFragmentDialog.loadStickers();
    }

    public static final /* synthetic */ void access$onLocalItemCLick(StickerFragmentDialog stickerFragmentDialog, StickerInfo stickerInfo) {
        if (PatchProxy.proxy(new Object[]{stickerFragmentDialog, stickerInfo}, null, changeQuickRedirect, true, 50413, new Class[]{StickerFragmentDialog.class, StickerInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        stickerFragmentDialog.onLocalItemCLick(stickerInfo);
    }

    public static final /* synthetic */ void access$refreshLocalStickerItem(StickerFragmentDialog stickerFragmentDialog, dc.b bVar, StickerInfo stickerInfo) {
        if (PatchProxy.proxy(new Object[]{stickerFragmentDialog, bVar, stickerInfo}, null, changeQuickRedirect, true, 50411, new Class[]{StickerFragmentDialog.class, dc.b.class, StickerInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        stickerFragmentDialog.refreshLocalStickerItem(bVar, stickerInfo);
    }

    public static final /* synthetic */ void access$refreshMixStickerItem(StickerFragmentDialog stickerFragmentDialog, dc.b bVar, StickerInfo stickerInfo) {
        if (PatchProxy.proxy(new Object[]{stickerFragmentDialog, bVar, stickerInfo}, null, changeQuickRedirect, true, 50412, new Class[]{StickerFragmentDialog.class, dc.b.class, StickerInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        stickerFragmentDialog.refreshMixStickerItem(bVar, stickerInfo);
    }

    public static final /* synthetic */ void access$refreshRemoteStickerItem(StickerFragmentDialog stickerFragmentDialog, dc.b bVar, StickerInfo stickerInfo) {
        if (PatchProxy.proxy(new Object[]{stickerFragmentDialog, bVar, stickerInfo}, null, changeQuickRedirect, true, 50410, new Class[]{StickerFragmentDialog.class, dc.b.class, StickerInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        stickerFragmentDialog.refreshRemoteStickerItem(bVar, stickerInfo);
    }

    public static final /* synthetic */ void access$refreshStickerItemRV(StickerFragmentDialog stickerFragmentDialog, RecyclerView recyclerView, List list, String str) {
        if (PatchProxy.proxy(new Object[]{stickerFragmentDialog, recyclerView, list, str}, null, changeQuickRedirect, true, 50409, new Class[]{StickerFragmentDialog.class, RecyclerView.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        stickerFragmentDialog.refreshStickerItemRV(recyclerView, list, str);
    }

    private final boolean alreadyExist(StickerInfo stickerInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{stickerInfo}, this, changeQuickRedirect, false, 50400, new Class[]{StickerInfo.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (StickerInfo stickerInfo2 : this.recentStickerList) {
            if (kotlin.jvm.internal.f0.g(stickerInfo2.getPath(), stickerInfo.getPath()) || kotlin.jvm.internal.f0.g(stickerInfo2.getPath(), stickerInfo.getUrl()) || kotlin.jvm.internal.f0.g(stickerInfo2.getUrl(), stickerInfo.getUrl())) {
                return true;
            }
        }
        return false;
    }

    private final StickerGroupInfo getMyStickerList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50393, new Class[0], StickerGroupInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerGroupInfo) patchProxyResultProxy.result;
        }
        List listB = com.max.hbutils.utils.k.b(com.max.hbcache.c.o(SP_STICKER_LIST_MINE, null), StickerInfo.class);
        this.myStickerList.clear();
        if (listB != null) {
            this.myStickerList.addAll(listB);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StickerInfo(null, null, null, null, StickerGroupInfo.STICKER_TYPE_BUTTON_ADD));
        if (listB != null) {
            arrayList.addAll(listB);
        }
        return new StickerGroupInfo("我的", null, StickerGroupInfo.STICKER_TYPE_MIX, arrayList, null, null, 48, null);
    }

    private final StickerGroupInfo getRecentStickerList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50392, new Class[0], StickerGroupInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (StickerGroupInfo) patchProxyResultProxy.result;
        }
        List listB = com.max.hbutils.utils.k.b(com.max.hbcache.c.o(SP_STICKER_LIST_RECENT, null), StickerInfo.class);
        ArrayList arrayList = new ArrayList();
        this.recentStickerList = arrayList;
        if (listB != null) {
            arrayList.addAll(listB);
        }
        return new StickerGroupInfo("常用", null, StickerGroupInfo.STICKER_TYPE_MIX, arrayList, null, null, 48, null);
    }

    private final List<StickerGroupInfo> getRemoteSticker() {
        List listB;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50401, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        String strO = com.max.hbcache.c.o(com.max.hbcache.c.f66111a0, "");
        if (!com.max.hbcommon.utils.c.u(strO) && (listB = com.max.hbutils.utils.k.b(strO, StickerGroupInfo.class)) != null) {
            arrayList.addAll(listB);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(StickerFragmentDialog this$0, TabLayout.h tab, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, tab, new Integer(i10)}, null, changeQuickRedirect, true, 50402, new Class[]{StickerFragmentDialog.class, TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(tab, "tab");
        tab.D(this$0.stickerGroupList.get(i10).getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(final StickerFragmentDialog this$0, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{this$0, bool}, null, changeQuickRedirect, true, 50404, new Class[]{StickerFragmentDialog.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.m(bool);
        if (bool.booleanValue()) {
            this$0.loadStickers();
            this$0.getVpAdapter().notifyItemRangeChanged(0, this$0.stickerGroupList.size());
            this$0.getViewPager().post(new Runnable() { // from class: com.starlightc.ucropplus.ui.p
                @Override // java.lang.Runnable
                public final void run() {
                    StickerFragmentDialog.initViews$lambda$2$lambda$1(this.f98110b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2$lambda$1(StickerFragmentDialog this$0) {
        if (PatchProxy.proxy(new Object[]{this$0}, null, changeQuickRedirect, true, 50403, new Class[]{StickerFragmentDialog.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.getViewPager().setCurrentItem(1);
    }

    private final void loadStickers() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50394, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.stickerGroupList.clear();
        this.stickerGroupList.add(getMyStickerList());
        List<StickerGroupInfo> remoteSticker = getRemoteSticker();
        if (!remoteSticker.isEmpty()) {
            for (StickerGroupInfo stickerGroupInfo : remoteSticker) {
                if (com.max.hbcommon.utils.c.u(stickerGroupInfo.getIndex())) {
                    this.stickerGroupList.add(stickerGroupInfo);
                } else {
                    int iQ = com.max.hbutils.utils.n.q(stickerGroupInfo.getIndex());
                    if (iQ < 0 || iQ >= this.stickerGroupList.size()) {
                        this.stickerGroupList.add(stickerGroupInfo);
                    } else {
                        this.stickerGroupList.add(iQ, stickerGroupInfo);
                    }
                }
            }
        }
        StickerGroupInfo recentStickerList = getRecentStickerList();
        List<StickerInfo> imgs = recentStickerList.getImgs();
        if (imgs == null || imgs.isEmpty()) {
            return;
        }
        this.stickerGroupList.add(1, recentStickerList);
    }

    private final void onLocalItemCLick(final StickerInfo stickerInfo) {
        UCropPlusActivity editorActivity;
        final UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[]{stickerInfo}, this, changeQuickRedirect, false, 50398, new Class[]{StickerInfo.class}, Void.TYPE).isSupported || !(getParentActivity() instanceof UCropPlusActivity) || (editorActivity = getEditorActivity()) == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) {
            return;
        }
    }

    private final void refreshLocalStickerItem(dc.b bVar, final StickerInfo stickerInfo) {
        if (PatchProxy.proxy(new Object[]{bVar, stickerInfo}, this, changeQuickRedirect, false, 50397, new Class[]{dc.b.class, StickerInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        Glide.H(this).load(stickerInfo.getPath()).C1((ImageView) bVar.a(R.id.iv_sticker));
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StickerFragmentDialog.refreshLocalStickerItem$lambda$7(this.f98112b, stickerInfo, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshLocalStickerItem$lambda$7(StickerFragmentDialog this$0, StickerInfo data, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, data, view}, null, changeQuickRedirect, true, 50406, new Class[]{StickerFragmentDialog.class, StickerInfo.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(data, "$data");
        this$0.onLocalItemCLick(data);
    }

    private final void refreshMixStickerItem(dc.b bVar, StickerInfo stickerInfo) {
        if (PatchProxy.proxy(new Object[]{bVar, stickerInfo}, this, changeQuickRedirect, false, 50396, new Class[]{dc.b.class, StickerInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        if (kotlin.jvm.internal.f0.g(stickerInfo.getType(), StickerGroupInfo.STICKER_TYPE_REMOTE)) {
            refreshRemoteStickerItem(bVar, stickerInfo);
        } else if (kotlin.jvm.internal.f0.g(stickerInfo.getType(), "local")) {
            refreshLocalStickerItem(bVar, stickerInfo);
        } else if (kotlin.jvm.internal.f0.g(stickerInfo.getType(), StickerGroupInfo.STICKER_TYPE_BUTTON_ADD)) {
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StickerFragmentDialog.refreshMixStickerItem$lambda$6(this.f98096b, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshMixStickerItem$lambda$6(final StickerFragmentDialog this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, 50405, new Class[]{StickerFragmentDialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        PictureSelectionConfig.a();
        com.max.mediaselector.e.i(this$0, 1, new oe.t<LocalMedia>() { // from class: com.starlightc.ucropplus.ui.StickerFragmentDialog$refreshMixStickerItem$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // oe.t
            public void onCancel() {
            }

            @Override // oe.t
            public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
                if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 50424, new Class[]{ArrayList.class}, Void.TYPE).isSupported || arrayList == null) {
                    return;
                }
                StickerFragmentDialog stickerFragmentDialog = this.this$0;
                for (LocalMedia localMedia : arrayList) {
                    String strG = localMedia.G();
                    if (!(strG == null || strG.length() == 0)) {
                        StickerInfo stickerInfo = new StickerInfo(localMedia.G(), null, null, localMedia.y(), "local");
                        stickerFragmentDialog.m45getMyStickerList().add(0, stickerInfo);
                        if (stickerFragmentDialog.m45getMyStickerList().size() > 50) {
                            stickerFragmentDialog.setMyStickerList(stickerFragmentDialog.m45getMyStickerList().subList(0, 50));
                        }
                        com.max.hbcache.c.C(StickerFragmentDialog.Companion.getSP_STICKER_LIST_MINE(), com.max.hbutils.utils.k.r(stickerFragmentDialog.m45getMyStickerList()));
                        StickerFragmentDialog.access$onLocalItemCLick(stickerFragmentDialog, stickerInfo);
                        StickerFragmentDialog.access$loadStickers(stickerFragmentDialog);
                        stickerFragmentDialog.getVpAdapter().notifyItemRangeChanged(0, 1);
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, android.graphics.Bitmap] */
    private final void refreshRemoteStickerItem(dc.b bVar, final StickerInfo stickerInfo) {
        if (PatchProxy.proxy(new Object[]{bVar, stickerInfo}, this, changeQuickRedirect, false, 50399, new Class[]{dc.b.class, StickerInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = (ImageView) bVar.a(R.id.iv_sticker);
        final File fileP = com.max.hbimage.b.p(stickerInfo.getUrl());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (fileP != null && fileP.exists()) {
            objectRef.f124891b = BitmapFactory.decodeFile(fileP.getPath());
        }
        T t10 = objectRef.f124891b;
        if (t10 != 0) {
            imageView.setImageBitmap((Bitmap) t10);
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StickerFragmentDialog.refreshRemoteStickerItem$lambda$9(this.f98098b, objectRef, fileP, stickerInfo, view);
                }
            });
        } else {
            Glide.H(this).load(stickerInfo.getUrl()).C1(imageView);
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.starlightc.ucropplus.ui.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StickerFragmentDialog.refreshRemoteStickerItem$lambda$11(this.f98103b, stickerInfo, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRemoteStickerItem$lambda$11(final StickerFragmentDialog this$0, final StickerInfo data, View view) {
        UCropPlusActivity editorActivity;
        final UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[]{this$0, data, view}, null, changeQuickRedirect, true, 50408, new Class[]{StickerFragmentDialog.class, StickerInfo.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(data, "$data");
        if (!(this$0.getParentActivity() instanceof UCropPlusActivity) || (editorActivity = this$0.getEditorActivity()) == null || (currentCropFragment = editorActivity.getCurrentCropFragment()) == null) {
            return;
        }
        com.bumptech.glide.i<File> iVarLoad = Glide.F(com.max.hbimage.image.l.a()).u().load(data.getUrl());
        final String url = data.getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRemoteStickerItem$lambda$9(StickerFragmentDialog this$0, Ref.ObjectRef dataBitmap, File file, StickerInfo data, View view) {
        UCropPlusFragment currentCropFragment;
        if (PatchProxy.proxy(new Object[]{this$0, dataBitmap, file, data, view}, null, changeQuickRedirect, true, 50407, new Class[]{StickerFragmentDialog.class, Ref.ObjectRef.class, File.class, StickerInfo.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(dataBitmap, "$dataBitmap");
        kotlin.jvm.internal.f0.p(data, "$data");
        if (this$0.getParentActivity() instanceof UCropPlusActivity) {
            UCropPlusActivity editorActivity = this$0.getEditorActivity();
            if (editorActivity != null && (currentCropFragment = editorActivity.getCurrentCropFragment()) != null) {
                UCropPlusFragment.addStickerBitImage$default(currentCropFragment, (Bitmap) dataBitmap.f124891b, file.getAbsolutePath(), null, false, 0, 28, null);
            }
            boolean z10 = this$0.recentStickerList.size() == 0;
            if (this$0.alreadyExist(data)) {
                this$0.recentStickerList.remove(data);
            }
            data.setType(StickerGroupInfo.STICKER_TYPE_REMOTE);
            this$0.recentStickerList.add(0, data);
            if (this$0.recentStickerList.size() > 50) {
                this$0.recentStickerList = this$0.recentStickerList.subList(0, 50);
            }
            com.max.hbcache.c.C(SP_STICKER_LIST_RECENT, com.max.hbutils.utils.k.r(this$0.recentStickerList));
            this$0.loadStickers();
            if (z10) {
                this$0.getVpAdapter().notifyDataSetChanged();
            } else {
                this$0.getVpAdapter().notifyItemRangeChanged(1, 1);
            }
        }
    }

    private final void refreshStickerItemRV(RecyclerView recyclerView, List<StickerInfo> list, final String str) {
        if (PatchProxy.proxy(new Object[]{recyclerView, list, str}, this, changeQuickRedirect, false, 50395, new Class[]{RecyclerView.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        final List listT5 = CollectionsKt___CollectionsKt.T5(list);
        com.max.hbcustomview.recyclerview.c<StickerInfo> cVar = new com.max.hbcustomview.recyclerview.c<StickerInfo>(listT5) { // from class: com.starlightc.ucropplus.ui.StickerFragmentDialog$refreshStickerItemRV$rvAdapter$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
            public void bindViewHolder2(@dl.d dc.b holder, @dl.d StickerInfo data, int i10) {
                if (PatchProxy.proxy(new Object[]{holder, data, new Integer(i10)}, this, changeQuickRedirect, false, 50427, new Class[]{dc.b.class, StickerInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(holder, "holder");
                kotlin.jvm.internal.f0.p(data, "data");
                if (kotlin.jvm.internal.f0.g(str, StickerGroupInfo.STICKER_TYPE_REMOTE)) {
                    StickerFragmentDialog.access$refreshRemoteStickerItem(this, holder, data);
                } else if (kotlin.jvm.internal.f0.g(str, "local")) {
                    StickerFragmentDialog.access$refreshLocalStickerItem(this, holder, data);
                } else {
                    StickerFragmentDialog.access$refreshMixStickerItem(this, holder, data);
                }
            }

            @Override // com.max.hbcustomview.recyclerview.c
            public /* bridge */ /* synthetic */ void bindViewHolder(dc.b bVar, StickerInfo stickerInfo, int i10) {
                if (PatchProxy.proxy(new Object[]{bVar, stickerInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50429, new Class[]{dc.b.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                bindViewHolder2(bVar, stickerInfo, i10);
            }

            /* JADX INFO: renamed from: provideLayoutID, reason: avoid collision after fix types in other method */
            public int provideLayoutID2(int i10, @dl.d StickerInfo data) {
                Object[] objArr = {new Integer(i10), data};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50428, new Class[]{cls, StickerInfo.class}, cls);
                if (patchProxyResultProxy.isSupported) {
                    return ((Integer) patchProxyResultProxy.result).intValue();
                }
                kotlin.jvm.internal.f0.p(data, "data");
                return kotlin.jvm.internal.f0.g(data.getType(), StickerGroupInfo.STICKER_TYPE_BUTTON_ADD) ? R.layout.item_sticker_add : R.layout.item_sticker;
            }

            @Override // com.max.hbcustomview.recyclerview.c
            public /* bridge */ /* synthetic */ int provideLayoutID(int i10, StickerInfo stickerInfo) {
                Object[] objArr = {new Integer(i10), stickerInfo};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50430, new Class[]{cls, Object.class}, cls);
                return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : provideLayoutID2(i10, stickerInfo);
            }
        };
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        cVar.notifyItemRangeChanged(0, list.size());
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50388, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentStickerBinding fragmentStickerBindingInflate = FragmentStickerBinding.inflate(getMInflater());
        kotlin.jvm.internal.f0.o(fragmentStickerBindingInflate, "inflate(...)");
        setBinding(fragmentStickerBindingInflate);
        setViewBinding(getBinding());
        ViewPager2 vpSticker = getBinding().vpSticker;
        kotlin.jvm.internal.f0.o(vpSticker, "vpSticker");
        setViewPager(vpSticker);
        HBSecondaryMenuWindowTabLayout tlStickerGroup = getBinding().tlStickerGroup;
        kotlin.jvm.internal.f0.o(tlStickerGroup, "tlStickerGroup");
        setTabLayout(tlStickerGroup);
    }

    @dl.d
    public final FragmentStickerBinding getBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50376, new Class[0], FragmentStickerBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentStickerBinding) patchProxyResultProxy.result;
        }
        FragmentStickerBinding fragmentStickerBinding = this.binding;
        if (fragmentStickerBinding != null) {
            return fragmentStickerBinding;
        }
        kotlin.jvm.internal.f0.S("binding");
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: getMyStickerList, reason: collision with other method in class */
    public final List<StickerInfo> m45getMyStickerList() {
        return this.myStickerList;
    }

    @dl.d
    public final androidx.activity.result.g<String> getPermissionLauncher() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50384, new Class[0], androidx.activity.result.g.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.activity.result.g) patchProxyResultProxy.result;
        }
        androidx.activity.result.g<String> gVar = this.permissionLauncher;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.f0.S("permissionLauncher");
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: getRecentStickerList, reason: collision with other method in class */
    public final List<StickerInfo> m46getRecentStickerList() {
        return this.recentStickerList;
    }

    @dl.d
    public final ArrayList<StickerGroupInfo> getStickerGroupList() {
        return this.stickerGroupList;
    }

    @dl.d
    public final TabLayout getTabLayout() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50380, new Class[0], TabLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (TabLayout) patchProxyResultProxy.result;
        }
        TabLayout tabLayout = this.tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        kotlin.jvm.internal.f0.S("tabLayout");
        return null;
    }

    @dl.d
    public final ViewPager2 getViewPager() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50378, new Class[0], ViewPager2.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewPager2) patchProxyResultProxy.result;
        }
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        kotlin.jvm.internal.f0.S("viewPager");
        return null;
    }

    @dl.d
    public final CommonRecyclerViewAdapter<StickerGroupInfo> getVpAdapter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50382, new Class[0], CommonRecyclerViewAdapter.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommonRecyclerViewAdapter) patchProxyResultProxy.result;
        }
        CommonRecyclerViewAdapter<StickerGroupInfo> commonRecyclerViewAdapter = this.vpAdapter;
        if (commonRecyclerViewAdapter != null) {
            return commonRecyclerViewAdapter;
        }
        kotlin.jvm.internal.f0.S("vpAdapter");
        return null;
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50389, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVpAdapter(new CommonRecyclerViewAdapter<StickerGroupInfo>(this.stickerGroupList, R.layout.item_sticker_group) { // from class: com.starlightc.ucropplus.ui.StickerFragmentDialog.initViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
            public void bindViewHolder2(@dl.d CommonRecyclerViewAdapter.CommonViewHolder holder, @dl.d StickerGroupInfo groupData, int i10) {
                if (PatchProxy.proxy(new Object[]{holder, groupData, new Integer(i10)}, this, changeQuickRedirect, false, 50418, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, StickerGroupInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(holder, "holder");
                kotlin.jvm.internal.f0.p(groupData, "groupData");
                final ArrayList arrayList = new ArrayList();
                arrayList.add(groupData);
                if (groupData.getSub_groups() != null) {
                    List<StickerGroupInfo> sub_groups = groupData.getSub_groups();
                    kotlin.jvm.internal.f0.m(sub_groups);
                    for (StickerGroupInfo stickerGroupInfo : sub_groups) {
                        stickerGroupInfo.setType(StickerGroupInfo.STICKER_TYPE_REMOTE);
                        arrayList.add(stickerGroupInfo);
                    }
                }
                RecyclerView recyclerView = (RecyclerView) holder.findViewById(R.id.rv_sticker_group);
                final int i11 = R.layout.item_sticker_content;
                final StickerFragmentDialog stickerFragmentDialog = StickerFragmentDialog.this;
                CommonRecyclerViewAdapter<StickerGroupInfo> commonRecyclerViewAdapter = new CommonRecyclerViewAdapter<StickerGroupInfo>(arrayList, i11) { // from class: com.starlightc.ucropplus.ui.StickerFragmentDialog$initViews$1$bindViewHolder$grvAdapter$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: bindViewHolder, reason: avoid collision after fix types in other method */
                    public void bindViewHolder2(@dl.d CommonRecyclerViewAdapter.CommonViewHolder holder2, @dl.d StickerGroupInfo data, int i12) {
                        if (PatchProxy.proxy(new Object[]{holder2, data, new Integer(i12)}, this, changeQuickRedirect, false, 50420, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, StickerGroupInfo.class, Integer.TYPE}, Void.TYPE).isSupported) {
                            return;
                        }
                        kotlin.jvm.internal.f0.p(holder2, "holder");
                        kotlin.jvm.internal.f0.p(data, "data");
                        RecyclerView recyclerView2 = (RecyclerView) holder2.findViewById(R.id.rv_sticker_group);
                        TextView textView = (TextView) holder2.findViewById(R.id.tv_group_name);
                        if (holder2.getBindingAdapterPosition() != 0) {
                            textView.setVisibility(0);
                            textView.setText(data.getName());
                        } else {
                            textView.setVisibility(8);
                        }
                        List<StickerInfo> imgs = data.getImgs();
                        if (imgs == null || imgs.isEmpty()) {
                            holder2.itemView.setVisibility(8);
                            textView.setVisibility(8);
                            return;
                        }
                        holder2.itemView.setVisibility(0);
                        List<StickerInfo> imgs2 = data.getImgs();
                        if (imgs2 != null) {
                            StickerFragmentDialog.access$refreshStickerItemRV(stickerFragmentDialog, recyclerView2, imgs2, data.getType());
                        }
                        int iF = ViewUtils.f(stickerFragmentDialog.getContext(), 250.0f);
                        if (i12 != stickerFragmentDialog.getStickerGroupList().size() - 1 || holder2.itemView.getHeight() >= iF) {
                            return;
                        }
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.height = iF;
                        holder2.itemView.setLayoutParams(layoutParams);
                    }

                    @Override // com.starlightc.ucropplus.util.CommonRecyclerViewAdapter
                    public /* bridge */ /* synthetic */ void bindViewHolder(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, StickerGroupInfo stickerGroupInfo2, int i12) {
                        if (PatchProxy.proxy(new Object[]{commonViewHolder, stickerGroupInfo2, new Integer(i12)}, this, changeQuickRedirect, false, 50421, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                            return;
                        }
                        bindViewHolder2(commonViewHolder, stickerGroupInfo2, i12);
                    }
                };
                recyclerView.setLayoutManager(new LinearLayoutManager(StickerFragmentDialog.this.requireContext()));
                recyclerView.setAdapter(commonRecyclerViewAdapter);
            }

            @Override // com.starlightc.ucropplus.util.CommonRecyclerViewAdapter
            public /* bridge */ /* synthetic */ void bindViewHolder(CommonRecyclerViewAdapter.CommonViewHolder commonViewHolder, StickerGroupInfo stickerGroupInfo, int i10) {
                if (PatchProxy.proxy(new Object[]{commonViewHolder, stickerGroupInfo, new Integer(i10)}, this, changeQuickRedirect, false, 50419, new Class[]{CommonRecyclerViewAdapter.CommonViewHolder.class, Object.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                bindViewHolder2(commonViewHolder, stickerGroupInfo, i10);
            }
        });
        getViewPager().setAdapter(getVpAdapter());
        new com.google.android.material.tabs.d(getTabLayout(), getViewPager(), true, new com.google.android.material.tabs.d.b() { // from class: com.starlightc.ucropplus.ui.n
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.h hVar, int i10) {
                StickerFragmentDialog.initViews$lambda$0(this.f98106a, hVar, i10);
            }
        }).a();
        androidx.activity.result.g<String> gVarRegisterForActivityResult = registerForActivityResult(new z.b.l(), new androidx.activity.result.a() { // from class: com.starlightc.ucropplus.ui.o
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                StickerFragmentDialog.initViews$lambda$2(this.f98108a, (Boolean) obj);
            }
        });
        kotlin.jvm.internal.f0.o(gVarRegisterForActivityResult, "registerForActivityResult(...)");
        setPermissionLauncher(gVarRegisterForActivityResult);
    }

    @Override // com.starlightc.ucropplus.ui.BaseFragmentDialog
    public void loadData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50390, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getPermissionLauncher().b(Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE");
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, @dl.d String[] permissions, @dl.d int[] grantResults) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), permissions, grantResults}, this, changeQuickRedirect, false, 50391, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(permissions, "permissions");
        kotlin.jvm.internal.f0.p(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    public final void setBinding(@dl.d FragmentStickerBinding fragmentStickerBinding) {
        if (PatchProxy.proxy(new Object[]{fragmentStickerBinding}, this, changeQuickRedirect, false, 50377, new Class[]{FragmentStickerBinding.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(fragmentStickerBinding, "<set-?>");
        this.binding = fragmentStickerBinding;
    }

    public final void setMyStickerList(@dl.d List<StickerInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 50387, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(list, "<set-?>");
        this.myStickerList = list;
    }

    public final void setPermissionLauncher(@dl.d androidx.activity.result.g<String> gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 50385, new Class[]{androidx.activity.result.g.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(gVar, "<set-?>");
        this.permissionLauncher = gVar;
    }

    public final void setRecentStickerList(@dl.d List<StickerInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 50386, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(list, "<set-?>");
        this.recentStickerList = list;
    }

    public final void setTabLayout(@dl.d TabLayout tabLayout) {
        if (PatchProxy.proxy(new Object[]{tabLayout}, this, changeQuickRedirect, false, 50381, new Class[]{TabLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(tabLayout, "<set-?>");
        this.tabLayout = tabLayout;
    }

    public final void setViewPager(@dl.d ViewPager2 viewPager2) {
        if (PatchProxy.proxy(new Object[]{viewPager2}, this, changeQuickRedirect, false, 50379, new Class[]{ViewPager2.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewPager2, "<set-?>");
        this.viewPager = viewPager2;
    }

    public final void setVpAdapter(@dl.d CommonRecyclerViewAdapter<StickerGroupInfo> commonRecyclerViewAdapter) {
        if (PatchProxy.proxy(new Object[]{commonRecyclerViewAdapter}, this, changeQuickRedirect, false, 50383, new Class[]{CommonRecyclerViewAdapter.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(commonRecyclerViewAdapter, "<set-?>");
        this.vpAdapter = commonRecyclerViewAdapter;
    }
}
