package com.max.xiaoheihe.module.littleprogram.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbimage.b;
import com.max.hbminiprogram.bean.MiniProgramBoardObj;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbminiprogram.bean.MiniProgramPageObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.tq;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramBoardView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MiniProgramBoardView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89377b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public MiniProgramBoardView(@e Context context) {
        this(context, null);
    }

    public MiniProgramBoardView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MiniProgramBoardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
    }

    private final LinearLayout a(LinearLayout linearLayout, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linearLayout, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39765, new Class[]{LinearLayout.class, Boolean.TYPE}, LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!z10) {
            layoutParams.topMargin = ViewUtils.f(getContext(), 10.0f);
        }
        linearLayout.addView(linearLayout2, layoutParams);
        return linearLayout2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, com.max.xiaoheihe.module.littleprogram.view.MiniProgramBoardView, java.lang.Object] */
    public final void setData(@e MiniProgramPageObj miniProgramPageObj, @d String addedMiniProgramId, boolean z10) {
        int i10;
        char c10;
        MiniProgramBoardObj main_page_menu;
        MiniProgramBoardObj main_page_menu2;
        ?? r10 = 0;
        if (PatchProxy.proxy(new Object[]{miniProgramPageObj, addedMiniProgramId, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39764, new Class[]{MiniProgramPageObj.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(addedMiniProgramId, "addedMiniProgramId");
        List<MiniProgramObj> modifiable_apps = (miniProgramPageObj == null || (main_page_menu2 = miniProgramPageObj.getMain_page_menu()) == null) ? null : main_page_menu2.getModifiable_apps();
        List<MiniProgramObj> not_modifiable_apps = (miniProgramPageObj == null || (main_page_menu = miniProgramPageObj.getMain_page_menu()) == null) ? null : main_page_menu.getNot_modifiable_apps();
        ArrayList arrayList = new ArrayList();
        if (modifiable_apps != null) {
            arrayList.addAll(modifiable_apps);
        }
        if (not_modifiable_apps != null) {
            arrayList.addAll(not_modifiable_apps);
        }
        if (!arrayList.isEmpty()) {
            char c11 = 0;
            int iL = (ViewUtils.L(getContext()) - (ViewUtils.f(getContext(), 60.0f) * 5)) / 6;
            removeAllViews();
            LinearLayout linearLayoutA = a(this, true);
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            while (i11 < size) {
                if (arrayList.get(i11) == null) {
                    c10 = c11;
                } else {
                    Object obj = arrayList.get(i11);
                    f0.m(obj);
                    MiniProgramObj miniProgramObj = (MiniProgramObj) obj;
                    int i13 = i11 / 5;
                    int i14 = i11 % 5;
                    if (i13 != i12) {
                        linearLayoutA = a(this, r10);
                        i12 = i13;
                    }
                    tq tqVarC = tq.c(LayoutInflater.from(getContext()));
                    f0.o(tqVarC, "inflate(LayoutInflater.from(context))");
                    tqVarC.b().setAlpha(0.3f);
                    Integer mini_app_id = miniProgramObj.getMini_app_id();
                    if (addedMiniProgramId.equals(mini_app_id != null ? mini_app_id.toString() : null) && !z11 && !z10) {
                        tqVarC.b().setAlpha(1.0f);
                        z11 = true;
                    }
                    f0.m(miniProgramObj);
                    b.K(miniProgramObj.getBg_img(), tqVarC.f116053c);
                    if (miniProgramObj.getIcon_img() != null) {
                        String icon_img = miniProgramObj.getIcon_img();
                        f0.m(icon_img);
                        if ((icon_img.length() > 0 ? 1 : r10) != 0) {
                            tqVarC.f116052b.setVisibility(r10);
                            b.d0(miniProgramObj.getIcon_img(), tqVarC.f116052b, ViewUtils.f(getContext(), 2.0f));
                            i10 = 8;
                        } else {
                            i10 = 8;
                            tqVarC.f116052b.setVisibility(8);
                        }
                    } else {
                        i10 = 8;
                        tqVarC.f116052b.setVisibility(8);
                    }
                    tqVarC.f116054d.setVisibility(miniProgramObj.getHave_new() ? 0 : i10);
                    tqVarC.f116055e.setText(miniProgramObj.getName());
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tqVarC.b().getLayoutParams();
                    if (layoutParams == null) {
                        c10 = 0;
                        layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), 60.0f), -2);
                    } else {
                        c10 = 0;
                    }
                    if (i14 == 0) {
                        layoutParams.leftMargin = iL;
                    }
                    layoutParams.rightMargin = iL;
                    linearLayoutA.addView(tqVarC.b(), layoutParams);
                }
                i11++;
                c11 = c10;
                r10 = 0;
            }
        }
    }
}
