package anet.channel.c;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anetwork.channel.http.NetworkSdkSetting;
import com.taobao.orange.OrangeConfig;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a implements t3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f29625a = false;

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f29625a = true;
        } catch (Exception unused) {
            f29625a = false;
        }
    }

    @Override // t3.a
    public String getConfig(String... strArr) {
        if (!f29625a) {
            ALog.w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e10) {
            ALog.e("awcn.OrangeConfigImpl", "get config failed!", null, e10, new Object[0]);
            return null;
        }
    }

    @Override // t3.a
    public void onConfigUpdate(String str) {
        if ("networkSdk".equals(str)) {
            ALog.i("awcn.OrangeConfigImpl", "onConfigUpdate", null, "namespace", str);
            try {
                c.a.f29911a.a(Boolean.valueOf(getConfig(str, "network_empty_scheme_https_switch", "true")).booleanValue());
            } catch (Exception unused) {
            }
            try {
                t3.b.T(Boolean.valueOf(getConfig(str, "network_spdy_enable_switch", "true")).booleanValue());
            } catch (Exception unused2) {
            }
            try {
                t3.b.I(Boolean.valueOf(getConfig(str, "network_http_cache_switch", "true")).booleanValue());
            } catch (Exception unused3) {
            }
            try {
                String config = getConfig(str, "network_http_cache_flag", null);
                if (config != null) {
                    t3.b.D(Long.valueOf(config).longValue());
                }
            } catch (Exception unused4) {
            }
            try {
                AwcnConfig.setHttpsSniEnable(Boolean.valueOf(getConfig(str, "network_https_sni_enable_switch", "true")).booleanValue());
            } catch (Exception unused5) {
            }
            try {
                AwcnConfig.setAccsSessionCreateForbiddenInBg(Boolean.valueOf(getConfig(str, "network_accs_session_bg_switch", "true")).booleanValue());
            } catch (Exception unused6) {
            }
            try {
                t3.b.P(Integer.valueOf(getConfig(str, "network_request_statistic_sample_rate", "10000")).intValue());
            } catch (Exception unused7) {
            }
            try {
                String config2 = getConfig(str, "network_request_forbidden_bg", null);
                if (!TextUtils.isEmpty(config2)) {
                    t3.b.B(Boolean.valueOf(config2).booleanValue());
                }
            } catch (Exception unused8) {
            }
            try {
                t3.b.V(getConfig(str, "network_url_white_list_bg", null));
            } catch (Exception unused9) {
            }
            try {
                String config3 = getConfig(str, "network_biz_white_list_bg", null);
                if (!TextUtils.isEmpty(config3)) {
                    t3.b.U(config3);
                }
            } catch (Exception unused10) {
            }
            try {
                String config4 = getConfig(str, "network_amdc_preset_hosts", null);
                if (!TextUtils.isEmpty(config4)) {
                    t3.b.z(config4);
                }
            } catch (Exception unused11) {
            }
            try {
                AwcnConfig.setHorseRaceEnable(Boolean.valueOf(getConfig(str, "network_horse_race_switch", "true")).booleanValue());
            } catch (Exception unused12) {
            }
            try {
                AwcnConfig.setTnetHeaderCacheEnable(Boolean.valueOf(getConfig(str, "tnet_enable_header_cache", "true")).booleanValue());
            } catch (Exception unused13) {
            }
            try {
                String config5 = getConfig(str, "network_http3_enable_switch", null);
                if (!TextUtils.isEmpty(config5)) {
                    boolean zBooleanValue = Boolean.valueOf(config5).booleanValue();
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.a()).edit();
                    editorEdit.putBoolean(AwcnConfig.HTTP3_ENABLE, zBooleanValue);
                    editorEdit.apply();
                    AwcnConfig.setHttp3OrangeEnable(zBooleanValue);
                    if (!zBooleanValue) {
                        AwcnConfig.setHttp3Enable(false);
                    }
                }
            } catch (Exception unused14) {
            }
            try {
                t3.b.Q(Boolean.valueOf(getConfig(str, "network_response_buffer_switch", "true")).booleanValue());
            } catch (Exception unused15) {
            }
            try {
                String config6 = getConfig(str, "network_get_session_async_switch", null);
                if (!TextUtils.isEmpty(config6)) {
                    boolean zBooleanValue2 = Boolean.valueOf(config6).booleanValue();
                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.a()).edit();
                    editorEdit2.putBoolean(t3.b.f140642b, zBooleanValue2);
                    editorEdit2.apply();
                }
            } catch (Exception unused16) {
            }
            try {
                String config7 = getConfig(str, "network_bg_forbid_request_threshold", null);
                if (!TextUtils.isEmpty(config7)) {
                    int iIntValue = Integer.valueOf(config7).intValue();
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    t3.b.A(iIntValue);
                }
            } catch (Exception unused17) {
            }
            try {
                String config8 = getConfig(str, "network_normal_thread_pool_executor_size", null);
                if (!TextUtils.isEmpty(config8)) {
                    ThreadPoolExecutorFactory.setNormalExecutorPoolSize(Integer.valueOf(config8).intValue());
                }
            } catch (Exception unused18) {
            }
            try {
                String config9 = getConfig(str, "network_idle_session_close_switch", null);
                if (!TextUtils.isEmpty(config9)) {
                    AwcnConfig.setIdleSessionCloseEnable(Boolean.valueOf(config9).booleanValue());
                }
            } catch (Exception unused19) {
            }
            try {
                String config10 = getConfig(str, "network_monitor_requests", null);
                if (!TextUtils.isEmpty(config10)) {
                    t3.b.L(config10);
                }
            } catch (Exception unused20) {
            }
            try {
                String config11 = getConfig(str, "network_session_preset_hosts", null);
                if (!TextUtils.isEmpty(config11)) {
                    AwcnConfig.registerPresetSessions(config11);
                }
            } catch (Exception unused21) {
            }
            try {
                String config12 = getConfig(str, "network_ipv6_blacklist_switch", null);
                if (!TextUtils.isEmpty(config12)) {
                    AwcnConfig.setIpv6BlackListEnable(Boolean.valueOf(config12).booleanValue());
                }
            } catch (Exception unused22) {
            }
            try {
                String config13 = getConfig(str, "network_ipv6_blacklist_ttl", null);
                if (!TextUtils.isEmpty(config13)) {
                    AwcnConfig.setIpv6BlackListTtl(Long.valueOf(config13).longValue());
                }
            } catch (Exception unused23) {
            }
            try {
                String config14 = getConfig(str, "network_url_degrade_list", null);
                if (!TextUtils.isEmpty(config14)) {
                    t3.b.G(config14);
                }
            } catch (Exception unused24) {
            }
            try {
                String config15 = getConfig(str, "network_delay_retry_request_no_network", null);
                if (!TextUtils.isEmpty(config15)) {
                    t3.b.O(Boolean.valueOf(config15).booleanValue());
                }
            } catch (Exception unused25) {
            }
            try {
                String config16 = getConfig(str, "network_bind_service_optimize", null);
                if (!TextUtils.isEmpty(config16)) {
                    boolean zBooleanValue3 = Boolean.valueOf(config16).booleanValue();
                    SharedPreferences.Editor editorEdit3 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.a()).edit();
                    editorEdit3.putBoolean(t3.b.f140641a, zBooleanValue3);
                    editorEdit3.apply();
                }
            } catch (Exception unused26) {
            }
            try {
                String config17 = getConfig(str, "network_forbid_next_launch_optimize", null);
                if (!TextUtils.isEmpty(config17)) {
                    boolean zBooleanValue4 = Boolean.valueOf(config17).booleanValue();
                    SharedPreferences.Editor editorEdit4 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.a()).edit();
                    editorEdit4.putBoolean(AwcnConfig.NEXT_LAUNCH_FORBID, zBooleanValue4);
                    editorEdit4.apply();
                }
            } catch (Exception unused27) {
            }
            try {
                String config18 = getConfig(str, "network_detect_enable_switch", null);
                if (!TextUtils.isEmpty(config18)) {
                    AwcnConfig.setNetworkDetectEnable(Boolean.valueOf(config18).booleanValue());
                }
            } catch (Exception unused28) {
            }
            try {
                String config19 = getConfig(str, "network_ping6_enable_switch", null);
                if (!TextUtils.isEmpty(config19)) {
                    AwcnConfig.setPing6Enable(Boolean.valueOf(config19).booleanValue());
                }
            } catch (Exception unused29) {
            }
            try {
                String config20 = getConfig(str, "network_ipv6_global_enable_swtich", null);
                if (!TextUtils.isEmpty(config20)) {
                    AwcnConfig.setIpv6Enable(Boolean.valueOf(config20).booleanValue());
                }
            } catch (Exception unused30) {
            }
            try {
                String config21 = getConfig(str, "network_xquic_cong_control", null);
                if (!TextUtils.isEmpty(config21)) {
                    AwcnConfig.setXquicCongControl(Integer.valueOf(config21).intValue());
                }
            } catch (Exception unused31) {
            }
            try {
                String config22 = getConfig(str, "network_http3_detect_valid_time", null);
                if (!TextUtils.isEmpty(config22)) {
                    anet.channel.e.a.a(Long.valueOf(config22).longValue());
                }
            } catch (Exception unused32) {
            }
            try {
                String config23 = getConfig(str, "network_ip_stack_detect_by_udp_connect_enable_switch", null);
                if (!TextUtils.isEmpty(config23)) {
                    AwcnConfig.setIpStackDetectByUdpConnect(Boolean.valueOf(config23).booleanValue());
                }
            } catch (Exception unused33) {
            }
            try {
                String config24 = getConfig(str, "network_cookie_monitor", null);
                if (!TextUtils.isEmpty(config24)) {
                    anetwork.channel.cookie.a.m(config24);
                }
            } catch (Exception unused34) {
            }
            try {
                String config25 = getConfig(str, "network_cookie_header_redundant_fix", null);
                if (!TextUtils.isEmpty(config25)) {
                    AwcnConfig.setCookieHeaderRedundantFix(Boolean.valueOf(config25).booleanValue());
                }
            } catch (Exception unused35) {
            }
            try {
                String config26 = getConfig(str, "network_channel_local_instance_enable_switch", null);
                if (!TextUtils.isEmpty(config26)) {
                    t3.b.E(Boolean.valueOf(config26).booleanValue());
                }
            } catch (Exception unused36) {
            }
            try {
                String config27 = getConfig(str, "network_allow_spdy_when_bind_service_failed", null);
                if (!TextUtils.isEmpty(config27)) {
                    t3.b.y(Boolean.valueOf(config27).booleanValue());
                }
            } catch (Exception unused37) {
            }
            try {
                String config28 = getConfig(str, "network_send_connect_info_by_service", null);
                if (!TextUtils.isEmpty(config28)) {
                    AwcnConfig.setSendConnectInfoByService(Boolean.valueOf(config28).booleanValue());
                }
            } catch (Exception unused38) {
            }
            try {
                String config29 = getConfig(str, "network_http_dns_notify_white_list", null);
                if (TextUtils.isEmpty(config29)) {
                    return;
                }
                AwcnConfig.setHttpDnsNotifyWhiteList(config29);
            } catch (Exception unused39) {
            }
        }
    }

    @Override // t3.a
    public void register() {
        if (!f29625a) {
            ALog.w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"networkSdk"}, new b(this));
            getConfig("networkSdk", "network_empty_scheme_https_switch", "true");
        } catch (Exception e10) {
            ALog.e("awcn.OrangeConfigImpl", "register fail", null, e10, new Object[0]);
        }
    }

    @Override // t3.a
    public void unRegister() {
        if (f29625a) {
            OrangeConfig.getInstance().unregisterListener(new String[]{"networkSdk"});
        } else {
            ALog.w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
        }
    }
}
