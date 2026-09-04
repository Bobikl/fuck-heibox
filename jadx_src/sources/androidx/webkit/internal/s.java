package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: WebSettingsAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebSettingsBoundaryInterface f28394a;

    public s(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f28394a = webSettingsBoundaryInterface;
    }

    public int a() {
        return this.f28394a.getDisabledActionModeMenuItems();
    }

    public int b() {
        return this.f28394a.getForceDark();
    }

    public int c() {
        return this.f28394a.getForceDarkBehavior();
    }

    public boolean d() {
        return this.f28394a.getOffscreenPreRaster();
    }

    public boolean e() {
        return this.f28394a.getSafeBrowsingEnabled();
    }

    public void f(int i10) {
        this.f28394a.setDisabledActionModeMenuItems(i10);
    }

    public void g(int i10) {
        this.f28394a.setForceDark(i10);
    }

    public void h(int i10) {
        this.f28394a.setForceDarkBehavior(i10);
    }

    public void i(boolean z10) {
        this.f28394a.setOffscreenPreRaster(z10);
    }

    public void j(boolean z10) {
        this.f28394a.setSafeBrowsingEnabled(z10);
    }

    public void k(boolean z10) {
        this.f28394a.setWillSuppressErrorPage(z10);
    }

    public boolean l() {
        return this.f28394a.getWillSuppressErrorPage();
    }
}
