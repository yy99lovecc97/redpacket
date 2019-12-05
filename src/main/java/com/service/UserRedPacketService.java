package com.service;

public interface UserRedPacketService {
    /**
     * 保存抢红包信息
     * @param redPacketId
     * @param userId
     * @return
     */
    public int grapRedPacket(Long redPacketId, Long userId);
    public int grapRedPacketForVersion(Long redPacketId, Long userId);

    /**
     *
     * @param redPacketId
     * @param userId
     * @return
     * 0-没有库存失败
     * 1-成功，且不是最后一个红包
     * 2-成功，且是最后一个红包
     */
    public Long grapRedPacketByRedis(Long redPacketId , Long userId);
}
