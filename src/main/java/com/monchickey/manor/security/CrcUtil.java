package com.monchickey.manor.security;

import java.util.zip.CRC32;

public class CrcUtil {
    /**
     * crc32 校验码计算
     * @param src
     * @return
     */
    public long crc32(byte[] src) {
        CRC32 crc = new CRC32();
        crc.update(src);
        return crc.getValue();
    }
}
