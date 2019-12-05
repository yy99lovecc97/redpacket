package com.service;

import com.domain.RedPacket;

public interface RedPacketService {
    /**
     * 获取红包
     * @param id
     * @return
     */
    public RedPacket getRedPacket(Long id);

    /**
     * 扣减红包
     * @param id
     * @return
     */
    public int decreaseRedPacket(Long id);
}
