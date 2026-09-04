package com.max.xiaoheihe.module.game.pubg.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.spans.g;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGTrendObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGWeaponObj;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import jh.e;

/* JADX INFO: compiled from: PubgUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: PubgUtils.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PUBGWeaponObj f88205c;

        a(Context context, PUBGWeaponObj pUBGWeaponObj) {
            this.f88204b = context;
            this.f88205c = pUBGWeaponObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38383, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.j0(this.f88204b, this.f88205c.getProtocol());
        }
    }

    public static int a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38373, new Class[]{String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b(null, str);
    }

    public static int b(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 38374, new Class[]{String.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str2.contains("solo")) {
            return d.E(R.color.pubg_solo_color);
        }
        if (str2.contains("duo")) {
            return d.E(R.color.pubg_duo_color);
        }
        return str2.contains("squad") ? d.E(R.color.game_pubg_color_variant_1) : d.E(R.color.pubg_solo_color);
    }

    public static int c(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38378, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str.contains("solo")) {
            return R.drawable.pubg_mode_solo;
        }
        if (str.contains("duo")) {
            return R.drawable.pubg_mode_duo;
        }
        return str.contains("squad") ? R.drawable.pubg_mode_squad : R.drawable.pubg_mode_solo;
    }

    public static float d(String str, @e PUBGTrendObj pUBGTrendObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, pUBGTrendObj}, null, changeQuickRedirect, true, 38377, new Class[]{String.class, PUBGTrendObj.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if ("duo".equalsIgnoreCase(str)) {
            return n.p(pUBGTrendObj.getDuo());
        }
        return "squad".equalsIgnoreCase(str) ? n.p(pUBGTrendObj.getSquad()) : n.p(pUBGTrendObj.getSolo());
    }

    public static int e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38375, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (str.contains("solo")) {
            return Color.parseColor("#CC3BB7D1");
        }
        if (str.contains("duo")) {
            return Color.parseColor("#CCFF7C2B");
        }
        return str.contains("squad") ? Color.parseColor("#CCFFBB00") : Color.parseColor("#CC3BB7D1");
    }

    public static int f(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38381, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return d.E(R.color.white_alpha50);
        }
        String upperCase = str.toUpperCase();
        upperCase.hashCode();
        switch (upperCase.hashCode()) {
            case 65:
                b10 = !upperCase.equals(androidx.exifinterface.media.a.W4) ? (byte) -1 : (byte) 0;
                break;
            case 66:
                if (!upperCase.equals("B")) {
                    b10 = -1;
                }
                break;
            case 67:
                b10 = !upperCase.equals("C") ? (byte) -1 : (byte) 2;
                break;
            case 68:
                b10 = !upperCase.equals("D") ? (byte) -1 : (byte) 3;
                break;
            case 83:
                b10 = !upperCase.equals(androidx.exifinterface.media.a.R4) ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return d.E(R.color.white_alpha50);
            case 4:
                return d.E(R.color.game_pubg_color);
            default:
                return d.E(R.color.white_alpha50);
        }
    }

    public static Drawable g(String str, int i10, int i11) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 38376, new Class[]{String.class, cls, cls}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        if ("duo".equalsIgnoreCase(str)) {
            return ViewUtils.v(i10, i11, GradientDrawable.Orientation.TOP_BOTTOM, -298384, -1629665);
        }
        return "squad".equalsIgnoreCase(str) ? ViewUtils.v(i10, i11, GradientDrawable.Orientation.TOP_BOTTOM, -20391, -364544) : ViewUtils.v(i10, i11, GradientDrawable.Orientation.TOP_BOTTOM, -16728321, -16743937);
    }

    public static float h(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38379, new Class[]{String.class}, Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return 1.0f;
        }
        String upperCase = str.toUpperCase();
        upperCase.hashCode();
        switch (upperCase.hashCode()) {
            case 65:
                b10 = !upperCase.equals(androidx.exifinterface.media.a.W4) ? (byte) -1 : (byte) 0;
                break;
            case 66:
                if (!upperCase.equals("B")) {
                    b10 = -1;
                }
                break;
            case 67:
                b10 = !upperCase.equals("C") ? (byte) -1 : (byte) 2;
                break;
            case 68:
                b10 = !upperCase.equals("D") ? (byte) -1 : (byte) 3;
                break;
            case 83:
                b10 = !upperCase.equals(androidx.exifinterface.media.a.R4) ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 0.8f;
            case 1:
                return 0.65f;
            case 2:
                return 0.5f;
            case 3:
                return 0.35f;
            case 4:
            default:
                return 1.0f;
        }
    }

    public static int i(String str) {
        byte b10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38380, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return d.E(R.color.rate_a);
        }
        String upperCase = str.toUpperCase();
        upperCase.hashCode();
        switch (upperCase.hashCode()) {
            case 65:
                b10 = !upperCase.equals(androidx.exifinterface.media.a.W4) ? (byte) -1 : (byte) 0;
                break;
            case 66:
                if (!upperCase.equals("B")) {
                    b10 = -1;
                }
                break;
            case 67:
                b10 = !upperCase.equals("C") ? (byte) -1 : (byte) 2;
                break;
            case 68:
                b10 = !upperCase.equals("D") ? (byte) -1 : (byte) 3;
                break;
            case 83:
                b10 = !upperCase.equals(androidx.exifinterface.media.a.R4) ? (byte) -1 : (byte) 4;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return d.E(R.color.rate_a);
            case 4:
                return d.E(R.color.rate_s);
            default:
                return d.E(R.color.rate_a);
        }
    }

    public static void j(s.e eVar, PUBGWeaponObj pUBGWeaponObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, pUBGWeaponObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38382, new Class[]{s.e.class, PUBGWeaponObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewB = eVar.b();
        Context context = viewB.getContext();
        ImageView imageView = (ImageView) eVar.i(R.id.cell0);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_level);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_level);
        ProgressBar progressBar = (ProgressBar) eVar.i(R.id.f76248pb);
        TextView textView3 = (TextView) eVar.i(R.id.cell2);
        TextView textView4 = (TextView) eVar.i(R.id.cell3);
        View viewI = eVar.i(R.id.divider);
        com.max.hbimage.b.d0(pUBGWeaponObj.getImage(), imageView, ViewUtils.f(context, 3.0f));
        textView.setText(pUBGWeaponObj.getName());
        if (z10) {
            viewI.setVisibility(8);
        } else {
            viewI.setVisibility(0);
        }
        textView2.setText(pUBGWeaponObj.getLevelDesc());
        if (com.max.hbcommon.utils.c.u(pUBGWeaponObj.getTierImg())) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            com.max.hbimage.b.K(pUBGWeaponObj.getTierImg(), imageView2);
        }
        if (!com.max.hbcommon.utils.c.u(pUBGWeaponObj.getStart_color()) && !com.max.hbcommon.utils.c.u(pUBGWeaponObj.getEnd_color())) {
            ((LayerDrawable) progressBar.getProgressDrawable()).setDrawableByLayerId(android.R.id.progress, new ScaleDrawable(ViewUtils.x(ViewUtils.f(context, 2.0f), d.e1(pUBGWeaponObj.getStart_color()), d.e1(pUBGWeaponObj.getEnd_color())), 3, 1.0f, -1.0f));
        }
        progressBar.setProgress(n.q(pUBGWeaponObj.getLevelCurrent()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pUBGWeaponObj.getKills());
        String str = " /" + pUBGWeaponObj.getMostKillsInAGame();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.text_size_14)), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.white_alpha50)), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new g(bb.d.a().b(2)), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
        textView3.setText(spannableStringBuilder);
        textView4.setText(pUBGWeaponObj.getLongestKill());
        viewB.setOnClickListener(new a(context, pUBGWeaponObj));
    }
}
