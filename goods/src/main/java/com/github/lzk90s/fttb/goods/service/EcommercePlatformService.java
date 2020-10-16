package com.github.lzk90s.fttb.goods.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.lzk90s.fttb.goods.dao.entity.EcommercePlatformEntity;
import com.github.lzk90s.fttb.goods.dao.mapper.EcommercePlatformMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EcommercePlatformService extends ServiceImpl<EcommercePlatformMapper, EcommercePlatformEntity> {
}
