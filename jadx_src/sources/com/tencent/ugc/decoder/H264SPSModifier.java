package com.tencent.ugc.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class H264SPSModifier {
    private static final boolean DEBUG = false;
    private static final String TAG = "H264SPSModifier";
    private boolean mReceiveFirstVUI = false;

    private byte[] deEmulationPrevention(byte[] bArr) {
        byte b10;
        byte[] bArr2 = new byte[bArr.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            if (i10 < bArr.length - 3 && (b10 = bArr[i10]) == 0) {
                int i12 = i10 + 1;
                if (bArr[i12] == 0 && bArr[i10 + 2] == 3) {
                    int i13 = i10 + 3;
                    if (bArr[i13] <= 3) {
                        int i14 = i11 + 1;
                        bArr2[i11] = b10;
                        i11 = i14 + 1;
                        bArr2[i14] = bArr[i12];
                        i10 = i13;
                    }
                }
            }
            bArr2[i11] = bArr[i10];
            i10++;
            i11++;
        }
        if (i11 == bArr.length) {
            return null;
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        return bArr3;
    }

    private byte[] emulationPrevention(byte[] bArr) {
        byte b10;
        byte[] bArr2 = new byte[(bArr.length * 3) / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            if (i10 < bArr.length - 2 && (b10 = bArr[i10]) == 0) {
                int i12 = i10 + 1;
                if (bArr[i12] == 0) {
                    int i13 = i10 + 2;
                    if (bArr[i13] <= 3) {
                        int i14 = i11 + 1;
                        bArr2[i11] = b10;
                        int i15 = i14 + 1;
                        bArr2[i14] = bArr[i12];
                        bArr2[i15] = 3;
                        i11 = i15 + 1;
                        i10 = i13;
                    }
                }
            }
            bArr2[i11] = bArr[i10];
            i10++;
            i11++;
        }
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        return bArr3;
    }

    private boolean modifyVUIParameters(H264RbspRewriter h264RbspRewriter) throws IOException {
        if (h264RbspRewriter.readBool("VUI: aspect_ratio_info_present_flag") && ((int) h264RbspRewriter.readNBit(8, "VUI: aspect_ratio")) == 255) {
            h264RbspRewriter.skipNBit(16, "VUI: sar_width");
            h264RbspRewriter.skipNBit(16, "VUI: sar_height");
        }
        if (h264RbspRewriter.readBool("VUI: overscan_info_present_flag")) {
            h264RbspRewriter.skipNBit(1, "VUI: overscan_appropriate_flag");
        }
        if (h264RbspRewriter.readBool("VUI: video_signal_type_present_flag")) {
            h264RbspRewriter.skipNBit(3, "VUI: video_format");
            h264RbspRewriter.skipNBit(1, "VUI: video_full_range_flag");
            if (h264RbspRewriter.readBool("VUI: colour_description_present_flag")) {
                h264RbspRewriter.skipNBit(8, "VUI: colour_primaries");
                h264RbspRewriter.skipNBit(8, "VUI: transfer_characteristics");
                h264RbspRewriter.skipNBit(8, "VUI: matrix_coefficients");
            }
        }
        if (h264RbspRewriter.readBool("VUI: chroma_loc_info_present_flag")) {
            h264RbspRewriter.skipUE("VUI chroma_sample_loc_type_top_field");
            h264RbspRewriter.skipUE("VUI chroma_sample_loc_type_bottom_field");
        }
        if (h264RbspRewriter.readBool("VUI: timing_info_present_flag")) {
            h264RbspRewriter.skipNBit(32, "VUI: num_units_in_tick");
            h264RbspRewriter.skipNBit(32, "VUI: time_scale");
            h264RbspRewriter.skipNBit(1, "VUI: fixed_frame_rate_flag");
        }
        boolean bool = h264RbspRewriter.readBool("VUI: nal_hrd_parameters_present_flag");
        if (bool) {
            readHRDParameters(h264RbspRewriter);
        }
        boolean bool2 = h264RbspRewriter.readBool("VUI: vcl_hrd_parameters_present_flag");
        if (bool2) {
            readHRDParameters(h264RbspRewriter);
        }
        if (bool || bool2) {
            h264RbspRewriter.skipNBit(1, "VUI: low_delay_hrd_flag");
        }
        h264RbspRewriter.skipNBit(1, "VUI: pic_struct_present_flag");
        if (h264RbspRewriter.testBool("VUI: bitstream_restriction_flag")) {
            h264RbspRewriter.writeBool(true, "VUI: set bitstream_restriction_flag");
            h264RbspRewriter.readBool("VUI: motion_vectors_over_pic_boundaries_flag");
            h264RbspRewriter.skipUE("VUI max_bytes_per_pic_denom");
            h264RbspRewriter.skipUE("VUI max_bits_per_mb_denom");
            h264RbspRewriter.skipUE("VUI log2_max_mv_length_horizontal");
            h264RbspRewriter.skipUE("VUI log2_max_mv_length_vertical");
            h264RbspRewriter.skipUE("VUI num_reorder_frames");
            if (!this.mReceiveFirstVUI) {
                LiteavLog.w(TAG, "decode: do not add max_dec_frame_buffering when it is ".concat(String.valueOf(h264RbspRewriter.readUE(false))));
                this.mReceiveFirstVUI = true;
            }
            return false;
        }
        h264RbspRewriter.writeBool(true, "VUI: set bitstream_restriction_flag");
        h264RbspRewriter.writeBool(true, "VUI: motion_vectors_over_pic_boundaries_flag");
        h264RbspRewriter.writeUE(0, "VUI: max_bytes_per_pic_denom");
        h264RbspRewriter.writeUE(0, "VUI: max_bits_per_mb_denom");
        h264RbspRewriter.writeUE(10, "VUI: log2_max_mv_length_horizontal");
        h264RbspRewriter.writeUE(10, "VUI: log2_max_mv_length_vertical");
        h264RbspRewriter.writeUE(0, "VUI: num_reorder_frames");
        h264RbspRewriter.writeUE(1, "VUI: max_dec_frame_buffering");
        if (!this.mReceiveFirstVUI) {
            LiteavLog.w(TAG, "decode: add max_dec_frame_buffering 1 when it is no exist");
            this.mReceiveFirstVUI = true;
        }
        return true;
    }

    private void printBuffer(String str, byte[] bArr) {
    }

    private void readHRDParameters(H264RbspRewriter h264RbspRewriter) throws IOException {
        int ue2 = h264RbspRewriter.readUE("SPS: cpb_cnt_minus1");
        h264RbspRewriter.skipNBit(4, "HRD: bit_rate_scale");
        h264RbspRewriter.skipNBit(4, "HRD: cpb_size_scale");
        for (int i10 = 0; i10 <= ue2; i10++) {
            h264RbspRewriter.skipUE("HRD: bit_rate_value_minus1");
            h264RbspRewriter.skipUE("HRD: cpb_size_value_minus1");
            h264RbspRewriter.skipNBit(1, "HRD: cbr_flag");
        }
        h264RbspRewriter.skipNBit(5, "HRD: initial_cpb_removal_delay_length_minus1");
        h264RbspRewriter.skipNBit(5, "HRD: cpb_removal_delay_length_minus1");
        h264RbspRewriter.skipNBit(5, "HRD: dpb_output_delay_length_minus1");
        h264RbspRewriter.skipNBit(5, "HRD: time_offset_length");
    }

    public byte[] updateVUIforMaxBuffering(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        H264RbspRewriter h264RbspRewriter = new H264RbspRewriter(inputStream, byteArrayOutputStream);
        h264RbspRewriter.skipNBit(8, "NALU type");
        int nBit = (int) h264RbspRewriter.readNBit(8, "SPS: profile_idc");
        h264RbspRewriter.skipNBit(8, "SPS: constraint_set_0-3_flag and reserved_zero_4bits");
        h264RbspRewriter.readNBit(8, "SPS: level_idc");
        h264RbspRewriter.skipUE("SPS: seq_parameter_set_id");
        if (nBit == 100 || nBit == 110 || nBit == 122 || nBit == 144) {
            if (h264RbspRewriter.readUE("SPS: chroma_format_idc") == 3) {
                h264RbspRewriter.skipNBit(1, "SPS: residual_color_transform_flag");
            }
            h264RbspRewriter.skipUE("SPS: bit_depth_luma_minus8");
            h264RbspRewriter.skipUE("SPS: bit_depth_chroma_minus8");
            h264RbspRewriter.skipNBit(1, "SPS: qpprime_y_zero_transform_bypass_flag");
            if (h264RbspRewriter.readBool("SPS: seq_scaling_matrix_present_lag")) {
                for (int i10 = 0; i10 < 8; i10++) {
                    if (h264RbspRewriter.readBool("SPS: seqScalingListPresentFlag")) {
                        if (i10 < 6) {
                            h264RbspRewriter.skipScalingList(16);
                        } else {
                            h264RbspRewriter.skipScalingList(64);
                        }
                    }
                }
            }
        }
        h264RbspRewriter.skipUE("SPS: log2_max_frame_num_minus4");
        int ue2 = h264RbspRewriter.readUE("SPS: pic_order_cnt_type");
        if (ue2 == 0) {
            h264RbspRewriter.skipUE("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (ue2 == 1) {
            h264RbspRewriter.skipNBit(1, "SPS: delta_pic_order_always_zero_flag");
            h264RbspRewriter.skipUE("SPS: offset_for_non_ref_pic");
            h264RbspRewriter.skipUE("SPS: offset_for_top_to_bottom_field");
            int ue3 = h264RbspRewriter.readUE("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i11 = 0; i11 < ue3; i11++) {
                h264RbspRewriter.skipUE("SPS: offsetForRefFrame [" + i11 + "]");
            }
        }
        h264RbspRewriter.readUE("SPS: num_ref_frames");
        h264RbspRewriter.skipNBit(1, "SPS: gaps_in_frame_num_value_allowed_flag");
        h264RbspRewriter.skipUE("SPS: pic_width_in_mbs_minus1");
        h264RbspRewriter.skipUE("SPS: pic_height_in_map_units_minus1");
        if (!h264RbspRewriter.readBool("SPS: frame_mbs_only_flag")) {
            h264RbspRewriter.skipNBit(1, "SPS: mb_adaptive_frame_field_flag");
        }
        h264RbspRewriter.skipNBit(1, "SPS: direct_8x8_inference_flag");
        if (h264RbspRewriter.readBool("SPS: frame_cropping_flag")) {
            h264RbspRewriter.skipUE("SPS: frame_crop_left_offset");
            h264RbspRewriter.skipUE("SPS: frame_crop_right_offset");
            h264RbspRewriter.skipUE("SPS: frame_crop_top_offset");
            h264RbspRewriter.skipUE("SPS: frame_crop_bottom_offset");
        }
        if (h264RbspRewriter.testBool("SPS: vui_parameters_present_flag")) {
            h264RbspRewriter.writeBool(true, "VUI set 1: ");
            if (!modifyVUIParameters(h264RbspRewriter)) {
                return null;
            }
        } else {
            h264RbspRewriter.writeBool(true, "VUI set 1: ");
            h264RbspRewriter.writeBool(false, "VUI: aspect_ratio_info_present_flag");
            h264RbspRewriter.writeBool(false, "VUI: overscan_info_present_flag");
            h264RbspRewriter.writeBool(false, "VUI: video_signal_type_present_flag");
            h264RbspRewriter.writeBool(false, "VUI: chroma_loc_info_present_flag");
            h264RbspRewriter.writeBool(false, "VUI: timing_info_present_flag");
            h264RbspRewriter.writeBool(false, "VUI: nal_hrd_parameters_present_flag");
            h264RbspRewriter.writeBool(false, "VUI: vcl_hrd_parameters_present_flag");
            h264RbspRewriter.writeBool(false, "VUI: pic_struct_present_flag");
            h264RbspRewriter.writeBool(true, "VUI: bitstream_restriction_flag");
            h264RbspRewriter.writeBool(true, "VUI: motion_vectors_over_pic_boundaries_flag");
            h264RbspRewriter.writeUE(0, "VUI: max_bytes_per_pic_denom");
            h264RbspRewriter.writeUE(0, "VUI: max_bits_per_mb_denom");
            h264RbspRewriter.writeUE(10, "VUI: log2_max_mv_length_horizontal");
            h264RbspRewriter.writeUE(10, "VUI: log2_max_mv_length_vertical");
            h264RbspRewriter.writeUE(0, "VUI: num_reorder_frames");
            h264RbspRewriter.writeUE(1, "VUI: max_dec_frame_buffering");
            if (!this.mReceiveFirstVUI) {
                LiteavLog.w(TAG, "decode: add max_dec_frame_buffering 1 when vui is no exist");
                this.mReceiveFirstVUI = true;
            }
        }
        h264RbspRewriter.writeTrailingBits();
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] updateVUIforMaxBuffering(byte[] bArr) throws IOException {
        boolean z10;
        printBuffer("origin sps : ", bArr);
        byte[] bArrDeEmulationPrevention = deEmulationPrevention(bArr);
        if (bArrDeEmulationPrevention != null) {
            printBuffer("deEmulationPrevention sps : ", bArrDeEmulationPrevention);
            z10 = true;
            bArr = bArrDeEmulationPrevention;
        } else {
            z10 = false;
        }
        byte[] bArrUpdateVUIforMaxBuffering = updateVUIforMaxBuffering(new ByteArrayInputStream(bArr));
        printBuffer("new sps : ", bArrUpdateVUIforMaxBuffering);
        if (bArrUpdateVUIforMaxBuffering == null || !z10) {
            return bArrUpdateVUIforMaxBuffering;
        }
        byte[] bArrEmulationPrevention = emulationPrevention(bArrUpdateVUIforMaxBuffering);
        printBuffer("emulationPrevention sps : ", bArrEmulationPrevention);
        return bArrEmulationPrevention;
    }
}
