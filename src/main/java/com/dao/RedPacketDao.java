package com.dao;

import com.domain.RedPacket;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RedPacketDao {
    /**
     * 获取红包信息
     * @param id
     * @return
     */
    public RedPacket getRedPacket(Long id);

    /**
     * 使用for update语句加锁
     * @param id
     * @return
     */
    public RedPacket getRedPacketForUpdate(Long id);

    /**
     * 扣减抢红包数
     * @param id
     * @return
     */
    public int decreaseRedPacket(Long id);

    public int decreaseRedPacketForVersion(@Param("id")Long id, @Param("version") Integer version);
}
