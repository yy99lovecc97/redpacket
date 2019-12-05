package com.service.impl;

import com.dao.RedPacketDao;
import com.domain.RedPacket;
import com.service.RedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class RedPacketServiceImpl implements RedPacketService {
    public RedPacketDao getRedPacketDao() {
        return redPacketDao;
    }

    public void setRedPacketDao(RedPacketDao redPacketDao) {
        this.redPacketDao = redPacketDao;
    }

    @Autowired
    private RedPacketDao redPacketDao = null;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public RedPacket getRedPacket(Long id) {
        return redPacketDao.getRedPacket(id);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int decreaseRedPacket(Long id) {
        return redPacketDao.decreaseRedPacket(id);
    }
}
