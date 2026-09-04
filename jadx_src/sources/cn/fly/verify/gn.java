package cn.fly.verify;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class gn {

    public static class a {
        public static boolean a(Object obj) {
            return ((Boolean) gi.a(obj, "isRegistered", Boolean.FALSE, new Object[0])).booleanValue();
        }

        public static boolean b(Object obj) {
            return gn.a(obj, ec.a("029bcKbabhbibgbabjTgdedhfAbi,c<cabjcbFdee4cc1c!cdbigbdgbd"));
        }

        public static boolean c(Object obj) {
            return gn.a(obj, ec.a("030bcZbabhbibgbabj%gdedhf@biTcPcabjcbUdeeXccNcKcdbicbbabd]b"));
        }

        public static boolean d(Object obj) {
            return gn.a(obj, ec.a("031bc%babhbibgbabj*gdedhf=bi)c)cabjcb)dee^cc)cRcdbied_a3babd3b"));
        }

        public static boolean e(Object obj) {
            return gn.a(obj, ec.a("029bc9babhbibgbabj!gdedhfPbiDc9cabjcbGdeeUccWcVcdbidcSgd"));
        }

        public static boolean f(Object obj) {
            return gn.a(obj, ec.a("028bc<babhbibgbabj!gdedhf*bi2c(cabjcb;dee[ccWcGcdbicebh"));
        }

        public static Object g(Object obj) {
            return gi.a(obj, ec.a("0154chGdgGcbCdee%ccba0dcg=bg$g,ca"), (Object) null, new Object[0]);
        }

        public static int h(Object obj) {
            return ((Integer) gi.a(obj, ec.a("006Wch^dg7fa aa"), -1, new Object[0])).intValue();
        }

        public static int i(Object obj) {
            return ((Integer) gi.a(obj, ec.a("0061ch_dg<fa0ca"), -1, new Object[0])).intValue();
        }

        public static int j(Object obj) {
            return ((Integer) gi.a(obj, ec.a("006YchPdg]dc4ba"), -1, new Object[0])).intValue();
        }

        public static int k(Object obj) {
            return ((Integer) gi.a(obj, ec.a("006%chPdgJcbbgba"), -1, new Object[0])).intValue();
        }

        public static int l(Object obj) {
            return ((Integer) gi.a(obj, ec.a("006<chDdgTejdg'a"), -1, new Object[0])).intValue();
        }

        public static int m(Object obj) {
            return ((Integer) gi.a(obj, ec.a("0111chYdgIcjcadg4gd*bdccba"), -1, new Object[0])).intValue();
        }

        public static int n(Object obj) {
            return ((Integer) gi.a(obj, ec.a("0129ch*dg_ceTdg-debibhcfccba"), -1, new Object[0])).intValue();
        }

        public static int o(Object obj) {
            return ((Integer) gi.a(obj, ec.a("011Sch'dg[dc2bgMbgWgMbeba6d"), -1, new Object[0])).intValue();
        }

        public static int p(Object obj) {
            return ((Integer) gi.a(obj, ec.a("012Ach^dgBdcbi<c%chbg!gBbeba]d"), -1, new Object[0])).intValue();
        }

        public static int q(Object obj) {
            return ((Integer) gi.a(obj, "getBasestationId", -1, new Object[0])).intValue();
        }

        public static int r(Object obj) {
            return ((Integer) gi.a(obj, ec.a("006-chEdg>daNba"), -1, new Object[0])).intValue();
        }

        public static int s(Object obj) {
            return ((Integer) gi.a(obj, ec.a("0055ch3dg<cbbg"), -1, new Object[0])).intValue();
        }

        public static int t(Object obj) {
            return ((Integer) gi.a(obj, ec.a("006 ch9dgPejAa%bg"), -1, new Object[0])).intValue();
        }

        public static int u(Object obj) {
            return ((Integer) gi.a(obj, ec.a("009OchHdg5eg-b1bhcd-ac"), -1, new Object[0])).intValue();
        }

        public static String v(Object obj) {
            return (String) gi.a(obj, ec.a("012YchQdg[fa]aaDcj>gSbhbgPcJch"), (Object) null, new Object[0]);
        }

        public static String w(Object obj) {
            return (String) gi.a(obj, ec.a("012Mch3dg[faFca.cj$g1bhbgDc ch"), (Object) null, new Object[0]);
        }

        public static long x(Object obj) {
            return ((Long) gi.a(obj, ec.a("006HchLdgSceJa=bg"), -1L, new Object[0])).longValue();
        }

        public static int y(Object obj) {
            return ((Integer) gi.a(obj, ec.a("010WchQdgBcebhWb,bhcd0ac"), -1, new Object[0])).intValue();
        }
    }

    public static boolean a(Object obj, String str) {
        if (obj == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(obj.getClass().getName());
    }
}
