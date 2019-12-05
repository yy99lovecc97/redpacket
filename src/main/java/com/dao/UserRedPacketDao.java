package com.dao;

import com.domain.UserRedPacket;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRedPacketDao {
    /**
     * 插入抢红包信息
     * @param userRedPacket
     * @return
     */
    public int grapRedPacket(UserRedPacket userRedPacket);
}
